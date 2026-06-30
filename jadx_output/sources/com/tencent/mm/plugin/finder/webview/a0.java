package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class a0 extends com.tencent.xweb.internal.ProxyWebViewClientExtension {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136824a;

    public a0(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper) {
        this.f136824a = finderWebViewHelper;
    }

    @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
    public java.lang.Object onMiscCallBack(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "method bundle :" + str + "  bundle:" + bundle);
        if (!kotlin.jvm.internal.o.b(str, "shouldInterceptLoadError")) {
            return null;
        }
        int i17 = bundle != null ? bundle.getInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE) : 0;
        java.lang.String str3 = "";
        if (bundle == null || (str2 = bundle.getString("description")) == null) {
            str2 = "";
        }
        if (bundle != null && (string = bundle.getString("failingUrl")) != null) {
            str3 = string;
        }
        com.tencent.mars.xlog.Log.i("Finder.AdWebViewImpl", "errCode :" + i17 + " description:" + str2 + " failingUrl:" + str3);
        this.f136824a.onError();
        return null;
    }
}
