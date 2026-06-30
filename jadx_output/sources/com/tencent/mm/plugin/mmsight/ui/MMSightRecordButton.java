package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class MMSightRecordButton extends android.widget.FrameLayout {
    public static final int M = android.view.ViewConfiguration.getTapTimeout();
    public static final float N = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a5z) / com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a5y);
    public com.tencent.mm.plugin.mmsight.ui.i0 A;
    public com.tencent.mm.plugin.mmsight.ui.g0 B;
    public android.graphics.drawable.Drawable C;
    public android.graphics.drawable.Drawable D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149193J;
    public final java.lang.Runnable K;
    public final java.lang.Runnable L;

    /* renamed from: d, reason: collision with root package name */
    public long f149194d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f149195e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f149196f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f149197g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar f149198h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f149199i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f149200m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f149201n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f149202o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149203p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149204q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f149205r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f149206s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149207t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f149208u;

    /* renamed from: v, reason: collision with root package name */
    public int f149209v;

    /* renamed from: w, reason: collision with root package name */
    public final int f149210w;

    /* renamed from: x, reason: collision with root package name */
    public final int f149211x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.j0 f149212y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.h0 f149213z;

    public MMSightRecordButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149194d = -1L;
        this.f149199i = false;
        this.f149200m = false;
        this.f149201n = false;
        this.f149202o = false;
        this.f149208u = false;
        this.f149210w = -1;
        this.f149211x = -2130706433;
        this.E = -1.0f;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f149193J = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.K = new com.tencent.mm.plugin.mmsight.ui.d0(this);
        this.L = new com.tencent.mm.plugin.mmsight.ui.e0(this);
        e();
    }

    public static void a(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton) {
        if (mMSightRecordButton.I) {
            if (mMSightRecordButton.f149199i) {
                mMSightRecordButton.f149199i = false;
                mMSightRecordButton.f149213z.c();
                return;
            }
            mMSightRecordButton.f149199i = true;
            mMSightRecordButton.j(null);
            mMSightRecordButton.f149201n = true;
            com.tencent.mm.plugin.mmsight.ui.h0 h0Var = mMSightRecordButton.f149213z;
            if (h0Var != null) {
                h0Var.a();
            }
        }
    }

    public void c() {
        if (!this.I) {
            this.f149198h.a();
            this.f149198h.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar mMSightCircularProgressBar = this.f149198h;
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var = mMSightCircularProgressBar.f149189w;
        if (e2Var != null) {
            e2Var.f149319g = false;
            e2Var.f149316d = 0L;
            mMSightCircularProgressBar.f149189w = null;
        }
        if (mMSightCircularProgressBar.f149183q > 0.0f) {
            java.util.ArrayList arrayList = mMSightCircularProgressBar.f149191y;
            if ((arrayList.size() > 0 && mMSightCircularProgressBar.f149183q > ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue()) || arrayList.size() == 0) {
                arrayList.add(java.lang.Float.valueOf(mMSightCircularProgressBar.f149183q));
            }
        }
        mMSightCircularProgressBar.invalidate();
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "hideProgressBar");
        android.view.View view = this.f149197g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, java.lang.Integer.valueOf(M));
        this.C = getContext().getResources().getDrawable(com.tencent.mm.R.drawable.apc);
        this.D = getContext().getResources().getDrawable(com.tencent.mm.R.drawable.apd);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.c1w, (android.view.ViewGroup) this, true);
        this.f149195e = findViewById(com.tencent.mm.R.id.f485343hd2);
        this.f149196f = findViewById(com.tencent.mm.R.id.kn_);
        this.f149197g = findViewById(com.tencent.mm.R.id.lbl);
        this.f149198h = (com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar) findViewById(com.tencent.mm.R.id.bwr);
        this.f149195e.setBackgroundDrawable(this.C);
        this.f149196f.setBackgroundDrawable(this.D);
        this.F = true;
    }

    public void f() {
        setClipChildren(false);
        this.F = true;
        this.f149195e.setScaleX(1.0f);
        this.f149195e.setScaleY(1.0f);
        this.f149196f.setScaleX(1.0f);
        this.f149196f.setScaleY(1.0f);
        android.view.View view = this.f149197g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c();
        this.f149198h.a();
    }

    public final void g(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f149202o = true;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f149207t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f149207t = null;
        }
        android.view.ViewPropertyAnimator scaleY = this.f149195e.animate().scaleX(1.0f).scaleY(1.0f);
        this.f149207t = scaleY;
        scaleY.setListener(new com.tencent.mm.plugin.mmsight.ui.b0(this, animatorListenerAdapter)).setDuration(150L).start();
        this.f149196f.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        android.animation.ValueAnimator valueAnimator = this.f149206s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.C, "color", this.f149211x, this.f149210w);
        this.f149206s = ofInt;
        ofInt.setDuration(150L);
        android.animation.ValueAnimator valueAnimator2 = this.f149206s;
        android.animation.ArgbEvaluator argbEvaluator = com.tencent.mm.plugin.mmsight.ui.b.f149292a;
        valueAnimator2.setEvaluator(argbEvaluator);
        this.f149206s.start();
        if (this.f149209v != 0) {
            android.animation.ValueAnimator valueAnimator3 = this.f149205r;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(this.D, "color", 0, this.f149209v);
            this.f149205r = ofInt2;
            ofInt2.setDuration(150L);
            this.f149205r.setEvaluator(argbEvaluator);
            this.f149205r.start();
        }
    }

    public java.util.List<java.lang.Float> getSubProgress() {
        return this.f149198h.getSubProgress();
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "showLoading");
        android.view.View view = this.f149197g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void i(int i17, int i18, int i19, int i27, com.tencent.mm.plugin.mmsight.ui.x xVar) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMSightRecordButton", "startProgress, initProgress: %s, maxProgress: %s, duration: %s, callback: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), xVar);
        this.f149199i = true;
        this.f149198h.setInitProgress(i17);
        this.f149198h.setMaxProgress(i18);
        this.f149198h.setDuration(i19);
        if (!this.I) {
            this.f149198h.setVisibility(0);
        }
        this.f149198h.setCircularColor(i27);
        this.f149198h.setProgressCallback(new com.tencent.mm.plugin.mmsight.ui.z(this, xVar));
        com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar mMSightCircularProgressBar = this.f149198h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "start, initProgress: %s, maxProgress: %s, duration: %s currentProgress:%s", java.lang.Integer.valueOf(mMSightCircularProgressBar.f149184r), java.lang.Integer.valueOf(mMSightCircularProgressBar.f149185s), java.lang.Integer.valueOf(mMSightCircularProgressBar.f149186t), java.lang.Float.valueOf(mMSightCircularProgressBar.f149183q));
        mMSightCircularProgressBar.f149187u = true;
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var = mMSightCircularProgressBar.f149189w;
        if (e2Var != null) {
            e2Var.f149319g = false;
            e2Var.f149316d = 0L;
            mMSightCircularProgressBar.f149189w = null;
        }
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var2 = new com.tencent.mm.plugin.mmsight.ui.e2(mMSightCircularProgressBar.f149183q, mMSightCircularProgressBar.f149185s, mMSightCircularProgressBar.f149186t);
        mMSightCircularProgressBar.f149189w = e2Var2;
        com.tencent.mm.plugin.mmsight.ui.w wVar = new com.tencent.mm.plugin.mmsight.ui.w(mMSightCircularProgressBar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProgressHandlerAnimator", "setAnimationCallback: %s", wVar);
        e2Var2.f149320h = wVar;
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var3 = mMSightCircularProgressBar.f149189w;
        e2Var3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProgressHandlerAnimator", "Start");
        e2Var3.f149319g = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        e2Var3.f149316d = android.os.SystemClock.elapsedRealtime();
        e2Var3.f149313a.c(20L, 20L);
    }

    public final void j(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f149202o = true;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f149203p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f149203p = null;
        }
        android.view.ViewPropertyAnimator scaleY = this.f149195e.animate().scaleX(0.5f).scaleY(0.5f);
        this.f149203p = scaleY;
        scaleY.setListener(new com.tencent.mm.plugin.mmsight.ui.a0(this, animatorListenerAdapter)).setDuration(150L).start();
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = this.f149204q;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            this.f149204q = null;
        }
        android.view.ViewPropertyAnimator animate = this.f149196f.animate();
        float f17 = N;
        android.view.ViewPropertyAnimator scaleY2 = animate.scaleX(f17).scaleY(f17);
        this.f149204q = scaleY2;
        scaleY2.setDuration(150L).start();
        if (this.f149209v != 0) {
            android.animation.ValueAnimator valueAnimator = this.f149205r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.D, "color", this.f149209v, 0);
            this.f149205r = ofInt;
            ofInt.setDuration(150L);
            this.f149205r.setEvaluator(com.tencent.mm.plugin.mmsight.ui.b.f149292a);
            this.f149205r.start();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f149206s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(this.C, "color", this.f149210w, this.f149211x);
        this.f149206s = ofInt2;
        ofInt2.setDuration(150L);
        this.f149206s.setEvaluator(com.tencent.mm.plugin.mmsight.ui.b.f149292a);
        this.f149206s.start();
    }

    public void k() {
        if (!this.f149199i || this.f149208u) {
            return;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        onTouchEvent(obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 != 3) goto L64;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setErrorPressCallback(com.tencent.mm.plugin.mmsight.ui.g0 g0Var) {
        this.B = g0Var;
    }

    public void setHighLightOuter(int i17) {
        this.f149209v = i17;
        android.graphics.drawable.Drawable drawable = this.D;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    public void setInnerColor(int i17) {
        android.graphics.drawable.Drawable drawable = this.C;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    public void setLongPressCallback(com.tencent.mm.plugin.mmsight.ui.h0 h0Var) {
        this.f149213z = h0Var;
    }

    public void setLongPressScrollCallback(com.tencent.mm.plugin.mmsight.ui.i0 i0Var) {
        this.A = i0Var;
    }

    public void setSimpleTapCallback(com.tencent.mm.plugin.mmsight.ui.j0 j0Var) {
        this.f149212y = j0Var;
    }

    public void setTouchEnable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", java.lang.Boolean.valueOf(z17));
        this.F = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", java.lang.Boolean.valueOf(this.f149202o));
        if (this.f149202o) {
            postDelayed(new com.tencent.mm.plugin.mmsight.ui.c0(this, i17), 150L);
        } else {
            super.setVisibility(i17);
        }
    }

    public MMSightRecordButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149194d = -1L;
        this.f149199i = false;
        this.f149200m = false;
        this.f149201n = false;
        this.f149202o = false;
        this.f149208u = false;
        this.f149210w = -1;
        this.f149211x = -2130706433;
        this.E = -1.0f;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f149193J = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.K = new com.tencent.mm.plugin.mmsight.ui.d0(this);
        this.L = new com.tencent.mm.plugin.mmsight.ui.e0(this);
        e();
    }
}
