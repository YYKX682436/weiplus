package ls1;

/* loaded from: classes7.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public static final com.tencent.xweb.y0 a(ls1.c cVar, com.tencent.xweb.WebView webView, java.lang.String str) {
        java.io.InputStream inputStream;
        com.tencent.xweb.y0 y0Var;
        cVar.getClass();
        java.lang.String str2 = null;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewController", "tmpl file not found:" + str);
            return null;
        }
        java.lang.String c17 = q75.g.c(str);
        if (r26.i0.n(str, ".js", false) && nw4.v2.c(webView)) {
            com.tencent.xweb.y2 y2Var = new com.tencent.xweb.y2(3, 256, webView);
            y2Var.f220633c = str;
            y2Var.f220632b = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
            str2 = y2Var.toString();
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            y0Var = new com.tencent.xweb.y0(c17, com.tencent.mapsdk.internal.rv.f51270c, new java.io.ByteArrayInputStream(bytes));
        } else {
            try {
                inputStream = com.tencent.mm.vfs.w6.E(str);
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewController", e17, "", new java.lang.Object[0]);
                inputStream = null;
            }
            if (inputStream == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewController", "stream is null, err");
                return null;
            }
            y0Var = new com.tencent.xweb.y0(c17, com.tencent.mapsdk.internal.rv.f51270c, inputStream);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String hexString = java.lang.Integer.toHexString(str.hashCode() & (-1));
        kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
        java.lang.String lowerCase = hexString.toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        hashMap.put("Cache-Control", "max-age=31536000");
        hashMap.put("ETag", lowerCase);
        if (str2 != null) {
            hashMap.put("RunLocalJS", str2);
        }
        y0Var.f220625e = hashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "readFileWebResp:%s\nETag:%s", str, lowerCase);
        return y0Var;
    }
}
