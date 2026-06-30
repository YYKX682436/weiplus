package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class y5 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187689d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f187690e;

    public y5(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f187689d = weakReference;
        this.f187690e = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData webViewLongClickHelper$ImageQBarData = (com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData) obj;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = (com.tencent.mm.plugin.webview.ui.tools.b5) this.f187689d.get();
        if (b5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(webViewLongClickHelper$ImageQBarData.f183784e);
        java.lang.String str = this.f187690e;
        java.lang.String str2 = webViewLongClickHelper$ImageQBarData.f183784e;
        if (K0 || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + str2 + "   path: " + str);
            return;
        }
        java.util.HashMap hashMap = b5Var.f183942j;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:".concat(str2));
        }
        if (!webViewLongClickHelper$ImageQBarData.f183785f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + str);
            return;
        }
        b5Var.f183943k = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        b5Var.f183944l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b5Var.f183945m.longValue());
        java.util.ArrayList arrayList = b5Var.f183933a;
        arrayList.clear();
        java.util.ArrayList arrayList2 = webViewLongClickHelper$ImageQBarData.f183783d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            arrayList.add((com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList2.get(0));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + arrayList.size());
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.l5(b5Var));
        b5Var.v();
    }
}
