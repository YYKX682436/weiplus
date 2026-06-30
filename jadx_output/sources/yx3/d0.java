package yx3;

/* loaded from: classes15.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.e0 f467898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.y f467899e;

    public d0(yx3.e0 e0Var, yx3.y yVar) {
        this.f467898d = e0Var;
        this.f467899e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx3.e0 e0Var = this.f467898d;
        m8.i0 i0Var = e0Var.f467902a;
        if (i0Var != null) {
            i0Var.n();
        }
        m8.i0 i0Var2 = e0Var.f467902a;
        if (i0Var2 != null) {
            i0Var2.release();
        }
        yx3.y yVar = this.f467899e;
        if (yVar != null) {
            yVar.b();
        }
    }
}
