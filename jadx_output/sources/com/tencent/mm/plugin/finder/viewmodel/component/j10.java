package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f134800d;

    public j10(com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var) {
        this.f134800d = t10Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        in5.s0 s0Var;
        db5.g4 g4Var2;
        java.lang.Object obj;
        java.lang.Object obj2;
        char c17;
        java.lang.Integer num;
        int i17;
        int i18;
        r45.th2 mod_feed_info;
        java.lang.Object obj3;
        long j17;
        java.lang.String str;
        g4Var.clear();
        com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var = this.f134800d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = t10Var.f135959e;
        if (baseFinderFeed == null || (s0Var = t10Var.f135961g) == null) {
            return;
        }
        java.lang.String e17 = xy2.c.e(t10Var.getContext());
        sc2.a9 a9Var = new sc2.a9();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getCreateSecondMoreMenuListener: username=" + e17 + ", feedId=" + pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        y4Var.g(t10Var.getContext(), g4Var, baseFinderFeed);
        y4Var.t(t10Var.getContext(), g4Var, baseFinderFeed);
        y4Var.y(t10Var.getContext(), baseFinderFeed, g4Var, null, 200);
        y4Var.x(t10Var.getContext(), baseFinderFeed, g4Var);
        a9Var.a(g4Var, t10Var.getContext(), 204, 203, baseFinderFeed.getFeedObject().getStickyTime() != 0);
        boolean E = hc2.o0.E(baseFinderFeed.getFeedObject().getFeedObject(), false, 1, null);
        android.content.Context context = s0Var.f293121e;
        if (!E) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            zy2.g8 g8Var = (zy2.g8) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).d(zy2.g8.class);
            if (g8Var != null && ((te2.e4) g8Var).f417974d != null) {
                java.lang.String username = baseFinderFeed.getFeedObject().getFeedObject().getUsername();
                if (username == null) {
                    username = "";
                }
                if (com.tencent.mm.plugin.finder.feed.model.i1.f107930a.d(username) != null) {
                    android.app.Activity context2 = t10Var.getContext();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (baseFinderFeed.getFeedObject().isLiveNoticeHide()) {
                        g4Var.g(124, context2.getString(com.tencent.mm.R.string.m2u), com.tencent.mm.R.raw.icon_regular_preview_on);
                    } else {
                        g4Var.g(123, context2.getString(com.tencent.mm.R.string.m2s), com.tencent.mm.R.raw.icon_regular_preview_off);
                    }
                }
            }
        }
        so2.u1 u1Var = baseFinderFeed instanceof so2.u1 ? (so2.u1) baseFinderFeed : null;
        if (u1Var != null && u1Var.i2()) {
            if (hc2.o0.g(baseFinderFeed.getFeedObject().getFeedObject()) && y4Var.c0(t10Var.getContext())) {
                g4Var.g(304, t10Var.getContext().getString(com.tencent.mm.R.string.gyt), com.tencent.mm.R.raw.bullet_screen_lock_regular);
            } else {
                g4Var.g(303, t10Var.getContext().getString(com.tencent.mm.R.string.gyx), com.tencent.mm.R.raw.bullet_screen_regular);
            }
        }
        if (baseFinderFeed.getFeedObject().canShowSubtitleBtn()) {
            if (baseFinderFeed.getFeedObject().canShowSubtitle()) {
                g4Var.g(322, t10Var.getContext().getResources().getString(com.tencent.mm.R.string.o2_), com.tencent.mm.R.raw.caption_lock_regular);
            } else {
                g4Var.g(321, t10Var.getContext().getResources().getString(com.tencent.mm.R.string.o2b), com.tencent.mm.R.raw.caption_regular);
            }
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (pm0.v.A(object_extend != null ? object_extend.getLong(30) : 0L, 1024L)) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "hasLiveCommentButton");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = baseFinderFeed.getFeedObject().getFeedObject();
            kotlin.jvm.internal.o.g(finderObject, "finderObject");
            r45.dm2 object_extend2 = finderObject.getObject_extend();
            if (object_extend2 != null) {
                j17 = object_extend2.getLong(30);
                obj3 = "finder_context_id";
            } else {
                obj3 = "finder_context_id";
                j17 = 0;
            }
            boolean z17 = pm0.v.A(j17, 2048L) && y4Var.c0(t10Var.getContext());
            if (z17) {
                g4Var2 = g4Var;
                g4Var2.g(311, t10Var.getContext().getString(com.tencent.mm.R.string.o_q), com.tencent.mm.R.raw.icon_regular_disable_replay);
            } else {
                g4Var2 = g4Var;
                g4Var2.g(310, t10Var.getContext().getString(com.tencent.mm.R.string.o_s), com.tencent.mm.R.raw.icon_regular_replay);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "forward_menu_live_comment");
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
            if (e18 != null) {
                str = e18.f135382p;
                obj = "view_id";
            } else {
                obj = "view_id";
                str = null;
            }
            obj2 = obj3;
            lVarArr[1] = new jz5.l(obj2, str);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
            lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context);
            lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
            lVarArr[4] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
            lVarArr[5] = new jz5.l("live_commen_state", java.lang.Integer.valueOf(z17 ? 2 : 1));
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(lVarArr), 25496);
        } else {
            g4Var2 = g4Var;
            obj = "view_id";
            obj2 = "finder_context_id";
        }
        y4Var.H(t10Var.getContext(), baseFinderFeed, g4Var2);
        if (hc2.t.d(t10Var.getContext())) {
            g4Var2.g(217, t10Var.getContext().getString(com.tencent.mm.R.string.nl7), com.tencent.mm.R.raw.bubble_setting_regular);
        } else {
            y4Var.d(t10Var.getContext(), baseFinderFeed, g4Var2);
        }
        java.lang.Object obj4 = obj;
        java.lang.Object obj5 = obj2;
        com.tencent.mm.plugin.finder.assist.y4.u(y4Var, g4Var, t10Var.getContext(), baseFinderFeed.getFeedObject().getMediaType(), 206, 205, baseFinderFeed.getFeedObject().getPrivate_flag() == 1, false, 64, null);
        android.app.Activity context3 = t10Var.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        java.lang.String u17 = pm0.v.u(baseFinderFeed.getItemId());
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_SWITCH_BOOLEAN_SYNC, false)) {
            int color = context3.getResources().getColor(com.tencent.mm.R.color.FG_1);
            int color2 = context3.getResources().getColor(com.tencent.mm.R.color.FG_0);
            boolean disableHelpPromotion = baseFinderFeed.getFeedObject().disableHelpPromotion();
            java.lang.String string = disableHelpPromotion ? context3.getResources().getString(com.tencent.mm.R.string.mrw) : context3.getResources().getString(com.tencent.mm.R.string.a_6);
            kotlin.jvm.internal.o.d(string);
            g4Var.i(212, string, color, disableHelpPromotion ? com.tencent.mm.R.raw.icon_outlined_promote : com.tencent.mm.R.raw.icons_outlined_heat_off, color2);
        } else {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addIncreasePopularityMenu] feeId:" + u17 + " no permission");
        }
        y4Var.a(t10Var.getContext(), g4Var2, baseFinderFeed);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = t10Var.f135962h;
        if ((k8Var != null && k8Var.d0()) || ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.D9).getValue()).r()).booleanValue()) {
            android.app.Activity context4 = t10Var.getContext();
            kotlin.jvm.internal.o.g(context4, "context");
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            g4Var2.g(125, context4.getResources().getString(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Se).getValue()).r()).booleanValue() ? com.tencent.mm.R.string.ded : com.tencent.mm.R.string.mrq), com.tencent.mm.R.raw.icons_outlined_data);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr2 = new jz5.l[6];
            lVarArr2[0] = new jz5.l(obj4, "forward_menu_administration");
            lVarArr2[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
            if (V6 != null) {
                c17 = 5;
                num = java.lang.Integer.valueOf(V6.getInteger(5));
            } else {
                c17 = 5;
                num = null;
            }
            jz5.l lVar = new jz5.l("comment_scene", num);
            i17 = 2;
            lVarArr2[2] = lVar;
            i18 = 3;
            lVarArr2[3] = new jz5.l("selfUin", java.lang.Long.valueOf(new kk.v(gm0.j1.b().h()).longValue()));
            lVarArr2[4] = new jz5.l(obj5, V6 != null ? V6.getString(1) : null);
            lVarArr2[c17] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
            ((cy1.a) rVar2).Ej("view_exp", kz5.c1.k(lVarArr2), 25496);
        } else {
            i17 = 2;
            i18 = 3;
        }
        android.app.Activity context5 = t10Var.getContext();
        kotlin.jvm.internal.o.g(context5, "context");
        java.lang.String u18 = pm0.v.u(baseFinderFeed.getItemId());
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        if (objectDesc != null && (mod_feed_info = objectDesc.getMod_feed_info()) != null) {
            if (mod_feed_info.getInteger(i18) == 0) {
                com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[addModFeedMenu] feeId:" + u18 + " not displayed");
            } else {
                g4Var.i(214, context5.getResources().getString(com.tencent.mm.R.string.o1p), context5.getResources().getColor(com.tencent.mm.R.color.FG_1), com.tencent.mm.R.raw.icons_outlined_pencil2, mod_feed_info.getInteger(i18) == i17 ? context5.getResources().getColor(com.tencent.mm.R.color.FG_0) : context5.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
        }
        g4Var2.b(108, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete);
        y4Var.b(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.r(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.p(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.e(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.j(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.f(t10Var.getContext(), baseFinderFeed, g4Var2);
        y4Var.n(t10Var.getContext(), g4Var2, baseFinderFeed);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var2);
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.view.uj ujVar = t10Var.f135958d;
            android.widget.TextView textView = ujVar != null ? ujVar.f133196o : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.view.uj ujVar2 = t10Var.f135958d;
            androidx.recyclerview.widget.RecyclerView recyclerView = ujVar2 != null ? ujVar2.f133190i : null;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.finder.view.uj ujVar3 = t10Var.f135958d;
        android.widget.TextView textView2 = ujVar3 != null ? ujVar3.f133196o : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.view.uj ujVar4 = t10Var.f135958d;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = ujVar4 != null ? ujVar4.f133190i : null;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t10.O6(t10Var, g4Var2);
    }
}
