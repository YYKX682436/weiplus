package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ml implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f135177d;

    public ml(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        this.f135177d = finderHomeUIC;
    }

    @Override // uh4.i0
    public final void onDataChanged() {
        java.lang.Object obj;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f135177d;
            finderHomeUIC.f133567d = true;
            java.util.Iterator it = finderHomeUIC.getFragments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj) instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj;
            if (finderHomeTabFragment != null) {
                com.tencent.mm.plugin.finder.feed.bt btVar = ((com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).f135994d;
                if (btVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.g00 Z0 = ((com.tencent.mm.plugin.finder.feed.pz) btVar).Z0();
                if (Z0.f()) {
                    com.tencent.mm.plugin.finder.feed.qz c17 = Z0.c();
                    com.tencent.mars.xlog.Log.i(Z0.f106801f, "teenModeDataChange forbiddenStatus=" + c17);
                    if (c17.h()) {
                        Z0.l(-4, c17.i());
                    }
                }
            }
        }
    }
}
