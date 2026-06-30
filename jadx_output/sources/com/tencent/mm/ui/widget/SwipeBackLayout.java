package com.tencent.mm.ui.widget;

/* loaded from: classes15.dex */
public class SwipeBackLayout extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f211425J = 0;
    public al5.e3 A;
    public al5.h3 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public al5.f3 I;

    /* renamed from: d, reason: collision with root package name */
    public final float f211426d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f211427e;

    /* renamed from: f, reason: collision with root package name */
    public int f211428f;

    /* renamed from: g, reason: collision with root package name */
    public int f211429g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f211430h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f211431i;

    /* renamed from: m, reason: collision with root package name */
    public ii5.c f211432m;

    /* renamed from: n, reason: collision with root package name */
    public float f211433n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f211434o;

    /* renamed from: p, reason: collision with root package name */
    public float f211435p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f211436q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f211437r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f211438s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f211439t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f211440u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f211441v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f211442w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f211443x;

    /* renamed from: y, reason: collision with root package name */
    public al5.g3 f211444y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.drawable.Drawable f211445z;

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        if (!this.f211441v) {
            return false;
        }
        if (java.lang.Float.compare(this.f211431i.getLeft(), 1.0E-5f) > 0) {
            return true;
        }
        this.f211441v = false;
        return false;
    }

    public boolean b(android.view.MotionEvent motionEvent) {
        try {
            ii5.c cVar = this.f211432m;
            if (cVar.f291630a == 1) {
                cVar.l(motionEvent);
                return true;
            }
            boolean r17 = cVar.r(motionEvent);
            com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "handleTouchEvent intercept=" + r17);
            return r17;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public void c() {
        ii5.c cVar = new ii5.c(getContext(), this, new al5.n3(this, null), android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.tencent.mm.R.anim.f477822cg));
        this.f211432m = cVar;
        cVar.f291648s = 1;
        float f17 = getResources().getDisplayMetrics().density;
        ii5.c cVar2 = this.f211432m;
        cVar2.f291644o = 100.0f * f17;
        cVar2.f291643n = f17 * 300.0f;
        this.f211428f = 0;
        this.f211429g = 0;
        java.util.LinkedList linkedList = al5.a3.f5864a;
        this.C = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSwipeBackLikeIOSAnim()) == 1;
        this.D = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigSwipeBackShadowOpt()) == 1;
        this.E = j62.e.g().i("clicfg_chatting_ui_swipe_back_finish_protect", 1, true, true) == 1;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f211435p = java.lang.Math.max(0.0f, 1.0f - this.f211433n);
        ii5.c cVar = this.f211432m;
        if (cVar.f291630a == 2) {
            androidx.core.widget.s sVar = cVar.f291649t;
            boolean computeScrollOffset = sVar.f11104a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f11104a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - cVar.f291651v.getLeft();
            int top = b17 - cVar.f291651v.getTop();
            if (left != 0) {
                cVar.f291651v.offsetLeftAndRight(left);
            }
            if (top != 0) {
                cVar.f291651v.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.k(cVar.f291651v, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                cVar.f291653x.post(cVar.f291655z);
            }
        }
        if (cVar.f291630a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", java.lang.Boolean.valueOf(z17));
        this.f211439t = z17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(final android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        int i17 = this.f211432m.f291630a;
        if (!this.f211430h) {
            if (this.f211432m.f291630a == 1 && motionEvent.getAction() == 3) {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: al5.b3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.view.MotionEvent motionEvent2 = motionEvent;
                        int i18 = com.tencent.mm.ui.widget.SwipeBackLayout.f211425J;
                        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = com.tencent.mm.ui.widget.SwipeBackLayout.this;
                        swipeBackLayout.getClass();
                        try {
                            swipeBackLayout.f211432m.l(motionEvent2);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwipeBackLayout", th6, "", new java.lang.Object[0]);
                        }
                    }
                });
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        al5.g3 g3Var = this.f211444y;
        if (g3Var != null && g3Var.enableSwipeBack()) {
            if (!this.f211444y.d0()) {
                this.f211444y.a(motionEvent);
            } else {
                if (this.f211444y.e() == 1) {
                    this.f211444y.a(motionEvent);
                    return true;
                }
                if (this.f211444y.d(motionEvent)) {
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            this.G = false;
        }
        if (!this.G && !a()) {
            if (this.F && this.E) {
                return super.dispatchTouchEvent(motionEvent);
            }
            try {
                ii5.c cVar = this.f211432m;
                if (cVar.f291630a == 1) {
                    cVar.l(motionEvent);
                    return true;
                }
                if (!cVar.r(motionEvent)) {
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("changelcai", "shouldInterceptTouchEvent %s", motionEvent);
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e17, "got an ArrayIndexOutOfBoundsException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.IllegalArgumentException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e18, "got an IllegalArgumentException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.IllegalStateException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e19, "got an IllegalStateException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.NullPointerException e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SwipeBackLayout", e27, "got an NullPointerException", new java.lang.Object[0]);
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = java.lang.Float.compare(this.f211435p, 0.0f) > 0 && (view == this.f211431i) && this.f211432m.f291630a != 0;
        if (this.f211432m.f291654y && z17) {
            canvas.drawColor(((int) (this.f211435p * 153.0f)) << 24);
        }
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (!this.f211432m.f291654y && z17) {
            android.graphics.Rect rect = this.f211436q;
            view.getHitRect(rect);
            int i17 = rect.left;
            android.graphics.drawable.Drawable drawable = this.f211434o;
            drawable.setBounds(i17 - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            drawable.setAlpha((int) (this.f211435p * 255.0f));
            drawable.draw(canvas);
        }
        return drawChild;
    }

    public final void e(float f17) {
        if (this.f211432m.f291654y) {
            return;
        }
        al5.a3.b(f17);
    }

    public al5.g3 getSwipeBackListener() {
        return this.f211444y;
    }

    public android.view.View getTargetContentView() {
        return this.f211431i;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f211431i = this;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f211427e = true;
        if (this.f211443x != null) {
            super.onLayout(z17, i17, i18, i19, i27);
        }
        android.view.View view = this.f211431i;
        if (view != null) {
            int i28 = this.f211428f;
            view.layout(i28, this.f211429g, view.getMeasuredWidth() + i28, this.f211429g + this.f211431i.getMeasuredHeight());
        }
        this.f211427e = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f211427e) {
            return;
        }
        super.requestLayout();
    }

    public void setAutoResetToNoTranslucent(boolean z17) {
        this.D = z17;
    }

    public void setContentView(android.view.View view) {
        this.f211431i = view;
    }

    public void setDragListener(al5.e3 e3Var) {
        this.A = e3Var;
    }

    public void setEdgeSize(int i17) {
        this.f211432m.f291645p = i17;
    }

    public void setEdgeSizeAndInitEdgeTouched(int i17) {
        float[] fArr;
        float[] fArr2;
        ii5.c cVar = this.f211432m;
        cVar.f291645p = i17;
        int[] iArr = cVar.f291638i;
        if (iArr == null || (fArr = cVar.f291633d) == null || (fArr2 = cVar.f291634e) == null) {
            return;
        }
        int i18 = cVar.f291637h;
        if ((iArr[i18] & cVar.f291648s) == 0) {
            iArr[i18] = cVar.j((int) fArr[i18], (int) fArr2[i18]);
        }
    }

    public void setEnableGesture(boolean z17) {
        this.f211430h = z17;
    }

    public void setFloatView(android.view.View view) {
        this.f211443x = view;
    }

    public void setLikeIOSAnim(boolean z17) {
        this.C = z17;
    }

    public void setNeedChangeWindowBackground(boolean z17) {
        this.H = z17;
    }

    public void setNeedRequestActivityTranslucent(boolean z17) {
        this.f211437r = z17;
        if (z17) {
            this.f211438s = false;
        }
    }

    public void setOnceDisEnableGesture(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", java.lang.Boolean.valueOf(z17));
        this.G = z17;
    }

    public void setSwipeBackListener(al5.g3 g3Var) {
        this.f211444y = g3Var;
    }

    public void setSwipeGestureDelegate(al5.f3 f3Var) {
        this.I = f3Var;
    }

    public void setTryCaptureViewInterceptor(al5.h3 h3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "[setTryCaptureViewInterceptor] interceptor=%s", h3Var);
        this.B = h3Var;
    }

    public void setVerticalSwipe(boolean z17) {
        this.f211432m.f291654y = z17;
    }

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f211426d = 0.3f;
        this.f211430h = true;
        this.f211436q = new android.graphics.Rect();
        this.f211437r = true;
        this.f211438s = false;
        this.f211439t = false;
        this.f211440u = false;
        this.f211441v = false;
        this.f211442w = false;
        this.f211443x = null;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.H = true;
        this.I = null;
        this.f211434o = getResources().getDrawable(com.tencent.mm.R.drawable.brk);
        setFocusable(true);
        setDescendantFocusability(262144);
        c();
    }
}
