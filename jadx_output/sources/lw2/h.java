package lw2;

/* loaded from: classes2.dex */
public final class h implements nn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321571d;

    public h(lw2.m mVar) {
        this.f321571d = mVar;
    }

    @Override // nn0.a0
    public void I(boolean z17, float f17, float f18, float f19, java.lang.String str) {
        java.lang.String sessionBuffer;
        if (z17) {
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            lw2.m mVar = this.f321571d;
            mVar.getClass();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            com.tencent.mm.plugin.finder.storage.FeedData feedData = mVar.f321581f;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(feedData != null ? feedData.getFeedId() : 0L));
            r45.qt2 d17 = mVar.d();
            lVarArr[1] = new jz5.l("finder_context_id", d17 != null ? d17.getString(1) : null);
            r45.qt2 d18 = mVar.d();
            lVarArr[2] = new jz5.l("finder_tab_context_id", d18 != null ? d18.getString(2) : null);
            r45.qt2 d19 = mVar.d();
            lVarArr[3] = new jz5.l("comment_scene", d19 != null ? java.lang.Integer.valueOf(d19.getInteger(5)) : null);
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = mVar.f321581f;
            if (feedData2 != null && (sessionBuffer = feedData2.getSessionBuffer()) != null) {
                str2 = sessionBuffer;
            }
            lVarArr[4] = new jz5.l("session_buffer", str2);
            lVarArr[5] = new jz5.l("before_multiple", java.lang.Float.valueOf(f17));
            lVarArr[6] = new jz5.l("after_multiple", java.lang.Float.valueOf(f18));
            lVarArr[7] = new jz5.l("after_auto_multiple", java.lang.Float.valueOf(f19));
            lVarArr[8] = new jz5.l("finder_2finger_sid", str);
            ((cy1.a) rVar).yj("finder_2finger_operation", null, kz5.c1.k(lVarArr), 1, true);
        }
    }

    @Override // nn0.a0
    public void P() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        lw2.m mVar = this.f321571d;
        lw2.o oVar = mVar.f321577b;
        if (!(oVar != null ? oVar.f321595e : false) || mVar.f321578c) {
            return;
        }
        mVar.f321578c = true;
        android.view.View view = (android.view.View) ((jz5.n) mVar.f321584i).getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new lw2.i(mVar));
        }
        mVar.a(true, false);
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = mVar.e();
        if (e17 != null) {
            hc2.f1.x(e17);
        }
        android.content.Context context = mVar.f321576a.getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI == null || (swipeBackLayout = mMFinderUI.getSwipeBackLayout()) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(false);
    }

    @Override // nn0.a0
    public void g0(android.view.MotionEvent motionEvent, int i17, boolean z17) {
        lw2.m mVar = this.f321571d;
        mVar.i();
        mVar.h(i17, z17);
    }

    @Override // nn0.a0
    public void h0(boolean z17) {
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout;
        com.tencent.mars.xlog.Log.i("FinderVideoScaleCleanUIC", "notifyClipChildren clip: " + z17);
        lw2.m mVar = this.f321571d;
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = mVar.e();
        com.tencent.mm.plugin.finder.view.FinderVideoBanner finderVideoBanner = null;
        android.view.ViewGroup viewGroup = e17 != null ? (android.view.ViewGroup) e17.findViewById(com.tencent.mm.R.id.jdk) : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(z17);
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e18 = mVar.e();
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout2 = e18 != null ? (com.tencent.mm.plugin.finder.view.FinderMediaLayout) e18.findViewById(com.tencent.mm.R.id.fs6) : null;
        if (finderMediaLayout2 != null) {
            finderMediaLayout2.setClipChildren(z17);
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e19 = mVar.e();
        if (e19 != null && (finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) e19.findViewById(com.tencent.mm.R.id.fs6)) != null) {
            finderVideoBanner = finderMediaLayout.getVideoBanner();
        }
        if (finderVideoBanner == null) {
            return;
        }
        finderVideoBanner.setClipChildren(z17);
    }
}
