package k91;

/* loaded from: classes7.dex */
public class s4 implements k91.a5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k91.t4 f305764b;

    public s4(k91.t4 t4Var) {
        this.f305764b = t4Var;
    }

    @Override // k91.a5
    public boolean a(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        return k91.h5.a(v5Var) || k91.h5.b(v5Var);
    }

    @Override // k91.a5
    public k91.k1 b(java.lang.String str) {
        k91.t4 t4Var = this.f305764b;
        k91.d5 d5Var = t4Var.f305772f;
        return d5Var != null ? new k91.k1(str, null, false, d5Var.c(), t4Var.f305772f.b(), t4Var.f305772f.a()) : new k91.k1(str, null, false);
    }

    @Override // k91.a5
    public java.lang.Object e(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, k91.a5.f305539a);
    }

    @Override // k91.a5
    public java.lang.String getUsername() {
        return this.f305764b.f305770d;
    }
}
