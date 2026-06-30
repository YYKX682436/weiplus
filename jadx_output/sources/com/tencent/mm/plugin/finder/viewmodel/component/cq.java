package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.jq f134031d;

    public cq(com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar) {
        this.f134031d = jqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.viewmodel.component.hi hiVar;
        com.tencent.mm.plugin.finder.viewmodel.component.hi hiVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.jq jqVar = this.f134031d;
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = jqVar.f134881h;
        java.lang.Object obj = null;
        if (((giVar == null || (hiVar2 = giVar.f134535l) == null) ? null : hiVar2.f134635a) != com.tencent.mm.plugin.finder.viewmodel.component.fi.f134406e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedBack click but displayStatus=");
            com.tencent.mm.plugin.finder.viewmodel.component.gi giVar2 = jqVar.f134881h;
            if (giVar2 != null && (hiVar = giVar2.f134535l) != null) {
                obj = hiVar.f134635a;
            }
            sb6.append(obj);
            sb6.append('!');
            com.tencent.mars.xlog.Log.w("FinderNegativeFeedBackUIC", sb6.toString());
            yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        androidx.fragment.app.Fragment fragment = jqVar.getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar3 = jqVar.f134881h;
        if (finderHomeTabFragment != null && giVar3 != null) {
            android.view.View a17 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M.a(giVar3);
            if (a17 != null) {
                a17.removeCallbacks(jqVar.f134883m);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.viewmodel.component.aq aqVar = jqVar.f134880g;
            if (aqVar == null) {
                aqVar = new com.tencent.mm.plugin.finder.viewmodel.component.aq(new java.lang.ref.WeakReference(jqVar));
                com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
                t80Var.getClass();
                com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
                if (ctVar == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                ((com.tencent.mm.plugin.finder.feed.v00) ctVar).f110857r = aqVar;
            }
            jqVar.f134880g = aqVar;
            aqVar.f133797b = currentTimeMillis;
            jqVar.P6();
            finderHomeTabFragment.u0(new rn5.a(4, currentTimeMillis, 2));
            com.tencent.mars.xlog.Log.i("FinderNegativeFeedBackUIC", "request id=" + currentTimeMillis);
            jqVar.S6(giVar3, com.tencent.mm.plugin.finder.viewmodel.component.fi.f134407f, null);
            obj = jz5.f0.f302826a;
        }
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("FinderNegativeFeedBackUIC", "request fail,fragment is null!");
        }
        jqVar.Q6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNegativeFeedBackUIC$feedBackClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
