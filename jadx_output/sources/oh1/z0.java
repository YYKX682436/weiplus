package oh1;

/* loaded from: classes5.dex */
public enum z0 implements vg3.q4 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f345326d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345327e = false;

    z0() {
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (str == null || !str.equals("PCWxaLaunchNotify")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PCWxaLaunchAppNotifyHandler", "subType is err, return");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "consumeNewXml subType:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(p0Var.f70726a.f377561h))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PCWxaLaunchAppNotifyHandler", "msg content is null");
            return null;
        }
        if (map.get(".sysmsg.PCWxaLaunchNotify") == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.path");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.appid");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.version_type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.system_popup_text");
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.scene_note");
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.notification_content");
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.need_notification"), false);
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.PCWxaLaunchNotify.expire_time"), 0L);
        long b17 = c01.id.b();
        boolean z17 = (b17 / 1000) - V > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "appId:%s, expireTime:%d, path:%s, currentServerTime:%d, expire:%b", str3, java.lang.Long.valueOf(V), str2, java.lang.Long.valueOf(b17), java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "needNotification:%b, notificationContent:%s, systemPopupText:%s", java.lang.Boolean.valueOf(y17), str6, str4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !z17) {
            boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = str3;
            b1Var.f317016c = P;
            b1Var.f317034l = str5;
            b1Var.f317022f = str2;
            b1Var.f317032k = 1392;
            b1Var.f317027h0 = str4;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "launchCommon2");
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.appbrand.message.ui.PCWxaLaunchNotifyProxyActivity");
            intent.putExtra("appid", str3);
            intent.putExtra("enter_path", str2);
            intent.putExtra("version_type", P);
            intent.putExtra("sceneNote", str5);
            intent.putExtra("system_popup_text", str4);
            com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "isForeground:%b", java.lang.Boolean.valueOf(isForeground));
            if (y17 && !isForeground) {
                com.tencent.mm.sdk.platformtools.u3.i(new oh1.x0(this, str6, intent), 2000L);
                return null;
            }
        }
        return null;
    }
}
