package xc4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xc4.p pVar) {
        super(0);
        this.f453355d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
        xc4.p pVar = this.f453355d;
        java.lang.String j17 = pVar.isAd() ? com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", pVar.U0()) : com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", pVar.U0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$localIDString$2");
        return j17;
    }
}
