package yt3;

/* loaded from: classes10.dex */
public final class r3 extends yt3.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f465626d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465627e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f465628f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f465629g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f465630h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f465631i;

    /* renamed from: m, reason: collision with root package name */
    public int f465632m;

    /* renamed from: n, reason: collision with root package name */
    public int f465633n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f465634o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f465635p;

    /* renamed from: q, reason: collision with root package name */
    public final int f465636q;

    /* renamed from: r, reason: collision with root package name */
    public long f465637r;

    /* renamed from: s, reason: collision with root package name */
    public int f465638s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f465639t;

    /* renamed from: u, reason: collision with root package name */
    public int f465640u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f465641v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f465642w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.concurrent.Future f465643x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f465644y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f465645z;

    public r3(android.widget.RelativeLayout layout, ju3.d0 status) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465626d = layout;
        this.f465627e = status;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.lok);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = (com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton) findViewById;
        this.f465628f = mMSightRecordButton;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.b6r);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f465629g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = layout.findViewById(com.tencent.mm.R.id.b6t);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f465630h = findViewById3;
        this.f465631i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f465632m = 10000;
        this.f465633n = 10000;
        this.f465636q = 500;
        this.f465637r = -1L;
        this.f465640u = com.tencent.mm.R.string.f492543gw4;
        this.f465642w = new yt3.h3(this);
        this.f465644y = true;
        this.f465645z = i65.a.r(layout.getContext(), com.tencent.mm.R.string.ht6);
        mMSightRecordButton.setSimpleTapCallback(new yt3.e3(this));
    }

    @Override // yt3.b
    public void a() {
        java.util.concurrent.Future future = this.f465643x;
        if (future != null) {
            future.cancel(false);
        }
        android.view.View view = this.f465630h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.b
    public void b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider config) {
        kotlin.jvm.internal.o.g(config, "config");
        int i17 = config.f155685w;
        this.f465633n = i17;
        this.f465632m = i17 + 250;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = config.f155677o;
        this.f465638s = uICustomParam != null ? uICustomParam.f64787s : 0;
        java.lang.Boolean enablePicture = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture, "enablePicture");
        this.f465634o = enablePicture.booleanValue();
        java.lang.Boolean enableVideo = config.f155682t;
        kotlin.jvm.internal.o.f(enableVideo, "enableVideo");
        this.f465635p = enableVideo.booleanValue();
        java.lang.Boolean enablePicture2 = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture2, "enablePicture");
        boolean booleanValue = enablePicture2.booleanValue();
        android.widget.TextView textView = this.f465629g;
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        if (booleanValue) {
            textView.setText(com.tencent.mm.R.string.f492544gw5);
            mMSightRecordButton.setSimpleTapCallback(new yt3.k3(this));
        }
        java.lang.Boolean enableVideo2 = config.f155682t;
        kotlin.jvm.internal.o.f(enableVideo2, "enableVideo");
        if (enableVideo2.booleanValue()) {
            textView.setText(com.tencent.mm.R.string.gw6);
            mMSightRecordButton.setLongPressCallback(new yt3.m3(this));
            mMSightRecordButton.setLongPressScrollCallback(new yt3.n3(this));
        }
        java.lang.Boolean enablePicture3 = config.f155681s;
        kotlin.jvm.internal.o.f(enablePicture3, "enablePicture");
        if (enablePicture3.booleanValue()) {
            java.lang.Boolean enableVideo3 = config.f155682t;
            kotlin.jvm.internal.o.f(enableVideo3, "enableVideo");
            if (enableVideo3.booleanValue()) {
                this.f465640u = com.tencent.mm.R.string.f492543gw4;
                textView.setText(com.tencent.mm.R.string.f492543gw4);
            }
        }
    }

    @Override // yt3.b
    public boolean c() {
        return this.f465628f.f149199i;
    }

    @Override // yt3.b
    public void d() {
        if (!this.f465634o) {
            s();
        } else {
            ju3.d0.k(this.f465627e, ju3.c0.f301901s, null, 2, null);
        }
    }

    @Override // yt3.b
    public void e(int i17) {
    }

    @Override // yt3.b
    public void f(boolean z17) {
    }

    @Override // yt3.b
    public void g(boolean z17) {
        this.f465644y = z17;
    }

    @Override // yt3.b
    public void h(int i17, int i18) {
    }

    @Override // yt3.b
    public void i(boolean z17) {
    }

    @Override // yt3.b
    public void j(android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        if (this.f465629g.getVisibility() == 0) {
            java.util.concurrent.Future future = this.f465643x;
            if (future != null) {
                future.cancel(false);
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            yt3.o3 o3Var = new yt3.o3(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            this.f465643x = t0Var.z(o3Var, 2000L, false);
        } else {
            android.view.View view = this.f465630h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f465630h.setOnClickListener(clickListener);
    }

    @Override // yt3.b
    public void k() {
        this.f465628f.k();
    }

    public final void m(boolean z17) {
        this.f465634o = z17;
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        android.widget.TextView textView = this.f465629g;
        if (z17) {
            textView.setText(com.tencent.mm.R.string.f492544gw5);
            mMSightRecordButton.setSimpleTapCallback(new yt3.f3(this));
        } else {
            textView.setText(com.tencent.mm.R.string.gw6);
            mMSightRecordButton.setSimpleTapCallback(null);
        }
    }

    public final void n(boolean z17) {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        mMSightRecordButton.setTouchEnable(false);
        this.f465631i.postDelayed(new yt3.i3(this), 1500L);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f465627e.w(ju3.c0.f301887m, bundle);
        mMSightRecordButton.announceForAccessibility(i65.a.r(mMSightRecordButton.getContext(), com.tencent.mm.R.string.f489973h2));
    }

    public final void o(int i17) {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        int size = mMSightRecordButton.f149198h.getSubProgress().size();
        if (size <= 0 || i17 == size) {
            return;
        }
        com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar mMSightCircularProgressBar = mMSightRecordButton.f149198h;
        java.util.ArrayList arrayList = mMSightCircularProgressBar.f149191y;
        if (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() - 1);
            if (arrayList.size() > 0) {
                mMSightCircularProgressBar.f149183q = ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue();
            } else {
                mMSightCircularProgressBar.f149183q = 0.0f;
            }
            mMSightCircularProgressBar.invalidate();
        }
    }

    @Override // yt3.r2
    public void onAttach() {
        this.f465626d.setVisibility(0);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        if (!mMSightRecordButton.f149199i) {
            return false;
        }
        mMSightRecordButton.k();
        return true;
    }

    @Override // yt3.r2
    public void onDetach() {
        this.f465626d.setVisibility(4);
    }

    @Override // yt3.r2
    public void onPause() {
        this.f465628f.k();
    }

    public final void p(boolean z17, boolean z18) {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        mMSightRecordButton.I = z17;
        mMSightRecordButton.f149198h.setEnableSubProgress(z17);
        mMSightRecordButton.f149198h.setCircularColor(android.graphics.Color.parseColor("#00000000"));
        if (z17) {
            mMSightRecordButton.f149198h.setVisibility(4);
        } else {
            mMSightRecordButton.f149198h.a();
            mMSightRecordButton.f149198h.setVisibility(0);
        }
        android.widget.TextView textView = this.f465629g;
        if (z17) {
            textView.setText(com.tencent.mm.R.string.huh);
        } else {
            textView.setText(this.f465640u);
        }
        if (z17 && z18) {
            mMSightRecordButton.f149198h.setVisibility(0);
        }
    }

    public final void r(java.lang.String strWording, boolean z17) {
        kotlin.jvm.internal.o.g(strWording, "strWording");
        if (this.f465630h.getVisibility() == 0) {
            return;
        }
        java.lang.Runnable runnable = this.f465642w;
        android.widget.RelativeLayout relativeLayout = this.f465626d;
        relativeLayout.removeCallbacks(runnable);
        android.widget.TextView textView = this.f465629g;
        textView.setText(strWording);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).start();
        if (z17) {
            relativeLayout.postDelayed(runnable, 3000L);
        }
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f465628f;
        mMSightRecordButton.d();
        mMSightRecordButton.setTouchEnable(true);
        this.f465631i.removeCallbacksAndMessages(null);
        if (this.f465635p) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (j35.u.h(mMSightRecordButton.getContext(), "android.permission.RECORD_AUDIO")) {
                return;
            }
            j(new yt3.j3(this));
        }
    }

    public final void s() {
        java.lang.String string = this.f465626d.getContext().getString(com.tencent.mm.R.string.ht8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        r(string, true);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465628f.setVisibility(i17);
        if (this.f465644y) {
            this.f465626d.bringToFront();
        }
    }

    public final void u(boolean z17) {
        java.lang.String recordHintContent = this.f465645z;
        kotlin.jvm.internal.o.f(recordHintContent, "recordHintContent");
        r(recordHintContent, z17);
    }

    public final void w() {
        if (this.f465639t) {
            this.f465639t = false;
            ju3.d0.k(this.f465627e, ju3.c0.f301881i, null, 2, null);
            int i17 = this.f465638s;
            if (i17 == 0) {
                i17 = this.f465626d.getContext().getResources().getColor(com.tencent.mm.R.color.aaq);
            }
            this.f465628f.i(0, 100, this.f465632m, i17, new yt3.q3(this));
        }
    }

    public void x(int i17) {
        this.f465645z = i65.a.r(this.f465626d.getContext(), i17);
    }
}
