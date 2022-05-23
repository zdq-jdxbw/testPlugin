package com.github.zdqjdxbw.testplugin.services

import com.intellij.openapi.project.Project
import com.github.zdqjdxbw.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
