package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class a6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FinderIconViewTipPreference f197119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f197120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f197121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f197122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f197123h;

    public a6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, boolean z17, androidx.lifecycle.y yVar, boolean z18) {
        this.f197123h = findMoreFriendsUI;
        this.f197119d = finderIconViewTipPreference;
        this.f197120e = z17;
        this.f197121f = yVar;
        this.f197122g = z18;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference;
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView;
        jz5.l lVar = (jz5.l) obj;
        if (!((java.lang.Boolean) lVar.f302834e).booleanValue() || (finderIconViewTipPreference = this.f197119d) == null) {
            return;
        }
        int intValue = ((java.lang.Integer) lVar.f302833d).intValue();
        oc2.k kVar = finderIconViewTipPreference.S2;
        if ((kVar == null || (renderView = ((oc2.n) kVar).f344229d) == null || intValue != renderView.hashCode()) ? false : true) {
            boolean z17 = this.f197120e;
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f197123h;
            if (z17 && !findMoreFriendsUI.F) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] reportFindPageRedDotExpose return because not in find page!");
            } else {
                ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ni(this.f197121f, findMoreFriendsUI.I1, true);
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).cj(this.f197122g, finderIconViewTipPreference.H0(), finderIconViewTipPreference.B0(), finderIconViewTipPreference.C0());
            }
        }
    }
}
