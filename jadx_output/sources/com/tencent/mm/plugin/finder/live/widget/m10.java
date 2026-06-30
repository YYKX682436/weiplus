package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m10 {
    public static final com.tencent.mm.plugin.finder.live.widget.pz R = new com.tencent.mm.plugin.finder.live.widget.pz(null);
    public static long S = 0;
    public static int T = 0;
    public static java.lang.String U = "";
    public static r45.xq1 V;
    public boolean A;
    public boolean B;
    public int C;
    public final int D;
    public final int E;
    public r45.ki1 F;
    public long G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f118998J;
    public final int K;
    public java.lang.String L;
    public java.lang.String M;
    public l81.b1 N;
    public final java.util.Map O;
    public boolean P;
    public long Q;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f118999a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f119000b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119001c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f119002d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f119003e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f119004f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f119005g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f119006h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f119007i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f119008j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f119009k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f119010l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f119011m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f119012n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f119013o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f119014p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f119015q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f119016r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f119017s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f119018t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f119019u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f119020v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.zz f119021w;

    /* renamed from: x, reason: collision with root package name */
    public long f119022x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f119023y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f119024z;

    public m10(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118999a = root;
        this.f119000b = statusMonitor;
        this.f119001c = basePlugin;
        this.f119021w = new com.tencent.mm.plugin.finder.live.widget.zz(this);
        this.C = -1;
        this.D = 1;
        this.E = 2;
        this.K = 1;
        this.O = new java.util.LinkedHashMap();
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        m10Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "showBottomSheet");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "team up, show bottom sheet after check");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
        if (y1Var != null) {
            kotlin.jvm.internal.o.d(y1Var);
            if (y1Var.f()) {
                return;
            }
        }
        android.content.Context context = m10Var.f118999a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        m10Var.s(context);
        m10Var.q(fr1Var);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
        boolean z17 = ((mm2.c1) lVar.P0(mm2.c1.class)).A7() == null;
        int intValue = ((java.lang.Number) ae2.in.f3826n7.r()).intValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "[openHalf] playTogetherJumpInfo is null:" + z17 + ", localSwitchValue:" + intValue);
        if (z17 || intValue == 2) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = m10Var.f119013o;
            if (y1Var2 != null) {
                y1Var2.s();
            }
        } else {
            df2.oj ojVar = (df2.oj) lVar.U0(df2.oj.class);
            if (ojVar != null) {
                ojVar.k7(r45.r84.ClickController, null);
            }
        }
        r45.fr1 fr1Var2 = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
        switch (((mm2.c1) lVar.P0(mm2.c1.class)).H2) {
            case 2:
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Uj((ml2.r0) c17, 9, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 3:
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.Uj((ml2.r0) c18, 11, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 4:
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.Uj((ml2.r0) c19, 7, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 5:
                i95.m c27 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                ml2.r0.Uj((ml2.r0) c27, 5, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 6:
                i95.m c28 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c28, "getService(...)");
                ml2.r0.Uj((ml2.r0) c28, 3, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 7:
                i95.m c29 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c29, "getService(...)");
                ml2.r0.Uj((ml2.r0) c29, 23, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            case 8:
                i95.m c37 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c37, "getService(...)");
                ml2.r0.Uj((ml2.r0) c37, 29, 0, null, fr1Var2 != null ? ml2.s0.b(fr1Var2) : null, 6, null);
                return;
            default:
                return;
        }
    }

    public static final void m(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.m10 m10Var, int i17) {
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                qo0.c cVar = m10Var.f119000b;
                qo0.b bVar = qo0.b.Z1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", str);
                bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_GAME_TEAM_UP_GIFT", true);
                bundle.putInt("PARAM_FINDER_LIVE_GAME_TEAM_UP_GIFT_MODE", i17);
                cVar.statusChange(bVar, bundle);
            }
        }
    }

    public final void b(yz5.p pVar) {
        android.content.Context context = this.f118999a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "team up, cgi check join team, userName = " + e17);
        if (e17 == null || e17.length() == 0) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "team up, userName is null");
            pVar.invoke(java.lang.Boolean.TRUE, null);
            return;
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) this.O).get(e17);
        if (obj == null) {
            obj = java.lang.Boolean.FALSE;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "team up, is adult, not send cgi");
            pVar.invoke(java.lang.Boolean.TRUE, null);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
            new db2.z1(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 1).l().K(new com.tencent.mm.plugin.finder.live.widget.a00(pVar, this, e17));
        }
    }

    public final void c(int i17, java.lang.String str) {
        r45.z87 z87Var;
        if (e()) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
            r45.fr1 fr1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
            r45.xq1 xq1Var = V;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanJumpGame lastLiveId:");
            sb6.append(S);
            sb6.append(", curMode:");
            sb6.append(i17);
            sb6.append(", lastClickGameTeamMode:");
            sb6.append(T);
            sb6.append(", lastClickGameInfo:");
            java.lang.String str2 = null;
            sb6.append(xq1Var != null ? xq1Var.getString(3) : null);
            sb6.append(", gameTeamInfo:");
            java.lang.String str3 = "";
            sb6.append(pm0.b0.g(fr1Var == null ? "" : fr1Var));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            if (i17 == T) {
                r45.fr1 fr1Var2 = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
                int i18 = T;
                if ((i18 == 0 || i18 == 1 || fr1Var2 == null) || fr1Var == null) {
                    return;
                }
                if (((mm2.c1) lVar.P0(mm2.c1.class)).H2 != T) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "anchor teamUpMode change. svrGameTeamUpMode = " + ((mm2.c1) lVar.P0(mm2.c1.class)).H2 + ", lastClickGameTeamMode = " + T);
                    return;
                }
                int integer = fr1Var.getInteger(0);
                android.view.ViewGroup viewGroup = this.f118999a;
                if (integer == 4 || fr1Var.getInteger(5) == 0) {
                    android.content.Context context = viewGroup.getContext();
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                    android.content.Context context2 = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    e4Var.f211776c = b3Var.i(context2, i17);
                    e4Var.c();
                    return;
                }
                this.f118998J = true;
                r45.h41 h41Var = (r45.h41) fr1Var.getCustom(21);
                java.lang.String string = h41Var != null ? h41Var.getString(1) : null;
                if (!(string == null || string.length() == 0)) {
                    r45.h41 h41Var2 = (r45.h41) fr1Var.getCustom(21);
                    if (h41Var2 != null) {
                        str2 = h41Var2.getString(1);
                    }
                } else if (xq1Var != null) {
                    str2 = xq1Var.getString(3);
                }
                com.tencent.mm.plugin.finder.live.widget.pz pzVar = R;
                com.tencent.mm.plugin.finder.live.plugin.l lVar2 = this.f119001c;
                android.content.Context context3 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                java.lang.String str4 = U;
                com.tencent.mm.plugin.finder.assist.b3 b3Var2 = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                boolean a17 = pzVar.a(fr1Var);
                int i27 = T;
                if (!pzVar.a(fr1Var) ? str2 != null : (z87Var = (r45.z87) fr1Var.getCustom(18)) != null && (str2 = z87Var.getString(4)) != null) {
                    str3 = str2;
                }
                java.lang.String str5 = str3;
                android.content.Context context4 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                r45.yq1 yq1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).f328811g6;
                pzVar.b(lVar2, context3, xq1Var, fr1Var, str4, b3Var2.g(a17, i27, str5, context4, yq1Var != null ? yq1Var.getInteger(5) : -1), new com.tencent.mm.plugin.finder.live.widget.b00(this), ((mm2.c1) lVar.P0(mm2.c1.class)).N2);
            }
        }
    }

    public final void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "checkHighlightBtn, from:" + str);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        if (!this.H) {
            boolean z17 = this.I;
        }
    }

    public final boolean e() {
        long j17 = S;
        return j17 != 0 && j17 == ((mm2.e1) this.f119001c.P0(mm2.e1.class)).f328988r.getLong(0);
    }

    public final void f() {
        if (this.P) {
            return;
        }
        this.P = true;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        ke2.u uVar = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0, null, false, 112, null);
        android.view.ViewGroup viewGroup = this.f118999a;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        uVar.t(context, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        uVar.l().K(new com.tencent.mm.plugin.finder.live.widget.d00(this));
    }

    public final void g(int i17) {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        r45.ki1 ki1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).S2;
        if (ki1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "doFinderLiveRespondGameInvitation");
        long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328983m;
        long j18 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0);
        java.lang.String str = ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v;
        java.lang.String string = ki1Var.getString(3);
        if (string == null) {
            string = "";
        }
        new db2.e2(j17, j18, str, string, i17).l().K(com.tencent.mm.plugin.finder.live.widget.f00.f118299a);
    }

    public final void h(int i17) {
        if (this.f119023y) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "doing preload CgiFinderLiveGetGameTeamInfo");
            return;
        }
        if (this.A && i17 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "is showing join game guide");
            return;
        }
        this.f119023y = true;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        r45.xq1 xq1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).C2;
        if (xq1Var == null) {
            return;
        }
        new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0, null, false, 112, null).l().K(new com.tencent.mm.plugin.finder.live.widget.g00(this, i17, xq1Var));
    }

    public final java.lang.String i(int i17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.s("reddot", java.lang.Integer.valueOf(i17));
        gVar.s("type", java.lang.Integer.valueOf(i18));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final java.lang.String j(int i17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.s("gift", java.lang.Integer.valueOf(i17));
        gVar.s("type", java.lang.Integer.valueOf(i18));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public final void k(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar2;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if ((uiVar == null || (dkVar2 = uiVar.f114568p) == null) ? false : kotlin.jvm.internal.o.b(dkVar2.c(), java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.finder.live.plugin.ui uiVar2 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
            if (uiVar2 != null && (dkVar = uiVar2.f114568p) != null) {
                dkVar.a();
            }
            l();
            if (z17) {
                ((mm2.c1) lVar.P0(mm2.c1.class)).V2 = true;
            }
        }
    }

    public final void l() {
        this.f119024z = false;
        this.A = false;
        qo0.c.a(this.f119000b, qo0.b.C4, null, 2, null);
    }

    public final boolean n(r45.fr1 fr1Var) {
        if (((r45.q63) fr1Var.getCustom(7)) != null) {
            r45.q63 q63Var = (r45.q63) fr1Var.getCustom(7);
            if ((q63Var != null ? q63Var.getString(1) : null) != null) {
                r45.q63 q63Var2 = (r45.q63) fr1Var.getCustom(7);
                if ((q63Var2 != null ? q63Var2.getInteger(11) : -1) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(int i17, r45.fr1 gameTeamInfo, r45.xq1 xq1Var, java.lang.String str) {
        java.lang.String string;
        r45.z87 z87Var;
        kotlin.jvm.internal.o.g(gameTeamInfo, "gameTeamInfo");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        int i18 = ((mm2.c1) lVar.P0(mm2.c1.class)).H2;
        android.view.ViewGroup viewGroup = this.f118999a;
        if (i18 == 1) {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.czl));
            return;
        }
        if (i17 == 1) {
            if (str == null || str.length() == 0) {
                this.f118998J = true;
                r45.h41 h41Var = (r45.h41) gameTeamInfo.getCustom(21);
                java.lang.String string2 = h41Var != null ? h41Var.getString(1) : null;
                if (string2 == null || string2.length() == 0) {
                    if (xq1Var != null) {
                        string = xq1Var.getString(3);
                    }
                    string = null;
                } else {
                    r45.h41 h41Var2 = (r45.h41) gameTeamInfo.getCustom(21);
                    if (h41Var2 != null) {
                        string = h41Var2.getString(1);
                    }
                    string = null;
                }
                com.tencent.mm.plugin.finder.live.widget.pz pzVar = R;
                com.tencent.mm.plugin.finder.live.plugin.l lVar2 = this.f119001c;
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String string3 = gameTeamInfo.getString(4);
                java.lang.String str2 = string3 == null ? "" : string3;
                com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                boolean a17 = pzVar.a(gameTeamInfo);
                if (!pzVar.a(gameTeamInfo) ? string == null : !((z87Var = (r45.z87) gameTeamInfo.getCustom(18)) != null && (string = z87Var.getString(4)) != null)) {
                    string = "";
                }
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                r45.yq1 yq1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).f328811g6;
                pzVar.b(lVar2, context, xq1Var, gameTeamInfo, str2, b3Var.g(a17, i18, string, context2, yq1Var != null ? yq1Var.getInteger(5) : -1), new com.tencent.mm.plugin.finder.live.widget.s00(this), ((mm2.c1) lVar.P0(mm2.c1.class)).N2);
                return;
            }
        }
        long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0);
        java.lang.String string4 = gameTeamInfo.getString(4);
        java.lang.String str3 = string4 != null ? string4 : "";
        S = j17;
        T = i18;
        U = str3;
        V = xq1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshLastGameTeamClick, liveId:");
        sb6.append(j17);
        sb6.append(", teamMode:");
        sb6.append(i18);
        sb6.append(", launchParams:");
        sb6.append(str3);
        sb6.append(", gameInfo:");
        sb6.append(xq1Var != null ? xq1Var.getString(3) : null);
        sb6.append(", ");
        sb6.append(xq1Var != null ? xq1Var.getString(2) : null);
        sb6.append(", ");
        sb6.append(xq1Var != null ? xq1Var.getString(6) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zl2.r4.f473950a.i2(gameTeamInfo, str));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "gameteam invokeUI " + i18);
        if (i18 == 2) {
            if (!((mm2.c1) lVar.P0(mm2.c1.class)).m7()) {
                db5.t7.i(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.dho), com.tencent.mm.R.raw.icons_filled_error);
                return;
            }
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.hm.class);
            if (hmVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_GAME_TEAM_UP_GIFT", true);
                bundle.putInt("PARAM_FINDER_LIVE_GAME_TEAM_UP_GIFT_MODE", i18);
                hmVar.E1 = bundle;
            }
            qo0.c.a(this.f119000b, qo0.b.S1, null, 2, null);
            return;
        }
        if (i18 == 3) {
            dk2.Cif.b(dk2.Cif.f233626a, this.f119000b, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), dk2.hf.f233592m, false, 8, null);
            return;
        }
        if (i18 == 4) {
            viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.widget.i00(this), 100L);
            return;
        }
        if (i18 == 5) {
            viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.widget.j00(this), 100L);
            return;
        }
        if (i18 == 8) {
            com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = (com.tencent.mm.plugin.finder.live.plugin.th0) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.th0.class);
            if (th0Var != null) {
                th0Var.v1(com.tencent.mm.plugin.finder.live.plugin.eh0.f112418h);
                return;
            }
            return;
        }
        if (i18 != 9) {
            return;
        }
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.finder.live.plugin.th0 th0Var2 = (com.tencent.mm.plugin.finder.live.plugin.th0) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.th0.class);
            if (th0Var2 != null) {
                th0Var2.v1(com.tencent.mm.plugin.finder.live.plugin.eh0.f112420m);
                return;
            }
            return;
        }
        if (((mm2.c1) lVar.P0(mm2.c1.class)).f328880s3 <= 0) {
            com.tencent.mm.plugin.finder.live.util.y.g(lVar, oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, new com.tencent.mm.plugin.finder.live.widget.l00(this, str, i18, null));
        } else {
            m(str, this, i18);
        }
    }

    public final void p(r45.fr1 gameTeamInfo) {
        kotlin.jvm.internal.o.g(gameTeamInfo, "gameTeamInfo");
        int i17 = ((mm2.c1) this.f119001c.P0(mm2.c1.class)).H2;
        android.view.ViewGroup viewGroup = this.f118999a;
        if (i17 == 1) {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.czl));
        } else {
            viewGroup.postDelayed(new com.tencent.mm.plugin.finder.live.widget.t00(gameTeamInfo, this), 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x030e, code lost:
    
        if (r6 != null) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(r45.fr1 r34) {
        /*
            Method dump skipped, instructions count: 2125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.m10.q(r45.fr1):void");
    }

    public final void r() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        r45.fr1 fr1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
        switch (((mm2.c1) lVar.P0(mm2.c1.class)).H2) {
            case 2:
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Uj((ml2.r0) c17, 10, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 3:
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.Uj((ml2.r0) c18, 12, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 4:
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.Uj((ml2.r0) c19, 8, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 5:
                i95.m c27 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                ml2.r0.Uj((ml2.r0) c27, 6, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 6:
                i95.m c28 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c28, "getService(...)");
                ml2.r0.Uj((ml2.r0) c28, 4, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 7:
                i95.m c29 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c29, "getService(...)");
                ml2.r0.Uj((ml2.r0) c29, 24, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            case 8:
                i95.m c37 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c37, "getService(...)");
                ml2.r0.Uj((ml2.r0) c37, 30, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
                return;
            default:
                return;
        }
    }

    public final void s(android.content.Context context) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context, 0, true, true);
        this.f119013o = y1Var;
        y1Var.j(com.tencent.mm.R.layout.dah);
        y1Var.f212027f.findViewById(com.tencent.mm.R.id.ez6).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.y00(y1Var, this));
        if (context.getResources().getConfiguration().orientation == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = y1Var.f212027f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = com.tencent.mm.ui.bl.b(context).y;
                layoutParams.height = -1;
            }
            y1Var.A = com.tencent.mm.ui.bl.b(context).y;
            y1Var.m(java.lang.Boolean.TRUE);
        }
        this.f119002d = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ez7);
        this.f119003e = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ez8);
        this.f119004f = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ez9);
        this.f119005g = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.eyz);
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        android.widget.TextView textView = this.f119005g;
        if (textView != null) {
            textView.setTextSize(1, f17);
        }
        this.f119007i = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.auw);
        this.f119009k = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ffh);
        this.f119010l = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ffj);
        this.f119008j = (android.widget.ImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ffi);
        this.f119006h = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ez_);
        this.f119011m = y1Var.f212027f.findViewById(com.tencent.mm.R.id.gpr);
        this.f119012n = y1Var.f212027f.findViewById(com.tencent.mm.R.id.gpq);
        y1Var.f212027f.setBackground(null);
        this.f119014p = (android.widget.FrameLayout) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484636ez3);
        this.f119015q = (android.widget.LinearLayout) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484635ez2);
        this.f119017s = (android.widget.FrameLayout) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484637ez4);
        this.f119018t = (com.tencent.mm.ui.widget.MMRoundCornerImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484634ez1);
        this.f119019u = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484638ez5);
        this.f119020v = (com.tencent.mm.ui.widget.imageview.WeImageView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.f484633ez0);
        android.widget.FrameLayout frameLayout = this.f119014p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout2 = this.f119014p;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.z00(this));
        }
        android.widget.FrameLayout frameLayout3 = this.f119014p;
        if (frameLayout3 != null) {
            frameLayout3.setOnTouchListener(new com.tencent.mm.plugin.finder.live.widget.a10(this));
        }
        android.widget.FrameLayout frameLayout4 = this.f119017s;
        if (frameLayout4 == null) {
            return;
        }
        frameLayout4.setVisibility(8);
    }

    public final void t() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        long j17 = ((mm2.c1) lVar.P0(mm2.c1.class)).T2;
        this.G = j17;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "set lastGameInvitationSeq to :%d", java.lang.Long.valueOf(j17));
        ((mm2.c1) lVar.P0(mm2.c1.class)).U2 = this.G;
    }

    public final void u(r45.xq1 xq1Var, r45.fr1 fr1Var) {
        java.lang.String str;
        int i17;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar2;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar3;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar4;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar5;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119001c;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        com.tencent.mm.plugin.finder.live.widget.dk dkVar6 = uiVar != null ? uiVar.f114568p : null;
        if (dkVar6 != null) {
            dkVar6.setMListener(new com.tencent.mm.plugin.finder.live.widget.g10(this, fr1Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar2 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        com.tencent.mm.plugin.finder.live.widget.dk dkVar7 = uiVar2 != null ? uiVar2.f114568p : null;
        if (dkVar7 != null) {
            dkVar7.setMCloseListener(new com.tencent.mm.plugin.finder.live.widget.h10(this, fr1Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar3 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if (uiVar3 != null && (dkVar5 = uiVar3.f114568p) != null) {
            dkVar5.e(fr1Var.getString(1), false);
        }
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar4 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if (uiVar4 != null && (dkVar4 = uiVar4.f114568p) != null) {
            java.lang.String string = fr1Var.getString(3);
            java.lang.String string2 = fr1Var.getString(19);
            r45.q63 q63Var = (r45.q63) fr1Var.getCustom(7);
            dkVar4.d(string, string2, q63Var != null ? q63Var.getInteger(11) : 0);
        }
        java.lang.String str2 = ((mm2.c1) lVar.P0(mm2.c1.class)).G2;
        if (fr1Var != null && fr1Var.getInteger(8) == 1) {
            i17 = fr1Var.getInteger(8);
            str = fr1Var.getString(9);
        } else {
            str = str2;
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "show guide, " + fr1Var.getString(1) + ' ' + fr1Var.getString(3) + " teamup_gift_status:" + i17);
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.live.plugin.ui uiVar5 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
            if (uiVar5 != null && (dkVar3 = uiVar5.f114568p) != null) {
                dkVar3.setGiftTitle(str);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ui uiVar6 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
            if (uiVar6 != null && (dkVar = uiVar6.f114568p) != null) {
                dkVar.setGiftTitle("");
            }
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Tj(j(i17, 17));
        this.A = true;
        this.f119024z = false;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar7 = (com.tencent.mm.plugin.finder.live.plugin.ui) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if ((uiVar7 == null || (dkVar2 = uiVar7.f114568p) == null || dkVar2.f()) ? false : true) {
            this.A = false;
        }
        qo0.c.a(this.f119000b, qo0.b.B4, null, 2, null);
    }
}
