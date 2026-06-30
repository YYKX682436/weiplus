package com.tencent.mm.plugin.webview.luggage.util;

/* loaded from: classes.dex */
public abstract class g {
    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str) : (com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.webview.luggage.util.e.class);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageWebViewUtil", "get by local id error, local id is null or nil");
        return null;
    }

    public static boolean b() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return gm0.j1.a();
        }
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.webview.luggage.util.f.class);
        if (bundle != null) {
            return bundle.getBoolean("has_set_uin", false);
        }
        return true;
    }

    public static boolean c(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_USERNAME, str);
        android.os.Bundle bundle2 = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.util.d.class);
        if (bundle2 != null) {
            return bundle2.getBoolean("is_biz_contact", false);
        }
        return false;
    }

    public static boolean d(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && (android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str));
    }

    public static org.json.JSONObject e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageWebViewUtil", e17.getMessage());
            return null;
        }
    }

    public static void f(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            runnable.run();
        }
    }
}
