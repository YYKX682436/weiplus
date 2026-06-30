package sb2;

/* loaded from: classes3.dex */
public final class i extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f405414e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f405415f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f405416g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f405417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "onBind");
        in5.s0 s0Var = this.f417141d.f417149i;
        java.lang.Object obj = s0Var != null ? s0Var.f293121e : null;
        final androidx.fragment.app.FragmentActivity fragmentActivity = obj instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) obj : null;
        if (fragmentActivity != null) {
            this.f405417h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveFeedCancelTipShowEvent>(fragmentActivity) { // from class: com.tencent.mm.plugin.finder.convert.convertcontroller.FinderLiveSlideEnterLiveTipController$onBind$1$1
                {
                    this.__eventId = -441151460;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.FinderLiveFeedCancelTipShowEvent finderLiveFeedCancelTipShowEvent) {
                    com.tencent.mm.autogen.events.FinderLiveFeedCancelTipShowEvent event = finderLiveFeedCancelTipShowEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "onStopTimeListener");
                    sb2.i iVar = this;
                    com.tencent.mm.sdk.platformtools.b4 b4Var = iVar.f405414e;
                    if (b4Var != null) {
                        b4Var.d();
                    }
                    pm0.v.X(new sb2.c(iVar));
                    return false;
                }
            };
        }
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter;
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "onFocusFeedCenter");
        com.tencent.mm.sdk.event.IListener iListener = this.f405417h;
        if (iListener != null) {
            iListener.alive();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "tryToStartGuideTimer");
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var == null || (finderLiveBubbleLayoutCompatSlideEnter = (com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter) s0Var.p(com.tencent.mm.R.id.f484610ti1)) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(finderLiveBubbleLayoutCompatSlideEnter.M || finderLiveBubbleLayoutCompatSlideEnter.N);
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "in sliding");
            return;
        }
        in5.r rVar = gVar.f417150m;
        com.tencent.mm.plugin.finder.convert.zf zfVar = rVar instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) rVar : null;
        if (!(zfVar != null && zfVar.f104360h == 4)) {
            com.tencent.mars.xlog.Log.w("FinderLiveSlideEnterLiveTipController", "tabType is unSupport");
            return;
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T7).getValue()).r()).intValue() != 1) {
            com.tencent.mars.xlog.Log.w("FinderLiveSlideEnterLiveTipController", "switch is off");
            return;
        }
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_SHOW_SLIDE_TO_ENTER_BOOLEAN_SYNC, false)) {
            com.tencent.mars.xlog.Log.w("FinderLiveSlideEnterLiveTipController", "already tip");
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f405414e;
        if (b4Var != null) {
            b4Var.d();
        }
        sb2.h hVar = new sb2.h(this);
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "startShowGuideTimer delaySecond=5");
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("ShownSlideToClose::Timer", (com.tencent.mm.sdk.platformtools.a4) new sb2.g(hVar), false);
        long j17 = 5 * 1000;
        b4Var2.c(j17, j17);
        this.f405414e = b4Var2;
    }

    @Override // tc2.c
    public void U6() {
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "onUnFocusFeedCenter");
        com.tencent.mm.sdk.event.IListener iListener = this.f405417h;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f405414e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f405415f;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    @Override // tc2.c
    public void X6() {
        com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "onViewRecycled");
        com.tencent.mm.sdk.event.IListener iListener = this.f405417h;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f405414e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f405415f;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    public final void Y6() {
        try {
            com.tencent.mars.xlog.Log.i("FinderLiveSlideEnterLiveTipController", "clean");
            android.view.ViewGroup viewGroup = this.f405416g;
            if (viewGroup != null) {
                pm0.v.B(viewGroup);
            }
            android.view.ViewGroup viewGroup2 = this.f405416g;
            com.tencent.mm.view.MMPAGView mMPAGView = viewGroup2 != null ? (com.tencent.mm.view.MMPAGView) viewGroup2.findViewById(com.tencent.mm.R.id.v6p) : null;
            if (mMPAGView != null) {
                mMPAGView.h();
            }
            android.view.ViewGroup viewGroup3 = this.f405416g;
            if (viewGroup3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(viewGroup3, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(viewGroup3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "clean", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(viewGroup3, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "clean", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(viewGroup3, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveSlideEnterLiveTipController", "clean fail " + e17);
        }
    }

    public final void Z6(boolean z17) {
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView;
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var == null || (finderFeedLiveRecommendView = (com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView) s0Var.p(com.tencent.mm.R.id.efr)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveRecommendView", "updateTouchTipVisible " + z17);
        if (z17) {
            android.view.View view = finderFeedLiveRecommendView.f131095e;
            if (view == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = finderFeedLiveRecommendView.f131095e;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = finderFeedLiveRecommendView.f131095e;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = finderFeedLiveRecommendView.f131095e;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
