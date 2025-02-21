package io.github.sciencekex.jojo.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import io.github.sciencekex.jojo.entity.Jojo
import org.apache.ibatis.annotations.Select

interface JOJOMapper : BaseMapper<Jojo> {

    @Select("select * from jojo where name like 'di%';")
    fun select2(): Jojo
}