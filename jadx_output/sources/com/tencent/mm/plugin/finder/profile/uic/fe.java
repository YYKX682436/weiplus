package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class fe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ie f123713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls2.a f123714e;

    public fe(com.tencent.mm.plugin.finder.profile.uic.ie ieVar, ls2.a aVar) {
        this.f123713d = ieVar;
        this.f123714e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC$refreshMenu$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.plugin.finder.profile.uic.ie ieVar = this.f123713d;
        android.app.Activity context = ieVar.getContext();
        ls2.a aVar = this.f123714e;
        xc2.y2.i(y2Var, context, aVar.f321020d, 0, null, 12, null);
        android.app.Activity context2 = ieVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject a17 = ls2.g.f321028e.a(ieVar.getContext(), aVar.f321020d.f453234a);
        ya2.b2 b2Var = aVar.f321020d.f453249k;
        a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "menu", 1, a17, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC$refreshMenu$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
