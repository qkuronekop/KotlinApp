package jp.gr.java_conf.qkuronekop.mykotlinapplication

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table

/**
 * Created by satomitanaka on 15/08/03.
 */
Table(name = "todo")
public class Todo : Model() {
    Column(name = "todo")
    public var todo: String = ""

    Column(name = "finish_flg")
    public var finish: Boolean = false

    Column(name = "sort")
    public var sort: Int = 0
}