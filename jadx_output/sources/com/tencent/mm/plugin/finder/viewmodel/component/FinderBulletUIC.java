package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class FinderBulletUIC extends com.tencent.mm.ui.component.UIComponent implements h81.a {
    public static final com.tencent.mm.plugin.finder.viewmodel.component.u4 A = new com.tencent.mm.plugin.finder.viewmodel.component.u4(null);
    public static final jz5.g B = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.t4.f135976d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f133494d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f133495e;

    /* renamed from: f, reason: collision with root package name */
    public int f133496f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f133497g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.k8 f133498h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f133499i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f133500m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f133501n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f133502o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f133503p;

    /* renamed from: q, reason: collision with root package name */
    public bb2.a1 f133504q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f133505r;

    /* renamed from: s, reason: collision with root package name */
    public long f133506s;

    /* renamed from: t, reason: collision with root package name */
    public in5.s0 f133507t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f133508u;

    /* renamed from: v, reason: collision with root package name */
    public long f133509v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f133510w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f133511x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.m5 f133512y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC$danmukuEventListener$1 f133513z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC$danmukuEventListener$1] */
    public FinderBulletUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133494d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.d6(this));
        this.f133497g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.g5(this));
        this.f133499i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.e5(activity));
        this.f133500m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.c5(this));
        this.f133501n = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.d5(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.b5(this));
        this.f133502o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.a5(this));
        this.f133503p = new java.util.ArrayList();
        this.f133511x = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.n5.f135259d);
        this.f133512y = new com.tencent.mm.plugin.finder.viewmodel.component.m5(this, activity);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133513z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCnyPostDanmakuEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC$danmukuEventListener$1
            {
                this.__eventId = -2035143965;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderCnyPostDanmakuEvent finderCnyPostDanmakuEvent) {
                com.tencent.mm.autogen.events.FinderCnyPostDanmakuEvent event = finderCnyPostDanmakuEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_POST_DANMUKU_INT;
                int r17 = c17.r(u3Var, 0);
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_POST_DANMUKU_TIME_LONG;
                long t17 = c18.t(u3Var2, 0L);
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.this;
                am.qa qaVar = event.f54260g;
                if (t17 == 0) {
                    gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(currentTimeMillis));
                    gm0.j1.u().c().x(u3Var, 1);
                } else if (currentTimeMillis - t17 > 60) {
                    gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(currentTimeMillis));
                    gm0.j1.u().c().x(u3Var, 1);
                } else {
                    if (r17 > 10) {
                        int i17 = qaVar.f7700a;
                        java.lang.String str = qaVar.f7701b;
                        com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
                        finderBulletUIC.d7(false, i17, str, false);
                        return true;
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                }
                com.tencent.mars.xlog.Log.i("FinderBulletUIC", "danmukuEventListener " + qaVar.f7701b + ", " + qaVar.f7702c);
                in5.s0 s0Var = finderBulletUIC.f133507t;
                if (s0Var == null) {
                    return false;
                }
                in5.c cVar = (in5.c) s0Var.f293125i;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
                if (baseFinderFeed == null) {
                    return false;
                }
                java.lang.String content = qaVar.f7701b;
                kotlin.jvm.internal.o.f(content, "content");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.S6(finderBulletUIC, content, s0Var, baseFinderFeed, qaVar.f7700a, 0L, 16, null);
                return true;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if ((r9 != null && r9.g2()) != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC r28, in5.s0 r29, boolean r30, boolean r31, boolean r32, int r33, java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC, in5.s0, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    public static void S6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, java.lang.String str, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, long j17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC2;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        long j18 = (i18 & 16) != 0 ? 0L : j17;
        finderBulletUIC.getClass();
        if (!hc2.o0.g(baseFinderFeed.getFeedObject().getFeedObject())) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = s0Var.f293121e.getString(com.tencent.mm.R.string.f492524gu4);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(context, string);
            com.tencent.mars.xlog.Log.w("FinderBulletUIC", "doPostBullet: this feed is close bullet, feedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
            return;
        }
        if (kotlin.jvm.internal.o.b(finderBulletUIC.U6().findViewById(com.tencent.mm.R.id.e_x).getTag(), java.lang.Boolean.FALSE)) {
            com.tencent.mars.xlog.Log.i("FinderBulletUIC", "doPostBullet: reopen bullet switch feedId=" + pm0.v.u(baseFinderFeed.getItemId()) + ", isSelf=" + finderBulletUIC.a7());
            finderBulletUIC2 = finderBulletUIC;
            Q6(finderBulletUIC2, s0Var, false, false, true, 4, null);
        } else {
            finderBulletUIC2 = finderBulletUIC;
        }
        finderBulletUIC2.f133505r = false;
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ni(s0Var, baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject());
        java.lang.String c17 = hc2.t.c(finderBulletUIC.getActivity(), hc2.o0.K(baseFinderFeed.getFeedObject().getFeedObject()));
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "doPostBullet: post feedId=" + pm0.v.u(baseFinderFeed.getItemId()) + ", isSelf=" + finderBulletUIC.a7());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(finderBulletUIC.getContext(), c17, 1, new com.tencent.mm.plugin.finder.viewmodel.component.f5(finderBulletUIC, str, i19, j18));
    }

    public static boolean X6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        cw2.ca caVar;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X62;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        android.view.View U6 = finderBulletUIC.U6();
        if (U6 == null || U6.getVisibility() != 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "hideBulletInputLayout: feedId=" + pm0.v.u(finderBulletUIC.f133506s) + "} " + finderBulletUIC.f133509v);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127713g8).getValue()).r()).booleanValue()) {
            if (finderBulletUIC.f133505r) {
                androidx.appcompat.app.AppCompatActivity activity = finderBulletUIC.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
                if (ptVar != null && (X6 = ptVar.X6()) != null) {
                    X6.p(false, 0);
                }
            } else {
                if (s0Var == null || (caVar = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd)) == null) {
                    caVar = s0Var != null ? (com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar) s0Var.p(com.tencent.mm.R.id.frt) : null;
                }
                if (caVar != null) {
                    caVar.t("exitBulletInput");
                }
                androidx.appcompat.app.AppCompatActivity activity2 = finderBulletUIC.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
                if (ptVar2 != null && (X62 = ptVar2.X6()) != null) {
                    X62.p(true, 1);
                }
            }
            finderBulletUIC.f133505r = false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideBulletInputLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideBulletInputLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.appcompat.app.AppCompatActivity activity3 = finderBulletUIC.getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity3).hideVKB();
        finderBulletUIC.g7(z17);
        finderBulletUIC.c7(false);
        finderBulletUIC.f133496f = 0;
        com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T6 = finderBulletUIC.T6();
        if (T6 != null) {
            T6.a();
        }
        finderBulletUIC.V6().f210400e = null;
        android.view.ViewParent parent = finderBulletUIC.T6().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(finderBulletUIC.U6());
        }
        yz5.a aVar = finderBulletUIC.f133510w;
        if (aVar != null) {
            aVar.invoke();
        }
        finderBulletUIC.f133509v = 0L;
        finderBulletUIC.f133510w = null;
        finderBulletUIC.getActivity().getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(finderBulletUIC.f133512y);
        return true;
    }

    public final void O6(in5.s0 holder, com.tencent.mm.plugin.finder.feed.k8 contract, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f133498h = contract;
        java.lang.Object obj = holder.f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var != null && u1Var.g2()) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.edq);
            if (p17 != null && z17) {
                int h17 = com.tencent.mm.ui.bl.h(getActivity());
                android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = h17 + getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f13do);
                p17.requestLayout();
            }
            bb2.p0 p0Var = bb2.p0.f18940a;
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            bb2.a1 a17 = p0Var.a(itemView);
            if (a17 != null) {
                boolean z18 = false;
                if (u1Var.g2()) {
                    android.view.View view = a17.getView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "bindBullet", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "bindBullet", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z18 = true;
                } else {
                    android.view.View view2 = a17.getView();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "bindBullet", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "bindBullet", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.i("FinderBulletUIC", "bindBullet: feedId=" + pm0.v.u(u1Var.getItemId()) + "}, isShowBullet=" + z18);
                long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
                long longExtra2 = getIntent().getLongExtra("KEY_BULLET_COMMENT_ID", 0L);
                long longExtra3 = getIntent().getLongExtra("KEY_REPLY_BULLET_COMMENT_ID", 0L);
                long longExtra4 = getIntent().getLongExtra("KEY_REPLY_BULLET_TIMESTAMP", 0L);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (longExtra == u1Var.getItemId()) {
                    if (longExtra3 != 0) {
                        linkedList.add(java.lang.Long.valueOf(longExtra3));
                    }
                    if (longExtra2 != 0) {
                        linkedList.add(java.lang.Long.valueOf(longExtra2));
                    }
                }
                if (!linkedList.isEmpty()) {
                    a17.setOnAfterPlaySeekListener(new com.tencent.mm.plugin.finder.viewmodel.component.v4(holder, longExtra4));
                }
                a17.d(u1Var, linkedList);
                a17.getView().post(new com.tencent.mm.plugin.finder.viewmodel.component.w4(holder, u1Var, a17));
                bb2.w1 bulletManager = a17.getBulletManager();
                bulletManager.f19043h = new com.tencent.mm.plugin.finder.viewmodel.component.z4(holder, this, u1Var, a17, bulletManager);
            }
        }
    }

    public final void P6(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, boolean z18) {
        cw2.da videoView;
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "bulletBtnClick: isLightMode=" + z17 + ", isLand=" + z18 + ", " + hc2.b0.f(baseFinderFeed, true) + ' ' + this.f133509v);
        if (!z18) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
            if ((finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null || videoView.isPlaying()) ? false : true) {
                java.lang.Object obj = s0Var.f293125i;
                so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                bb2.m0 m0Var = bb2.m0.f18918a;
                android.app.Activity context = getContext();
                android.app.Activity context2 = getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(u1Var != null ? u1Var.getItemId() : 0L));
                bb2.m0.b(m0Var, context, V6, "bullet_screen_button", true, jSONObject, false, 0, 64, null);
            }
        }
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        androidx.appcompat.app.AppCompatActivity context3 = getActivity();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.l0.h(l0Var, nyVar != null ? nyVar.V6() : null, baseFinderFeed.getFeedObject(), 114, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 114))), 0, null, 48, null);
        android.view.KeyEvent.Callback callback = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (callback == null) {
            callback = s0Var.p(com.tencent.mm.R.id.frt);
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127713g8).getValue()).r()).booleanValue() && callback != null) {
            cw2.ca caVar = (cw2.ca) callback;
            this.f133505r = caVar.getIsSeekMode();
            cw2.ca.d(caVar, null, false, 3, null);
        }
        i7(s0Var, baseFinderFeed, z17, z18, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.d() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R6() {
        /*
            r2 = this;
            rl5.r r0 = bb2.l0.f18909b
            if (r0 == 0) goto Lc
            boolean r0 = r0.d()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L16
            rl5.r r0 = bb2.l0.f18909b
            if (r0 == 0) goto L16
            r0.a()
        L16:
            r0 = 0
            bb2.l0.f18909b = r0
            com.tencent.mm.modelbase.i r1 = bb2.l0.f18911d
            if (r1 == 0) goto L20
            r1.j()
        L20:
            bb2.l0.f18911d = r0
            az2.f r1 = bb2.l0.f18912e
            if (r1 == 0) goto L29
            r1.b()
        L29:
            bb2.l0.f18912e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.R6():void");
    }

    public final com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T6() {
        return (com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout) ((jz5.n) this.f133501n).getValue();
    }

    public final android.view.View U6() {
        return (android.view.View) ((jz5.n) this.f133499i).getValue();
    }

    public final com.tencent.mm.ui.tools.f5 V6() {
        return (com.tencent.mm.ui.tools.f5) ((jz5.n) this.f133497g).getValue();
    }

    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel W6() {
        java.lang.Object value = ((jz5.n) this.f133494d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.pluginsdk.ui.ChatFooterPanel) value;
    }

    public final void Y6(in5.s0 s0Var, boolean z17) {
        android.view.View floatPlayIcon;
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "hideOtherViews: feedId=" + pm0.v.u(this.f133506s) + "}， onlySeekBar=" + z17);
        java.util.ArrayList<android.view.View> arrayList = this.f133503p;
        if (!z17) {
            arrayList.add(s0Var.p(com.tencent.mm.R.id.f484486ee3));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.g1y);
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            arrayList.add(viewGroup);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
        if (finderFullSeekBarLayout != null && (floatPlayIcon = finderFullSeekBarLayout.getFloatPlayIcon()) != null && floatPlayIcon.getVisibility() == 0) {
            arrayList.add(floatPlayIcon);
        }
        for (android.view.View view : arrayList) {
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final boolean Z6() {
        return U6().getParent() != null && U6().getVisibility() == 0;
    }

    public final boolean a7() {
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f133498h;
        if (k8Var != null) {
            return k8Var.d0();
        }
        return false;
    }

    public final void b7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, r45.oo bulletInfo) {
        int i17;
        int i18;
        int integer;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        int i19 = bulletInfo.getInteger(9) == 1 ? 1 : 0;
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "likeBulletComment " + hc2.b0.f(feed, true) + " onLike: like_flag:" + bulletInfo.getInteger(9) + ", like_count:" + bulletInfo.getInteger(8));
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
        yj0Var.field_feedId = feed.getItemId();
        yj0Var.field_dupFlag = feed.w();
        yj0Var.u0().setCommentId(bulletInfo.getLong(0));
        yj0Var.u0().setLikeFlag(bulletInfo.getInteger(9));
        yj0Var.u0().setLikeCount(bulletInfo.getInteger(8));
        java.lang.String string = bulletInfo.getString(2);
        if (string == null) {
            string = "";
        }
        yj0Var.u0().setContent(string);
        yj0Var.u0().setContent_type((int) bulletInfo.getLong(1));
        com.tencent.mm.plugin.finder.storage.FinderItem b17 = com.tencent.mm.plugin.finder.storage.h90.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion, feed.getFeedObject().getFeedObject(), 0, 2, null);
        int i27 = i19 ^ 1;
        com.tencent.mm.plugin.finder.viewmodel.component.j5 j5Var = new com.tencent.mm.plugin.finder.viewmodel.component.j5(bulletInfo, feed, yj0Var);
        if (hz2.d.f286313a.a("like")) {
            i17 = 0;
        } else {
            i17 = 0;
            nv2.n1.f340551h.d(b17.getId(), b17.getDupFlag(), b17.getObjectNonceId(), yj0Var, i27 != 0 ? nv2.x1.f340631i : nv2.x1.f340632m, hc2.o0.K(b17.getFeedObject()), j5Var, V6, hc2.o0.H(b17.getFeedObject()), null, 0, null);
        }
        bulletInfo.set(9, java.lang.Integer.valueOf(i27));
        if (i19 != 0) {
            i18 = 8;
            integer = bulletInfo.getInteger(8) - 1;
            if (integer < 0) {
                integer = i17;
            }
        } else {
            i18 = 8;
            integer = bulletInfo.getInteger(8) + 1;
        }
        bulletInfo.set(i18, java.lang.Integer.valueOf(integer));
    }

    public final void c7(boolean z17) {
        if (this.f133496f != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "onHideSmileyPanel: feedId=" + pm0.v.u(this.f133506s) + '}');
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) U6().findViewById(com.tencent.mm.R.id.g4v);
        if (weImageView != null) {
            weImageView.setImageResource(this.f133508u ? com.tencent.mm.R.raw.icons_outlined_sticker : com.tencent.mm.R.raw.icons_filled_sticker);
            weImageView.setIconColor(getContext().getResources().getColor(this.f133508u ? com.tencent.mm.R.color.f478714f5 : com.tencent.mm.R.color.f478553an));
        }
        W6().animate().alpha(0.0f).setDuration(220L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.k5(this)).start();
        if (z17 && this.f133496f == 2) {
            int c17 = com.tencent.mm.ui.bl.c(getActivity());
            boolean z18 = getActivity().getResources().getConfiguration().orientation == 1;
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel W6 = W6();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            if (z18) {
                layoutParams.bottomMargin = c17;
            } else {
                layoutParams.setMarginEnd(c17);
            }
            W6.setLayoutParams(layoutParams);
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T6 = T6();
            if (T6 != null) {
                T6.a();
            }
        }
        if (U6().getVisibility() == 0) {
            this.f133496f = 1;
        }
    }

    public final void d7(boolean z17, int i17, java.lang.String str, boolean z18) {
        com.tencent.mm.autogen.events.OnFinderCnyPostDanmakuCallbackEvent onFinderCnyPostDanmakuCallbackEvent = new com.tencent.mm.autogen.events.OnFinderCnyPostDanmakuCallbackEvent();
        am.pm pmVar = onFinderCnyPostDanmakuCallbackEvent.f54570g;
        pmVar.f7631a = i17;
        pmVar.f7632b = z17 ? 1 : 0;
        pmVar.f7633c = str;
        in5.s0 s0Var = this.f133507t;
        java.lang.Object obj = s0Var != null ? (in5.c) s0Var.f293125i : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            pmVar.f7634d = baseFinderFeed.getItemId();
        }
        onFinderCnyPostDanmakuCallbackEvent.b(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "PostDanmakuCallbackEvent: " + pmVar.f7633c + ", isSuc: " + pmVar.f7632b + ", " + pmVar.f7634d);
        in5.s0 s0Var2 = this.f133507t;
        if (s0Var2 != null) {
            android.content.Context context = s0Var2.f293121e;
            if (z17) {
                db5.t7.f(context, context.getString(com.tencent.mm.R.string.m1z), com.tencent.mm.plugin.finder.viewmodel.component.l5.f135022a);
            } else {
                if (z18) {
                    return;
                }
                db5.t7.n(context, context.getString(com.tencent.mm.R.string.m1y));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if ((r6 != null && r6.g2()) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(in5.s0 r19, com.tencent.mm.plugin.finder.model.BaseFinderFeed r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.e7(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void f7(boolean z17, android.view.View view, boolean z18) {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e_x);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.g4v);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
        if (poVar != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) poVar.f135572d.f().p(com.tencent.mm.R.id.g4n)) != null) {
            weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_outlined_channels_bullet_2 : com.tencent.mm.R.raw.icons_outlined_bullet_close);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) view.findViewById(com.tencent.mm.R.id.g4o);
        boolean a76 = a7();
        imageView.setVisibility(a76 ? 8 : 0);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        android.view.View bulletBtnLayout = (ptVar == null || (X6 = ptVar.X6()) == null) ? null : X6.getBulletBtnLayout();
        if (bulletBtnLayout != null) {
            bulletBtnLayout.setClickable(true);
        }
        int i17 = com.tencent.mm.R.raw.bullet_screen_on_filled;
        int i18 = z17 ? com.tencent.mm.R.raw.bullet_screen_on_filled : com.tencent.mm.R.raw.bullet_screen_off_filled;
        if (this.f133508u) {
            if (z17) {
                i17 = com.tencent.mm.R.raw.bullet_screen_off_filled;
            }
            imageView.setImageResource(i17);
        } else {
            imageView.setImageResource(i18);
        }
        if (z17 || a76) {
            weImageView2.setEnabled(true);
            weImageView2.setAlpha(1.0f);
            mMEditText.setHint(com.tencent.mm.R.string.cx_);
            mMEditText.setEnabled(true);
            if (z18) {
                mMEditText.requestFocus();
            }
        }
    }

    public final void g7(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "restoreHiddenViews: feedId=" + pm0.v.u(this.f133506s) + '}');
        java.util.ArrayList<android.view.View> arrayList = this.f133503p;
        for (android.view.View view : arrayList) {
            if (view != null && view.getVisibility() == 8) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z17) {
                    view.animate().cancel();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().alpha(1.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.z5(view)).start();
                }
            }
        }
        arrayList.clear();
    }

    public final void h7(float f17) {
        bb2.a1 a1Var = this.f133504q;
        android.view.View view = a1Var != null ? a1Var.getView() : null;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "setBulletAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "setBulletAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void i7(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, boolean z18, long j17) {
        bb2.w1 bulletManager;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        Y6(s0Var, false);
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        boolean z19 = ((object_extend != null ? object_extend.getLong(30) : 0L) & 4) > 0;
        if (z19) {
            android.view.View findViewById = U6().findViewById(com.tencent.mm.R.id.qke);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = U6().findViewById(com.tencent.mm.R.id.g4p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = U6().findViewById(com.tencent.mm.R.id.g4v);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById4 = U6().findViewById(com.tencent.mm.R.id.qke);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = U6().findViewById(com.tencent.mm.R.id.g4p);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = U6().findViewById(com.tencent.mm.R.id.g4v);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f133496f = 1;
        this.f133508u = z17;
        android.view.ViewParent parent = U6().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(U6());
        }
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) decorView).addView(U6());
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar != null && (X6 = ptVar.X6()) != null) {
            X6.p(false, 4);
        }
        android.view.View U6 = U6();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(U6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6().animate().cancel();
        android.view.View U62 = U6();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(U62, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        U62.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
        yj0.a.f(U62, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "showCommentInputContainer", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (!z19) {
            V6().f210400e = T6();
            V6().f();
            android.widget.EditText editText = (android.widget.EditText) U6().findViewById(com.tencent.mm.R.id.g4o);
            if (editText != null) {
                editText.setFocusableInTouchMode(true);
                editText.post(new com.tencent.mm.plugin.finder.viewmodel.component.b6(editText, this));
            }
        }
        ((android.widget.ImageView) U6().findViewById(com.tencent.mm.R.id.e_x)).setVisibility(a7() ? 8 : 0);
        android.content.res.Resources resources = getContext().getResources();
        int dimensionPixelOffset = z18 ? resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df) : resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T6 = T6();
        if (z19) {
            T6.setPadding(dimensionPixelOffset, T6.getPaddingTop(), dimensionPixelOffset, com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a));
        } else {
            T6.setPadding(dimensionPixelOffset, T6.getPaddingTop(), dimensionPixelOffset, getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
        }
        android.widget.EditText editText2 = (android.widget.EditText) U6().findViewById(com.tencent.mm.R.id.g4o);
        if (j17 != 0) {
            editText2.setHint(com.tencent.mm.R.string.o8n);
        } else {
            editText2.setHint(com.tencent.mm.R.string.cx_);
        }
        int i17 = com.tencent.mm.R.color.f479252u4;
        if (z17) {
            T6().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_97));
            editText2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            editText2.setHintTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        } else {
            T6().setBackground(null);
            editText2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
            editText2.setHintTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479252u4));
        }
        android.widget.TextView textView = (android.widget.TextView) T6().findViewById(com.tencent.mm.R.id.g4x);
        android.content.res.Resources resources2 = getContext().getResources();
        if (z17) {
            i17 = com.tencent.mm.R.color.BW_0_Alpha_0_5;
        }
        textView.setTextColor(resources2.getColor(i17));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) U6().findViewById(com.tencent.mm.R.id.g4v);
        if (weImageView != null) {
            weImageView.setIconColor(getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.f478714f5 : com.tencent.mm.R.color.f478553an));
            weImageView.setImageResource(z17 ? com.tencent.mm.R.raw.icons_outlined_sticker : com.tencent.mm.R.raw.icons_filled_sticker);
        }
        U6().findViewById(com.tencent.mm.R.id.g4p).setBackgroundResource(z17 ? com.tencent.mm.R.drawable.f481931al2 : com.tencent.mm.R.drawable.f481930al1);
        bb2.a1 a1Var = this.f133504q;
        if (a1Var != null && (bulletManager = a1Var.getBulletManager()) != null) {
            long currentPosMs = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)).getCurrentPosMs();
            com.tencent.mars.xlog.Log.i("FinderBulletManager", "recordClickBulletBtnTime: videoTimeMs=" + currentPosMs + ", currentTime=" + bulletManager.f19039d);
            long j18 = bulletManager.f19039d;
            if (currentPosMs <= j18) {
                currentPosMs = j18;
            }
            bulletManager.f19044i = currentPosMs;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f133500m).getValue();
        if (linearLayout != null && !kotlin.jvm.internal.o.b(W6().getParent(), linearLayout)) {
            if (W6().getParent() != null) {
                android.view.ViewParent parent2 = W6().getParent();
                kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent2).removeView(W6());
            }
            linearLayout.addView(W6(), new android.widget.LinearLayout.LayoutParams(-1, 0));
        }
        com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T62 = T6();
        if (T62 != null) {
            T62.setOnKeyboardChange(new com.tencent.mm.plugin.finder.viewmodel.component.c6(s0Var, this));
        }
    }

    public final void k7() {
        android.widget.EditText editText = (android.widget.EditText) U6().findViewById(com.tencent.mm.R.id.g4o);
        if (editText == null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).showVKB();
        } else {
            android.view.inputmethod.InputMethodManager b17 = com.tencent.mm.plugin.appbrand.widget.input.m5.b(editText);
            if (b17.showSoftInput(editText, 1)) {
                return;
            }
            b17.showSoftInput(editText, 2);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1.d() == true) goto L8;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r3 = this;
            r0 = 0
            r3.f133504q = r0
            r3.f133507t = r0
            rl5.r r1 = bb2.l0.f18909b
            if (r1 == 0) goto L11
            boolean r1 = r1.d()
            r2 = 1
            if (r1 != r2) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L1b
            rl5.r r1 = bb2.l0.f18909b
            if (r1 == 0) goto L1b
            r1.a()
        L1b:
            bb2.l0.f18909b = r0
            com.tencent.mm.modelbase.i r1 = bb2.l0.f18911d
            if (r1 == 0) goto L24
            r1.j()
        L24:
            bb2.l0.f18911d = r0
            az2.f r1 = bb2.l0.f18912e
            if (r1 == 0) goto L2d
            r1.b()
        L2d:
            bb2.l0.f18912e = r0
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC$danmukuEventListener$1 r0 = r3.f133513z
            r0.dead()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.onDestroy():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        V6().d();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        V6().f();
    }
}
