package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class m implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123377e;

    public m(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView) {
        this.f123376d = wxRecyclerAdapter;
        this.f123377e = finderTopicFilterView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        jz5.l lVar;
        yz5.p pVar;
        java.util.ArrayList arrayList;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicFilterView", "click item pos:" + (i17 - this.f123376d.a0()));
        so2.e5 e5Var = (so2.e5) holder.f293125i;
        if (e5Var != null) {
            r45.r03 r03Var = e5Var.f410330d;
            long j17 = r03Var.getLong(1);
            if (e5Var.f410332f) {
                e5Var.f410332f = false;
                lVar = new jz5.l(r03Var, java.lang.Boolean.FALSE);
            } else {
                e5Var.f410332f = true;
                lVar = new jz5.l(r03Var, java.lang.Boolean.TRUE);
            }
            r45.r03 r03Var2 = (r45.r03) lVar.f302833d;
            boolean booleanValue = ((java.lang.Boolean) lVar.f302834e).booleanValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderTopicFilterView", "select item hash:" + e5Var.hashCode() + ", topic:" + r03Var.getString(0) + ", selected:" + e5Var.f410332f);
            com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123377e;
            com.tencent.mm.plugin.finder.profile.filter.h presenter = finderTopicFilterView.getPresenter();
            if (presenter != null && (arrayList = presenter.f123368e) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    so2.e5 e5Var2 = (so2.e5) it.next();
                    if (e5Var2.f410330d.getLong(1) != j17) {
                        e5Var2.f410332f = false;
                    }
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderTopicFilterView.adapter;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = finderTopicFilterView.foldAdapter;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
            com.tencent.mm.plugin.finder.profile.filter.h presenter2 = finderTopicFilterView.getPresenter();
            if (presenter2 == null || (pVar = presenter2.f123369f) == null) {
                return;
            }
            pVar.invoke(r03Var2, java.lang.Boolean.valueOf(booleanValue));
        }
    }
}
