package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x4 extends com.tencent.mm.memory.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.sns.model.l4 l4Var, com.tencent.mm.memory.i iVar) {
        super(iVar);
        java.util.Objects.requireNonNull(iVar);
    }

    @Override // com.tencent.mm.memory.f
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        return 5;
    }

    @Override // com.tencent.mm.memory.f
    public long b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        return 0L;
    }

    @Override // com.tencent.mm.memory.f
    public java.lang.Comparable c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$20");
        return 1024;
    }
}
