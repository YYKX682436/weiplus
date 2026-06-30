package i54;

/* loaded from: classes4.dex */
public final class v implements ca4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i54.x f288825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h54.d f288826b;

    public v(i54.x xVar, h54.d dVar) {
        this.f288825a = xVar;
        this.f288826b = dVar;
    }

    @Override // ca4.a0
    public final void a(java.lang.String str, boolean z17, java.lang.String str2, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doScan$2");
        i54.x.b(this.f288825a, this.f288826b, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$doScan$2");
    }
}
