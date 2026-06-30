package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class e0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.e0 f185062d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f185063e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f185064f;

    static {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e0 e0Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.e0();
        f185062d = e0Var;
        cf.b.a(e0Var);
        f185063e = com.tencent.mm.vfs.q7.c("luckymoney") + '/';
        f185064f = "23000/wxpaylibpag.wasm";
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        byte[] N;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPackagesResource", "handled, params: " + msg.f340790a);
        java.lang.Object obj = msg.f340790a.get("fromLocale");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        java.lang.Object obj3 = msg.f340790a.get("subtype");
        java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
        java.lang.Object obj5 = msg.f340790a.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
        java.lang.String obj6 = obj5 != null ? obj5.toString() : null;
        boolean z17 = obj2 == null || obj2.length() == 0;
        java.lang.String str2 = f185063e;
        nw4.g gVar = env.f340863d;
        if (z17 || !kotlin.jvm.internal.o.b("true", obj2)) {
            if (!(obj4 == null || obj4.length() == 0)) {
                if (!(obj6 == null || obj6.length() == 0)) {
                    str = str2 + obj4 + '/' + obj6;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPackagesResource", "fail：subtype.isNullOrEmpty() || filename.isNullOrEmpty()");
            gVar.e(msg.f341013c, "getPackagesResource:fail invalid subtype or filename", null);
            return true;
        }
        str = str2 + f185064f;
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPackagesResource", "getPagFromFile，path：" + str + " fileLength： " + k17);
        if (k17 <= 0 || k17 >= 4194304 || (N = com.tencent.mm.vfs.w6.N(str, 0, -1)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPackagesResource", "fail：no file");
            gVar.e(msg.f341013c, "getPackagesResource:fail no file", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String encodeToString = android.util.Base64.encodeToString(N, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        hashMap.put("file", encodeToString);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPackagesResource", "success：get file");
        gVar.e(msg.f341013c, "getPackagesResource:ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodSetCarplayOff;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getPackagesResource";
    }
}
