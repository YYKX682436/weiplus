package s94;

/* loaded from: classes.dex */
public final class b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$cleanSnsDraftDir$$inlined$sortedByDescending$1");
        int b17 = mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.vfs.x1) obj2).f213235e), java.lang.Long.valueOf(((com.tencent.mm.vfs.x1) obj).f213235e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$cleanSnsDraftDir$$inlined$sortedByDescending$1");
        return b17;
    }
}
