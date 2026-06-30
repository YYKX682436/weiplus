package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class p1 implements jt0.h {
    public p1(com.tencent.mm.plugin.sns.model.i1 i1Var) {
    }

    @Override // jt0.h
    public int a(java.lang.Object obj) {
        int d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
        com.tencent.mm.memory.r rVar = (com.tencent.mm.memory.r) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
        if (rVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
            d17 = 0;
        } else {
            d17 = rVar.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sizeOf", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$1");
        return d17;
    }
}
