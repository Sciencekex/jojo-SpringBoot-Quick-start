package io.github.sciencekex.jojo.controller

import io.github.sciencekex.jojo.entity.Jojo
import io.github.sciencekex.jojo.mapper.JOJOMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class JOJOController {

    @Autowired
    lateinit var jojoMapper: JOJOMapper

    @RequestMapping("/insert")
    fun insert(name: String, age: Int): String {
        return if (jojoMapper.insert(Jojo(name, age)) > 0) "success!" else "fail!"
    }

    @RequestMapping("/select1")
    fun select1(): List<Jojo> {
        return jojoMapper.selectList(null)
    }

    @RequestMapping("/select2")
    fun select2(): Jojo {
        return jojoMapper.select2()
    }
}