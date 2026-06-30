package zx5;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f477227d;

    public e0(int i17) {
        this.f477227d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.c cVar = com.tencent.xweb.b3.f220215c;
        if (cVar != null) {
            com.tencent.mm.plugin.appbrand.ui.gc gcVar = (com.tencent.mm.plugin.appbrand.ui.gc) cVar;
            gcVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateFailed, errorCode:" + this.f477227d);
            com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = gcVar.f89744b;
            appBrandXWebDownloadProxyUI.f89492d = null;
            com.tencent.xweb.b3.f220215c = null;
            appBrandXWebDownloadProxyUI.setResult(0, new android.content.Intent());
            appBrandXWebDownloadProxyUI.finish();
        }
    }
}
