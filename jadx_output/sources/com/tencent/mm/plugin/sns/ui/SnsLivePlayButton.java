package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsLivePlayButton;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SnsLivePlayButton extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f167260d;

    /* renamed from: e, reason: collision with root package name */
    public final long f167261e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsLivePlayButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f167260d < this.f167261e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
            return;
        }
        this.f167260d = currentTimeMillis;
        performHapticFeedback(1, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
        clearAnimation();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.sns.ui.SnsLivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 1.0f, 0.9f);
        ofFloat.setDuration(150L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.sns.ui.SnsLivePlayButton, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, 0.9f);
        ofFloat2.setDuration(150L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.sns.ui.SnsLivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 0.9f);
        ofFloat3.setDuration(50L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.sns.ui.SnsLivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 1.0f);
        ofFloat4.setDuration(150L);
        ofFloat4.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.sns.ui.SnsLivePlayButton, java.lang.Float>) android.view.View.SCALE_Y, 0.9f, 1.0f);
        ofFloat5.setDuration(150L);
        ofFloat5.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat4, ofFloat5);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playSequentially(animatorSet, ofFloat3, animatorSet2);
        animatorSet3.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsLivePlayButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.epi, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.smj);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
        int a17 = com.tencent.mm.plugin.sns.ui.ts.a(1);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        setPadding(a17, com.tencent.mm.plugin.sns.ui.ts.a(valueOf), com.tencent.mm.plugin.sns.ui.ts.a(1), com.tencent.mm.plugin.sns.ui.ts.a(valueOf));
        this.f167261e = 100L;
    }
}
