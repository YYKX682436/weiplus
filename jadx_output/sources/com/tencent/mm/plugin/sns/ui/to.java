package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class to implements java.util.Comparator {
    public to(com.tencent.mm.plugin.sns.ui.vo voVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        int i17 = snsInfo.localid;
        int i18 = snsInfo2.localid;
        int i19 = -1;
        if (i17 == i18 && i17 == -1) {
            i19 = snsInfo.getCreateTime() - snsInfo2.getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        } else if (i17 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        } else if (i18 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            i19 = 1;
        } else if (snsInfo.getHead() != snsInfo2.getHead()) {
            i19 = snsInfo2.getHead() - snsInfo.getHead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        } else if (snsInfo.getCreateTime() != snsInfo2.getCreateTime()) {
            i19 = snsInfo2.getCreateTime() - snsInfo.getCreateTime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
            i19 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper$1");
        return i19;
    }
}
