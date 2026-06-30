package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class wc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f116784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f116785b;

    public wc(com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f116784a = simpleLivingCardView;
        this.f116785b = finderItem;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        jz5.l lVar = new jz5.l("behaviour_session_id", Ri);
        boolean z17 = false;
        lVarArr[0] = lVar;
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116784a;
        r45.qt2 reportObj = simpleLivingCardView.getReportObj();
        lVarArr[1] = new jz5.l("finder_context_id", reportObj != null ? reportObj.getString(1) : null);
        r45.qt2 reportObj2 = simpleLivingCardView.getReportObj();
        lVarArr[2] = new jz5.l("finder_tab_context_id", reportObj2 != null ? reportObj2.getString(2) : null);
        r45.nw1 liveInfo = this.f116785b.getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            z17 = true;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Integer.valueOf(z17 ? 1 : 2));
        return kz5.c1.k(lVarArr);
    }
}
