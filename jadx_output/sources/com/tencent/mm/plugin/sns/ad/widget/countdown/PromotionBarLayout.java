package com.tencent.mm.plugin.sns.ad.widget.countdown;

/* loaded from: classes4.dex */
public class PromotionBarLayout extends android.widget.RelativeLayout implements q84.d, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f163536d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f163537e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f163538f;

    /* renamed from: g, reason: collision with root package name */
    public q84.e f163539g;

    /* renamed from: h, reason: collision with root package name */
    public q84.a f163540h;

    public PromotionBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // q84.d
    public void a(long j17, a84.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (j17 <= 0) {
            try {
                setVisibility(8);
            } catch (java.lang.Throwable unused) {
            }
        }
        android.view.KeyEvent.Callback callback = this.f163536d;
        if (callback instanceof q84.d) {
            ((q84.d) callback).a(j17, e0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void b(q84.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        try {
            com.tencent.mars.xlog.Log.i("PromotionBarLayout", "startCountDown");
            if (!isAttachedToWindow()) {
                com.tencent.mars.xlog.Log.e("PromotionBarLayout", "startCountDown, !isAttachedToWindow");
            }
            q84.a aVar = this.f163540h;
            if (aVar != null) {
                aVar.a(eVar);
            }
            this.f163539g = eVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("PromotionBarLayout", "startCountDown, exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    @Override // q84.d
    public q84.e getCountDownVM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        q84.e eVar = this.f163539g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onDetachedFromWindow();
        try {
            com.tencent.mars.xlog.Log.i("PromotionBarLayout", "onDetachedFromWindow");
            q84.a aVar = this.f163540h;
            if (aVar != null) {
                aVar.b(this.f163539g);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("PromotionBarLayout", "onDetachedFromWindow, exp=" + th6);
            ca4.q.c("PromotionBarLayout, stopCountDown", new java.lang.RuntimeException("stopCountDown"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        super.onFinishInflate();
        try {
            com.tencent.mars.xlog.Log.i("PromotionBarLayout", "onFinishInflate");
            this.f163540h = new q84.a(this);
            this.f163536d = findViewById(com.tencent.mm.R.id.f482664km);
            this.f163537e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482665kn);
            this.f163538f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n2b);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void setPromotionalPrice(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        if (this.f163537e != null && !android.text.TextUtils.isEmpty(str)) {
            this.f163537e.setText(str);
            android.widget.TextView textView = this.f163537e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            if (textView != null) {
                try {
                    if (a84.y0.f2378a == null) {
                        a84.y0.f2378a = android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/WeChatSansStd-Medium.ttf");
                    }
                    if (a84.y0.f2378a != null) {
                        android.graphics.Typeface typeface = textView.getTypeface();
                        android.graphics.Typeface typeface2 = a84.y0.f2378a;
                        if (typeface != typeface2) {
                            textView.setTypeface(typeface2);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewWeChatSansTypeface", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPromotionalPrice", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public void setRightTitle(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
        android.widget.TextView textView = this.f163538f;
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRightTitle", "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout");
    }

    public PromotionBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
