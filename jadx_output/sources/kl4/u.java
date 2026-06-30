package kl4;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308964d;

    public u(kl4.a0 a0Var) {
        this.f308964d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f308964d;
        ll4.d dVar = a0Var.f308868e;
        com.tencent.mars.xlog.Log.i(a0Var.f308880t, "Ting-Trace [" + a0Var.a() + "] call playerCore[" + dVar + "] resume()");
        if (dVar != null) {
            dVar.resume();
        }
    }
}
