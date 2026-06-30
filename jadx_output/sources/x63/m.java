package x63;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f452257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x63.p f452258e;

    public m(x63.p pVar, com.tencent.mm.storage.f9 f9Var) {
        this.f452258e = pVar;
        this.f452257d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f452258e.f452268c;
        com.tencent.mm.storage.f9 f9Var = this.f452257d;
        x63.n nVar = (x63.n) concurrentHashMap.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (nVar != null) {
            com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct solitaireFormatInputEnterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct();
            solitaireFormatInputEnterReportStruct.f60845i = solitaireFormatInputEnterReportStruct.b("Identifier", nVar.f452262d, true);
            solitaireFormatInputEnterReportStruct.f60840d = solitaireFormatInputEnterReportStruct.b("ChatName", nVar.f452259a, true);
            solitaireFormatInputEnterReportStruct.f60841e = f9Var.I0();
            solitaireFormatInputEnterReportStruct.f60842f = nVar.f452260b;
            solitaireFormatInputEnterReportStruct.f60843g = 3L;
            solitaireFormatInputEnterReportStruct.f60844h = nVar.f452261c;
            solitaireFormatInputEnterReportStruct.k();
        }
    }
}
