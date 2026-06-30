package com.tencent.mm.plugin.sns.ad.helper.randompickcard;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/AdLandingPagePickCardTipView;", "Landroid/widget/FrameLayout;", "", "getCurrentUnPickedNum", "Lcom/tencent/mm/plugin/sns/ad/landingpage/helper/anim/i0;", "helper", "Ljz5/f0;", "setAdLandingPageEggCardHelper", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnBtnClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdLandingPagePickCardTipView extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f162696n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f162697d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f162698e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f162699f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162700g;

    /* renamed from: h, reason: collision with root package name */
    public final p44.b f162701h;

    /* renamed from: i, reason: collision with root package name */
    public int f162702i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f162703m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdLandingPagePickCardTipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reStartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        c();
        setVisibility(0);
        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "reStartAnim");
        this.f162701h.sendEmptyMessage(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reStartAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    public final int b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        if (this.f162702i == 0) {
            int a17 = c44.b.a(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
            return a17;
        }
        int i18 = (int) ((r2 * i17) / 375.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        return i18;
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "resetAnim");
        android.widget.LinearLayout linearLayout = this.f162698e;
        if (linearLayout != null) {
            p44.q.f351832a.b(linearLayout);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f162699f;
        if (roundedCornerFrameLayout != null) {
            p44.q.f351832a.b(roundedCornerFrameLayout);
        }
        android.widget.LinearLayout linearLayout2 = this.f162698e;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(0.0f);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.f162699f;
        if (roundedCornerFrameLayout2 != null) {
            roundedCornerFrameLayout2.setAlpha(0.0f);
        }
        this.f162701h.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    public final int getCurrentUnPickedNum() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentUnPickedNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        int i17 = this.f162697d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentUnPickedNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        return i17;
    }

    public final void setAdLandingPageEggCardHelper(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        this.f162703m = i0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageEggCardHelper", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    public final void setOnBtnClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnBtnClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        setOnClickListener(onClickListener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnBtnClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdLandingPagePickCardTipView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f162701h = new p44.b(this, android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "initLifeCycleListener");
            androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
            if (mo133getLifecycle != null) {
                mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1
                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onPause(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", "onPause");
                        int i18 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.f162696n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.this.f162700g = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                    }

                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onResume(androidx.lifecycle.y owner) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                        kotlin.jvm.internal.o.g(owner, "owner");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume, pauseFlag=");
                        int i18 = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.f162696n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView adLandingPagePickCardTipView = com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView.this;
                        boolean z17 = adLandingPagePickCardTipView.f162700g;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        sb6.append(z17);
                        com.tencent.mars.xlog.Log.i("AdLandingPagePickCardTipView", sb6.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        boolean z18 = adLandingPagePickCardTipView.f162700g;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        if (z18) {
                            adLandingPagePickCardTipView.a();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                            adLandingPagePickCardTipView.f162700g = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMHasPauseFlag$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$initLifeCycleListener$1$1");
                    }
                });
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLifeCycleListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView");
    }
}
