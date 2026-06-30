package da4;

/* loaded from: classes4.dex */
public class c implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
        da4.d dVar = (da4.d) obj;
        da4.d dVar2 = (da4.d) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
        try {
            i17 = java.lang.Integer.compare(dVar.f227779f, dVar2.f227779f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            i17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
        return i17;
    }
}
