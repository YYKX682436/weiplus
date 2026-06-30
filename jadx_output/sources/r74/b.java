package r74;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f393197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        super(0);
        this.f393197d = baseViewHolder;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
        r74.a aVar = (r74.a) this.f393197d;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        boolean z17 = aVar.E0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
        return valueOf;
    }
}
