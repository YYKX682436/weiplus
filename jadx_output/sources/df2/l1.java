package df2;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f230621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(df2.p1 p1Var) {
        super(0);
        this.f230621d = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.p1 p1Var = this.f230621d;
        r45.v94 v94Var = ((mm2.c1) p1Var.business(mm2.c1.class)).Y5;
        if (v94Var != null) {
            df2.p1.Z6(p1Var, v94Var);
        }
        java.lang.String string = p1Var.O6().getString(com.tencent.mm.R.string.no8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context O6 = p1Var.O6();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.f211776c = string;
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
