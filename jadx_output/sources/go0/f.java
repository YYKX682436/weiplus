package go0;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.o0 f273757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(go0.f0 f0Var, p05.o0 o0Var) {
        super(0);
        this.f273756d = f0Var;
        this.f273757e = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.a aVar;
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f273756d.f273767p;
        if (f1Var != null) {
            p05.o0 effect = this.f273757e;
            kotlin.jvm.internal.o.g(effect, "effect");
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null && (aVar = t1Var.f273856c) != null && (d0Var = aVar.f273730f) != null) {
                ((p05.i0) effect).b(d0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
