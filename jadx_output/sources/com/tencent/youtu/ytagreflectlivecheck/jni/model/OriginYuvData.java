package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* loaded from: classes.dex */
public class OriginYuvData {
    int height;
    int width;
    public byte[] yuvData;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public byte[] getYuvData() {
        return this.yuvData;
    }

    public void setHeight(int i17) {
        this.height = i17;
    }

    public void setWidth(int i17) {
        this.width = i17;
    }

    public void setYuvData(byte[] bArr) {
        this.yuvData = bArr;
    }
}
