package n0;

/* loaded from: classes14.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.p1 f333433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.d f333434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(n0.p1 p1Var, o0.d dVar) {
        super(1);
        this.f333433d = p1Var;
        this.f333434e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        ((n0.j1) this.f333433d).r(value);
        o0.d dVar = this.f333434e;
        if (dVar != null) {
            dVar.add(value);
        }
        return jz5.f0.f302826a;
    }
}
