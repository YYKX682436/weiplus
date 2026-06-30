package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class t5 implements java.util.Comparator {
    public t5(com.tencent.mm.plugin.sns.model.w5 w5Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
        int compareTo = ((com.tencent.mm.plugin.sns.model.v5) ((java.util.Map.Entry) obj).getValue()).f164721b.compareTo(((com.tencent.mm.plugin.sns.model.v5) ((java.util.Map.Entry) obj2).getValue()).f164721b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
        return compareTo;
    }
}
