package com.tencent.mm.plugin.multitask.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/MultiTaskFloatBallView;", "Landroid/widget/FrameLayout;", "Lkk3/c;", "", "alpha", "Ljz5/f0;", "setFloatBallAlphaInternal", "", "needTranslateAnimation", "setNeedTranslateAnimation", "", "visibility", "setVisibility", "setAlpha", "<set-?>", "r", "F", "getPosYPercentOfScreen", "()F", "posYPercentOfScreen", "s", "I", "getPositionY", "()I", "positionY", "getTargetPositionXWhenOrientationChanged", "targetPositionXWhenOrientationChanged", "getCurrentStateWidth", "currentStateWidth", "getCurrentStateHeight", "currentStateHeight", "getExtendWidth", "extendWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MultiTaskFloatBallView extends android.widget.FrameLayout implements kk3.c {
    public static final int E = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480507zw);
    public static final int F = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480506zv);
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;

    /* renamed from: d, reason: collision with root package name */
    public int f150508d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f150509e;

    /* renamed from: f, reason: collision with root package name */
    public ck3.t f150510f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f150511g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f150512h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f150513i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f150514m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.LayoutTransition f150515n;

    /* renamed from: o, reason: collision with root package name */
    public int f150516o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f150517p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Point f150518q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public float posYPercentOfScreen;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int positionY;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150521t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150522u;

    /* renamed from: v, reason: collision with root package name */
    public int f150523v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150524w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f150525x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150526y;

    /* renamed from: z, reason: collision with root package name */
    public int f150527z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiTaskFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getCurrentStateHeight() {
        return F + com.tencent.mm.plugin.multitask.q0.f150484a + com.tencent.mm.plugin.multitask.q0.f150487d;
    }

    private final int getCurrentStateWidth() {
        return E + com.tencent.mm.plugin.multitask.q0.f150488e;
    }

    private final int getExtendWidth() {
        int i17;
        if (!this.f150521t) {
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
        boolean z17 = this.f150517p;
        if (!(z17 && i17 == 1) && (z17 || i17 != 3)) {
            return 0;
        }
        return al3.a.b(getContext());
    }

    private final int getTargetPositionXWhenOrientationChanged() {
        if (this.f150517p) {
            return 0;
        }
        return this.f150518q.x - getCurrentStateWidth();
    }

    public static void q(com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView, int i17, boolean z17, int i18, java.lang.Object obj) {
        android.widget.FrameLayout frameLayout = multiTaskFloatBallView.f150512h;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i17;
        android.widget.FrameLayout frameLayout2 = multiTaskFloatBallView.f150512h;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams2);
        }
        android.widget.FrameLayout frameLayout3 = multiTaskFloatBallView.f150513i;
        if (frameLayout3 != null && frameLayout3.getVisibility() == 0) {
            android.widget.FrameLayout frameLayout4 = multiTaskFloatBallView.f150513i;
            android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) (frameLayout4 != null ? frameLayout4.getLayoutParams() : null);
            if (layoutParams3 != null) {
                layoutParams3.gravity = 17;
            }
            android.widget.FrameLayout frameLayout5 = multiTaskFloatBallView.f150513i;
            if (frameLayout5 == null) {
                return;
            }
            frameLayout5.setLayoutParams(layoutParams3);
        }
    }

    public static void s(com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView, boolean z17, boolean z18, boolean z19, boolean z27, int i17, java.lang.Object obj) {
        int i18;
        if ((i17 & 8) != 0) {
            z27 = false;
        }
        if (!z27 && multiTaskFloatBallView.f150525x == z17 && multiTaskFloatBallView.f150526y == z18 && multiTaskFloatBallView.f150524w == z19 && (i18 = multiTaskFloatBallView.f150527z) != 0 && i18 == multiTaskFloatBallView.f150508d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", ">>> updateFloatBallViewLayout, isSettled:%s, isDockLeft:%s, isManual:%s, lastLayoutState:%s, currentLayoutState:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(multiTaskFloatBallView.f150527z), java.lang.Integer.valueOf(multiTaskFloatBallView.f150508d));
        multiTaskFloatBallView.f150524w = z19;
        multiTaskFloatBallView.f150525x = z17;
        multiTaskFloatBallView.f150526y = z18;
        multiTaskFloatBallView.f150527z = multiTaskFloatBallView.f150508d;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskFloatBallView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i19 = E;
        if (i19 == 0 || i19 == 0) {
            marginLayoutParams.width = 0;
            marginLayoutParams.height = 0;
        } else {
            marginLayoutParams.width = i19;
            marginLayoutParams.height = i19;
        }
        try {
            multiTaskFloatBallView.setLayoutParams(marginLayoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", e17, "updateFloatBallViewSize exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateFloatBallViewSize, width:%s, height:%s", java.lang.Integer.valueOf(marginLayoutParams.width), java.lang.Integer.valueOf(marginLayoutParams.height));
        android.widget.FrameLayout frameLayout = multiTaskFloatBallView.f150512h;
        if (frameLayout != null) {
            frameLayout.getPaddingLeft();
            int paddingRight = frameLayout.getPaddingRight();
            int paddingTop = frameLayout.getPaddingTop();
            int paddingBottom = frameLayout.getPaddingBottom();
            if (!((multiTaskFloatBallView.f150508d & 32) != 0)) {
                if (z17 && z18) {
                    android.widget.FrameLayout frameLayout2 = multiTaskFloatBallView.f150512h;
                    if (frameLayout2 != null) {
                        frameLayout2.setPadding(multiTaskFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                    }
                    android.widget.FrameLayout frameLayout3 = multiTaskFloatBallView.f150512h;
                    if (frameLayout3 != null) {
                        frameLayout3.setLayoutTransition(multiTaskFloatBallView.f150515n);
                    }
                    q(multiTaskFloatBallView, multiTaskFloatBallView.f150523v | 3, false, 2, null);
                    android.widget.FrameLayout frameLayout4 = multiTaskFloatBallView.f150513i;
                    if (frameLayout4 == null) {
                        return;
                    }
                    frameLayout4.setVisibility(0);
                    return;
                }
                return;
            }
            int i27 = multiTaskFloatBallView.f150523v;
            q(multiTaskFloatBallView, z18 ? i27 | 3 : i27 | 5, false, 2, null);
            if (z17 && z18) {
                android.widget.FrameLayout frameLayout5 = multiTaskFloatBallView.f150512h;
                if (frameLayout5 != null) {
                    frameLayout5.setPadding(multiTaskFloatBallView.getExtendWidth(), paddingTop, paddingRight, paddingBottom);
                }
                android.widget.FrameLayout frameLayout6 = multiTaskFloatBallView.f150512h;
                if (frameLayout6 != null) {
                    frameLayout6.setLayoutTransition(multiTaskFloatBallView.f150515n);
                }
                q(multiTaskFloatBallView, multiTaskFloatBallView.f150523v | 3, false, 2, null);
                android.widget.FrameLayout frameLayout7 = multiTaskFloatBallView.f150513i;
                if (frameLayout7 == null) {
                    return;
                }
                frameLayout7.setVisibility(0);
            }
        }
    }

    private final void setFloatBallAlphaInternal(float f17) {
        setAlpha(f17);
        int i17 = 0;
        if (f17 == 0.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, GONE");
            i17 = 8;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, VISIBLE, alpha:%s", java.lang.Float.valueOf(f17));
        }
        setVisibility(i17);
    }

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", ">>> onFloatBallInfoChanged, multiTaskInfo:%s", multiTaskInfo);
        this.f150508d = 0;
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            this.f150508d |= 32;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        boolean n17 = n(((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        s(this, true, n17, false, false, 8, null);
        r(true, n17, false, this.f150508d);
        if (!this.f150522u) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showByTranslation float ball already show");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (this.f150510f == null) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        boolean n18 = n(((android.widget.FrameLayout.LayoutParams) layoutParams2).leftMargin);
        ck3.t tVar = this.f150510f;
        if (tVar != null) {
            tVar.i(getCurrentStateWidth(), n18, aVar);
        }
    }

    public final float getPosYPercentOfScreen() {
        return this.posYPercentOfScreen;
    }

    public final int getPositionY() {
        return this.positionY;
    }

    public final void k() {
        int i17;
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i17 = getResources().getConfiguration().orientation) != this.f150516o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f150516o));
            p(i17);
        }
    }

    public final void l(boolean z17, boolean z18, qn5.a aVar) {
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "float ball already hide");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (z17 && this.f150510f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hide with trans animation");
            ck3.t tVar = this.f150510f;
            if (tVar != null) {
                tVar.f(getCurrentStateWidth(), z17, z18, aVar);
                return;
            }
            return;
        }
        if (!z18 || this.f150510f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hide without animation");
            setVisibility(8);
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hide with alpha animation");
        ck3.t tVar2 = this.f150510f;
        if (tVar2 != null) {
            tVar2.f(getCurrentStateWidth(), z17, z18, aVar);
        }
    }

    public final void m(qn5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideByTranslation float ball already hide");
            return;
        }
        if (this.f150510f != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            boolean n17 = n(((android.view.WindowManager.LayoutParams) layoutParams).x);
            ck3.t tVar = this.f150510f;
            if (tVar != null) {
                tVar.g(getCurrentStateWidth(), n17, aVar);
            }
        }
    }

    public final boolean n(int i17) {
        return i17 + (getCurrentStateWidth() / 2) <= this.f150518q.x / 2;
    }

    public final void o(int i17, int i18, boolean z17, boolean z18) {
        boolean n17 = n(i17);
        this.f150517p = n17;
        r(z17, n17, z18, this.f150508d);
        s(this, z17, this.f150517p, z18, false, 8, null);
        if (z17) {
            this.posYPercentOfScreen = i18 / this.f150518q.y;
        }
        this.positionY = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallPositionChanged, x:%s, y:%s, isSettled:%s, isManual:%s, isDockLeft:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f150517p));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        o(layoutParams2.leftMargin, layoutParams2.topMargin, true, false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "onConfigurationChanged, orientation:%d, lastOrientation: %d", java.lang.Integer.valueOf(newConfig.orientation), java.lang.Integer.valueOf(this.f150516o));
        p(newConfig.orientation);
        int i17 = newConfig.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f150511g).iterator();
        while (it.hasNext()) {
            ((kk3.e) it.next()).onOrientationChange(i17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f150509e;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f150509e = null;
        }
    }

    public final void p(int i17) {
        android.graphics.Point point = this.f150518q;
        this.f150518q = com.tencent.mm.ui.bk.h(getContext());
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(getContext())) {
            this.f150518q.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f150518q.x = com.tencent.mm.ui.bk.f();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.f150518q;
        objArr[1] = point == null ? "null" : point;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "processOrientationChanged, screenResolution: %s, lastResolution: %s", objArr);
        if (this.f150516o == i17) {
            if (point == null) {
                return;
            }
            int i18 = point.x;
            android.graphics.Point point2 = this.f150518q;
            if (i18 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f150516o = i17;
        this.f150521t = true;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i19 = marginLayoutParams.leftMargin;
        android.graphics.Point point3 = this.f150518q;
        int i27 = (int) (point3.y * this.posYPercentOfScreen);
        int max = java.lang.Math.max(java.lang.Math.min(i19, point3.x), 0);
        int max2 = java.lang.Math.max(java.lang.Math.min(i27, this.f150518q.y), 0);
        int targetPositionXWhenOrientationChanged = getTargetPositionXWhenOrientationChanged();
        int i28 = com.tencent.mm.plugin.multitask.q0.f150491h;
        if (max2 >= i28 && max2 <= (i28 = com.tencent.mm.plugin.multitask.q0.f150492i)) {
            i28 = max2;
        }
        boolean z17 = targetPositionXWhenOrientationChanged == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "processOrientationChanged, layoutParams.x: %s, layoutParams.y: %s, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]", java.lang.Integer.valueOf(marginLayoutParams.leftMargin), java.lang.Integer.valueOf(marginLayoutParams.topMargin), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(targetPositionXWhenOrientationChanged), java.lang.Integer.valueOf(i28));
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "start StickyAnimation, stickToLeft:%s, startPositionY: %d, targetPositionY: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(i28));
        android.animation.ValueAnimator valueAnimator = this.f150509e;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "cancel StickyAnimation");
                android.animation.ValueAnimator valueAnimator2 = this.f150509e;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f150509e = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        android.animation.ValueAnimator valueAnimator3 = this.f150509e;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(100L);
        }
        android.animation.ValueAnimator valueAnimator4 = this.f150509e;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new pk3.f(max, targetPositionXWhenOrientationChanged, max2, i28, this));
        }
        android.animation.ValueAnimator valueAnimator5 = this.f150509e;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new pk3.g(this));
        }
        android.animation.ValueAnimator valueAnimator6 = this.f150509e;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void r(boolean z17, boolean z18, boolean z19, int i17) {
        if (this.B == z17 && this.C == z18 && this.A == z19 && this.D == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateFloatBallBackground, isSettled:%s, isDockLeft:%s, isManual:%s, state:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i17));
        this.D = i17;
        this.A = z19;
        this.B = z17;
        this.C = z18;
        if (!z17) {
            if (z19) {
                android.widget.FrameLayout frameLayout = this.f150512h;
                if (frameLayout == null) {
                    return;
                }
                frameLayout.setBackground(null);
                return;
            }
            android.widget.FrameLayout frameLayout2 = this.f150512h;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setBackground(null);
            return;
        }
        if (z18) {
            android.widget.FrameLayout frameLayout3 = this.f150512h;
            if (frameLayout3 == null) {
                return;
            }
            frameLayout3.setBackground(this.f150514m);
            return;
        }
        if (z19) {
            android.widget.FrameLayout frameLayout4 = this.f150512h;
            if (frameLayout4 == null) {
                return;
            }
            frameLayout4.setBackground(null);
            return;
        }
        android.widget.FrameLayout frameLayout5 = this.f150512h;
        if (frameLayout5 == null) {
            return;
        }
        frameLayout5.setBackground(null);
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.FloatBallView", "setAlpha:%s", java.lang.Float.valueOf(f17));
        k();
    }

    public final void setNeedTranslateAnimation(boolean z17) {
        this.f150522u = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        int alpha = (int) getAlpha();
        if (alpha == 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.FloatBallView", "setVisibility:%s, alphaInt:%s, disableTouch", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(alpha));
        } else {
            if (alpha != 1) {
                return;
            }
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.FloatBallView", "setVisibility:%s, alphaInt:%s, enableTouch", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(alpha));
            k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTaskFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150511g = new java.util.concurrent.CopyOnWriteArraySet();
        this.f150518q = new android.graphics.Point();
        new android.graphics.PointF();
        new android.graphics.Point();
        this.posYPercentOfScreen = -1.0f;
        new android.graphics.Point();
        this.f150523v = 16;
        new android.os.Handler(android.os.Looper.getMainLooper());
        android.view.View.inflate(context, com.tencent.mm.R.layout.boe, this);
        this.f150514m = i65.a.i(context, com.tencent.mm.R.drawable.adj);
        this.f150512h = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.acz);
        this.f150513i = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.kmu);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.uns)).setImageDrawable(m95.a.e(getResources(), ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? com.tencent.mm.R.raw.icons_multi_task_star_line_regular : com.tencent.mm.R.raw.multitask_indicator_full_icon, 0.0f));
        this.f150510f = new ck3.t(this);
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f150518q = com.tencent.mm.ui.bk.h(context);
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(context)) {
            this.f150518q.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f150518q.x = com.tencent.mm.ui.bk.f();
        }
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        this.f150515n = layoutTransition;
        android.widget.FrameLayout frameLayout = this.f150512h;
        if (frameLayout != null) {
            frameLayout.setLayoutTransition(layoutTransition);
        }
        this.f150516o = getResources().getConfiguration().orientation;
    }

    public /* synthetic */ MultiTaskFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
