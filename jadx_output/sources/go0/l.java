package go0;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.u0 f273796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(go0.f0 f0Var, p05.u0 u0Var) {
        super(0);
        this.f273795d = f0Var;
        this.f273796e = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f273795d.f273767p;
        if (f1Var != null) {
            p05.u0 effect = this.f273796e;
            kotlin.jvm.internal.o.g(effect, "effect");
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null) {
                t1Var.f273865l = effect;
                go0.a aVar = t1Var.f273856c;
                if (aVar != null && (d0Var = aVar.f273730f) != null) {
                    ((p05.f1) effect).b(d0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
