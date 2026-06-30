package f85;

/* loaded from: classes7.dex */
public final class c implements f85.e {
    @Override // f85.e
    public boolean a() {
        return (com.tencent.mm.sdk.platformtools.x2.j() && b()) || (com.tencent.mm.sdk.platformtools.x2.s() && b()) || com.tencent.mm.app.w.INSTANCE.f53889n;
    }

    public final boolean b() {
        java.lang.String m07 = com.tencent.mm.sdk.platformtools.t8.m0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("ForegroundCondition", "[existForegroundActivity] " + m07);
        kotlin.jvm.internal.o.d(m07);
        return (m07.length() > 0) && r26.n0.B(m07, "com.tencent.mm", false);
    }
}
