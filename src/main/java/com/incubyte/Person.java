package com.incubyte;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Version;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@MappedEntity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Long version;

    @NotNull
    @NotBlank
    private final String name;

    @Nullable
    private final int age;

    public Person(@NotNull String name, @Nullable int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @Nullable
    public int getAge() {
        return age;
    }
}
