package dk2;

/* loaded from: classes3.dex */
public final class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.me f233771d = new dk2.me();

    @Override // java.lang.Runnable
    public final void run() {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "doRefreshMic[" + dk2.ef.I + ']');
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            if (!zl2.r4.f473950a.w1()) {
                mm2.n0 n0Var = (mm2.n0) efVar.i(mm2.n0.class);
                r5 = ((n0Var == null || !n0Var.f329273r) ? 0 : 1) != 0 ? 16 : 2;
            }
            int i17 = r5;
            long j17 = e1Var.f328988r.getLong(0);
            long j18 = e1Var.f328983m;
            java.lang.String str = e1Var.f328992v;
            byte[] bArr = e1Var.f328985o;
            java.lang.String m86 = ((mm2.c1) e1Var.business(mm2.c1.class)).m8();
            dk2.vd vdVar = new dk2.vd(e1Var);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "refreshLinkMic liveId:" + j17 + ", objectId:" + j18 + ", nonceId:" + str + ", scene:" + i17 + ", sdkUserId:" + m86);
            new ek2.g2(j17, j18, str, bArr, i17, m86, vdVar).l();
        }
    }
}
