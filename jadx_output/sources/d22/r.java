package d22;

/* loaded from: classes15.dex */
public final class r implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.p f225870a;

    public r(d22.p pVar) {
        this.f225870a = pVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "downloadEmoticonLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "downloadEmoticonLiteApp success appId:%s", this.f225870a.j());
    }
}
