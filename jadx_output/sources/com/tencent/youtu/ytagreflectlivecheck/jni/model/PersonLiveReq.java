package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes13.dex */
public class PersonLiveReq {
    private java.lang.String app_id;
    private java.lang.String business_name;
    private int live_type;
    private com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLive livedata;
    private java.lang.String person_id;
    private java.lang.String req_type;

    public PersonLiveReq() {
    }

    public java.lang.String getApp_id() {
        return this.app_id;
    }

    public java.lang.String getBusiness_name() {
        return this.business_name;
    }

    public int getLive_type() {
        return this.live_type;
    }

    public com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLive getLivedata() {
        return this.livedata;
    }

    public java.lang.String getPerson_id() {
        return this.person_id;
    }

    public java.lang.String getReq_type() {
        return this.req_type;
    }

    public void setApp_id(java.lang.String str) {
        this.app_id = str;
    }

    public void setBusiness_name(java.lang.String str) {
        this.business_name = str;
    }

    public void setLive_type(int i17) {
        this.live_type = i17;
    }

    public void setLivedata(com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLive personLive) {
        this.livedata = personLive;
    }

    public void setPerson_id(java.lang.String str) {
        this.person_id = str;
    }

    public void setReq_type(java.lang.String str) {
        this.req_type = str;
    }

    public PersonLiveReq(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.youtu.ytagreflectlivecheck.jni.model.PersonLive personLive, int i17, java.lang.String str4) {
        this.app_id = str;
        this.business_name = str2;
        this.person_id = str3;
        this.livedata = personLive;
        this.live_type = i17;
        this.req_type = str4;
    }
}
