package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLikeContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveLikeContainer extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final int N;
    public qo0.c A;
    public final com.tencent.mm.ui.widget.imageview.WeImageView B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public boolean F;
    public final android.os.Handler G;
    public java.lang.Runnable H;
    public java.lang.Runnable I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f115993J;
    public int[] K;
    public int L;
    public final android.os.Vibrator M;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f115994v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f115995w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f115996x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f115997y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f115998z;

    static {
        ae2.in inVar = ae2.in.f3688a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f3911w5).getValue()).r();
        if (!(((java.lang.Number) r17).intValue() > 0)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        N = num != null ? num.intValue() : 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLikeContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115994v = "FinderLiveLikeContainer";
        this.G = new android.os.Handler(android.os.Looper.getMainLooper());
        this.K = new int[]{0, 0};
        java.lang.Object systemService = context.getSystemService("vibrator");
        this.M = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488912ea2, (android.view.ViewGroup) this, true);
        this.B = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.tk_);
    }

    public static final void A(com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer, boolean z17) {
        if (finderLiveLikeContainer.f115998z == null) {
            com.tencent.mars.xlog.Log.e(finderLiveLikeContainer.f115994v, "postLike: sessionId is null");
            return;
        }
        int i17 = finderLiveLikeContainer.L + 1;
        finderLiveLikeContainer.L = i17;
        boolean z18 = (finderLiveLikeContainer.D || z17 || i17 % N != 0) ? false : true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_LIVE_SESSION_ID", finderLiveLikeContainer.f115998z);
        if (!z18) {
            bundle.putBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN", z17);
            qo0.c cVar = finderLiveLikeContainer.A;
            if (cVar != null) {
                cVar.statusChange(qo0.b.B3, bundle);
            }
            yz5.a aVar = finderLiveLikeContainer.f115995w;
            if (aVar != null) {
                return;
            }
            return;
        }
        java.lang.String str = finderLiveLikeContainer.E;
        if (str == null) {
            str = c01.z1.r();
        }
        bundle.putString("PARAM_FINDER_LIVE_HEAD_URL", str);
        com.tencent.mars.xlog.Log.i(finderLiveLikeContainer.f115994v, "postLike,postHighLightLike,headUrl:" + str);
        qo0.c cVar2 = finderLiveLikeContainer.A;
        if (cVar2 != null) {
            cVar2.statusChange(qo0.b.C3, bundle);
        }
        yz5.a aVar2 = finderLiveLikeContainer.f115996x;
        if (aVar2 != null) {
        }
    }

    public final void B() {
        android.os.Bundle bundle = new android.os.Bundle();
        int[] iArr = {0, 0};
        getLocationInWindow(iArr);
        if (getWidth() == 0 || getHeight() == 0 || iArr[0] == 0 || iArr[1] == 0) {
            return;
        }
        yz5.l lVar = this.f115997y;
        if (lVar != null) {
        }
        if (this.f115998z == null) {
            com.tencent.mars.xlog.Log.e(this.f115994v, "setConfettiPosition: sessionId is null");
            return;
        }
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 40);
        if (a17 <= 0) {
            com.tencent.mars.xlog.Log.e(this.f115994v, "setConfettiPosition: anchorLikeContainerSize <= 0");
            return;
        }
        int width = iArr[0] + (getWidth() / 2);
        int i17 = iArr[1];
        com.tencent.mars.xlog.Log.i(this.f115994v, "onLayoutChange,update confetti,sessionId=" + this.f115998z + " position=" + width + '=' + i17);
        bundle.putFloat("PARAM_LIVE_LIKE_CONFETTI_DISPLAY_SCALE", (getWidth() * 1.0f) / a17);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", width);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", i17);
        bundle.putString("PARAM_LIVE_SESSION_ID", this.f115998z);
        qo0.c cVar = this.A;
        if (cVar != null) {
            cVar.statusChange(qo0.b.D3, bundle);
        }
    }

    public final void C() {
        android.view.ViewPropertyAnimator animate;
        com.tencent.mars.xlog.Log.i(this.f115994v, "unBindData");
        animate().cancel();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.B;
        if (weImageView != null && (animate = weImageView.animate()) != null) {
            animate.cancel();
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        java.lang.Runnable runnable = this.I;
        android.os.Handler handler = this.G;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.I = null;
        this.F = false;
        java.lang.Runnable runnable2 = this.H;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        if (this.f115998z == null) {
            com.tencent.mars.xlog.Log.e(this.f115994v, "removeConfetti: sessionId is null");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_LIVE_SESSION_ID", this.f115998z);
            qo0.c cVar = this.A;
            if (cVar != null) {
                cVar.statusChange(qo0.b.E3, bundle);
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f115993J);
        }
        this.f115993J = null;
        this.K = new int[]{0, 0};
        this.f115995w = null;
        this.f115996x = null;
        this.f115997y = null;
        this.f115998z = null;
        this.A = null;
        this.C = false;
        this.D = false;
        this.E = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator animate2;
        if (!this.C) {
            return false;
        }
        java.lang.Runnable runnable = this.I;
        android.os.Handler handler = this.G;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.I = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.B;
        if (valueOf != null && valueOf.intValue() == 0) {
            pf5.u uVar = pf5.u.f353936a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (((pl2.x) uVar.b(context).a(pl2.x.class)).f356683f) {
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pl2.s sVar = ((pl2.x) uVar.b(context2).a(pl2.x.class)).f356684g;
                if (sVar != null) {
                    pl2.s.e(sVar, 0L, null, 3, null);
                }
                android.content.Context context3 = getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                ((pl2.x) uVar.b(context3).a(pl2.x.class)).f356687m.f356678h = 3;
            } else {
                animate().cancel();
                if (weImageView != null && (animate2 = weImageView.animate()) != null) {
                    animate2.cancel();
                }
                setScaleX(1.5f);
                setScaleY(1.5f);
                if (weImageView != null) {
                    weImageView.setAlpha(0.3f);
                }
                if (this.F) {
                    com.tencent.mars.xlog.Log.w(this.f115994v, "onStartPostLike:hasStartPostLike is true");
                } else {
                    this.F = true;
                    this.L = 0;
                    java.lang.Runnable runnable2 = this.H;
                    if (runnable2 != null) {
                        ((com.tencent.mm.plugin.finder.live.view.v5) runnable2).run();
                    }
                }
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                animate().setDuration(100L).scaleX(1.0f).scaleY(1.0f).start();
                if (weImageView != null && (animate = weImageView.animate()) != null && (duration = animate.setDuration(100L)) != null && (alpha = duration.alpha(1.0f)) != null) {
                    alpha.start();
                }
                this.F = false;
                java.lang.Runnable runnable3 = this.H;
                if (runnable3 != null) {
                    handler.removeCallbacks(runnable3);
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveLikeContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
