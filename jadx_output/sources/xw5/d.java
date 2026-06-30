package xw5;

/* loaded from: classes8.dex */
public final class d implements vw5.b {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f457746a;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f457748c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f457749d;

    /* renamed from: e, reason: collision with root package name */
    public android.webkit.WebView f457750e;

    /* renamed from: f, reason: collision with root package name */
    public xw5.b f457751f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457753h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f457754i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f457755j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f457756k;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f457747b = jz5.h.b(new yz5.a() { // from class: xw5.d$$a
        @Override // yz5.a
        public final java.lang.Object invoke() {
            xw5.d this$0 = xw5.d.this;
            kotlin.jvm.internal.o.g(this$0, "this$0");
            if (this$0.f457746a != null) {
                return java.lang.Float.valueOf(r0.getResources().getDisplayMetrics().heightPixels);
            }
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f457752g = new java.util.ArrayList();

    public final boolean a() {
        android.widget.FrameLayout frameLayout = this.f457749d;
        if (frameLayout == null) {
            yz5.a aVar = this.f457748c;
            frameLayout = aVar != null ? (android.widget.FrameLayout) aVar.invoke() : null;
        }
        if (frameLayout == null) {
            return false;
        }
        this.f457749d = frameLayout;
        this.f457746a = frameLayout.getContext();
        frameLayout.setClipChildren(false);
        if (this.f457750e == null) {
            android.content.Context context = this.f457746a;
            if (context == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setTranslationY(100000.0f);
            webView.setVisibility(8);
            webView.setWebViewClient(new xw5.f(this));
            webView.loadUrl("wemagic://WAGameVConsole.html");
            this.f457750e = webView;
            android.content.Context context2 = this.f457746a;
            if (context2 == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            xw5.b bVar = new xw5.b(context2, -16776961);
            bVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: xw5.d$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    final xw5.d dVar = xw5.d.this;
                    dVar.f457756k = !dVar.f457756k;
                    java.lang.String format = "onClick: isShow?" + dVar.f457756k;
                    kotlin.jvm.internal.o.g(format, "format");
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                    if (!(copyOf.length == 0)) {
                        format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                    }
                    kotlin.jvm.internal.o.d(format);
                    final android.webkit.WebView webView2 = dVar.f457750e;
                    kotlin.jvm.internal.o.d(webView2);
                    if (!dVar.f457756k) {
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new xw5.e(webView2, dVar));
                        ofFloat.start();
                        return;
                    }
                    if (!dVar.f457755j) {
                        dVar.f457755j = true;
                        com.tencent.wemagic.common.MBInitializer.f220064a.b(new xw5.d$$e(dVar));
                    }
                    webView2.setVisibility(0);
                    webView2.setTranslationY(((java.lang.Number) ((jz5.n) dVar.f457747b).getValue()).floatValue());
                    android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: xw5.d$$f
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
                            android.webkit.WebView webView3 = webView2;
                            kotlin.jvm.internal.o.g(webView3, "$webView");
                            xw5.d this$0 = dVar;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            kotlin.jvm.internal.o.g(animation, "animation");
                            java.lang.Object animatedValue = animation.getAnimatedValue();
                            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            webView3.setTranslationY(((java.lang.Float) animatedValue).floatValue() * ((java.lang.Number) ((jz5.n) this$0.f457747b).getValue()).floatValue());
                            webView3.requestLayout();
                        }
                    });
                    ofFloat2.start();
                }
            });
            this.f457751f = bVar;
        }
        android.content.Context context3 = this.f457746a;
        if (context3 == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        float f17 = context3.getResources().getDisplayMetrics().density;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.webkit.WebView webView2 = this.f457750e;
        if ((webView2 != null ? webView2.getParent() : null) != null) {
            android.webkit.WebView webView3 = this.f457750e;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (webView3 != null ? webView3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f457750e);
            }
        }
        frameLayout.addView(this.f457750e, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.bottomMargin = (int) (85 * f17);
        layoutParams2.rightMargin = (int) (15 * f17);
        xw5.b bVar2 = this.f457751f;
        if ((bVar2 != null ? bVar2.getParent() : null) != null) {
            xw5.b bVar3 = this.f457751f;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (bVar3 != null ? bVar3.getParent() : null);
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f457751f);
            }
        }
        frameLayout.addView(this.f457751f, layoutParams2);
        return true;
    }

    public void b() {
        android.widget.FrameLayout frameLayout;
        android.webkit.WebView webView = this.f457750e;
        if (webView != null) {
            android.widget.FrameLayout frameLayout2 = this.f457749d;
            if (frameLayout2 != null) {
                frameLayout2.removeView(webView);
            }
            webView.destroy();
        }
        xw5.b bVar = this.f457751f;
        if (bVar != null && (frameLayout = this.f457749d) != null) {
            frameLayout.removeView(bVar);
        }
        this.f457749d = null;
        this.f457748c = null;
        this.f457750e = null;
        this.f457751f = null;
        this.f457752g.clear();
        this.f457754i = false;
        this.f457755j = false;
        this.f457756k = false;
    }

    public final void c(java.lang.String input) {
        android.webkit.WebView webView = this.f457750e;
        if (webView != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("console._log('");
            kotlin.jvm.internal.o.g(input, "input");
            if (!(input.length() == 0)) {
                java.lang.String[][] strArr = xw5.c.f457745a;
                for (int i17 = 0; i17 < 10; i17++) {
                    java.lang.String[] strArr2 = strArr[i17];
                    input = r26.i0.t(input, strArr2[0], strArr2[1], false);
                }
            }
            sb6.append(input);
            sb6.append("')");
            webView.evaluateJavascript(sb6.toString(), null);
        }
    }
}
