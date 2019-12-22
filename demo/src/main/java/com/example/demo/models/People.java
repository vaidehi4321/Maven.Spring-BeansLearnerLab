package com.example.demo.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<>();
    }


    public People(List<PersonType> personList) {
        this.personList = personList;
    }


    public void add(PersonType p) {
        personList.add(p);
    }

    public void remove(PersonType p) {
        if (personList.contains(p)) {
            personList.remove(p);
        } else {
            throw new IllegalArgumentException("list do not contain element");
        }
    }

    public Integer size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes) {
        for (PersonType pt : personTypes) {
            personList.add(pt);
        }
    }

    public PersonType findById(Long id) {
        for (int i = 0 ; i < personList.size() ; i++) {
if(personList.get(i).getId() == id){return personList.get(i);}
        }
        return null;
    }
    public List<PersonType> findAll(){
        return personList;
    }
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
    public Boolean contains(PersonType personType) {
        return personList.contains(personType);
    }

    public void removeById(Long id) {
        personList.remove(findById(id));
    }

}