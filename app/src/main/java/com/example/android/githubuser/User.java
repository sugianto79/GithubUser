package com.example.android.githubuser;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sugianto on 2/15/2018.
 */

public class User {

    @SerializedName("avatar")
    private String Avatar;
    @SerializedName("login")
    private String Login;
    @SerializedName("id")
    private String Id;
    @SerializedName("url")
    private String Url;
    @SerializedName("type")
    private String Type;
    @SerializedName("site admin")
    private String SiteAdmin;

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUrl(String s) {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSiteAdmin() {
        return SiteAdmin;
    }

    public void setSiteAdmin(String siteAdmin) {
        SiteAdmin = siteAdmin;
    }
}
