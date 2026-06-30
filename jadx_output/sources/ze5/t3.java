package ze5;

/* loaded from: classes9.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f472200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f472201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472202f;

    public t3(int i17, v05.b bVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472200d = i17;
        this.f472201e = bVar;
        this.f472202f = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v05.a aVar;
        v05.a aVar2;
        v05.a aVar3;
        com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct sendFileActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct();
        sendFileActionReportStruct.f60184d = this.f472200d;
        v05.b bVar = this.f472201e;
        sendFileActionReportStruct.f60185e = (bVar == null || (aVar3 = (v05.a) bVar.getCustom(bVar.f432315e + 8)) == null) ? 0L : aVar3.getLong(aVar3.f368364d + 0);
        java.lang.Long l17 = null;
        java.lang.String r17 = (bVar == null || (aVar2 = (v05.a) bVar.getCustom(bVar.f432315e + 8)) == null) ? null : aVar2.r();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (r17 == null) {
            r17 = "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = r17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sendFileActionReportStruct.f60186f = sendFileActionReportStruct.b("FileExt", lowerCase, true);
        sendFileActionReportStruct.f60187g = sendFileActionReportStruct.b("ChatName", this.f472202f.Q0(), true);
        if (bVar != null && (aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8)) != null) {
            l17 = java.lang.Long.valueOf(aVar.t());
        }
        sendFileActionReportStruct.f60188h = sendFileActionReportStruct.b("MsgSvrId", java.lang.String.valueOf(l17), true);
        sendFileActionReportStruct.f60189i = 1L;
        sendFileActionReportStruct.k();
    }
}
