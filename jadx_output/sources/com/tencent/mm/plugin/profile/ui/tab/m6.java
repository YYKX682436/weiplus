package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f154482e;

    public m6(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo, java.util.List list) {
        this.f154481d = contactWidgetTabBizInfo;
        this.f154482e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154481d;
        com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer = contactWidgetTabBizInfo.f154210p1;
        if (bizProfileServiceInfoDrawer != null) {
            com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo.f154206n;
            kotlin.jvm.internal.o.d(z3Var);
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            int i17 = contactWidgetTabBizInfo.f154208p;
            long j17 = contactWidgetTabBizInfo.f154201g;
            android.content.Intent intent = contactWidgetTabBizInfo.f154198d.getIntent();
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = contactWidgetTabBizInfo.f154220y;
            java.util.List menuList = this.f154482e;
            kotlin.jvm.internal.o.g(menuList, "menuList");
            kotlin.jvm.internal.o.g(intent, "intent");
            if (bizProfileServiceInfoDrawer.q()) {
                return;
            }
            cs3.f fVar = bizProfileServiceInfoDrawer.builder;
            java.lang.Object obj = fVar != null ? fVar.f222106d : null;
            vr3.z zVar = obj instanceof vr3.z ? (vr3.z) obj : null;
            if (zVar != null) {
                zVar.f439663f = d17;
                ((java.util.ArrayList) zVar.f439664g).addAll(menuList);
                zVar.f439665h = i17;
                zVar.f439666i = j17;
                zVar.f439667m = intent;
                zVar.f439669o = m0Var;
                cs3.f fVar2 = zVar.f439668n;
                if (fVar2 != null && (recyclerView = fVar2.g().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                bizProfileServiceInfoDrawer.setVisibility(4);
                bizProfileServiceInfoDrawer.getSquares().setVisibility(4);
                cs3.f fVar3 = bizProfileServiceInfoDrawer.builder;
                kotlin.jvm.internal.o.d(fVar3);
                cs3.d dVar = new cs3.d(bizProfileServiceInfoDrawer);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = fVar3.g().getRecyclerView();
                if (recyclerView2.getMeasuredHeight() <= 0) {
                    recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new vr3.y(recyclerView2, zVar, fVar3, dVar));
                    return;
                }
                int a17 = zVar.a(fVar3);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "content measure ready, height: " + a17);
                dVar.invoke(java.lang.Integer.valueOf(a17));
            }
        }
    }
}
