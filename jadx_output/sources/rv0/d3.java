package rv0;

/* loaded from: classes5.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f399970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(rv0.o7 o7Var, ex0.r rVar, ex0.a0 a0Var, rv0.n1 n1Var) {
        super(0);
        this.f399970d = o7Var;
        this.f399971e = rVar;
        this.f399972f = a0Var;
        this.f399973g = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.o7 o7Var = this.f399970d;
        o7Var.J();
        ex0.r rVar = this.f399971e;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            boolean D = cVar.D();
            float C = cVar.C();
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(o7Var.getContext());
            i0Var.d(com.tencent.mm.R.string.lkp);
            i0Var.f(com.tencent.mm.R.string.lkq);
            i0Var.f211821b.E = new rv0.c3(this.f399972f, this.f399973g, this.f399970d, C, D);
            i0Var.e(com.tencent.mm.R.string.apj);
            i0Var.h();
        }
        return jz5.f0.f302826a;
    }
}
