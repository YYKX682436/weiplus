package k91;

/* loaded from: classes7.dex */
public class r4 implements k91.a5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k91.d5 f305759c;

    public r4(java.lang.String str, k91.d5 d5Var) {
        this.f305758b = str;
        this.f305759c = d5Var;
    }

    @Override // k91.a5
    public boolean a(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        return k91.h5.a(v5Var) || k91.h5.b(v5Var);
    }

    @Override // k91.a5
    public k91.k1 b(java.lang.String str) {
        k91.d5 d5Var = this.f305759c;
        return d5Var != null ? new k91.k1(str, null, false, d5Var.c(), d5Var.b(), d5Var.a()) : new k91.k1(str, null, false);
    }

    @Override // k91.a5
    public java.lang.Object e(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.app.r9.ij().n1(this.f305758b, k91.a5.f305539a);
    }

    @Override // k91.a5
    public java.lang.String getUsername() {
        return this.f305758b;
    }
}
