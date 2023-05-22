package com.ekocbiyik.logging.listener;

import com.ekocbiyik.logging.entity.CustomRevisionEntity;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        CustomRevisionEntity entity = (CustomRevisionEntity) revisionEntity;
        entity.setModifiedBy(getUsername());
    }

    private String getUsername(){
        return "admin";
    }

}