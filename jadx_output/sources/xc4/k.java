package xc4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xc4.p pVar) {
        super(0);
        this.f453360d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
        int i17 = xc4.p.W1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        xc4.p pVar = this.f453360d;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo.convertFrom(pVar.t0());
        snsInfo.localid = (int) pVar.systemRowid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$snsInfo$2");
        return snsInfo;
    }
}
