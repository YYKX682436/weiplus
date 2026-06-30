package mz0;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mz0.b2 b2Var) {
        super(0);
        this.f333017d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f333017d;
        com.tencent.mm.mj_template.sns.compose.widget.y yVar = new com.tencent.mm.mj_template.sns.compose.widget.y(b2Var.getMainScope());
        yVar.f70323b = new mz0.i(b2Var);
        yVar.f70325d = new mz0.k(b2Var, yVar);
        yVar.f70328g = new mz0.l(b2Var);
        yVar.f70324c = new mz0.m(b2Var);
        yVar.f70326e = new mz0.o(b2Var);
        return yVar;
    }
}
