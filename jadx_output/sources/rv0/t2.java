package rv0;

/* loaded from: classes5.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(rv0.j7 j7Var, ex0.a0 a0Var, rv0.n1 n1Var, ex0.r rVar) {
        super(0);
        this.f400253d = j7Var;
        this.f400254e = a0Var;
        this.f400255f = n1Var;
        this.f400256g = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.j7 j7Var = this.f400253d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(j7Var.getContext());
        i0Var.d(com.tencent.mm.R.string.lkp);
        i0Var.f(com.tencent.mm.R.string.lkq);
        i0Var.f211821b.E = new rv0.s2(j7Var, this.f400254e, this.f400255f, this.f400256g);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        return jz5.f0.f302826a;
    }
}
