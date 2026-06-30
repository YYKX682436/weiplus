package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class j4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.i4 f182969d;

    public j4(com.tencent.mm.plugin.webview.model.i4 i4Var) {
        this.f182969d = i4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "getCdnAuthInfo, mediaId = %s", str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = gVar == null ? "null" : gVar.toString();
        objArr[3] = hVar != null ? hVar.toString() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        com.tencent.mm.plugin.webview.model.l4 Zi = com.tencent.mm.plugin.webview.modeltools.z.Zi();
        Zi.getClass();
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByMediaID error, media id is null or nil");
        } else {
            java.util.Iterator it = Zi.f183003a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem2 = (com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem) it.next();
                java.lang.String str2 = webViewJSSDKFileItem2.f182740i;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals(str)) {
                    webViewJSSDKFileItem = webViewJSSDKFileItem2;
                    break;
                }
            }
        }
        if (webViewJSSDKFileItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "get item by media id failed, media is : %s", str);
            return 0;
        }
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            this.f182969d.h(false, i17, webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182740i, null, null);
            return 0;
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "progressInfo : %s", gVar.toString());
            long j17 = gVar.field_toltalLength > 0 ? (int) ((gVar.field_finishedLength * 100) / r3) : 0L;
            this.f182969d.g(webViewJSSDKFileItem.f182747s, webViewJSSDKFileItem.f182742n, (int) (j17 >= 0 ? j17 > 100 ? 100L : j17 : 0L), webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182740i);
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                this.f182969d.h(false, hVar.field_retCode, webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182740i, null, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "cdn trans suceess, media id : %s, item.mediaId : %s, item.localId: %s", str, webViewJSSDKFileItem.f182740i, webViewJSSDKFileItem.f182736e);
                webViewJSSDKFileItem.e(hVar);
                if (webViewJSSDKFileItem.f182747s && webViewJSSDKFileItem.f182749u) {
                    com.tencent.mm.plugin.webview.model.i4 i4Var = this.f182969d;
                    i4Var.getClass();
                    r45.re4 re4Var = new r45.re4();
                    com.tencent.mm.plugin.webview.model.k4 k4Var = webViewJSSDKFileItem.f182746r;
                    re4Var.f384764e = k4Var.field_aesKey;
                    re4Var.f384766g = k4Var.field_fileLength;
                    re4Var.f384763d = k4Var.field_fileId;
                    re4Var.f384765f = webViewJSSDKFileItem.c();
                    re4Var.f384767h = webViewJSSDKFileItem.b();
                    gm0.j1.d().a(1034, i4Var);
                    gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.t1(webViewJSSDKFileItem.f182735d, webViewJSSDKFileItem.f182736e, re4Var));
                } else {
                    this.f182969d.h(true, 0, webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182739h, webViewJSSDKFileItem.f182746r.field_fileUrl, hVar.field_thumbUrl);
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "decodePrepareResponse, mediaId = %s", str);
        return null;
    }
}
