package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class ej implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
        int createTime = obj instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? ((com.tencent.mm.plugin.sns.storage.SnsInfo) obj).getCreateTime() : obj instanceof wa4.n ? ((wa4.n) obj).f444266e : 0;
        int createTime2 = obj2 instanceof com.tencent.mm.plugin.sns.storage.SnsInfo ? ((com.tencent.mm.plugin.sns.storage.SnsInfo) obj2).getCreateTime() : obj2 instanceof wa4.n ? ((wa4.n) obj2).f444266e : 0;
        if (createTime == createTime2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
            return 0;
        }
        if (createTime > createTime2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
            return -1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
        return 1;
    }
}
