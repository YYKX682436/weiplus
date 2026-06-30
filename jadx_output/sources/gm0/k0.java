package gm0;

/* loaded from: classes12.dex */
public class k0 implements java.lang.Runnable, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f273225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f273226e;

    public k0(gm0.b0 b0Var, gm0.d0 d0Var) {
        this.f273226e = b0Var;
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f273225d = future;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.b0 b0Var = this.f273226e;
        b0Var.f273164q = java.lang.Boolean.valueOf(b0Var.l());
    }
}
