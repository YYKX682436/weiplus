package kl4;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308972d;

    public z(kl4.a0 a0Var) {
        this.f308972d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f308972d;
        com.tencent.mars.xlog.Log.i(a0Var.f308880t, "do execute stopLastPlayerCore");
        if (a0Var.f308875o != null) {
            a0Var.d();
        }
    }
}
