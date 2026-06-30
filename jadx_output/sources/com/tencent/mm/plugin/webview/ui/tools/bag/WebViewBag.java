package com.tencent.mm.plugin.webview.ui.tools.bag;

/* loaded from: classes8.dex */
public class WebViewBag extends android.widget.FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int f183967v = ((i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) - gx4.e.f277411b) - gx4.e.f277413d) - gx4.e.f277414e;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f183968d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f183969e;

    /* renamed from: f, reason: collision with root package name */
    public gx4.k f183970f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f183971g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView f183972h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f183973i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f183974m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PointF f183975n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Point f183976o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Point f183977p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Point f183978q;

    /* renamed from: r, reason: collision with root package name */
    public long f183979r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Point f183980s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183981t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f183982u;

    public WebViewBag(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183975n = new android.graphics.PointF();
        this.f183976o = new android.graphics.Point();
        this.f183977p = new android.graphics.Point();
        this.f183978q = new android.graphics.Point();
        this.f183982u = new gx4.j(this);
        this.f183968d = (android.view.WindowManager) context.getSystemService("window");
        this.f183974m = new com.tencent.mm.sdk.platformtools.n3();
        this.f183980s = new android.graphics.Point(i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a), i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d9r, this);
        this.f183971g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView webViewBagBgView = (com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView) findViewById(com.tencent.mm.R.id.agc);
        this.f183972h = webViewBagBgView;
        this.f183973i = findViewById(com.tencent.mm.R.id.m7g);
        webViewBagBgView.setStartColor(context.getResources().getColor(com.tencent.mm.R.color.aag));
        webViewBagBgView.setAngryColor(context.getResources().getColor(com.tencent.mm.R.color.aaf));
    }

    public void b(int i17, int i18, long j17) {
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView webViewBagBgView = this.f183972h;
        webViewBagBgView.f183993q = false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagBgView", "setAngryInfo:%d now:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
        webViewBagBgView.f183987h = i17;
        webViewBagBgView.f183986g = i18;
        webViewBagBgView.f183988i = j17;
        webViewBagBgView.a(currentTimeMillis);
        if (j17 > currentTimeMillis) {
            webViewBagBgView.postDelayed(new gx4.l(webViewBagBgView), j17 - currentTimeMillis);
        } else {
            webViewBagBgView.f183993q = true;
        }
        webViewBagBgView.invalidate();
    }

    public final void c(int i17, int i18) {
        android.view.WindowManager windowManager = this.f183968d;
        if (windowManager != null) {
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            layoutParams.x = i17;
            layoutParams.y = i18;
            try {
                windowManager.updateViewLayout(this, layoutParams);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewBag", th6, "", new java.lang.Object[0]);
            }
        }
    }

    public void d() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100L);
        animationSet.restrictDuration(150L);
        animationSet.setFillAfter(true);
        this.f183973i.startAnimation(animationSet);
    }

    public android.graphics.Point getLastTouchDownViewPos() {
        return this.f183976o;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBag", "onConfigurationChanged orientation:%d", java.lang.Integer.valueOf(configuration.orientation));
        android.graphics.Point point = this.f183980s;
        point.x = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        point.y = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        gx4.d dVar;
        boolean z17;
        float rawX;
        float rawY;
        float f17;
        if (!this.f183981t) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        android.graphics.Point point = this.f183976o;
        android.graphics.PointF pointF = this.f183975n;
        if (action != 0) {
            android.graphics.Point point2 = this.f183980s;
            if (action != 1) {
                if (action == 2) {
                    c((int) java.lang.Math.max(java.lang.Math.min((point.x + motionEvent.getRawX()) - pointF.x, point2.x), 0.0f), (int) java.lang.Math.max(java.lang.Math.min((point.y + motionEvent.getRawY()) - pointF.y, point2.y), 0.0f));
                }
            } else if (java.lang.Math.abs(motionEvent.getRawX() - pointF.x) >= com.tencent.mm.sdk.platformtools.j.d(getContext(), 3.0f) || java.lang.Math.abs(motionEvent.getRawY() - pointF.y) >= com.tencent.mm.sdk.platformtools.j.d(getContext(), 3.0f)) {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                android.graphics.Point point3 = this.f183977p;
                point3.x = (int) java.lang.Math.max(java.lang.Math.min((point.x + rawX2) - pointF.x, point2.x), 0.0f);
                point3.y = (int) java.lang.Math.max(java.lang.Math.min((point.y + rawY2) - pointF.y, point2.y), 0.0f);
                int width = point3.x + (getWidth() / 2);
                int i17 = point2.x;
                int i18 = i17 / 2;
                android.graphics.Point point4 = this.f183978q;
                if (width <= i18) {
                    point4.x = gx4.e.f277414e;
                } else {
                    point4.x = (i17 - getWidth()) - gx4.e.f277414e;
                }
                int i19 = point3.y;
                point4.y = i19;
                if (i19 == 0) {
                    point4.y = gx4.e.f277414e;
                } else {
                    int i27 = f183967v;
                    if (i19 > i27) {
                        point4.y = i27;
                    }
                }
                this.f183979r = java.lang.System.currentTimeMillis();
                this.f183974m.postDelayed(this.f183982u, 5L);
                gx4.k kVar = this.f183970f;
                if (kVar != null) {
                    int i28 = point4.x;
                    int i29 = point4.y;
                    gx4.t tVar = ((gx4.q) kVar).f277431a;
                    tVar.k(19);
                    gx4.s sVar = tVar.f277447h;
                    sVar.f277437e = i28;
                    sVar.f277436d = i29;
                    sVar.a();
                }
            } else {
                android.view.View.OnClickListener onClickListener = this.f183969e;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        } else {
            pointF.x = motionEvent.getRawX();
            pointF.y = motionEvent.getRawY();
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            point.x = layoutParams.x;
            point.y = layoutParams.y;
        }
        gx4.k kVar2 = this.f183970f;
        if (kVar2 != null && (dVar = ((gx4.q) kVar2).f277431a.f277444e) != null) {
            float rawX3 = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            int action2 = motionEvent.getAction();
            android.graphics.PointF pointF2 = dVar.f277404d;
            if (action2 == 0) {
                pointF2.x = rawX3;
                pointF2.y = rawY3;
                dVar.f277403c = false;
                dVar.f277405e = false;
            } else if (action2 == 1) {
                if (dVar.f277405e) {
                    gx4.t tVar2 = ((gx4.p) dVar.f277402b).f277430a;
                    tVar2.k(17);
                    com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = tVar2.f277443d;
                    android.graphics.Point lastTouchDownViewPos = webViewBag != null ? webViewBag.getLastTouchDownViewPos() : null;
                    tVar2.j();
                    if (lastTouchDownViewPos != null) {
                        int i37 = lastTouchDownViewPos.x;
                        gx4.s sVar2 = tVar2.f277447h;
                        sVar2.f277437e = i37;
                        sVar2.f277436d = lastTouchDownViewPos.y;
                        sVar2.a();
                    }
                } else if (dVar.f277406f) {
                    dVar.f277406f = false;
                    gx4.b bVar = dVar.f277401a;
                    bVar.getClass();
                    float f18 = gx4.e.f277416g;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, f18, 0.0f, f18);
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                    android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.setDuration(300L);
                    animationSet.setAnimationListener(new gx4.a(bVar));
                    bVar.f277397d.startAnimation(animationSet);
                    bVar.f277398e.startAnimation(animationSet);
                }
                dVar.f277403c = false;
                dVar.f277405e = false;
            } else if (action2 == 2) {
                if (dVar.f277403c) {
                    z17 = true;
                } else {
                    float f19 = rawX3 - pointF2.x;
                    float f27 = rawY3 - pointF2.y;
                    z17 = ((f19 * f19) + (f27 * f27)) - 900.0f > 0.0f;
                    dVar.f277403c = z17;
                }
                if (z17) {
                    if (!dVar.f277406f) {
                        int c17 = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BagIndicatorController", "getNavigationBarHeight height:%d", java.lang.Integer.valueOf(c17));
                        gx4.e.f277410a = c17;
                        dVar.f277406f = true;
                        dVar.f277408h = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        dVar.f277407g = k17;
                        boolean z18 = dVar.f277408h > k17;
                        dVar.f277409i = z18;
                        com.tencent.mars.xlog.Log.i("MicroMsg.BagCancelController", "updateOrientation mIsLandScape:%b", java.lang.Boolean.valueOf(z18));
                        gx4.b bVar2 = dVar.f277401a;
                        bVar2.setVisibility(0);
                        float f28 = gx4.e.f277416g;
                        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(f28, 0.0f, f28, 0.0f);
                        translateAnimation2.setFillAfter(true);
                        translateAnimation2.setDuration(200L);
                        bVar2.f277397d.startAnimation(translateAnimation2);
                        bVar2.f277398e.startAnimation(translateAnimation2);
                    }
                    boolean z19 = dVar.f277405e;
                    if (dVar.f277409i) {
                        rawX = (dVar.f277408h - motionEvent.getRawX()) - gx4.e.f277410a;
                        rawY = dVar.f277407g;
                        f17 = motionEvent.getRawY();
                    } else {
                        rawX = dVar.f277408h - motionEvent.getRawX();
                        rawY = dVar.f277407g - motionEvent.getRawY();
                        f17 = gx4.e.f277410a;
                    }
                    float f29 = rawY - f17;
                    if ((rawX * rawX) + (f29 * f29) < gx4.d.f277400j) {
                        dVar.f277405e = true;
                    } else {
                        dVar.f277405e = false;
                    }
                    boolean z27 = dVar.f277405e;
                    if (z27 != z19) {
                        gx4.b bVar3 = dVar.f277401a;
                        bVar3.getClass();
                        if (z27) {
                            bVar3.a(1.0f, gx4.e.f277417h);
                            android.os.Vibrator vibrator = bVar3.f277399f;
                            if (vibrator != null) {
                                vibrator.vibrate(10L);
                            }
                        } else {
                            bVar3.a(gx4.e.f277417h, 1.0f);
                        }
                    }
                }
            }
        }
        return true;
    }

    public void setIcon(java.lang.String str) {
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342078b = true;
        fVar.f342083g = g83.a.a();
        fVar.f342091o = com.tencent.mm.R.raw.webview_bag_default_icon;
        n11.a.b().h(str, this.f183971g, fVar.a());
    }

    public void setListener(gx4.k kVar) {
        this.f183970f = kVar;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f183969e = onClickListener;
    }

    public void setTouchEnable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBag", "setTouchEnable enable:%b", java.lang.Boolean.valueOf(z17));
        this.f183981t = z17;
    }
}
