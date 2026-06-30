package com.tencent.mm.xeffect;

/* loaded from: classes5.dex */
public class WeChatCls {
    static {
        tq5.k.a("xlabeffect");
    }

    public static native java.util.ArrayList<java.lang.String> nApply(long j17, java.nio.Buffer buffer, int i17, int i18);

    public static native java.util.ArrayList<java.lang.String> nApplyWithScoreResult(long j17, java.nio.Buffer buffer, int i17, int i18);

    public static native java.util.ArrayList<android.util.Pair<java.lang.String, java.util.ArrayList<java.lang.Integer>>> nGetLabelidsByLabelname(long j17, java.lang.String str, java.lang.String str2, boolean z17);

    public static native java.lang.String nGetLabelnameByLabelid(long j17, int i17, java.lang.String str);

    public static native java.util.ArrayList<android.util.Pair<java.lang.String, java.util.ArrayList<java.lang.Integer>>> nGetSynonymWordsByLabelname(long j17, java.lang.String str, java.lang.String str2, boolean z17);

    public static native long nInit(java.lang.String str, java.lang.String str2, int i17);

    public static native int nIsInit(long j17);

    public static native void nRelease(long j17);
}
