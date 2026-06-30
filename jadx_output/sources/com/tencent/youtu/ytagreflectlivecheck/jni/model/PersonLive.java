package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes13.dex */
public class PersonLive {
    private java.lang.String app_id = "";
    public java.lang.String client_version;
    private java.lang.String color_data;
    private java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.FaceFrame> frames;
    private int platform;
    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflect_data;
    public com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.SeleceData select_data;

    public java.lang.String getColor_data() {
        return this.color_data;
    }

    public java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.FaceFrame> getFrames() {
        return this.frames;
    }

    public int getPlatform() {
        return this.platform;
    }

    public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData getReflect_data() {
        return this.reflect_data;
    }

    public void setColor_data(java.lang.String str) {
        this.color_data = str;
    }

    public void setFrames(java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.FaceFrame> arrayList) {
        this.frames = arrayList;
    }

    public void setPlatform(int i17) {
        this.platform = i17;
    }

    public void setReflect_data(com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflectColorData) {
        this.reflect_data = reflectColorData;
    }
}
