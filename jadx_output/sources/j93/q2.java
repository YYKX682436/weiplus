package j93;

/* loaded from: classes.dex */
public final class q2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f298484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ip4 f298485b;

    public q2(j93.v2 v2Var, r45.ip4 ip4Var) {
        this.f298484a = v2Var;
        this.f298485b = ip4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f70615a;
        j93.v2 v2Var = this.f298484a;
        if (i17 != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity context = v2Var.getActivity();
            com.tencent.mm.ui.widget.dialog.f4 f4Var = v2Var.f298524n;
            java.lang.String string = v2Var.getActivity().getString(com.tencent.mm.R.string.mba);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            kotlin.jvm.internal.o.g(context, "context");
            if (f4Var != null) {
                com.tencent.mm.ui.widget.dialog.e4 e4Var = f4Var.f211791d;
                e4Var.getClass();
                e4Var.f211776c = string;
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.e();
                return fVar;
            }
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = string;
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
            return fVar;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) v2Var.f298517d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            java.util.LinkedList<r45.gw6> UserLabelInfoList = this.f298485b.f377256e;
            kotlin.jvm.internal.o.f(UserLabelInfoList, "UserLabelInfoList");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(UserLabelInfoList, 10));
            for (r45.gw6 gw6Var : UserLabelInfoList) {
                ri5.h hVar = ri5.j.I;
                java.lang.String UserName = gw6Var.f375581d;
                kotlin.jvm.internal.o.f(UserName, "UserName");
                arrayList.add(hVar.a(UserName, ri5.j.Z, 0));
            }
            a17.t(arrayList);
        }
        androidx.appcompat.app.AppCompatActivity context2 = v2Var.getActivity();
        com.tencent.mm.ui.widget.dialog.f4 f4Var2 = v2Var.f298524n;
        java.lang.String string2 = v2Var.getActivity().getString(com.tencent.mm.R.string.mb_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        kotlin.jvm.internal.o.g(context2, "context");
        if (f4Var2 != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = f4Var2.f211791d;
            e4Var3.getClass();
            e4Var3.f211776c = string2;
            e4Var3.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var3.e();
            return fVar;
        }
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var4 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var4.f211776c = string2;
        e4Var4.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var4.c();
        return fVar;
    }
}
