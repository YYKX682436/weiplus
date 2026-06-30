package com.tencent.mm.plugin.sns.ad.widget.animlabel;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView;", "Landroid/widget/RelativeLayout;", "", "outContentW", "Ljz5/f0;", "setContentWidth", "Lc84/f;", "value", "setContentDisappearListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AnimLabelView extends android.widget.RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f163508r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163509d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f163510e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f163511f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f163512g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f163513h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f163514i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView f163515m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.AnimatorSet f163516n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f163517o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.AnimatorSet f163518p;

    /* renamed from: q, reason: collision with root package name */
    public c84.f f163519q;

    public AnimLabelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        setVisibility(0);
        android.widget.ImageView imageView = this.f163514i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mArrowIcon");
            throw null;
        }
        imageView.setAlpha(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startContentAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (this.f163517o == null) {
            float b17 = i65.a.b(getContext(), 12);
            android.view.View view = this.f163510e;
            if (view == null) {
                kotlin.jvm.internal.o.o("mContentView");
                throw null;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", -b17, 0.0f);
            ofFloat.setDuration(500L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            ofFloat.setInterpolator(pathInterpolator);
            android.view.View view2 = this.f163510e;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mContentView");
                throw null;
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(500L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
            ofFloat2.setInterpolator(pathInterpolator2);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new p84.g(this));
            this.f163517o = animatorSet;
        }
        android.animation.AnimatorSet animatorSet2 = this.f163517o;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startContentAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView labelBackgroundView = this.f163515m;
        if (labelBackgroundView == null) {
            kotlin.jvm.internal.o.o("mBackgroundView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        labelBackgroundView.f163526m = false;
        int measuredWidth = labelBackgroundView.getMeasuredWidth();
        if (measuredWidth == 0 && (i17 = labelBackgroundView.f163527n) != 0) {
            measuredWidth = i17;
        }
        int i18 = measuredWidth + labelBackgroundView.f163521e;
        com.tencent.mars.xlog.Log.i(labelBackgroundView.f163520d, "startTranslateAnim, isStoped=" + labelBackgroundView.f163526m + ", transDis=" + i18 + ", measuredWidth=" + labelBackgroundView.getMeasuredWidth() + ", outW=" + labelBackgroundView.f163527n);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(labelBackgroundView, "midDrawLeftEdge", -i18, 0);
        ofInt.setDuration(1000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        ofInt.setInterpolator(pathInterpolator3);
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(labelBackgroundView, "midDrawLeftEdge", 0, 0);
        ofInt2.setDuration(500L);
        android.animation.ObjectAnimator ofInt3 = android.animation.ObjectAnimator.ofInt(labelBackgroundView, "midDrawLeftEdge", 0, i18);
        ofInt3.setDuration(1000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        ofInt3.setInterpolator(pathInterpolator4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.play(ofInt);
        animatorSet3.play(ofInt2).after(ofInt);
        animatorSet3.play(ofInt3).after(ofInt2);
        animatorSet3.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        super.onDetachedFromWindow();
        android.animation.AnimatorSet animatorSet = this.f163516n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    public final void setContentDisappearListener(c84.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentDisappearListener", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        this.f163519q = fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentDisappearListener", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    public final void setContentWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView labelBackgroundView = this.f163515m;
        if (labelBackgroundView == null) {
            kotlin.jvm.internal.o.o("mBackgroundView");
            throw null;
        }
        labelBackgroundView.setContentWidth(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
    }

    public AnimLabelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163509d = "AnimLabelView";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.coo, (android.view.ViewGroup) this, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lbg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f163511f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lbh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f163512g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.cuv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f163513h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.a4s);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f163514i = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.chq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f163510e = findViewById5;
        com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView labelBackgroundView = new com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView(getContext(), null);
        this.f163515m = labelBackgroundView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        labelBackgroundView.f163526m = true;
        labelBackgroundView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView labelBackgroundView2 = this.f163515m;
        if (labelBackgroundView2 != null) {
            addView(labelBackgroundView2, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        } else {
            kotlin.jvm.internal.o.o("mBackgroundView");
            throw null;
        }
    }
}
