package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public class hm extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {
    public static final java.lang.String T1;
    public static final int U1;
    public final bm2.b4 A;
    public final jz5.g A1;
    public final android.widget.TextView B;
    public vg2.v0 B1;
    public final android.view.View C;
    public boolean C1;
    public final android.view.View D;
    public final java.util.ArrayList D1;
    public final android.view.View E;
    public android.os.Bundle E1;
    public final android.view.View F;
    public final java.util.Set F1;
    public js4.k G;
    public final java.util.Map G1;
    public boolean H;
    public final java.util.Map H1;
    public long I;
    public final long I1;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f112825J;
    public final long J1;
    public final java.lang.Object K;
    public final java.util.Map K1;
    public java.lang.String L;
    public final int L1;
    public final com.tencent.mm.plugin.finder.view.e3 M;
    public final int M1;
    public final java.util.ArrayList N;
    public vg2.m N1;
    public ce2.i O1;
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter P;
    public final jz5.g P1;
    public final com.tencent.mm.plugin.finder.live.plugin.lj Q;
    public final tg2.h Q1;
    public java.lang.String R;
    public int R1;
    public java.lang.String S;
    public long S1;
    public final android.widget.LinearLayout T;
    public final android.widget.LinearLayout U;
    public final android.widget.ImageView V;
    public final android.view.View V1;
    public final android.widget.TextView W;
    public final android.widget.TextView X;
    public final android.view.View Y;
    public final android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f112826l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112827p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.ViewGroup f112828p0;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f112829p1;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.jj f112830q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f112831r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f112832s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.viewpager.widget.ViewPager f112833t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView f112834u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f112835v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f112836w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f112837x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f112838x0;

    /* renamed from: x1, reason: collision with root package name */
    public final jz5.g f112839x1;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView f112840y;

    /* renamed from: y0, reason: collision with root package name */
    public final jz5.g f112841y0;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f112842y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f112843z;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f112844z1;

    static {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.d5o);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        T1 = string;
        U1 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.jj jjVar) {
        super(root, statusMonitor, null);
        com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout finderMaxSizeLinearLayout;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112827p = statusMonitor;
        this.f112830q = jjVar;
        this.f112831r = "Finder.FinderLiveGiftPanelPlugin";
        bm2.b4 b4Var = new bm2.b4();
        this.A = b4Var;
        this.f112825J = true;
        this.K = root.getContext().getSystemService("vibrator");
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(root.getContext());
        this.M = e3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.N = arrayList;
        this.f112841y0 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.sj(root, this));
        this.f112826l1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.uj(root));
        this.f112829p1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.tj(root, this));
        this.f112839x1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.vj(root));
        this.f112842y1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.wj(root));
        this.f112844z1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.bk(root, this));
        this.A1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.zj(root, this));
        this.D1 = new java.util.ArrayList();
        this.F1 = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        this.G1 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.H1 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.I1 = 300L;
        this.J1 = 3000L;
        this.K1 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.L1 = 1093443453;
        this.M1 = 548888525;
        this.P1 = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.fk.f112565d);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f1g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f112835v = textView;
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 15.0f, 0.0f, 8, null);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f1a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f484653f16);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f112832s = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f3s);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById4;
        this.f112833t = viewPager;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f3d);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f112834u = (com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f1_);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById6;
        this.f112836w = liveBottomSheetPanel;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.f1d);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById7;
        this.f112837x = textView2;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.f484663f32);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f112840y = (com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView) findViewById8;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 15.0f, 0.0f, 8, null);
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.f1c);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f112843z = findViewById9;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f1o);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById10;
        this.B = textView3;
        android.content.Context context3 = root.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView3, 14.0f, 0.0f, 8, null);
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f1l);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.f1m);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.D = findViewById12;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.f1k);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.E = findViewById13;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.f1n);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.F = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.ihz);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById15;
        this.T = linearLayout;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.f485662ij1);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.U = (android.widget.LinearLayout) findViewById16;
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.q5e);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.X = (android.widget.TextView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.f18);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.W = (android.widget.TextView) findViewById18;
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.f17);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.V = (android.widget.ImageView) findViewById19;
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.f487795zn);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.V1 = findViewById20;
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.grk);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.Y = findViewById21;
        android.view.View findViewById22 = root.findViewById(com.tencent.mm.R.id.f3t);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.Z = findViewById22;
        android.view.View findViewById23 = root.findViewById(com.tencent.mm.R.id.f1e);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.f112828p0 = (android.view.ViewGroup) findViewById23;
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.gj(this));
        liveBottomSheetPanel.setOnTranslateYChangeListener(new com.tencent.mm.plugin.finder.live.plugin.hj(this));
        liveBottomSheetPanel.setForbidNestScroll(true);
        viewPager.setAdapter(b4Var);
        imageView.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        findViewById11.setOnClickListener(this);
        textView2.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
        R1(this, imageView, "finder_live_room_gift_back_icon", 0, 4, null);
        R1(this, findViewById3, "finder_live_room_gift_blank", 0, 4, null);
        R1(this, findViewById11, "finder_live_room_wecoin_icon", 0, 4, null);
        int c17 = com.tencent.mm.ui.bl.c(root.getContext());
        if (!x0()) {
            liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
            liveBottomSheetPanel.setPadding(liveBottomSheetPanel.getPaddingLeft(), liveBottomSheetPanel.getPaddingTop(), liveBottomSheetPanel.getPaddingRight(), liveBottomSheetPanel.getPaddingBottom() + c17);
        } else {
            liveBottomSheetPanel.getLayoutParams().width = com.tencent.mm.ui.bl.b(root.getContext()).y;
            liveBottomSheetPanel.setTranslationX(com.tencent.mm.ui.bl.b(root.getContext()).x);
        }
        p52.h.f352030o = false;
        ya2.b2 B1 = B1();
        java.lang.String w07 = B1 != null ? B1.w0() : T1;
        ya2.b2 B12 = B1();
        this.Q = new com.tencent.mm.plugin.finder.live.plugin.lj("", w07, B12 != null ? B12.getAvatarUrl() : null);
        e3Var.f(com.tencent.mm.R.layout.arr);
        android.view.ViewGroup viewGroup = e3Var.f131975y;
        if (viewGroup != null && (finderMaxSizeLinearLayout = (com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.bud)) != null) {
            finderMaxSizeLinearLayout.setMaxHeight(((int) ((com.tencent.mm.ui.bl.b(root.getContext()).y - com.tencent.mm.ui.bl.c(root.getContext())) * 0.75f)) - i65.a.b(root.getContext(), 54));
        }
        e3Var.f131965o = true;
        e3Var.c(false);
        if (e3Var.f131959f != null) {
            e3Var.f131975y.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
            android.view.View view = e3Var.f131970t;
            android.content.Context context4 = e3Var.f131958e;
            view.setBackgroundColor(context4.getResources().getColor(com.tencent.mm.R.color.f478513v));
            e3Var.f131971u.setTextColor(context4.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            e3Var.f131971u.setBackgroundResource(com.tencent.mm.R.drawable.f481339qv);
        }
        android.view.View findViewById24 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.ihw);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById24;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.live.gift.FinderLiveChooseGiftFactory(this, new com.tencent.mm.plugin.finder.live.plugin.ij(this)), arrayList, false);
        this.P = wxRecyclerAdapter;
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        if (!zl2.r4.f473950a.W1(S0())) {
            L1();
        }
        com.tencent.mm.plugin.finder.live.plugin.jj jjVar2 = com.tencent.mm.plugin.finder.live.plugin.jj.f113115e;
        android.view.ViewGroup viewGroup2 = this.f365323d;
        if (jjVar == jjVar2) {
            textView.setText(viewGroup2.getContext().getResources().getString(com.tencent.mm.R.string.eko));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById11, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "handlerOptionMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById11.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById11, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "handlerOptionMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setText(viewGroup2.getContext().getResources().getString(com.tencent.mm.R.string.djj));
        }
        this.Q1 = new com.tencent.mm.plugin.finder.live.plugin.bl(this, root);
    }

    public static void J1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, android.view.ViewGroup viewGroup, java.lang.String str, int i17, boolean z17, boolean z18, ce2.i iVar, boolean z19, int i18, java.lang.Object obj) {
        ce2.i e17;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToSendGift");
        }
        android.view.ViewGroup viewGroup2 = (i18 & 1) != 0 ? null : viewGroup;
        int i19 = (i18 & 4) != 0 ? 1 : i17;
        boolean z27 = (i18 & 8) != 0 ? true : z17;
        boolean z28 = (i18 & 16) != 0 ? false : z18;
        ce2.i iVar2 = (i18 & 32) == 0 ? iVar : null;
        boolean z29 = (i18 & 64) != 0 ? false : z19;
        hmVar.L = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToSendGift curGiftId:");
        sb6.append(hmVar.L);
        sb6.append(" click!, sendGiftTargetContact = ");
        com.tencent.mm.plugin.finder.live.plugin.lj ljVar = hmVar.Q;
        sb6.append(ljVar);
        sb6.append(", wecoinBalanceValid = ");
        sb6.append(hmVar.H);
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, sb6.toString());
        hmVar.G1();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z37 = z27;
        boolean z38 = currentTimeMillis - hmVar.S1 < ((long) 500);
        hmVar.S1 = currentTimeMillis;
        if (z38) {
            return;
        }
        if (!hmVar.H) {
            android.view.ViewGroup viewGroup3 = hmVar.f365323d;
            db5.t7.m(viewGroup3.getContext(), viewGroup3.getContext().getResources().getString(com.tencent.mm.R.string.dk6));
            return;
        }
        java.lang.String str2 = hmVar.L;
        if (str2 == null) {
            str2 = "";
        }
        if (hmVar.I1(str2, iVar2)) {
            ((mm2.c1) hmVar.P0(mm2.c1.class)).w8(com.tencent.mm.sdk.platformtools.t8.E1(hmVar.B.getText().toString()));
            if (viewGroup2 != null && (e17 = dk2.u7.f234181a.e(hmVar.L)) != null) {
                float P0 = e17.P0();
                if (((mm2.c1) hmVar.P0(mm2.c1.class)).f328880s3 >= ((int) P0)) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_gift_send", java.lang.Float.valueOf(P0), kz5.b1.e(new jz5.l("live_gift_id", hmVar.L)), 25561);
                }
            }
            dk2.u7.f234181a.h(hmVar.L, false);
            if (hmVar.L != null) {
                java.lang.Object obj2 = hmVar.K;
                if (obj2 instanceof android.os.Vibrator) {
                    ((android.os.Vibrator) obj2).vibrate(50L);
                }
            }
            hmVar.H1();
            qo0.b bVar = qo0.b.Z1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", hmVar.L);
            java.lang.String str3 = hmVar.R;
            if (!(str3 == null || str3.length() == 0)) {
                bundle.putString("PARAM_FINDER_LIVE_SING_SONG_NAME", hmVar.R);
            }
            bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i19);
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", z37);
            bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_IS_PKG", z28);
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_FREE_GIFT", z29);
            android.os.Bundle bundle2 = hmVar.E1;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (ljVar != null) {
                bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_TARGET_USER_NAME", ljVar.f113401a);
            }
            hmVar.f112827p.statusChange(bVar, bundle);
        }
    }

    public static /* synthetic */ void Q1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, java.lang.String str, boolean z17, int i17, int i18, long j17, boolean z18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportLoadMoreResult");
        }
        hmVar.P1(str, z17, i17, i18, j17, (i19 & 32) != 0 ? false : z18);
    }

    public static void R1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, android.view.View view, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReportSdkPolicy");
        }
        if ((i18 & 4) != 0) {
            i17 = 8;
        }
        hmVar.getClass();
        dy1.a.i(view, str);
        dy1.a.l(view, i17, 25561);
    }

    public static void T1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, com.tencent.mm.plugin.finder.live.plugin.lj ljVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGiftListContent");
        }
        if ((i17 & 1) != 0) {
            ljVar = null;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        if (!((mm2.c1) hmVar.P0(mm2.c1.class)).m7()) {
            if (hmVar.f112830q != com.tencent.mm.plugin.finder.live.plugin.jj.f113115e) {
                com.tencent.mars.xlog.Log.i(hmVar.f112831r, "showGiftListContent business(LiveCommonSlice::class.java).enableGift:" + ((mm2.c1) hmVar.P0(mm2.c1.class)).m7());
                return;
            }
        }
        hmVar.H = false;
        hmVar.N1();
        hmVar.W1(null);
        qo0.c.a(hmVar.f112827p, qo0.b.f365326a2, null, 2, null);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.tl(ljVar, hmVar, str, str2));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, ce2.i iVar) {
        hmVar.H1();
        android.content.Context context = hmVar.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        vg2.m mVar = new vg2.m(context, iVar, new com.tencent.mm.plugin.finder.live.plugin.nl(hmVar));
        hmVar.N1 = mVar;
        com.tencent.mm.plugin.finder.live.widget.e0.W(mVar, null, false, 0, 7, null);
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, boolean z17) {
        android.view.ViewGroup viewGroup = hmVar.f365323d;
        if (!z17) {
            android.content.Intent intent = new android.content.Intent();
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e((android.app.Activity) context, hmVar.L1, 1, 28, intent);
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
        java.lang.String str2 = java.util.UUID.randomUUID() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        ((ub0.r) oVar2).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.l((android.app.Activity) context2, str, str2, hmVar.M1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.hm r21) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hm.v1(com.tencent.mm.plugin.finder.live.plugin.hm):void");
    }

    public static final void w1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, com.tencent.mm.plugin.finder.live.plugin.lj ljVar) {
        hmVar.getClass();
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, "refreshTargetContact: contact = " + ljVar);
        com.tencent.mm.plugin.finder.live.plugin.lj ljVar2 = hmVar.Q;
        if (ljVar2 != null) {
            ljVar2.f113401a = ljVar.f113401a;
        }
        if (ljVar2 != null) {
            ljVar2.f113402b = ljVar.f113402b;
        }
        if (ljVar2 == null) {
            return;
        }
        ljVar2.f113403c = ljVar.f113403c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x019c, code lost:
    
        if ((r6 != null && r6.getBoolean(1)) != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x1(com.tencent.mm.plugin.finder.live.plugin.hm r31, androidx.recyclerview.widget.RecyclerView r32, int r33) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hm.x1(com.tencent.mm.plugin.finder.live.plugin.hm, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public static final void z1(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, boolean z17, java.util.ArrayList arrayList, java.util.LinkedHashMap linkedHashMap) {
        if (hmVar.f112830q == com.tencent.mm.plugin.finder.live.plugin.jj.f113114d) {
            dk2.u7 u7Var = dk2.u7.f234181a;
            java.util.Map map = dk2.u7.f234189i;
            if ((!map.values().isEmpty()) || (!((je2.t) hmVar.P0(je2.t.class)).P6().isEmpty())) {
                if (z17) {
                    com.tencent.mars.xlog.Log.i(hmVar.f112831r, "[buildGiftTabMapWithPkgTab] pkgGiftList = " + map.keySet() + ", batchInfoList = " + u7Var.f().keySet());
                    arrayList.addAll(map.values());
                }
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.util.List P6 = ((je2.t) hmVar.P0(je2.t.class)).P6();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(P6, 10));
                java.util.Iterator it = P6.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((r45.oq1) it.next()).f382442e;
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(str);
                }
                linkedHashSet.addAll(kz5.n0.F0(arrayList2, new com.tencent.mm.plugin.finder.live.plugin.mj()));
                dk2.u7 u7Var2 = dk2.u7.f234181a;
                java.util.Collection values = dk2.u7.f234189i.values();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(values, 10));
                java.util.Iterator it6 = values.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((ce2.i) it6.next()).field_rewardProductId);
                }
                linkedHashSet.addAll(arrayList3);
                java.lang.String string = hmVar.f365323d.getContext().getString(com.tencent.mm.R.string.f491563dj5);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                linkedHashMap.put(string, kz5.n0.S0(linkedHashSet));
            }
        }
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String str = this.f112831r;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i(str, "Activity canceled. " + i17);
            return;
        }
        if (i17 == this.L1 || i17 == this.M1) {
            vg2.m mVar = this.N1;
            java.lang.String str2 = null;
            ce2.i iVar = mVar != null ? mVar.I : null;
            java.lang.String str3 = iVar != null ? iVar.field_rewardProductId : null;
            boolean z17 = false;
            if (str3 == null || str3.length() == 0) {
                com.tencent.mars.xlog.Log.e(str, "Product ID is empty. " + i17);
                return;
            }
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            if (intent != null && (data = intent.getData()) != null) {
                str2 = data.getPath();
            }
            h0Var.f310123d = str2;
            java.lang.String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context context = this.f365323d.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                java.lang.String str5 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                ((ub0.r) oVar).getClass();
                h0Var.f310123d = com.tencent.mm.pluginsdk.ui.tools.l7.b((android.app.Activity) context, intent, str5);
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
            if (charSequence == null || charSequence.length() == 0) {
                com.tencent.mars.xlog.Log.e(str, "Failed getting image picker file path. " + i17);
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "Image picked returned, starting image compression. " + i17 + ", " + ((java.lang.String) h0Var.f310123d));
            java.lang.String str6 = (java.lang.String) h0Var.f310123d;
            android.graphics.Bitmap u27 = zl2.r4.f473950a.u2(str6, 1024, 1024);
            if (u27 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102150s + "/aigc-gifts");
                sb6.append("/images/");
                sb6.append(java.util.UUID.randomUUID());
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(sb7));
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(sb7, false);
                kotlin.jvm.internal.o.f(K, "openWrite(...)");
                android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.tencent.mm.sdk.platformtools.x.j(u27, 524288, compressFormat, byteArrayOutputStream);
                try {
                    byteArrayOutputStream.writeTo(K);
                    z17 = true;
                } catch (java.io.IOException unused) {
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i(str, "Image compression completed. ".concat(sb7));
                    str6 = sb7;
                } else {
                    com.tencent.mars.xlog.Log.w(str, "Image compression failed. ".concat(str6));
                }
            }
            h0Var.f310123d = str6;
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.vk(this, i17, h0Var, str3, iVar, mVar, null), 3, null);
        }
    }

    public final void A1(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f112831r, "[dimissPkgRedDot], " + str);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_NEED_SHOW_PKG_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        ((mm2.s2) P0(mm2.s2.class)).f329410o.postValue(java.lang.Boolean.TRUE);
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        H1();
        if (this.f112827p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327533q, "", 0);
        }
        return true;
    }

    public final ya2.b2 B1() {
        return ya2.h.f460484a.b(((mm2.c1) P0(mm2.c1.class)).f328852o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r7) {
        /*
            r6 = this;
            java.lang.String r0 = "micUserMap"
            kotlin.jvm.internal.o.g(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.lj r7 = r6.Q
            if (r7 == 0) goto Lc6
            java.util.List r0 = r6.F1()
            java.util.List r1 = r6.D1()
            java.lang.String r2 = r7.f113401a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            int r5 = r2.length()
            if (r5 <= 0) goto L1f
            r5 = r3
            goto L20
        L1f:
            r5 = r4
        L20:
            if (r5 == 0) goto L4a
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L29
            goto L45
        L29:
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L45
            java.lang.Object r5 = r1.next()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = (com.tencent.mm.protocal.protobuf.FinderContact) r5
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.D0(r5, r2)
            if (r5 == 0) goto L2d
            r1 = r3
            goto L46
        L45:
            r1 = r4
        L46:
            if (r1 == 0) goto L4a
            r1 = r3
            goto L4b
        L4a:
            r1 = r4
        L4b:
            if (r1 == 0) goto L68
            java.lang.String r0 = r6.f112831r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onAudienceMicUserChanged target is CoLive anchor="
            r1.<init>(r2)
            java.lang.String r7 = r7.f113401a
            r1.append(r7)
            java.lang.String r7 = ", keep"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r7)
            return
        L68:
            java.lang.String r1 = r7.f113401a
            if (r1 == 0) goto L74
            int r1 = r1.length()
            if (r1 != 0) goto L73
            goto L74
        L73:
            r3 = r4
        L74:
            if (r3 != 0) goto Lc6
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L8f
            java.lang.String r7 = r6.f112831r
            java.lang.String r0 = "onAudienceMicUserChanged no mic users, restore to anchor target"
            com.tencent.mars.xlog.Log.i(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.rl r7 = new com.tencent.mm.plugin.finder.live.plugin.rl
            r7.<init>(r6)
            pm0.v.X(r7)
            goto Lc6
        L8f:
            monitor-enter(r0)
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc3
        L97:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc3
            r3 = r2
            km2.q r3 = (km2.q) r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = r3.f309172c     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = r7.f113401a     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.D0(r3, r4)     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto L97
            goto Lb0
        Laf:
            r2 = 0
        Lb0:
            monitor-exit(r0)
            if (r2 != 0) goto Lc6
            java.lang.String r7 = r6.f112831r
            java.lang.String r0 = "onAudienceMicUserChanged mic users change, restore to anchor target"
            com.tencent.mars.xlog.Log.i(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.rl r7 = new com.tencent.mm.plugin.finder.live.plugin.rl
            r7.<init>(r6)
            pm0.v.X(r7)
            goto Lc6
        Lc3:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hm.C0(java.util.LinkedHashMap):void");
    }

    public final jz5.l C1() {
        java.util.ArrayList arrayList;
        java.util.LinkedHashMap linkedHashMap;
        jz5.f0 f0Var;
        java.lang.Object obj;
        dk2.u7 u7Var = dk2.u7.f234181a;
        java.util.Collection values = dk2.u7.f234185e.values();
        synchronized (values) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                ce2.i iVar = (ce2.i) next;
                iVar.Z0();
                if (((this.R1 == 1 && iVar.Y0()) || pm0.v.z(iVar.field_flag, 2)) ? false : true) {
                    arrayList.add(next);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f112831r, "getCacheGiftList cacheGiftListSize:" + arrayList.size() + " \nlist = " + arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        dk2.u7 u7Var2 = dk2.u7.f234181a;
        java.util.Iterator it6 = dk2.u7.f234183c.values().iterator();
        while (it6.hasNext()) {
            arrayList3.addAll((java.util.List) it6.next());
        }
        if (!arrayList3.isEmpty()) {
            pm0.v.b0(arrayList2, new com.tencent.mm.plugin.finder.live.plugin.oj(arrayList3, this));
        }
        com.tencent.mars.xlog.Log.i(this.f112831r, "getCacheGiftList display cacheGiftListSize:" + arrayList.size() + " \nlist = " + arrayList);
        dk2.u7 u7Var3 = dk2.u7.f234181a;
        java.util.Map map = dk2.u7.f234183c;
        kotlin.jvm.internal.o.d(map);
        if (!(!map.isEmpty())) {
            map = null;
        }
        if (map != null) {
            linkedHashMap = new java.util.LinkedHashMap(dk2.u7.f234183c);
            java.util.Iterator it7 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
                java.lang.Object value = entry.getValue();
                java.util.LinkedList linkedList = value instanceof java.util.LinkedList ? (java.util.LinkedList) value : null;
                java.util.Iterator it8 = linkedList != null ? linkedList.iterator() : null;
                if (it8 != null) {
                    while (it8.hasNext()) {
                        java.lang.Object next2 = it8.next();
                        kotlin.jvm.internal.o.f(next2, "next(...)");
                        java.lang.String str = (java.lang.String) next2;
                        java.util.Iterator it9 = arrayList2.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it9.next();
                            if (kotlin.jvm.internal.o.b(((ce2.i) obj).field_rewardProductId, str)) {
                                break;
                            }
                        }
                        if (obj == null) {
                            it8.remove();
                        }
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i(this.f112831r, "[getCacheGiftList] iterator is null , clear tabInfo");
                    linkedHashMap.clear();
                    break;
                }
                if (((java.util.List) entry.getValue()).isEmpty()) {
                    it7.remove();
                }
            }
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        return new jz5.l(arrayList2, linkedHashMap);
    }

    public final java.util.List D1() {
        kotlinx.coroutines.flow.f3 f3Var;
        r45.a84 a84Var;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list;
        boolean z17;
        boolean e17 = e();
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (!e17 || c() || (f3Var = ((mm2.n0) P0(mm2.n0.class)).f329271p) == null || (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) == null || (list = a84Var.getList(1)) == null) {
            return p0Var;
        }
        java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f328852o;
        if (str == null) {
            str = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list) {
            if (finderContact != null) {
                arrayList.add(finderContact);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderContact) next).getUsername();
            if (username == null) {
                username = "";
            }
            boolean z18 = false;
            if (username.length() > 0) {
                if (!hc2.l.g(username)) {
                    zl2.q4 q4Var = zl2.q4.f473933a;
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(username, c01.z1.r())) {
                        z17 = false;
                        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.D0(username, str)) {
                            z18 = true;
                        }
                    }
                }
                z17 = true;
                if (!z17) {
                    z18 = true;
                }
            }
            if (z18) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final vg2.r1 E1() {
        return (vg2.r1) ((jz5.n) this.A1).getValue();
    }

    public final java.util.List F1() {
        java.util.ArrayList arrayList;
        boolean z17;
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                km2.q qVar = (km2.q) obj;
                boolean z18 = false;
                if (!pm0.v.z(qVar.f309182m, 16)) {
                    java.lang.String str = qVar.f309172c;
                    if (!hc2.l.g(str)) {
                        zl2.q4 q4Var = zl2.q4.f473933a;
                        if (!com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r())) {
                            z17 = false;
                            if (!z17 && !kotlin.jvm.internal.o.b(qVar.f309189t, java.lang.Boolean.TRUE)) {
                                z18 = true;
                            }
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        z18 = true;
                    }
                }
                if (z18) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        ((vg2.t) ((jz5.n) this.f112841y0).getValue()).c();
        ((vg2.b0) ((jz5.n) this.f112826l1).getValue()).c();
        ((vg2.a0) ((jz5.n) this.f112829p1).getValue()).a();
        vg2.e0 e0Var = (vg2.e0) ((jz5.n) this.f112839x1).getValue();
        android.view.View view = e0Var.f436499c;
        if (view.getVisibility() == 0) {
            android.view.View view2 = e0Var.f436499c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e0Var.f436498b.removeView(view);
        }
        ((vg2.x0) ((jz5.n) this.f112842y1).getValue()).c();
        ((vg2.r1) ((jz5.n) this.f112844z1).getValue()).g();
        E1().g();
        this.A.b();
        vg2.v0 v0Var = this.B1;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public final void H1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ck(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I1(java.lang.String r11, ce2.i r12) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hm.I1(java.lang.String, ce2.i):boolean");
    }

    @Override // qo0.a
    public void J0() {
        if (w0() == 0) {
            W1(null);
        }
    }

    public final void K1(java.lang.String curGiftId) {
        kotlin.jvm.internal.o.g(curGiftId, "curGiftId");
        com.tencent.mars.xlog.Log.i(this.f112831r, "notifyPreviewLoading giftId:".concat(curGiftId));
        bm2.b4 b4Var = this.A;
        b4Var.getClass();
        java.util.Iterator it = b4Var.f21791e.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) it.next()).getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveGiftGridAdapter");
            bm2.a4 a4Var = (bm2.a4) adapter;
            java.util.ArrayList arrayList = a4Var.f21767g;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                ce2.i iVar = (ce2.i) obj;
                androidx.recyclerview.widget.k3 p07 = a4Var.f21765e.p0(i17);
                bm2.n3 n3Var = p07 instanceof bm2.n3 ? (bm2.n3) p07 : null;
                if (n3Var != null) {
                    boolean b17 = kotlin.jvm.internal.o.b(iVar.field_rewardProductId, curGiftId);
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView finderLiveGiftPreviewView = n3Var.f22137q;
                    if (b17) {
                        com.tencent.mars.xlog.Log.i("GiftItemPreview", curGiftId.concat(" show preview loading"));
                        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = finderLiveGiftPreviewView.f115945n;
                        if (mMProcessBar == null) {
                            mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) finderLiveGiftPreviewView.findViewById(com.tencent.mm.R.id.f484647f10);
                        }
                        finderLiveGiftPreviewView.f115945n = mMProcessBar;
                        if (mMProcessBar != null) {
                            mMProcessBar.setVisibility(0);
                        }
                        finderLiveGiftPreviewView.f115940f.setAlpha(0.0f);
                    } else {
                        java.lang.String field_rewardProductId = iVar.field_rewardProductId;
                        kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
                        com.tencent.mars.xlog.Log.i("GiftItemPreview", field_rewardProductId.concat(" hide preview loading"));
                        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2 = finderLiveGiftPreviewView.f115945n;
                        if (mMProcessBar2 != null) {
                            mMProcessBar2.setVisibility(8);
                        }
                        finderLiveGiftPreviewView.f115940f.setAlpha(1.0f);
                    }
                }
            }
        }
    }

    public final void L1() {
        if (this.f112838x0) {
            com.tencent.mars.xlog.Log.i(this.f112831r, "observeData have observe");
            return;
        }
        this.f112838x0 = true;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.s2) P0(mm2.s2.class)).f329404f;
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.gk(this));
        ((mm2.s2) P0(mm2.s2.class)).f329408m.observe(this, new com.tencent.mm.plugin.finder.live.plugin.hk(this));
        ((mm2.s2) P0(mm2.s2.class)).f329409n.observe(this, new com.tencent.mm.plugin.finder.live.plugin.kk(this));
        ((mm2.s2) P0(mm2.s2.class)).f329411p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ok(this));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2 = ((je2.t) P0(je2.t.class)).f299273s;
        liveMutableData2.f111660d = true;
        liveMutableData2.observe(this, new com.tencent.mm.plugin.finder.live.plugin.pk(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            L1();
            return;
        }
        if (ordinal == 27) {
            js4.k kVar = this.G;
            if (kVar != null) {
                ((ns4.s) kVar).d();
                return;
            }
            return;
        }
        if (ordinal != 77) {
            if (ordinal == 123 && !((mm2.c1) P0(mm2.c1.class)).m7()) {
                if (w0() == 0) {
                    H1();
                }
                js4.k kVar2 = this.G;
                if (kVar2 != null) {
                    ((ns4.s) kVar2).d();
                    return;
                }
                return;
            }
            return;
        }
        boolean z17 = false;
        if (bundle != null && bundle.containsKey("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN")) {
            z17 = true;
        }
        java.lang.Long valueOf = (!z17 || bundle == null) ? null : java.lang.Long.valueOf(bundle.getLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN"));
        if (valueOf != null) {
            W1(valueOf);
        } else {
            W1(null);
        }
    }

    public final java.lang.Object M1(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            long j17 = e1Var.f328988r.getLong(0);
            long j18 = e1Var.f328983m;
            java.lang.String str = e1Var.f328992v;
            android.view.ViewGroup viewGroup = this.f365323d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pq5.g l17 = new ek2.z(j17, j18, str, xy2.c.e(context), 0, e1Var.f328985o, zl2.r4.f473950a.b0(eVar), 1, null, null, null, 1792, null).l();
            l17.K(new com.tencent.mm.plugin.finder.live.plugin.pl(nVar, this));
            if (viewGroup.getContext() != null && (viewGroup.getContext() instanceof com.tencent.mm.ui.MMActivity)) {
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) context2);
            }
        }
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public final void N1() {
        com.tencent.mars.xlog.Log.i(this.f112831r, "refreshWecoinLayout, wecoinBalanceValid:" + this.H);
        boolean z17 = this.H;
        android.widget.TextView textView = this.B;
        if (z17) {
            android.view.View view = this.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            android.view.View view3 = this.E;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.F;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.D;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        android.view.View view6 = this.E;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "refreshWecoinLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f112838x0 = false;
        this.A.b();
        this.I = 0L;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f112836w;
        if (liveBottomSheetPanel == null) {
            return;
        }
        liveBottomSheetPanel.setOnTranslateYChangeListener(null);
    }

    public final void P1(java.lang.String str, boolean z17, int i17, int i18, long j17, boolean z18) {
        java.lang.String str2 = this.f112831r;
        com.tencent.mm.plugin.finder.live.plugin.kj kjVar = (com.tencent.mm.plugin.finder.live.plugin.kj) this.K1.remove(str);
        if (kjVar == null) {
            return;
        }
        try {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - kjVar.f113259d;
            long j18 = 0;
            long j19 = uptimeMillis - (j17 < 0 ? 0L : j17);
            ae2.in inVar = ae2.in.f3688a;
            int i19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H0).getValue()).r()).intValue() == 1 ? 1 : 0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("optEnabled", i19);
            jSONObject.put("tabName", kjVar.f113256a);
            jSONObject.put("groupId", kjVar.f113257b);
            jSONObject.put("pageIndex", kjVar.f113258c);
            if (j19 >= 0) {
                j18 = j19;
            }
            jSONObject.put("cgiAndProcessMs", j18);
            jSONObject.put("uiAppliedMs", j17);
            jSONObject.put("totalMs", uptimeMillis);
            jSONObject.put("addedItems", i18);
            jSONObject.put("oldItemCount", kjVar.f113260e);
            jSONObject.put("oldGiftCacheSize", kjVar.f113261f);
            jSONObject.put("newGiftCacheSize", dk2.u7.f234185e.size());
            jSONObject.put("lastBufferSize", kjVar.f113262g);
            jSONObject.put(ya.b.SUCCESS, z17 ? 1 : 0);
            jSONObject.put("errCode", i17);
            jSONObject.put("tabSwitched", z18 ? 1 : 0);
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f57145e = 500;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderLiveErrorReportStruct.p(r26.i0.t(jSONObject2, ",", ";", false));
            finderLiveErrorReportStruct.k();
            com.tencent.mars.xlog.Log.i(str2, "[reportLoadMoreResult] " + jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "[reportLoadMoreResult] error", e17);
        }
    }

    public final void U1() {
        com.tencent.mars.xlog.Log.i(this.f112831r, "showGiftPage");
        if (((je2.t) P0(je2.t.class)).f299272r) {
            com.tencent.mars.xlog.Log.i(this.f112831r, "showGiftPage: pkg combo flushing, wait for onPkgComboFlushDone");
            android.view.View view = this.f112843z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "showGiftPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "showGiftPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f112833t.setVisibility(4);
            this.f112837x.setVisibility(8);
            return;
        }
        android.view.View view2 = this.f112843z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "showGiftPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "showGiftPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.l C1 = C1();
        boolean z17 = ((je2.t) P0(je2.t.class)).f299265h;
        if (!((java.util.List) C1.f302833d).isEmpty() && z17) {
            V1((java.util.List) C1.f302833d, (java.util.LinkedHashMap) C1.f302834e);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGiftListFromCgi loading:");
        sb6.append(this.f112843z.getVisibility() == 0);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(this.f112831r, sb6.toString());
        android.view.View view3 = this.f112843z;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "getGiftListFromCgi", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "getGiftListFromCgi", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f112833t.setVisibility(8);
        this.f112837x.setVisibility(8);
        dk2.xf W0 = W0();
        if (W0 != null) {
            ((dk2.r4) W0).A(((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) P0(mm2.e1.class)).f328983m, ((mm2.e1) P0(mm2.e1.class)).f328992v, 1, new com.tencent.mm.plugin.finder.live.plugin.qj(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V1(java.util.List r34, java.util.LinkedHashMap r35) {
        /*
            Method dump skipped, instructions count: 1825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.hm.V1(java.util.List, java.util.LinkedHashMap):void");
    }

    public final void W1(java.lang.Long l17) {
        if (l17 != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sl(this, l17.longValue()));
            return;
        }
        this.I = java.lang.System.currentTimeMillis();
        dk2.xf W0 = W0();
        if (W0 != null) {
            ((dk2.r4) W0).T(this.I, new com.tencent.mm.plugin.finder.live.plugin.gm(this));
        }
    }

    public final boolean c() {
        kotlinx.coroutines.flow.f3 f3Var;
        r45.a84 a84Var;
        return e() && (f3Var = ((mm2.n0) P0(mm2.n0.class)).f329271p) != null && (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) != null && a84Var.getInteger(2) == 0;
    }

    public final boolean e() {
        kotlinx.coroutines.flow.f3 f3Var;
        r45.a84 a84Var;
        if (!zl2.r4.F1(S0()) || (f3Var = ((mm2.n0) P0(mm2.n0.class)).f329271p) == null || (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) == null) {
            return false;
        }
        java.util.LinkedList list = a84Var.getList(1);
        return !(list == null || list.isEmpty());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        java.lang.String str = string != null ? string : "";
        com.tencent.mars.xlog.Log.i(this.f112831r, "onPortraitAction action: ".concat(str));
        if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_CHANGE_GIFT_JUMP_CLICK")) {
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 != null) {
                ((vg2.t) ((jz5.n) this.f112841y0).getValue()).e(str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_TEXT_PANEL")) {
            byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
            if (bArr != null) {
                ce2.g gVar = ce2.i.U1;
                r45.kv1 kv1Var = new r45.kv1();
                kv1Var.parseFrom(bArr);
                pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.plugin.cl(gVar.b(kv1Var)));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_PARAMS_SHOW_CUSTOM_GIFT")) {
            byte[] bArr2 = obj instanceof byte[] ? (byte[]) obj : null;
            if (bArr2 != null) {
                ce2.g gVar2 = ce2.i.U1;
                r45.kv1 kv1Var2 = new r45.kv1();
                kv1Var2.parseFrom(bArr2);
                pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.plugin.dl(this, gVar2.b(kv1Var2)));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js4.k kVar = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f1a) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484653f16)) {
            H1();
            if (this.f112827p.getLiveRole() == 0) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327533q, "", 0);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f1l) {
            if (this.f365323d.getContext() instanceof androidx.fragment.app.FragmentActivity) {
                if (this.f112827p.getLiveRole() == 0) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327527h, "", 0);
                }
                H1();
                dk2.xf W0 = W0();
                if (W0 != null) {
                    android.content.Context context = this.f365323d.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    kVar = dk2.xf.a(W0, (androidx.fragment.app.FragmentActivity) context, 1, 0, new com.tencent.mm.plugin.finder.live.plugin.wk(this), 4, null);
                }
                this.G = kVar;
                if (kVar != null) {
                    ((ns4.s) kVar).f339648m = new com.tencent.mm.plugin.finder.live.plugin.xk(this);
                }
                if (kVar != null) {
                    ((ns4.s) kVar).f339649n = new com.tencent.mm.plugin.finder.live.plugin.yk(this);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f1d) {
            U1();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.ihz) {
            if (c()) {
                com.tencent.mars.xlog.Log.i(this.f112831r, "ll_choose_target click ignored: coLive initiator-only mode");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            H1();
            this.N.clear();
            if (!zl2.r4.f473950a.w1()) {
                java.util.ArrayList arrayList2 = this.N;
                ya2.b2 B1 = B1();
                java.lang.String w07 = B1 != null ? B1.w0() : T1;
                ya2.b2 B12 = B1();
                java.lang.String avatarUrl = B12 != null ? B12.getAvatarUrl() : null;
                com.tencent.mm.plugin.finder.live.plugin.lj ljVar = this.Q;
                arrayList2.add(new tg2.i("", w07, avatarUrl, true, (ljVar == null || (str = ljVar.f113401a) == null || !str.equals("")) ? false : true));
            }
            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : D1()) {
                java.lang.String username = finderContact.getUsername();
                if (username == null) {
                    username = "";
                }
                java.lang.String str2 = username;
                java.util.ArrayList arrayList3 = this.N;
                java.lang.String nickname = finderContact.getNickname();
                if (nickname == null) {
                    nickname = "";
                }
                java.lang.String str3 = nickname;
                java.lang.String headUrl = finderContact.getHeadUrl();
                if (headUrl == null) {
                    headUrl = "";
                }
                java.lang.String str4 = headUrl;
                com.tencent.mm.plugin.finder.live.plugin.lj ljVar2 = this.Q;
                arrayList3.add(new tg2.i(str2, str3, str4, false, kotlin.jvm.internal.o.b(str2, ljVar2 != null ? ljVar2.f113401a : null)));
            }
            java.util.List F1 = F1();
            synchronized (F1) {
                java.util.Iterator it = ((java.util.ArrayList) F1).iterator();
                while (it.hasNext()) {
                    km2.q qVar = (km2.q) it.next();
                    java.util.ArrayList arrayList4 = this.N;
                    java.lang.String str5 = qVar.f309172c;
                    java.lang.String str6 = qVar.f309173d;
                    java.lang.String str7 = qVar.f309171b;
                    com.tencent.mm.plugin.finder.live.plugin.lj ljVar3 = this.Q;
                    arrayList4.add(new tg2.i(str5, str6, str7, false, kotlin.jvm.internal.o.b(str5, ljVar3 != null ? ljVar3.f113401a : null)));
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.P;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            this.M.i();
            this.M.f131968r = new com.tencent.mm.plugin.finder.live.plugin.zk(this);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final jz5.l y1(java.util.List list, java.util.LinkedHashMap linkedHashMap, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (linkedHashMap.size() > 1) {
            java.util.Set entrySet = linkedHashMap.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            int i17 = 0;
            for (java.lang.Object obj : entrySet) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (i17 == 1) {
                    z1(this, z17, arrayList, linkedHashMap2);
                }
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                java.lang.Object value = entry.getValue();
                kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                linkedHashMap2.put(key, value);
                i17 = i18;
            }
        } else if (linkedHashMap.size() > 0) {
            linkedHashMap2.putAll(linkedHashMap);
            z1(this, z17, arrayList, linkedHashMap2);
        }
        return new jz5.l(arrayList, linkedHashMap2);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }

    public /* synthetic */ hm(android.view.ViewGroup viewGroup, qo0.c cVar, com.tencent.mm.plugin.finder.live.plugin.jj jjVar, int i17, kotlin.jvm.internal.i iVar) {
        this(viewGroup, cVar, (i17 & 4) != 0 ? com.tencent.mm.plugin.finder.live.plugin.jj.f113114d : jjVar);
    }
}
