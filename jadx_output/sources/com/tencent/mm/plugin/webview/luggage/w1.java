package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class w1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f182643d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f182644e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f182645f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f182646g;

    /* renamed from: h, reason: collision with root package name */
    public final int f182647h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f182648i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f182649m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f182650n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182651o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f182652p;

    /* renamed from: q, reason: collision with root package name */
    public int f182653q;

    /* renamed from: r, reason: collision with root package name */
    public int f182654r;

    /* renamed from: s, reason: collision with root package name */
    public int f182655s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f182656t;

    public w1(android.content.Context context) {
        super(context);
        this.f182648i = true;
        this.f182649m = false;
        this.f182650n = false;
        this.f182651o = false;
        this.f182652p = false;
        this.f182656t = null;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f182647h = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean a() {
        this.f182645f.getScrollY();
        this.f182645f.getTop();
        android.view.View view = this.f182645f;
        return view instanceof com.tencent.xweb.WebView ? ((com.tencent.xweb.WebView) view).getWebScrollY() == 0 : view instanceof androidx.recyclerview.widget.RecyclerView ? ((androidx.recyclerview.widget.LinearLayoutManager) ((androidx.recyclerview.widget.RecyclerView) view).getLayoutManager()).w() == 0 && this.f182645f.getScrollY() == 0 : view.getScrollY() == 0;
    }

    public void b() {
        c(0);
        this.f182651o = false;
        this.f182650n = false;
        this.f182652p = false;
    }

    public final void c(int i17) {
        int translationY = (int) this.f182646g.getTranslationY();
        if (translationY == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", java.lang.Integer.valueOf(translationY), java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f182656t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        long abs = (java.lang.Math.abs(translationY - i17) / getStayHeight()) * 250.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f182646g, "translationY", translationY, i17);
        ofFloat.setDuration(java.lang.Math.min(abs, 250L));
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.webview.luggage.v1(this));
        this.f182656t = ofFloat;
    }

    public void d(int i17) {
    }

    public void e() {
    }

    public void f(android.view.View view, android.view.View view2) {
        removeAllViews();
        this.f182643d = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f182644e = frameLayout;
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f182644e.addView(view);
        this.f182645f = view2;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        this.f182646g = frameLayout2;
        frameLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f182646g.addView(view2);
        addView(this.f182644e);
        addView(this.f182646g);
    }

    public int getMaxOverScrollDistance() {
        return getHeight();
    }

    public int getOpenHeight() {
        return this.f182643d.getHeight();
    }

    public int getStayHeight() {
        return this.f182643d.getHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f182648i) {
            return this.f182652p;
        }
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            if (this.f182651o) {
                return true;
            }
            if (action != 0) {
                if (action == 2 && a()) {
                    int x17 = (int) motionEvent.getX();
                    int y17 = (int) motionEvent.getY();
                    int i17 = x17 - this.f182653q;
                    int i18 = y17 - this.f182654r;
                    if (java.lang.Math.abs(i18) > this.f182647h && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && i18 > 0) {
                        this.f182651o = true;
                        return true;
                    }
                }
            } else if (a()) {
                this.f182653q = (int) motionEvent.getX();
                this.f182654r = (int) motionEvent.getY();
                this.f182655s = (int) motionEvent.getY();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f182648i) {
            if (this.f182652p) {
                b();
            }
            return this.f182652p;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f182655s = (int) motionEvent.getY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                int y17 = (((int) motionEvent.getY()) - this.f182655s) >> 1;
                int maxOverScrollDistance = getMaxOverScrollDistance();
                if (y17 > maxOverScrollDistance) {
                    y17 = maxOverScrollDistance;
                }
                if (this.f182650n) {
                    y17 += getStayHeight();
                }
                int max = java.lang.Math.max(y17, 0);
                this.f182646g.setTranslationY(java.lang.Math.min(getMaxOverScrollDistance(), max));
                d(max);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.f182646g.getTranslationY() <= getOpenHeight() || !this.f182649m) {
            b();
        } else {
            c(getStayHeight());
            if (!this.f182650n) {
                e();
            }
            this.f182651o = true;
            this.f182650n = true;
            this.f182652p = true;
        }
        return true;
    }

    public void setNeedStay(boolean z17) {
        this.f182649m = z17;
    }

    public void setPullDownBackgroundColor(int i17) {
        this.f182644e.setBackgroundColor(i17);
    }

    public void setPullDownEnabled(boolean z17) {
        this.f182648i = !z17;
    }
}
