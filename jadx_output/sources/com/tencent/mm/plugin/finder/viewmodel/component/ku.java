package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ku extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t80 f134991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nu f134992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var, com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar) {
        super(0);
        this.f134991d = t80Var;
        this.f134992e = nuVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        int P6;
        try {
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader Q6 = this.f134991d.Q6();
            if (Q6 != null && (dataListJustForAdapter = Q6.getDataListJustForAdapter()) != 0 && (P6 = this.f134991d.P6()) >= 0 && P6 < dataListJustForAdapter.size()) {
                long itemId = ((so2.j5) dataListJustForAdapter.get(P6)).getItemId();
                com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = this.f134992e;
                if (itemId == nuVar.f135363q) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "remove feed fail,feed " + pm0.v.u(this.f134992e.f135363q) + " is playing!");
                } else {
                    com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = this.f134991d;
                    synchronized (dataListJustForAdapter) {
                        java.util.Iterator it = dataListJustForAdapter.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (((so2.j5) it.next()).getItemId() == nuVar.f135363q) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 >= 0) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "tabType:" + nuVar.f135362p + " remove feed " + pm0.v.u(nuVar.f135363q) + ",pos:" + i17 + '!');
                            nuVar.V6(0L);
                            nuVar.f135362p = -1;
                            dataListJustForAdapter.remove(i17);
                            com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
                            com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
                            if (l17 != null) {
                                l17.onItemRangeRemoved(i17, 1);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.FinderPopupUIC");
        }
        return jz5.f0.f302826a;
    }
}
