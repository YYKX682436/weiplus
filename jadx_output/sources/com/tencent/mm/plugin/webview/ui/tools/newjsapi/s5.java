package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class s5 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f186515a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f186516b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f186517c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f186518d;

    public s5(java.lang.ref.WeakReference contextReference, java.lang.String callbackId, android.net.Uri schemeUri, java.lang.ref.WeakReference jsApiHandlerReference) {
        kotlin.jvm.internal.o.g(contextReference, "contextReference");
        kotlin.jvm.internal.o.g(callbackId, "callbackId");
        kotlin.jvm.internal.o.g(schemeUri, "schemeUri");
        kotlin.jvm.internal.o.g(jsApiHandlerReference, "jsApiHandlerReference");
        this.f186515a = contextReference;
        this.f186516b = callbackId;
        this.f186517c = schemeUri;
        this.f186518d = jsApiHandlerReference;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        nw4.g gVar = (nw4.g) this.f186518d.get();
        android.content.Context context = (android.content.Context) this.f186515a.get();
        if (gVar == null || context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchAppByScheme", "context or jsApiHandler is recycled ");
            return;
        }
        java.lang.String str2 = this.f186516b;
        if (i17 != 0 || i18 != 0) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("err_desc", "check cgi fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap);
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.zg4 zg4Var = fVar instanceof r45.zg4 ? (r45.zg4) fVar : null;
        if (zg4Var == null || zg4Var.getBaseResponse() == null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("err_desc", "check base resp fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap2);
            return;
        }
        if (zg4Var.getBaseResponse().f376959d != 0) {
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put("err_desc", "check resp fail");
            gVar.e(str2, "launchAppByScheme:fail", linkedHashMap3);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("call doLaunchByScheme:");
        android.net.Uri uri = this.f186517c;
        sb6.append(uri);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchAppByScheme", sb6.toString());
        java.lang.String str3 = zg4Var.f392007d;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.r5 r5Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r5(gVar, this);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(context, intent, str3, r5Var, null);
    }
}
