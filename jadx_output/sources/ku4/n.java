package ku4;

/* loaded from: classes5.dex */
public final class n implements com.tencent.mm.plugin.appbrand.service.l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312525a;

    public n(java.lang.String str) {
        this.f312525a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.l6
    public final void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebCanvasStorageLogic", "checkPreviewVersion(appId:" + this.f312525a + "), onError(errCode:" + i17 + ", errMsg:" + str + ')');
    }
}
