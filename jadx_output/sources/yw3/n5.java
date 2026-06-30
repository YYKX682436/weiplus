package yw3;

/* loaded from: classes11.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466828d;

    public n5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f466828d = repairerPatchDemoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).getClass();
        r45.mm6 m17 = c83.e.m();
        if (m17 == null) {
            this.f466828d.getClass();
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "更新数据为空，dialog = null", 1).show();
            com.tencent.mars.xlog.Log.i(this.f466828d.d, "have tinker update dialogInfo is null.");
        } else {
            if (!((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).wi()) {
                com.tencent.mars.xlog.Log.i(this.f466828d.d, "have tinker UpdateUtil.isNeedShowTinkerDialog() = " + ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).wi());
                return;
            }
            com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466828d;
            repairerPatchDemoUI.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new yw3.g5(repairerPatchDemoUI, m17));
            com.tencent.mars.xlog.Log.i(this.f466828d.d, "have tinker update.");
        }
    }
}
