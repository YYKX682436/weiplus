package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q1 implements kk.h {
    public q1(com.tencent.mm.plugin.sns.model.i1 i1Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.memory.r rVar = (com.tencent.mm.memory.r) obj2;
        com.tencent.mm.memory.r rVar2 = (com.tencent.mm.memory.r) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
        if (rVar != null && !rVar.e() && !rVar.equals(rVar2)) {
            rVar.f68973g.decrementAndGet();
            rVar.f();
        }
        if (rVar2 != null) {
            rVar2.d();
        }
        n74.h0.d(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preRemoveCallback", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$2");
    }
}
