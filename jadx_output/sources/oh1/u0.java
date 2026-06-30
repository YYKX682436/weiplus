package oh1;

/* loaded from: classes5.dex */
public enum u0 implements vg3.q4 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f345302d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345303e = false;

    u0() {
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (str == null || !str.equals("PCWxaJsapiNotify")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "subType is err, return");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "consumeNewXml subType:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(p0Var.f70726a.f377561h))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "msg content is null");
            return null;
        }
        if (map.get(".sysmsg.PCWxaJsapiNotify") == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PCWxaJsapiNotify.open_url");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.PCWxaJsapiNotify.appid");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.PCWxaJsapiNotify.notification_content");
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) map.get(".sysmsg.PCWxaJsapiNotify.need_notification"), false);
        if (y17 && com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mjo);
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.PCWxaJsapiNotify.expire_time"), 0L);
        long b17 = c01.id.b();
        boolean z17 = (b17 / 1000) - V > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "appId:%s, expireTime:%d, openUrl:%s, currentServerTime:%d, expire:%b", str3, java.lang.Long.valueOf(V), str2, java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "needNotification:%b, notificationContent:%s", java.lang.Boolean.valueOf(y17), str4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !z17) {
            boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            intent.putExtra("geta8key_scene", 100);
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "isForeground:%b", java.lang.Boolean.valueOf(isForeground));
            if (y17 && !isForeground) {
                com.tencent.mm.sdk.platformtools.u3.i(new oh1.s0(this, str4, intent), 2000L);
                return null;
            }
        }
        return null;
    }
}
