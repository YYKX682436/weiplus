package s74;

/* loaded from: classes2.dex */
public final class o4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f404473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f404474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f404475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f404476h;

    public o4(android.view.View view, float f17, float f18, float f19, float f27) {
        this.f404472d = view;
        this.f404473e = f17;
        this.f404474f = f18;
        this.f404475g = f19;
        this.f404476h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processTransAnimation$1");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = (f17 != null ? f17.floatValue() : 0.0f) / 100.0f;
        float f18 = 1 - floatValue;
        float f19 = (this.f404473e * f18) + (this.f404474f * floatValue);
        android.view.View view = this.f404472d;
        view.setTranslationX(f19);
        view.setTranslationY((f18 * this.f404475g) + (floatValue * this.f404476h));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processTransAnimation$1");
    }
}
