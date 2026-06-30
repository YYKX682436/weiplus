package nb4;

/* loaded from: classes4.dex */
public final class a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateSnsCoverInfo$$inlined$sortBy$1");
        int b17 = mz5.a.b(java.lang.Float.valueOf(((r45.jj4) obj).f377865p.f379521e), java.lang.Float.valueOf(((r45.jj4) obj2).f377865p.f379521e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateSnsCoverInfo$$inlined$sortBy$1");
        return b17;
    }
}
