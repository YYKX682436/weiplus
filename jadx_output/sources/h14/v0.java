package h14;

/* loaded from: classes.dex */
public class v0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map != null) {
            if (!c01.e2.a0()) {
                com.tencent.mars.xlog.Log.i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, isWeChatUser = no.");
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.showWCOpenService.deviceid");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("WeChatServiceChooseListener", "showWCOpenService onNewXmlReceived, deviceUUIdStr = null.");
                return;
            }
            if (ot5.h.f348877a.a(str2, wo.w0.k(), "showWCOpenService", false)) {
                if (!com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI.f160509w) {
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "setting", ".ui.setting.SettingsManageFindOtherServiceUI", new android.content.Intent(), null);
                } else {
                    com.tencent.mars.xlog.Log.i("WeChatServiceChooseListener", "showWCOpenService deviceId already handled, skip startActivity. deviceId = " + str2);
                }
            }
        }
    }
}
