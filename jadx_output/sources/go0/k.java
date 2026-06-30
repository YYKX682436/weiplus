package go0;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.y0 f273792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(go0.f0 f0Var, p05.y0 y0Var) {
        super(0);
        this.f273791d = f0Var;
        this.f273792e = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273791d.f273767p;
        if (f1Var != null) {
            p05.y0 effect = this.f273792e;
            kotlin.jvm.internal.o.g(effect, "effect");
            if (f1Var.f273776y == null) {
                f1Var.f273776y = new go0.w1();
            }
            go0.w1 w1Var = f1Var.f273776y;
            if (w1Var != null) {
                w1Var.a(effect);
            }
        }
        return jz5.f0.f302826a;
    }
}
