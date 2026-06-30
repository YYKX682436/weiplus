package lw2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderVideoLayout f321576a;

    /* renamed from: b, reason: collision with root package name */
    public lw2.o f321577b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f321578c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f321579d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f321580e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f321581f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f321582g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f321583h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f321584i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f321585j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f321586k;

    public m(com.tencent.mm.plugin.finder.video.FinderVideoLayout videoLayout) {
        kotlin.jvm.internal.o.g(videoLayout, "videoLayout");
        this.f321576a = videoLayout;
        this.f321579d = jz5.h.b(new lw2.a(this));
        this.f321580e = jz5.h.b(new lw2.k(this));
        this.f321582g = jz5.h.b(new lw2.c(this));
        this.f321583h = jz5.h.b(new lw2.l(this));
        this.f321584i = jz5.h.b(new lw2.d(this));
    }

    public final void a(boolean z17, boolean z18) {
        android.view.View findViewById;
        vx2.k fastSeekHelper;
        com.tencent.mars.xlog.Log.i("FinderVideoScaleCleanUIC", "cleanScreen " + z17);
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = e();
        android.view.View findViewById2 = e17 != null ? e17.findViewById(com.tencent.mm.R.id.eg6) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View b17 = b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e18 = e();
        android.view.View findViewById3 = e18 != null ? e18.findViewById(com.tencent.mm.R.id.h6o) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = c();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
            kotlin.jvm.internal.o.g(fragment, "fragment");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) ((com.tencent.mm.plugin.finder.viewmodel.component.d1) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).f134058e).getValue();
            if (viewGroup != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(viewGroup, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup O6 = ((com.tencent.mm.plugin.finder.viewmodel.component.d1) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).O6();
            if (O6 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e19 = e();
        if (e19 != null && (findViewById = e19.findViewById(com.tencent.mm.R.id.f484486ee3)) != null) {
            com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e27 = e();
            com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = e27 != null ? (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) e27.findViewById(com.tencent.mm.R.id.f484896qk3) : null;
            if (finderFeedNewSeekBarLayout != null && (fastSeekHelper = finderFeedNewSeekBarLayout.getFastSeekHelper()) != null) {
                vx2.k.e(fastSeekHelper, 0L, false, 3, null);
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f321576a;
            if (finderVideoLayout.F()) {
                com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e28 = e();
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = e28 != null ? (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) e28.findViewById(com.tencent.mm.R.id.ghd) : null;
                if (finderFeedNewSeekBarLayout != null) {
                    finderFeedNewSeekBarLayout.setInScaleModeCallback(new lw2.b(this));
                    if (!z18) {
                        android.content.Context context = finderVideoLayout.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        pf5.z zVar2 = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        rc2.f fVar = (rc2.f) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(rc2.f.class);
                        if (fVar != null) {
                            fVar.Y6(finderFullSeekBarLayout, 8);
                        }
                        finderFeedNewSeekBarLayout.setVisibility(0);
                    } else if (finderFullSeekBarLayout != null) {
                        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.v(finderFullSeekBarLayout, false, 0L, false, 6, null);
                    }
                }
            } else {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e29 = e();
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout2 = e29 != null ? (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) e29.findViewById(com.tencent.mm.R.id.ghd) : null;
        if (finderFullSeekBarLayout2 != null) {
            finderFullSeekBarLayout2.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e37 = e();
        android.view.View findViewById4 = e37 != null ? e37.findViewById(com.tencent.mm.R.id.g1y) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e38 = e();
        android.view.View findViewById5 = e38 != null ? e38.findViewById(com.tencent.mm.R.id.kp7) : null;
        if (findViewById5 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e39 = e();
        android.view.View findViewById6 = e39 != null ? e39.findViewById(com.tencent.mm.R.id.hih) : null;
        if (findViewById6 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e47 = e();
        android.view.View findViewById7 = e47 != null ? e47.findViewById(com.tencent.mm.R.id.egi) : null;
        if (findViewById7 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e48 = e();
            android.view.View findViewById8 = e48 != null ? e48.findViewById(com.tencent.mm.R.id.edq) : null;
            if (findViewById8 == null) {
                return;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            android.view.View view = findViewById8;
            yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final android.view.View b() {
        androidx.appcompat.app.AppCompatActivity activity = c();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = (com.tencent.mm.plugin.finder.viewmodel.component.bl) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        android.view.View findViewById = blVar.f133892e != null ? blVar.findViewById(com.tencent.mm.R.id.e5c) : null;
        return findViewById != null ? findViewById : c().findViewById(com.tencent.mm.R.id.ggn);
    }

    public final androidx.appcompat.app.AppCompatActivity c() {
        return (androidx.appcompat.app.AppCompatActivity) ((jz5.n) this.f321579d).getValue();
    }

    public final r45.qt2 d() {
        return (r45.qt2) ((jz5.n) this.f321582g).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e() {
        return (com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout) ((jz5.n) this.f321580e).getValue();
    }

    public final com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f() {
        return (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) ((jz5.n) this.f321583h).getValue();
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("FinderVideoScaleCleanUIC", "onScrollIdle");
        this.f321585j = true;
        lw2.o oVar = this.f321577b;
        if (oVar != null) {
            oVar.f();
        }
        lw2.o oVar2 = this.f321577b;
        if (oVar2 != null) {
            oVar2.f321596f = this.f321585j && this.f321586k;
        }
    }

    public final void h(int i17, boolean z17) {
        int i18;
        java.lang.String str;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        this.f321578c = false;
        lw2.o oVar = this.f321577b;
        long currentTimeMillis = oVar != null ? oVar.R : java.lang.System.currentTimeMillis();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        lw2.o oVar2 = this.f321577b;
        long elapsedRealtime2 = elapsedRealtime - (oVar2 != null ? oVar2.S : android.os.SystemClock.elapsedRealtime());
        android.content.Context context = this.f321576a.getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI != null && (swipeBackLayout = mMFinderUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(true);
        }
        lw2.o oVar3 = this.f321577b;
        if (oVar3 != null) {
            oVar3.S = 0L;
            oVar3.R = 0L;
            oVar3.f321595e = false;
            oVar3.E = false;
            oVar3.D = false;
            oVar3.f321613w = 0.0f;
            oVar3.f321614x = 0.0f;
            oVar3.f321615y = 0.0f;
            oVar3.f321616z = 0.0f;
            oVar3.B = 1.0f;
            oVar3.f321611u = 0.0f;
            oVar3.f321610t = new android.graphics.PointF();
            oVar3.f321607q = new android.graphics.PointF();
            oVar3.f321608r = 0;
            oVar3.f321609s = new android.graphics.PointF();
            oVar3.b();
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f321584i).getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i18 = 8;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomToInitState", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomToInitState", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(lw2.j.f321573d);
        } else {
            i18 = 8;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = e();
            if (e17 != null) {
                hc2.f1.x(e17);
            }
            float f17 = (float) elapsedRealtime2;
            java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[i18];
            com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f321581f;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(feedData != null ? feedData.getFeedId() : 0L));
            r45.qt2 d17 = d();
            lVarArr[1] = new jz5.l("finder_context_id", d17 != null ? d17.getString(1) : null);
            r45.qt2 d18 = d();
            lVarArr[2] = new jz5.l("finder_tab_context_id", d18 != null ? d18.getString(2) : null);
            r45.qt2 d19 = d();
            lVarArr[3] = new jz5.l("comment_scene", d19 != null ? java.lang.Integer.valueOf(d19.getInteger(5)) : null);
            com.tencent.mm.plugin.finder.storage.FeedData feedData2 = this.f321581f;
            if (feedData2 == null || (str = feedData2.getSessionBuffer()) == null) {
                str = "";
            }
            lVarArr[4] = new jz5.l("session_buffer", str);
            lVarArr[5] = new jz5.l("finger_expand_duration_ms", java.lang.Float.valueOf(f17));
            lVarArr[6] = new jz5.l("finger_expand_exit_type", java.lang.Integer.valueOf(i17));
            lVarArr[7] = new jz5.l("finder_2finger_sid", valueOf);
            ((cy1.a) rVar).yj("finder_2finger_expand_exit", null, kz5.c1.k(lVarArr), 1, true);
        }
    }

    public final void i() {
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout;
        android.view.View findViewById;
        com.tencent.mars.xlog.Log.i("FinderVideoScaleCleanUIC", "resetScreen");
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = e();
        android.view.View findViewById2 = e17 != null ? e17.findViewById(com.tencent.mm.R.id.eg6) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View b17 = b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e18 = e();
        android.view.View findViewById3 = e18 != null ? e18.findViewById(com.tencent.mm.R.id.h6o) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = c();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
            kotlin.jvm.internal.o.g(fragment, "fragment");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) ((com.tencent.mm.plugin.finder.viewmodel.component.d1) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).f134058e).getValue();
            if (viewGroup != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(viewGroup, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup O6 = ((com.tencent.mm.plugin.finder.viewmodel.component.d1) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).O6();
            if (O6 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e19 = e();
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = e19 != null ? (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) e19.findViewById(com.tencent.mm.R.id.ghd) : null;
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e27 = e();
        if (e27 != null && (findViewById = e27.findViewById(com.tencent.mm.R.id.f484486ee3)) != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e28 = e();
        android.view.View findViewById4 = e28 != null ? e28.findViewById(com.tencent.mm.R.id.g1y) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e29 = e();
        android.view.View findViewById5 = e29 != null ? e29.findViewById(com.tencent.mm.R.id.kp7) : null;
        if (findViewById5 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e37 = e();
        android.view.View findViewById6 = e37 != null ? e37.findViewById(com.tencent.mm.R.id.hih) : null;
        if (findViewById6 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e38 = e();
        android.view.View findViewById7 = e38 != null ? e38.findViewById(com.tencent.mm.R.id.egi) : null;
        if (findViewById7 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e39 = e();
        android.view.View findViewById8 = e39 != null ? e39.findViewById(com.tencent.mm.R.id.edq) : null;
        if (findViewById8 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(findViewById8, arrayList11.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e47 = e();
        if (e47 == null || (finderFeedNewSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout) e47.findViewById(com.tencent.mm.R.id.f484896qk3)) == null) {
            return;
        }
        android.content.Context context = finderFeedNewSeekBarLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rc2.f fVar = (rc2.f) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(rc2.f.class);
        if (fVar != null) {
            fVar.Y6(finderFullSeekBarLayout, 0);
        }
        finderFeedNewSeekBarLayout.setVisibility(0);
        finderFeedNewSeekBarLayout.setInScaleModeCallback(null);
    }
}
