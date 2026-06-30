package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wo implements java.util.Comparator {
    public wo(com.tencent.mm.plugin.sns.ui.xo xoVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        int i17 = -1;
        if (snsInfo.localid == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        } else if (snsInfo2.localid == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            i17 = 1;
        } else if (snsInfo.getHead() != snsInfo2.getHead()) {
            i17 = snsInfo2.getHead() - snsInfo.getHead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        } else if (snsInfo.getCreateTime() != snsInfo2.getCreateTime()) {
            i17 = snsInfo2.getCreateTime() - snsInfo.getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
            i17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper$1");
        return i17;
    }
}
