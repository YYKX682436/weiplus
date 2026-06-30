package k84;

/* loaded from: classes3.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(k84.d4 d4Var) {
        super(1);
        this.f305148d = d4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$2");
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setHoldingAnimState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        k84.d4 d4Var = this.f305148d;
        d4Var.f304997J = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setHoldingAnimState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator S = d4Var.S();
        if (S != null) {
            S.cancel();
        }
        android.animation.ValueAnimator L = d4Var.L();
        if (L != null) {
            L.cancel();
        }
        android.animation.ValueAnimator K = d4Var.K();
        if (K != null) {
            K.cancel();
        }
        k84.d4.b0(d4Var, null, 1, null);
        com.tencent.mars.xlog.Log.i(d4Var.j(), "startAnim end " + th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$2");
        return f0Var;
    }
}
