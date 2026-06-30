package cw2;

/* loaded from: classes2.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f224037d;

    public u2(cw2.w2 w2Var) {
        this.f224037d = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.j0 j0Var;
        cw2.w2 w2Var = this.f224037d;
        if (w2Var.f224081f) {
            return;
        }
        w2Var.f224081f = true;
        az2.f fVar = w2Var.f224077b;
        if (fVar != null) {
            fVar.b();
        }
        androidx.lifecycle.k0 k0Var = w2Var.f224078c;
        if (k0Var != null && (j0Var = w2Var.f224079d) != null) {
            j0Var.removeObserver(k0Var);
        }
        w2Var.f224080e = null;
        w2Var.f224082g = false;
        com.tencent.mars.xlog.Log.i("FinderFullSeekBarLayoutListenVideo", "initListenVideoBtn timeout, clear state");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2137, 5);
        android.content.Context context = w2Var.f224076a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.d(com.tencent.mm.R.string.f492860of3);
        e4Var.c();
    }
}
