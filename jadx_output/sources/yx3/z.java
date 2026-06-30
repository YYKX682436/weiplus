package yx3;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.e0 f467969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.y f467970e;

    public z(yx3.e0 e0Var, yx3.y yVar) {
        this.f467969d = e0Var;
        this.f467970e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx3.e0 e0Var = this.f467969d;
        m8.i0 i0Var = e0Var.f467902a;
        if (i0Var != null) {
            i0Var.n();
        }
        m8.i0 i0Var2 = e0Var.f467902a;
        if (i0Var2 != null) {
            i0Var2.release();
        }
        yx3.y yVar = this.f467970e;
        if (yVar != null) {
            yVar.onCompletion();
        }
        if (yVar != null) {
            yVar.b();
        }
        if (yVar != null) {
            yVar.a();
        }
    }
}
