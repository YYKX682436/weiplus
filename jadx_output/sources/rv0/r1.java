package rv0;

/* loaded from: classes5.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f400217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(xv0.g gVar, rv0.n1 n1Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        super(0);
        this.f400215d = gVar;
        this.f400216e = n1Var;
        this.f400217f = clipSegment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xv0.g gVar = this.f400215d;
        gVar.J();
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gVar.getContext());
        i0Var.d(com.tencent.mm.R.string.lkp);
        i0Var.f(com.tencent.mm.R.string.lkq);
        i0Var.f211821b.E = new rv0.q1(this.f400216e, this.f400217f, gVar);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        return jz5.f0.f302826a;
    }
}
