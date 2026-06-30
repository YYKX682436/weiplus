package g63;

/* loaded from: classes8.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g63.f0 f0Var) {
        super(2);
        this.f269181d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        z53.i result = (z53.i) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        if (booleanValue) {
            g63.f0 f0Var = this.f269181d;
            g63.j jVar = f0Var.f269107b;
            jVar.getClass();
            pm0.v.X(new g63.f(jVar, result));
            pm0.v.X(new g63.t(f0Var));
        }
        return jz5.f0.f302826a;
    }
}
