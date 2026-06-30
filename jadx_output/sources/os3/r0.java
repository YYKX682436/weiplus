package os3;

/* loaded from: classes8.dex */
public class r0 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f348182a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348183b;

    public r0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, os3.d0 d0Var) {
        this.f348183b = composeUI;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348183b;
        if (str.startsWith(composeUI.U)) {
            composeUI.hideVKB();
            try {
                java.lang.String[] split = java.net.URLDecoder.decode(str.substring(composeUI.U.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).split("@@");
                java.lang.String[] split2 = split[0].split(":");
                java.lang.String str2 = split2[0];
                java.lang.String str3 = split2[1];
                java.lang.String str4 = split2[2];
                java.lang.String str5 = split2[3];
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "img onclick, thumbFileName: %s, src: %s, msgLocalId: %s, msgSvrId: %s, msgTalker: %s", str2, split[1], str3, str4, str5);
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(str5, java.lang.Integer.valueOf(str3).intValue());
                android.content.Intent intent = new android.content.Intent(composeUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.MailImageDownloadUI.class);
                intent.putExtra("img_msg_id", Li.getMsgId());
                intent.putExtra("img_server_id", Li.I0());
                intent.putExtra("img_download_compress_type", 0);
                intent.putExtra("img_download_username", Li.Q0());
                com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI2 = this.f348183b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(composeUI2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                composeUI2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(composeUI2, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading IMG_ONCLICK, ex = %s", e17.getMessage());
            }
        } else {
            if (str.startsWith(composeUI.T)) {
                try {
                    composeUI.P = java.net.URLDecoder.decode(str.substring(composeUI.T.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_MAIL_CONTENT, ex = %s", e18.getMessage());
                }
                composeUI.getClass();
                return true;
            }
            if (str.startsWith(composeUI.S)) {
                ((java.util.HashMap) composeUI.N).clear();
                try {
                    for (java.lang.String str6 : java.net.URLDecoder.decode(str.substring(composeUI.S.length()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).split("&&")) {
                        java.lang.String[] split3 = str6.split("@@");
                        if (split3.length >= 2) {
                            java.lang.String str7 = split3[0];
                            java.lang.String str8 = split3[1];
                            if (str8.startsWith("file://")) {
                                str8 = str8.replaceFirst("file://", "");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str7, str8);
                            ((java.util.HashMap) composeUI.N).put(str7, str8);
                        }
                    }
                    composeUI.getClass();
                    return true;
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_IMG_INFO, ex = %s", e19.getMessage());
                }
            }
        }
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (this.f348182a) {
            return;
        }
        this.f348182a = true;
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348183b;
        com.tencent.mm.ui.widget.MMWebView mMWebView = composeUI.f154850w;
        java.lang.String str2 = composeUI.T;
        java.lang.String str3 = composeUI.I;
        ((yg0.s4) q3Var).getClass();
        com.tencent.mm.pluginsdk.ui.tools.e9.i(mMWebView, str2, str3, true);
        if (composeUI.getIntent().getBooleanExtra("mail_edit_mode", false)) {
            zg0.q3 q3Var2 = (zg0.q3) i95.n0.c(zg0.q3.class);
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = composeUI.f154850w;
            java.lang.String str4 = composeUI.S;
            java.lang.String str5 = composeUI.H;
            ((yg0.s4) q3Var2).getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.i(mMWebView2, str4, str5, true);
        }
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348183b;
        if (composeUI.V) {
            return;
        }
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.tencent.mm.ui.widget.MMWebView mMWebView = composeUI.f154850w;
        ((yg0.s4) q3Var).getClass();
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        if (mMWebView != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.tools.w8(new com.tencent.mm.pluginsdk.ui.tools.v8(mMWebView)));
        }
        composeUI.V = true;
    }
}
