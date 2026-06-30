package com.tencent.mm.xeffect;

/* loaded from: classes4.dex */
public class WeImageScore {
    static {
        tq5.k.a("xlabeffect");
    }

    public static native float[] nApplyImageScoreReq(long j17, java.nio.Buffer buffer, int i17, int i18);

    public static native long nInit(java.lang.String str, int i17);

    public static native void nRelease(long j17);
}
