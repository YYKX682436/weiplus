package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138277d;

    public i(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138277d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138277d;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = vVar.f138333y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fts] handleYuanbaoAdClick ");
        xj.m mVar = (xj.m) ((jz5.n) a0Var.f138243b.f469409r).getValue();
        jz5.f0 f0Var = null;
        sb6.append(mVar != null ? mVar.f454753a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSActionBarAISearchViewModel", sb6.toString());
        xj.m mVar2 = (xj.m) ((jz5.n) a0Var.f138243b.f469409r).getValue();
        if (mVar2 != null) {
            i95.m c17 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xj.i.y3((xj.i) c17, mVar2.f454753a, null, new com.tencent.mm.plugin.fts.ui.widget.w(a0Var), 2, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSActionBarAISearchViewModel", "[handleYuanbaoAdClick] adInfo is null, jump failed.");
        }
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440245o;
        vu4.b bVar = vu4.b.f440271u;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var2 = vVar.f138333y;
        dVar.b(aVar, bVar, a0Var2.f138243b.a7(), a0Var2.f138243b.f469401g);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initAISearchAndYuanbaoAd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
