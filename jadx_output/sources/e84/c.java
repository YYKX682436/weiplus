package e84;

/* loaded from: classes4.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f250259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f250260e;

    public c(e84.t tVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f250259d = tVar;
        this.f250260e = snsInfo;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        e84.t tVar = this.f250259d;
        java.lang.String j17 = tVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f250260e;
        sb6.append(snsInfo.getSnsId());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (e0Var == l44.e0.f316103q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.animation.AnimatorSet animatorSet = tVar.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(tVar.J(), "alpha", 0.0f, 1.0f);
            android.view.animation.PathInterpolator pathInterpolator = tVar.f250281J;
            ofFloat.setInterpolator(pathInterpolator);
            ofFloat.setDuration(700L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(tVar.I(), "alpha", 0.0f, 1.0f);
            ofFloat2.setInterpolator(pathInterpolator);
            ofFloat2.setDuration(700L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) tVar.E).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", tVar.K, 0.0f);
            ofFloat3.setInterpolator(pathInterpolator);
            ofFloat3.setDuration(700L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(tVar.I(), "translationX", tVar.K, 0.0f);
            ofFloat4.setInterpolator(pathInterpolator);
            ofFloat4.setDuration(700L);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            tVar.L = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            android.animation.AnimatorSet animatorSet3 = tVar.L;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new e84.b(tVar));
            }
            android.animation.AnimatorSet animatorSet4 = tVar.L;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
            com.tencent.mars.xlog.Log.i(tVar.j(), "doProductBarAnim");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        return f0Var;
    }
}
