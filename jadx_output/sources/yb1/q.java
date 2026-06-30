package yb1;

/* loaded from: classes7.dex */
public final class q implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover f460674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f460675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f460676c;

    public q(com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f460674a = jsApiGenRedPackageCover;
        this.f460675b = lVar;
        this.f460676c = i17;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean isEmpty = list.isEmpty();
        jc1.d dVar = com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80285o;
        if (isEmpty) {
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(this.f460674a, this.f460675b, this.f460676c, dVar, null, 8, null);
            return;
        }
        java.lang.String str = ((xs.g1) kz5.n0.X(list)).f456253c;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] img path '" + str + "' does not exist.");
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(this.f460674a, this.f460675b, this.f460676c, dVar, null, 8, null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.y1.g(str)) {
            str = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(str, 11);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover = this.f460674a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f460675b;
        java.lang.String D = com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.D(jsApiGenRedPackageCover, lVar, str);
        if (D == null) {
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(this.f460674a, this.f460675b, this.f460676c, dVar, null, 8, null);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.E(jsApiGenRedPackageCover, lVar, this.f460676c, kz5.b1.e(new jz5.l(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, D)));
        }
    }
}
