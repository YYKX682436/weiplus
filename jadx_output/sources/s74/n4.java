package s74;

/* loaded from: classes2.dex */
public final class n4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f404443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f404444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f404445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f404446h;

    public n4(android.view.View view, double d17, double d18, double d19, double d27) {
        this.f404442d = view;
        this.f404443e = d17;
        this.f404444f = d18;
        this.f404445g = d19;
        this.f404446h = d27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processScaleAnimation$1");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = (f17 != null ? f17.floatValue() : 0.0f) / 100.0f;
        double d17 = 1 - floatValue;
        double d18 = floatValue;
        float f18 = (float) ((this.f404443e * d17) + (this.f404444f * d18));
        android.view.View view = this.f404442d;
        view.setScaleX(f18);
        view.setScaleY((float) ((d17 * this.f404445g) + (d18 * this.f404446h)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processScaleAnimation$1");
    }
}
