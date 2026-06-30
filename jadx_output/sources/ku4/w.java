package ku4;

/* loaded from: classes7.dex */
public final class w implements com.tencent.mm.plugin.appbrand.service.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312536a;

    public w(java.lang.String str) {
        this.f312536a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.m6
    public final void a(com.tencent.mm.plugin.appbrand.appcache.n9 record, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f312536a + "), onSuccess(path:" + filePath + ')');
    }
}
