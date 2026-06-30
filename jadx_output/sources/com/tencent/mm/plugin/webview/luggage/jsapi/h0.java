package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class h0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f182325e;

    public h0(sd.b bVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f182324d = bVar;
        this.f182325e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.da daVar;
        com.tencent.mm.ui.da daVar2;
        com.tencent.mm.ui.MMActivity mMActivity = this.f182325e;
        sd.b bVar = this.f182324d;
        if (i17 != 45) {
            if (i17 == 32) {
                if (i18 == -1) {
                    java.lang.String stringExtra = intent.getStringExtra("key_pick_local_media_local_id");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        bVar.c("fail", null);
                    } else {
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a17 = com.tencent.mm.plugin.webview.luggage.util.g.a(stringExtra);
                        if (a17 == null || !(a17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem)) {
                            daVar = null;
                            bVar.c("fail", null);
                        } else {
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem = (com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) a17;
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(dm.i4.COL_LOCALID, stringExtra);
                            hashMap.put("duration", java.lang.Integer.valueOf(webViewJSSDKVideoItem.f182754w));
                            hashMap.put("height", java.lang.Integer.valueOf(webViewJSSDKVideoItem.f182745q));
                            hashMap.put("size", java.lang.Integer.valueOf(webViewJSSDKVideoItem.f182743o));
                            hashMap.put("width", java.lang.Integer.valueOf(webViewJSSDKVideoItem.f182744p));
                            bVar.d(hashMap);
                        }
                    }
                    daVar = null;
                } else if (i18 != 0) {
                    daVar = null;
                    bVar.c("fail", null);
                } else {
                    daVar = null;
                    bVar.c("cancel", null);
                }
                mMActivity.mmSetOnActivityResultCallback(daVar);
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_media_local_id");
            java.lang.String stringExtra3 = intent.getStringExtra("key_pick_local_media_thumb_local_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "localId:%s", stringExtra2);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "thumbLocalId:%s", stringExtra3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                bVar.c("fail", null);
            } else {
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a18 = com.tencent.mm.plugin.webview.luggage.util.g.a(stringExtra2);
                if (a18 == null || !(a18 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem)) {
                    daVar2 = null;
                    bVar.c("fail", null);
                } else {
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem2 = (com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) a18;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put(dm.i4.COL_LOCALID, stringExtra2);
                    hashMap2.put("duration", java.lang.Integer.valueOf(webViewJSSDKVideoItem2.f182754w));
                    hashMap2.put("height", java.lang.Integer.valueOf(webViewJSSDKVideoItem2.f182745q));
                    hashMap2.put("size", java.lang.Integer.valueOf(webViewJSSDKVideoItem2.f182743o));
                    hashMap2.put("width", java.lang.Integer.valueOf(webViewJSSDKVideoItem2.f182744p));
                    hashMap2.put("thumbLocalId", stringExtra3);
                    bVar.d(hashMap2);
                }
            }
            daVar2 = null;
        } else if (i18 != 0) {
            bVar.c("fail", null);
            daVar2 = null;
        } else {
            bVar.c("cancel", null);
            daVar2 = null;
        }
        mMActivity.mmSetOnActivityResultCallback(daVar2);
    }
}
