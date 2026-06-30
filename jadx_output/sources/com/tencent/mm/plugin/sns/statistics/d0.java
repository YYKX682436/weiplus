package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class d0 implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f164844b;

    public d0(java.lang.String str, yz5.l lVar) {
        this.f164843a = str;
        this.f164844b = lVar;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
        wa4.q qVar = (wa4.q) fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
        yz5.l lVar = this.f164844b;
        if (qVar == null) {
            wa4.q qVar2 = new wa4.q();
            qVar2.f444275d = this.f164843a;
            lVar.invoke(qVar2);
        } else {
            lVar.invoke(qVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$getSecData$1");
    }
}
