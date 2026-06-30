package e84;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f250294a;

    /* renamed from: b, reason: collision with root package name */
    public e84.t f250295b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f250296c;

    public v(int i17) {
        this.f250294a = i17;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
        com.tencent.mars.xlog.Log.i("AdSingleProductLogic", "adSingleProductLogic, from not ad to resetUI");
        e84.t tVar = this.f250295b;
        if (tVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.tencent.mm.plugin.sns.ui.AdFrameLayout K = tVar.K();
            if (K != null) {
                K.setVisibility(8);
            }
            android.animation.AnimatorSet animatorSet = tVar.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.widget.FrameLayout frameLayout = tVar.f250293z;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
    }
}
