package zl2;

/* loaded from: classes3.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zl2.h4 f473806d = new zl2.h4();

    public h4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [int, boolean] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SUPPORT_HEVC_ENC_INT_SYNC;
        java.lang.Object m17 = c17.m(u3Var, -1);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        zl2.q4 q4Var = zl2.q4.f473933a;
        com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "deviceSupportHevcEncForLive supportHevc:" + intValue);
        if (intValue == -1) {
            ?? wi6 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).wi(5);
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf((int) wi6));
            i17 = wi6;
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(zl2.g4.f473789d);
            i17 = intValue;
        }
        return java.lang.Boolean.valueOf(i17 == 1);
    }
}
