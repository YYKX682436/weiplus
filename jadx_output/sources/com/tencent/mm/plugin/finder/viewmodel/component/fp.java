package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fp extends zx2.h {

    /* renamed from: w, reason: collision with root package name */
    public int f134417w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        gy2.d dVar = new gy2.d();
        int intExtra = getIntent().getIntExtra("key_mention_business_type", 0);
        this.f134417w = intExtra;
        if (intExtra == 1) {
            dVar.setTabs(kz5.c0.d(new gy2.b(com.tencent.mm.R.string.erx, intExtra), new gy2.b(com.tencent.mm.R.string.erv, this.f134417w), new gy2.b(com.tencent.mm.R.string.erz, this.f134417w)));
        }
        return dVar;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void k7() {
        com.tencent.mars.xlog.Log.i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        java.lang.String[] strArr = this.f134417w == 1 ? com.tencent.mm.plugin.finder.viewmodel.component.kq.f134980i : com.tencent.mm.plugin.finder.viewmodel.component.kq.f134981m;
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            zx2.i b76 = b7(i18);
            if (b76 instanceof gy2.b) {
                ((gy2.b) b76).r("", false);
            }
            i17++;
            i18 = i19;
        }
    }

    @Override // zx2.h, com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f134417w = getIntent().getIntExtra("key_mention_business_type", 0);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        java.util.ArrayList arrayList = com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128574t;
        int i17 = com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128578x == 1 ? 2 : 1;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.f2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int N6 = ((ey2.f2) a17).N6("Finder.FinderMsgNotifyUIC", i17, xy2.c.e(getContext()));
        com.tencent.mars.xlog.Log.i("Finder.FinderMsgNotifyUIC", "[findTabIndex] tabStateType:" + i17 + ",index=" + N6);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(this, N6, false, 2, null);
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.a(getContext(), 3);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("FinderMessageEntryRight", com.tencent.mm.plugin.finder.viewmodel.component.cp.f134030d, false, xy2.c.e(getContext()));
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("AuthorProfileNotify", com.tencent.mm.plugin.finder.viewmodel.component.dp.f134155d, false, xy2.c.e(getContext()));
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477039v;
        if (finderTabLayout != null) {
            finderTabLayout.a(new com.tencent.mm.plugin.finder.viewmodel.component.ep(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        x7(X6());
    }

    public final java.lang.String w7(int i17) {
        return this.f134417w == 1 ? i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "MemberNotificationCenterJoin" : "MemberNotificationCenterComment" : "MemberNotificationCenterLike" : i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike";
    }

    public final void x7(int i17) {
        int i18 = this.f134417w == 1 ? i17 + 4 : i17 + 1;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getContext());
        lVarArr[0] = new jz5.l("finder_context_id", e17 != null ? e17.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(getContext());
        lVarArr[1] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(getContext());
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
        lVarArr[3] = new jz5.l("finder_message_tab", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("finder_message_tab_list", "view_unexp", kz5.c1.k(lVarArr), 25496);
    }
}
