package com.tencent.youtu.ytagreflectlivecheck.data;

/* loaded from: classes13.dex */
public class YTActReflectImage {
    public java.lang.String checksum;
    public byte[] image;
    public float[] xys;

    public YTActReflectImage(byte[] bArr, float[] fArr, java.lang.String str) {
        this.image = bArr;
        this.xys = fArr;
        this.checksum = str;
    }
}
