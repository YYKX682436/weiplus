package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.s f135749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135750f;

    public r(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.s sVar, java.lang.String str) {
        this.f135748d = s0Var;
        this.f135749e = sVar;
        this.f135750f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f135748d;
        com.tencent.mm.plugin.finder.viewmodel.component.t tVar = (com.tencent.mm.plugin.finder.viewmodel.component.t) s0Var.f293125i;
        java.lang.String username = tVar.f135948d.getUsername();
        if (username == null) {
            username = "";
        }
        ya2.b2 b17 = ya2.h.f460484a.b(username);
        boolean z17 = false;
        if (b17 != null) {
            int i17 = b17.field_follow_Flag;
            l75.e0 e0Var = ya2.b2.O2;
            if (i17 == ya2.b2.Q2) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.s sVar = this.f135749e;
        if (z17) {
            sVar.getClass();
            android.content.Context context = s0Var.f293121e;
            if (sVar.f135845e == null) {
                android.content.res.Resources resources = context.getResources();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                k0Var.q(context.getResources().getString(com.tencent.mm.R.string.f491289cn3), 17);
                k0Var.f211872n = new com.tencent.mm.plugin.finder.viewmodel.component.m(sVar, resources);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.n(sVar, context, username, s0Var, tVar);
                k0Var.f211854d = new com.tencent.mm.plugin.finder.viewmodel.component.o(sVar);
                sVar.f135845e = k0Var;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = sVar.f135845e;
            if (k0Var2 != null && !k0Var2.i()) {
                k0Var2.v();
            }
        } else {
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.s.n(sVar, context2, username, !z17);
        }
        sVar.o(s0Var, tVar);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", username);
        jSONObject.put("click_action_type", z17 ? 2 : 1);
        jSONObject.put("recommend_source_finder_username", this.f135750f);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "frifollow_page_follow_button", 1, jSONObject, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
