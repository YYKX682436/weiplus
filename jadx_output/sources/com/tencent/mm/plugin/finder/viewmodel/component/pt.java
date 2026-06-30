package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pt extends com.tencent.mm.ui.component.UIComponent {
    public static boolean R;
    public boolean A;
    public java.lang.Boolean B;
    public long C;
    public int D;
    public int E;
    public android.view.ViewGroup F;
    public int G;
    public android.view.ViewGroup.LayoutParams H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f135605J;
    public final yz5.p K;
    public final yz5.p L;
    public final jz5.g M;
    public final jz5.g N;
    public final fc2.d P;
    public com.tencent.mm.plugin.finder.video.FinderVideoLayout Q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f135606d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135607e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135608f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135609g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f135610h;

    /* renamed from: i, reason: collision with root package name */
    public int f135611i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f135612m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f135613n;

    /* renamed from: o, reason: collision with root package name */
    public int f135614o;

    /* renamed from: p, reason: collision with root package name */
    public in5.s0 f135615p;

    /* renamed from: q, reason: collision with root package name */
    public in5.s0 f135616q;

    /* renamed from: r, reason: collision with root package name */
    public int f135617r;

    /* renamed from: s, reason: collision with root package name */
    public int f135618s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f135619t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f135620u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f135621v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f135622w;

    /* renamed from: x, reason: collision with root package name */
    public int f135623x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.js f135624y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f135625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135607e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.bt(this, activity));
        this.f135608f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ss(this, activity));
        this.f135609g = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.rs.f135833d);
        this.f135611i = -1;
        this.f135614o = -1;
        this.f135617r = 1;
        this.f135618s = -1;
        this.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134888f;
        this.G = -1;
        this.f135605J = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.ct.f134037d);
        this.K = new com.tencent.mm.plugin.finder.viewmodel.component.ys(this, activity);
        this.L = new com.tencent.mm.plugin.finder.viewmodel.component.xs(this, activity);
        this.M = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.qs(activity, this));
        this.N = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zs(activity, this));
        this.P = new com.tencent.mm.plugin.finder.viewmodel.component.ts(this, activity);
    }

    public static final com.tencent.mm.plugin.finder.viewmodel.component.ps O6(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, in5.s0 s0Var) {
        boolean z17;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.view.f5 P6 = ((com.tencent.mm.plugin.finder.viewmodel.component.u6) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
        boolean z18 = P6 != null && P6.b();
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) ((jz5.n) ((com.tencent.mm.plugin.finder.viewmodel.component.uc) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.uc.class)).f136122d).getValue();
        boolean q17 = finderLikeDrawer != null ? finderLikeDrawer.q() : false;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) ((jz5.n) ((com.tencent.mm.plugin.finder.viewmodel.component.uc) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.uc.class)).f136123e).getValue();
        boolean q18 = finderLikeDrawer2 != null ? finderLikeDrawer2.q() : false;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) uVar.c(ptVar.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
        boolean P62 = finderProfileDrawerUIC != null ? finderProfileDrawerUIC.P6() : false;
        com.tencent.mm.plugin.finder.viewmodel.component.s4 s4Var = (com.tencent.mm.plugin.finder.viewmodel.component.s4) uVar.c(ptVar.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.s4.class);
        boolean P63 = s4Var != null ? s4Var.P6() : false;
        boolean Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class)).Z6();
        com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) uVar.c(ptVar.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
        if (poVar != null) {
            com.tencent.mm.plugin.finder.feed.xj xjVar = poVar.f135573e;
            if (xjVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            if (xjVar.e().getVisibility() == 0) {
                z17 = true;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) uVar.c(ptVar.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
                return new com.tencent.mm.plugin.finder.viewmodel.component.ps(z18, q17, q18, P62, P63, Z6, z17, finderHorizontalVideoDrawerUIC == null && (finderHorizontalVideoDrawerUIC.f133589f ^ true), ((com.tencent.mm.plugin.finder.viewmodel.component.sx) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class)).V6(), s0Var == null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null && finderVideoLayout.D());
            }
        }
        z17 = false;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) uVar.c(ptVar.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
        return new com.tencent.mm.plugin.finder.viewmodel.component.ps(z18, q17, q18, P62, P63, Z6, z17, finderHorizontalVideoDrawerUIC2 == null && (finderHorizontalVideoDrawerUIC2.f133589f ^ true), ((com.tencent.mm.plugin.finder.viewmodel.component.sx) uVar.c(ptVar.getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class)).V6(), s0Var == null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null && finderVideoLayout.D());
    }

    public static void b7(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, java.lang.Long l17, com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView, java.lang.Object obj, int i17, java.lang.Object obj2) {
        so2.j5 j5Var;
        java.lang.Long l18 = null;
        if ((i17 & 1) != 0) {
            l17 = null;
        }
        if ((i17 & 2) != 0) {
            finderRecyclerView = null;
        }
        boolean z17 = false;
        if ((i17 & 4) != 0) {
            obj = new com.tencent.mm.plugin.finder.convert.s8(false);
        }
        if (finderRecyclerView == null) {
            finderRecyclerView = ptVar.V6();
        } else {
            ptVar.getClass();
        }
        if (finderRecyclerView != null) {
            androidx.recyclerview.widget.f2 adapter = finderRecyclerView.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter == null || wxRecyclerAdapter.getItemCount() <= 0) {
                return;
            }
            if (l17 == null) {
                wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getItemCount(), new jz5.l(30, obj));
                return;
            }
            in5.s0 s0Var = ptVar.f135615p;
            if (s0Var != null && (j5Var = (so2.j5) s0Var.f293125i) != null) {
                l18 = java.lang.Long.valueOf(j5Var.getItemId());
            }
            in5.s0 s0Var2 = ptVar.f135615p;
            int adapterPosition = s0Var2 != null ? s0Var2.getAdapterPosition() : -1;
            if (kotlin.jvm.internal.o.b(l18, l17)) {
                if (adapterPosition >= 0 && adapterPosition < wxRecyclerAdapter.getItemCount()) {
                    z17 = true;
                }
                if (z17) {
                    wxRecyclerAdapter.notifyItemChanged(adapterPosition, new jz5.l(30, obj));
                }
            }
        }
    }

    public final void P6(boolean z17) {
        android.view.View decorView = getActivity().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            if (z17) {
                viewGroup.removeView(W6());
            } else {
                viewGroup.removeView(W6());
                viewGroup.addView(W6(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public final void Q6(boolean z17) {
        android.view.View decorView = getActivity().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            if (z17) {
                viewGroup.removeView(X6());
            } else {
                viewGroup.removeView(X6());
                viewGroup.addView(X6(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R6(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.pt.R6(java.lang.String):boolean");
    }

    public final void S6() {
        if (hc2.f0.l(getActivity())) {
            if (this.f135615p != null || R6("enterLandscape")) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128018x6).getValue()).r()).booleanValue()) {
                }
                this.A = true;
                getContext().setRequestedOrientation(11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T6(android.content.res.Configuration r38) {
        /*
            Method dump skipped, instructions count: 2207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.pt.T6(android.content.res.Configuration):boolean");
    }

    public final void U6(int i17) {
        if (hc2.f0.l(getActivity())) {
            getContext().setRequestedOrientation(1);
            this.f135623x = i17;
        }
    }

    public final com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView V6() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            refreshLoadMoreLayout = view != null ? (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById(com.tencent.mm.R.id.m6e);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout != null ? refreshLoadMoreLayout.getRecyclerView() : null;
        if (recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
            return (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.os W6() {
        return (com.tencent.mm.plugin.finder.viewmodel.component.os) ((jz5.n) this.f135608f).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6() {
        return (com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout) ((jz5.n) this.f135607e).getValue();
    }

    public final boolean Y6() {
        int i17 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "accRotation=" + i17);
        return i17 == 1;
    }

    public final boolean Z6() {
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6 = !this.f135606d ? null : X6();
        return (X6 == null || bb2.p0.f18940a.a(X6) == null) ? false : true;
    }

    public final boolean a7(in5.s0 s0Var) {
        if (s0Var != null) {
            return s0Var.getItemViewType() == 9 && ((com.tencent.mm.plugin.finder.view.FinderMediaLayout) s0Var.p(com.tencent.mm.R.id.fs6)).getMediaType() == com.tencent.mm.plugin.finder.view.qr.f132909h;
        }
        com.tencent.mars.xlog.Log.e("FinderVideoOrientationUIC", "isLiveRoomLayout, focusHolder is null");
        return false;
    }

    public final void c7(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        java.lang.String valueOf;
        if (s0Var == null || baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.w("FinderVideoOrientationUIC", "reportLiveHorizontalScreenEnd error focusHolder = " + s0Var + ",item = " + baseFinderFeed);
            this.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134888f;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "reportLiveHorizontalScreenEnd liveExitHorizontalLayoutType = " + this.f135624y);
        if (this.f135624y != com.tencent.mm.plugin.finder.viewmodel.component.js.f134891i) {
            ml2.t1 t1Var = ml2.t1.f327972o3;
            jz5.l[] lVarArr = new jz5.l[4];
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
            if (this.A) {
                ml2.z2[] z2VarArr = ml2.z2.f328341d;
                valueOf = java.lang.String.valueOf(1);
            } else {
                ml2.z2[] z2VarArr2 = ml2.z2.f328341d;
                valueOf = java.lang.String.valueOf(2);
            }
            lVarArr[1] = new jz5.l("mode_type", valueOf);
            lVarArr[2] = new jz5.l("stay_time", java.lang.String.valueOf(java.lang.Math.max(0L, android.os.SystemClock.elapsedRealtime() - this.C)));
            lVarArr[3] = new jz5.l("end_type", java.lang.String.valueOf(this.f135624y.f134893d));
            d7(s0Var, baseFinderFeed, t1Var, kz5.c1.l(lVarArr));
        }
        this.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134888f;
    }

    public final void d7(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, ml2.t1 t1Var, java.util.Map map) {
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n) : null);
        c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        zy2.ra Sj2 = ((c61.p2) ybVar2).Sj(context2);
        java.lang.String str = Sj2 != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj2).f135382p : null;
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, t1Var, map, str, valueOf, baseFinderFeed.g0(), null, false, 96, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e7(boolean z17) {
        dw2.c0 c0Var;
        androidx.recyclerview.widget.RecyclerView o17;
        java.lang.String str;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        java.lang.String description;
        android.widget.FrameLayout frameLayout;
        dw2.c0 c0Var2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        if (this.f135614o >= 0) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(this.f135614o);
            this.f135614o = -1;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.x60.c((com.tencent.mm.plugin.finder.viewmodel.component.x60) ((jz5.n) ((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class)).f133636d).getValue(), false, false, 0.0f, 4, null);
        android.view.View view = this.f135613n;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view : null;
        long currentPlayMs = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L;
        android.view.View view2 = this.f135613n;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = view2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view2 : null;
        boolean z18 = finderThumbPlayerProxy2 != null && finderThumbPlayerProxy2.V();
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout.v(X6(), false, null, 2, null);
        in5.s0 s0Var2 = this.f135615p;
        if (s0Var2 != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
            if (finderSpeedControlUIC != null) {
                finderSpeedControlUIC.X6(s0Var2);
            }
        }
        android.view.View view3 = this.f135613n;
        if (view3 != 0) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = view3 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view3 : null;
            if (finderThumbPlayerProxy3 != null) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.o(finderThumbPlayerProxy3, false, 1, null);
            }
            X6().removeView(view3);
            android.view.ViewGroup viewGroup = this.f135610h;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = viewGroup instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) viewGroup : null;
            if (finderVideoLayout != null) {
                c0Var2 = finderVideoLayout.getVideoCore().v();
                if (c0Var2 != null) {
                    c0Var2.y("FinderHDRVideoOrientationUIC", false, true);
                }
                finderVideoLayout.setEnablePlay(true);
                X6().h(finderVideoLayout);
            } else {
                c0Var2 = null;
            }
            android.view.ViewGroup viewGroup2 = this.f135610h;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view3);
            }
            android.view.ViewGroup viewGroup3 = this.f135610h;
            if (viewGroup3 != null) {
                viewGroup3.addView(view3, this.f135611i, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            view3.post(new com.tencent.mm.plugin.finder.viewmodel.component.mt(view3));
            this.f135613n = null;
            this.f135611i = -1;
            this.f135612m = null;
            if (view3 instanceof cw2.da) {
                cw2.da daVar = (cw2.da) view3;
                daVar.setInterceptDetach(false);
                daVar.setPreview(false);
            }
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getActivity());
            r45.qt2 V6 = e17 != null ? e17.V6() : null;
            int i17 = this.f135623x;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, i17 == 0 ? "transpose_video_card" : "transpose_video_card_exitArrow", i17 == 0 ? 3 : 1, null, false, null, 56, null);
            in5.s0 s0Var3 = this.f135616q;
            if (s0Var3 != null && (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var3.f293125i) != null) {
                com.tencent.mm.plugin.finder.report.l0.f125109a.a(getContext(), baseFinderFeed, 57);
                com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(getContext());
                r45.qt2 V62 = e18 != null ? e18.V6() : null;
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[8];
                lVarArr[0] = new jz5.l("finder_context_id", V62 != null ? V62.getString(1) : null);
                lVarArr[1] = new jz5.l("finder_tab_context_id", V62 != null ? V62.getString(2) : null);
                com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(getContext());
                lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
                lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getFeedObject().getId()));
                lVarArr[4] = new jz5.l("session_buffer", baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer());
                lVarArr[5] = new jz5.l("if_horizontal_feed", java.lang.Integer.valueOf(bu2.z.f(baseFinderFeed.getFeedObject().getMediaList(), "FinderHDRVideoOrientationUIC#1", false, 2, null) <= 1.0f ? 1 : 0));
                lVarArr[6] = new jz5.l("transpose_type", java.lang.Integer.valueOf(this.A ? 2 : 1));
                lVarArr[7] = new jz5.l("stay_time_ms", java.lang.Long.valueOf(java.lang.Math.max(0L, android.os.SystemClock.elapsedRealtime() - this.C)));
                ((cy1.a) rVar).yj("finder_return_vertical_screen", null, kz5.c1.k(lVarArr), 1, false);
            }
            c0Var = c0Var2;
        } else {
            c0Var = null;
        }
        bb2.a1 a17 = bb2.p0.f18940a.a(X6());
        if (a17 != null) {
            a17.setReuse(true);
            android.view.ViewParent parent = a17.getView().getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(a17.getView());
            in5.s0 s0Var4 = this.f135616q;
            if (s0Var4 != null && (frameLayout = (android.widget.FrameLayout) s0Var4.p(com.tencent.mm.R.id.edq)) != null) {
                frameLayout.addView(a17.getView(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            bb2.w1 bulletManager = a17.getBulletManager();
            int intValue = ((java.lang.Number) ((jz5.n) this.f135605J).getValue()).intValue();
            bb2.b1 b1Var = bb2.w1.f19035x;
            bulletManager.r(intValue, true);
            a17.getBulletManager().t();
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.jt(a17, currentPlayMs, z18));
        }
        in5.s0 s0Var5 = this.f135616q;
        if (s0Var5 != null && (o17 = s0Var5.o()) != null) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = o17 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) o17 : null;
            if (finderRecyclerView != null) {
                finderRecyclerView.i(finderRecyclerView.getScrollEventAdapter());
            }
            int i18 = this.f135618s;
            int childCount = o17.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                androidx.recyclerview.widget.k3 w07 = o17.w0(o17.getChildAt(i19));
                if (!kotlin.jvm.internal.o.b(this.f135616q, w07)) {
                    android.view.View view4 = w07.itemView;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "restoreRecyclerView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/video/autoplay/IFinderVideoAutoPlayManager;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "restoreRecyclerView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/video/autoplay/IFinderVideoAutoPlayManager;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            o17.post(new com.tencent.mm.plugin.finder.viewmodel.component.lt(i18, o17, c0Var, view3, this));
            in5.s0 s0Var6 = this.f135616q;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = s0Var6 != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var6.f293125i : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetToPortrait: pos = ");
            sb6.append(i18);
            sb6.append(", desc = ");
            if (baseFinderFeed2 == null || (feedObject3 = baseFinderFeed2.getFeedObject()) == null || (description = feedObject3.getDescription()) == null) {
                str = null;
            } else {
                str = description.substring(0, java.lang.Math.min(description.length(), 3));
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            sb6.append(str);
            sb6.append(" nickname = ");
            sb6.append((baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject2.getNickName());
            sb6.append(", videoRes:");
            sb6.append(view3 != 0 ? java.lang.Integer.valueOf(view3.getWidth()) : null);
            sb6.append('x');
            sb6.append(view3 != 0 ? java.lang.Integer.valueOf(view3.getHeight()) : null);
            sb6.append("activity = ");
            sb6.append(getActivity().getClass().getSimpleName());
            com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", sb6.toString());
            if (((baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || !feedObject.canShowSubtitle()) ? false : true) && (s0Var = this.f135616q) != null) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                com.tencent.mm.plugin.finder.viewmodel.component.o70 o70Var = (com.tencent.mm.plugin.finder.viewmodel.component.o70) pf5.z.f353948a.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.o70.class);
                if (o70Var != null) {
                    o70Var.S6(s0Var, false);
                }
            }
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.ht(this));
        this.f135610h = null;
        this.A = false;
        X6().setFullSeekBar(null);
        in5.s0 s0Var7 = this.f135616q;
        androidx.recyclerview.widget.RecyclerView o18 = s0Var7 != null ? s0Var7.o() : null;
        if (o18 != null) {
            o18.setLayoutFrozen(false);
        }
        this.f135616q = null;
        Q6(true);
        if (z17) {
            getContext().setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class)).onBackPressed()) {
            return true;
        }
        if (this.f135616q == null || getContext().getResources().getConfiguration().orientation != 2) {
            return false;
        }
        this.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134889g;
        U6(0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        dw2.c0 c0Var;
        androidx.recyclerview.widget.RecyclerView o17;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        java.lang.String description;
        in5.s0 s0Var;
        cg2.k kVar;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        boolean v07 = com.tencent.mm.ui.bk.v0();
        boolean l17 = hc2.f0.l(getActivity());
        com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "finderLandscape.onConfigurationChanged: newConfig = " + newConfig.orientation + ", currOrientation = " + this.f135617r + ", requestedOrientation:" + getActivity().getRequestedOrientation() + " isSupportMagicMode:" + v07 + " isSupportLandScapeLayoutDevice:" + l17 + " activity = " + getActivity().getClass().getSimpleName());
        int i17 = this.f135617r;
        int i18 = newConfig.orientation;
        if (i17 == i18 || !l17) {
            if (v07) {
                int i19 = newConfig.screenWidthDp;
                int i27 = newConfig.screenHeightDp;
                float f17 = getResources().getDisplayMetrics().density;
                com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", "finderLandscape.onConfigurationChanged: [" + (this.D * f17) + " x " + (this.E * f17) + "] -> [" + (i19 * f17) + ", " + (i27 * f17) + ']');
                if (i19 != this.D || i27 != this.E) {
                    in5.s0 s0Var2 = this.f135616q;
                    if (s0Var2 != null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(s0Var2.getItemViewType());
                        if (valueOf != null && valueOf.intValue() == 4) {
                            e7(false);
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetToPortrait: finderFeedType = ");
                            in5.s0 s0Var3 = this.f135616q;
                            sb6.append(s0Var3 != null ? java.lang.Integer.valueOf(s0Var3.getItemViewType()) : null);
                            com.tencent.mars.xlog.Log.w("FinderVideoOrientationUIC", sb6.toString());
                        }
                    } else {
                        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView V6 = V6();
                        if (V6 != null) {
                            V6.post(new com.tencent.mm.plugin.finder.viewmodel.component.us(newConfig, this));
                        }
                    }
                }
                this.D = i19;
                this.E = i27;
                return;
            }
            return;
        }
        this.f135617r = i18;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        finderBulletUIC.V6().d();
        finderBulletUIC.V6().f();
        if (newConfig.orientation != 1) {
            if (T6(newConfig)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("FinderVideoOrientationUIC", "onConfigurationChanged: enterLandscape failed");
            getContext().setRequestedOrientation(1);
            return;
        }
        in5.s0 s0Var4 = this.f135616q;
        java.lang.Integer valueOf2 = s0Var4 != null ? java.lang.Integer.valueOf(s0Var4.getItemViewType()) : null;
        if (valueOf2 != null && valueOf2.intValue() == 4) {
            e7(true);
            return;
        }
        if (valueOf2 == null || valueOf2.intValue() != 9) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resetToPortrait: finderFeedType = ");
            in5.s0 s0Var5 = this.f135616q;
            sb7.append(s0Var5 != null ? java.lang.Integer.valueOf(s0Var5.getItemViewType()) : null);
            com.tencent.mars.xlog.Log.w("FinderVideoOrientationUIC", sb7.toString());
            return;
        }
        if (this.f135614o >= 0) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(this.f135614o);
            this.f135614o = -1;
        }
        android.view.View view = this.f135613n;
        if (view != 0) {
            W6().removeView(view);
            android.view.ViewGroup viewGroup = this.f135610h;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = viewGroup instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) viewGroup : null;
            if (finderVideoLayout != null) {
                c0Var = finderVideoLayout.getVideoCore().v();
                if (c0Var != null) {
                    c0Var.y("FinderHDRVideoOrientationUIC", false, true);
                }
                finderVideoLayout.setEnablePlay(true);
            } else {
                c0Var = null;
            }
            android.view.ViewGroup viewGroup2 = this.f135610h;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            }
            android.view.ViewGroup viewGroup3 = this.f135610h;
            if (viewGroup3 != null) {
                viewGroup3.addView(view, this.f135611i, this.f135612m);
            }
            android.view.ViewGroup viewGroup4 = this.f135610h;
            if (viewGroup4 != null) {
                viewGroup4.post(new com.tencent.mm.plugin.finder.viewmodel.component.ft(this));
            }
            this.f135610h = null;
            this.f135613n = null;
            this.f135611i = -1;
            this.f135612m = null;
            if (view instanceof cw2.da) {
                cw2.da daVar = (cw2.da) view;
                daVar.setInterceptDetach(false);
                daVar.setPreview(false);
            }
            in5.s0 s0Var6 = this.f135616q;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var6 != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var6.f293125i : null;
            if (s0Var6 != null && baseFinderFeed != null) {
                c7(s0Var6, baseFinderFeed);
            }
        } else {
            c0Var = null;
        }
        if (this.I != null && (s0Var = this.f135616q) != null) {
            androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
            in5.r w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
            com.tencent.mm.plugin.finder.convert.zf zfVar = w07 instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) w07 : null;
            if (zfVar != null) {
                in5.s0 s0Var7 = this.f135616q;
                kotlin.jvm.internal.o.d(s0Var7);
                uc2.b bVar = (uc2.b) zfVar.f104851e.a(s0Var7, uc2.b.class);
                if (bVar != null) {
                    bg2.x0 x0Var = (bg2.x0) bVar;
                    if (x0Var.f20619n && (kVar = x0Var.f20616h) != null) {
                        kVar.setReuse(true);
                    }
                }
            }
            android.widget.FrameLayout frameLayout = this.I;
            kotlin.jvm.internal.o.d(frameLayout);
            android.view.ViewParent parent = frameLayout.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(this.I);
            android.view.ViewGroup viewGroup5 = this.F;
            if (viewGroup5 != null) {
                viewGroup5.addView(this.I, this.G, this.H);
            }
            if (zfVar != null) {
                in5.s0 s0Var8 = this.f135616q;
                kotlin.jvm.internal.o.d(s0Var8);
                zfVar.R1(s0Var8, null, true);
            }
        }
        this.I = null;
        this.F = null;
        this.G = -1;
        this.H = null;
        in5.s0 s0Var9 = this.f135616q;
        if (s0Var9 != null && (o17 = s0Var9.o()) != null) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = o17 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) o17 : null;
            if (finderRecyclerView != null) {
                finderRecyclerView.i(finderRecyclerView.getScrollEventAdapter());
            }
            int i28 = this.f135618s;
            int childCount = o17.getChildCount();
            for (int i29 = 0; i29 < childCount; i29++) {
                androidx.recyclerview.widget.k3 w08 = o17.w0(o17.getChildAt(i29));
                if (!kotlin.jvm.internal.o.b(this.f135616q, w08)) {
                    android.view.View view2 = w08.itemView;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "resetLiveRecyclerViewState", "(Lcom/tencent/mm/plugin/finder/video/autoplay/IFinderVideoAutoPlayManager;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC", "resetLiveRecyclerViewState", "(Lcom/tencent/mm/plugin/finder/video/autoplay/IFinderVideoAutoPlayManager;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            o17.post(new com.tencent.mm.plugin.finder.viewmodel.component.et(i28, o17, c0Var, this));
            in5.s0 s0Var10 = this.f135616q;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = s0Var10 != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var10.f293125i : null;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("resetToPortrait: pos = ");
            sb8.append(i28);
            sb8.append(", desc = ");
            if (baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null || (description = feedObject2.getDescription()) == null) {
                str = null;
            } else {
                str = description.substring(0, java.lang.Math.min(description.length(), 3));
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            sb8.append(str);
            sb8.append(" nickname = ");
            sb8.append((baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject.getNickName());
            sb8.append(", activity = ");
            sb8.append(getActivity().getClass().getSimpleName());
            com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", sb8.toString());
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.gt(this));
        this.A = false;
        in5.s0 s0Var11 = this.f135616q;
        androidx.recyclerview.widget.RecyclerView o18 = s0Var11 != null ? s0Var11.o() : null;
        if (o18 != null) {
            o18.setLayoutFrozen(false);
        }
        this.f135616q = null;
        P6(true);
        getContext().setRequestedOrientation(1);
        in5.s0 s0Var12 = this.f135615p;
        if (s0Var12 == null || !a7(s0Var12)) {
            return;
        }
        androidx.recyclerview.widget.f2 f2Var2 = s0Var12.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = f2Var2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var2 : null;
        in5.r w09 = wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.w0(s0Var12.getItemViewType()) : null;
        com.tencent.mm.plugin.finder.convert.zf zfVar2 = w09 instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) w09 : null;
        if (getContext().getResources().getConfiguration().orientation != newConfig.orientation) {
            com.tencent.mars.xlog.Log.e("FinderVideoOrientationUIC", "force update new config, newConfig.orientation=" + newConfig.orientation);
            getContext().getResources().updateConfiguration(newConfig, getContext().getResources().getDisplayMetrics());
        }
        if (zfVar2 != null) {
            zfVar2.a2(s0Var12);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128018x6).getValue()).r()).booleanValue()) {
            handler.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.vs(this), 2000L);
        } else {
            handler.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.ws(this), 2000L);
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        for (fc2.c cVar : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).R6()) {
            if (cVar != null) {
                cVar.a(this.P);
            }
        }
        getContext().setRequestedOrientation(1);
        android.content.pm.ActivityInfo activityInfo = getActivity().getPackageManager().getActivityInfo(getActivity().getComponentName(), 128);
        kotlin.jvm.internal.o.f(activityInfo, "getActivityInfo(...)");
        this.f135620u = (activityInfo.configChanges & 128) > 0;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            mMFinderUI.b7(this.f135620u);
        }
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f17 = displayMetrics.widthPixels;
        float f18 = displayMetrics.density;
        this.D = (int) (f17 / f18);
        this.E = (int) (displayMetrics.heightPixels / f18);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128018x6).getValue()).r()).booleanValue()) {
            qd2.k0 k0Var = (qd2.k0) ((jz5.n) this.M).getValue();
            qd2.g0 g0Var = k0Var.f361786c;
            if (g0Var.f361739c != null && g0Var.f361741e) {
                g0Var.f361738b.unregisterListener(g0Var.f361740d);
                g0Var.f361741e = false;
            }
            k0Var.f361785b = qd2.h0.f361768d;
        } else {
            ((z41.c) ((jz5.n) this.N).getValue()).disable();
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        for (fc2.c cVar : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).R6()) {
            if (cVar != null) {
                cVar.d(this.P);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f135621v = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f135621v = true;
        if (com.tencent.mm.ui.bk.v0() && this.B == null) {
            this.B = java.lang.Boolean.valueOf((com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(getActivity()) || com.tencent.mm.ui.bk.O(getActivity().getContentResolver()) || (com.tencent.mm.ui.bk.N(getActivity().getTaskId()) && !getActivity().isInMultiWindowMode()))) && !com.tencent.mm.ui.bk.z(getContext().getTaskId()));
        }
    }
}
