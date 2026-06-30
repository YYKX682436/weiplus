package v74;

/* loaded from: classes.dex */
public final class j0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$triggerVideoPlay$$inlined$sortByDescending$1");
        int b17 = mz5.a.b((java.lang.Float) ((jz5.l) obj2).f302834e, (java.lang.Float) ((jz5.l) obj).f302834e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$triggerVideoPlay$$inlined$sortByDescending$1");
        return b17;
    }
}
