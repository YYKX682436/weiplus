package kh0;

/* loaded from: classes8.dex */
public abstract class i {
    public static java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("wechat_pkgid");
            return queryParameter == null ? "" : queryParameter;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WepkgUtilities", e17.getMessage());
            return "";
        }
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !android.webkit.URLUtil.isNetworkUrl(str)) {
            return "";
        }
        try {
            java.lang.String replaceFirst = str.replaceFirst(android.net.Uri.parse(str).getScheme() + "://", "");
            return replaceFirst.contains("?") ? replaceFirst.substring(0, replaceFirst.indexOf("?")) : replaceFirst;
        } catch (java.lang.Exception unused) {
            return str;
        }
    }
}
