package o93;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f343728a;

    public h() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f343728a = hashMap;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.v5());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.media.c4());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.s2());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.o3());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.contact.n());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.n1());
        ((et.m) ((ft.a4) i95.n0.c(ft.a4.class))).getClass();
        a(new com.tencent.mm.plugin.appbrand.jsapi.r8());
        yc1.s sVar = new yc1.s();
        hashMap.put(sVar.k(), new o93.g(sVar));
        ((yb1.t) ((com.tencent.mm.plugin.lite.api.i) i95.n0.c(com.tencent.mm.plugin.lite.api.i.class))).getClass();
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover = new com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover();
        hashMap.put(jsApiGenRedPackageCover.k(), new o93.g(jsApiGenRedPackageCover));
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppJsApiAppBrandJsApiPool", "init AppBrandServiceJsApiPool takes %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.k0 api) {
        kotlin.jvm.internal.o.g(api, "api");
        this.f343728a.put(api.k(), new o93.g(api));
    }
}
