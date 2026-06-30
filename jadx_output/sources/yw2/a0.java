package yw2;

/* loaded from: classes10.dex */
public class a0 implements com.tencent.mm.plugin.finder.view.g5, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {
    public android.view.View A;
    public com.tencent.mm.plugin.finder.view.rm B;
    public ux2.f C;
    public com.tencent.mm.plugin.finder.view.FinderJumpAnchorView D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f466608d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f466609e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f466610f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f466611g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f466612h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f466613i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f466614m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f466615n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCommentFooter f466616o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCommentDrawer f466617p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f466618q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f466619r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f466620s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f466621t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f466622u;

    /* renamed from: v, reason: collision with root package name */
    public android.content.Context f466623v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f466624w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f466625x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f466626y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f466627z;

    public a0(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f466608d = presenter;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        if (k().isSingleMode && n().getFooterMode() == 2) {
            ((com.tencent.mm.ui.MMFragmentActivity) l()).hideVKB();
        }
        float b17 = f17 / (i65.a.b(l(), 56) / (k().getHeight() - k().getTopOffset()));
        float f18 = (b17 - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (b17 > 1.0f) {
            b17 = 1.0f;
        }
        float f19 = 0.0f < b17 ? b17 : 0.0f;
        int b18 = i65.a.b(l(), 16);
        int b19 = i65.a.b(l(), 4);
        android.view.View view = this.f466626y;
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLine");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
        view.setLayoutParams(layoutParams);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f466627z;
        if (weImageView != null) {
            weImageView.setAlpha(f18);
        } else {
            kotlin.jvm.internal.o.o("headerArrow");
            throw null;
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f466608d.onDetach();
        k().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        if (!this.f466609e) {
            com.tencent.mars.xlog.Log.w("Finder.TimelineDrawerBuilder", "[onDrawerOpen] isOpen=" + z17 + " isBegin=" + z18 + " is nerver build before.");
            return;
        }
        if (z17 && z18) {
            v();
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f466608d;
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = k();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObj = k().getFeedObj();
            kotlin.jvm.internal.o.d(feedObj);
            nPresenter.q0(k17, this, feedObj, k().getOnCloseDrawerCallback(), k().getScene(), k().isSingleMode, k().getRefCommentId(), k().getReplyCommentObj(), k().getUseCache(), k().getBlinkRefComment(), k().getBlinkDuration(), k().getCloseComment(), k().getOldVersion(), k().isOnlyShowDesc, i17);
        } else if (!z17 && z18) {
            ux2.f fVar = this.C;
            if (fVar != null && fVar.f431856f) {
                pm0.v.C(fVar.f431864n);
                db5.d5 d5Var = fVar.f431863m;
                if (d5Var == null) {
                    kotlin.jvm.internal.o.o("bubble");
                    throw null;
                }
                d5Var.dismiss();
            }
            this.f466608d.onDetach();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.g5
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        this.f466618q = headerLayout;
        android.view.View inflate = z17 ? com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488664zu, headerLayout) : com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488663zt, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d4v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f466610f = (android.widget.TextView) findViewById;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.t5m);
        if (weImageView != null) {
            java.lang.Object tag = weImageView.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!kotlin.jvm.internal.o.b(tag, bool)) {
                weImageView.setTag(bool);
                weImageView.post(new d92.a(weImageView));
            }
        } else {
            weImageView = null;
        }
        this.f466611g = weImageView;
        this.f466612h = inflate.findViewById(com.tencent.mm.R.id.t5n);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ear);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f466624w = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.eap);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f466625x = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f485216gy1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f466626y = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.gxz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f466627z = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        this.f466613i = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f487335sb3);
        this.f466614m = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.vfq);
        android.widget.TextView textView = this.f466610f;
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
    }

    public final void h(boolean z17) {
        if (k().isOnlyShowDesc) {
            s().setEnableRefresh(false);
            return;
        }
        if (!z17) {
            s().setEnableRefresh(false);
            return;
        }
        s().setEnableRefresh(true);
        if (s().getRefreshHeader() == null) {
            int dimension = (int) l().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            com.tencent.mm.view.RefreshLoadMoreLayout s17 = s();
            android.view.View view = new android.view.View(l());
            view.setMinimumHeight(dimension);
            s17.setRefreshHeaderView(view);
        }
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentDrawer k() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f466617p;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer;
        }
        kotlin.jvm.internal.o.o("commentDrawer");
        throw null;
    }

    public final android.content.Context l() {
        android.content.Context context = this.f466623v;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentFooter n() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f466616o;
        if (finderCommentFooter != null) {
            return finderCommentFooter;
        }
        kotlin.jvm.internal.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout o() {
        android.widget.FrameLayout frameLayout = this.f466618q;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("headerLayout");
        throw null;
    }

    public final android.widget.FrameLayout p() {
        android.widget.FrameLayout frameLayout = this.f466619r;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.widget.TextView q() {
        android.widget.TextView textView = this.f466621t;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final android.view.View r() {
        android.view.View view = this.f466622u;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout s() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f466615n;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void t() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = this.D;
        if (finderJumpAnchorView != null) {
            finderJumpAnchorView.a(new yw2.p(finderJumpAnchorView));
        }
        this.D = null;
        this.E = false;
    }

    public final void u() {
        p().setVisibility(8);
        r().setOnClickListener(null);
    }

    public final void v() {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        boolean z17 = false;
        if (k().getShowFooter()) {
            n().setVisibility(0);
            android.view.View findViewById = o().findViewById(com.tencent.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.storage.FinderItem feedObj = k().getFeedObj();
            java.lang.Long valueOf = (feedObj == null || (feedObject = feedObj.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null) ? null : java.lang.Long.valueOf(object_extend.getLong(30));
            if (valueOf != null && (valueOf.longValue() & 262144) == 0) {
                z17 = true;
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127681ee).getValue()).r()).booleanValue();
            com.tencent.mars.xlog.Log.i("Finder.TimelineDrawerBuilder", "refreshCommentOpen permissionAllowRecentImageBubble=" + z17 + ", xExptAllowRecentImageBubble=" + booleanValue);
            if (z17 && booleanValue) {
                pm0.v.V(600L, new yw2.w(this));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.TimelineDrawerBuilder", "CommentInvisibleDebug commentDrawer.showFooter=" + k().getShowFooter() + " drawerFooter.visibility = View.GONE");
        n().setVisibility(8);
        if (!k().getCloseComment()) {
            android.view.View findViewById2 = o().findViewById(com.tencent.mm.R.id.eal);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "refreshCommentOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = o().findViewById(com.tencent.mm.R.id.eal);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(r17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p().setVisibility(0);
    }

    public final void w() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        p().setVisibility(0);
        android.view.View view = this.f466620s;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        if (r2.isChosenComment() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.a0.x():void");
    }
}
