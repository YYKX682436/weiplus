package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.ArrayList f183246a;

    public static void a(java.util.List list) {
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "cookies cleanup: url(%s)", str);
            java.lang.String cookie = cookieManager.getCookie(str);
            java.util.LinkedList<java.lang.String> linkedList = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cookie)) {
                java.lang.String[] split = cookie.split(";");
                int length = split.length;
                for (int i17 = 0; i17 < length; i17++) {
                    split[i17] = split[i17].trim();
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (java.lang.String str2 : split) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.contains("=")) {
                        linkedList2.add(str2.split("=")[0]);
                    }
                }
                if (!linkedList2.isEmpty()) {
                    linkedList = linkedList2;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.lang.String[] split2 = android.net.Uri.parse(str).getHost().split("\\.");
                java.lang.String str3 = split2.length <= 1 ? "" : split2[split2.length - 2] + "." + split2[split2.length - 1];
                for (java.lang.String str4 : linkedList) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        cookieManager.setCookie(str, str4 + "=");
                        cookieManager.setCookie(str, str4 + "=;path=/");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            cookieManager.setCookie(str3, str4 + "=;domain=." + str3 + ";path=/");
                        }
                    }
                }
            }
        }
    }
}
