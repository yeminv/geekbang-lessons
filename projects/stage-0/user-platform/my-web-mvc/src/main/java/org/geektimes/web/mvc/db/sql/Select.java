package org.geektimes.web.mvc.db.sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @className: Select
 * @description: TODO 类描述
 * @author: YM
 * @date: 3/4/2021
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {

    String value();

    String returnType();
}
