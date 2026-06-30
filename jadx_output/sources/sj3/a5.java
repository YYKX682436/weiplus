package sj3;

/* loaded from: classes14.dex */
public class a5 implements android.view.View.OnClickListener, kv.e0, com.tencent.mm.plugin.multitalk.model.k, xq4.b {
    public final com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout A;
    public final int B;
    public final int C;
    public final android.widget.RelativeLayout D;
    public final android.widget.RelativeLayout E;
    public final androidx.constraintlayout.widget.ConstraintLayout F;
    public final android.widget.RelativeLayout G;
    public final com.tencent.mm.plugin.multitalk.ui.widget.CollapseView H;
    public boolean K;
    public final int P;
    public final android.widget.FrameLayout Q;
    public final android.widget.RelativeLayout R;
    public wj3.a S;
    public final java.lang.Runnable T;
    public final com.tencent.mm.sdk.platformtools.b4 U;
    public long V;
    public xq4.c W;
    public boolean X;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f408417d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f408418e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f408419f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.j f408420g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f408421h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f408422i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f408423m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f408424n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f408425o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f408426p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f408427q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageButton f408428r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f408429s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f408430t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f408431u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f408432v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f408433w;

    /* renamed from: x, reason: collision with root package name */
    public final rj3.a f408434x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408435y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408436z;
    public java.util.ArrayList I = new java.util.ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f408416J = new java.util.ArrayList();
    public boolean L = false;
    public boolean M = true;
    public final int N = 15;

    public a5(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.P = 0;
        sj3.u4 u4Var = new sj3.u4(this);
        this.T = new sj3.x4(this);
        this.U = new com.tencent.mm.sdk.platformtools.b4("MultiTalkTimer", (com.tencent.mm.sdk.platformtools.a4) new sj3.m4(this), false);
        this.X = true;
        this.f408417d = multiTalkMainUI;
        int i17 = com.tencent.mm.ui.bk.h(multiTalkMainUI).x;
        this.B = i17;
        int b17 = i65.a.b(multiTalkMainUI, 52) + i17 + com.tencent.mm.ui.bk.p(multiTalkMainUI);
        this.C = b17;
        this.f408422i = (android.widget.TextView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.o7z);
        this.f408423m = multiTalkMainUI.findViewById(com.tencent.mm.R.id.ofr);
        this.f408424n = (android.widget.TextView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.odf);
        this.f408427q = multiTalkMainUI.findViewById(com.tencent.mm.R.id.nyf);
        int k17 = i65.a.k(multiTalkMainUI) - i65.a.b(multiTalkMainUI, com.tencent.mm.plugin.appbrand.jsapi.pay.k2.CTRL_INDEX);
        this.P = k17;
        this.D = (android.widget.RelativeLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.cib);
        this.E = (android.widget.RelativeLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.gwx);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) multiTalkMainUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f489313c35, (android.view.ViewGroup) null, false);
        this.F = constraintLayout;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) multiTalkMainUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f489312c34, (android.view.ViewGroup) null, false);
        this.G = relativeLayout;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) relativeLayout.findViewById(com.tencent.mm.R.id.nye);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.nyg);
        this.f408419f = recyclerView;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.nyc);
        this.Q = frameLayout;
        com.tencent.mm.plugin.multitalk.model.j m17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().m();
        this.f408420g = m17;
        this.R = (android.widget.RelativeLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.mb7);
        android.view.View findViewById = multiTalkMainUI.findViewById(com.tencent.mm.R.id.ofh);
        this.f408418e = findViewById;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = com.tencent.mm.ui.bk.p(multiTalkMainUI) + i65.a.b(multiTalkMainUI, 12);
        findViewById.setLayoutParams(layoutParams);
        ((android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i65.a.b(multiTalkMainUI, 52) + com.tencent.mm.ui.bk.p(multiTalkMainUI);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(multiTalkMainUI, 3);
        this.f408421h = gridLayoutManager;
        sj3.d dVar = new sj3.d(multiTalkMainUI);
        recyclerView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.B = new sj3.q4(this, dVar);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
        if (k17 > i17) {
            layoutParams2.width = i17;
            layoutParams2.height = b17;
        } else {
            layoutParams2.width = k17;
            layoutParams2.height = i65.a.b(multiTalkMainUI, 52) + k17 + com.tencent.mm.ui.bk.p(multiTalkMainUI);
            layoutParams2.addRule(14);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "mAvatarLastHeight is %s and talkingAvatarContainerWidth is %s", java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i17));
        recyclerView.setLayoutParams(layoutParams2);
        dVar.f408468p = m17;
        recyclerView.setAdapter(dVar);
        recyclerView.setOnScrollListener(new sj3.r4(this));
        m17.k(recyclerView, frameLayout, multiTalkMainUI, this);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = (com.tencent.mm.ui.widget.imageview.WeImageButton) multiTalkMainUI.findViewById(com.tencent.mm.R.id.jwj);
        this.f408428r = weImageButton;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.b1g);
        this.f408429s = weImageView;
        android.view.View findViewById2 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.jvx);
        this.f408430t = findViewById2;
        findViewById2.setBackground(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_add, -1));
        android.view.View findViewById3 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.f486025jx1);
        this.f408431u = findViewById3;
        android.view.View findViewById4 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.f486012jv0);
        this.f408432v = findViewById4;
        this.f408434x = new rj3.a(multiTalkMainUI, findViewById3, "screenShare", findViewById4);
        findViewById3.setBackground(com.tencent.mm.ui.uk.e(multiTalkMainUI, com.tencent.mm.R.raw.icons_outlined_board, multiTalkMainUI.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        findViewById2.bringToFront();
        findViewById2.setOnClickListener(this);
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) constraintLayout.findViewById(com.tencent.mm.R.id.jxe);
        this.f408435y = multiTalkControlIconLayout;
        multiTalkControlIconLayout.setIconEnabled(com.tencent.mm.plugin.multitalk.model.e3.Ri().z());
        multiTalkControlIconLayout.setOnClickListener(u4Var);
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout2 = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) constraintLayout.findViewById(com.tencent.mm.R.id.jwo);
        this.f408436z = multiTalkControlIconLayout2;
        multiTalkControlIconLayout2.setOnClickListener(new sj3.s4(this));
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout3 = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) constraintLayout.findViewById(com.tencent.mm.R.id.jwb);
        this.A = multiTalkControlIconLayout3;
        multiTalkControlIconLayout3.setOnClickListener(new sj3.t4(this));
        this.H = (com.tencent.mm.plugin.multitalk.ui.widget.CollapseView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.gqk);
        android.view.View findViewById5 = relativeLayout.findViewById(com.tencent.mm.R.id.jw9);
        this.f408433w = findViewById5;
        multiTalkControlIconLayout2.setChecked(!com.tencent.mm.plugin.multitalk.model.e3.Ri().f150162e);
        multiTalkControlIconLayout3.setChecked(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f);
        multiTalkControlIconLayout.setChecked(com.tencent.mm.plugin.multitalk.model.e3.Ri().B());
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarContainerHeight %d", java.lang.Integer.valueOf(b17));
        imageButton.setOnClickListener(this);
        weImageButton.bringToFront();
        weImageButton.setOnClickListener(this);
        weImageButton.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_mini_windows_new, -1));
        weImageButton.setIconColor(-1);
        findViewById3.setOnClickListener(this);
        findViewById5.setOnClickListener(this);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
        weImageView.setOnClickListener(this);
        if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(multiTalkMainUI.getTaskId())) {
            weImageView.setVisibility(0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(weImageView, "split_view_icon");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(weImageView, 40, 26430);
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().B()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById5, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x();
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
            boolean z17 = !com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.F();
            if (multiTalkControlIconLayout3 != null) {
                multiTalkControlIconLayout3.setEnabled(z17);
                multiTalkControlIconLayout3.setIconEnabled(z17);
            }
        }
        y();
    }

    @Override // kv.e0
    public void U(java.lang.String wxUserName) {
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "notifyChanged %s", wxUserName);
        com.tencent.mm.plugin.multitalk.model.j jVar = this.f408420g;
        jVar.getClass();
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        sj3.j g17 = jVar.g(wxUserName);
        if (g17 == null || (multitalkFrameView = g17.f408577d) == null) {
            return;
        }
        multitalkFrameView.k();
    }

    public void b(int i17) {
        android.widget.ImageButton imageButton;
        wj3.a aVar = this.S;
        if (aVar != null) {
            aVar.f446745d = i17;
            uj3.b0 b0Var = aVar.f446746e;
            if (b0Var != null && b0Var.f428222m != i17) {
                b0Var.f428222m = i17;
                uj3.z zVar = b0Var.f428219g;
                if (zVar != null) {
                    zVar.a(i17);
                }
            }
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.H;
            if (collapseView != null && (imageButton = collapseView.f150320s) != null) {
                imageButton.setRotation(360 - i17);
            }
            android.view.View view = this.f408433w;
            if (view != null) {
                view.setRotation(i17);
            }
            com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = this.f408435y;
            if (multiTalkControlIconLayout != null) {
                multiTalkControlIconLayout.f150328e.setRotation(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - i17);
            }
            com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout2 = this.A;
            if (multiTalkControlIconLayout2 != null) {
                multiTalkControlIconLayout2.f150328e.setRotation(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - i17);
            }
            com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout3 = this.f408436z;
            if (multiTalkControlIconLayout3 != null) {
                multiTalkControlIconLayout3.f150328e.setRotation(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 - i17);
            }
        }
    }

    public void c() {
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = this.f408435y;
        if (multiTalkControlIconLayout == null || !multiTalkControlIconLayout.a()) {
            return;
        }
        v(false);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
        com.tencent.mm.plugin.multitalk.model.u0.a(6);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.H();
        zj3.g gVar = zj3.g.f473302a;
        zj3.g.f473320s.a();
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
        db5.t7.m(multiTalkMainUI, multiTalkMainUI.getResources().getString(com.tencent.mm.R.string.ibf));
        com.tencent.mm.plugin.multitalk.model.e3.Zi().getClass();
    }

    public void d() {
        android.view.View view = this.f408427q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f408430t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f408431u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f408432v;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // xq4.b
    public void e(int i17) {
        if (com.tencent.mm.plugin.multitalk.model.e3.wi().c()) {
            com.tencent.mm.plugin.multitalk.model.e3.wi().getClass();
        }
    }

    public void f(boolean z17) {
        android.view.View view = this.f408430t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f408431u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f408432v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            this.f408428r.setVisibility(8);
        }
        this.f408429s.setVisibility(8);
    }

    public void g() {
        if (this.S != null) {
            b(0);
            uj3.b0 b0Var = this.S.f446746e;
            if (b0Var != null) {
                b0Var.g();
            }
            this.S.g(this.R);
            this.S = null;
            z(true);
        }
    }

    public void h() {
        android.view.View view = this.f408427q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f408423m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void i(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
        if (multiTalkMainUI.V6()) {
            return;
        }
        com.tencent.mm.plugin.multitalk.model.j jVar = this.f408420g;
        if (jVar.j()) {
            return;
        }
        if (!jVar.j()) {
            android.view.View view = this.f408427q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f408435y.setIconEnabled(com.tencent.mm.plugin.multitalk.model.e3.Ri().z());
            android.view.View view2 = this.f408430t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().z()) {
                android.view.View view3 = this.f408431u;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f408432v;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (multiTalkMainUI.V6()) {
                android.view.View view5 = this.f408431u;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.f408432v;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f408430t;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (com.tencent.mm.sdk.platformtools.z.f193115k) {
                android.view.View view8 = this.f408431u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (zj3.j.a()) {
                    android.view.View view9 = this.f408432v;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().k(this.f408434x);
                }
            }
        }
        t(multiTalkGroup, true);
        jVar.k(this.f408419f, this.Q, multiTalkMainUI, this);
        y();
    }

    public void j() {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
            boolean z17 = !com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.F();
            com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = this.A;
            if (multiTalkControlIconLayout != null) {
                multiTalkControlIconLayout.setEnabled(z17);
                multiTalkControlIconLayout.setIconEnabled(z17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a5.k(boolean, boolean):void");
    }

    public final void l(java.util.HashSet videoUserSet) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        com.tencent.mm.plugin.multitalk.model.j jVar = this.f408420g;
        jVar.getClass();
        kotlin.jvm.internal.o.g(videoUserSet, "videoUserSet");
        com.tencent.mars.xlog.Log.i("AvatarViewManager", "openMemberToVideo, %s", videoUserSet);
        sj3.d dVar = jVar.f150009i;
        if (dVar != null && (copyOnWriteArrayList = dVar.f408460e) != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                aj3.c cVar = (aj3.c) it.next();
                java.lang.String usrName = cVar.f5303a.f71612d;
                kotlin.jvm.internal.o.f(usrName, "usrName");
                sj3.j g17 = jVar.g(usrName);
                jz5.f0 f0Var = null;
                if (g17 != null && (multitalkFrameView = g17.f408577d) != null) {
                    if (!((kotlin.jvm.internal.o.b(c01.z1.r(), multitalkFrameView.getF150344m()) || multitalkFrameView.j()) ? false : true)) {
                        multitalkFrameView = null;
                    }
                    if (multitalkFrameView != null) {
                        if (videoUserSet.contains(multitalkFrameView.getF150344m())) {
                            if (multitalkFrameView.status == sj3.c5.f408454d) {
                                jVar.l(multitalkFrameView.getF150344m(), 1);
                            }
                        } else {
                            jVar.l(multitalkFrameView.getF150344m(), 0);
                        }
                        f0Var = jz5.f0.f302826a;
                    }
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i("AvatarViewManager", "UI not ready, just init state");
                    com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = cVar.f5303a;
                    if (videoUserSet.contains(multiTalkGroupMember.f71612d) && !kotlin.jvm.internal.o.b(c01.z1.r(), multiTalkGroupMember.f71612d)) {
                        java.util.ArrayList arrayList = com.tencent.mm.plugin.multitalk.model.e3.Ri().o().f150030c;
                        if (!(arrayList != null && arrayList.contains(multiTalkGroupMember.f71612d))) {
                            com.tencent.mars.xlog.Log.i("AvatarViewManager", "init " + multiTalkGroupMember.f71612d + " to VIDEO_SMALL");
                            java.lang.String usrName2 = multiTalkGroupMember.f71612d;
                            kotlin.jvm.internal.o.f(usrName2, "usrName");
                            jVar.l(usrName2, 1);
                        }
                    }
                }
            }
        }
        z(false);
    }

    public void m() {
        android.view.View view = this.f408430t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f408428r.setVisibility(0);
        if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(this.f408417d.getTaskId())) {
            this.f408429s.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.z.f193115k) {
            android.view.View view2 = this.f408431u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!zj3.j.a()) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(this.f408434x);
                return;
            }
            android.view.View view3 = this.f408432v;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void n(int i17, boolean z17) {
        this.f408424n.setVisibility(i17);
        android.widget.TextView textView = this.f408422i;
        if (i17 != 0) {
            textView.setVisibility(0);
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.U;
        b4Var.d();
        b4Var.removeCallbacksAndMessages(null);
        if (z17) {
            b4Var.c(5000L, 5000L);
        }
        textView.setVisibility(8);
    }

    public final void o() {
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout;
        boolean z17 = this.L;
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.H;
        if (!z17) {
            this.L = true;
            collapseView.setVisibility(0);
            collapseView.getClass();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            android.widget.RelativeLayout relativeLayout = this.G;
            com.tencent.mars.xlog.Log.i("MicroMsg.CollapseView", "setCollapseContent, animate:%s, collapseView:%s", bool, relativeLayout);
            if (collapseView.f150317p != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollapseView", "setCollapseContent already has collapseView");
            } else {
                if (((android.view.ViewGroup) relativeLayout.getParent()) != null) {
                    ((android.view.ViewGroup) relativeLayout.getParent()).removeView(relativeLayout);
                }
                collapseView.f150317p = relativeLayout;
                collapseView.f150312h.addView(relativeLayout);
                android.widget.ImageButton imageButton = (android.widget.ImageButton) relativeLayout.findViewById(com.tencent.mm.R.id.nye);
                collapseView.f150320s = imageButton;
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageButton.getLayoutParams();
                int i17 = sj3.i1.f408570o;
                layoutParams.width = i17;
                layoutParams.height = i17;
                layoutParams.bottomMargin = sj3.i1.f408563h;
                collapseView.f150320s.setLayoutParams(layoutParams);
            }
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
            int height = multiTalkMainUI.T6().findViewById(com.tencent.mm.R.id.nyd).getHeight();
            collapseView.getClass();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(height);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.F;
            com.tencent.mars.xlog.Log.i("MicroMsg.CollapseView", "setContent animate:%s, controlView:%s, height:%s", bool, constraintLayout, valueOf);
            if (collapseView.f150316o != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollapseView", "setContent already have content layout");
            } else {
                if (constraintLayout.getParent() != null) {
                    ((android.view.ViewGroup) constraintLayout.getParent()).removeView(constraintLayout);
                }
                collapseView.f150316o = constraintLayout;
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                collapseView.f150313i.addView(collapseView.f150316o, layoutParams2);
                collapseView.f150313i.setVisibility(0);
                collapseView.f150313i.setVisibility(0);
                collapseView.setAlpha(0.0f);
                collapseView.f150311g.setAlpha(0.0f);
                collapseView.animate().alpha(1.0f).setDuration(500L).setListener(new sj3.n(collapseView));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f408419f;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            int i18 = this.P;
            int i19 = this.B;
            if (i18 > i19) {
                layoutParams3.height = ((i19 / 3) * 5) + i65.a.b(multiTalkMainUI, 52) + com.tencent.mm.ui.bk.p(multiTalkMainUI);
            } else {
                layoutParams3.height = ((i18 / 3) * 5) + com.tencent.mm.ui.bk.p(multiTalkMainUI);
            }
            recyclerView.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) collapseView.findViewById(com.tencent.mm.R.id.m7i).getLayoutParams();
            layoutParams4.bottomMargin = com.tencent.mm.ui.bl.c(multiTalkMainUI);
            collapseView.findViewById(com.tencent.mm.R.id.m7i).setLayoutParams(layoutParams4);
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().y() && (multiTalkControlIconLayout = this.f408435y) != null && !multiTalkControlIconLayout.a()) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(1, com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m);
            }
        }
        android.widget.TextView textView = this.f408425o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f408426p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f408425o = collapseView.f150314m;
        android.widget.ImageView imageView2 = collapseView.f150315n;
        this.f408426p = imageView2;
        imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_arrow, -1));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.X) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.nye) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f(true, false);
            android.content.Context context = view.getContext();
            if (context != null && !((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                sj3.g4 g4Var = new sj3.g4(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(g4Var, 2000L, false);
            }
        } else if (view.getId() == com.tencent.mm.R.id.jwj) {
            if (this.f408420g.j()) {
                m();
                this.H.e();
                this.f408420g.f();
                z(true);
            } else {
                com.tencent.mm.plugin.multitalk.model.u0.f150141a++;
                com.tencent.mm.plugin.multitalk.model.e3.Ri().C(true);
                com.tencent.mm.plugin.multitalk.model.u0.a(8);
            }
        } else if (view.getId() == com.tencent.mm.R.id.jw9) {
            com.tencent.mm.plugin.multitalk.model.e3.wi().a();
            com.tencent.mm.plugin.multitalk.model.e3.wi().getClass();
            com.tencent.mm.plugin.multitalk.model.u0.a(7);
            x();
        } else if (view.getId() == com.tencent.mm.R.id.jvx) {
            com.tencent.mm.plugin.multitalk.model.u0.f150145e++;
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
            if (!multiTalkMainUI.f150244w) {
                multiTalkMainUI.f150244w = true;
                android.content.Intent intent = new android.content.Intent(multiTalkMainUI, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.ui.MultiTalkAddMembersUI.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
                    for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember : com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71611i) {
                        int i17 = multiTalkGroupMember.f71614f;
                        if (i17 == 10 || i17 == 1) {
                            arrayList2.add(multiTalkGroupMember.f71612d);
                        }
                    }
                    intent.putExtra("titile", multiTalkMainUI.getString(com.tencent.mm.R.string.h0z));
                    intent.putExtra("chatroomName", com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71608f);
                    intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
                    intent.putExtra("key_need_gallery", false);
                    multiTalkMainUI.startActivityForResult(intent, 1);
                }
            }
        } else if (view.getId() == com.tencent.mm.R.id.f486025jx1) {
            zj3.g gVar = zj3.g.f473302a;
            zj3.g.f473304c = java.lang.System.currentTimeMillis();
            gVar.b(1, 1);
            if (zj3.j.a()) {
                com.tencent.mm.plugin.multitalk.model.u0.f150146f++;
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
                    java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 0L, 1L);
                this.f408417d.U6();
            } else {
                if (this.f408432v.getVisibility() != 0) {
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this.f408417d, 2, 3, false);
                    z2Var.y(this.f408417d.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    z2Var.x(1);
                    z2Var.z(android.graphics.Color.parseColor("#07C160"));
                    z2Var.i(com.tencent.mm.R.layout.cia);
                    z2Var.F = new sj3.h4(this, z2Var);
                    z2Var.C();
                } else {
                    android.view.View view2 = this.f408432v;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(this.f408417d, 1, 3, false);
                    z2Var2.m(this.f408417d.getResources().getString(com.tencent.mm.R.string.f490347sg), this.f408417d.getResources().getString(com.tencent.mm.R.string.ibn));
                    z2Var2.v(android.graphics.Color.parseColor("#07C160"));
                    z2Var2.o(0);
                    z2Var2.i(com.tencent.mm.R.layout.cia);
                    sj3.i4 i4Var = new sj3.i4(this, z2Var2);
                    sj3.j4 j4Var = new sj3.j4(this, z2Var2);
                    z2Var2.D = i4Var;
                    z2Var2.E = j4Var;
                    z2Var2.C();
                }
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(35);
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_screen_project_info");
                kotlin.jvm.internal.o.f(M, "getMMKV(...)");
                M.putBoolean("screen_project_has_been_educated", true);
            }
        } else if (view.getId() == com.tencent.mm.R.id.b1g) {
            com.tencent.mm.ui.ee.f(this.f408417d.getTaskId(), new sj3.k4(this));
            this.f408417d.f150241t = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void p(int i17) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
        ((android.view.WindowManager) multiTalkMainUI.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
            db5.t7.n(multiTalkMainUI, multiTalkMainUI.getString(com.tencent.mm.R.string.k_y));
            return;
        }
        if (this.f408425o != null) {
            if (multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o) != null) {
                multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(null);
            }
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.H;
            if (collapseView != null) {
                collapseView.setLinkToAutoMobileListener(null);
            }
            if (this.L) {
                collapseView.setLinkToAutoMobileListener(new sj3.y4(this));
            } else if (multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o) != null) {
                multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(new sj3.f4(this));
            }
            this.f408426p.setVisibility(0);
            this.f408425o.setVisibility(0);
            this.f408425o.setText(com.tencent.mm.R.string.k_y);
            java.lang.Runnable runnable = this.T;
            multiTalkMainUI.f150235n.removeCallbacks(runnable);
            multiTalkMainUI.f150235n.postDelayed(runnable, i17 * 1000);
        }
    }

    public void q(int i17) {
        if (com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.t()) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
            ((android.view.WindowManager) multiTalkMainUI.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
                db5.t7.n(multiTalkMainUI, multiTalkMainUI.getString(com.tencent.mm.R.string.k_x));
                return;
            }
            if (multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o) != null) {
                multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(null);
            }
            com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.H;
            if (collapseView != null) {
                collapseView.setLinkToAutoMobileListener(null);
            }
            if (this.L) {
                collapseView.setLinkToAutoMobileListener(new sj3.v4(this));
            } else if (multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o) != null) {
                multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(new sj3.w4(this));
            }
            this.f408426p.setVisibility(8);
            this.f408425o.setVisibility(0);
            this.f408425o.setText(com.tencent.mm.R.string.k_x);
            java.lang.Runnable runnable = this.T;
            multiTalkMainUI.f150235n.removeCallbacks(runnable);
            multiTalkMainUI.f150235n.postDelayed(runnable, i17 * 1000);
        }
    }

    public void r(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            n(8, z17);
        } else {
            this.f408424n.setText(str);
            n(0, z17);
        }
    }

    public void s() {
        if (this.M) {
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation2.setDuration(150L);
        this.M = true;
        this.f408423m.setAnimation(alphaAnimation);
        android.view.View view = this.f408423m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f408418e.setAnimation(alphaAnimation);
        android.view.View view2 = this.f408418e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.H;
        collapseView.setAnimation(alphaAnimation2);
        collapseView.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0267, code lost:
    
        if (((r11 == null || !r11.contains(r13.f71612d)) ? r10 : true) != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e4 A[Catch: all -> 0x030f, TryCatch #1 {, blocks: (B:78:0x0222, B:79:0x0236, B:81:0x023c, B:83:0x0244, B:85:0x024b, B:89:0x0258, B:91:0x025c, B:95:0x02a2, B:97:0x02bd, B:99:0x02c5, B:100:0x02d1, B:102:0x02d7, B:106:0x02e4, B:108:0x02e9, B:111:0x02c3, B:113:0x0269, B:115:0x026d, B:117:0x0287, B:119:0x028f, B:120:0x028d, B:123:0x02f2, B:124:0x02f5, B:127:0x02f6, B:128:0x02fb, B:131:0x0309, B:135:0x030d, B:136:0x030e, B:130:0x02fc), top: B:77:0x0222, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.tencent.mm.modeltalkroom.MultiTalkGroup r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a5.t(com.tencent.mm.modeltalkroom.MultiTalkGroup, boolean):void");
    }

    public void u(boolean z17) {
        if (!z17) {
            this.V = java.lang.System.currentTimeMillis();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "start capture render");
        com.tencent.mm.plugin.multitalk.model.s0 wi6 = com.tencent.mm.plugin.multitalk.model.e3.wi();
        wi6.getClass();
        com.tencent.mm.plugin.multitalk.model.s0.h(wi6, false, 1, null);
        if (this.W == null) {
            this.W = new xq4.c(this);
        }
        com.tencent.mm.plugin.multitalk.model.e3.wi().getClass();
    }

    public void v(boolean z17) {
        if (!z17 && this.V != 0 && java.lang.System.currentTimeMillis() - this.V > 0 && com.tencent.mm.plugin.multitalk.model.e3.Ri().z()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.V;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12728, java.lang.Long.valueOf(currentTimeMillis > 1000 ? currentTimeMillis / 1000 : 1L), com.tencent.mm.plugin.multitalk.model.o2.e(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t));
            this.V = 0L;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.multitalk.model.s0 wi6 = com.tencent.mm.plugin.multitalk.model.e3.wi();
        wi6.getClass();
        com.tencent.mm.plugin.multitalk.model.s0.j(wi6, false, 1, null);
    }

    public final void w(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        android.widget.TextView textView = this.f408422i;
        android.view.View view = this.f408423m;
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.f408428r;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
        if (booleanValue) {
            weImageButton.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_back, -1));
            weImageButton.setIconColor(-1);
            view.getLayoutParams().height = i65.a.b(multiTalkMainUI, 52) + com.tencent.mm.ui.bk.p(multiTalkMainUI);
            view.setBackgroundColor(multiTalkMainUI.getResources().getColor(com.tencent.mm.R.color.f478870jg));
            textView.setVisibility(4);
            android.view.View view2 = this.f408430t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f408431u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        weImageButton.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_mini_windows_new, -1));
        weImageButton.setIconColor(-1);
        view.getLayoutParams().height = i65.a.a(multiTalkMainUI, multiTalkMainUI.getResources().getDimension(com.tencent.mm.R.dimen.a5n));
        view.setBackground(multiTalkMainUI.getResources().getDrawable(com.tencent.mm.R.drawable.aqk));
        textView.setVisibility(0);
        android.view.View view4 = this.f408430t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!com.tencent.mm.sdk.platformtools.z.f193115k) {
            android.view.View view5 = this.f408431u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f408432v;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f408431u;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!zj3.j.a()) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(this.f408434x);
            return;
        }
        android.view.View view8 = this.f408432v;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void x() {
        boolean d17 = com.tencent.mm.plugin.multitalk.model.e3.wi().d();
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408417d;
        android.view.View view = this.f408433w;
        if (d17) {
            view.setContentDescription(multiTalkMainUI.getString(com.tencent.mm.R.string.h1s));
        } else {
            view.setContentDescription(multiTalkMainUI.getString(com.tencent.mm.R.string.f492580h11));
        }
    }

    public final void y() {
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = this.A;
        if (multiTalkControlIconLayout.isEnabled()) {
            com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
            boolean a17 = multiTalkControlIconLayout.a();
            Ri.getClass();
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MT.MultiTalkManager", "setHandsFreeUIStatus: %s", java.lang.Boolean.valueOf(a17));
            Ri.f150164g = a17;
        }
    }

    public void z(boolean z17) {
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f408419f;
        if (recyclerView.getAdapter() == null || (gridLayoutManager = this.f408421h) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList2.clear();
        arrayList3.clear();
        sj3.d dVar = (sj3.d) recyclerView.getAdapter();
        int t17 = gridLayoutManager.t();
        int i17 = t17 == 0 ? 0 : t17 - dVar.f408466n;
        int x17 = (gridLayoutManager.x() - dVar.f408466n) - dVar.f408467o;
        if (i17 >= 0 && x17 >= 0) {
            while (i17 <= x17) {
                sj3.j g17 = this.f408420g.g(((aj3.c) dVar.f408460e.get(i17)).f5303a.f71612d);
                if (g17 != null && (multitalkFrameView = g17.f408577d) != null) {
                    if ((multitalkFrameView.status == sj3.c5.f408455e) || multitalkFrameView.j()) {
                        int c17 = zj3.j.c(g17.f408577d.getF150344m());
                        arrayList2.add(java.lang.Integer.valueOf(c17));
                        int A = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.A(c17);
                        arrayList3.add(java.lang.Integer.valueOf((A == 102 || A == 101) ? 1 : 0));
                        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", java.lang.Integer.valueOf(c17));
                    }
                }
                i17++;
            }
        } else if (recyclerView.getAdapter() != null) {
            java.util.Iterator it = ((sj3.d) recyclerView.getAdapter()).f408460e.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                aj3.c cVar = (aj3.c) it.next();
                boolean z18 = cVar.f5306d;
                int i19 = this.N;
                if (z18 && i18 < i19) {
                    int c18 = zj3.j.c(cVar.f5303a.f71612d);
                    arrayList2.add(java.lang.Integer.valueOf(c18));
                    int A2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.A(c18);
                    arrayList3.add(java.lang.Integer.valueOf((A2 == 102 || A2 == 101) ? 1 : 0));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", java.lang.Integer.valueOf(c18));
                }
                if (i18 >= i19) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (!(!z17 && (arrayList = this.I) != null && arrayList2.containsAll(arrayList) && this.I.containsAll(arrayList2) && arrayList3.containsAll(this.f408416J) && this.f408416J.containsAll(arrayList3)) && !com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.getClass();
            i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.g3(i4Var, arrayList2, false));
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "ilink subscribeByUserMids ok, mids:" + arrayList2);
        }
        this.I = arrayList2;
        this.f408416J = arrayList3;
    }
}
