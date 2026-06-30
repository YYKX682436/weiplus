package dc4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.i f228746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dc4.i iVar) {
        super(1);
        this.f228746d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1$onPreDraw$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdDownloadHelper$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        dc4.i iVar = this.f228746d;
        a44.k kVar = iVar.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdDownloadHelper$p", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        if (kVar != null) {
            android.app.Activity p17 = iVar.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            kVar.g(p17, iVar.f228753q, intValue);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$refreshView$2$bindComponentModel$1$onPreDraw$1");
        return f0Var;
    }
}
