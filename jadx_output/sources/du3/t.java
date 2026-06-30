package du3;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f243706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f243707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(du3.b0 b0Var, ju3.d0 d0Var) {
        super(1);
        this.f243706d = b0Var;
        this.f243707e = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        du3.b item = (du3.b) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str = a17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            du3.b0 b0Var = this.f243706d;
            ((vh0.f3) n1Var).bj(b0Var.f243524f.getContext(), "wxid_wi_1d142z0zdj03", 10, str, new du3.s(b0Var, item, this.f243707e));
        }
        return jz5.f0.f302826a;
    }
}
