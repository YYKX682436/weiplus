package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f124148e;

    public q8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, xc2.p0 p0Var) {
        this.f124147d = obVar;
        this.f124148e = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124147d;
        xc2.y2.i(y2Var, obVar.getContext(), this.f124148e, 0, null, 12, null);
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ls2.b bVar = ls2.g.f321028e;
        android.app.Activity context2 = obVar.getContext();
        xc2.p0 p0Var = this.f124148e;
        org.json.JSONObject a17 = bVar.a(context2, p0Var.f453234a);
        ya2.b2 b2Var = p0Var.f453249k;
        a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "menu", 1, a17, false, null, 48, null);
        com.tencent.mm.plugin.finder.report.t2.f125363a.b(obVar.getActivity(), obVar.getUsername(), true, obVar.Q1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
