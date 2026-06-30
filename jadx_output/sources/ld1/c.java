package ld1;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ipc.l0 f318056a = this;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v0 f318057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f318058c;

    public c(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f318058c = d0Var;
        ld1.b bVar = new ld1.b(this);
        this.f318057b = bVar;
        com.tencent.mm.plugin.appbrand.x0.a(d0Var.getAppId(), bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent) {
            java.lang.String str = ((com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent) obj).f82473d;
            com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f318058c;
            if (u46.l.c(str, d0Var.getAppId())) {
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(d0Var.getAppId(), this.f318056a);
                com.tencent.mm.plugin.appbrand.x0.e(d0Var.getAppId(), this.f318057b);
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
                if (t37 != null) {
                    com.tencent.mm.plugin.appbrand.e9 C0 = t37.C0();
                    ld1.e eVar = new ld1.e();
                    eVar.u(C0);
                    eVar.m();
                }
            }
        }
    }
}
