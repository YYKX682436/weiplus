package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public class a2 implements cn5.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.d f130167d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f130168e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f130169f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f130170g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f130171h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f130172i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f130173m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130174n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer f130175o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f130176p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f130177q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f130178r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f130179s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f130180t;

    /* renamed from: u, reason: collision with root package name */
    public android.content.Context f130181u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f130182v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.l f130183w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.a f130184x;

    public a2(com.tencent.mm.plugin.finder.uniComments.d presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f130167d = presenter;
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        y2Var.e(1, 10);
        y2Var.e(2, 10);
        this.f130168e = y2Var;
        androidx.recyclerview.widget.y2 y2Var2 = new androidx.recyclerview.widget.y2();
        y2Var2.e(1, 10);
        y2Var2.e(2, 10);
        this.f130169f = y2Var2;
        this.f130183w = new com.tencent.mm.plugin.finder.uniComments.y1(this);
        this.f130184x = new com.tencent.mm.plugin.finder.uniComments.s1(this);
    }

    @Override // cn5.k
    public void a(float f17) {
    }

    @Override // cn5.k
    public void b() {
        ((com.tencent.mm.plugin.finder.uniComments.o0) this.f130167d).j();
        e().f213559s.remove(this);
    }

    @Override // cn5.k
    public void c(boolean z17, boolean z18, int i17) {
        boolean z19;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((com.tencent.mm.plugin.finder.uniComments.o0) this.f130167d).j();
            return;
        }
        if (e().getShowFooter()) {
            f().setVisibility(0);
            android.view.View findViewById = g().findViewById(com.tencent.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            f().setVisibility(8);
            if (e().getCloseComment()) {
                android.view.View findViewById2 = g().findViewById(com.tencent.mm.R.id.eal);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View i18 = i();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(i18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(i18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View j17 = j();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(j17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup viewGroup = this.f130170g;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                h().setVisibility(0);
            } else {
                android.view.View findViewById3 = g().findViewById(com.tencent.mm.R.id.eal);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.tencent.mm.plugin.finder.uniComments.d dVar = this.f130167d;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer e17 = e();
        iv2.a feedObj = e().getFeedObj();
        kotlin.jvm.internal.o.d(feedObj);
        com.tencent.mm.plugin.finder.uniComments.c onCloseDrawerCallback = e().getOnCloseDrawerCallback();
        int i19 = e().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        boolean z27 = e().isSingleMode;
        long refCommentId = e().getRefCommentId();
        jv2.a replyCommentObj = e().getReplyCommentObj();
        boolean useCache = e().getUseCache();
        boolean blinkRefComment = e().getBlinkRefComment();
        e().getCloseComment();
        e().getOldVersion();
        boolean z28 = e().isOnlyShowDesc;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = (com.tencent.mm.plugin.finder.uniComments.o0) dVar;
        o0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onAttach: userName=" + feedObj.f295119b + ", statusId=" + feedObj.f295118a);
        o0Var.f130341z = false;
        java.lang.System.currentTimeMillis();
        o0Var.f130330o = this;
        o0Var.C = e17;
        o0Var.f130328m = feedObj;
        o0Var.f130336u = z27;
        o0Var.f130329n = i19;
        o0Var.f130332q = onCloseDrawerCallback;
        o0Var.f130338w = refCommentId;
        o0Var.f130337v = useCache;
        o0Var.f130339x = blinkRefComment;
        fp0.t tVar = new fp0.t("TextStatusCommentExecutor");
        o0Var.A = tVar;
        tVar.e();
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = o0Var.f130326h;
        android.content.Context context = o0Var.f130322d;
        int i27 = ((com.tencent.mm.plugin.finder.uniComments.o0) this.f130167d).f130329n;
        o1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList6 = o1Var.f130342a;
        if (arrayList6.size() > 0) {
            arrayList6.clear();
        }
        boolean z29 = refCommentId != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", "miss cache, upContinue:" + z29 + ", downContinue:true");
        o0Var.f130333r = null;
        o0Var.m(z29);
        o0Var.l(true);
        o0Var.B = true;
        if (o0Var.f130334s) {
            d(true);
        } else {
            d(false);
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var3 = o0Var.f130330o;
            if (a2Var3 != null) {
                a2Var3.e().f213551h.setCanCloseDrawerWhenStop(true);
            }
        }
        f().setFooterMode(0);
        if (refCommentId == 0) {
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var4 = o0Var.f130330o;
            if (a2Var4 != null) {
                a2Var4.f().h(hc2.t.b(o0Var.f130322d, o0Var.f130329n), feedObj.f295122e, null);
            }
        } else {
            java.util.Iterator it = o0Var.f130326h.f130342a.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i28 = -1;
                    break;
                } else {
                    if (((jv2.d) it.next()).getItemId() == refCommentId) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            int i29 = i28;
            if (i29 >= 0) {
                jv2.d dVar2 = (jv2.d) o0Var.f130326h.f130342a.get(i29);
                dVar2.f302212i = true;
                com.tencent.mm.plugin.finder.uniComments.a2 a2Var5 = o0Var.f130330o;
                if (a2Var5 != null) {
                    com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f17 = a2Var5.f();
                    java.lang.String b17 = hc2.t.b(o0Var.f130322d, o0Var.f130329n);
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    f17.g(b17, c61.yb.md((c61.yb) c17, dVar2.f302207d.D0(), dVar2.f302207d.y0(), false, 4, null), dVar2.f302207d);
                }
            }
        }
        if (z28) {
            z19 = false;
            k().setEnableLoadMore(false);
            k().setEnableRefresh(false);
        } else {
            z19 = false;
            k().setEnableLoadMore(true);
            k().setEnableRefresh(true);
        }
        k().getRecyclerView().setLayoutFrozen(z19);
        o0Var.f130331p = new com.tencent.mm.plugin.finder.uniComments.g(o0Var, k().getRecyclerView());
        o0Var.E.alive();
        try {
            androidx.recyclerview.widget.f2 adapter = k().getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(o0Var.G);
            }
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", e18, "", new java.lang.Object[0]);
        }
        k().setActionCallback(new com.tencent.mm.plugin.finder.uniComments.c0(o0Var));
        f().setModeChangeCallback(o0Var);
        f().getEditText().feedId = feedObj.f295123f;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f18 = f();
        java.lang.String feedUserName = feedObj.f295119b;
        kotlin.jvm.internal.o.g(feedUserName, "feedUserName");
        f18.mFeedUserName = feedUserName;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText = f().getEditText();
        if (editText != null) {
            iu2.a aVar = iu2.a.f294983a;
            java.lang.String key = feedObj.f295118a;
            kotlin.jvm.internal.o.g(key, "key");
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", "getDraft() called with: key = ".concat(key));
            java.lang.String str = (java.lang.String) iu2.a.f294984b.get(key);
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.getText().length());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    f().setUseDraft(true);
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).ij(editText.getContext(), 19L, "", feedObj.f295119b);
                }
            }
        }
        android.widget.TextView textView = this.f130171h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var6 = o0Var.f130330o;
        if (a2Var6 != null) {
            android.content.Context context2 = a2Var6.f130181u;
            if (context2 == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            resources = context2.getResources();
        } else {
            resources = null;
        }
        textView.setText(resources != null ? resources.getString(com.tencent.mm.R.string.jus) : null);
        android.widget.TextView textView2 = this.f130172i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerSubTitleTv");
            throw null;
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var7 = o0Var.f130330o;
        if (a2Var7 != null) {
            android.content.Context context3 = a2Var7.f130181u;
            if (context3 == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            resources2 = context3.getResources();
        } else {
            resources2 = null;
        }
        textView2.setText(resources2 != null ? resources2.getString(com.tencent.mm.R.string.jur) : null);
        f().getReplyBtn().setOnClickListener(new com.tencent.mm.plugin.finder.uniComments.d0(o0Var, this, feedObj));
        if (replyCommentObj != null) {
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f19 = f();
            java.lang.String b18 = hc2.t.b(o0Var.f130322d, o0Var.f130329n);
            i95.m c18 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            f19.g(b18, c61.yb.md((c61.yb) c18, replyCommentObj.D0(), replyCommentObj.y0(), false, 4, null), replyCommentObj);
        }
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var8 = o0Var.f130330o;
        if ((a2Var8 != null ? a2Var8.f().getAvatarView() : null) != null && i19 == 2) {
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var9 = o0Var.f130330o;
            ng5.a.a(a2Var9 != null ? a2Var9.f().getAvatarView() : null, c01.z1.r());
        }
        if (z28) {
            g().setVisibility(0);
            k().setVisibility(0);
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var10 = o0Var.f130330o;
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f27 = a2Var10 != null ? a2Var10.f() : null;
            if (f27 != null) {
                f27.setVisibility(8);
            }
            e().setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
        } else if (z27) {
            e().setSquaresBackgroundResource(com.tencent.mm.R.color.a9e);
            e().setBackgroundColorRes(com.tencent.mm.R.color.a9e);
            g().setVisibility(8);
            k().setVisibility(8);
            com.tencent.mm.plugin.finder.view.FinderCommentEditText g17 = o0Var.g();
            if (g17 != null) {
                g17.requestFocus();
            }
            if (!o0Var.f130340y && (a2Var = o0Var.f130330o) != null) {
                a2Var.f().m(true);
            }
        } else {
            o0Var.k(true);
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var11 = o0Var.f130330o;
            if (a2Var11 != null) {
                a2Var11.l();
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() == 1) {
                e().setBackgroundColorRes(com.tencent.mm.R.color.a9e);
            } else {
                e().setBackgroundColorRes(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            }
            e().setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
            k().setVisibility(0);
            g().setVisibility(0);
        }
        if (o0Var.f130335t || (a2Var2 = o0Var.f130330o) == null) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(a2Var2.k(), null, 1, null);
    }

    public final void d(boolean z17) {
        if (e().isOnlyShowDesc) {
            k().setEnableRefresh(false);
            return;
        }
        if (!z17) {
            k().setEnableRefresh(false);
            return;
        }
        k().setEnableRefresh(true);
        if (k().getRefreshHeader() == null) {
            com.tencent.mm.view.RefreshLoadMoreLayout k17 = k();
            android.content.Context context = this.f130181u;
            if (context == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489569d05, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            k17.setRefreshHeaderView(inflate);
        }
    }

    public final com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer e() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = this.f130175o;
        if (textStatusCommentDrawer != null) {
            return textStatusCommentDrawer;
        }
        kotlin.jvm.internal.o.o("commentDrawer");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f() {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130174n;
        if (textStatusCommentFooter != null) {
            return textStatusCommentFooter;
        }
        kotlin.jvm.internal.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout g() {
        android.widget.FrameLayout frameLayout = this.f130176p;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("headerLayout");
        throw null;
    }

    public final android.widget.FrameLayout h() {
        android.widget.FrameLayout frameLayout = this.f130177q;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View i() {
        android.view.View view = this.f130179s;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final android.view.View j() {
        android.view.View view = this.f130180t;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout k() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f130173m;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void l() {
        h().setVisibility(0);
        android.view.View view = this.f130178r;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View i17 = i();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(i17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(i17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View j17 = j();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(j17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
