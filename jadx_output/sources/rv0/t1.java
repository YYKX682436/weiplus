package rv0;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(xv0.g gVar, rv0.n1 n1Var) {
        super(0);
        this.f400251d = gVar;
        this.f400252e = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xv0.g gVar = this.f400251d;
        gVar.J();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gVar.getContext());
        i0Var.d(com.tencent.mm.R.string.llr);
        i0Var.f(com.tencent.mm.R.string.llq);
        i0Var.f211821b.E = new rv0.s1(this.f400252e, gVar);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        return jz5.f0.f302826a;
    }
}
