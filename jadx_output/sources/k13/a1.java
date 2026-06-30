package k13;

/* loaded from: classes10.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303192d;

    public a1(k13.l1 l1Var) {
        this.f303192d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(h13.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "PlaySound.playRoot");
        k13.l1 l1Var = this.f303192d;
        l1Var.f303247y = com.tencent.mm.sdk.platformtools.v5.d(l1Var.b(), com.tencent.mm.R.string.f492151ff0, com.tencent.mm.sdk.platformtools.u5.NOTSET, 2, true, null);
    }
}
