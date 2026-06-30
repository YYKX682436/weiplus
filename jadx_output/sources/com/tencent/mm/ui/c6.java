package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class c6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FinderIconViewTipPreference f198078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f198079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f198081g;

    public c6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, boolean z17, java.lang.String str) {
        this.f198081g = findMoreFriendsUI;
        this.f198078d = finderIconViewTipPreference;
        this.f198079e = z17;
        this.f198080f = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView;
        jz5.l lVar = (jz5.l) obj;
        if (((java.lang.Boolean) lVar.f302834e).booleanValue()) {
            int intValue = ((java.lang.Integer) lVar.f302833d).intValue();
            com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = this.f198078d;
            oc2.k kVar = finderIconViewTipPreference.S2;
            if ((kVar == null || (renderView = ((oc2.n) kVar).f344229d) == null || intValue != renderView.hashCode()) ? false : true) {
                boolean z17 = this.f198079e;
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f198081g;
                if (z17 && !findMoreFriendsUI.F) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged]safeReportFinderLiveRedDotExpose return for not in findEntrance");
                    return;
                }
                zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                java.lang.String str = this.f198080f + "_DslRender";
                java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                ((c61.w8) paVar).fj(str, true, true, findMoreFriendsUI.G0(finderIconViewTipPreference));
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(findMoreFriendsUI, this, true);
                findMoreFriendsUI.J1 = null;
            }
        }
    }
}
