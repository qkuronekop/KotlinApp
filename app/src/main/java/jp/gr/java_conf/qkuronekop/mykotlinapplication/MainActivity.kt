package jp.gr.java_conf.qkuronekop.mykotlinapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.activeandroid.query.Select
import kotlinx.android.synthetic.activity_main.*

public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.edit_fab.setOnClickListener {
            var intent: Intent = Intent(this, javaClass<EditActivity>())
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        val todos: List<Todo> = Select().from(javaClass<Todo>()).execute()
        this.todo_list_view.setAdapter(TodoListAdapter(getApplicationContext(), todos))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
