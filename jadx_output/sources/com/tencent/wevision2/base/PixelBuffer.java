package com.tencent.wevision2.base;

/* loaded from: classes14.dex */
public class PixelBuffer {
    private java.nio.ByteBuffer data;
    private int format;
    private int height;
    private int width;

    public PixelBuffer(int i17, int i18, int i19, java.nio.ByteBuffer byteBuffer) {
        this.width = i17;
        this.height = i18;
        this.format = i19;
        this.data = byteBuffer;
    }

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
