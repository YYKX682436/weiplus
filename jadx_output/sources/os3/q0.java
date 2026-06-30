package os3;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348175a;

    public q0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, os3.d0 d0Var) {
        this.f348175a = composeUI;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "console, consoleMessage: %s", consoleMessage);
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348175a;
        if (wi6.startsWith(composeUI.U)) {
            composeUI.hideVKB();
            try {
                java.lang.String[] split = java.net.URLDecoder.decode(wi6.substring(composeUI.U.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).split("@@");
                java.lang.String[] split2 = split[0].split(":");
                java.lang.String str = split2[0];
                java.lang.String str2 = split2[1];
                java.lang.String str3 = split2[2];
                java.lang.String str4 = split2[3];
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "img onclick, thumbFileName: %s, src: %s, msgLocalId: %s, msgSvrId: %s, msgTalker: %s", str, split[1], str2, str3, str4);
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(str4, java.lang.Integer.valueOf(str2).intValue());
                android.content.Intent intent = new android.content.Intent(composeUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI.class);
                intent.putExtra("img_msg_id", Li.getMsgId());
                intent.putExtra("img_server_id", Li.I0());
                intent.putExtra("img_download_compress_type", 0);
                intent.putExtra("img_download_username", Li.Q0());
                com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI2 = this.f348175a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(composeUI2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                composeUI2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(composeUI2, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage IMG_ONCLICK, ex = %s", e17.getMessage());
            }
        } else {
            if (wi6.startsWith(composeUI.T)) {
                try {
                    composeUI.P = java.net.URLDecoder.decode(wi6.substring(composeUI.T.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_MAIL_CONTENT, ex = %s", e18.getMessage());
                }
                composeUI.getClass();
                return true;
            }
            if (wi6.startsWith(composeUI.S)) {
                ((java.util.HashMap) composeUI.N).clear();
                try {
                    for (java.lang.String str5 : java.net.URLDecoder.decode(wi6.substring(composeUI.S.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).split("&&")) {
                        java.lang.String[] split3 = str5.split("@@");
                        if (split3.length >= 2) {
                            java.lang.String str6 = split3[0];
                            java.lang.String str7 = split3[1];
                            if (str7.startsWith("file://")) {
                                str7 = str7.replaceFirst("file://", "");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str6, str7);
                            ((java.util.HashMap) composeUI.N).put(str6, str7);
                        }
                    }
                    composeUI.getClass();
                    return true;
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_IMG_INFO, ex = %s", e19.getMessage());
                    return true;
                }
            }
        }
        return false;
    }
}
