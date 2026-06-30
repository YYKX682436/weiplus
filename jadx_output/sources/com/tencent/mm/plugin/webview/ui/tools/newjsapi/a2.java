package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class a2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.a2 f185935d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("appId");
        if (str == null) {
            str = "";
        }
        boolean z17 = str.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail. invalid appId", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLiteAppPackageInfo", "appid:%s", str);
        com.tencent.liteapp.storage.WxaLiteAppInfo Cj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Cj(str);
        if (Cj == null) {
            gVar.e(msg.f341013c, msg.f341019i + ":fail. cannot find app", null);
            return true;
        }
        java.lang.String Ej = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Cj.path, str, Cj.signatureKey);
        java.lang.String liteAppVersionType = com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersionType(Cj.path, Cj.appId, Cj.signatureKey);
        java.lang.String str2 = liteAppVersionType != null ? liteAppVersionType : "";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("patchId", Cj.patchId);
        hashMap.put("type", Cj.type);
        hashMap.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(Cj.updateTime));
        hashMap.put("version", Ej);
        hashMap.put("versionType", str2);
        gVar.e(msg.f341013c, msg.f341019i + ":success", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 524;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getLiteAppPackageInfo";
    }
}
