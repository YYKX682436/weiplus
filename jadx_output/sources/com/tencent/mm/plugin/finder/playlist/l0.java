package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public class l0 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {
    public android.widget.Button A;
    public android.widget.Button B;
    public android.view.View C;
    public android.content.Context D;
    public v92.g E;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.s1 f122338d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122339e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f122340f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f122341g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f122342h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f122343i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f122344m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f122345n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f122346o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f122347p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f122348q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f122349r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f122350s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f122351t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f122352u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f122353v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f122354w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f122355x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f122356y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f122357z;

    public l0(com.tencent.mm.plugin.finder.playlist.s1 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f122338d = presenter;
    }

    public static final r45.ev2 g(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        java.lang.String authIconUrl;
        l0Var.getClass();
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = l0Var.f122338d;
        ya2.b2 b17 = gVar.b(s1Var.h().f122287g);
        int i17 = 0;
        nr2.m mVar = s1Var.h().f122286f;
        if (mVar != null) {
            r45.ev2 ev2Var = new r45.ev2();
            ev2Var.set(0, java.lang.Long.valueOf(mVar.l()));
            ev2Var.set(1, mVar.k());
            ev2Var.set(2, mVar.e());
            ev2Var.set(3, mVar.c());
            ev2Var.set(4, java.lang.Integer.valueOf(mVar.f()));
            ev2Var.set(6, java.lang.Integer.valueOf(mVar.n()));
            ev2Var.set(7, java.lang.Integer.valueOf(mVar.i()));
            ev2Var.set(8, mVar.o());
            ev2Var.set(13, 345);
            return ev2Var;
        }
        r45.vx0 vx0Var = s1Var.h().f122285e;
        if (vx0Var == null) {
            return null;
        }
        r45.ev2 ev2Var2 = new r45.ev2();
        ev2Var2.set(0, java.lang.Long.valueOf(vx0Var.getLong(0)));
        ev2Var2.set(1, vx0Var.getString(1));
        ev2Var2.set(2, vx0Var.getString(2));
        ev2Var2.set(3, vx0Var.getString(3));
        ev2Var2.set(4, java.lang.Integer.valueOf(vx0Var.getInteger(4)));
        ev2Var2.set(5, java.lang.Integer.valueOf(vx0Var.getInteger(21)));
        ev2Var2.set(8, s1Var.h().f122287g);
        ev2Var2.set(9, b17 != null ? b17.w0() : null);
        java.lang.String str = "";
        ev2Var2.set(10, b17 != null ? b17.getAvatarUrl() : "");
        if (b17 != null && (finderAuthInfo2 = b17.field_authInfo) != null && (authIconUrl = finderAuthInfo2.getAuthIconUrl()) != null) {
            str = authIconUrl;
        }
        ev2Var2.set(11, str);
        if (b17 != null && (finderAuthInfo = b17.field_authInfo) != null) {
            i17 = finderAuthInfo.getAuthIconType();
        }
        ev2Var2.set(12, java.lang.Integer.valueOf(i17));
        ev2Var2.set(13, java.lang.Integer.valueOf(yc1.p.CTRL_INDEX));
        return ev2Var2;
    }

    public static final boolean h(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        if (!l0Var.q().getInitParam().f122290j) {
            return false;
        }
        android.content.Context l17 = l0Var.l();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(l17);
        e4Var.d(com.tencent.mm.R.string.p3t);
        e4Var.c();
        return true;
    }

    public static /* synthetic */ java.util.Map s(com.tencent.mm.plugin.finder.playlist.l0 l0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReportSdkFeedInfo");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        return l0Var.r(str);
    }

    public static /* synthetic */ void y(com.tencent.mm.plugin.finder.playlist.l0 l0Var, java.lang.String str, boolean z17, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportViewEvent");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        l0Var.x(str, z17, str2);
    }

    public final void A() {
        o().setVisibility(0);
        android.view.View view = this.f122351t;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = t();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void B(yz5.a onClick) {
        kotlin.jvm.internal.o.g(onClick, "onClick");
        o().setVisibility(0);
        android.view.View view = this.f122351t;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = t();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t().setOnClickListener(new com.tencent.mm.plugin.finder.playlist.j0(onClick));
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        float f18 = f17 * 2.5f;
        float f19 = f18 < 0.0f ? 0.0f : f18;
        if (f19 > 1.0f) {
            f19 = 1.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        float f27 = 0.0f < f18 ? f18 : 0.0f;
        int b17 = i65.a.b(l(), 16);
        int b18 = i65.a.b(l(), 4);
        android.view.View view = this.f122347p;
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (b18 + (f27 * (b17 - b18)));
        view.setLayoutParams(layoutParams);
        android.view.View view2 = this.f122348q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("headerArrow");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onDrawerTranslation", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.E = null;
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122338d;
        s1Var.l();
        kotlinx.coroutines.z0.d(s1Var.f122427g, s1Var + " onDetach", null, 2, null);
        q().t(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x072d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x067d  */
    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r40, boolean r41, int r42) {
        /*
            Method dump skipped, instructions count: 2387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.l0.c(boolean, boolean, int):void");
    }

    public final void k(boolean z17) {
        if (!z17) {
            u().setEnableRefresh(false);
            return;
        }
        u().setEnableRefresh(true);
        if (u().getRefreshHeader() == null) {
            com.tencent.mm.view.RefreshLoadMoreLayout u17 = u();
            android.view.View inflate = com.tencent.mm.ui.id.b(l()).inflate(com.tencent.mm.R.layout.f489059b51, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            u17.setRefreshHeaderView(inflate);
        }
    }

    public final android.content.Context l() {
        android.content.Context context = this.D;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public final android.view.View n() {
        android.view.View view = this.f122356y;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("headerDescContainer");
        throw null;
    }

    public final android.widget.FrameLayout o() {
        android.widget.FrameLayout frameLayout = this.f122350s;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View p() {
        android.view.View view = this.f122352u;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer q() {
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122339e;
        if (finderPlayListDrawer != null) {
            return finderPlayListDrawer;
        }
        kotlin.jvm.internal.o.o("playListDrawer");
        throw null;
    }

    public final java.util.Map r(java.lang.String str) {
        android.content.Context l17 = l();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = l17 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) l17).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null) {
            return null;
        }
        r45.qt2 V6 = nyVar.V6();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122338d;
        linkedHashMap.put("source_feedid", pm0.v.u(s1Var.h().f122281a));
        linkedHashMap.put("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(s1Var.h().f122281a, s1Var.h().f122282b, V6.getInteger(5)));
        linkedHashMap.put("finder_tab_context_id", V6.getString(2));
        linkedHashMap.put("finder_context_id", V6.getString(1));
        linkedHashMap.put("ref_commentscene", java.lang.Integer.valueOf(V6.getInteger(5)));
        if (str != null) {
            linkedHashMap.put("avatar_finder_username", str);
        }
        if (w()) {
            linkedHashMap.put("comment_scene", 345);
            nr2.m mVar = s1Var.h().f122286f;
            linkedHashMap.put("collection_id", pm0.v.u(mVar != null ? mVar.l() : 0L));
            nr2.m mVar2 = s1Var.h().f122286f;
            linkedHashMap.put("collection_feed_num", java.lang.Integer.valueOf(mVar2 != null ? mVar2.f() : 0));
            linkedHashMap.put("author_finder_username", s1Var.h().f122287g);
            linkedHashMap.put("is_intelligent_collection", 0);
        } else {
            linkedHashMap.put("comment_scene", java.lang.Integer.valueOf(yc1.p.CTRL_INDEX));
            r45.vx0 vx0Var = s1Var.h().f122285e;
            linkedHashMap.put("collection_id", pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L));
            r45.vx0 vx0Var2 = s1Var.h().f122285e;
            linkedHashMap.put("collection_feed_num", java.lang.Integer.valueOf(vx0Var2 != null ? vx0Var2.getInteger(4) : 0));
            linkedHashMap.put("author_finder_username", s1Var.h().f122287g);
            linkedHashMap.put("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(s1Var.h().f122285e) ? 1 : 0));
        }
        return linkedHashMap;
    }

    public final android.view.View t() {
        android.view.View view = this.f122353v;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout u() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f122354w;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void v() {
        o().setVisibility(8);
        t().setOnClickListener(null);
    }

    public final boolean w() {
        return this.f122338d.h().f122286f != null;
    }

    public final void x(java.lang.String str, boolean z17, java.lang.String str2) {
        java.util.Map r17 = r(str2);
        if (r17 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj(str, z17 ? "view_clk" : "view_exp", r17, 1, false);
        }
    }

    public final void z() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        o().setVisibility(0);
        android.view.View view = this.f122351t;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = t();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
