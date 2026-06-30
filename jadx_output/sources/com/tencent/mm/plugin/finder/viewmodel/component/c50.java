package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f133960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f133961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f133963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f133964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f133965i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f133966m;

    public c50(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, int i17, int i18, int i19, int i27) {
        this.f133960d = jbVar;
        this.f133961e = f03Var;
        this.f133962f = f50Var;
        this.f133963g = i17;
        this.f133964h = i18;
        this.f133965i = i19;
        this.f133966m = i27;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.f03 f03Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f133962f;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f133960d;
        if (jbVar != null && (f03Var = this.f133961e) != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", jbVar, f03Var, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("AuthorProfileMemberNotify", com.tencent.mm.plugin.finder.viewmodel.component.b50.f133838d, false, f50Var.f134338d);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("vipCnt", this.f133964h);
        jSONObject.put("commentCnt", this.f133965i);
        jSONObject.put("likeCnt", this.f133966m);
        int i17 = this.f133963g;
        jSONObject.put("totalCnt", i17);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        androidx.appcompat.app.AppCompatActivity activity = f50Var.getActivity();
        long j17 = f50Var.G;
        boolean z17 = f50Var.E;
        boolean z18 = i17 > 0;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        o3Var.Jj(activity, j17, z17, 2L, 12L, z18, i17, r26.i0.t(jSONObject2, ",", ";", false), f50Var.f134338d);
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(f50Var.getContext()));
        kotlin.jvm.internal.o.d(b17);
        if (b17.G0()) {
            intent.setClass(f50Var.getActivity(), com.tencent.mm.plugin.finder.ui.FinderExposeUI.class);
            androidx.appcompat.app.AppCompatActivity activity2 = f50Var.getActivity();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Rj(f50Var.getActivity(), intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
