package kl4;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f308966e;

    public v(kl4.a0 a0Var, long j17) {
        this.f308965d = a0Var;
        this.f308966e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f308965d;
        a0Var.f308871h = true;
        long j17 = this.f308966e;
        a0Var.f308870g = j17;
        a0Var.f308869f = true;
        ll4.d dVar = a0Var.f308868e;
        if (dVar != null) {
            dVar.seek(j17);
        }
        a0Var.f308869f = false;
    }
}
