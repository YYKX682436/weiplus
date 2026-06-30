package xw4;

/* loaded from: classes8.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(parse.getScheme());
        sb6.append("://");
        sb6.append(parse.getHost());
        sb6.append(":");
        sb6.append(parse.getPort());
        if (com.tencent.mm.sdk.platformtools.t8.L0(parse.getPathSegments())) {
            sb6.append("/");
        } else {
            for (java.lang.String str2 : parse.getPathSegments()) {
                sb6.append("/");
                sb6.append(str2);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(parse.getQuery())) {
            sb6.append("?");
            sb6.append(parse.getQuery());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(parse.getFragment())) {
            sb6.append("#");
            sb6.append(parse.getFragment());
        }
        if (str.endsWith("/")) {
            sb6.append("/");
        }
        return sb6.toString();
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String d17 = d(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewCacheUtils", "evaluateResURLWithScheme, original url is invalid = %s", str);
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(d17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(parse.getScheme());
        sb6.append("://");
        sb6.append(parse.getHost());
        sb6.append(":");
        sb6.append(parse.getPort());
        if (!com.tencent.mm.sdk.platformtools.t8.L0(parse.getPathSegments())) {
            for (java.lang.String str2 : parse.getPathSegments()) {
                sb6.append("/");
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(str2);
            }
        }
        if (str.endsWith("/")) {
            sb6.append("/");
        }
        return sb6.toString();
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String d17 = d(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return null;
        }
        return android.net.Uri.parse(d17).getHost();
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        if (!com.tencent.mm.plugin.webview.luggage.util.g.d(str)) {
            return null;
        }
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String scheme = uri.getScheme();
            java.lang.String str4 = "";
            if (scheme == null) {
                scheme = "";
            }
            java.lang.String lowerCase = scheme.toLowerCase();
            java.lang.String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            java.lang.String lowerCase2 = host.toLowerCase();
            if (com.tencent.mm.sdk.platformtools.t8.K0(lowerCase2)) {
                return null;
            }
            int port = uri.getPort() == -1 ? lowerCase.equalsIgnoreCase("http") ? 80 : com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX : uri.getPort();
            if (com.tencent.mm.sdk.platformtools.t8.K0(uri.getQuery())) {
                str2 = "";
            } else {
                str2 = "?" + uri.getQuery();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(uri.getFragment())) {
                str3 = "";
            } else {
                str3 = "#" + uri.getFragment();
            }
            java.lang.String path = uri.getPath();
            if (path != null) {
                str4 = path;
            }
            java.lang.String str5 = lowerCase + "://" + lowerCase2 + ":" + port + "/" + str4 + str2 + str3;
            if (str5.endsWith("/")) {
                str5 = str5.concat("/");
            }
            return a(str5);
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL URISyntaxException : %s", e17.getMessage());
            return str;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL normal : %s", e18.getMessage());
            return str;
        }
    }
}
