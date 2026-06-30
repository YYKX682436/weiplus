package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public class LivingDescBarLayout extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f163663d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.f0 f163664e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.g0 f163665f;

    public LivingDescBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163665f = null;
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        if (f0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var = f0Var.f163714h;
        boolean z17 = g0Var == null || g0Var.getCount() <= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdapterEmpty", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        return z17;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        if (f0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
            try {
                com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var = f0Var.f163714h;
                if (g0Var != null && g0Var.getCount() > 0 && f0Var.a()) {
                    com.tencent.mars.xlog.Log.i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView pre text is " + ((java.lang.Object) f0Var.f163710d.getText()) + ", mToVisibleView pre text is " + ((java.lang.Object) f0Var.f163711e.getText()));
                    java.lang.String b17 = f0Var.f163714h.b(f0Var.f163715i);
                    f0Var.f163710d.setText(b17);
                    java.lang.String b18 = f0Var.f163714h.b((f0Var.f163715i + 1) % f0Var.f163714h.getCount());
                    f0Var.f163711e.setText(b18);
                    com.tencent.mars.xlog.Log.i("SlideController", "notifyCurrentDataChange, mCurrentVisibleView: " + b17 + ", mToVisibleView: " + b18);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SlideController", th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout$AlternatelySlideController");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyCurrentDataChange", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        if (f0Var != null) {
            f0Var.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopSlide", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.w("SnsAd.LivingDescBarLayout", "onAttachedToWindow is called!!");
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var = this.f163665f;
        if (f0Var != null && g0Var != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout attached to window, and record adapter is not null, set adapter");
            f0Var.c(g0Var);
        }
        this.f163665f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        if (f0Var != null) {
            f0Var.c(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        super.onFinishInflate();
        try {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482652ka);
            this.f163663d = imageView;
            imageView.setImageResource(com.tencent.mm.R.raw.ad_living_description_icon);
            this.f163664e = new com.tencent.mm.plugin.sns.ad.widget.living.f0((android.widget.TextView) findViewById(com.tencent.mm.R.id.f482650k8), (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482651k9));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void setIconImage(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        android.widget.ImageView imageView = this.f163663d;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public void setSlideAdapter(com.tencent.mm.plugin.sns.ad.widget.living.g0 g0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.tencent.mm.plugin.sns.ad.widget.living.f0 f0Var = this.f163664e;
        if (f0Var != null) {
            if (isAttachedToWindow()) {
                com.tencent.mars.xlog.Log.i("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout has attach to window, set adapter");
                f0Var.c(g0Var);
            } else {
                com.tencent.mars.xlog.Log.w("SnsAd.LivingDescBarLayout", "the LivingDescBarLayout has not attach to window, record adapter");
                this.f163665f = g0Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSlideAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
    }

    public LivingDescBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163665f = null;
    }
}
