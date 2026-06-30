package wn4;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447563d;

    public s(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse) {
        this.f447563d = tinkerSyncResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        wn4.x xVar = wn4.x.f447571a;
        java.lang.String h07 = com.tencent.mm.sdk.platformtools.t8.h0(this.f447563d.f142415n);
        kotlin.jvm.internal.o.f(h07, "getSizeMB(...)");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k3x, new java.lang.Object[]{h07});
        kotlin.jvm.internal.o.f(string, "getString(...)");
        u1Var.g(string);
        u1Var.b(wn4.q.f447561a);
        u1Var.e(wn4.r.f447562d);
        u1Var.a(true);
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "hotPatchInstallSuccessDialog show");
    }
}
