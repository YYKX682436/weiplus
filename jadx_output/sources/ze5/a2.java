package ze5;

/* loaded from: classes9.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f471811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471813f;

    public a2(ot0.q qVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f471811d = qVar;
        this.f471812e = f9Var;
        this.f471813f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f471812e;
        ot0.q qVar = this.f471811d;
        if (qVar == null) {
            qVar = ot0.q.v(f9Var.j());
        }
        com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct sendFileActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct();
        sendFileActionReportStruct.f60184d = this.f471813f;
        sendFileActionReportStruct.f60185e = qVar != null ? qVar.f348682m : 0L;
        java.lang.String str = qVar != null ? qVar.f348690o : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sendFileActionReportStruct.f60186f = sendFileActionReportStruct.b("FileExt", lowerCase, true);
        sendFileActionReportStruct.f60187g = sendFileActionReportStruct.b("ChatName", f9Var.Q0(), true);
        rt0.b bVar = qVar != null ? (rt0.b) qVar.y(rt0.b.class) : null;
        sendFileActionReportStruct.f60188h = sendFileActionReportStruct.b("MsgSvrId", java.lang.String.valueOf(bVar != null ? java.lang.Long.valueOf(bVar.f399372b) : null), true);
        sendFileActionReportStruct.f60189i = 1L;
        sendFileActionReportStruct.k();
    }
}
