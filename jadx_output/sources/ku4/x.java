package ku4;

/* loaded from: classes5.dex */
public final class x implements com.tencent.mm.plugin.appbrand.service.l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312537a;

    public x(java.lang.String str) {
        this.f312537a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.l6
    public final void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f312537a + "), onError(errCode:" + i17 + ", errMsg:" + str + ')');
    }
}
