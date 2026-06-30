package xc4;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xc4.p pVar) {
        super(0);
        this.f453364d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
        xc4.p pVar = this.f453364d;
        com.tencent.mm.plugin.sns.storage.s2 i17 = pVar.i1();
        r45.qb6 qb6Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(i17 != null ? i17.field_groupStrcut : null)) {
            try {
                r45.qb6 qb6Var2 = new r45.qb6();
                com.tencent.mm.plugin.sns.storage.s2 i18 = pVar.i1();
                kotlin.jvm.internal.o.d(i18);
                qb6Var2.parseFrom(i18.field_groupStrcut);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
                qb6Var = qb6Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Improve.SnsInfo", "parse SnsWsGroupStruct fail:%s", e17.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
            return qb6Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$wsGroupStruct$2");
        return qb6Var;
    }
}
