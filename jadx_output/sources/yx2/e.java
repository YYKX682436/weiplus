package yx2;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx2.f f467840e;

    public e(java.lang.String str, yx2.f fVar) {
        this.f467839d = str;
        this.f467840e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(this.f467839d, null, 2, null), this.f467840e.f467842a, g1Var.h(mn2.f1.f329957h));
    }
}
