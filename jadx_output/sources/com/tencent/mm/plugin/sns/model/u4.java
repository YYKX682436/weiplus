package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u4 extends com.tencent.mm.memory.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.plugin.sns.model.l4 l4Var, com.tencent.mm.memory.c cVar) {
        super(cVar);
        java.util.Objects.requireNonNull(cVar);
    }

    @Override // com.tencent.mm.memory.f
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return -1;
    }

    @Override // com.tencent.mm.memory.f
    public long b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return 10485760L;
    }

    @Override // com.tencent.mm.memory.f
    public java.lang.Comparable c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120) * i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 120));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return valueOf;
    }
}
