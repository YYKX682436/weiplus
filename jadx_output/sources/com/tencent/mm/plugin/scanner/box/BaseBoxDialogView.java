package com.tencent.mm.plugin.scanner.box;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001+B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0015¨\u0006,"}, d2 = {"Lcom/tencent/mm/plugin/scanner/box/BaseBoxDialogView;", "Landroid/widget/RelativeLayout;", "", "getMaxTranslationY", "", "transY", "Ljz5/f0;", "setBackgroundTranslationY", "getLayoutId", "getCloseLayoutHeight", "Luy3/u;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBackgroundListener", "Luy3/r;", "setBackgroundTouchListener", "Luy3/s;", "model", "setBackgroundViewModel", "Luy3/q;", "opView", "setBackgroundOpView", "", "fixed", "setIsFixDialogHeight", "fixedHeight", "setFixDialogHeight", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, "setFixDialogHeightRate", "enableScroll", "setEnableWebViewScroll", "setEnableDialogScroll", "enableScrollRightClose", "setEnableScrollRightClose", "cancel", "setCanceledOnTouchOutside", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "uy3/a", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public abstract class BaseBoxDialogView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int F1 = 0;
    public float A;
    public final uy3.a A1;
    public float B;
    public final uy3.a B1;
    public int C;
    public final android.view.animation.DecelerateInterpolator C1;
    public int D;
    public int D1;
    public int E;
    public int E1;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f158681J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int P;
    public int Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public float f158682d;

    /* renamed from: e, reason: collision with root package name */
    public float f158683e;

    /* renamed from: f, reason: collision with root package name */
    public float f158684f;

    /* renamed from: g, reason: collision with root package name */
    public float f158685g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f158686h;

    /* renamed from: i, reason: collision with root package name */
    public uy3.t f158687i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f158688l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f158689m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f158690n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.box.BoxWebViewContainer f158691o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f158692p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f158693p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f158694p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f158695q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f158696r;

    /* renamed from: s, reason: collision with root package name */
    public uy3.u f158697s;

    /* renamed from: t, reason: collision with root package name */
    public uy3.r f158698t;

    /* renamed from: u, reason: collision with root package name */
    public uy3.s f158699u;

    /* renamed from: v, reason: collision with root package name */
    public uy3.q f158700v;

    /* renamed from: w, reason: collision with root package name */
    public float f158701w;

    /* renamed from: x, reason: collision with root package name */
    public float f158702x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f158703x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f158704x1;

    /* renamed from: y, reason: collision with root package name */
    public int f158705y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f158706y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f158707y1;

    /* renamed from: z, reason: collision with root package name */
    public float f158708z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.animation.ValueAnimator f158709z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* renamed from: getMaxTranslationY, reason: from getter */
    private final int getF158705y() {
        return this.f158705y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundTranslationY(float f17) {
        uy3.s sVar = this.f158699u;
        if (sVar != null) {
            sVar.setBackgroundTransY(f17);
        }
        uy3.s sVar2 = this.f158699u;
        if (sVar2 != null) {
            sVar2.setMarkViewTransY(f17 + this.f158702x);
        }
    }

    public final void b(float f17, float f18, long j17, boolean z17) {
        if (f17 == f18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseBoxDialogView", "animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        uy3.s sVar = this.f158699u;
        float backgroundTransY = sVar != null ? sVar.getBackgroundTransY() : 0.0f;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new uy3.b(this, z17, f17, f18, backgroundTransY));
        ofFloat.addListener(new uy3.c(this, z17));
        ofFloat.start();
    }

    public final void c(int i17) {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        float f158705y = getF158705y();
        uy3.s sVar = this.f158699u;
        float backgroundTransY = sVar != null ? sVar.getBackgroundTransY() : 0.0f;
        this.U = true;
        this.V = false;
        android.view.View view = this.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationY = animate.translationY(f158705y)) == null || (duration = translationY.setDuration(300L)) == null || (interpolator = duration.setInterpolator(new android.view.animation.AccelerateInterpolator())) == null || (listener = interpolator.setListener(new uy3.h(this, i17))) == null || (updateListener = listener.setUpdateListener(new uy3.i(this, backgroundTransY, 0.0f))) == null) {
            return;
        }
        updateListener.start();
    }

    public abstract android.view.View d(android.view.View view);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView.e(float, boolean):void");
    }

    public final void f() {
        android.view.View decorView;
        if (getContext() instanceof android.app.Activity) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            this.F = rect.height();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "initWindowVisibleHeight: %s, height: %d, windowVisibleHeight: %d, navigationBarHeight: %d", rect, java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.I));
        }
    }

    public final boolean g() {
        return this.N && (this.P > 0 || this.R > 0.0f);
    }

    public abstract int getCloseLayoutHeight();

    public abstract int getLayoutId();

    public void h(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    public final void i(float f17) {
        float f18 = (1.0f * f17) / this.f158705y;
        uy3.u uVar = this.f158697s;
        if (uVar != null) {
            uVar.d(this.D1, f17, f18);
        }
        android.widget.LinearLayout linearLayout = this.f158695q;
        if (linearLayout != null) {
            linearLayout.setTranslationY(f17 - (this.f158700v != null ? r1.getF158714f() : 0));
        }
        uy3.q qVar = this.f158700v;
        if (qVar != null) {
            qVar.getF158714f();
        }
    }

    public final void j() {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator updateListener;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator duration;
        this.T = false;
        this.U = true;
        this.D1 = 0;
        float f158705y = getF158705y();
        float f17 = this.B;
        android.view.View view = this.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(f158705y);
        android.view.View view2 = this.f158690n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view2.animate();
        if (animate != null && (translationY = animate.translationY(f17)) != null && (interpolator = translationY.setInterpolator(this.C1)) != null && (updateListener = interpolator.setUpdateListener(new uy3.l(this))) != null && (listener = updateListener.setListener(new uy3.m(this, f158705y, f17))) != null && (duration = listener.setDuration(300L)) != null) {
            duration.start();
        }
        android.animation.ValueAnimator valueAnimator = this.f158709z1;
        valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimator.setDuration(300L);
        uy3.a aVar = this.A1;
        valueAnimator.setFloatValues(aVar.f431920a, aVar.f431921b);
        valueAnimator.addUpdateListener(new uy3.d(this));
        valueAnimator.addListener(new uy3.e(this));
        valueAnimator.setStartDelay(50L);
        valueAnimator.start();
    }

    public final void k(android.view.View view, int i17, boolean z17) {
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i17;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
        if (z17) {
            post(new uy3.n(view));
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null;
        objArr[1] = java.lang.Integer.valueOf(this.E1);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "onConfigurationChanged newConfig orientation: %s, last: %s", objArr);
        if (configuration != null && this.E1 == configuration.orientation) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        f();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        boolean z17 = false;
        if (motionEvent == null) {
            return false;
        }
        if (this.f158686h == null) {
            this.f158686h = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f158686h;
        kotlin.jvm.internal.o.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        android.view.VelocityTracker velocityTracker2 = this.f158686h;
        kotlin.jvm.internal.o.d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        android.view.VelocityTracker velocityTracker3 = this.f158686h;
        kotlin.jvm.internal.o.d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        android.view.VelocityTracker velocityTracker4 = this.f158686h;
        kotlin.jvm.internal.o.d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            motionEvent.getRawX();
            motionEvent.getRawY();
            android.view.View view = this.f158690n;
            if (view == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            view.getTranslationY();
            this.f158684f = motionEvent.getRawX();
            this.f158685g = motionEvent.getRawY();
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f158684f;
            float rawY = motionEvent.getRawY() - this.f158685g;
            float rawY2 = motionEvent.getRawY();
            android.view.View view2 = this.f158690n;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            if (rawY2 >= view2.getTranslationY()) {
                if (java.lang.Math.abs(rawY) >= 5.0f && this.f158694p1 && java.lang.Math.abs(rawX) <= 250.0f && java.lang.Math.abs(yVelocity) > java.lang.Math.abs(xVelocity) && java.lang.Math.abs(yVelocity) > 0 && java.lang.Math.abs(rawY) > java.lang.Math.abs(rawX)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "ViewPager onInterceptTouchEvent action: %d, dialogContainerCurrentTranslationY: %s", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Float.valueOf(this.f158708z));
                    if (this.f158708z > this.A || (this.W && rawY >= 0.0f)) {
                        z17 = true;
                    }
                    if (z17) {
                        this.f158693p0 = true;
                    }
                } else if (this.f158704x1) {
                    if (java.lang.Math.abs(xVelocity) > java.lang.Math.abs(yVelocity) && rawX > 0.0f && java.lang.Math.abs(rawX) > java.lang.Math.abs(rawY) && this.f158684f <= 20.0f) {
                        z17 = true;
                    }
                    if (z17) {
                        this.f158703x0 = true;
                    }
                }
            }
        }
        motionEvent.getAction();
        return z17;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams;
        int i19;
        super.onMeasure(i17, i18);
        if (this.F == 0) {
            f();
        }
        android.view.View view = this.f158690n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        if (view.getMeasuredHeight() == this.f158705y || !this.f158681J) {
            return;
        }
        android.view.View view2 = this.f158690n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        int measuredHeight = view2.getMeasuredHeight();
        this.f158705y = measuredHeight;
        this.H = java.lang.Math.max(0, this.G - java.lang.Math.max(0, this.F - measuredHeight));
        if (g()) {
            this.H = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        }
        int i27 = this.f158705y;
        int i28 = this.C;
        this.L = (i27 - i28) - this.H;
        this.M = (this.F / 2) - i28;
        android.view.View view3 = this.f158689m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = this.F / 2;
        view3.setLayoutParams(layoutParams2);
        boolean g17 = g();
        if (g17) {
            int i29 = this.f158705y;
            int i37 = this.P;
            if (i37 > 0) {
                i19 = i37 - this.C;
            } else {
                float f17 = this.R;
                i19 = f17 > 0.0f ? (int) ((f17 * i29) - this.C) : 0;
            }
            int min = java.lang.Math.min(this.L, i19);
            this.Q = min;
            if (min > 0) {
                this.M = min;
            } else {
                g17 = false;
            }
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f158696r;
        int i38 = (mMWebView == null || (layoutParams = mMWebView.getLayoutParams()) == null) ? 0 : layoutParams.height;
        if (g17) {
            if (this.L > this.Q) {
                this.A = java.lang.Math.max(this.A, this.L - java.lang.Math.max(r7, this.M));
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f158696r;
            if (mMWebView2 != null) {
                int i39 = mMWebView2.getLayoutParams().height;
                int i47 = this.Q;
                if (i39 != i47) {
                    k(this.f158696r, i47, false);
                    i38 = i47;
                }
            }
            com.tencent.mm.plugin.scanner.box.BoxWebViewContainer boxWebViewContainer = this.f158691o;
            if (boxWebViewContainer == null) {
                kotlin.jvm.internal.o.o("webViewContainer");
                throw null;
            }
            int i48 = boxWebViewContainer.getLayoutParams().height;
            int i49 = this.L;
            if (i48 != i49) {
                com.tencent.mm.plugin.scanner.box.BoxWebViewContainer boxWebViewContainer2 = this.f158691o;
                if (boxWebViewContainer2 == null) {
                    kotlin.jvm.internal.o.o("webViewContainer");
                    throw null;
                }
                k(boxWebViewContainer2, i49, true);
            }
            android.view.View view4 = this.f158690n;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            float translationY = view4.getTranslationY();
            float f18 = this.L - this.Q;
            if (!(translationY == f18)) {
                this.f158708z = f18;
                this.B = f18;
                if (this.V) {
                    android.view.View view5 = this.f158690n;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("dialogContainer");
                        throw null;
                    }
                    view5.setTranslationY(f18);
                }
            }
        } else {
            com.tencent.mm.ui.widget.MMWebView mMWebView3 = this.f158696r;
            if (mMWebView3 != null) {
                int i57 = mMWebView3.getLayoutParams().height;
                int i58 = this.L;
                if (i57 != i58) {
                    k(this.f158696r, i58, true);
                    i38 = i58;
                }
            }
            android.view.View view6 = this.f158690n;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            float translationY2 = view6.getTranslationY();
            float f19 = this.L - this.M;
            if (!(translationY2 == f19)) {
                this.f158708z = f19;
                this.B = f19;
                if (this.V) {
                    android.view.View view7 = this.f158690n;
                    if (view7 == null) {
                        kotlin.jvm.internal.o.o("dialogContainer");
                        throw null;
                    }
                    view7.setTranslationY(f19);
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.L);
        objArr[1] = java.lang.Integer.valueOf(this.M);
        android.view.View view8 = this.f158690n;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        objArr[2] = java.lang.Float.valueOf(view8.getTranslationY());
        objArr[3] = java.lang.Float.valueOf(this.f158708z);
        objArr[4] = java.lang.Boolean.valueOf(g17);
        objArr[5] = java.lang.Integer.valueOf(this.Q);
        objArr[6] = java.lang.Integer.valueOf(i38);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "initWebViewHeight maxWebViewHeight: %d, minWebVieHeight: %d, translationY: %s, dialogContainerCurrentTranslationY: %s, fixedDialog: %b, fixedWebViewHeight: %s, currentWebViewHeight: %s", objArr);
        i65.a.B(getContext());
        android.view.View view9 = this.f158690n;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view9.getMeasuredHeight();
        uy3.a aVar = this.A1;
        aVar.f431920a = 0.0f;
        int i59 = (this.F - this.M) - this.C;
        uy3.s sVar = this.f158699u;
        float markViewHeight = sVar != null ? sVar.getMarkViewHeight() : 0.0f;
        uy3.s sVar2 = this.f158699u;
        float markViewTransY = sVar2 != null ? sVar2.getMarkViewTransY() : 0.0f;
        float f27 = i59 / 2.0f;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "computeHalfScreenAnimationInfo temp: %f, %f, markViewTransY: %f", java.lang.Float.valueOf(f27), java.lang.Float.valueOf(this.F / 4.0f), java.lang.Float.valueOf(markViewTransY));
        float f28 = markViewHeight / 2.0f;
        float f29 = f27 - f28;
        if (markViewTransY > f29) {
            if (markViewTransY >= (this.F - f27) - f28) {
                aVar.f431921b = -this.B;
            } else {
                aVar.f431921b = f29 - this.f158702x;
            }
        }
        uy3.a aVar2 = this.B1;
        aVar2.getClass();
        float f37 = aVar.f431921b;
        aVar2.f431920a = f37;
        float f38 = f37 + this.f158702x;
        float f39 = this.G / 2.0f;
        if (f38 <= f39) {
            return;
        }
        float f47 = this.f158705y;
        if (f38 >= (f47 / 2.0f) - f39) {
            aVar2.f431921b = -f47;
        } else {
            uy3.s sVar3 = this.f158699u;
            aVar2.f431921b = (aVar.f431921b - f38) - (((sVar3 != null ? sVar3.getMarkViewHeight() : 0.0f) - this.G) / 2.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.box.BaseBoxDialogView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBackgroundListener(uy3.u listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f158697s = listener;
    }

    public final void setBackgroundOpView(uy3.q opView) {
        kotlin.jvm.internal.o.g(opView, "opView");
        this.f158700v = opView;
        if (!(opView instanceof android.view.View)) {
            android.widget.LinearLayout linearLayout = this.f158695q;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.f158695q;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        android.widget.LinearLayout linearLayout3 = this.f158695q;
        if (linearLayout3 != null) {
            java.lang.Object obj = this.f158700v;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
            linearLayout3.addView((android.view.View) obj);
        }
        android.widget.LinearLayout linearLayout4 = this.f158695q;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
        requestLayout();
    }

    public final void setBackgroundTouchListener(uy3.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f158698t = listener;
    }

    public final void setBackgroundViewModel(uy3.s model) {
        kotlin.jvm.internal.o.g(model, "model");
        this.f158699u = model;
        this.f158702x = model.getMarkViewTransY();
        uy3.s sVar = this.f158699u;
        if (sVar != null) {
            kotlin.jvm.internal.o.d(sVar);
            if (sVar.getMarkViewHeight() > this.G) {
                uy3.s sVar2 = this.f158699u;
                kotlin.jvm.internal.o.d(sVar2);
                this.G = (int) sVar2.getMarkViewHeight();
            }
        }
        uy3.s sVar3 = this.f158699u;
        if (sVar3 != null) {
            sVar3.getMarkViewTransY();
        }
    }

    public final void setCanceledOnTouchOutside(boolean z17) {
        this.f158707y1 = z17;
        if (z17) {
            android.view.View view = this.f158689m;
            if (view == null) {
                kotlin.jvm.internal.o.o("dialogBg");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f158689m;
            if (view2 != null) {
                view2.setOnClickListener(new uy3.k(this));
                return;
            } else {
                kotlin.jvm.internal.o.o("dialogBg");
                throw null;
            }
        }
        android.view.View view3 = this.f158689m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f158689m;
        if (view4 != null) {
            view4.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
    }

    public final void setEnableDialogScroll(boolean z17) {
        this.f158694p1 = z17;
    }

    public final void setEnableScrollRightClose(boolean z17) {
        this.f158704x1 = z17;
    }

    public final void setEnableWebViewScroll(boolean z17) {
        com.tencent.mm.plugin.scanner.box.BoxWebViewContainer boxWebViewContainer = this.f158691o;
        if (boxWebViewContainer != null) {
            boxWebViewContainer.setEnableScroll(z17);
        } else {
            kotlin.jvm.internal.o.o("webViewContainer");
            throw null;
        }
    }

    public final void setFixDialogHeight(int i17) {
        this.P = i17;
    }

    public final void setFixDialogHeightRate(float f17) {
        this.R = f17;
    }

    public final void setIsFixDialogHeight(boolean z17) {
        this.N = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBoxDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f158681J = true;
        this.W = true;
        this.f158688l1 = true;
        this.f158694p1 = true;
        this.f158707y1 = true;
        this.f158709z1 = new android.animation.ValueAnimator();
        this.A1 = new uy3.a(this);
        this.B1 = new uy3.a(this);
        this.C1 = new android.view.animation.DecelerateInterpolator();
        setFitsSystemWindows(true);
        this.E1 = getResources().getConfiguration().orientation;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(getLayoutId(), (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.d(inflate);
        h(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cz9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f158690n = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f484085cz0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f158689m = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487699pi0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f158691o = (com.tencent.mm.plugin.scanner.box.BoxWebViewContainer) findViewById3;
        this.f158692p = d(inflate);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.aao);
        this.f158695q = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.I = com.tencent.mm.ui.bl.c(context);
        android.view.View view = this.f158689m;
        if (view != null) {
            view.setOnClickListener(new uy3.k(this));
            android.view.View view2 = this.f158692p;
            if (view2 != null) {
                view2.setOnClickListener(new uy3.j(this));
                this.E = com.tencent.mm.ui.bl.h(context);
                this.D = i65.a.k(context) + this.E;
                this.C = getCloseLayoutHeight();
                this.G = i65.a.b(context, 50);
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoxDialogView", "initBoxDialogView orientation: %s, getScreenHeight: %d, statusBarHeight: %d, topEmptyHeight: %d", java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(this.G));
                android.view.View view3 = this.f158690n;
                if (view3 != null) {
                    view3.setTranslationY(this.D);
                    f();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("dialogContainer");
                    throw null;
                }
            }
            kotlin.jvm.internal.o.o("closeButton");
            throw null;
        }
        kotlin.jvm.internal.o.o("dialogBg");
        throw null;
    }
}
