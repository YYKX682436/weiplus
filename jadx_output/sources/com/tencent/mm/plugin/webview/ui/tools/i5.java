package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class i5 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f184825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f184827c;

    public i5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.Boolean bool, java.lang.String str) {
        this.f184827c = b5Var;
        this.f184825a = bool;
        this.f184826b = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f184827c;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic share image to friend fail, imgPath is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("web_search_data_ui_image_path", str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(b5Var.f183941i)) {
                b5Var.f183941i = b5Var.j();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(b5Var.f183941i) || !(b5Var.f183941i.startsWith("http://mp.weixin.qq.com/s?") || b5Var.f183941i.startsWith("https://mp.weixin.qq.com/s?") || b5Var.f183941i.startsWith("http://mp.weixin.qq.com/s/") || b5Var.f183941i.startsWith("https://mp.weixin.qq.com/s/"))) {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 14);
            } else {
                bundle.putInt("KWebSearchSendDataImagePath_from_source", 11);
            }
            bundle.putBoolean("web_search_data_ui_image_path_use_circle_to_search", this.f184825a.booleanValue());
            bundle.putString("web_search_data_ui_image_path_origin_url", b5Var.f183941i);
            bundle.putString("web_search_data_ui_image_path_image_url", this.f184826b);
            b5Var.f183947o.getController().A.ng(53, bundle, b5Var.f183947o.getController().U());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic RemoteException:%s", e17.getLocalizedMessage());
        }
    }
}
