package x44;

/* loaded from: classes.dex */
public final class o2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451874b;

    public o2(java.lang.String str, yz5.p pVar) {
        this.f451873a = str;
        this.f451874b = pVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.tencent.mars.xlog.Log.e("SnsAdJs.ScanQRCode", "the " + this.f451873a + " download failed!");
        this.f451874b.invoke(-1, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.tencent.mars.xlog.Log.i("SnsAdJs.ScanQRCode", "the " + this.f451873a + " download completed, the path is " + str + '!');
        yz5.p pVar = this.f451874b;
        if (str != null) {
            pVar.invoke(0, str);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pVar.invoke(-1, "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }
}
