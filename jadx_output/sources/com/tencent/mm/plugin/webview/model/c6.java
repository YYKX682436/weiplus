package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public abstract class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f182828a = new java.util.HashMap();

    public static void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
            return;
        }
        java.util.Map map = f182828a;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
        } else {
            ((java.util.HashMap) map).put(str, str2);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
            return null;
        }
        java.util.Map map = f182828a;
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            int indexOf = str.indexOf("#");
            str2 = (java.lang.String) ((java.util.HashMap) map).get(indexOf < 0 ? str : str.substring(0, indexOf));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (str.startsWith("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/")) {
                str2 = (java.lang.String) ((java.util.HashMap) map).get(str.replaceFirst("https://", "http://"));
            }
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str : str2;
    }
}
