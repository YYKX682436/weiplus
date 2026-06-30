package v0;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f432187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f432188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f432189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.lifecycle.g0 g0Var, androidx.lifecycle.y yVar, n0.v2 v2Var) {
        super(1);
        this.f432187d = g0Var;
        this.f432188e = yVar;
        this.f432189f = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        final n0.v2 v2Var = this.f432189f;
        androidx.lifecycle.k0 k0Var = new androidx.lifecycle.k0() { // from class: v0.a$$a
            @Override // androidx.lifecycle.k0
            public final void onChanged(java.lang.Object obj2) {
                n0.v2 state = n0.v2.this;
                kotlin.jvm.internal.o.g(state, "$state");
                state.setValue(obj2);
            }
        };
        androidx.lifecycle.g0 g0Var = this.f432187d;
        g0Var.observe(this.f432188e, k0Var);
        return new v0.b(g0Var, k0Var);
    }
}
