package ww4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI f450389a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f450390b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f450391c;

    public b(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        kotlin.jvm.internal.o.g(webViewUI, "webViewUI");
        this.f450389a = webViewUI;
        this.f450390b = webViewUI.getContext();
        this.f450391c = kz5.c0.d("tenpay.com", "pay.weixin.qq.com", "payapp.weixin.qq.com", "wx.tenpay.com", "support.weixin.qq.com", "action.weixin.qq.com", "log.weixin.qq.com", "api.mch.weixin.qq.com", "act.weixin.qq.com", "res.wx.qq.com", "res2.wx.qq.com", "pingjs.qq.com", "badjs.weixinbridge.com", "mmbiz.qpic.cn", "wx.qlogo.cn", "wx.gtimg.com", "weixin110.qq.com", "security.wechat.com", "shminorshort.weixin.qq.com", "kf.qq.com", "act.wechatpay.cn", "gtimg.wechatpay.cn", "tenpay.wechatpay.cn", "reswx.wechatpay.cn", "pay.wechatpay.cn", "payapp.wechatpay.cn", "reswx2.wechatpay.cn");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_fts_quick_h5_domain_block_list_1, "", true);
        kotlin.jvm.internal.o.d(Zi);
        for (java.lang.String str : r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null)) {
            if (str.length() > 0) {
                java.util.ArrayList arrayList = this.f450391c;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "block domain list: ".concat(kz5.n0.g0(this.f450391c, ", ", null, null, 0, null, null, 62, null)));
    }

    public final boolean a(boolean z17, java.lang.String url) {
        boolean z18;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, isShow " + z17);
        java.lang.String host = android.net.Uri.parse(url).getHost();
        if (!(host == null || host.length() == 0)) {
            for (java.lang.String str : this.f450391c) {
                if (!kotlin.jvm.internal.o.b(host, str)) {
                    if (r26.i0.o(host, "." + str, false, 2, null)) {
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "in block list, false!");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "canShowFtsQuickEntry yes!");
            z18 = true;
            boolean z19 = !z17 && z18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, finalRes " + z19);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f450389a;
            kotlin.jvm.internal.o.e(webViewUI, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            webViewUI.getController().L0(false, 101, z19);
            return z19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "host is empty!");
        z18 = false;
        if (z17) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "showEntry, finalRes " + z19);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = this.f450389a;
        kotlin.jvm.internal.o.e(webViewUI2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        webViewUI2.getController().L0(false, 101, z19);
        return z19;
    }
}
