package e84;

/* loaded from: classes4.dex */
public final class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250258d;

    public b(e84.t tVar) {
        this.f250258d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        e84.t tVar = this.f250258d;
        android.widget.FrameLayout J2 = tVar.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        if (J2 != null) {
            J2.setAlpha(1.0f);
        }
        android.widget.ImageView A = e84.t.A(tVar);
        if (A != null) {
            A.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) tVar.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        if (viewGroup != null) {
            viewGroup.setTranslationX(0.0f);
        }
        android.widget.ImageView A2 = e84.t.A(tVar);
        if (A2 != null) {
            A2.setTranslationX(0.0f);
        }
        com.tencent.mars.xlog.Log.i(tVar.j(), "doProductBarAnim, onAnimationEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        e84.t tVar = this.f250258d;
        android.widget.FrameLayout J2 = tVar.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        if (J2 != null) {
            J2.setAlpha(0.0f);
        }
        android.widget.ImageView A = e84.t.A(tVar);
        if (A != null) {
            A.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) tVar.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        if (viewGroup != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAnimOffset$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            float f17 = tVar.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAnimOffset$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            viewGroup.setTranslationX(f17);
        }
        android.widget.ImageView A2 = e84.t.A(tVar);
        if (A2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAnimOffset$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            float f18 = tVar.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAnimOffset$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            A2.setTranslationX(f18);
        }
        com.tencent.mars.xlog.Log.i(tVar.j(), "doProductBarAnim, onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$doProductBarAnim$1");
    }
}
