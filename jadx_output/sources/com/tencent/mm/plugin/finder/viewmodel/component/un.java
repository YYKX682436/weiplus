package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.rn f136146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f136147e;

    public un(com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar, com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        this.f136146d = rnVar;
        this.f136147e = eoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash, encashInterceptJumpInfo:");
        com.tencent.mm.plugin.finder.viewmodel.component.rn rnVar = this.f136146d;
        sb6.append(rnVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", sb6.toString());
        java.lang.Long l17 = rnVar.f135811e;
        if ((l17 != null ? l17.longValue() : 0L) > 0) {
            r45.v11 v11Var = (r45.v11) rnVar.f135810d.getCustom(9);
            java.util.LinkedList list = v11Var != null ? v11Var.getList(6) : null;
            boolean z17 = list == null || list.isEmpty();
            com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar = this.f136147e;
            if (!z17) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) eoVar.getContext(), 1, true);
                k0Var.q(eoVar.getContext().getString(com.tencent.mm.R.string.j5x), 17);
                k0Var.f211872n = new com.tencent.mm.plugin.finder.viewmodel.component.sn(list, eoVar);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.tn(list, rnVar, eoVar);
                k0Var.v();
            } else if (com.tencent.mm.plugin.finder.viewmodel.component.eo.S6(eoVar, rnVar)) {
                com.tencent.mm.plugin.finder.viewmodel.component.eo.Q6(eoVar, rnVar);
            } else if (com.tencent.mm.plugin.finder.viewmodel.component.eo.R6(eoVar, rnVar)) {
                com.tencent.mm.plugin.finder.viewmodel.component.eo.P6(eoVar, rnVar);
            } else {
                js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                android.app.Activity context = eoVar.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
                js4.q qVar = new js4.q();
                qVar.f301556a = rnVar.f135810d.getInteger(1);
                java.lang.Long l18 = rnVar.f135811e;
                qVar.f301557b = l18 != null ? l18.longValue() : 0L;
                qVar.f301558c = rnVar.f135812f;
                qVar.f301559d = rnVar.f135813g;
                qVar.f301560e = rnVar.f135816m;
                qVar.f301561f = rnVar.f135817n;
                ((ms4.z) iVar).g(mMActivity, qVar, new java.lang.ref.WeakReference(eoVar));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$3$getItemConvert$1$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
