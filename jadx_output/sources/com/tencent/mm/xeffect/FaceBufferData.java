package com.tencent.mm.xeffect;

/* loaded from: classes4.dex */
public class FaceBufferData {
    private java.nio.Buffer bufferData;
    private int height;
    private java.lang.String imagePath;
    private int width;

    public FaceBufferData() {
    }

    public FaceBufferData(java.lang.String str, java.nio.Buffer buffer, int i17, int i18) {
        this.imagePath = str;
        this.bufferData = buffer;
        this.width = i17;
        this.height = i18;
    }

    public java.nio.Buffer getBufferData() {
        return this.bufferData;
    }

    public int getHeight() {
        return this.height;
    }

    public java.lang.String getImagePath() {
        return this.imagePath;
    }

    public int getWidth() {
        return this.width;
    }
}
