package xt2;

/* loaded from: classes3.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f457138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f457139f;

    public z2(xt2.e3 e3Var, cm2.m0 m0Var, float f17, long j17) {
        this.f457137d = e3Var;
        this.f457138e = m0Var;
        this.f457139f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xt2.e3 e3Var = this.f457137d;
        e3Var.m(this.f457138e);
        e3Var.f456719w.post(new xt2.y2(e3Var, this.f457139f, 300L));
    }
}
