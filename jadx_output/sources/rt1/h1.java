package rt1;

/* loaded from: classes7.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(rt1.p1 p1Var, java.lang.String str) {
        super(0);
        this.f399417d = p1Var;
        this.f399418e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rt1.p1 p1Var = this.f399417d;
        p1Var.b().a(this.f399418e);
        rt1.b1 b1Var = p1Var.f399473b;
        if (b1Var != null) {
            b1Var.b(p1Var.b().f94623d);
        }
        return jz5.f0.f302826a;
    }
}
