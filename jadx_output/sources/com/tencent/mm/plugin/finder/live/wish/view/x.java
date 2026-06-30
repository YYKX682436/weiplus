package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: r, reason: collision with root package name */
    public static com.tencent.mm.protocal.protobuf.FinderJumpInfo f120663r;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120664a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f120665b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f120667d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f120668e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f120669f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f120670g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f120671h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f120672i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f120673j;

    /* renamed from: k, reason: collision with root package name */
    public r45.zv1 f120674k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f120675l;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.wish.view.o f120678o;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f120680q;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f120666c = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f120676m = jz5.h.b(com.tencent.mm.plugin.finder.live.wish.view.l.f120637d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f120677n = jz5.h.b(new com.tencent.mm.plugin.finder.live.wish.view.m(this));

    /* renamed from: p, reason: collision with root package name */
    public qs5.s f120679p = qs5.s.f366464d;

    public x() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f120680q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.wish.view.GiftWallViewHelper$liteAppDestroyListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54468g.f7817a != 3) {
                    return false;
                }
                com.tencent.mm.plugin.finder.live.wish.view.x xVar = com.tencent.mm.plugin.finder.live.wish.view.x.this;
                xVar.k(xVar.f120679p);
                dead();
                return false;
            }
        };
    }

    public static final boolean a(com.tencent.mm.plugin.finder.live.wish.view.x xVar) {
        return ((java.lang.Boolean) ((jz5.n) xVar.f120677n).getValue()).booleanValue();
    }

    public static final boolean b(com.tencent.mm.plugin.finder.live.wish.view.x xVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Context context;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[onLiteAppOpenProfileSheet] userName = " + str + ", nickName = " + str2 + ", iconUrl = " + str3);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null) {
            return false;
        }
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = xVar.f120664a;
        if (maxHeightWxRecyclerView != null && (context = maxHeightWxRecyclerView.getContext()) != null) {
            if (zl2.r4.f473950a.y1(k0Var.getBuContext())) {
                if (zl2.q4.f473933a.E()) {
                    db5.t7.m(context, "liteApp传过来的username = " + str);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
                bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 6);
                k0Var.statusChange(qo0.b.f365376l1, bundle);
            } else {
                if (!com.tencent.mm.storage.z3.S3(str)) {
                    com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[onLiteAppOpenProfileSheet] visitor can not open profile which is not finder");
                    return false;
                }
                gk2.e eVar = dk2.ef.I;
                if (eVar != null) {
                    dk2.q4 q4Var = dk2.q4.f233938a;
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    dk2.q4.j(q4Var, context, eVar, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), false, null, 96, null);
                }
            }
        }
        return true;
    }

    public static final boolean c(com.tencent.mm.plugin.finder.live.wish.view.x xVar, java.lang.String str, int i17, int i18) {
        xVar.getClass();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null) {
            return false;
        }
        if (zl2.r4.f473950a.y1(k0Var.getBuContext())) {
            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[onLiteAppSendRewardGift] anchor or Assistant, no reaction");
            return false;
        }
        if (!dk2.u7.f234185e.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[onLiteAppSendRewardGift] local cache not contain gift:" + str);
            return false;
        }
        qo0.b bVar = qo0.b.Z1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", str);
        bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i17);
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
        bundle.putInt("PARAM_FINDER_LIVE_SEND_GIFT_WALL_ACTION_TYPE", i18);
        k0Var.statusChange(bVar, bundle);
        return true;
    }

    public static final void d(com.tencent.mm.plugin.finder.live.wish.view.x xVar, java.lang.String str) {
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[report21084ForLiteApp] actionResult:" + str);
        if (zl2.q4.f473933a.E()) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.valueOf(str), 0).show();
        }
        try {
            java.lang.String gVar = new cl0.g(str).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            xVar.l(gVar);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[report21084ForLiteApp] e:" + th6.getMessage());
        }
    }

    public static final void e(com.tencent.mm.plugin.finder.live.wish.view.x xVar, yz5.a aVar) {
        df2.c9 c9Var;
        xVar.getClass();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (!(k0Var != null ? k0Var.isLandscape() : false)) {
            aVar.invoke();
            return;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (c9Var = (df2.c9) liveRoomControllerStore.controller(df2.c9.class)) == null) {
            return;
        }
        c9Var.W6(new com.tencent.mm.plugin.finder.live.wish.view.w(aVar));
    }

    public final void f(com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView contentRv, android.view.View headerView, android.view.View view, com.tencent.mm.plugin.finder.live.wish.view.o oVar) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        android.view.View view2;
        kotlin.jvm.internal.o.g(contentRv, "contentRv");
        kotlin.jvm.internal.o.g(headerView, "headerView");
        this.f120664a = contentRv;
        this.f120668e = headerView;
        this.f120675l = view;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "initView", "(Lcom/tencent/mm/view/recyclerview/MaxHeightWxRecyclerView;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$optParentPanelInterface;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "initView", "(Lcom/tencent/mm/view/recyclerview/MaxHeightWxRecyclerView;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$optParentPanelInterface;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f120678o = oVar;
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        contentRv.setMaxHeight((int) (f17 * (k0Var != null ? k0Var.isLandscape() : false ? 1.0f : 0.6f)));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(contentRv.getContext(), 3, 1, false);
        gridLayoutManager.B = new com.tencent.mm.plugin.finder.live.wish.view.k(this);
        contentRv.setLayoutManager(gridLayoutManager);
        this.f120665b = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.wish.view.GiftWallViewHelper$initView$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.live.wish.view.f(com.tencent.mm.plugin.finder.live.wish.view.x.this);
            }
        }, this.f120666c, false);
        android.view.View inflate = com.tencent.mm.ui.id.b(contentRv.getContext()).inflate(com.tencent.mm.R.layout.ase, (android.view.ViewGroup) null, false);
        this.f120667d = inflate;
        this.f120669f = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485169gs1) : null;
        android.view.View view3 = this.f120667d;
        this.f120670g = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.grv) : null;
        android.view.View view4 = this.f120667d;
        this.f120672i = view4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.grx) : null;
        android.view.View view5 = this.f120667d;
        this.f120673j = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.f485346hd5) : null;
        android.view.View view6 = this.f120667d;
        this.f120671h = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.f485170gs2) : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f120672i;
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.view.j(this));
        }
        if (g() && (view2 = this.f120667d) != null) {
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485346hd5)).setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f120672i;
            if (weImageView2 != null) {
                weImageView2.r(android.graphics.Color.parseColor("#FFFFFF"), 0.3f);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f120665b;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.T(headerView, 3, false);
        }
        android.view.View view7 = this.f120667d;
        if (view7 != null && (wxRecyclerAdapter = this.f120665b) != null) {
            wxRecyclerAdapter.T(view7, 2, false);
        }
        contentRv.setAdapter(this.f120665b);
    }

    public final boolean g() {
        return ((java.lang.Boolean) ((jz5.n) this.f120676m).getValue()).booleanValue();
    }

    public final void h() {
        android.view.View view = this.f120675l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onPanelClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onPanelClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f120680q.dead();
    }

    public final void i() {
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView;
        android.view.View findViewById;
        this.f120674k = null;
        this.f120666c.clear();
        android.view.View view = this.f120667d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onWallEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onWallEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f120668e;
        if (view2 != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.frh)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i17 = marginLayoutParams.leftMargin;
                int i18 = marginLayoutParams.topMargin;
                int i19 = marginLayoutParams.rightMargin;
                int dimensionPixelOffset = findViewById.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f13do);
                android.view.View view3 = this.f120667d;
                marginLayoutParams.setMargins(i17, i18, i19, dimensionPixelOffset - (view3 != null ? view3.getHeight() : 0));
            }
        }
        android.view.View view4 = this.f120668e;
        if (view4 != null) {
            view4.postInvalidate();
        }
        android.view.View view5 = this.f120675l;
        if (view5 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onWallEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper", "onWallEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView2 = this.f120664a;
        if (maxHeightWxRecyclerView2 != null) {
            maxHeightWxRecyclerView2.setPadding(maxHeightWxRecyclerView2.getPaddingLeft(), maxHeightWxRecyclerView2.getPaddingTop(), maxHeightWxRecyclerView2.getPaddingRight(), 0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f120665b;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.live.wish.view.o oVar = this.f120678o;
        if ((oVar != null ? oVar.a() : null) != qs5.s.f366467g || (maxHeightWxRecyclerView = this.f120664a) == null) {
            return;
        }
        maxHeightWxRecyclerView.post(new com.tencent.mm.plugin.finder.live.wish.view.v(this, maxHeightWxRecyclerView));
    }

    public final void j(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        r45.nw1 nw1Var;
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        cl0.g gVar = new cl0.g();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        java.lang.String str3 = "";
        if (e1Var == null || (nw1Var = e1Var.f328988r) == null || (str = java.lang.Long.valueOf(nw1Var.getLong(0)).toString()) == null) {
            str = "";
        }
        gVar.h("liveId", str);
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        gVar.h("objectId", pm0.v.u(e1Var2 != null ? e1Var2.f328983m : 0L));
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null && (str2 = c1Var.f328852o) != null) {
            str3 = str2;
        }
        gVar.h("finderUserName", str3);
        gVar.h("liveToken", "test");
        gk2.e eVar = dk2.ef.I;
        gVar.r("isAnchor", eVar != null ? zl2.r4.f473950a.y1(eVar) : false);
        com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[getLiteAppStoreData] nativeData = " + gVar);
        sVar.d(kz5.b1.e(new jz5.l("nativeData", gVar)));
        sVar.f144167d = new com.tencent.mm.plugin.finder.live.wish.view.n(this, sVar, finderJumpInfo);
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f120664a;
        if (maxHeightWxRecyclerView == null || (context = maxHeightWxRecyclerView.getContext()) == null) {
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(context, finderJumpInfo, sVar);
    }

    public final void k(qs5.s scene) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        df2.c9 c9Var;
        zg2.d dVar;
        r45.zv1 zv1Var;
        kotlin.jvm.internal.o.g(scene, "scene");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        boolean z17 = false;
        if (liveRoomControllerStore != null && (c9Var = (df2.c9) liveRoomControllerStore.controller(df2.c9.class)) != null && (dVar = c9Var.f229867m) != null && (zv1Var = (r45.zv1) dVar.getValue()) != null && zv1Var.getBoolean(0)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[refreshData] hasGiftWallNow = " + z17);
        this.f120679p = scene;
        if (!z17) {
            i();
            return;
        }
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f120664a;
        if (maxHeightWxRecyclerView == null || (k0Var = dk2.ef.f233380e) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.n(k0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.wish.view.u(this, maxHeightWxRecyclerView, scene, null), 2, null);
    }

    public final void l(java.lang.String str) {
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.M1, str, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.Z1, str, 0L, null, null, null, null, null, 252, null);
        }
    }
}
