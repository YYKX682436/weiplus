package gf0;

/* loaded from: classes15.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.r f271222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gf0.r rVar, int i17, java.lang.String str) {
        super(0);
        this.f271222d = rVar;
        this.f271223e = i17;
        this.f271224f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gf0.r rVar = this.f271222d;
        gf0.i iVar = rVar.f271231d;
        double b17 = iVar != null ? iVar.b() : 0.0d;
        if (rVar.f271232e == gf0.u.f271246f) {
            rVar.f271232e = gf0.u.f271244d;
            qk.b8 b8Var = rVar.f271237m;
            if (b8Var != null) {
                b8Var.a(this.f271223e, this.f271224f, b17);
            }
        }
        return jz5.f0.f302826a;
    }
}
