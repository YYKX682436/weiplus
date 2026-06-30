package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.ArrayList f183286a;

    public static java.lang.String a(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String scheme = uri.getScheme();
            if (com.tencent.mm.sdk.platformtools.t8.K0(scheme)) {
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(scheme);
            sb6.append("://");
            sb6.append(uri.getHost());
            int port = uri.getPort();
            if (!(port == -1 || (scheme.equalsIgnoreCase("http") && port == 80) || (scheme.equalsIgnoreCase("https") && port == 443))) {
                sb6.append(":");
                sb6.append(uri.getPort());
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.CookiesCleanup", "getOrigin fail %s", e17.getMessage());
            return null;
        }
    }
}
