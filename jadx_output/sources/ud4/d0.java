package ud4;

/* loaded from: classes13.dex */
public class d0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426686e;

    public d0(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, android.view.View view) {
        this.f426686e = dynamicGridView;
        this.f426685d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426686e;
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f(dynamicGridView, false);
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = dynamicGridView.f170257d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (bitmapDrawable != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            ud4.k0 k0Var = dynamicGridView.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (k0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                ud4.k0 k0Var2 = dynamicGridView.I;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                ((ud4.o) k0Var2).a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.v(this.f426685d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mars.xlog.Log.i("DynamicGridView", "animate end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426686e;
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f(dynamicGridView, true);
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.g(dynamicGridView);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "animate start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
    }
}
