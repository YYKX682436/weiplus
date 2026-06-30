package j84;

/* loaded from: classes4.dex */
public final class k0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$calculateNewWidth$$inlined$sortedBy$1");
        int b17 = mz5.a.b(java.lang.Float.valueOf(((j84.j0) obj).b()), java.lang.Float.valueOf(((j84.j0) obj2).b()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$calculateNewWidth$$inlined$sortedBy$1");
        return b17;
    }
}
