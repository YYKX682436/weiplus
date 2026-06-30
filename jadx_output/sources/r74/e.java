package r74;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r74.k f393200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r74.k kVar) {
        super(1);
        this.f393200d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$4$bindComponentModel$1$onPreDraw$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$4$bindComponentModel$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdDownloadHelper$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        r74.k kVar = this.f393200d;
        a44.k kVar2 = kVar.f393218z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdDownloadHelper$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (kVar2 != null) {
            android.app.Activity F = r74.k.F(kVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = kVar.f393210r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            kVar2.g(F, snsInfo, intValue);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$4$bindComponentModel$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$4$bindComponentModel$1$onPreDraw$1");
        return f0Var;
    }
}
