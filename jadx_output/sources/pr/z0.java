package pr;

/* loaded from: classes15.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f357801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f357802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pr.a1 a1Var, java.util.List list) {
        super(0);
        this.f357801d = a1Var;
        this.f357802e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pr.a1 a1Var = this.f357801d;
        a1Var.f357689a.addAll(this.f357802e);
        pm0.v.X(new pr.w0(a1Var));
        return jz5.f0.f302826a;
    }
}
