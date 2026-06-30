package go0;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.q0 f273782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(go0.f0 f0Var, p05.q0 q0Var) {
        super(0);
        this.f273781d = f0Var;
        this.f273782e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f273781d.f273767p;
        if (f1Var != null) {
            p05.q0 effect = this.f273782e;
            kotlin.jvm.internal.o.g(effect, "effect");
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null) {
                t1Var.f273867n = effect;
                go0.a aVar = t1Var.f273856c;
                if (aVar != null && (d0Var = aVar.f273730f) != null) {
                    ((p05.l0) effect).b(d0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
