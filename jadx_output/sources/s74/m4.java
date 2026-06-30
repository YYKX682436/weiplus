package s74;

/* loaded from: classes2.dex */
public final class m4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f404426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f404427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f404428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f404429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f404430i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f404431m;

    public m4(android.view.View view, double d17, double d18, double d19, double d27, double d28, double d29) {
        this.f404425d = view;
        this.f404426e = d17;
        this.f404427f = d18;
        this.f404428g = d19;
        this.f404429h = d27;
        this.f404430i = d28;
        this.f404431m = d29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processRotateAnimation$1");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = (f17 != null ? f17.floatValue() : 0.0f) / 100.0f;
        double d17 = 1 - floatValue;
        double d18 = floatValue;
        float f18 = (float) ((this.f404426e * d17) + (this.f404427f * d18));
        android.view.View view = this.f404425d;
        view.setRotationX(f18);
        view.setRotationY((float) ((this.f404428g * d17) + (this.f404429h * d18)));
        view.setRotation((float) ((d17 * this.f404430i) + (d18 * this.f404431m)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processRotateAnimation$1");
    }
}
