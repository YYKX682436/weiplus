package ud4;

/* loaded from: classes13.dex */
public class a0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426680d;

    public a0(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        this.f426680d = dynamicGridView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426680d;
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f(dynamicGridView, false);
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "animate end 1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426680d;
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f(dynamicGridView, true);
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "animate start 1 ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
    }
}
