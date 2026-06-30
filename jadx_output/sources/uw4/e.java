package uw4;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.plugin.webview.luggage.q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431726b;

    public e(uw4.n nVar) {
        this.f431726b = nVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.q1, com.tencent.xweb.internal.ProxyWebViewClientExtension
    public java.lang.Object onMiscCallBack(java.lang.String str, android.os.Bundle bundle) {
        uw4.n nVar = this.f431726b;
        java.lang.ref.WeakReference weakReference = nVar.K;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "page is null");
            return super.onMiscCallBack(str, bundle);
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "method is null");
            return super.onMiscCallBack(str, bundle);
        }
        if (str.equals("getDrawable")) {
            java.lang.String string = bundle.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
            int i17 = bundle.getInt("resourceId");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && i17 > 0) {
                try {
                    return j65.j.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getResourcesForApplication(string), i17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "get resource for package : %s, fail, : %s", string, e17.getMessage());
                }
            }
        }
        if (str.equals("getShareUrl")) {
            try {
                java.lang.String p17 = ((com.tencent.mm.plugin.webview.luggage.e0) nVar.K.get()).f182178J.p(nVar.getUrl());
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "getShareUrl by x5 core, shareurl = %s", p17);
                return p17;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "getShare url failed");
            }
        }
        if (str.equals("supportImagePreview")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "supportImagePreview");
            return java.lang.Boolean.TRUE;
        }
        if (str.equals("imagePreview")) {
            com.tencent.mm.plugin.webview.modeltools.x0.b(bundle, ((com.tencent.mm.plugin.webview.luggage.e0) nVar.K.get()).f182180p, null, ((com.tencent.mm.plugin.webview.luggage.e0) nVar.K.get()).f406657n.getBoolean("show_full_screen", false));
            return java.lang.Boolean.TRUE;
        }
        if (!str.equals("closeImagePreview")) {
            return super.onMiscCallBack(str, bundle);
        }
        int i18 = com.tencent.mm.plugin.webview.modeltools.x0.f183361b;
        new com.tencent.mm.autogen.events.CloseImagePreviewEvent().e();
        return java.lang.Boolean.TRUE;
    }
}
