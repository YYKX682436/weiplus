package com.tencent.wevision2.modules.hash;

/* loaded from: classes5.dex */
public class DiffHash {
    public java.lang.String value;

    static {
        int i17 = fx5.a.f267157a;
    }

    public DiffHash(java.lang.String str) {
        this.value = str;
    }

    public static native com.tencent.wevision2.modules.hash.DiffHash makeFromImage(com.tencent.wevision2.base.PixelBuffer pixelBuffer);
}
