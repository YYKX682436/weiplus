package my2;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f332718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(my2.k0 k0Var, android.view.ViewGroup viewGroup) {
        super(2);
        this.f332717d = k0Var;
        this.f332718e = viewGroup;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.util.List choiceList = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(choiceList, "choiceList");
        my2.k0 k0Var = this.f332717d;
        if (((mm2.c1) k0Var.P0(mm2.c1.class)).f328789c6) {
            k0Var.A.a();
            mm2.e1 e1Var = (mm2.e1) k0Var.P0(mm2.e1.class);
            long j17 = e1Var.f328988r.getLong(0);
            long j18 = e1Var.f328983m;
            java.lang.String str2 = e1Var.f328992v;
            r45.me2 me2Var = ((mm2.c1) k0Var.P0(mm2.c1.class)).f328784b6;
            if (me2Var == null || (str = me2Var.getString(5)) == null) {
                str = "";
            }
            pq5.g l17 = new ly2.a(j17, j18, str2, choiceList, str, e1Var.f328985o).l();
            android.view.ViewGroup viewGroup = this.f332718e;
            l17.K(new my2.z(k0Var, intValue, viewGroup));
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
        return jz5.f0.f302826a;
    }
}
