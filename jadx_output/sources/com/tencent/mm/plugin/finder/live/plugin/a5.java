package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a5 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final android.widget.RelativeLayout B;
    public final android.widget.RelativeLayout C;
    public final android.view.ViewGroup D;
    public final android.view.View E;
    public final android.view.View F;
    public final android.view.View G;
    public final android.view.View H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f111796J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final android.widget.TextView M;
    public final android.view.View N;
    public final android.view.ViewGroup P;
    public final android.view.View Q;
    public final android.view.View R;
    public final android.view.View S;
    public android.view.View T;
    public final int U;
    public final int V;
    public final int W;
    public final com.tencent.mm.plugin.finder.live.widget.fe X;
    public final com.tencent.mm.plugin.finder.live.widget.sv Y;
    public final wm2.n Z;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111797p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f111798p0;

    /* renamed from: q, reason: collision with root package name */
    public int f111799q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f111800r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewGroup f111801s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f111802t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f111803u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.RelativeLayout f111804v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ViewGroup f111805w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f111806x;

    /* renamed from: x0, reason: collision with root package name */
    public int f111807x0;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f111808y;

    /* renamed from: y0, reason: collision with root package name */
    public java.util.Map f111809y0;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f111810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111797p = statusMonitor;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.eso);
        this.f111800r = viewGroup2;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.eta);
        this.f111801s = viewGroup3;
        this.f111802t = root.findViewById(com.tencent.mm.R.id.f487195nu4);
        this.f111803u = root.findViewById(com.tencent.mm.R.id.f487191nu0);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.et8);
        this.f111804v = relativeLayout;
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.f484586et5);
        this.f111805w = viewGroup4;
        this.f111806x = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.et7);
        this.f111808y = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.et6);
        this.f111810z = root.findViewById(com.tencent.mm.R.id.jkx);
        this.A = root.findViewById(com.tencent.mm.R.id.jkw);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.est);
        this.B = relativeLayout2;
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.nxm);
        this.C = relativeLayout3;
        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.esq);
        this.D = viewGroup5;
        this.E = root.findViewById(com.tencent.mm.R.id.f483364ag3);
        this.F = root.findViewById(com.tencent.mm.R.id.f483361ag0);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.esz);
        this.G = findViewById;
        this.H = root.findViewById(com.tencent.mm.R.id.gql);
        this.I = root.findViewById(com.tencent.mm.R.id.gqm);
        android.widget.RelativeLayout elementPanel = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.esd);
        android.widget.RelativeLayout screenEffectPanel = (android.widget.RelativeLayout) root.findViewById(com.tencent.mm.R.id.oiu);
        androidx.constraintlayout.widget.ConstraintLayout beautyPowerfulPanel = (androidx.constraintlayout.widget.ConstraintLayout) root.findViewById(com.tencent.mm.R.id.tgi);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f484575er3);
        this.f111796J = findViewById2;
        this.K = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eto);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.fmm);
        this.L = findViewById3;
        this.M = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.fmn);
        this.N = root.findViewById(com.tencent.mm.R.id.eth);
        this.P = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.etg);
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.etb);
        this.Q = findViewById4;
        this.R = root.findViewById(com.tencent.mm.R.id.ntb);
        this.S = root.findViewById(com.tencent.mm.R.id.nta);
        this.U = 1;
        this.V = 20010;
        this.W = 20011;
        this.f111809y0 = new java.util.LinkedHashMap();
        com.tencent.mm.ui.a4.e(root, true, false, 2, null);
        if (x0()) {
            viewGroup = viewGroup5;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.tencent.mm.ui.bl.h(root.getContext());
            if (x0()) {
                android.content.Context context = root.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                int b17 = com.tencent.mm.plugin.finder.view.x7.b(context);
                android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                layoutParams2.width = b17;
                layoutParams2.height = b17;
                viewGroup2.setLayoutParams(layoutParams2);
            }
        } else {
            int c17 = com.tencent.mm.ui.bl.c(root.getContext());
            this.f111798p0 = c17;
            viewGroup = viewGroup5;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom() + c17);
            elementPanel.setPadding(elementPanel.getPaddingLeft(), elementPanel.getPaddingTop(), elementPanel.getPaddingRight(), elementPanel.getPaddingBottom() + c17);
            screenEffectPanel.setPadding(screenEffectPanel.getPaddingLeft(), screenEffectPanel.getPaddingTop(), screenEffectPanel.getPaddingRight(), screenEffectPanel.getPaddingBottom() + c17);
            beautyPowerfulPanel.setPadding(beautyPowerfulPanel.getPaddingLeft(), beautyPowerfulPanel.getPaddingTop(), beautyPowerfulPanel.getPaddingRight(), beautyPowerfulPanel.getPaddingBottom() + c17);
            com.tencent.mm.ui.a4.e(beautyPowerfulPanel, false, false, 3, null);
        }
        root.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        kotlin.jvm.internal.o.f(elementPanel, "elementPanel");
        com.tencent.mm.plugin.finder.live.widget.fe feVar = new com.tencent.mm.plugin.finder.live.widget.fe(elementPanel);
        this.X = feVar;
        kotlin.jvm.internal.o.f(screenEffectPanel, "screenEffectPanel");
        com.tencent.mm.plugin.finder.live.widget.sv svVar = new com.tencent.mm.plugin.finder.live.widget.sv(screenEffectPanel);
        this.Y = svVar;
        kotlin.jvm.internal.o.f(beautyPowerfulPanel, "beautyPowerfulPanel");
        this.Z = new wm2.n(beautyPowerfulPanel);
        viewGroup3.setOnClickListener(this);
        long E0 = zl2.r4.f473950a.E0(S0());
        if (pm0.v.A(E0, 256L) || pm0.v.A(E0, 512L)) {
            relativeLayout.setVisibility(0);
            relativeLayout.setOnClickListener(this);
        } else {
            relativeLayout.setVisibility(8);
        }
        viewGroup4.setOnClickListener(this);
        relativeLayout2.setOnClickListener(this);
        relativeLayout3.setOnClickListener(this);
        viewGroup.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.f4(this, root));
        root.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        feVar.f118350h = new com.tencent.mm.plugin.finder.live.plugin.g4(this);
        svVar.f119847h = new com.tencent.mm.plugin.finder.live.plugin.h4(this);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        kn0.p c17;
        com.tencent.mm.plugin.finder.live.widget.w4 w4Var;
        r45.kz0 kz0Var;
        a5Var.getClass();
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.f327974p0, a5Var.f111809y0, null, null, null, null, false, 124, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode showScene:" + a5Var.f111799q);
        te2.a2.f417855a.a(((mm2.c1) a5Var.P0(mm2.c1.class)).l7() ? 2 : 1);
        int i17 = a5Var.f111799q;
        android.view.ViewGroup viewGroup = a5Var.f365323d;
        if (i17 == 0) {
            if (((mm2.c1) a5Var.P0(mm2.c1.class)).l7()) {
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dwj));
                ((mm2.c1) a5Var.P0(mm2.c1.class)).D8(0);
                a5Var.K1();
                com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) a5Var.U0(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
                if (r5Var != null) {
                    r5Var.n7();
                }
                i95.m c19 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c19;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 20L, "2", null, 4, null);
            } else {
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dwj));
                ((mm2.c1) a5Var.P0(mm2.c1.class)).D8(1);
                a5Var.A1(true);
                i95.m c27 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c27;
                ml2.c1 c1Var2 = ml2.c1.f327325e;
                zy2.zb.j5(zbVar2, 20L, "1", null, 4, null);
            }
            androidx.lifecycle.c1 P0 = a5Var.P0(mm2.c1.class);
            ya2.b2 b2Var = ((mm2.c1) a5Var.P0(mm2.c1.class)).J4;
            if (b2Var != null) {
                mm2.c1 c1Var3 = (mm2.c1) P0;
                if (c1Var3.l7()) {
                    int i18 = (int) b2Var.field_liveAnchorStatusFlag;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    b2Var.field_liveAnchorStatusFlag = i18 | 256;
                } else {
                    int i19 = (int) b2Var.field_liveAnchorStatusFlag;
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    b2Var.field_liveAnchorStatusFlag = i19 & (-257);
                }
                ya2.h.f460484a.o(b2Var);
                m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
                int i27 = (int) ((I1 == null || (kz0Var = I1.field_liveInfo) == null) ? 0L : kz0Var.getLong(0));
                c1Var3.Z9(c1Var3.l7() ? i27 | 256 : i27 & (-257));
            }
        } else if (((mm2.c1) a5Var.P0(mm2.c1.class)).l7()) {
            a5Var.K1();
            ((mm2.c1) a5Var.P0(mm2.c1.class)).D8(0);
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) a5Var.X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
            if (c4Var != null && (w4Var = c4Var.C) != null) {
                df2.d6.f229944n.b(w4Var.f120133f.S0());
            }
            i95.m c28 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            zy2.zb.y6((zy2.zb) c28, ml2.z4.B, "2", null, 4, null);
        } else {
            db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dwj));
            ((mm2.c1) a5Var.P0(mm2.c1.class)).D8(1);
            a5Var.A1(true);
            i95.m c29 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c29, "getService(...)");
            zy2.zb.y6((zy2.zb) c29, ml2.z4.B, "1", null, 4, null);
            hn0.f C1 = a5Var.C1();
            if ((C1 == null || (c17 = ((hn0.p) C1).c()) == null || !c17.f309589i) ? false : true) {
                cl0.g gVar = new cl0.g();
                ml2.v2[] v2VarArr = ml2.v2.f328147d;
                gVar.s("type", 5);
                i95.m c37 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c37, "getService(...)");
                zy2.zb.y6((zy2.zb) c37, ml2.z4.H, gVar.toString(), null, 4, null);
            }
        }
        a5Var.w1();
        java.lang.Object context = viewGroup.getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        android.view.View view = a5Var.T;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "clickAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((mm2.c1) a5Var.P0(mm2.c1.class)).l7()) {
            if (a5Var.I1()) {
                ll2.e eVar = ll2.e.f319133a;
                ll2.e.l(eVar, yVar, "anchorlive.bottom.audiosetting", view, null, null, 24, null);
                eVar.o(yVar, "anchorlive.bottom.videosetting", true);
                return;
            } else {
                ll2.e eVar2 = ll2.e.f319133a;
                ll2.e.l(eVar2, yVar, "startlive.bottom.audiosetting", view, null, null, 24, null);
                eVar2.o(yVar, "startlive.bottom.videosetting", true);
                return;
            }
        }
        if (a5Var.I1()) {
            ll2.e eVar3 = ll2.e.f319133a;
            ll2.e.l(eVar3, yVar, "anchorlive.bottom.videosetting", view, null, null, 24, null);
            eVar3.o(yVar, "anchorlive.bottom.audiosetting", true);
        } else {
            ll2.e eVar4 = ll2.e.f319133a;
            ll2.e.l(eVar4, yVar, "startlive.bottom.videosetting", view, null, null, 24, null);
            eVar4.o(yVar, "startlive.bottom.audiosetting", true);
        }
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, boolean z17) {
        qo0.c cVar = a5Var.f111797p;
        if (z17) {
            if (a5Var.f111799q == 0) {
                qo0.c.a(cVar, qo0.b.f365394o4, null, 2, null);
                return;
            }
            ((mm2.c1) a5Var.P0(mm2.c1.class)).N1 = false;
            qo0.b bVar = qo0.b.Z2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) a5Var.P0(mm2.c1.class)).N1);
            cVar.statusChange(bVar, bundle);
            return;
        }
        if (a5Var.f111799q != 0) {
            ((mm2.c1) a5Var.P0(mm2.c1.class)).N1 = true;
            qo0.b bVar2 = qo0.b.Z2;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) a5Var.P0(mm2.c1.class)).N1);
            cVar.statusChange(bVar2, bundle2);
            return;
        }
        android.content.Context context = a5Var.f365323d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
            com.tencent.mm.plugin.finder.live.viewmodel.d6 d6Var = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117035e;
            b8Var.getClass();
            b8Var.f116946q = d6Var;
            ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).S6();
        }
    }

    public static final void y1(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, java.lang.String str) {
        if (((mm2.c1) a5Var.P0(mm2.c1.class)).S) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.G1, str, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 39L, str, null, 4, null);
        }
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        hf2.x xVar;
        android.net.Uri data;
        android.net.Uri data2;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel;
        java.lang.String str;
        java.lang.String str2;
        int i19 = this.V;
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.String str3 = null;
        int i27 = 1;
        if (i17 != i19) {
            if (i17 == this.W) {
                java.lang.String path = (intent == null || (data2 = intent.getData()) == null) ? null : data2.getPath();
                if (intent != null && (data = intent.getData()) != null) {
                    str3 = data.getPath();
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    java.lang.String str4 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                    ((ub0.r) oVar).getClass();
                    path = com.tencent.mm.pluginsdk.ui.tools.l7.b((android.app.Activity) context, intent, str4);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "filePath[" + path + "] " + intent);
                if (path != null && path.length() != 0) {
                    i27 = 0;
                }
                if (i27 != 0 || (xVar = (hf2.x) U0(hf2.x.class)) == null) {
                    return;
                }
                xVar.w7(2, path);
                return;
            }
            return;
        }
        if (intent == null || (captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO")) == null) {
            return;
        }
        java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155664h;
        kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
        if (bool.booleanValue()) {
            str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
            kotlin.jvm.internal.o.f(str2, "getThumbPath(...)");
            str = "";
        } else {
            str = captureDataManager$CaptureVideoNormalModel.f155661e;
            kotlin.jvm.internal.o.f(str, "getVideoPath(...)");
            str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
            kotlin.jvm.internal.o.f(str2, "getThumbPath(...)");
        }
        r45.ba4 ba4Var = new r45.ba4();
        kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
        if (bool.booleanValue()) {
            ba4Var.set(0, str2);
            i27 = 0;
        } else {
            ba4Var.set(0, null);
            r45.gg0 gg0Var = new r45.gg0();
            gg0Var.set(0, str);
            gg0Var.set(1, str2);
            ba4Var.set(1, gg0Var);
        }
        ba4Var.set(2, java.lang.Integer.valueOf(i27));
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        r4Var.r3(context2, S0(), ba4Var);
    }

    public final void A1(boolean z17) {
        kn0.p c17;
        kn0.p c18;
        dk2.xf W0;
        if (zl2.r4.F1(S0())) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveAnchorCameraOptPanelPlugin", "closeCamera: blocked in CoLive room (defensive guard), isNeedRequest=" + z17);
            return;
        }
        mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
        int i17 = (int) ((mm2.c1) P0(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        c1Var.p8(i17 | 256);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("closeCamera", (int) ((mm2.c1) P0(mm2.c1.class)).f328866q);
        boolean z18 = false;
        if (z17 && this.f111799q == 1 && (W0 = W0()) != null) {
            dk2.xf.h(W0, ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) P0(mm2.e1.class)).f328983m, ((mm2.c1) P0(mm2.c1.class)).f328866q, 256L, 0, null, 48, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
        hn0.f C1 = C1();
        if (C1 != null && (c18 = ((hn0.p) C1).c()) != null) {
            z18 = c18.f309589i;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z18);
        this.f111797p.statusChange(qo0.b.f365366i4, bundle);
        if (this.f111799q != 1) {
            hn0.f C12 = C1();
            if (C12 == null || (c17 = ((hn0.p) C12).c()) == null) {
                return;
            }
            c17.l();
            return;
        }
        hn0.f C13 = C1();
        if (C13 != null) {
            android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ajc);
            kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
            ((tn0.w0) ((hn0.p) C13).f282399a).I0(pm0.v.n(drawable));
        }
    }

    @Override // qo0.a
    public boolean B0() {
        int i17 = this.f111807x0;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            H1(false);
        } else if (i17 == 3) {
            wm2.n nVar = this.Z;
            if (((java.util.ArrayList) nVar.f447257g).size() > 1) {
                nVar.f447258h.a();
            } else {
                nVar.a(true, false);
            }
        } else if (i17 == 5) {
            H1(true);
        } else {
            if (i17 != 6) {
                return false;
            }
            H1(true);
        }
        return true;
    }

    public final void B1(android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup = this.f365323d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
        java.lang.String string = bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN") ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491228nh3) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cnf);
        kotlin.jvm.internal.o.d(string);
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cne);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        k0Var.q(string, 17);
        k0Var.Q1.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.u4(this, string2);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.plugin.v4(this);
        k0Var.v();
    }

    public final hn0.f C1() {
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null) {
            return w0Var.f420773t;
        }
        return null;
    }

    public final java.lang.String D1() {
        return I1() ? "anchorlive.bottom.videosetting.gesture" : "startlive.bottom.videosetting.gesture";
    }

    public final java.lang.String E1() {
        return I1() ? "anchorlive.bottom.videosetting.mirror" : "startlive.bottom.videosetting.mirror";
    }

    public final java.lang.String F1() {
        return I1() ? "anchorlive.bottom.audiosetting.background" : "startlive.bottom.audiosetting.background";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final java.lang.String G1() {
        return I1() ? "anchorlive.bottom.videosetting.switchcam" : "startlive.bottom.videosetting.switchcam";
    }

    public final void H1(boolean z17) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.x4(this, z17));
    }

    public final boolean I1() {
        kn0.p c17;
        hn0.f C1 = C1();
        return (C1 == null || (c17 = ((hn0.p) C1).c()) == null || !c17.h()) ? false : true;
    }

    @Override // qo0.a
    public void J0() {
    }

    public final void J1(android.view.View view, ml2.u1 u1Var, java.lang.String str) {
        if (view.getVisibility() == 0) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, u1Var, this.f111809y0, null, null, null, null, false, 124, null);
        }
        if (!view.isShown() || str == null) {
            return;
        }
        ll2.e.f319133a.j(str, false);
    }

    public final void K1() {
        kn0.p c17;
        kn0.p c18;
        mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
        int i17 = (int) ((mm2.c1) P0(mm2.c1.class)).f328866q;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        c1Var.p8(i17 & (-257));
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("openCamera", (int) ((mm2.c1) P0(mm2.c1.class)).f328866q);
        int i18 = this.f111799q;
        qo0.c cVar = this.f111797p;
        boolean z17 = false;
        if (i18 == 1) {
            dk2.xf W0 = W0();
            if (W0 != null) {
                dk2.xf.h(W0, ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) P0(mm2.e1.class)).f328983m, ((mm2.c1) P0(mm2.c1.class)).f328866q, 256L, 0, null, 48, null);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            cVar.statusChange(qo0.b.f365370j4, bundle);
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        hn0.f C1 = C1();
        if (C1 != null && (c18 = ((hn0.p) C1).c()) != null) {
            z17 = c18.f309589i;
        }
        bundle2.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z17);
        cVar.statusChange(qo0.b.f365366i4, bundle2);
        hn0.f C12 = C1();
        if (C12 == null || (c17 = ((hn0.p) C12).c()) == null) {
            return;
        }
        c17.m();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 27) {
            com.tencent.mm.plugin.finder.live.widget.fe feVar = this.X;
            feVar.getClass();
            r45.h84 h84Var = com.tencent.mm.plugin.finder.live.widget.fe.f118342i;
            feVar.c(new com.tencent.mm.plugin.finder.live.widget.de(h84Var, ""));
            dk2.ef efVar = dk2.ef.f233372a;
            dk2.ef.f233408w = 0L;
            efVar.e0(new com.tencent.mm.plugin.finder.live.widget.de(h84Var, ""));
            com.tencent.mm.plugin.finder.live.widget.sv svVar = this.Y;
            svVar.getClass();
            r45.h84 h84Var2 = com.tencent.mm.plugin.finder.live.widget.sv.f119839i;
            svVar.c(new com.tencent.mm.plugin.finder.live.widget.qv(h84Var2, ""));
            dk2.ef.f233409x = 0L;
            efVar.h0(new com.tencent.mm.plugin.finder.live.widget.qv(h84Var2, ""));
            return;
        }
        if (ordinal != 136) {
            if (ordinal != 137) {
                return;
            }
            H1(false);
            return;
        }
        this.f111799q = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 0) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCameraOptionEnable business(LiveCommonSlice::class.java).exptFilterEnable:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).O3);
        sb6.append(" business(LiveCommonSlice::class.java).exptBeautyEnable:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).N3);
        sb6.append(" audioModeEnableBySwitchFlag:");
        zl2.r4 r4Var = zl2.r4.f473950a;
        ya2.b2 b2Var = ((mm2.c1) P0(mm2.c1.class)).J4;
        sb6.append(pm0.v.z((int) (b2Var != null ? b2Var.field_liveSwitchFlag : 0L), 8));
        sb6.append(" audioModeEnableByExpt:");
        sb6.append(r4Var.j());
        sb6.append(" business(LiveCommonSlice::class.java).enableAudioMode():");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).l7());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", sb6.toString());
        boolean z17 = ((mm2.c1) P0(mm2.c1.class)).N3;
        android.view.ViewGroup viewGroup = this.D;
        android.view.ViewGroup viewGroup2 = this.P;
        if (!z17) {
            viewGroup2.removeView(viewGroup);
        }
        viewGroup2.removeView(viewGroup);
        viewGroup2.removeView(this.f111801s);
        if (((mm2.c1) P0(mm2.c1.class)).O7()) {
            android.view.View view = this.L;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.L;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ya2.b2 b2Var2 = ((mm2.c1) P0(mm2.c1.class)).J4;
        if (!pm0.v.z((int) (b2Var2 != null ? b2Var2.field_liveSwitchFlag : 0L), 8) || !r4Var.j() || !r4Var.x1()) {
            android.view.View view3 = this.L;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (zl2.r4.F1(S0())) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable: CoLive room, hide changeModeView (close-camera entry)");
            android.view.View view4 = this.L;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkCameraOptionEnable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!df2.d6.f229944n.a(S0())) {
            viewGroup2.removeView(this.G);
        }
        uh2.c cVar = uh2.c.f427953a;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.addAll(uh2.c.f427954b);
        if (arrayList5.isEmpty()) {
            viewGroup2.removeView(this.B);
        }
        vh2.c cVar2 = vh2.c.f437041a;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.addAll(vh2.c.f437042b);
        if (arrayList6.isEmpty()) {
            viewGroup2.removeView(this.C);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode audioModeEnable:" + ((mm2.c1) P0(mm2.c1.class)).l7());
        android.widget.TextView titleTv = this.K;
        kotlin.jvm.internal.o.f(titleTv, "titleTv");
        com.tencent.mm.ui.fk.a(titleTv);
        boolean l76 = ((mm2.c1) P0(mm2.c1.class)).l7();
        android.widget.TextView textView = this.M;
        android.view.ViewGroup viewGroup3 = this.f365323d;
        if (l76) {
            android.view.View view5 = this.N;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup2.setVisibility(8);
            titleTv.setText(viewGroup3.getContext().getString(com.tencent.mm.R.string.eix));
            textView.setText(viewGroup3.getContext().getString(com.tencent.mm.R.string.d8k));
        } else {
            android.view.View view6 = this.N;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAudioMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup2.setVisibility(0);
            titleTv.setText(viewGroup3.getContext().getString(com.tencent.mm.R.string.d86));
            textView.setText(viewGroup3.getContext().getString(com.tencent.mm.R.string.d8l));
        }
        if (this.f111799q == 0) {
            this.f111809y0 = ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z4(this));
            return;
        }
        this.f111809y0 = ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z4(this));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 0);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328378t, jSONObject.toString(), null, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mm.plugin.finder.live.widget.fe feVar = this.X;
        kotlinx.coroutines.y0 y0Var = feVar.f118344b;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        feVar.f118344b = null;
        com.tencent.mm.plugin.finder.live.widget.sv svVar = this.Y;
        kotlinx.coroutines.y0 y0Var2 = svVar.f119841b;
        if (y0Var2 != null) {
            kotlinx.coroutines.z0.c(y0Var2, null);
        }
        svVar.f119841b = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        kn0.p pVar;
        if (((mm2.e1) P0(mm2.e1.class)).g7()) {
            ((mm2.c1) P0(mm2.c1.class)).D8(1);
            tn0.w0 Z0 = Z0();
            if (Z0 != null && (pVar = Z0.D) != null) {
                pVar.l();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "onStartLive voice room close camera");
            A1(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        kn0.f fVar;
        kn0.f fVar2;
        kn0.f fVar3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.eta) {
            z1(null);
        } else {
            boolean z17 = false;
            android.view.ViewGroup viewGroup = this.f365323d;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484586et5) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.W, this.f111809y0, null, null, null, null, false, 124, null);
                kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                if ((iVar == null || (fVar3 = iVar.f309560d) == null || !fVar3.f309530b) ? false : true) {
                    kn0.i iVar2 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                    if (iVar2 != null && (fVar2 = iVar2.f309560d) != null && fVar2.f309533e) {
                        z17 = true;
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f111808y;
                    if (z17) {
                        weImageView.animate().rotationY(180.0f).setDuration(200L).start();
                    } else {
                        weImageView.animate().rotationY(0.0f).setDuration(200L).start();
                    }
                    kn0.i iVar3 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                    kn0.f fVar4 = iVar3 != null ? iVar3.f309560d : null;
                    if (fVar4 != null) {
                        kn0.i iVar4 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
                        fVar4.f309533e = !((iVar4 == null || (fVar = iVar4.f309560d) == null) ? true : fVar.f309533e);
                    }
                    hn0.f C1 = C1();
                    if (C1 != null) {
                        ((hn0.p) C1).j(dk2.ef.f233372a.G());
                    }
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.f328384w, "", null, 4, null);
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickMirror while using front camera, skip!");
                    db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dwh), 0).show();
                }
                ll2.e.b(ll2.e.f319133a, E1(), false, false, 6, null);
            } else {
                android.view.ViewGroup viewGroup2 = this.f111800r;
                if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.est) {
                    com.tencent.mm.plugin.finder.live.widget.fe.b(this.X, 2, null, null, 0L, 14, null);
                    this.f111807x0 = 5;
                    viewGroup2.animate().translationY(com.tencent.mm.ui.bl.b(viewGroup.getContext()).y).setDuration(100L).setListener(new com.tencent.mm.plugin.finder.live.plugin.q4(this)).start();
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.nxm) {
                    com.tencent.mm.plugin.finder.live.widget.sv.b(this.Y, 2, null, null, 0L, 14, null);
                    this.f111807x0 = 6;
                    viewGroup2.animate().translationY(com.tencent.mm.ui.bl.b(viewGroup.getContext()).y).setDuration(100L).setListener(new com.tencent.mm.plugin.finder.live.plugin.r4(this)).start();
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.esq) {
                    x1(false, null);
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fmm) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
                    java.lang.String string = !((mm2.c1) P0(mm2.c1.class)).l7() ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cnh) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cnf);
                    kotlin.jvm.internal.o.d(string);
                    java.lang.String string2 = !((mm2.c1) P0(mm2.c1.class)).l7() ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cng) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cne);
                    kotlin.jvm.internal.o.d(string2);
                    k0Var.q(string, 17);
                    k0Var.Q1.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
                    k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.m4(this, string2);
                    k0Var.f211881s = new com.tencent.mm.plugin.finder.live.plugin.n4(this);
                    k0Var.f211854d = new com.tencent.mm.plugin.finder.live.plugin.o4(this);
                    k0Var.f211856e = new com.tencent.mm.plugin.finder.live.plugin.p4(this);
                    k0Var.v();
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.etb) {
                    H1(false);
                    if (gm0.j1.u().l()) {
                        zl2.r4 r4Var = zl2.r4.f473950a;
                        android.content.Context context = viewGroup.getContext();
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        r4Var.i1((com.tencent.mm.ui.MMActivity) context, this.V);
                    } else {
                        db5.t7.l(viewGroup.getContext());
                    }
                    ll2.e.b(ll2.e.f319133a, F1(), false, false, 6, null);
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.etf) {
                    if (this.f111807x0 == 3) {
                        i95.m c19 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        zy2.zb.y6((zy2.zb) c19, ml2.z4.f328380u, "", null, 4, null);
                        com.tencent.mm.plugin.finder.live.plugin.y4 y4Var = new com.tencent.mm.plugin.finder.live.plugin.y4(this);
                        wm2.n nVar = this.Z;
                        nVar.f447259i = y4Var;
                        nVar.a(true, false);
                    } else {
                        H1(false);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.et8) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    if (((mm2.c1) P0(mm2.c1.class)).S) {
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        str = "toString(...)";
                        zy2.zb.y6((zy2.zb) c27, ml2.z4.G1, jSONObject2, null, 4, null);
                    } else {
                        str = "toString(...)";
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c28, "getService(...)");
                        ml2.c1 c1Var = ml2.c1.f327325e;
                        zy2.zb.j5((zy2.zb) c28, 39L, jSONObject2, null, 4, null);
                    }
                    long E0 = zl2.r4.f473950a.E0(S0());
                    boolean A = pm0.v.A(E0, 256L);
                    boolean A2 = pm0.v.A(E0, 512L);
                    int size = je2.g.S6((je2.g) P0(je2.g.class), false, 1, null).size();
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickSticker liveFunSwitchFlags:" + E0 + ",enableTextSticker:" + A + ",enablePictureSticker:" + A2 + ",textBubbleSize:" + size + '!');
                    if (A && size > 0 && A2) {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), false, 1);
                        k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.s4(this, 3, 1, 4, 2);
                        k0Var2.f211881s = new com.tencent.mm.plugin.finder.live.plugin.t4(1, this, 3, 2, 4);
                        k0Var2.v();
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("type", 3);
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        kotlin.jvm.internal.o.f(jSONObject4, str);
                        y1(this, jSONObject4);
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        jSONObject5.put("type", 5);
                        java.lang.String jSONObject6 = jSONObject5.toString();
                        kotlin.jvm.internal.o.f(jSONObject6, str);
                        y1(this, jSONObject6);
                    } else if (A && size > 0) {
                        hf2.x xVar = (hf2.x) U0(hf2.x.class);
                        if (xVar != null) {
                            xVar.w7(1, "");
                        }
                    } else if (A2) {
                        r45.ei0 ei0Var = ((je2.g) P0(je2.g.class)).f299222g;
                        if (((ei0Var == null || (linkedList = ei0Var.f373530e) == null) ? 0 : linkedList.size()) > 0) {
                            hf2.x xVar2 = (hf2.x) U0(hf2.x.class);
                            if (xVar2 != null) {
                                xVar2.w7(2, "");
                            }
                        } else {
                            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                            android.content.Context context2 = viewGroup.getContext();
                            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                            ((ub0.r) oVar).getClass();
                            com.tencent.mm.pluginsdk.ui.tools.l7.e((android.app.Activity) context2, this.W, 1, 28, null);
                        }
                    }
                    H1(false);
                } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484575er3) {
                    H1(false);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1(boolean z17) {
        int i17 = z17 ? 24057 : 24021;
        java.lang.String str = z17 ? "anchorlive.bottom.videosetting.gesture" : "startlive.bottom.videosetting.gesture";
        java.lang.String str2 = z17 ? "anchorlive.bottom.videosetting" : "startlive.bottom.videosetting";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.f03 f03Var = new r45.f03();
        f03Var.f373887d = 6;
        f03Var.f373891h = 1;
        f03Var.f373892i = str;
        f03Var.f373893m = str2;
        f03Var.f373900t = 1;
        arrayList.add(f03Var);
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f373891h = 2;
        f03Var2.f373892i = str2;
        arrayList.add(f03Var2);
        ll2.e.f319133a.i(i17, arrayList, "live_bottom_gesture_effect");
    }

    public final void w1() {
        boolean z17 = ko0.l.f309870a.b().f320079d.a() || ko0.l0.f309878a.b().f320062c.a() || ko0.c0.f309825a.b().f319995d.a();
        android.view.View view = this.E;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAndAutoSetCustomRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin", "checkAndAutoSetCustomRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r15.getBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN") == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(boolean r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.a5.x1(boolean, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.fe feVar = this.X;
        feVar.getClass();
        feVar.f118344b = kotlinx.coroutines.z0.b();
        feVar.f118345c.setAdapter(feVar.f118346d);
        com.tencent.mm.plugin.finder.live.widget.sv svVar = this.Y;
        svVar.getClass();
        svVar.f119841b = kotlinx.coroutines.z0.b();
        svVar.f119842c.setAdapter(svVar.f119843d);
        df2.o5 o5Var = df2.d6.f229944n;
        if (o5Var.b(S0()) && o5Var.a(S0())) {
            v1(true);
            v1(false);
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "hasShowRedDot");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_GESTURE_EFFECT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(android.os.Bundle bundle) {
        kn0.f fVar;
        kn0.f fVar2;
        int i17 = 0;
        if ((bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN")) == true) {
            this.f111799q = I1() ? 1 : 0;
            B1(bundle);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.X, this.f111809y0, null, null, null, null, false, 124, null);
        kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f328990t;
        kn0.f fVar3 = iVar != null ? iVar.f309560d : null;
        if (fVar3 != null) {
            kn0.i iVar2 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
            fVar3.f309530b = !((iVar2 == null || (fVar2 = iVar2.f309560d) == null) ? true : fVar2.f309530b);
        }
        qo0.b bVar = qo0.b.f365402q;
        android.os.Bundle bundle2 = new android.os.Bundle();
        qo0.c cVar = this.f111797p;
        cVar.statusChange(bVar, bundle2);
        kn0.i iVar3 = ((mm2.e1) P0(mm2.e1.class)).f328990t;
        java.lang.Object[] objArr = (iVar3 == null || (fVar = iVar3.f309560d) == null || !fVar.f309530b) ? false : true;
        android.widget.TextView textView = this.f111806x;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f111808y;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (objArr == true) {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        } else {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        int i18 = vn0.b.f438174a.b().f455410a == 0 ? 2 : 1;
        if (cVar.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.j0.f327583i.T.f327668o++;
            if (bundle != null) {
                ml2.m1[] m1VarArr = ml2.m1.f327711d;
                i17 = bundle.getInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", 0);
            } else {
                ml2.m1[] m1VarArr2 = ml2.m1.f327711d;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i18);
            ml2.m1[] m1VarArr3 = ml2.m1.f327711d;
            if (i17 != 0) {
                jSONObject.put(ya.b.SOURCE, i17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.f328350f, jSONObject2, null, 4, null);
        }
        if (this.f111799q == 0) {
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c19;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 5L, java.lang.String.valueOf(i18), null, 4, null);
        }
        ll2.e.b(ll2.e.f319133a, G1(), false, false, 6, null);
    }
}
