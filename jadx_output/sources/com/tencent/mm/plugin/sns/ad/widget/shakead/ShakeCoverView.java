package com.tencent.mm.plugin.sns.ad.widget.shakead;

/* loaded from: classes4.dex */
public class ShakeCoverView extends android.widget.FrameLayout implements androidx.lifecycle.x {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public a94.x B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163829d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f163830e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f163831f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f163832g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView f163833h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f163834i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163835m;

    /* renamed from: n, reason: collision with root package name */
    public a94.a f163836n;

    /* renamed from: o, reason: collision with root package name */
    public a94.b0 f163837o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163838p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163839q;

    /* renamed from: r, reason: collision with root package name */
    public int f163840r;

    /* renamed from: s, reason: collision with root package name */
    public fd4.r f163841s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f163842t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f163843u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f163844v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f163845w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f163846x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f163847y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f163848z;

    public ShakeCoverView(android.content.Context context) {
        super(context);
        this.f163838p = false;
        this.f163839q = false;
        this.f163842t = new a94.s(this);
        this.f163843u = true;
        this.f163844v = false;
        this.f163845w = false;
        this.f163846x = false;
        this.f163847y = false;
        this.f163848z = false;
        this.A = false;
        d(context);
    }

    public static /* synthetic */ com.tencent.mm.view.MMPAGView a(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mm.view.MMPAGView mMPAGView = shakeCoverView.f163829d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        return mMPAGView;
    }

    public void b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j17;
        android.os.Handler handler = this.f163842t;
        handler.removeMessages(1);
        handler.sendMessageDelayed(obtain, 50L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "doOnPause");
        f();
        g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f163834i = context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cq8, (android.view.ViewGroup) this, true);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.ko6);
        this.f163829d = mMPAGView;
        mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
        this.f163830e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_o);
        this.f163831f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o_e);
        this.f163832g = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.o_s);
        this.f163833h = (com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView) findViewById(com.tencent.mm.R.id.f483045v4);
        ca4.m0.y0(this.f163830e, com.tencent.mm.R.dimen.a_x);
        ca4.m0.y0(this.f163831f, com.tencent.mm.R.dimen.a_w);
        this.f163829d.post(new a94.r(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (context instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) context).mo133getLifecycle().a(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "startShakeAnim, isUIPaused=" + this.f163839q + ", isDestroy=" + this.f163838p);
        if (this.f163838p || this.f163839q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        this.f163848z = true;
        this.f163829d.post(new a94.v(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        a94.b0 b0Var = this.f163837o;
        if (b0Var != null) {
            if (b0Var.b()) {
                com.tencent.mars.xlog.Log.i("ShakeCoverView", "stopListenShake");
            }
            this.f163837o.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (this.f163848z) {
            com.tencent.mars.xlog.Log.i("ShakeCoverView", "stopShakeAnim");
        }
        this.f163848z = false;
        this.f163829d.post(new a94.w(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopShakeAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public final void h(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        if (!this.f163847y) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            return;
        }
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "unSpreadUp, isForDestroy=" + z17);
        this.f163847y = false;
        this.A = false;
        if (z17) {
            this.f163832g.setVisibility(4);
            this.f163833h.setVisibility(4);
        } else {
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView shakeCoverAnimView = this.f163833h;
            shakeCoverAnimView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            com.tencent.mars.xlog.Log.i("ShakeCoverAnimView", "unSpreadUp, scale=" + shakeCoverAnimView.f163587e);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "alpha", 0.7f, 0.7f);
            long j17 = (long) com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE;
            ofFloat.setDuration(j17);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "scaleX", shakeCoverAnimView.f163587e, 1.0f);
            ofFloat2.setDuration(j17);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "scaleY", shakeCoverAnimView.f163587e, 1.0f);
            ofFloat3.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f163832g, "alpha", 1.0f, 0.0f);
            ofFloat4.setDuration(500L);
            ofFloat4.addListener(new a94.u(this));
            ofFloat4.start();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSpreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "onDetachedFromWindow");
        if (this.f163845w && !this.f163846x) {
            a94.m.b(this.f163835m, 2, this.f163840r);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f163838p = true;
        this.f163842t.removeCallbacksAndMessages(null);
        c();
        h(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.f163843u = true;
        this.f163844v = false;
        this.f163846x = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        super.onStartTemporaryDetach();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "onUIPause");
        this.f163839q = true;
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onUIResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.tencent.mars.xlog.Log.i("ShakeCoverView", "onUIResume");
        this.f163839q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public void setOnShakeListener(a94.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        this.B = xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnShakeListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
    }

    public ShakeCoverView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163838p = false;
        this.f163839q = false;
        this.f163842t = new a94.s(this);
        this.f163843u = true;
        this.f163844v = false;
        this.f163845w = false;
        this.f163846x = false;
        this.f163847y = false;
        this.f163848z = false;
        this.A = false;
        d(context);
    }
}
