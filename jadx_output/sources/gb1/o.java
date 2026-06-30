package gb1;

/* loaded from: classes4.dex */
public class o implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ig f269999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask f270000e;

    public o(com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask reportSubmitFormTask, r45.ig igVar) {
        this.f270000e = reportSubmitFormTask;
        this.f269999d = igVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        synchronized (this.f270000e.getClass()) {
            com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask.B(this.f270000e, this.f269999d.f377010d);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return 0;
    }
}
