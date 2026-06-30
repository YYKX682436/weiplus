package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s4 extends com.tencent.mm.ui.component.UIComponent implements zy2.v5 {

    /* renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.DialogFragment f135856d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f135857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6() {
        androidx.lifecycle.m1 m1Var = this.f135856d;
        yr1.n nVar = m1Var instanceof yr1.n ? (yr1.n) m1Var : null;
        if (nVar != null) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = ((com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment) nVar).f94071g;
            if (vASCommonFragment == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
            if (vASActivity != null) {
                vASActivity.finish();
            }
        }
        this.f135856d = null;
    }

    public final boolean P6() {
        androidx.fragment.app.DialogFragment dialogFragment = this.f135856d;
        if (dialogFragment != null) {
            return dialogFragment.isVisible();
        }
        return false;
    }

    public final void Q6(com.tencent.mm.ui.MMActivity activity, android.content.Intent intent, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(intent, "intent");
        androidx.fragment.app.DialogFragment wi6 = ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).wi(activity, intent, aVar, i17, false);
        this.f135856d = wi6;
        wi6.setMenuVisibility(false);
        if (aVar != null) {
            aVar.c(true, true, 0);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(this.f135856d);
        androidx.fragment.app.DialogFragment dialogFragment = this.f135856d;
        if (dialogFragment != null) {
            dialogFragment.show(activity.getSupportFragmentManager(), "BizContactInfoDialogFragment");
        }
    }

    public final void R6(so2.j5 feed) {
        java.util.ArrayList dataList;
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI bizProfileTimelineUI = context instanceof com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI ? (com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI) context : null;
        if (bizProfileTimelineUI == null) {
            return;
        }
        ab2.g0 g0Var = bizProfileTimelineUI.f109195x;
        if (g0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = g0Var.f106570t;
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader ? (com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader) baseFeedLoader : null;
        if (feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        }
        if (finderBizProfileLoader == null || (dataList = finderBizProfileLoader.getDataList()) == null) {
            return;
        }
        java.util.Iterator it = dataList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((so2.j5) it.next()).getItemId() == feed.getItemId()) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 == -1) {
            if (this.f135857e == null) {
                this.f135857e = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.ggc), false, false, null);
            }
            finderBizProfileLoader.f102778q.add(new com.tencent.mm.plugin.finder.viewmodel.component.r4(this, feed));
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(finderBizProfileLoader, false, 1, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f135857e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f135857e = null;
        ab2.h0 h0Var = bizProfileTimelineUI.f109196y;
        if (h0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h0Var.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBizProfileDrawerUIC", "tryScrollToFeed", "(Lcom/tencent/mm/plugin/finder/model/RVFeed;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBizProfileDrawerUIC", "tryScrollToFeed", "(Lcom/tencent/mm/plugin/finder/model/RVFeed;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (!P6()) {
            return super.onBackPressed();
        }
        O6();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f135856d = null;
    }
}
