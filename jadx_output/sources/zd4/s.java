package zd4;

/* loaded from: classes11.dex */
public final class s extends zd4.o {
    @Override // zd4.o
    public java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zd4.q(2, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.f493216jc1));
        arrayList.add(new zd4.q(2, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.jbk));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new zd4.q(3, 0, com.tencent.mm.R.string.jbz, com.tencent.mm.R.string.f493215jc0));
        arrayList2.add(new zd4.q(3, 1, com.tencent.mm.R.string.jbt, com.tencent.mm.R.string.jbb));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kz5.p0 p0Var = kz5.p0.f313996d;
        arrayList3.add(new zd4.r(0, com.tencent.mm.R.string.jbq, com.tencent.mm.R.string.jbr, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(1, com.tencent.mm.R.string.jbo, com.tencent.mm.R.string.jbp, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(2, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jbk, arrayList, null, null, 48, null));
        arrayList3.add(new zd4.r(3, com.tencent.mm.R.string.jba, com.tencent.mm.R.string.jbb, arrayList2, null, null, 48, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        return arrayList3;
    }

    @Override // zd4.o
    public int m(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        int i18 = 0;
        if (i17 != 0 && i17 != 1 && (i17 == 2 || i17 == 3)) {
            i18 = 8;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        return i18;
    }
}
