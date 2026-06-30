package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class s7 implements com.tencent.mm.plugin.webview.ui.tools.q {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.r7 f186847a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f186848b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper f186849c;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f186856j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f186857k;

    /* renamed from: l, reason: collision with root package name */
    public float f186858l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f186859m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f186860n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f186861o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f186863q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f186864r;

    /* renamed from: d, reason: collision with root package name */
    public int f186850d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f186851e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f186852f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f186853g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f186854h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f186855i = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public boolean f186862p = true;

    public s7() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        this.f186863q = true ^ yp5.a.f464409a.a();
        this.f186864r = false;
    }

    public void a() {
        this.f186851e = false;
        i();
        if (!this.f186862p || this.f186860n == null) {
            return;
        }
        e(this.f186864r);
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186849c;
        if (logoWebViewWrapper != null) {
            logoWebViewWrapper.setReleaseTargetHeight(0);
        }
        g();
    }

    public void b() {
        android.view.View view = this.f186860n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(int i17, boolean z17) {
        android.widget.ImageView imageView = this.f186848b;
        if (imageView != null) {
            java.lang.String.valueOf(imageView.getVisibility());
        }
        android.widget.ImageView imageView2 = this.f186848b;
        if (imageView2 != null) {
            imageView2.getDrawable().toString();
        }
        android.widget.ImageView imageView3 = this.f186848b;
        if (imageView3 != null) {
            java.lang.String.valueOf(imageView3.getAlpha());
        }
        if (this.f186851e) {
            if (i17 == 0) {
                this.f186853g = false;
            }
            if (this.f186848b == null) {
                return;
            }
            if (z17) {
                int abs = java.lang.Math.abs(i17);
                int i18 = this.f186850d;
                if (abs >= i18) {
                    com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186849c;
                    if (logoWebViewWrapper != null) {
                        logoWebViewWrapper.setReleaseTargetHeight(i18);
                    }
                } else {
                    com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper2 = this.f186849c;
                    if (logoWebViewWrapper2 != null) {
                        logoWebViewWrapper2.setReleaseTargetHeight(0);
                    }
                }
            } else if (java.lang.Math.abs(i17) > this.f186850d && !this.f186852f) {
                h();
                return;
            } else if (this.f186852f) {
                return;
            }
            android.widget.ImageView imageView4 = this.f186848b;
            if (imageView4 != null && imageView4.getAlpha() < 1.0f && this.f186857k == null && z17) {
                android.view.ViewPropertyAnimator duration = this.f186848b.animate().alpha(1.0f).setDuration(500L);
                this.f186857k = duration;
                duration.setListener(new com.tencent.mm.plugin.webview.ui.tools.q7(this));
                this.f186857k.start();
            }
            if (!this.f186853g) {
                int i19 = -i17;
                int i27 = i19 - this.f186854h;
                int i28 = java.lang.Math.abs(i17) >= this.f186850d ? i27 * 5 : i27 * 2;
                this.f186854h = i19;
                float width = this.f186848b.getWidth() / 2.0f;
                this.f186855i -= i28;
                this.f186848b.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                android.graphics.Matrix imageMatrix = this.f186848b.getImageMatrix();
                imageMatrix.postRotate(-i28, width, this.f186848b.getHeight() / 2.0f);
                this.f186848b.setImageMatrix(imageMatrix);
                this.f186848b.setImageResource(com.tencent.mm.R.drawable.ci6);
            }
            this.f186848b.invalidate();
        }
    }

    public void d() {
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186849c;
        if (logoWebViewWrapper != null) {
            android.widget.FrameLayout frameLayout = logoWebViewWrapper.f183606e;
            if (frameLayout != null) {
                frameLayout.removeView(logoWebViewWrapper.f183605d);
                logoWebViewWrapper.f183605d = null;
            }
            this.f186849c.f183617s = null;
        }
        android.view.View view = this.f186859m;
        if (view != null) {
            ((android.view.ViewGroup) view).removeAllViews();
        }
        this.f186849c = null;
        this.f186848b = null;
        this.f186854h = 0;
        android.animation.ValueAnimator valueAnimator = this.f186856j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f186856j = null;
        }
    }

    public void e(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186849c;
        if (logoWebViewWrapper == null || logoWebViewWrapper.f183614p == z17) {
            return;
        }
        logoWebViewWrapper.f183614p = z17;
        if (z17) {
            logoWebViewWrapper.f183608g = false;
            logoWebViewWrapper.f183613o = 0;
        }
        b();
        this.f186864r = z17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        this.f186863q = !yp5.a.f464409a.a() || z17;
    }

    public void f(java.lang.String str) {
        if (!this.f186862p || this.f186863q) {
            e(true);
            android.view.View view = this.f186860n;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            b();
            return;
        }
        if (this.f186861o != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f186861o.setVisibility(8);
                return;
            }
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (com.tencent.mm.sdk.platformtools.t8.K0(host) || j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) == 1) {
                this.f186861o.setVisibility(8);
                return;
            }
            java.lang.String string = this.f186861o.getContext().getString(com.tencent.mm.R.string.l6m, host);
            this.f186861o.setVisibility(0);
            this.f186861o.setText(string);
            e(false);
        }
    }

    public void g() {
        android.view.View view = this.f186860n;
        if (view == null || this.f186863q) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public float getStartLoadingStep() {
        return this.f186858l;
    }

    public void h() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper;
        nw4.n nVar;
        if (this.f186852f || (imageView = this.f186848b) == null || (logoWebViewWrapper = this.f186849c) == null) {
            return;
        }
        this.f186852f = true;
        logoWebViewWrapper.f183614p = true;
        logoWebViewWrapper.f183608g = false;
        logoWebViewWrapper.f183613o = 0;
        imageView.clearAnimation();
        android.animation.ValueAnimator valueAnimator = this.f186856j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f17 = this.f186855i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "startLoadingStep", 0.0f + f17, f17 + 354.0f);
        this.f186856j = ofFloat;
        ofFloat.setDuration(960L);
        this.f186856j.setRepeatMode(1);
        this.f186856j.setRepeatCount(-1);
        this.f186856j.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f186856j.start();
        com.tencent.mm.plugin.webview.ui.tools.r7 r7Var = this.f186847a;
        if (r7Var == null || (nVar = ((com.tencent.mm.plugin.webview.ui.tools.oa) r7Var).f186736a.f183844p0) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, not ready");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onPullDownRefresh success, ready");
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.x1(nVar, nw4.n.t(nw4.x2.c("onPullDownRefresh", null, nVar.f340903q, nVar.f340904r))));
        }
    }

    public void i() {
        if (this.f186852f) {
            this.f186853g = true;
            this.f186852f = false;
            com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = this.f186849c;
            if (logoWebViewWrapper != null && this.f186851e) {
                logoWebViewWrapper.f183614p = false;
            }
            android.animation.ValueAnimator valueAnimator = this.f186856j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper2 = this.f186849c;
            if (logoWebViewWrapper2 != null) {
                logoWebViewWrapper2.b(0, 250L);
            }
            android.widget.ImageView imageView = this.f186848b;
            if (imageView != null) {
                imageView.animate().alpha(0.0f).setDuration(500L).start();
            }
        }
    }

    public void setStartLoadingStep(float f17) {
        this.f186858l = f17;
        this.f186848b.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f186848b.getImageMatrix().setRotate(f17, this.f186848b == null ? 0.0f : r1.getWidth() / 2.0f, this.f186848b != null ? r4.getHeight() / 2.0f : 0.0f);
        this.f186855i = f17;
        this.f186848b.invalidate();
    }
}
