package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nd0 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {
    public final com.tencent.mm.ui.widget.imageview.WeImageView A;
    public final android.widget.FrameLayout B;
    public final android.view.View C;
    public final jz5.g D;
    public final jz5.g E;
    public java.lang.String F;
    public java.lang.String G;
    public kotlinx.coroutines.r2 H;
    public final com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$followListener$1 I;

    /* renamed from: J, reason: collision with root package name */
    public int f113614J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final jz5.g P;
    public com.tencent.mm.view.LazyPlayPAGView Q;
    public com.tencent.mm.plugin.finder.live.widget.h3 R;
    public int S;
    public zy2.gc T;
    public final jz5.g V1;
    public final jz5.g W1;
    public final jz5.g X1;
    public int Y1;
    public final jz5.g Z1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113615p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f113616q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f113617r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f113618s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f113619t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f113620u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f113621v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f113622w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f113623x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f113624y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f113625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$followListener$1] */
    public nd0(android.view.ViewGroup root, qo0.c statusMonitor, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113615p = statusMonitor;
        this.f113616q = "PORTRAIT_ACTION_GOTO_PROFILE_TITLE";
        android.content.Context context = root.getContext();
        this.f113617r = context;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ifw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f113618s = imageView;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.ifv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f113619t = (com.tencent.mm.view.MMPAGView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.m6o);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f113620u = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.m6p);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f113621v = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.ify);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f113622w = textView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.ifz);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f113623x = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f483458ax2);
        ((android.widget.ImageView) findViewById7).setOnClickListener(this);
        kotlin.jvm.internal.o.f(findViewById7, "apply(...)");
        this.f113624y = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.i_e);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById8;
        this.f113625z = textView2;
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.i_g);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.A = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.i_h);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.B = (android.widget.FrameLayout) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.i_f);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = findViewById11;
        this.D = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.kc0(root));
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ic0(root));
        this.V1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.np0(root));
        this.W1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.mp0(root));
        this.X1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.lp0(root));
        this.Z1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.kp0(this));
        com.tencent.mm.ui.bl.c(root.getContext());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$followListener$1
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.nc0(event, com.tencent.mm.plugin.finder.live.plugin.nd0.this));
                return false;
            }
        };
        this.f113614J = 8;
        this.K = 1;
        this.L = 2;
        this.M = 3;
        this.N = 500L;
        this.P = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.sc0(this));
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ec0(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.fc0(this));
        imageView.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.bhp));
        d92.f fVar = d92.f.f227470a;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView, 15.0f, 0.0f, 8, null);
        android.content.Context context3 = root.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView2, 10.0f, 0.0f, 8, null);
        if (x0()) {
            android.view.ViewGroup viewGroup = this.f365323d;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(zl2.r4.f473950a.y0(this) - ((int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479671c8)));
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.x1()) {
            r4Var.d(this);
        }
        P1(this, null, false, 1, null);
        E1(imageView, "finder_live_room_avatar", 8);
        E1(textView, "finder_live_room_name", 8);
        E1(textView2, "finder_live_room_follow", 40);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(textView2, new com.tencent.mm.plugin.finder.live.plugin.gc0(this));
        this.S = 8;
    }

    public static void B1(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, boolean z17, int i17, java.lang.Object obj) {
        dk2.gf gfVar;
        nd0Var.getClass();
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) nd0Var.P0(mm2.c1.class)).f328852o);
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        boolean C1 = nd0Var.C1();
        dk2.Cif cif = dk2.Cif.f233626a;
        long j17 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f328988r.getLong(0);
        kk.l lVar = dk2.Cif.f233627b;
        boolean k17 = lVar.k(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveShowFollowBtnLogic", "hadTriggerShow " + k17);
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", w07 + "  followStatus = " + C1 + ", hadTriggerShow:" + k17);
        if (C1) {
            nd0Var.z1().removeMessages(nd0Var.K);
            nd0Var.I1(8);
            return;
        }
        if (!k17) {
            nd0Var.I1(8);
            nd0Var.z1().sendEmptyMessageDelayed(nd0Var.M, nd0Var.N);
            return;
        }
        long j18 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f328988r.getLong(0);
        if (lVar.k(java.lang.Long.valueOf(j18)) && (gfVar = (dk2.gf) lVar.get(java.lang.Long.valueOf(j18))) != null) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.u1 u1Var = ml2.u1.f328043f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("follow_icon_expose_condition", java.lang.String.valueOf(gfVar.f233528a.ordinal()));
            linkedHashMap.put("follow_icon_expose_condition_sessionid", gfVar.f233529b);
            zy2.zb.I8((zy2.zb) c17, u1Var, linkedHashMap, null, null, null, null, false, 124, null);
        }
        nd0Var.G1(false, "#1", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
    }

    public static final void H1(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] in " + z18);
        if (nd0Var.Q == null) {
            android.content.Context context = nd0Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            nd0Var.Q = new com.tencent.mm.view.LazyPlayPAGView(context, null, 0, 6, null);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = nd0Var.Q;
            if (lazyPlayPAGView != null) {
                lazyPlayPAGView.o(ae2.in.f3688a.a(ym5.f6.C));
            }
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView2 = nd0Var.Q;
        if (lazyPlayPAGView2 != null) {
            android.widget.FrameLayout frameLayout = nd0Var.B;
            if (!z18) {
                if (frameLayout.indexOfChild(lazyPlayPAGView2) != -1) {
                    lazyPlayPAGView2.n();
                    frameLayout.removeView(lazyPlayPAGView2);
                    return;
                }
                return;
            }
            if (frameLayout.indexOfChild(lazyPlayPAGView2) == -1) {
                android.view.View view = nd0Var.C;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
                layoutParams.gravity = 17;
                com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView3 = nd0Var.Q;
                if (lazyPlayPAGView3 != null) {
                    lazyPlayPAGView3.setLayoutParams(layoutParams);
                }
                frameLayout.addView(nd0Var.Q);
            }
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView4 = nd0Var.Q;
            if (lazyPlayPAGView4 != null) {
                com.tencent.mm.plugin.finder.live.util.y.m(nd0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.hd0(lazyPlayPAGView4, null), 3, null);
            }
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView5 = nd0Var.Q;
            if (lazyPlayPAGView5 != null) {
                lazyPlayPAGView5.a(new com.tencent.mm.plugin.finder.live.plugin.id0(nd0Var, z17));
            }
        }
    }

    public static void P1(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = nd0Var.V0().f309129d.f68542m;
            kotlin.jvm.internal.o.d(str);
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str == null) {
                str = ((mm2.c1) nd0Var.P0(mm2.c1.class)).f328852o;
            }
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        nd0Var.N1(str, z17);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        r45.a84 a84Var;
        kotlinx.coroutines.flow.f3 f3Var = ((mm2.n0) nd0Var.P0(mm2.n0.class)).f329271p;
        if (f3Var != null && (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) != null) {
            java.util.LinkedList list = a84Var.getList(1);
            if (!(list == null || list.isEmpty())) {
                java.lang.String str = ((mm2.c1) nd0Var.P0(mm2.c1.class)).f328852o;
                if (str == null) {
                    str = "";
                }
                ya2.b2 b17 = str.length() > 0 ? ya2.h.f460484a.b(str) : null;
                android.content.Context context = nd0Var.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String w07 = b17 != null ? b17.w0() : null;
                if (w07 == null) {
                    w07 = "";
                }
                java.lang.String avatarUrl = b17 != null ? b17.getAvatarUrl() : null;
                r3 = qe2.l.d(context, a84Var, str, w07, avatarUrl != null ? avatarUrl : "");
            }
        }
        if (r3) {
            return;
        }
        if (zl2.r4.f473950a.w1()) {
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3843p4).getValue()).r()).booleanValue()) {
                qo0.c.a(nd0Var.f113615p, qo0.b.f365434x3, null, 2, null);
                return;
            }
            return;
        }
        boolean x07 = nd0Var.x0();
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "goToAnchorFinderProfile isLandscape:" + x07);
        if (x07) {
            com.tencent.mm.plugin.finder.live.plugin.l.s1(nd0Var, nd0Var.f113616q, null, 0, 6, null);
        } else {
            nd0Var.A1();
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.Z = true;
        ml2.r0.hj(r0Var, ml2.b4.f327255p, null, 0L, null, null, null, null, null, 252, null);
        r0Var.D++;
    }

    public final void A1() {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        java.lang.Object value = ((mm2.c1) P0(mm2.c1.class)).P5.getValue();
        android.view.ViewGroup viewGroup = this.f365323d;
        if (value == null) {
            if (D1()) {
                zl2.q4 q4Var = zl2.q4.f473933a;
                java.lang.String x17 = x1();
                java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f328852o;
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                q4Var.G(x17, str, context, ((mm2.c1) P0(mm2.c1.class)).f328861p2, java.lang.String.valueOf(((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0)), 2);
                return;
            }
            dk2.q4 q4Var2 = dk2.q4.f233938a;
            android.content.Context context2 = this.f113617r;
            gk2.e S0 = S0();
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
            android.content.Context context3 = this.f113617r;
            kotlin.jvm.internal.o.f(context3, "context");
            pf5.z zVar = pf5.z.f353948a;
            boolean z17 = context3 instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context3;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(appCompatActivity).c(zy2.ra.class))).V6();
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.v9 v9Var = (zy2.v9) zVar.a(appCompatActivity).c(zy2.v9.class);
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = (com.tencent.mm.plugin.finder.live.viewmodel.aa) v9Var;
            r45.md5 md5Var = aaVar.f116907e;
            if (md5Var != null && md5Var.getLong(1) == j17) {
                com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h.a(intent, aaVar.f116906d, aaVar.f116907e);
            }
            dk2.q4.j(q4Var2, context2, S0, true, str2, V6, false, intent, 32, null);
            return;
        }
        if (this.R == null) {
            android.content.Context context4 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.h3 h3Var = new com.tencent.mm.plugin.finder.live.widget.h3(context4, this);
            this.R = h3Var;
            r45.bw1 bw1Var = (r45.bw1) ((mm2.c1) P0(mm2.c1.class)).P5.getValue();
            if (bw1Var != null) {
                h3Var.b(bw1Var);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var2 = this.R;
        if (h3Var2 != null) {
            r45.cw1 cw1Var = new r45.cw1();
            com.tencent.mm.plugin.finder.live.plugin.l lVar = h3Var2.f118513b;
            ya2.b2 b17 = ((mm2.c1) lVar.P0(mm2.c1.class)).Y4 ? ya2.h.f460484a.b(((mm2.c1) lVar.P0(mm2.c1.class)).f328852o) : ya2.h.f460484a.b(lVar.V0().f309129d.f68542m);
            if (((mm2.d) lVar.P0(mm2.d.class)).f328942f || lVar.V0().f309129d.f68552v == 4) {
                java.lang.String str3 = lVar.V0().f309129d.f68554x;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.length() == 0) {
                    str3 = ((mm2.d) lVar.P0(mm2.d.class)).f328944h;
                }
                cw1Var.set(1, str3);
                java.lang.String str4 = lVar.V0().f309129d.f68553w;
                java.lang.String str5 = str4 != null ? str4 : "";
                if (str5.length() == 0) {
                    str5 = ((mm2.d) lVar.P0(mm2.d.class)).f328943g;
                }
                cw1Var.set(0, str5);
                cw1Var.set(5, 2);
            } else {
                cw1Var.set(1, b17 != null ? b17.w0() : null);
                cw1Var.set(0, b17 != null ? b17.D0() : null);
                cw1Var.set(5, 1);
            }
            cw1Var.set(4, java.lang.Boolean.valueOf(((mm2.d) lVar.P0(mm2.d.class)).N6()));
            cw1Var.set(3, b17 != null ? b17.y0() : null);
            r45.dr2 dr2Var = new r45.dr2();
            if (b17 != null && (finderAuthInfo = b17.field_authInfo) != null) {
                dr2Var.set(1, java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType()));
                dr2Var.set(2, finderAuthInfo.getAuthIconUrl());
                dr2Var.set(0, finderAuthInfo.getAuthProfession());
            }
            cw1Var.set(2, dr2Var);
            h3Var2.f118515d = cw1Var;
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.g3(h3Var2.f118519h, h3Var2, cw1Var));
            r45.cw1 cw1Var2 = h3Var2.f118515d;
            if (cw1Var2 != null) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f327333e, cw1Var2.getInteger(5), cw1Var2.getString(0));
                ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f327335g, cw1Var2.getInteger(5), cw1Var2.getString(0));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorInfo, nickname: ");
                sb6.append(cw1Var2.getString(1));
                sb6.append(", isFollow: ");
                sb6.append(cw1Var2.getBoolean(4));
                sb6.append(", type: ");
                sb6.append(cw1Var2.getInteger(5));
                sb6.append(", authDesc: ");
                r45.dr2 dr2Var2 = (r45.dr2) cw1Var2.getCustom(2);
                sb6.append(dr2Var2 != null ? dr2Var2.getString(0) : null);
                sb6.append(", authType: ");
                r45.dr2 dr2Var3 = (r45.dr2) cw1Var2.getCustom(2);
                sb6.append(dr2Var3 != null ? java.lang.Integer.valueOf(dr2Var3.getInteger(1)) : null);
                sb6.append(", authUrl: ");
                r45.dr2 dr2Var4 = (r45.dr2) cw1Var2.getCustom(2);
                sb6.append(dr2Var4 != null ? dr2Var4.getString(2) : null);
                sb6.append(" avatarUrl: ");
                sb6.append(cw1Var2.getString(3));
                com.tencent.mars.xlog.Log.i(h3Var2.f118514c, sb6.toString());
            }
            h3Var2.f118522k.alive();
            com.tencent.mm.plugin.finder.live.util.y.m(h3Var2.f118513b, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.c3(h3Var2, null), 2, null);
            h3Var2.f118518g.i();
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).pj(ml2.c4.f327332d, 0, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", this.f113616q)) {
            com.tencent.mm.plugin.finder.live.plugin.bd0 bd0Var = new com.tencent.mm.plugin.finder.live.plugin.bd0(this, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(bd0Var, j17);
        }
    }

    public final boolean C1() {
        return ((mm2.d) P0(mm2.d.class)).N6();
    }

    public final boolean D1() {
        return ((mm2.d) P0(mm2.d.class)).f328942f || V0().f309129d.f68552v == 4;
    }

    public final void E1(android.view.View view, java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        if (this.f113615p.getLiveRole() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, kz5.b1.e(new jz5.l("is_biz_live", java.lang.Integer.valueOf(D1() ? 1 : 0))));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, i17, 25561);
        }
    }

    public final void F1(int i17) {
        this.S = i17;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            i17 = 8;
        }
        y1().setVisibility(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    public final void G1(boolean z17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[setFollowBtnState] source:" + str + ", isFollow:" + z17);
        I1(0);
        android.widget.TextView textView = this.f113625z;
        textView.setVisibility(0);
        if (this.f113615p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f327198e, D1());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] call false");
        H1(this, z17, false);
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = this.f113617r;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.A;
        android.widget.FrameLayout frameLayout = this.B;
        if (!z17) {
            z1().removeMessages(this.L);
            weImageView.setVisibility(0);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.aaz));
            textView.setPadding(0, 0, viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib), 0);
            textView.setText(context.getString(com.tencent.mm.R.string.dfd));
            K1(D1());
            textView.setTextSize(0, viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480459yj));
            zl2.r4.c3(zl2.r4.f473950a, this.f113625z, 0, 0, 6, null);
            frameLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.dd0(this));
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ed0(this));
            if (kotlin.jvm.internal.o.b(str, "#1")) {
                return;
            }
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            frameLayout.startAnimation(alphaAnimation);
            return;
        }
        boolean z18 = weImageView.getVisibility() == 0;
        weImageView.setVisibility(4);
        textView.setOnClickListener(null);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) && z18) {
            I1(0);
            textView.post(new com.tencent.mm.plugin.finder.live.plugin.fd0(this, z17));
            return;
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = this.Q;
        if (lazyPlayPAGView != null && frameLayout.indexOfChild(lazyPlayPAGView) != -1) {
            lazyPlayPAGView.n();
            frameLayout.removeView(lazyPlayPAGView);
        }
        if (frameLayout.getWidth() > 0) {
            frameLayout.getLayoutParams().width = frameLayout.getWidth();
        }
        weImageView.setVisibility(8);
        this.C.setBackground(viewGroup.getContext().getDrawable(com.tencent.mm.R.drawable.f481718a34));
        textView.setText(context.getString(com.tencent.mm.R.string.f492274fw4));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479250u2));
        textView.setTextSize(0, viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480460yk));
        textView.setPadding(0, 0, 0, 0);
        textView.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.gd0.f112684d);
    }

    public final void I1(int i17) {
        boolean booleanValue = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.c1) P0(mm2.c1.class)).f328922y5).getValue()).booleanValue();
        boolean F1 = zl2.r4.F1(S0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" setFollowLayoutVisible ");
        sb6.append(i17);
        sb6.append(" inSideBarStatus: ");
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sb6.append(((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f);
        sb6.append(", canShowFollowBtn:");
        sb6.append(booleanValue);
        sb6.append(", isCoLive:");
        sb6.append(F1);
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", sb6.toString());
        this.f113614J = i17;
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(pl2.x.class)).f356683f || !booleanValue || F1) {
            i17 = 8;
        }
        this.B.setVisibility(i17);
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (com.tencent.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.tencent.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
        this.f113625z.post(new com.tencent.mm.plugin.finder.live.plugin.cd0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(boolean r7, java.lang.String r8) {
        /*
            r6 = this;
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r1 = r0.w1()
            if (r7 == r1) goto L9
            return
        L9:
            gk2.e r1 = r6.S0()
            boolean r0 = r0.q1(r1)
            r1 = 0
            if (r0 == 0) goto L5b
            java.lang.Class<mm2.n2> r0 = mm2.n2.class
            androidx.lifecycle.c1 r2 = r6.P0(r0)
            mm2.n2 r2 = (mm2.n2) r2
            r45.eq1 r2 = r2.f329279g
            r3 = 1
            if (r2 == 0) goto L2a
            r4 = 4
            boolean r2 = r2.getBoolean(r4)
            if (r2 != r3) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L5b
            androidx.lifecycle.c1 r2 = r6.P0(r0)
            mm2.n2 r2 = (mm2.n2) r2
            r45.eq1 r2 = r2.f329279g
            if (r2 == 0) goto L3f
            boolean r2 = r2.getBoolean(r3)
            if (r2 != r3) goto L3f
            r2 = r3
            goto L40
        L3f:
            r2 = r1
        L40:
            if (r2 == 0) goto L5b
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.n2 r0 = (mm2.n2) r0
            boolean r0 = r0.f329278f
            if (r0 == 0) goto L5b
            java.lang.Class<uh4.c0> r0 = uh4.c0.class
            i95.m r0 = i95.n0.c(r0)
            uh4.c0 r0 = (uh4.c0) r0
            boolean r0 = r0.isTeenMode()
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r3 = r1
        L5c:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L97
            r6.F1(r1)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            r0.a(r7, r8, r3)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r8 = r6.y1()
            com.tencent.mm.plugin.finder.live.plugin.jd0 r0 = new com.tencent.mm.plugin.finder.live.plugin.jd0
            r0.<init>(r6)
            r8.setClickListener(r0)
            if (r7 != 0) goto L9e
            java.lang.Class<ml2.r0> r7 = ml2.r0.class
            i95.m r7 = i95.n0.c(r7)
            java.lang.String r8 = "getService(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            r0 = r7
            ml2.r0 r0 = (ml2.r0) r0
            ml2.j4 r1 = ml2.j4.f327612e
            r2 = 0
            com.tencent.mm.plugin.finder.live.plugin.eh0 r3 = com.tencent.mm.plugin.finder.live.plugin.eh0.f112419i
            r4 = 2
            r5 = 0
            ml2.r0.Lj(r0, r1, r2, r3, r4, r5)
            goto L9e
        L97:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            r0.a(r7, r8, r3)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.nd0.J1(boolean, java.lang.String):void");
    }

    public final void K1(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "#switchUiStyle isBizMode=" + z17 + " isAnchorFollowed: " + C1());
        android.widget.TextView textView = this.f113625z;
        com.tencent.mm.ui.fk.a(textView);
        android.content.Context context = this.f113617r;
        this.A.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        M1(false);
        boolean C1 = C1();
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.View view = this.C;
        if (C1 || textView.getTextColors().getDefaultColor() != context.getResources().getColor(com.tencent.mm.R.color.aaz)) {
            view.setBackground(viewGroup.getContext().getDrawable(com.tencent.mm.R.drawable.f481718a34));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479250u2));
        } else {
            view.setBackground(viewGroup.getContext().getDrawable(com.tencent.mm.R.drawable.f481717a33));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.aaz));
        }
    }

    public final void L1(r45.g84 g84Var) {
        fy2.d dVar = (fy2.d) P0(fy2.d.class);
        boolean z17 = true;
        java.lang.String string = g84Var != null ? g84Var.getString(1) : null;
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f113619t;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration url is null or empty.");
            dVar.f267239f = g84Var;
            mMPAGView.n();
            mMPAGView.setVisibility(4);
            return;
        }
        if (com.tencent.mm.vfs.w6.j(dVar.N6(g84Var))) {
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration local decorations exist.");
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.D));
            mMPAGView.setComposition(dVar.N6(g84Var));
            mMPAGView.setRepeatCount(-1);
            mMPAGView.g();
            dVar.f267239f = g84Var;
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration download decorations.");
            dVar.O6(g84Var, new com.tencent.mm.plugin.finder.live.plugin.ld0(g84Var, this, dVar));
        }
        mMPAGView.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            int i17 = this.K;
            if (ordinal == 39) {
                z1().removeMessages(i17);
                if (!(bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_SHAKE_VIEW", false))) {
                    z1().sendEmptyMessageDelayed(i17, 0L);
                    return;
                } else {
                    if (this.B.getVisibility() != 0) {
                        z1().sendEmptyMessageDelayed(i17, 0L);
                        return;
                    }
                    return;
                }
            }
            if (ordinal == 7) {
                com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "#statusChange START_LIVE");
                if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW") : false) {
                    L1(((fy2.d) P0(fy2.d.class)).f267239f);
                    return;
                } else {
                    B1(this, false, 1, null);
                    return;
                }
            }
            if (ordinal == 8) {
                z1().removeMessages(i17);
                return;
            } else if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void M1(boolean z17) {
        boolean z18 = true;
        if (!z17) {
            kotlinx.coroutines.r2 r2Var = this.H;
            if ((r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) != false) {
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.md0 md0Var = com.tencent.mm.plugin.finder.live.plugin.md0.f113489d;
        android.widget.TextView textView = this.f113620u;
        textView.setOnClickListener(md0Var);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(textView);
        r45.bw1 bw1Var = (r45.bw1) ((mm2.c1) P0(mm2.c1.class)).P5.getValue();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) P0(mm2.c1.class)).f328859p0;
        android.content.Context context = this.f113617r;
        jz5.f0 f0Var = null;
        if (bw1Var != null) {
            java.lang.String string = ((r45.cw1) bw1Var.getList(0).getFirst()).getString(1);
            if (string != null) {
                java.lang.String string2 = bw1Var.getString(1);
                if ((string2 == null || string2.length() == 0) == true) {
                    textView.setText(this.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d2d, string));
                } else {
                    textView.setText(bw1Var.getString(1));
                }
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
                textView.setVisibility(0);
                textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.oc0(this));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
                android.view.View view = this.f113621v;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToAdMode", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToAdMode", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (finderJumpInfo == null || finderJumpInfo.getJumpinfo_type() != 6) {
            if (D1()) {
                w1();
                return;
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) ((mm2.c1) P0(mm2.c1.class)).R2.getValue();
            if (charSequence != null && charSequence.length() != 0) {
                z18 = false;
            }
            if (!z18) {
                java.lang.String str = (java.lang.String) ((mm2.c1) P0(mm2.c1.class)).R2.getValue();
                textView.setText(str != null ? str : "");
                textView.setTextColor(android.graphics.Color.parseColor("#CCFFE285"));
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
            android.view.View view2 = this.f113621v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "updateExpandDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "updateExpandDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        java.lang.String report_info = finderJumpInfo.getReport_info();
        if (report_info != null) {
            java.lang.String str2 = (report_info.length() > 0) == true ? report_info : null;
            if (str2 != null) {
                try {
                    java.lang.String optString = new org.json.JSONObject(str2).optString("qualificat_id");
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    h0Var.f310123d = optString;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        if (!kotlin.jvm.internal.o.b(textView.getText(), finderJumpInfo.getWording())) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).fk(1, (java.lang.String) h0Var.f310123d);
        }
        textView.setText(finderJumpInfo.getWording());
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_80_GOLD));
        textView.setVisibility(0);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.qc0(this, finderJumpInfo, h0Var));
        android.view.View view3 = this.f113621v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToEligibilityMode", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToEligibilityMode", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fc, code lost:
    
        if ((r14.length() > 0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if ((r12.length() > 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03ed, code lost:
    
        if (zl2.r4.F1(S0()) != false) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v40, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N1(java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.nd0.N1(java.lang.String, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        z1().removeMessages(this.M);
        z1().removeMessages(this.K);
        z1().removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.c1) P0(mm2.c1.class)).P5;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        liveMutableData.removeObservers((com.tencent.mm.ui.MMActivity) context);
        android.widget.TextView textView = this.f113622w;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), 0, textView.getPaddingBottom());
        this.f113624y.setVisibility(8);
        this.f113623x.setVisibility(8);
        this.f113620u.setVisibility(8);
        I1(8);
        K1(false);
        dead();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void c1(boolean z17) {
        if (!z17) {
            I1(this.f113614J);
            F1(this.S);
            return;
        }
        this.f113328m = 65535;
        K0(0);
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() != 8) {
            frameLayout.setVisibility(4);
        }
        if (y1().getVisibility() != 8) {
            y1().setVisibility(4);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void h1(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        u1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.i92 i92Var;
        r45.k74 k74Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483458ax2 && (i92Var = (r45.i92) ((mm2.e1) P0(mm2.e1.class)).f328988r.getCustom(55)) != null && (k74Var = (r45.k74) i92Var.getCustom(2)) != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.setLite_app_info(k74Var);
            finderJumpInfo.setJumpinfo_type(6);
            ac4Var.set(1, finderJumpInfo);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ac4Var.set(2, bool);
            ac4Var.set(3, bool);
            ac4Var.set(4, 1);
            c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        if (r8.B.getVisibility() != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.nd0.u1():void");
    }

    public final void v1(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[doBlockOpLog] ");
        this.T = new com.tencent.mm.plugin.finder.live.plugin.jc0();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.b(ya2.r.f460525a, username, false, null, null, this.T, 12, null);
    }

    public final void w1() {
        boolean D1 = D1();
        android.widget.TextView textView = this.f113620u;
        if (D1) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.pc0(this));
            E1(textView, "finder_live_room_bizname", 8);
            textView.setTextColor(this.f113617r.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
            textView.setText(com.tencent.mm.R.string.e2_);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.view.View view = this.f113621v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToBizMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToBizMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String x1() {
        java.lang.String str = V0().f309129d.f68553w;
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? ((mm2.d) P0(mm2.d.class)).f328943g : str;
    }

    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget y1() {
        return (com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget) this.D.getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.c1) P0(mm2.c1.class)).P5;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        liveMutableData.observe((com.tencent.mm.ui.MMActivity) context, new com.tencent.mm.plugin.finder.live.plugin.tc0(this));
        alive();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.vc0(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.ad0(this, null), 3, null);
        B1(this, false, 1, null);
        M1(false);
        android.view.View view = (android.view.View) ((jz5.n) this.V1).getValue();
        if (view != null) {
            view.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.live.plugin.op0(this));
        }
    }

    public final com.tencent.mm.sdk.platformtools.n3 z1() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.P).getValue();
    }
}
