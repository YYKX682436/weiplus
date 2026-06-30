package p10;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p10.c0 f350930d;

    public b0(p10.c0 c0Var) {
        this.f350930d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        p10.c0 c0Var = this.f350930d;
        if (((p10.l0) c0Var.f350934c).f350968a.f65846r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, canvas already rendered, skip showing loading");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, show loading after delay");
        c0Var.f350935d = new java.lang.ref.WeakReference(db5.e1.Q(c0Var.f350932a, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490605zr), true, true, new p10.a0(c0Var)));
        java.lang.ref.WeakReference weakReference = c0Var.f350935d;
        if (weakReference != null && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) != null) {
            u3Var.show();
        }
        c0Var.f350933b.postDelayed(c0Var.f350937f, 30000L);
    }
}
