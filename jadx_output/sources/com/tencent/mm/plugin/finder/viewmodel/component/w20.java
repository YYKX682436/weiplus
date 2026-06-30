package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w20 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f136293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f136294f;

    public w20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        this.f136292d = f50Var;
        this.f136293e = jbVar;
        this.f136294f = f03Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        r45.f03 f03Var;
        java.lang.String str2;
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        boolean z17 = z9Var != null && z9Var.f105327a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136292d;
        if (!z17) {
            android.view.View view = f50Var.f134352r;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$3", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$3", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = f50Var.f134352r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$3", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$3", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String str3 = "";
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f136293e;
        if (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null || (str = vs2Var.f388490h) == null) {
            str = "";
        }
        if (kotlin.jvm.internal.o.b(str, f50Var.N)) {
            return;
        }
        f50Var.N = str;
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "createLiveReddot FINDER_SELF_LIVE_ENTRANCE expose, time:" + c01.id.c());
        if (jbVar == null || (f03Var = this.f136294f) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
        androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", jbVar, f03Var, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        zy2.fa.K0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), jbVar, "finderprofile.startlive", c01.id.c(), false, 8, null);
        c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
        ml2.c1 c1Var = ml2.c1.f327325e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        r45.vs2 vs2Var2 = jbVar.field_ctrInfo;
        if (vs2Var2 != null && (str2 = vs2Var2.f388490h) != null) {
            str3 = str2;
        }
        jSONObject.put("reddot_id", str3);
        jSONObject.put(ya.b.SOURCE, 1);
        ((b92.g1) acVar).Ni(60L, jSONObject);
    }
}
