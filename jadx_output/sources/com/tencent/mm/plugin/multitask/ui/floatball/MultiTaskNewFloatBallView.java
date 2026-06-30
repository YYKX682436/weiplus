package com.tencent.mm.plugin.multitask.ui.floatball;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/floatball/MultiTaskNewFloatBallView;", "Landroid/widget/FrameLayout;", "Lkk3/c;", "", "needTranslateAnimation", "Ljz5/f0;", "setNeedTranslateAnimation", "Landroid/graphics/Point;", "getBallPosition", "", "visibility", "setVisibility", "", "alpha", "setAlpha", "getTargetPositionXWhenOrientationChanged", "()I", "targetPositionXWhenOrientationChanged", "getCurrentStateWidth", "currentStateWidth", "getCurrentStateHeight", "currentStateHeight", "getExtendWidth", "extendWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MultiTaskNewFloatBallView extends android.widget.FrameLayout implements kk3.c {
    public static final int M = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.apf);
    public static final int N = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.apf);
    public final boolean A;
    public final int B;
    public boolean C;
    public android.view.WindowManager D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f150535J;
    public boolean K;
    public int L;

    /* renamed from: d, reason: collision with root package name */
    public int f150536d;

    /* renamed from: e, reason: collision with root package name */
    public int f150537e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f150538f;

    /* renamed from: g, reason: collision with root package name */
    public ck3.t f150539g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f150540h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f150541i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f150542m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f150543n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f150544o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f150545p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.LayoutTransition f150546q;

    /* renamed from: r, reason: collision with root package name */
    public int f150547r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150548s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150549t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Point f150550u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.PointF f150551v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Point f150552w;

    /* renamed from: x, reason: collision with root package name */
    public float f150553x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150554y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f150555z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiTaskNewFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getCurrentStateHeight() {
        return N + com.tencent.mm.plugin.multitask.q0.f150484a + com.tencent.mm.plugin.multitask.q0.f150487d;
    }

    private final int getCurrentStateWidth() {
        return M;
    }

    private final int getExtendWidth() {
        int i17;
        if (!this.f150554y) {
            return 0;
        }
        android.content.Context context = getContext();
        if (al3.a.f5847c == null) {
            al3.a.f5847c = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.u(context, false));
        }
        java.lang.Boolean bool = al3.a.f5847c;
        if (!(bool != null ? bool.booleanValue() : false)) {
            return 0;
        }
        if (getContext() instanceof android.app.Activity) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            i17 = ((android.app.Activity) context2).getWindow().getWindowManager().getDefaultDisplay().getRotation();
        } else {
            i17 = 0;
        }
        boolean z17 = this.f150549t;
        if (!(z17 && i17 == 1) && (z17 || i17 != 3)) {
            return 0;
        }
        return al3.a.b(getContext());
    }

    private final int getTargetPositionXWhenOrientationChanged() {
        if (this.f150549t) {
            return 0;
        }
        return this.f150550u.x - getCurrentStateWidth();
    }

    public static void w(com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView, int i17, int i18, boolean z17, boolean z18, boolean z19, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            z19 = true;
        }
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskNewFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i27 = layoutParams2.x;
        int i28 = layoutParams2.y;
        if (multiTaskNewFloatBallView.D != null) {
            if (i27 == i17 && i28 == i18) {
                return;
            }
            layoutParams2.x = i17;
            layoutParams2.y = i18;
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTaskNewFloatBallView", "updateBallPosition, x:%s, y:%s, dockLeft:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(multiTaskNewFloatBallView.f150549t));
            try {
                android.view.WindowManager windowManager = multiTaskNewFloatBallView.D;
                if (windowManager != null) {
                    windowManager.updateViewLayout(multiTaskNewFloatBallView, layoutParams2);
                }
                if (z19) {
                    multiTaskNewFloatBallView.s(i17, i18, z17, z18);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskNewFloatBallView", th6, "updateBallPosition fail", new java.lang.Object[0]);
            }
        }
    }

    public static void x(com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView, int i17, boolean z17, int i18, java.lang.Object obj) {
        android.widget.FrameLayout frameLayout = multiTaskNewFloatBallView.f150542m;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i17;
        android.widget.FrameLayout frameLayout2 = multiTaskNewFloatBallView.f150542m;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams2);
        }
        android.widget.FrameLayout frameLayout3 = multiTaskNewFloatBallView.f150543n;
        if (frameLayout3 != null && frameLayout3.getVisibility() == 0) {
            android.widget.FrameLayout frameLayout4 = multiTaskNewFloatBallView.f150543n;
            android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) (frameLayout4 != null ? frameLayout4.getLayoutParams() : null);
            if (layoutParams3 != null) {
                layoutParams3.gravity = 17;
            }
            android.widget.FrameLayout frameLayout5 = multiTaskNewFloatBallView.f150543n;
            if (frameLayout5 == null) {
                return;
            }
            frameLayout5.setLayoutParams(layoutParams3);
        }
    }

    public static void z(com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView, boolean z17, boolean z18, boolean z19, boolean z27, int i17, java.lang.Object obj) {
        int i18;
        if ((i17 & 8) != 0) {
            z27 = false;
        }
        if (!z27 && multiTaskNewFloatBallView.F == z17 && multiTaskNewFloatBallView.G == z18 && multiTaskNewFloatBallView.E == z19 && (i18 = multiTaskNewFloatBallView.H) != 0 && i18 == multiTaskNewFloatBallView.f150536d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", ">>> updateFloatBallViewLayout, isSettled:%s, isDockLeft:%s, isManual:%s, lastLayoutState:%s, currentLayoutState:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(multiTaskNewFloatBallView.H), java.lang.Integer.valueOf(multiTaskNewFloatBallView.f150536d));
        multiTaskNewFloatBallView.E = z19;
        multiTaskNewFloatBallView.F = z17;
        multiTaskNewFloatBallView.G = z18;
        multiTaskNewFloatBallView.H = multiTaskNewFloatBallView.f150536d;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskNewFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i19 = M;
        if (i19 == 0 || i19 == 0) {
            layoutParams2.width = 0;
            layoutParams2.height = 0;
        } else {
            layoutParams2.width = i19;
            layoutParams2.height = i19;
        }
        try {
            multiTaskNewFloatBallView.setLayoutParams(layoutParams2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskNewFloatBallView", e17, "updateFloatBallViewSize exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "updateFloatBallViewSize, width:%s, height:%s", java.lang.Integer.valueOf(layoutParams2.width), java.lang.Integer.valueOf(layoutParams2.height));
        android.widget.FrameLayout frameLayout = multiTaskNewFloatBallView.f150542m;
        if (frameLayout != null) {
            frameLayout.getPaddingLeft();
            int paddingRight = frameLayout.getPaddingRight();
            int paddingTop = frameLayout.getPaddingTop();
            int paddingBottom = frameLayout.getPaddingBottom();
            boolean z28 = (multiTaskNewFloatBallView.f150536d & 32) != 0;
            int i27 = multiTaskNewFloatBallView.B;
            if (!z28) {
                if (z17 && z18) {
                    android.widget.FrameLayout frameLayout2 = multiTaskNewFloatBallView.f150542m;
                    if (frameLayout2 != null) {
                        frameLayout2.setPadding(multiTaskNewFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                    }
                    android.widget.FrameLayout frameLayout3 = multiTaskNewFloatBallView.f150542m;
                    if (frameLayout3 != null) {
                        frameLayout3.setLayoutTransition(multiTaskNewFloatBallView.f150546q);
                    }
                    x(multiTaskNewFloatBallView, i27 | 3, false, 2, null);
                    android.widget.FrameLayout frameLayout4 = multiTaskNewFloatBallView.f150543n;
                    if (frameLayout4 == null) {
                        return;
                    }
                    frameLayout4.setVisibility(0);
                    return;
                }
                return;
            }
            x(multiTaskNewFloatBallView, z18 ? i27 | 3 : i27 | 5, false, 2, null);
            if (z17) {
                if (z18) {
                    android.widget.FrameLayout frameLayout5 = multiTaskNewFloatBallView.f150542m;
                    if (frameLayout5 != null) {
                        frameLayout5.setPadding(multiTaskNewFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                    }
                    android.widget.FrameLayout frameLayout6 = multiTaskNewFloatBallView.f150542m;
                    if (frameLayout6 != null) {
                        frameLayout6.setLayoutTransition(multiTaskNewFloatBallView.f150546q);
                    }
                    x(multiTaskNewFloatBallView, i27 | 3, false, 2, null);
                    android.widget.FrameLayout frameLayout7 = multiTaskNewFloatBallView.f150543n;
                    if (frameLayout7 == null) {
                        return;
                    }
                    frameLayout7.setVisibility(0);
                    return;
                }
                multiTaskNewFloatBallView.setPadding(0, 0, 0, 0);
                android.widget.FrameLayout frameLayout8 = multiTaskNewFloatBallView.f150542m;
                kotlin.jvm.internal.o.d(frameLayout8);
                frameLayout8.setLayoutTransition(multiTaskNewFloatBallView.getLayoutTransition());
                android.view.ViewGroup.LayoutParams layoutParams3 = multiTaskNewFloatBallView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                android.view.WindowManager.LayoutParams layoutParams4 = (android.view.WindowManager.LayoutParams) layoutParams3;
                int i28 = layoutParams4.x;
                int i29 = layoutParams4.y;
                int max = (int) java.lang.Math.max(java.lang.Math.min(i28, multiTaskNewFloatBallView.f150550u.x), -multiTaskNewFloatBallView.getLayoutParams().width);
                int max2 = (int) java.lang.Math.max(java.lang.Math.min(i29, multiTaskNewFloatBallView.f150550u.y), 0.0d);
                int o17 = multiTaskNewFloatBallView.o(max);
                int i37 = com.tencent.mm.plugin.multitask.q0.f150491h;
                int i38 = (max2 >= i37 && max2 <= (i37 = com.tencent.mm.plugin.multitask.q0.f150492i)) ? max2 : i37;
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "stickToScreenEdgeIfNeed, start:[%s, %s], target:[%s, %s]", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(i38));
                if (max == o17 && max2 == i38) {
                    return;
                }
                w(multiTaskNewFloatBallView, o17, i38, true, false, false, 16, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
    }

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", ">>> onFloatBallInfoChanged, multiTaskInfo:%s", multiTaskInfo);
        this.f150536d = 0;
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            this.f150536d |= 32;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        boolean r17 = r(((android.view.WindowManager.LayoutParams) layoutParams).x);
        z(this, true, r17, false, false, 8, null);
        y(true, r17, false, this.f150536d);
        if (!this.f150555z) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "showByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "showByTranslation float ball already show");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (this.f150539g == null) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        boolean r18 = r(((android.widget.FrameLayout.LayoutParams) layoutParams2).leftMargin);
        ck3.t tVar = this.f150539g;
        if (tVar != null) {
            tVar.i(getCurrentStateWidth(), r18, aVar);
        }
    }

    public final android.graphics.Point getBallPosition() {
        int i17;
        int i18;
        int i19;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        if (this.f150549t) {
            i17 = layoutParams2.x + qp1.c0.f365708q;
            i18 = layoutParams2.y;
            i19 = qp1.c0.f365705n;
        } else {
            i17 = layoutParams2.x + qp1.c0.f365708q;
            i18 = layoutParams2.y;
            i19 = qp1.c0.f365705n;
        }
        int i27 = i18 + i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "getBallPosition position x: %s, y: %s, FLOAT_BALL_SHADOW_HORIZONTAL: %s, FLOAT_BALL_SHADOW_TOP: %s", java.lang.Integer.valueOf(layoutParams2.x), java.lang.Integer.valueOf(layoutParams2.y), java.lang.Integer.valueOf(qp1.c0.f365707p), java.lang.Integer.valueOf(qp1.c0.f365704m));
        return new android.graphics.Point(i17, i27);
    }

    public final boolean k(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.f150551v;
        return java.lang.Math.abs((double) (rawX - pointF.x)) > ((double) this.f150537e) || java.lang.Math.abs((double) (motionEvent.getRawY() - pointF.y)) > ((double) this.f150537e);
    }

    public final void l() {
        int i17;
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i17 = getResources().getConfiguration().orientation) != this.f150547r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f150547r));
            t(i17);
        }
    }

    public final int m(android.view.MotionEvent motionEvent) {
        return (int) java.lang.Math.max(java.lang.Math.min((this.f150552w.x + motionEvent.getRawX()) - this.f150551v.x, this.f150550u.x), -getLayoutParams().width);
    }

    public final int n(android.view.MotionEvent motionEvent) {
        return (int) java.lang.Math.max(java.lang.Math.min((this.f150552w.y + motionEvent.getRawY()) - this.f150551v.y, this.f150550u.y), -getLayoutParams().height);
    }

    public final int o(int i17) {
        int currentStateWidth = !r(i17) ? this.f150550u.x - getCurrentStateWidth() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "getTargetPositionX: %s", java.lang.Integer.valueOf(currentStateWidth));
        return currentStateWidth;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "onAttachedToWindow");
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int o17 = o(layoutParams2.x);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "onAttachedToWindow targetX: %s", java.lang.Integer.valueOf(o17));
        int i17 = layoutParams2.x;
        if (i17 != o17) {
            w(this, o17, layoutParams2.y, true, false, false, 16, null);
        } else {
            s(i17, layoutParams2.y, true, false);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "onConfigurationChanged, orientation:%d, lastOrientation: %d", java.lang.Integer.valueOf(newConfig.orientation), java.lang.Integer.valueOf(this.f150547r));
        t(newConfig.orientation);
        int i17 = newConfig.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f150540h).iterator();
        while (it.hasNext()) {
            ((kk3.e) it.next()).onOrientationChange(i17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "onDetachedFromWindow");
        android.animation.ValueAnimator valueAnimator = this.f150538f;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f150538f = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != 3) goto L91;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z17, boolean z18, qn5.a aVar) {
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "float ball already hide");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (z17 && this.f150539g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "hide with trans animation");
            ck3.t tVar = this.f150539g;
            if (tVar != null) {
                tVar.f(getCurrentStateWidth(), z17, z18, aVar);
                return;
            }
            return;
        }
        if (!z18 || this.f150539g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "hide without animation");
            setVisibility(8);
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "hide with alpha animation");
        ck3.t tVar2 = this.f150539g;
        if (tVar2 != null) {
            tVar2.f(getCurrentStateWidth(), z17, z18, aVar);
        }
    }

    public final void q(qn5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "hideByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "hideByTranslation float ball already hide");
            return;
        }
        if (this.f150539g != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            boolean r17 = r(((android.view.WindowManager.LayoutParams) layoutParams).x);
            ck3.t tVar = this.f150539g;
            if (tVar != null) {
                tVar.g(getCurrentStateWidth(), r17, aVar);
            }
        }
    }

    public final boolean r(int i17) {
        return i17 + (getCurrentStateWidth() / 2) <= this.f150550u.x / 2;
    }

    public final void s(int i17, int i18, boolean z17, boolean z18) {
        boolean r17 = r(i17);
        this.f150549t = r17;
        y(z17, r17, z18, this.f150536d);
        z(this, z17, this.f150549t, z18, false, 8, null);
        if (z17) {
            this.f150553x = i18 / this.f150550u.y;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "notifyBallPositionChanged, x:%s, y:%s, isSettled:%s, isManual:%s, isDockLeft:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f150549t));
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTaskNewFloatBallView", "setAlpha:%s", java.lang.Float.valueOf(f17));
        l();
    }

    public final void setNeedTranslateAnimation(boolean z17) {
        this.f150555z = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            this.f150548s = true;
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTaskNewFloatBallView", "setVisibility:%s, alpha:%s, enableTouch", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(getAlpha()));
            l();
        } else {
            if (i17 != 8) {
                return;
            }
            this.f150548s = false;
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTaskNewFloatBallView", "setVisibility:%s, alpha:%s, disableTouch", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(getAlpha()));
        }
    }

    public final void t(int i17) {
        android.graphics.Point point = this.f150550u;
        this.f150550u = com.tencent.mm.ui.bk.h(getContext());
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(getContext())) {
            this.f150550u.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f150550u.x = com.tencent.mm.ui.bk.f();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f150550u;
        objArr[1] = point == null ? "null" : point;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "processOrientationChanged, screenResolution: %s, lastResolution: %s", objArr);
        if (this.f150547r == i17) {
            if (point == null) {
                return;
            }
            int i18 = point.x;
            android.graphics.Point point2 = this.f150550u;
            if (i18 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f150547r = i17;
        this.f150554y = true;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i19 = layoutParams2.x;
        android.graphics.Point point3 = this.f150550u;
        int i27 = (int) (point3.y * this.f150553x);
        int max = java.lang.Math.max(java.lang.Math.min(i19, point3.x), 0);
        int max2 = java.lang.Math.max(java.lang.Math.min(i27, this.f150550u.y), 0);
        int targetPositionXWhenOrientationChanged = getTargetPositionXWhenOrientationChanged();
        int i28 = com.tencent.mm.plugin.multitask.q0.f150491h;
        int i29 = (max2 >= i28 && max2 <= (i28 = com.tencent.mm.plugin.multitask.q0.f150492i)) ? max2 : i28;
        boolean z17 = targetPositionXWhenOrientationChanged == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "processOrientationChanged, layoutParams.x: %s, layoutParams.y: %s, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]", java.lang.Integer.valueOf(layoutParams2.x), java.lang.Integer.valueOf(layoutParams2.y), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(targetPositionXWhenOrientationChanged), java.lang.Integer.valueOf(i29));
        v(z17, max, max2, targetPositionXWhenOrientationChanged, i29);
    }

    public final void u(boolean z17, boolean z18, qn5.a aVar) {
        if (getVisibility() == 0 && z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "float ball already show");
            return;
        }
        if (!z17 || this.f150539g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "show without animation");
            setVisibility(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "show with animation");
        ck3.t tVar = this.f150539g;
        if (tVar != null) {
            tVar.h(false, aVar, 0.0f, 1.0f);
        }
    }

    public final void v(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "start StickyAnimation, stickToLeft:%s, startPositionY: %d, targetPositionY: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
        android.animation.ValueAnimator valueAnimator = this.f150538f;
        if (valueAnimator != null) {
            boolean z18 = false;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                z18 = true;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "cancel StickyAnimation");
                android.animation.ValueAnimator valueAnimator2 = this.f150538f;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f150538f = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        android.animation.ValueAnimator valueAnimator3 = this.f150538f;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(100L);
        }
        android.animation.ValueAnimator valueAnimator4 = this.f150538f;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new tk3.e(i17, i19, i18, i27, this));
        }
        android.animation.ValueAnimator valueAnimator5 = this.f150538f;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new tk3.f(this));
        }
        android.animation.ValueAnimator valueAnimator6 = this.f150538f;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void y(boolean z17, boolean z18, boolean z19, int i17) {
        if (this.f150535J == z17 && this.K == z18 && this.I == z19 && this.L == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallView", "updateFloatBallBackground, isSettled:%s, isDockLeft:%s, isManual:%s, state:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i17));
        this.L = i17;
        this.I = z19;
        this.f150535J = z17;
        this.K = z18;
    }

    public /* synthetic */ MultiTaskNewFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTaskNewFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150540h = new java.util.concurrent.CopyOnWriteArraySet();
        this.f150541i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f150550u = new android.graphics.Point();
        this.f150551v = new android.graphics.PointF();
        this.f150552w = new android.graphics.Point();
        this.f150553x = -1.0f;
        this.A = true;
        this.B = 16;
        android.view.View.inflate(context, com.tencent.mm.R.layout.ei8, this);
        this.f150544o = i65.a.i(context, com.tencent.mm.R.drawable.d4o);
        this.f150545p = i65.a.i(context, com.tencent.mm.R.drawable.d4o);
        this.f150542m = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.acz);
        this.f150543n = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.kmu);
        this.f150539g = new ck3.t(this);
        this.f150537e = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f150550u = com.tencent.mm.ui.bk.h(context);
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(context)) {
            this.f150550u.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f150550u.x = com.tencent.mm.ui.bk.f();
        }
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        this.f150546q = layoutTransition;
        android.widget.FrameLayout frameLayout = this.f150542m;
        if (frameLayout != null) {
            frameLayout.setLayoutTransition(layoutTransition);
        }
        this.f150547r = getResources().getConfiguration().orientation;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.D = (android.view.WindowManager) systemService;
    }
}
