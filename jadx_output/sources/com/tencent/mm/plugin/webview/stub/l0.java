package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class l0 implements com.tencent.mm.plugin.webview.model.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183542a;

    public l0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183542a = webViewStubService;
    }

    @Override // com.tencent.mm.plugin.webview.model.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183542a;
        if (z17) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("webview_jssdk_file_item_local_id", str);
                bundle.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next()).f183795d.callback(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, bundle);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e17.getMessage());
            }
        }
        if (i17 == 1) {
            if (z17) {
                try {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("webview_jssdk_file_item_local_id", str);
                    bundle2.putInt("webview_jssdk_file_item_progreess", i18);
                    java.util.Iterator it6 = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                    while (it6.hasNext()) {
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it6.next()).f183795d.callback(2003, bundle2);
                    }
                    return;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e18.getMessage());
                    return;
                }
            }
            try {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("webview_jssdk_file_item_server_id", str2);
                bundle3.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it7 = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                while (it7.hasNext()) {
                    ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it7.next()).f183795d.callback(2004, bundle3);
                }
                return;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify download image failed :%s", e19.getMessage());
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "unsupport media type : %d", java.lang.Integer.valueOf(i17));
                return;
            }
            if (z17) {
                try {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString("webview_jssdk_file_item_local_id", str);
                    bundle4.putInt("webview_jssdk_file_item_progreess", i18);
                    java.util.Iterator it8 = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                    while (it8.hasNext()) {
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it8.next()).f183795d.callback(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC, bundle4);
                    }
                    return;
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify upload video failed :%s", e27.getMessage());
                    return;
                }
            }
            return;
        }
        if (z17) {
            try {
                android.os.Bundle bundle5 = new android.os.Bundle();
                bundle5.putString("webview_jssdk_file_item_local_id", str);
                bundle5.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it9 = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
                while (it9.hasNext()) {
                    ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it9.next()).f183795d.callback(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS, bundle5);
                }
                return;
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify upload voice failed :%s", e28.getMessage());
                return;
            }
        }
        try {
            android.os.Bundle bundle6 = new android.os.Bundle();
            bundle6.putString("webview_jssdk_file_item_server_id", str2);
            bundle6.putInt("webview_jssdk_file_item_progreess", i18);
            java.util.Iterator it10 = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
            while (it10.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it10.next()).f183795d.callback(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END, bundle6);
            }
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "notify download voice failed :%s", e29.getMessage());
        }
    }
}
