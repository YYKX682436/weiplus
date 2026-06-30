package i54;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i54.x f288818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h54.d f288819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f288820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i54.x xVar, h54.d dVar, ca4.b0 b0Var, java.lang.String str, int i17) {
        super(2);
        this.f288818d = xVar;
        this.f288819e = dVar;
        this.f288820f = b0Var;
        this.f288821g = str;
        this.f288822h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String path = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        kotlin.jvm.internal.o.g(path, "path");
        if (intValue == 0) {
            if ((path.length() > 0) && com.tencent.mm.vfs.w6.j(path)) {
                i54.x xVar = this.f288818d;
                h54.d dVar = this.f288819e;
                ca4.b0 b0Var = this.f288820f;
                java.lang.String qrUrl = this.f288821g;
                kotlin.jvm.internal.o.f(qrUrl, "$qrUrl");
                boolean z17 = this.f288822h == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
                xVar.c(dVar, b0Var, path, qrUrl, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
                return f0Var;
            }
        }
        i54.x.b(this.f288818d, this.f288819e, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doAction$1");
        return f0Var2;
    }
}
