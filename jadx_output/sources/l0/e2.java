package l0;

/* loaded from: classes14.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f314155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f314157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f314158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(java.lang.Object obj, l0.a3 a3Var, yz5.l lVar, n0.v2 v2Var) {
        super(1);
        this.f314155d = obj;
        this.f314156e = a3Var;
        this.f314157f = lVar;
        this.f314158g = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        l0.a3 a3Var = this.f314156e;
        if (!kotlin.jvm.internal.o.b(this.f314155d, a3Var.b())) {
            this.f314157f.invoke(a3Var.b());
            this.f314158g.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) r3.getValue()).booleanValue()));
        }
        return new l0.d2();
    }
}
