package na1;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f335944b;

    public b(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f335943a = str;
        this.f335944b = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent) {
            java.lang.String str = ((com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent) obj).f74992d;
            java.lang.String str2 = this.f335943a;
            if (str2.equals(str)) {
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(str2, this);
                new na1.d().x(this.f335944b, na1.c.BeforeIdentifyQRCode, 0);
            }
        }
    }
}
