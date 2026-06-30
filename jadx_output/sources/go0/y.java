package go0;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo0.k f273908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f273909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(go0.f0 f0Var, lo0.k kVar, double d17) {
        super(0);
        this.f273907d = f0Var;
        this.f273908e = kVar;
        this.f273909f = d17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.t1 t1Var;
        go0.a aVar;
        go0.f1 f1Var = this.f273907d.f273767p;
        if (f1Var != null) {
            lo0.k kVar = this.f273908e;
            double d17 = this.f273909f;
            if (kVar != null && (t1Var = f1Var.I) != null && (aVar = t1Var.f273856c) != null) {
                aVar.c(kVar, d17);
            }
        }
        return jz5.f0.f302826a;
    }
}
