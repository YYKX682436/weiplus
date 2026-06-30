package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes14.dex */
public class ReflectColorData {
    public long begin_time;
    public java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData> big_images_data;
    public long changepoint_time;
    public java.util.ArrayList<java.lang.Long> changepoint_time_list;
    public int config_begin;
    public int frame_num;
    public int height;
    public java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData> images_data;
    public int landmark_num;
    public java.lang.String log;
    public float offset_sys;
    public java.lang.String reflect_video;
    public java.lang.String version;
    public int width;

    public long getBegin_time() {
        return this.begin_time;
    }

    public java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData> getBig_images_data() {
        return this.big_images_data;
    }

    public long getChangepoint_time() {
        return this.changepoint_time;
    }

    public int getConfig_begin() {
        return this.config_begin;
    }

    public int getFrame_num() {
        return this.frame_num;
    }

    public int getHeight() {
        return this.height;
    }

    public java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData> getImages_data() {
        return this.images_data;
    }

    public int getLandmark_num() {
        return this.landmark_num;
    }

    public java.lang.String getLog() {
        return this.log;
    }

    public float getOffset_sys() {
        return this.offset_sys;
    }

    public java.lang.String getReflect_video() {
        return this.reflect_video;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBegin_time(long j17) {
        this.begin_time = j17;
    }

    public void setBig_images_data(java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData> arrayList) {
        this.big_images_data = arrayList;
    }

    public void setChangepoint_time(long j17) {
        this.changepoint_time = j17;
    }

    public void setConfig_begin(int i17) {
        this.config_begin = i17;
    }

    public void setFrame_num(int i17) {
        this.frame_num = i17;
    }

    public void setHeight(int i17) {
        this.height = i17;
    }

    public void setImages_data(java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData> arrayList) {
        this.images_data = arrayList;
    }

    public void setLandmark_num(int i17) {
        this.landmark_num = i17;
    }

    public void setLog(java.lang.String str) {
        this.log = str;
    }

    public void setOffset_sys(float f17) {
        this.offset_sys = f17;
    }

    public void setReflectVideo(java.lang.String str) {
        this.reflect_video = str;
    }

    public void setWidth(int i17) {
        this.width = i17;
    }
}
