package y84;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(y84.h3 h3Var) {
        super(0);
        this.f460037d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$_topStarTranslationX$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$_topStarTranslationX$1");
        y84.h3 h3Var = this.f460037d;
        float K = y84.h3.K(h3Var, 203.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) ((jz5.n) h3Var.f460080h0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.Float valueOf = java.lang.Float.valueOf(K - intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$_topStarTranslationX$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$_topStarTranslationX$1");
        return valueOf;
    }
}
