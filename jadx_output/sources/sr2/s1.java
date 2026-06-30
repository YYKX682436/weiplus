package sr2;

/* loaded from: classes10.dex */
public final class s1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411710a;

    public s1(sr2.y2 y2Var) {
        this.f411710a = y2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        sr2.y2 y2Var = this.f411710a;
        if (i17 != 0 || fVar.f70616b != 0) {
            java.lang.String str = fVar.f70617c;
            java.lang.String string = str == null || str.length() == 0 ? y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.eqz) : fVar.f70617c;
            androidx.appcompat.app.AppCompatActivity activity = y2Var.getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            return e4Var.c();
        }
        java.lang.String string2 = y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f491421op);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        androidx.appcompat.app.AppCompatActivity activity2 = y2Var.getActivity();
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
        e4Var2.f211776c = string2;
        e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var2.c();
        ya2.p1 p1Var = y2Var.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        ((yv2.b) p1Var).a().setLocationName(y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.m1a));
        ya2.p1 p1Var2 = y2Var.f411800d;
        if (p1Var2 != null) {
            ((yv2.b) p1Var2).a().setLocationRightTips("");
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("locationWidget");
        throw null;
    }
}
