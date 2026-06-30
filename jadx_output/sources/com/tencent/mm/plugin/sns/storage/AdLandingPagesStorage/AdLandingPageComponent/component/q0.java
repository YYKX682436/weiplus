package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class q0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public int A;
    public final int B;
    public int C;
    public final android.os.Handler D;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f165417s;

    /* renamed from: t, reason: collision with root package name */
    public final ab4.q0 f165418t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f165419u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f165420v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f165421w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f165422x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 f165423y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165424z;

    public q0(android.content.Context context, ab4.q0 q0Var, android.view.ViewGroup viewGroup, int i17) {
        super(context, q0Var, viewGroup);
        this.f165424z = false;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n0(this, android.os.Looper.getMainLooper());
        this.f165417s = context;
        this.f165422x = viewGroup;
        this.f165418t = q0Var;
        this.B = i17;
        h();
        k();
        com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "refreshView, cid=" + q0Var.f2817d + ", hash=" + hashCode());
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.K();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.f165423y;
        if (o2Var != null) {
            o2Var.K();
        }
        com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "viewWillAppear");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.L();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.f165423y;
        if (o2Var != null) {
            o2Var.L();
            com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "viewWillDestroy, mBtnComponent exposureCount = " + this.f165423y.r() + ", mBtnComponent stayTime = " + this.f165423y.w() + ", mBtnComponent cid = " + this.f165423y.z());
        }
        this.D.removeCallbacksAndMessages(null);
        com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "viewWillDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.M();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.f165423y;
        if (o2Var != null) {
            o2Var.M();
            com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "viewWillDisappear, mBtnComponent exposureCount = " + this.f165423y.r() + ", mBtnComponent stayTime = " + this.f165423y.w() + ", mBtnComponent cid = " + this.f165423y.z());
        }
        com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "viewWillDisappear, exposureCount = " + r() + ", stayTime = " + w());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    public final void O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adJustBtnClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.f165423y;
        if (o2Var != null) {
            o2Var.S(o2Var.R() - this.A);
            com.tencent.mars.xlog.Log.i("AdLandingFullScreenFloatBarComp", "btn kv, clickCount=" + this.f165423y.R() + ", stayTime=" + this.f165423y.w());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adJustBtnClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    public java.lang.String P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = this.f165423y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (o2Var != null) {
                O();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p0 p0Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p0(r(), w(), this.A, o2Var.z(), o2Var.r(), o2Var.w(), o2Var.R());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$FullScreenFloatBarContentBuilder");
                java.lang.String gVar = p0Var.f165400a.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$FullScreenFloatBarContentBuilder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                return gVar;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFullScreenFloatBarComp", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        return "";
    }

    public void R(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        android.os.Handler handler = this.D;
        handler.removeCallbacksAndMessages(null);
        handler.sendMessageDelayed(handler.obtainMessage(2, java.lang.Boolean.valueOf(z17)), j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    public void S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        android.content.Context context = this.f165417s;
        int b17 = i65.a.b(context, 44);
        if (this.f165419u.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165419u.getLayoutParams();
            layoutParams.leftMargin = b17;
            layoutParams.rightMargin = b17;
        }
        if (this.f165421w.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
            ((android.widget.LinearLayout.LayoutParams) this.f165421w.getLayoutParams()).leftMargin = i65.a.b(context, 24);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    public void T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        if (this.f165419u.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165419u.getLayoutParams();
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    public void U(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        android.os.Handler handler = this.D;
        handler.removeCallbacksAndMessages(null);
        handler.sendMessageDelayed(handler.obtainMessage(1, java.lang.Boolean.valueOf(z17)), j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f165417s);
        android.view.ViewGroup viewGroup = this.f165422x;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.cpj, viewGroup, false);
        this.f165419u = inflate;
        this.f165420v = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485022g93);
        this.f165421w = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.g8v);
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate.findViewById(com.tencent.mm.R.id.g8q)).setRadius(0.0f);
        viewGroup.addView(this.f165419u);
        android.view.View view = this.f165419u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        ab4.q0 q0Var = this.f165418t;
        if (android.text.TextUtils.isEmpty(q0Var.F)) {
            this.f165420v.setVisibility(8);
        } else {
            this.f165420v.setText(q0Var.F);
            this.f165420v.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(q0Var.G)) {
            try {
                this.f165420v.setTextColor(android.graphics.Color.parseColor(q0Var.G));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingFullScreenFloatBarComp", "refreshView descColor, exp=" + e17.toString() + ", color=" + q0Var.G);
            }
        }
        this.f165421w.removeAllViews();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = com.tencent.mm.plugin.sns.ui.ta.a(this.f165417s, q0Var.I, this.f165421w, 0);
        if (a17 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2) a17;
            this.f165423y = o2Var;
            if (this.B == 0) {
                ab4.d0 d0Var = q0Var.I;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                ab4.n0 n0Var = com.tencent.mm.plugin.sns.model.a4.f164075a;
                if (n0Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                } else {
                    n0Var = new ab4.n0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                }
                o2Var.T(d0Var, n0Var);
            }
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingFullScreenFloatBarComp", "btnComp=" + a17);
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 o2Var2 = this.f165423y;
        if (o2Var2 != null) {
            this.f165421w.addView(o2Var2.x());
        }
        this.f165424z = q0Var.H;
        this.f165419u.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public android.view.View q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        android.view.View view = this.f165419u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        return view;
    }
}
