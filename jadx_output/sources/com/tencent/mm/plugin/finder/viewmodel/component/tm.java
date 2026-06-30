package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f136043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f136044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f136045f;

    public tm(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f136043d = finderFeedShareRelativeListLoader;
        this.f136044e = finderLinearLayoutManager;
        this.f136045f = mnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer rawInitPos = this.f136043d.getRawInitPos();
        int intValue = rawInitPos != null ? rawInitPos.intValue() : -1;
        if (intValue >= 0) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = this.f136044e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f136045f;
            mnVar.getClass();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mnVar.f135190r;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemChanged(intValue + wxRecyclerAdapter.a0());
            } else {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
        }
    }
}
