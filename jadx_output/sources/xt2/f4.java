package xt2;

/* loaded from: classes3.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j31 f456744e;

    public f4(xt2.b5 b5Var, r45.j31 j31Var) {
        this.f456743d = b5Var;
        this.f456744e = j31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.c33 c33Var;
        java.lang.String string;
        r45.c33 c33Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initFlashSaleSettings$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.b5 b5Var = this.f456743d;
        gk2.e eVar = b5Var.f456637i;
        com.tencent.mm.ui.MMActivity context = b5Var.f456636h;
        kotlin.jvm.internal.o.g(eVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        r45.j31 j31Var = this.f456744e;
        java.lang.String str2 = "";
        if (j31Var == null || (c33Var2 = (r45.c33) j31Var.getCustom(1)) == null || (str = c33Var2.getString(0)) == null) {
            str = "";
        }
        if (j31Var != null && (c33Var = (r45.c33) j31Var.getCustom(1)) != null && (string = c33Var.getString(1)) != null) {
            str2 = string;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317022f = str2;
        b1Var.f317032k = 1205;
        b1Var.f317028i = new hg2.p(eVar);
        com.tencent.mars.xlog.Log.i("FlashSaleUtil", "open flash sale record with appId = " + str + ", path = " + str2);
        dk2.q4.m(dk2.q4.f233938a, context, eVar, b1Var, false, null, 16, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initFlashSaleSettings$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
