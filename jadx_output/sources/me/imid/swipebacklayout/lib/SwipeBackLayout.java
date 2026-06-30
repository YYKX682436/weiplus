package me.imid.swipebacklayout.lib;

/* loaded from: classes15.dex */
public class SwipeBackLayout extends android.widget.FrameLayout {
    public static final int[] F = {1, 2, 8, 11};
    public final com.tencent.mm.sdk.platformtools.n3 A;
    public java.lang.Runnable B;
    public float C;
    public float D;
    public android.view.MotionEvent E;

    /* renamed from: d, reason: collision with root package name */
    public int f325885d;

    /* renamed from: e, reason: collision with root package name */
    public float f325886e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f325887f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f325888g;

    /* renamed from: h, reason: collision with root package name */
    public final z26.l f325889h;

    /* renamed from: i, reason: collision with root package name */
    public float f325890i;

    /* renamed from: m, reason: collision with root package name */
    public int f325891m;

    /* renamed from: n, reason: collision with root package name */
    public int f325892n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f325893o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f325894p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f325895q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f325896r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f325897s;

    /* renamed from: t, reason: collision with root package name */
    public float f325898t;

    /* renamed from: u, reason: collision with root package name */
    public int f325899u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f325900v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f325901w;

    /* renamed from: x, reason: collision with root package name */
    public int f325902x;

    /* renamed from: y, reason: collision with root package name */
    public int f325903y;

    /* renamed from: z, reason: collision with root package name */
    public long f325904z;

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478056g);
    }

    public static void b(me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout) {
        android.view.View view = swipeBackLayout.f325888g;
        if (view == null) {
            return;
        }
        z26.a aVar = new z26.a(swipeBackLayout);
        int i17 = swipeBackLayout.f325903y;
        if (i17 == 0) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), swipeBackLayout.C);
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofFloat.addListener(aVar);
            ofFloat.addUpdateListener(new z26.b(swipeBackLayout));
            ofFloat.start();
            swipeBackLayout.f325888g.setTranslationY(swipeBackLayout.D);
            return;
        }
        if (i17 != 1) {
            view.setTranslationX(swipeBackLayout.C);
            swipeBackLayout.f325888g.setTranslationY(swipeBackLayout.D);
            swipeBackLayout.invalidate();
            return;
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), swipeBackLayout.D);
        ofFloat2.setDuration(150L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat2.addListener(aVar);
        ofFloat2.addUpdateListener(new z26.c(swipeBackLayout));
        ofFloat2.start();
        swipeBackLayout.f325888g.setTranslationX(swipeBackLayout.C);
    }

    public void c(z26.e eVar) {
        if (this.f325893o == null) {
            this.f325893o = new java.util.concurrent.CopyOnWriteArrayList();
        }
        this.f325893o.add(eVar);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f325898t = 1.0f - this.f325890i;
        z26.l lVar = this.f325889h;
        if (lVar.f469835a == 2) {
            androidx.core.widget.s sVar = lVar.f469851q;
            boolean computeScrollOffset = sVar.f11104a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f11104a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - lVar.f469853s.getLeft();
            int top = b17 - lVar.f469853s.getTop();
            if (left != 0) {
                lVar.f469853s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                lVar.f469853s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                lVar.f469852r.a(lVar.f469853s, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                lVar.f469855u.post(lVar.f469856v);
            }
        }
        if (lVar.f469835a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f325887f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f325893o;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = this.f325893o.iterator();
            while (it.hasNext()) {
                ((z26.e) it.next()).a(motionEvent);
            }
        }
        z26.l lVar = this.f325889h;
        if (lVar.f469835a == 1) {
            if (this.E != null) {
                this.E = null;
            }
            lVar.j(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.E = android.view.MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.E = null;
        }
        try {
            if (!lVar.p(motionEvent)) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = view == this.f325888g;
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (this.f325898t > 0.0f && z17 && this.f325889h.f469835a != 0) {
            android.graphics.Rect rect = this.f325901w;
            view.getHitRect(rect);
            if ((this.f325885d & 1) != 0) {
                if (this.f325903y == 1) {
                    android.graphics.drawable.Drawable drawable = this.f325894p;
                    drawable.setBounds(rect.left, rect.top - drawable.getIntrinsicWidth(), rect.right, rect.top);
                    this.f325894p.setAlpha((int) (this.f325898t * 255.0f));
                    this.f325894p.draw(canvas);
                } else {
                    android.graphics.drawable.Drawable drawable2 = this.f325895q;
                    drawable2.setBounds(rect.left - drawable2.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
                    this.f325895q.setAlpha((int) (this.f325898t * 255.0f));
                    this.f325895q.draw(canvas);
                }
            }
            if ((this.f325885d & 2) != 0) {
                if (this.f325903y == 1) {
                    throw new java.lang.RuntimeException("Stub!");
                }
                android.graphics.drawable.Drawable drawable3 = this.f325896r;
                int i17 = rect.right;
                drawable3.setBounds(i17, rect.top, drawable3.getIntrinsicWidth() + i17, rect.bottom);
                this.f325896r.setAlpha((int) (this.f325898t * 255.0f));
                this.f325896r.draw(canvas);
            }
            if ((this.f325885d & 8) != 0) {
                if (this.f325903y == 1) {
                    throw new java.lang.RuntimeException("Stub!");
                }
                android.graphics.drawable.Drawable drawable4 = this.f325897s;
                int i18 = rect.left;
                int i19 = rect.bottom;
                drawable4.setBounds(i18, i19, rect.right, drawable4.getIntrinsicHeight() + i19);
                this.f325897s.setAlpha((int) (this.f325898t * 255.0f));
                this.f325897s.draw(canvas);
            }
            int i27 = (this.f325899u & 16777215) | (((int) ((((-16777216) & r13) >>> 24) * this.f325898t)) << 24);
            int i28 = this.f325902x;
            if ((i28 & 1) != 0) {
                canvas.clipRect(0, 0, view.getLeft(), getHeight());
            } else if ((i28 & 2) != 0) {
                canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
            } else if ((i28 & 8) != 0) {
                canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
            }
            canvas.drawColor(i27);
        }
        return drawChild;
    }

    public void e() {
        this.f325890i = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.f325904z = 0L;
        h();
        android.view.View view = this.f325888g;
        if (view != null) {
            view.setTranslationX(0.0f);
            this.f325888g.setTranslationY(0.0f);
        }
        z26.l lVar = this.f325889h;
        lVar.a();
        lVar.o(0);
        if (this.f325891m == 0 && this.f325892n == 0) {
            return;
        }
        this.f325892n = 0;
        this.f325891m = 0;
        requestLayout();
    }

    public void f(int i17, int i18) {
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
        if ((i18 & 1) != 0) {
            this.f325895q = drawable;
        } else if ((i18 & 4) != 0) {
            this.f325894p = drawable;
        } else if ((i18 & 2) != 0) {
            this.f325896r = drawable;
        } else if ((i18 & 8) != 0) {
            this.f325897s = drawable;
        }
        invalidate();
    }

    public int getEdgeSize() {
        return this.f325889h.f469849o;
    }

    public boolean getEnableGesture() {
        return this.f325887f;
    }

    public android.view.View getTargetView() {
        return this.f325888g;
    }

    public final void h() {
        java.lang.Runnable runnable = this.B;
        if (runnable != null) {
            this.A.removeCallbacks(runnable);
            this.B = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f325900v = true;
        android.view.View view = this.f325888g;
        if (view != null) {
            int i28 = this.f325891m;
            view.layout(i28, this.f325892n, view.getMeasuredWidth() + i28, this.f325892n + this.f325888g.getMeasuredHeight());
        }
        this.f325900v = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f325887f) {
            return false;
        }
        this.f325889h.j(motionEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f325900v) {
            return;
        }
        super.requestLayout();
    }

    public void setContentView(android.view.View view) {
        this.f325888g = view;
    }

    public void setEdgeSize(int i17) {
        this.f325889h.f469849o = i17;
    }

    public void setEdgeTrackingEnabled(int i17) {
        this.f325885d = i17;
        this.f325889h.f469850p = i17;
    }

    public void setEnableGesture(boolean z17) {
        this.f325887f = z17;
    }

    public void setMaxVelocity(float f17) {
        this.f325889h.f469847m = f17;
    }

    public void setMinVelocity(float f17) {
        this.f325889h.f469848n = f17;
    }

    public void setOrientation(int i17) {
        this.f325903y = i17;
    }

    public void setScrimColor(int i17) {
        this.f325899u = i17;
        invalidate();
    }

    public void setScrollThresHold(float f17) {
        if (f17 >= 1.0f || f17 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f325886e = f17;
    }

    @java.lang.Deprecated
    public void setSwipeListener(z26.e eVar) {
        c(eVar);
    }

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f325886e = 0.3f;
        this.f325887f = true;
        this.f325899u = -1728053248;
        this.f325901w = new android.graphics.Rect();
        this.f325903y = 0;
        this.A = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        z26.l lVar = new z26.l(getContext(), this, new z26.g(this, null));
        this.f325889h = lVar;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.appbrand.widget.l0.f91753b, i17, com.tencent.mm.R.style.f494551px);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize > 0) {
            setEdgeSize(dimensionPixelSize);
        }
        setEdgeTrackingEnabled(F[obtainStyledAttributes.getInt(0, 0)]);
        int resourceId = obtainStyledAttributes.getResourceId(3, com.tencent.mm.R.drawable.brk);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, com.tencent.mm.R.drawable.dab);
        int resourceId3 = obtainStyledAttributes.getResourceId(4, com.tencent.mm.R.drawable.brl);
        int resourceId4 = obtainStyledAttributes.getResourceId(2, com.tencent.mm.R.drawable.brj);
        f(resourceId, 1);
        f(resourceId2, 4);
        f(resourceId3, 2);
        f(resourceId4, 8);
        obtainStyledAttributes.recycle();
        float f17 = getResources().getDisplayMetrics().density * 400.0f;
        lVar.f469848n = f17;
        lVar.f469847m = f17 * 2.0f;
    }
}
