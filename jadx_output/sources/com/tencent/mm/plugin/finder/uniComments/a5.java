package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public class a5 implements com.tencent.mm.plugin.finder.uniComments.d2, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.g2 f130188d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f130189e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f130190f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130191g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer f130192h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f130193i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f130194m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f130195n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f130196o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f130197p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f130198q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f130199r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.a f130200s;

    public a5(com.tencent.mm.plugin.finder.uniComments.g2 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f130188d = presenter;
        this.f130200s = new com.tencent.mm.plugin.finder.uniComments.u4(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        if (h().isSingleMode && l().getFooterMode() == 2) {
            com.tencent.mm.ui.ga.L((android.app.Activity) k());
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        ((com.tencent.mm.plugin.finder.uniComments.q3) this.f130188d).onDetach();
        h().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        int i18;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var2;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((com.tencent.mm.plugin.finder.uniComments.q3) this.f130188d).onDetach();
            return;
        }
        if (h().getShowFooter()) {
            l().setVisibility(0);
            android.view.View findViewById = n().findViewById(com.tencent.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            l().setVisibility(8);
            if (h().getCloseComment()) {
                android.view.View findViewById2 = n().findViewById(com.tencent.mm.R.id.eal);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                q().setVisibility(8);
                android.view.View r17 = r();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(r17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p().setVisibility(0);
            } else {
                android.view.View findViewById3 = n().findViewById(com.tencent.mm.R.id.eal);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.tencent.mm.plugin.finder.uniComments.g2 g2Var = this.f130188d;
        com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer h17 = h();
        iv2.b feedObj = h().getFeedObj();
        kotlin.jvm.internal.o.d(feedObj);
        h().getOnCloseDrawerCallback();
        int i19 = h().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        boolean z19 = h().isSingleMode;
        long refCommentId = h().getRefCommentId();
        jv2.c replyCommentObj = h().getReplyCommentObj();
        boolean useCache = h().getUseCache();
        boolean blinkRefComment = h().getBlinkRefComment();
        boolean closeComment = h().getCloseComment();
        h().getOldVersion();
        boolean z27 = h().isOnlyShowDesc;
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = (com.tencent.mm.plugin.finder.uniComments.q3) g2Var;
        q3Var.getClass();
        q3Var.f130383w = false;
        java.lang.System.currentTimeMillis();
        q3Var.f130373m = this;
        q3Var.A = h17;
        q3Var.f130371h = feedObj;
        q3Var.f130378r = z19;
        q3Var.f130372i = i19;
        q3Var.f130380t = refCommentId;
        q3Var.f130379s = useCache;
        q3Var.f130381u = blinkRefComment;
        fp0.t tVar = new fp0.t("UniCommentExecutor");
        q3Var.f130384x = tVar;
        tVar.e();
        com.tencent.mm.plugin.finder.uniComments.p4 p4Var = q3Var.f130369f;
        android.content.Context context = q3Var.f130367d;
        int i27 = ((com.tencent.mm.plugin.finder.uniComments.q3) this.f130188d).f130372i;
        p4Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList5 = p4Var.f130360a;
        if (arrayList5.size() > 0) {
            arrayList5.clear();
        }
        boolean z28 = refCommentId != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderCommentLoader", "miss cache, upContinue:" + z28 + ", downContinue:true");
        q3Var.f130375o = null;
        q3Var.B(z28);
        q3Var.A(true);
        q3Var.f130385y = true;
        q3Var.f130386z = closeComment;
        q3Var.B = z27;
        if (!q3Var.f130376p || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            i18 = 0;
            g(false);
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = q3Var.f130373m;
            if (a5Var3 != null) {
                a5Var3.h().l(true);
            }
        } else {
            g(true);
            i18 = 0;
        }
        l().setFooterMode(i18);
        if (refCommentId == 0) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var4 = q3Var.f130373m;
            if (a5Var4 != null) {
                a5Var4.l().h(hc2.t.b(q3Var.f130367d, q3Var.f130372i), feedObj.f295128d, null);
            }
        } else {
            java.util.Iterator it = q3Var.f130369f.f130360a.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i28 = -1;
                    break;
                } else {
                    if (((jv2.i) it.next()).getItemId() == refCommentId) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            int i29 = i28;
            if (i29 >= 0) {
                jv2.i iVar = (jv2.i) q3Var.f130369f.f130360a.get(i29);
                iVar.f302227h = true;
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var5 = q3Var.f130373m;
                if (a5Var5 != null) {
                    com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l17 = a5Var5.l();
                    java.lang.String b17 = hc2.t.b(q3Var.f130367d, q3Var.f130372i);
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    l17.g(b17, c61.yb.md((c61.yb) c17, iVar.f302223d.L0(), iVar.f302223d.D0(), false, 4, null), iVar.f302223d);
                }
            }
        }
        if (z27) {
            s().setEnableLoadMore(false);
            s().setEnableRefresh(false);
        } else {
            s().setEnableLoadMore(!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode());
            s().setEnableRefresh(!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode());
        }
        s().getRecyclerView().setLayoutFrozen(false);
        q3Var.f130374n = new com.tencent.mm.plugin.finder.uniComments.j2(q3Var, s().getRecyclerView());
        q3Var.C.alive();
        try {
            androidx.recyclerview.widget.f2 adapter = s().getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(q3Var.E);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicUni.DrawerPresenter", e17, "", new java.lang.Object[0]);
        }
        s().setActionCallback(new com.tencent.mm.plugin.finder.uniComments.f3(q3Var));
        l().setModeChangeCallback(q3Var);
        l().getEditText().feedId = feedObj.f295130f;
        if (z27) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var6 = q3Var.f130373m;
            android.widget.TextView o17 = a5Var6 != null ? a5Var6.o() : null;
            if (o17 != null) {
                android.content.res.Resources q17 = q3Var.q();
                o17.setText(q17 != null ? q17.getString(com.tencent.mm.R.string.cyd) : null);
            }
        } else if (q3Var.i() <= 0) {
            o().setText(k().getResources().getString(com.tencent.mm.R.string.cox));
        } else {
            o().setText(k().getResources().getString(com.tencent.mm.R.string.cpc, com.tencent.mm.plugin.finder.assist.w2.g(q3Var.f130372i, q3Var.i())));
        }
        l().getReplyBtn().setOnClickListener(new com.tencent.mm.plugin.finder.uniComments.g3(q3Var, this));
        if (replyCommentObj != null) {
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l18 = l();
            java.lang.String b18 = hc2.t.b(q3Var.f130367d, q3Var.f130372i);
            i95.m c18 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            l18.g(b18, c61.yb.md((c61.yb) c18, replyCommentObj.L0(), replyCommentObj.D0(), false, 4, null), replyCommentObj);
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var7 = q3Var.f130373m;
        if ((a5Var7 != null ? a5Var7.l().getAvatarView() : null) != null) {
            if (i19 == 2) {
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var8 = q3Var.f130373m;
                ng5.a.a(a5Var8 != null ? a5Var8.l().getAvatarView() : null, c01.z1.r());
            } else {
                ya2.b2 b19 = ya2.h.f460484a.b(xy2.c.e(q3Var.f130367d));
                java.lang.String avatarUrl = b19 != null ? b19.getAvatarUrl() : "";
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(avatarUrl, null, 2, null);
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var9 = q3Var.f130373m;
                android.widget.ImageView avatarView = a5Var9 != null ? a5Var9.l().getAvatarView() : null;
                kotlin.jvm.internal.o.d(avatarView);
                a17.c(nVar, avatarView, g1Var.h(mn2.f1.f329957h));
            }
        }
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var10 = q3Var.f130373m;
        if (a5Var10 != null) {
            a5Var10.p().setVisibility(8);
            a5Var10.r().setOnClickListener(null);
        }
        if (z27) {
            n().setVisibility(0);
            s().setVisibility(0);
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var11 = q3Var.f130373m;
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l19 = a5Var11 != null ? a5Var11.l() : null;
            if (l19 != null) {
                l19.setVisibility(8);
            }
            h().setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
        } else if (z19) {
            h().setSquaresBackgroundResource(com.tencent.mm.R.color.a9e);
            h().setBackgroundColorRes(com.tencent.mm.R.color.a9e);
            n().setVisibility(8);
            s().setVisibility(8);
            com.tencent.mm.plugin.finder.view.FinderCommentEditText p17 = q3Var.p();
            if (p17 != null) {
                p17.requestFocus();
            }
            if (!q3Var.f130382v && (a5Var = q3Var.f130373m) != null) {
                a5Var.l().m(true);
            }
        } else {
            q3Var.y(true);
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var12 = q3Var.f130373m;
            if (a5Var12 != null) {
                a5Var12.t();
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() == 1) {
                h().setBackgroundColorRes(com.tencent.mm.R.color.a9e);
            } else {
                h().setBackgroundColorRes(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
            }
            h().setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
            s().setVisibility(0);
            n().setVisibility(0);
            if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var13 = q3Var.f130373m;
                com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l27 = a5Var13 != null ? a5Var13.l() : null;
                if (l27 != null) {
                    l27.setVisibility(8);
                }
            }
        }
        if (q3Var.f130377q || (a5Var2 = q3Var.f130373m) == null) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(a5Var2.s(), null, 1, null);
    }

    public final void g(boolean z17) {
        if (h().isOnlyShowDesc) {
            s().setEnableRefresh(false);
            return;
        }
        if (!z17) {
            s().setEnableRefresh(false);
            return;
        }
        s().setEnableRefresh(true);
        if (s().getRefreshHeader() == null) {
            com.tencent.mm.view.RefreshLoadMoreLayout s17 = s();
            android.view.View inflate = com.tencent.mm.ui.id.b(k()).inflate(com.tencent.mm.R.layout.d2s, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            s17.setRefreshHeaderView(inflate);
        }
    }

    public final com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer h() {
        com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer = this.f130192h;
        if (uniCommentDrawer != null) {
            return uniCommentDrawer;
        }
        kotlin.jvm.internal.o.o("commentDrawer");
        throw null;
    }

    public final android.content.Context k() {
        android.content.Context context = this.f130198q;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l() {
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130191g;
        if (uniCommentFooter != null) {
            return uniCommentFooter;
        }
        kotlin.jvm.internal.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout n() {
        android.widget.FrameLayout frameLayout = this.f130193i;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("headerLayout");
        throw null;
    }

    public final android.widget.TextView o() {
        android.widget.TextView textView = this.f130189e;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("headerTitleTv");
        throw null;
    }

    public final android.widget.FrameLayout p() {
        android.widget.FrameLayout frameLayout = this.f130194m;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("loadingLayout");
        throw null;
    }

    public final android.widget.TextView q() {
        android.widget.TextView textView = this.f130196o;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("nothingView");
        throw null;
    }

    public final android.view.View r() {
        android.view.View view = this.f130197p;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout s() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f130190f;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void t() {
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        p().setVisibility(0);
        android.view.View view = this.f130195n;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
