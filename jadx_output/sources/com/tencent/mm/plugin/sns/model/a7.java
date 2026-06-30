package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class a7 implements java.util.Comparator {
    public a7(com.tencent.mm.plugin.sns.model.i7 i7Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
        int i17 = -((int) (((t21.v0) obj).f414990n - ((t21.v0) obj2).f414990n));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
        return i17;
    }
}
