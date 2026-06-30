package ud4;

/* loaded from: classes13.dex */
public class e0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426692d;

    public e0(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        this.f426692d = dynamicGridView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
        int i17 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426692d;
        dynamicGridView.E = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
        int i17 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426692d;
        dynamicGridView.E = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
    }
}
