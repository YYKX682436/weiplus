package zc4;

/* loaded from: classes4.dex */
public final class c implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        xc4.p o17 = (xc4.p) obj;
        xc4.p o27 = (xc4.p) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        kotlin.jvm.internal.o.g(o17, "o1");
        kotlin.jvm.internal.o.g(o27, "o2");
        int i17 = o27.getCreateTime() != o17.getCreateTime() ? kotlin.jvm.internal.o.i(o27.getCreateTime(), o17.getCreateTime()) : o27.a1().compareTo(o17.a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        return i17;
    }
}
