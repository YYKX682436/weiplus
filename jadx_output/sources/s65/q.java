package s65;

/* loaded from: classes11.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403506d;

    public q(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403506d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403506d;
        s65.x0 x0Var = appUpdaterUI.f192319g;
        if (x0Var.f403550x) {
            db5.e1.H(appUpdaterUI, j65.q.b(appUpdaterUI, com.tencent.mm.R.string.aq9), j65.q.b(appUpdaterUI, com.tencent.mm.R.string.f490573yv), false, new s65.k(appUpdaterUI), new s65.l(appUpdaterUI));
            return;
        }
        if (x0Var.f403544r == 1) {
            s65.o0.g(appUpdaterUI, 7, 0);
            if (appUpdaterUI.f192319g.f403547u) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 57L, 1L, true);
            }
        }
        s65.o0.h(appUpdaterUI, 6);
        appUpdaterUI.f192319g.l(2, true);
        appUpdaterUI.R6();
    }
}
