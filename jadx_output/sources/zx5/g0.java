package zx5;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f477242d;

    public g0(int i17) {
        this.f477242d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.c cVar = com.tencent.xweb.b3.f220215c;
        if (cVar != null) {
            com.tencent.mm.plugin.appbrand.ui.gc gcVar = (com.tencent.mm.plugin.appbrand.ui.gc) cVar;
            if (gcVar.f89743a) {
                int i17 = this.f477242d;
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onDownloadProgress, percent = %d", java.lang.Integer.valueOf(i17));
                if (gcVar.f89744b.f89493e != null) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.fc(gcVar, i17));
                }
            }
        }
    }
}
