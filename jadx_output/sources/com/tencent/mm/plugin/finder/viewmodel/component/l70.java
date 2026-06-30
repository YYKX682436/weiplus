package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l70 extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(in5.s0 s0Var) {
        android.view.View view;
        android.view.View findViewById = (s0Var == null || (view = s0Var.itemView) == null) ? null : view.findViewById(com.tencent.mm.R.id.tvl);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "detachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "detachSubtitleContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar != null) {
            com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6 = !ptVar.f135606d ? null : ptVar.X6();
            android.view.View findViewById2 = X6 != null ? X6.findViewById(com.tencent.mm.R.id.tvl) : null;
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = findViewById2;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "hideSubtitleContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "hideSubtitleContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void P6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        android.view.View findViewById;
        if (baseFinderFeed == null || !baseFinderFeed.getFeedObject().canShowSubtitle()) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar == null || (X6 = ptVar.X6()) == null || (findViewById = X6.findViewById(com.tencent.mm.R.id.tvl)) == null) {
            return;
        }
        android.view.View findViewById2 = X6.findViewById(com.tencent.mm.R.id.ufv);
        android.view.View findViewById3 = X6.findViewById(com.tencent.mm.R.id.ufu);
        int dimensionPixelSize = findViewById.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        if (findViewById2 != null && findViewById2.isShown()) {
            dimensionPixelSize += findViewById2.getHeight();
        }
        if (findViewById3 != null && findViewById3.isShown()) {
            dimensionPixelSize += findViewById3.getHeight();
        }
        if (dimensionPixelSize > 0) {
            findViewById.getLayoutParams();
            com.tencent.mm.ui.kk.d(findViewById, dimensionPixelSize);
        } else {
            findViewById.getLayoutParams();
            com.tencent.mm.ui.kk.d(findViewById, findViewById.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs));
        }
        findViewById.requestLayout();
    }

    public final void Q6(in5.s0 s0Var, boolean z17) {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        android.view.View findViewById;
        android.view.View findViewById2;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X62;
        if (s0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "setSubtitleStatusVisible holder is null");
            return;
        }
        int i17 = z17 ? com.tencent.mm.R.raw.caption_lock_regular : com.tencent.mm.R.raw.caption_regular;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        android.view.View subtitleBtn = finderFullSeekBarLayout != null ? finderFullSeekBarLayout.getSubtitleBtn() : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = subtitleBtn instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) subtitleBtn : null;
        if (weImageView != null) {
            weImageView.setImageResource(i17);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        android.view.KeyEvent.Callback subtitleBtnLayout = (ptVar == null || (X62 = ptVar.X6()) == null) ? null : X62.getSubtitleBtnLayout();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = subtitleBtnLayout instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) subtitleBtnLayout : null;
        if (weImageView2 != null) {
            weImageView2.setImageResource(i17);
        }
        android.view.View view = s0Var.itemView;
        if (view != null && (findViewById2 = view.findViewById(com.tencent.mm.R.id.tvl)) != null) {
            int i18 = z17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar2 == null || (X6 = ptVar2.X6()) == null || (findViewById = X6.findViewById(com.tencent.mm.R.id.tvl)) == null) {
            return;
        }
        int i19 = z17 ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSubtitleSettingUIC", "setSubtitleStatusVisible", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R6(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, int i17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String string = V6.getString(2);
        if (string == null) {
            string = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", string);
        java.lang.String string2 = V6.getString(1);
        lVarArr[1] = new jz5.l("finder_context_id", string2 != null ? string2 : "");
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[4] = new jz5.l("session_buffer", baseFinderFeed.g0());
        lVarArr[5] = new jz5.l("subtitle_option_cnt", java.lang.Integer.valueOf(i17));
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
        lVarArr[6] = new jz5.l("current_language", o70Var != null ? o70Var.P6(baseFinderFeed.getItemId()) : null);
        lVarArr[7] = new jz5.l("my_finder_username", baseFinderFeed.getFeedObject().getUserName());
        lVarArr[8] = new jz5.l("subtitle_language_opt", str2);
        ((cy1.a) rVar).Bj("finder_subtitle_option_page", str, kz5.c1.k(lVarArr), 1, false);
    }

    public final void S6(android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Mj(view);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(view, "finder_subtitle_switch");
        aVar.ik(view, 40, 25496);
        aVar.Tj(view, 40, 1, false);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        aVar.Ai(view, new com.tencent.mm.plugin.finder.viewmodel.component.h70(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), baseFinderFeed, this));
    }

    public final void T6(in5.s0 s0Var) {
        char c17;
        boolean z17;
        com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        if (!(baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            baseFinderFeed = null;
        }
        if (s0Var == null || baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "subtitleSettingClick holder or item is null");
            return;
        }
        long itemId = baseFinderFeed.getItemId();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.view.pl plVar = new com.tencent.mm.plugin.finder.view.pl(getContext(), itemId);
        boolean N0 = baseFinderFeed.N0();
        com.tencent.mm.plugin.finder.view.nl nlVar = plVar.f132851d;
        if (N0) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.o2b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
            arrayList.add(new com.tencent.mm.plugin.finder.view.tr("self_open_subtitle", string, feedObject != null && feedObject.canShowSubtitle(), null, 8, null));
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.o2_);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
            arrayList.add(new com.tencent.mm.plugin.finder.view.tr("self_close_subtitle", string2, (feedObject2 == null || feedObject2.canShowSubtitle()) ? false : true, null, 8, null));
            nlVar.getClass();
            nlVar.f132721e = arrayList;
            nlVar.f132722f = new com.tencent.mm.plugin.finder.viewmodel.component.i70(s0Var, this, arrayList);
        } else {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
            if (o70Var == null) {
                return;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.n70) o70Var.f135436d.get(java.lang.Long.valueOf(itemId));
            java.util.List<r45.ay2> list = n70Var2 != null ? n70Var2.f135276l : null;
            if (list == null) {
                return;
            }
            for (r45.ay2 ay2Var : list) {
                java.lang.String str = "lang_" + ay2Var.getString(1);
                java.lang.String string3 = ay2Var.getString(1);
                if (string3 == null) {
                    string3 = "";
                }
                arrayList.add(new com.tencent.mm.plugin.finder.view.tr(str, string3, false, kz5.c0.k(ay2Var), 4, null));
            }
            if (arrayList.size() == 2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lang_");
                r45.ay2 ay2Var2 = (r45.ay2) kz5.n0.a0(list, 0);
                sb6.append(ay2Var2 != null ? ay2Var2.getString(1) : null);
                sb6.append('_');
                r45.ay2 ay2Var3 = (r45.ay2) kz5.n0.a0(list, 1);
                sb6.append(ay2Var3 != null ? ay2Var3.getString(1) : null);
                java.lang.String sb7 = sb6.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                r45.ay2 ay2Var4 = (r45.ay2) kz5.n0.a0(list, 0);
                sb8.append(ay2Var4 != null ? ay2Var4.getString(1) : null);
                sb8.append('+');
                r45.ay2 ay2Var5 = (r45.ay2) kz5.n0.a0(list, 1);
                sb8.append(ay2Var5 != null ? ay2Var5.getString(1) : null);
                java.lang.String sb9 = sb8.toString();
                c17 = '_';
                com.tencent.mm.plugin.finder.view.tr trVar = new com.tencent.mm.plugin.finder.view.tr(sb7, sb9, false, list, 4, null);
                z17 = false;
                arrayList.add(0, trVar);
            } else {
                c17 = '_';
                z17 = false;
            }
            java.lang.String string4 = getContext().getString(com.tencent.mm.R.string.o28);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            arrayList.add(new com.tencent.mm.plugin.finder.view.tr("close_subtitle", string4, false, null, 4, null));
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.o70) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
            java.util.List list2 = (o70Var2 == null || (n70Var = (com.tencent.mm.plugin.finder.viewmodel.component.n70) o70Var2.f135436d.get(java.lang.Long.valueOf(itemId))) == null) ? null : n70Var.f135275k;
            java.lang.String str2 = "lang";
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    str2 = str2 + c17 + ((r45.ay2) it.next()).getString(1);
                }
            }
            if ((list2 == null || list2.isEmpty()) ? true : z17) {
                str2 = "close_subtitle";
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.view.tr) next).f133148a, str2)) {
                    arrayList2.add(next);
                }
            }
            com.tencent.mm.plugin.finder.view.tr trVar2 = (com.tencent.mm.plugin.finder.view.tr) kz5.n0.Z(arrayList2);
            if (trVar2 != null) {
                trVar2.f133150c = true;
            }
            nlVar.getClass();
            nlVar.f132721e = arrayList;
            nlVar.f132722f = new com.tencent.mm.plugin.finder.viewmodel.component.j70(this, baseFinderFeed, arrayList, itemId);
        }
        ((com.tencent.mm.ui.widget.dialog.a4) ((jz5.n) plVar.f132849b).getValue()).show();
        R6(getContext(), baseFinderFeed, "view_exp", arrayList.size(), null);
    }

    public final void U6(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        if (s0Var == null || baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "switchSubtitleStatusBySelf holder or item is null");
            return;
        }
        if (!baseFinderFeed.N0()) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "switchSubtitleStatusBySelf error, " + baseFinderFeed.getItemId() + " is not self feed ");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        long itemId = baseFinderFeed.getItemId();
        java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
        com.tencent.mm.plugin.finder.viewmodel.component.k70 k70Var = new com.tencent.mm.plugin.finder.viewmodel.component.k70(z17, this, s0Var, baseFinderFeed);
        b0Var.getClass();
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(itemId));
        wh2Var.set(1, 9);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(b0Var, wh2Var, k70Var, false, false, null, null, 60, null);
        V6(s0Var, baseFinderFeed, z17);
        db5.t7.h(getContext(), getContext().getResources().getString(z17 ? com.tencent.mm.R.string.o2a : com.tencent.mm.R.string.o2c));
    }

    public final void V6(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend2 != null) {
            if (z17) {
                object_extend2.set(30, java.lang.Long.valueOf(object_extend2.getLong(30) | 16384));
            } else {
                object_extend2.set(30, java.lang.Long.valueOf(object_extend2.getLong(30) & (-16385)));
            }
        }
        cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
        long itemId = baseFinderFeed.getItemId();
        kVar.getClass();
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(itemId);
        if (h17 != null && (feedObject = h17.getFeedObject()) != null && (object_extend = feedObject.getObject_extend()) != null) {
            if (z17) {
                object_extend.set(30, java.lang.Long.valueOf(object_extend.getLong(30) | 16384));
            } else {
                object_extend.set(30, java.lang.Long.valueOf((-16385) & object_extend.getLong(30)));
            }
        }
        Q6(s0Var, z17);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long itemId2 = baseFinderFeed.getItemId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = itemId2;
        iaVar.f6919b = 36;
        feedUpdateEvent.e();
    }
}
