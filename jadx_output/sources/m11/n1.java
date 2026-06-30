package m11;

/* loaded from: classes4.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f322763a;

    public static java.lang.String a(int i17) {
        return java.lang.String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c()), 1);
    }

    public static java.lang.String b(int i17) {
        return java.lang.String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c()), 2);
    }

    public static int c() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            return 5;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 4;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 3;
        }
        return com.tencent.mars.comm.NetStatusUtil.is2G(context) ? 2 : 0;
    }

    public static java.lang.String d(java.lang.String str) {
        android.net.Uri parse;
        if (!g()) {
            return str;
        }
        java.lang.String[] strArr = f322763a;
        if (strArr == null || strArr.length == 0) {
            e();
        }
        if (f(str)) {
            try {
                parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("wxtype");
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    return str;
                }
                java.lang.String lowerCase = queryParameter.toLowerCase();
                if (!lowerCase.equals("gif") && !lowerCase.contains("gif")) {
                    java.lang.String queryParameter2 = parse.getQueryParameter("tp");
                    if ((!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2) && queryParameter2.equals("webp")) || com.tencent.mm.sdk.platformtools.t8.K0(lowerCase)) {
                        return str;
                    }
                }
                return str;
            } catch (java.lang.Exception unused) {
                return str;
            }
        }
        return parse.buildUpon().appendQueryParameter("tp", "webp").build().toString();
    }

    public static void e() {
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWebpUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", d17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                return;
            }
            java.lang.String[] split = d17.split(";");
            f322763a = split;
            int length = split.length;
        } catch (c01.c unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public static boolean f(java.lang.String str) {
        java.lang.String[] strArr = f322763a;
        if (strArr != null && strArr.length > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (java.lang.String str2 : f322763a) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g() {
        if (f322763a == null) {
            e();
        }
        java.lang.String[] strArr = f322763a;
        return strArr != null && strArr.length > 0 && wo.v1.f447833m.F == 1;
    }

    public static boolean h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !f(str)) {
            return false;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("tp");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            if (queryParameter.equals("webp")) {
                return true;
            }
        }
        return false;
    }
}
