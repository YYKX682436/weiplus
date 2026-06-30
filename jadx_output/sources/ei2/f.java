package ei2;

/* loaded from: classes3.dex */
public abstract class f {
    public static final java.lang.String a(long j17) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean x27 = r4Var.x2(j17);
        boolean y27 = r4Var.y2(j17);
        boolean w27 = r4Var.w2(j17);
        boolean z27 = r4Var.z2(j17);
        com.tencent.mars.xlog.Log.i("LiveMicConditionUtil", "getConditionText followEnable:" + x27 + " rewardEnable:" + y27 + " buyProductEnable:" + w27 + " superFansEnable: " + z27);
        if (x27) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dur);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (y27) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.duu);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (w27) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dup);
            kotlin.jvm.internal.o.d(string3);
            return string3;
        }
        if (z27) {
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lz6);
            kotlin.jvm.internal.o.d(string4);
            return string4;
        }
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.duo);
        kotlin.jvm.internal.o.d(string5);
        return string5;
    }
}
