package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f171438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlinx.coroutines.q qVar) {
        super(1);
        this.f171438d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$syncGetSnapshotList$2$1");
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$syncGetSnapshotList$2$1");
        kotlin.jvm.internal.o.g(list, "list");
        ((kotlinx.coroutines.r) this.f171438d).resumeWith(kotlin.Result.m521constructorimpl(list));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$syncGetSnapshotList$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$syncGetSnapshotList$2$1");
        return f0Var;
    }
}
