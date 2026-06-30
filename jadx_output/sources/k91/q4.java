package k91;

/* loaded from: classes7.dex */
public class q4 implements k91.a5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k91.d5 f305735c;

    public q4(java.lang.String str, k91.d5 d5Var) {
        this.f305734b = str;
        this.f305735c = d5Var;
    }

    @Override // k91.a5
    public boolean a(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        return k91.h5.a(v5Var) || k91.h5.b(v5Var);
    }

    @Override // k91.a5
    public k91.k1 b(java.lang.String str) {
        k91.d5 d5Var = this.f305735c;
        return d5Var != null ? new k91.k1(null, str, false, d5Var.c(), d5Var.b(), d5Var.a()) : new k91.k1(null, str, false);
    }

    @Override // k91.a5
    public java.lang.Object e(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.app.r9.ij().k1(this.f305734b, k91.a5.f305539a);
    }

    @Override // k91.a5
    public java.lang.String getUsername() {
        return k91.k4.f(this.f305734b);
    }
}
