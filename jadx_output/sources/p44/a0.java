package p44;

/* loaded from: classes4.dex */
public final class a0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage$getUISortedDataList$lambda$9$$inlined$compareBy$1");
        int b17 = mz5.a.b(java.lang.Integer.valueOf(((p44.s) obj).d()), java.lang.Integer.valueOf(((p44.s) obj2).d()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage$getUISortedDataList$lambda$9$$inlined$compareBy$1");
        return b17;
    }
}
