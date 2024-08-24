package com.lakshmiTech.joblisting1.Model;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "jobpost")
public class PostDetails {
    private String profile;
    private String desc;
    private String exp;
    private String techs[];

    @Override
    public String toString() {
        return "PostDetails{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp='" + exp + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public PostDetails() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }
}
