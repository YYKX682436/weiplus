package rn2;

/* loaded from: classes15.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(rn2.t2 t2Var, int i17) {
        super(1);
        this.f397785d = t2Var;
        this.f397786e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qp1 innerErrPage = (r45.qp1) obj;
        kotlin.jvm.internal.o.g(innerErrPage, "innerErrPage");
        rn2.t2 t2Var = this.f397785d;
        if (t2Var.N == null) {
            android.view.View findViewById = t2Var.f397852d.findViewById(com.tencent.mm.R.id.f8d);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            t2Var.N = new com.tencent.mm.plugin.finder.live.widget.se(findViewById, null, null, null, 14, null);
        }
        com.tencent.mm.plugin.finder.live.widget.se seVar = t2Var.N;
        if (seVar != null) {
            seVar.c(7, innerErrPage, this.f397786e, new rn2.j2(t2Var));
        }
        return jz5.f0.f302826a;
    }
}
