package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public abstract class e9 extends com.tencent.mm.pluginsdk.ui.tools.h9 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.i6 f191608a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f191609b = java.util.regex.Pattern.compile("data:(image|img)/\\S+;base64,\\S+");

    /* renamed from: c, reason: collision with root package name */
    public static int f191610c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f191611d = -1;

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        return ik1.l0.a(context, str, (ik1.k0) nd.f.a(ik1.k0.class));
    }

    public static final java.lang.String c(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                java.lang.Object obj = map.get(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && obj != null && (!(obj instanceof java.lang.String) || !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj))) {
                    if (sb6.length() > 0) {
                        sb6.append("&");
                    }
                    sb6.append(str);
                    sb6.append("=");
                    sb6.append(obj);
                }
            }
        }
        return sb6.toString();
    }

    public static final java.lang.String d(java.lang.String str, int i17) {
        byte[] bytes;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        try {
            bytes = str.getBytes(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException e17) {
            bytes = str.getBytes();
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtil", "getBytes fail, throw : %s", e17.getMessage());
        }
        return android.util.Base64.encodeToString(bytes, i17);
    }

    public static java.lang.String e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return com.tencent.mm.ui.bk.C() ? jSONObject.optString("dark") : jSONObject.optString("light");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtil", e17.getMessage());
            return null;
        }
    }

    public static void f(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.pluginsdk.ui.tools.g9 g9Var) {
        if (f191608a == null) {
            f191608a = new com.tencent.mm.sdk.platformtools.i6(1, "webview-save-image", 1);
        }
        f191608a.a(new com.tencent.mm.pluginsdk.ui.tools.d9(context, str, str2, str3, z17, 1, g9Var, null));
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.pluginsdk.ui.tools.g9 g9Var, com.tencent.mm.pluginsdk.ui.tools.f9 f9Var) {
        if (f191608a == null) {
            f191608a = new com.tencent.mm.sdk.platformtools.i6(1, "webview-save-image", 1);
        }
        f191608a.a(new com.tencent.mm.pluginsdk.ui.tools.d9(context, str, str2, str3, z17, 1, g9Var, f9Var));
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.pluginsdk.ui.tools.g9 g9Var) {
        g(context, str, "", str2, z17, g9Var, null);
    }

    public static void i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, boolean z17) {
        if (webView == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.x8 x8Var = new com.tencent.mm.pluginsdk.ui.tools.x8(webView);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtil", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", str, str2);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.tools.w8(x8Var));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.tools.y8(z17, x8Var, str, str2));
        }
    }

    public static java.lang.String j() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        activeNetworkInfo.getExtraInfo();
        activeNetworkInfo.getType();
        activeNetworkInfo.getExtraInfo();
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    public static java.lang.String k(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && f191609b.matcher(str).matches()) {
            return str.substring(str.indexOf("base64,") + 7).trim();
        }
        return null;
    }

    public static boolean l() {
        int i17 = f191611d;
        if (i17 != -1) {
            return i17 == 1;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && 1 > com.tencent.mars.xlog.Log.getLogLevel()) {
            return true;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_mp_video_share_to_sns, 0);
        f191611d = Ni;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUtil", "mpVideoShareToSns open=%d", java.lang.Integer.valueOf(Ni));
        return f191611d == 1;
    }

    public static void m(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.pluginsdk.ui.tools.f9 f9Var) {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new com.tencent.mm.pluginsdk.ui.tools.t8(context, str, str2, str3, z17, f9Var), new com.tencent.mm.pluginsdk.ui.tools.u8(context));
    }

    public static boolean n() {
        int i17 = f191610c;
        if (i17 != -1) {
            return i17 == 1;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_pagecommit_update_random_str_v2, 1);
        f191610c = Ni;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUtil", "updateRandomStr updateRandomStr=%d", java.lang.Integer.valueOf(Ni));
        return f191610c == 1;
    }
}
