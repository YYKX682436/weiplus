package r34;

/* loaded from: classes4.dex */
public final class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$updateRecord$$inlined$sortByDescending$1");
        int b17 = mz5.a.b(java.lang.Long.valueOf(((r34.b) obj2).d()), java.lang.Long.valueOf(((r34.b) obj).d()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$updateRecord$$inlined$sortByDescending$1");
        return b17;
    }
}
