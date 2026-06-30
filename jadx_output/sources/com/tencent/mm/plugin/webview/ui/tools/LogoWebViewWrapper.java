package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class LogoWebViewWrapper extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.WebView f183605d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f183606e;

    /* renamed from: f, reason: collision with root package name */
    public int f183607f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f183608g;

    /* renamed from: h, reason: collision with root package name */
    public int f183609h;

    /* renamed from: i, reason: collision with root package name */
    public int f183610i;

    /* renamed from: m, reason: collision with root package name */
    public int f183611m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.r f183612n;

    /* renamed from: o, reason: collision with root package name */
    public int f183613o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f183614p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183615q;

    /* renamed from: r, reason: collision with root package name */
    public int f183616r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.q f183617s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183618t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f183619u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f183620v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f183621w;

    /* renamed from: x, reason: collision with root package name */
    public int f183622x;

    public LogoWebViewWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183608g = false;
        this.f183613o = 0;
        this.f183614p = false;
        this.f183615q = false;
        this.f183616r = 0;
        this.f183618t = false;
        this.f183619u = false;
        this.f183620v = false;
        this.f183621w = false;
        this.f183622x = -1;
        setOrientation(1);
        this.f183607f = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private int getLogoHeight() {
        if (this.f183622x < 0) {
            if (this.f183621w) {
                this.f183622x = getHeight();
            } else {
                this.f183622x = (int) android.util.TypedValue.applyDimension(1, 60, getContext().getResources().getDisplayMetrics());
            }
        }
        return this.f183622x;
    }

    private int getOverScrollDistance() {
        return getHeight();
    }

    private long getScrollBackDuration() {
        long abs = java.lang.Math.abs(getScrollY());
        if (java.lang.Math.abs(abs - java.lang.Math.abs(this.f183616r)) >= abs) {
            return 300L;
        }
        return (((float) r2) / ((float) abs)) * 300.0f;
    }

    public final void a(int i17) {
        int overScrollDistance = getOverScrollDistance();
        scrollTo(0, java.lang.Math.min(overScrollDistance, java.lang.Math.max(-overScrollDistance, i17)));
    }

    public void b(int i17, long j17) {
        com.tencent.mm.plugin.webview.ui.tools.r rVar = this.f183612n;
        if (rVar != null) {
            rVar.f186791h = false;
            rVar.f186794n.removeCallbacks(rVar);
        }
        int scrollY = getScrollY();
        com.tencent.mars.xlog.Log.i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", java.lang.Integer.valueOf(scrollY), java.lang.Integer.valueOf(i17));
        if (scrollY != i17) {
            com.tencent.mm.plugin.webview.ui.tools.r rVar2 = new com.tencent.mm.plugin.webview.ui.tools.r(this, scrollY, i17, j17);
            this.f183612n = rVar2;
            post(rVar2);
        }
    }

    public com.tencent.xweb.WebView getWebView() {
        return this.f183605d;
    }

    public android.widget.FrameLayout getWebViewContainer() {
        if (this.f183606e == null) {
            int childCount = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt = getChildAt(i17);
                if ((childAt instanceof android.widget.FrameLayout) && childAt.getId() == com.tencent.mm.R.id.ipm) {
                    this.f183606e = (android.widget.FrameLayout) childAt;
                    break;
                }
                i17++;
            }
        }
        return this.f183606e;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f183614p && !this.f183618t) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f183608g = false;
            this.f183613o = 0;
            this.f183619u = false;
            return false;
        }
        if (action == 2 && this.f183608g) {
            return true;
        }
        if (action != 0) {
            if (action == 2 && this.f183605d.y()) {
                if (!this.f183619u) {
                    this.f183609h = (int) motionEvent.getY();
                    this.f183610i = (int) motionEvent.getY();
                    this.f183611m = (int) motionEvent.getX();
                    this.f183608g = false;
                    this.f183613o = 0;
                    this.f183618t = true;
                    this.f183619u = true;
                    return false;
                }
                int y17 = (int) motionEvent.getY();
                int x17 = (int) motionEvent.getX();
                int i17 = y17 - this.f183609h;
                int i18 = x17 - this.f183611m;
                if (java.lang.Math.abs(i17) > this.f183607f && java.lang.Math.abs(i17) > java.lang.Math.abs(i18) && i17 > 0) {
                    this.f183609h = y17;
                    this.f183611m = x17;
                    int i19 = this.f183613o;
                    if (i19 == 1) {
                        this.f183608g = true;
                        this.f183619u = false;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
                    } else {
                        this.f183613o = i19 + 1;
                    }
                }
            }
        } else if (this.f183605d.y()) {
            this.f183609h = (int) motionEvent.getY();
            this.f183610i = (int) motionEvent.getY();
            this.f183611m = (int) motionEvent.getX();
            this.f183608g = false;
            this.f183613o = 0;
            this.f183618t = true;
            this.f183619u = true;
        }
        return this.f183608g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r0 != 3) goto L46;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f183614p
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r5.f183618t
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r6.getAction()
            if (r0 != 0) goto L17
            int r0 = r6.getEdgeFlags()
            if (r0 == 0) goto L17
            return r1
        L17:
            int r0 = r6.getAction()
            r2 = 1
            if (r0 == 0) goto Lb0
            if (r0 == r2) goto L91
            r3 = 2
            if (r0 == r3) goto L28
            r6 = 3
            if (r0 == r6) goto L91
            goto Ld2
        L28:
            boolean r0 = r5.f183608g
            if (r0 == 0) goto Ld2
            boolean r0 = r5.f183620v
            if (r0 != 0) goto L48
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f183609h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f183610i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f183611m = r6
            r5.f183620v = r2
            return r2
        L48:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f183609h = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f183611m = r6
            int r6 = r5.f183610i
            int r0 = r5.f183609h
            int r6 = r6 - r0
            int r6 = java.lang.Math.min(r6, r1)
            int r6 = r6 >> r2
            int r0 = r5.getOverScrollDistance()
            int r1 = r5.getLogoHeight()
            int r1 = r1 >> r2
            int r3 = java.lang.Math.abs(r6)
            int r3 = r3 * r1
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            int r1 = (int) r3
            int r1 = r1 << r2
            int r3 = java.lang.Math.abs(r6)
            if (r1 <= r3) goto L83
            int r1 = java.lang.Math.abs(r6)
            if (r1 <= r0) goto L84
            int r6 = -r0
            goto L84
        L83:
            int r6 = -r1
        L84:
            r5.a(r6)
            com.tencent.mm.plugin.webview.ui.tools.q r0 = r5.f183617s
            if (r0 == 0) goto L90
            com.tencent.mm.plugin.webview.ui.tools.s7 r0 = (com.tencent.mm.plugin.webview.ui.tools.s7) r0
            r0.c(r6, r2)
        L90:
            return r2
        L91:
            r5.f183620v = r1
            boolean r6 = r5.f183608g
            if (r6 != 0) goto L9b
            boolean r6 = r5.f183618t
            if (r6 == 0) goto Ld2
        L9b:
            r5.f183608g = r1
            com.tencent.mm.plugin.webview.ui.tools.o r6 = new com.tencent.mm.plugin.webview.ui.tools.o
            r6.<init>(r5)
            r5.post(r6)
            int r6 = r5.f183616r
            int r6 = -r6
            long r0 = r5.getScrollBackDuration()
            r5.b(r6, r0)
            return r2
        Lb0:
            r5.f183618t = r2
            com.tencent.xweb.WebView r0 = r5.f183605d
            boolean r0 = r0.y()
            if (r0 == 0) goto Ld2
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f183609h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f183610i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f183611m = r6
            r5.f183620v = r2
            return r2
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEasyMod(boolean z17) {
        this.f183621w = z17;
    }

    public void setFastScrollBack(boolean z17) {
        this.f183615q = z17;
    }

    public void setMMOverScrollListener(com.tencent.mm.plugin.webview.ui.tools.p pVar) {
    }

    public void setMMOverScrollOffsetListener(com.tencent.mm.plugin.webview.ui.tools.q qVar) {
        this.f183617s = qVar;
    }

    public void setReleaseTargetHeight(int i17) {
        this.f183616r = i17;
    }

    public LogoWebViewWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f183608g = false;
        this.f183613o = 0;
        this.f183614p = false;
        this.f183615q = false;
        this.f183616r = 0;
        this.f183618t = false;
        this.f183619u = false;
        this.f183620v = false;
        this.f183621w = false;
        this.f183622x = -1;
        setOrientation(1);
        this.f183607f = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
