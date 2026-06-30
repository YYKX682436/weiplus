package qk;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f364047a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f364048b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f364049c;

    public static java.lang.String a() {
        java.lang.String str = f364049c;
        if (str != null) {
            return str;
        }
        try {
            f364049c = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWxPicUrl");
        } catch (c01.c unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        java.lang.String str2 = f364049c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }

    public static java.lang.String b(java.lang.String str, int i17, boolean z17) {
        boolean z18 = false;
        if (z17) {
            if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) {
                z18 = true;
            }
        }
        return c(str, z18);
    }

    public static java.lang.String c(java.lang.String str, boolean z17) {
        if (f() && z17) {
            java.lang.String[] strArr = f364047a;
            if (strArr == null || strArr.length == 0) {
                d();
            }
            if (e(str)) {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("wxtype");
                if (queryParameter != null) {
                    java.lang.String lowerCase = queryParameter.toLowerCase();
                    if (!lowerCase.equals("gif")) {
                        if (lowerCase.contains("gif")) {
                        }
                    }
                }
                java.lang.String queryParameter2 = parse.getQueryParameter("tp");
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter2) || !queryParameter2.equals("wxpic")) {
                    str = parse.buildUpon().appendQueryParameter("tp", "wxpic").build().toString();
                }
            }
            return str;
        }
        if (m11.n1.g()) {
            java.lang.String[] strArr2 = f364047a;
            if (strArr2 == null || strArr2.length == 0) {
                d();
            }
            if (e(str)) {
                android.net.Uri parse2 = android.net.Uri.parse(str);
                java.lang.String queryParameter3 = parse2.getQueryParameter("wxtype");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter3)) {
                    java.lang.String lowerCase2 = queryParameter3.toLowerCase();
                    if (!lowerCase2.equals("gif") && !lowerCase2.contains("gif")) {
                        java.lang.String queryParameter4 = parse2.getQueryParameter("tp");
                        if ((com.tencent.mm.sdk.platformtools.t8.K0(queryParameter4) || !queryParameter4.equals("webp")) && !com.tencent.mm.sdk.platformtools.t8.K0(lowerCase2)) {
                            str = parse2.buildUpon().appendQueryParameter("tp", "webp").build().toString();
                        }
                    }
                }
            }
        }
        return str;
        return str;
    }

    public static void d() {
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizEnableWxPicUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList, urlList: %s", d17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                return;
            }
            java.lang.String[] split = d17.split(";");
            f364047a = split;
            int length = split.length;
        } catch (c01.c unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    public static boolean e(java.lang.String str) {
        java.lang.String[] strArr = f364047a;
        if (strArr != null && strArr.length > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (java.lang.String str2 : f364047a) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (f364048b == null) {
            f364048b = java.lang.Boolean.TRUE;
        }
        return f364048b.booleanValue();
    }

    public static boolean g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !e(str)) {
            return false;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("tp");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            if (queryParameter.equals("wxpic")) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !e(str)) {
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
