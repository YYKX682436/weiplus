package j93;

/* loaded from: classes.dex */
public final class h2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f298401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298402b;

    public h2(java.util.List list, j93.p2 p2Var) {
        this.f298401a = list;
        this.f298402b = p2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f70615a;
        j93.p2 p2Var = this.f298402b;
        if (i17 != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity context = p2Var.getActivity();
            com.tencent.mm.ui.widget.dialog.f4 f4Var = p2Var.f298479g;
            java.lang.String string = p2Var.getActivity().getString(com.tencent.mm.R.string.mba);
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
        java.util.List e17 = g95.e.f269801a.e(this.f298401a);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
        java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
            ri5.h hVar = ri5.j.I;
            int i19 = ri5.j.Z;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            arrayList.add(ti5.d.f419663i.b(p2Var.getActivity(), hVar.a(d17, i19, 0), z3Var, i19, new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null)));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = p2Var.W6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.p(a17, arrayList, false, 2, null);
        }
        androidx.appcompat.app.AppCompatActivity context2 = p2Var.getActivity();
        com.tencent.mm.ui.widget.dialog.f4 f4Var2 = p2Var.f298479g;
        java.lang.String string2 = p2Var.getActivity().getString(com.tencent.mm.R.string.f492367mb5);
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
        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var4 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var4.f211776c = string2;
        e4Var4.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var4.c();
        return fVar;
    }
}
