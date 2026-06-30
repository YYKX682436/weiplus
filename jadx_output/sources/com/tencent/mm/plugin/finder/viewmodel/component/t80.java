package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t80 extends com.tencent.mm.ui.component.UIComponent implements ya2.x1, com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f135993m;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bt f135994d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ct f135995e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f135996f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135997g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f135998h;

    /* renamed from: i, reason: collision with root package name */
    public int f135999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f135996f = (ey2.t0) a17;
        this.f135997g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.s80(this));
        this.f135999i = -1;
    }

    public final void O6(android.content.Intent intent) {
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag;
        vo2.d player;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        if (getIsUserVisibleFocused()) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
            if (ctVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w());
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                long longExtra = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1L) : -1L;
                long longExtra2 = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1L) : -1L;
                boolean z17 = false;
                if (!(s0Var != null && s0Var.getItemViewType() == 4)) {
                    if (s0Var != null && s0Var.getItemViewType() == 2) {
                        z17 = true;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "[checkSeek] photo feedId=" + pm0.v.u(longExtra2) + " seekTime=" + longExtra);
                        if (longExtra <= 0 || (finderImgFeedMusicTag = (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) s0Var.p(com.tencent.mm.R.id.agy)) == null || (player = finderImgFeedMusicTag.getPlayer()) == null || (finderThumbPlayerProxy = ((vo2.c) player).f438559b) == null) {
                            return;
                        }
                        finderThumbPlayerProxy.f0(longExtra, true, 3);
                        return;
                    }
                    return;
                }
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                if (finderVideoLayout != null) {
                    float floatExtra = intent != null ? intent.getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f) : 1.0f;
                    com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "[checkSeek] video feedId=" + pm0.v.u(longExtra2) + " seekTime=" + longExtra + " speedRatio=" + floatExtra);
                    if (longExtra > 0) {
                        java.lang.Object obj = s0Var.f293125i;
                        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                        if (u1Var != null) {
                            ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6(u1Var.getItemId());
                            u1Var.f410632f = true;
                        }
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, longExtra, 3, floatExtra, false, null, 24, null);
                    }
                }
            }
        }
    }

    public final int P6() {
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = btVar instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) btVar : null;
        if (pzVar != null) {
            return pzVar.X0();
        }
        return 0;
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader Q6() {
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            return null;
        }
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = btVar instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) btVar : null;
        if (pzVar != null) {
            return pzVar.C;
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.feed.bt R6() {
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar != null) {
            return btVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    public final androidx.recyclerview.widget.RecyclerView S6() {
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
        if (ctVar == null) {
            return null;
        }
        if (ctVar != null) {
            return ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView();
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public final int T6() {
        return ((java.lang.Number) this.f135997g.getValue()).intValue();
    }

    public final cw2.f8 U6() {
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar != null) {
            return ((com.tencent.mm.plugin.finder.feed.pz) btVar).F;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    public final boolean V6() {
        return this.f135994d != null;
    }

    public final void W6(java.lang.String source) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) btVar;
        com.tencent.mars.xlog.Log.i(pzVar.U, source + " init header view tabType " + pzVar.f108762p);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || (finderHomeTabFragment = pzVar.f108756h) == null || (ctVar = pzVar.f108759m) == null || (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).R6(recyclerView, pzVar.f108774x1, pzVar);
    }

    public final void X6(boolean z17) {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
        if (ctVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = this.f135995e;
        if (ctVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager != null) {
            int i17 = !z17 ? 1 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        if (w17 <= -1) {
            com.tencent.mm.plugin.finder.feed.ct ctVar3 = this.f135995e;
            if (ctVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView().post(new com.tencent.mm.plugin.finder.viewmodel.component.m80(linearLayoutManager, z17));
        }
        if (z17) {
            com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
            if (btVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            so2.j5 W0 = ((com.tencent.mm.plugin.finder.feed.pz) btVar).W0();
            com.tencent.mm.plugin.finder.feed.ct ctVar4 = this.f135995e;
            if (ctVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.plugin.finder.feed.v00) ctVar4).getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, W0 != null ? W0.getItemId() : 0L, false, 2, null);
            } else {
                s0Var = null;
            }
            int maxPlayPercent = (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null) ? 0 : finderVideoLayout.getMaxPlayPercent();
            com.tencent.mm.plugin.finder.report.c3 c3Var = com.tencent.mm.plugin.finder.report.c3.f124978a;
            int T6 = T6();
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.tencent.mm.plugin.finder.report.z2 c17 = c3Var.c(T6);
            com.tencent.mars.xlog.Log.i("Finder.RefreshReporter", "tab_" + T6 + ",开始双击点击刷新（刷新次数：" + c17.f125486c + "）," + c3Var.b(W0) + '}');
            if (c17.f125486c == 0) {
                c17.a(T6);
            }
            com.tencent.mm.plugin.finder.report.c3.f124980c = new com.tencent.mm.plugin.finder.report.y2(V6, W0, maxPlayPercent, c17.f125486c, com.tencent.mm.plugin.finder.report.a3.f124943f);
            c17.f125485b = W0;
            c17.f125484a = true;
            com.tencent.mm.plugin.finder.feed.ct ctVar5 = this.f135995e;
            if (ctVar5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.ct.i(ctVar5, 150L, false, false, null, 12, null);
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
                androidx.appcompat.app.AppCompatActivity context2 = getActivity();
                kotlin.jvm.internal.o.g(context2, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar2 != null) {
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).aj(nyVar2.V6(), 5, T6());
                }
            }
        } else if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
            androidx.appcompat.app.AppCompatActivity context3 = getActivity();
            kotlin.jvm.internal.o.g(context3, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar3 != null) {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c18).aj(nyVar3.V6(), 1, 0);
            }
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar6 = this.f135995e;
        if (ctVar6 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        int i18 = finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : 0;
        boolean[] zArr = com.tencent.mm.plugin.finder.convert.tk.f104634e;
        if (zArr[i18 != 1 ? i18 != 3 ? (char) 2 : (char) 0 : (char) 1]) {
            android.view.View findViewById = ((com.tencent.mm.plugin.finder.feed.v00) ctVar6).f110848f.findViewById(com.tencent.mm.R.id.g3f);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zArr[i18 != 1 ? i18 != 3 ? (char) 2 : (char) 0 : (char) 1] = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_a;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        if (cmdItem.getInteger(0) == 108) {
            com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
            if (btVar != null) {
                pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.ez((com.tencent.mm.plugin.finder.feed.pz) btVar));
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (getIsUserVisibleFocused() && -1 == i18 && i17 == 101) {
            O6(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (isBelongFragment()) {
            com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
            if (btVar != null) {
                return ((com.tencent.mm.plugin.finder.feed.pz) btVar).e1();
            }
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.bt btVar2 = this.f135994d;
        if (btVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (((com.tencent.mm.plugin.finder.feed.pz) btVar2).e1()) {
            return false;
        }
        getActivity().finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 2) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
            if (ctVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            this.f135999i = linearLayoutManager != null ? linearLayoutManager.t() : -1;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_NEW_CGI_INT_SYNC, 0);
        if (r17 == 1) {
            db2.u4.f228188a = "/cgi-bin/mmfinder-bin";
        } else if (r17 != 2) {
            db2.u4.f228188a = "/cgi-bin/micromsg-bin";
        } else {
            db2.u4.f228188a = "/cgi-bin/micromsg-bin";
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCgiConstants", "config " + r17 + ' ' + db2.u4.f228188a);
        mv2.l lVar = mv2.l.f331597d;
        mv2.l.f331597d.e();
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.plugin.finder.convert.dv.f103202d == T6() ? com.tencent.mm.plugin.finder.convert.dv.f103201c : null;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        androidx.fragment.app.Fragment fragment = getFragment();
        this.f135994d = new com.tencent.mm.plugin.finder.feed.pz(mMActivity, fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null, gVar);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity2;
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.v00 v00Var = new com.tencent.mm.plugin.finder.feed.v00(mMActivity2, btVar, getRootView(), getFragment());
        this.f135995e = v00Var;
        com.tencent.mm.plugin.finder.feed.bt btVar2 = this.f135994d;
        if (btVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.feed.pz) btVar2).onAttach(v00Var);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.c();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(108, this);
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.viewmodel.component.n80(decorView, this));
        this.f135998h = getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        qt2.u uVar;
        android.os.Bundle bundle2;
        if (!isBelongFragment()) {
            o25.n1.c((com.tencent.mm.ui.MMActivity) getActivity());
        }
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        if (((finderHomeTabFragment == null || (bundle2 = finderHomeTabFragment.f129268s) == null || !bundle2.getBoolean("IsFirstEnterTab", false)) ? false : true) && getIntent().getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
            com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "[onCreateAfter] is go to topic, tabType=" + T6() + " isAutoRefresh=" + this.f135996f.R6(T6()));
            com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
            if (btVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.feed.pz) btVar).M0(true, true, 0L);
            ey2.o0 N6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(T6());
            N6.f257448h = java.lang.System.currentTimeMillis();
            N6.a(ey2.q0.f257474g);
        }
        com.tencent.mm.plugin.finder.feed.bt btVar2 = this.f135994d;
        if (btVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        dw2.c0 c0Var = ((com.tencent.mm.plugin.finder.feed.pz) btVar2).F.f223703n;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            androidx.fragment.app.Fragment fragment2 = getFragment();
            sb6.append(fragment2 != null ? fragment2.getClass().getSimpleName() : null);
            sb6.append("#onViewFocused");
            dw2.c0.h(c0Var, sb6.toString(), true, false, 4, null);
        }
        androidx.fragment.app.Fragment fragment3 = getFragment();
        if (fragment3 != null && (uVar = (qt2.u) pf5.z.f353948a.b(fragment3).e(qt2.u.class)) != null) {
            com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
            if (ctVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView();
            com.tencent.mm.plugin.finder.feed.bt btVar3 = this.f135994d;
            if (btVar3 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            uVar.S6(recyclerView, ((com.tencent.mm.plugin.finder.feed.pz) btVar3).C);
        }
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNextTabPreloadEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$onCreateAfter$3
            {
                this.__eventId = 1338237085;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent) {
                com.tencent.mm.autogen.events.FinderNextTabPreloadEvent event = finderNextTabPreloadEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54313g.f7892a;
                com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = com.tencent.mm.plugin.finder.viewmodel.component.t80.this;
                if (i17 != t80Var.T6()) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.o80(t80Var));
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        if (isBelongFragment()) {
            return;
        }
        o25.n1.e(getActivity());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "onDestroy");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(108, this);
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.feed.pz) btVar).onDetach();
        kk.l lVar = so2.f0.f410334a;
        so2.f0.f410334a.clear();
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f135995e;
        if (ctVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView().setAdapter(null);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int T6 = T6();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        v1Var.x(T6, nyVar != null ? nyVar.V6() : null);
        v1Var.v(-1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        O6(intent);
        int intExtra = intent.getIntExtra("KEY_TARGET_TAB_TYPE", 0);
        com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "[onNewIntent] tabType:" + T6() + " targetTabType:" + intExtra);
        if (intExtra != T6()) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_BY_PASS_INFO");
        intent.getIntExtra("KEY_BY_PASS_INFO_TYPE", 0);
        int intExtra2 = intent.getIntExtra("KEY_SOURCE_TYPE", 0);
        long longExtra = intent.getLongExtra("KEY_OBJECT_ID", 0L);
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_OBJECT_NONCE_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        eb2.f0 f0Var = ((com.tencent.mm.plugin.finder.feed.pz) btVar).C.f107650f;
        if (stringExtra != null) {
            if (!(!(stringExtra.length() == 0))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                byte[] bytes = stringExtra.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                f0Var.f250744c = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
            }
        }
        f0Var.getClass();
        f0Var.f250747f = intExtra2;
        f0Var.f250745d = longExtra;
        f0Var.f250746e = stringExtra2;
        com.tencent.mm.plugin.finder.feed.bt btVar2 = this.f135994d;
        if (btVar2 != null) {
            com.tencent.mm.plugin.finder.feed.bt.m0(btVar2, true, true, 0L, 4, null);
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        java.lang.String str;
        r45.cl2 cl2Var;
        super.onPause();
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) btVar;
        com.tencent.mm.plugin.finder.feed.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            Z0.f106804i = Z0.d().N6();
            com.tencent.mars.xlog.Log.i(Z0.f106801f, "onUIPause hasPermission=" + Z0.f106804i);
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.c();
        pzVar.f108766r.getClass();
        pzVar.M.dead();
        if (pzVar.f108762p == 4 && ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj()) {
            com.tencent.mm.plugin.finder.report.e2 e2Var = (com.tencent.mm.plugin.finder.report.e2) com.tencent.mm.plugin.finder.report.p2.f125239c.get(com.tencent.mm.plugin.finder.report.p2.f125237a.p(com.tencent.mm.plugin.finder.report.p2.f125238b));
            if (e2Var != null) {
                long j17 = e2Var.f125007a;
                if (j17 > 0) {
                    e2Var.f125008b = android.os.SystemClock.elapsedRealtime();
                    com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "[setPostRecommendLeaveTime] startTime=" + j17 + " leaveTime=" + e2Var.f125008b);
                }
            }
        }
        v1Var.v(-1);
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        android.app.Activity context = getContext();
        int T6 = T6();
        int P6 = P6();
        kotlin.jvm.internal.o.g(context, "context");
        if (!y0Var.a() && T6 == com.tencent.mm.plugin.finder.report.y0.f125446e) {
            y0Var.f(context, T6, P6);
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.W6(T6()).getInteger(5) : 0;
        com.tencent.mm.plugin.finder.viewmodel.component.m1 a17 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
        a17.a(integer, "FinderHomeTabPause");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collection values = a17.f135112a.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.tencent.mm.plugin.finder.viewmodel.component.j1) next).f134790b == integer) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) it6.next();
                if (j1Var.f134799k < j1Var.f134794f) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    int i17 = j1Var.f134794f;
                    if (i17 == 0) {
                        str = "None";
                    } else if (i17 == 1) {
                        str = "Dispatched";
                    } else if (i17 == 2) {
                        str = "Consumed";
                    } else if (i17 == 3) {
                        str = "Focused";
                    } else if (i17 != 4) {
                        str = "Unknown#" + i17;
                    } else {
                        str = "UnFocused";
                    }
                    jSONObject.put("status", str);
                    jSONObject.put("dispatchFeed", j1Var.a());
                    qc2.b bVar = qc2.b.f361509a;
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = j1Var.f134789a;
                    long id6 = finderObject.getId();
                    int i18 = j1Var.f134790b;
                    r45.dm2 object_extend = finderObject.getObject_extend();
                    long j18 = (object_extend == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null) ? 0L : cl2Var.getLong(1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    qc2.b.a(bVar, 6, id6, i18, j18, false, "feed-status", 0, 0, false, jSONObject2, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                    j1Var.f134799k = j1Var.f134794f;
                }
            }
        }
        this.f135999i = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.g00 Z0 = ((com.tencent.mm.plugin.finder.feed.pz) btVar).Z0();
        Z0.getClass();
        if (Z0.f()) {
            java.lang.String str = "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0];
            java.lang.String str2 = Z0.f106801f;
            com.tencent.mars.xlog.Log.i(str2, str);
            if (i17 == 79) {
                int i18 = grantResults[0];
                if (i18 == 0) {
                    com.tencent.mm.plugin.finder.feed.ct ctVar = Z0.f106798c;
                    if (ctVar != null) {
                        ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().L(true);
                        return;
                    }
                    return;
                }
                if (i18 == -1) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_HAVE_DENIED_LOCATION_PERMISSION_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    com.tencent.mars.xlog.Log.i(str2, "onRequestPermissionsResult return for denied.");
                } else {
                    com.tencent.mars.xlog.Log.i(str2, "onRequestPermissionsResult return for " + grantResults[0] + '.');
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.view.f5 O6;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) btVar;
        com.tencent.mm.plugin.finder.feed.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            com.tencent.mm.plugin.finder.feed.qz c17 = Z0.c();
            if (c17.h()) {
                Z0.l(-4, c17.i());
            } else if (!Z0.f106804i) {
                boolean N6 = Z0.d().N6();
                java.lang.String str = Z0.f106801f;
                if (N6 && Z0.f106805j) {
                    Z0.f106805j = false;
                    com.tencent.mars.xlog.Log.i(str, "onPermissionOk auto refresh");
                    com.tencent.mm.plugin.finder.feed.bt.m0(Z0.f106797b, true, true, 0L, 4, null);
                }
                com.tencent.mars.xlog.Log.i(str, "onUIResume permissions=" + N6);
            }
        }
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.ez(pzVar));
        com.tencent.mm.plugin.finder.assist.n5.f102402a.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onUIResume] tabType=");
        int i17 = pzVar.f108762p;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(pzVar.U, sb6.toString());
        int i18 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).qj() ? 4 : 3;
        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
        if (i17 == i18) {
            long longExtra = mMActivity.getIntent().getLongExtra("key_finder_post_local_id", -1L);
            com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = pzVar.C;
            d8Var.a(mMActivity, finderTimelineFeedLoader);
            if (longExtra != -1 && i17 == 4) {
                pf5.z zVar = pf5.z.f353948a;
                ((com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.class)).onPostStart(longExtra);
                finderTimelineFeedLoader.f107662u = longExtra;
                com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
                if (ctVar != null && (recyclerView2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "onUIResume", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "onUIResume", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                pzVar.D1 = 0;
                finderTimelineFeedLoader.d();
                com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var = (com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class);
                com.tencent.mm.plugin.finder.view.f5 O62 = u6Var.O6();
                if ((O62 != null && O62.b()) && (O6 = u6Var.O6()) != null) {
                    O6.a();
                }
                ((com.tencent.mm.plugin.finder.viewmodel.component.v6) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.v6.class)).O6();
            }
        }
        if (i17 == 3) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(mMActivity.getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false));
            if (!(valueOf.booleanValue() && pzVar.Y)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                pzVar.P0(null);
            }
        }
        com.tencent.mm.plugin.finder.feed.ct ctVar2 = pzVar.f108759m;
        if (ctVar2 != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar2).getRecyclerView()) != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.xy(pzVar));
        }
        pzVar.M.alive();
        if (f135993m && T6() == 3) {
            com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "[onResume] shouldScrollToPostingItem");
            com.tencent.mm.plugin.finder.feed.ct ctVar3 = this.f135995e;
            if (ctVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ((com.tencent.mm.plugin.finder.feed.v00) ctVar3).getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                yj0.a.d(linearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            f135993m = false;
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.s(T6());
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        android.app.Activity context = getContext();
        int T6 = T6();
        int P6 = P6();
        kotlin.jvm.internal.o.g(context, "context");
        if (!y0Var.a()) {
            if (T6 == com.tencent.mm.plugin.finder.report.y0.f125446e && !com.tencent.mm.plugin.finder.report.y0.f125444c) {
                y0Var.e(context, T6, P6);
            }
            com.tencent.mm.plugin.finder.report.y0.f125444c = false;
        }
        if (this.f135999i >= 0) {
            com.tencent.mm.plugin.finder.feed.ct ctVar4 = this.f135995e;
            if (ctVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar4).getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager3 != null) {
                int i19 = this.f135999i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                arrayList3.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList3);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager4 = linearLayoutManager3;
                yj0.a.d(linearLayoutManager4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager3.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
                yj0.a.f(linearLayoutManager4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            this.f135999i = -1;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (!getActivity().isFinishing()) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.j(T6(), false);
            return;
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int T6 = T6();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        v1Var.x(T6, nyVar != null ? nyVar.V6() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x07ad, code lost:
    
        if (r4.containsKey("ForceScrollPosition") == true) goto L367;
     */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0879  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUserVisibleFocused() {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.t80.onUserVisibleFocused():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        super.onUserVisibleUnFocused();
        boolean z17 = this.f135998h;
        pf5.u uVar = pf5.u.f353936a;
        if (z17 && T6() == 4) {
            ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(T6());
            N6.a(ey2.q0.f257475h);
            N6.f257449i = java.lang.System.currentTimeMillis();
        } else {
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).T6(T6());
        }
        com.tencent.mm.plugin.finder.feed.bt btVar = this.f135994d;
        if (btVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.pz pzVar = (com.tencent.mm.plugin.finder.feed.pz) btVar;
        com.tencent.mm.plugin.finder.feed.g00 Z0 = pzVar.Z0();
        if (Z0.f()) {
            Z0.f106806k = false;
            com.tencent.mars.xlog.Log.i(Z0.f106801f, "onUserVisibleUnFocused poiTask=" + Z0.f106808m);
            com.tencent.mm.plugin.finder.feed.tz tzVar = Z0.f106808m;
            if (tzVar != null) {
                Z0.e().removeCallbacks(tzVar);
            }
        }
        int i17 = pzVar.f108762p;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            androidx.recyclerview.widget.RecyclerView recyclerView = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView() : null;
            ml2.x1 x1Var = ml2.x1.f328203g;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_9", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else if (i17 == 4 && (finderHomeTabFragment = pzVar.f108756h) != null) {
            so2.a2 a2Var = pzVar.f108774x1;
            a2Var.f410250g.f410345a = -1;
            so2.r4 r4Var = so2.r4.f410575e;
            so2.s4 s4Var = a2Var.f410251h;
            s4Var.getClass();
            s4Var.f410592a = r4Var;
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.v(T6());
        v1Var.j(T6(), true);
        com.tencent.mm.plugin.finder.report.e1 e1Var = com.tencent.mm.plugin.finder.report.e1.f125004a;
        com.tencent.mm.plugin.finder.report.y0.f125442a.f(getContext(), T6(), P6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f135996f = (ey2.t0) a17;
        this.f135997g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.s80(this));
        this.f135999i = -1;
    }
}
