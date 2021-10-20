package com.github.nieyuwen.mvparms.services

import com.intellij.openapi.project.Project
import com.github.nieyuwen.mvparms.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
