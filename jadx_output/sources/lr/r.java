package lr;

/* loaded from: classes15.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.u f320577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.t0 f320578e;

    public r(lr.u uVar, ir.t0 t0Var) {
        this.f320577d = uVar;
        this.f320578e = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f320578e.b().b().size();
        lr.u uVar = this.f320577d;
        uVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("EmoticonPanelKV", 2, null);
        int i17 = N != null ? N.getInt("last_custom_count", -1) : -1;
        lr.x xVar = uVar.f320592o;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i(xVar.f320605i, "no find last count");
            return;
        }
        com.tencent.mars.xlog.Log.i(xVar.f320605i, "checkCustomEmojiLost count " + size + ", " + i17);
        if (i17 == 0 || size / i17 > 0.3f) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(2135L, 0L, 1L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (N != null) {
            currentTimeMillis = N.getLong("last_check_time", java.lang.System.currentTimeMillis());
        }
        if (java.lang.System.currentTimeMillis() - currentTimeMillis >= 3600000) {
            new pr.t(0, null, true).a();
            g0Var.C(2135L, 2L, 1L);
        } else {
            com.tencent.mars.xlog.Log.i(xVar.f320605i, "check limit " + currentTimeMillis);
            g0Var.C(2135L, 1L, 1L);
        }
    }
}
