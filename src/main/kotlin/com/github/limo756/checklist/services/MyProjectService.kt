package com.github.limo756.checklist.services

import com.intellij.openapi.project.Project
import com.github.limo756.checklist.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
