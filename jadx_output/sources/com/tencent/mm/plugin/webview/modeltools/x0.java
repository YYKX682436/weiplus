package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f183360a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f183361b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f183362c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f183363d = new java.util.HashMap();

    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path is null");
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.graphics.e.d(str, options);
        if (options.outWidth <= 1 || options.outHeight <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath file path invalid: %s", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1059L, 4L, 1L, false);
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1059L, 3L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path: %s", str);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.os.Bundle r16, com.tencent.mm.ui.widget.MMWebView r17, android.os.Bundle r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.modeltools.x0.b(android.os.Bundle, com.tencent.mm.ui.widget.MMWebView, android.os.Bundle, boolean):void");
    }

    public static void c(java.util.Map map, com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.modeltools.w0 w0Var) {
        if (mMWebView == null || map == null) {
            if (w0Var != null) {
                ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).a();
                return;
            }
            return;
        }
        if (f183361b == -1) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_xweb_url_to_path_v2, 1);
            f183361b = Ni;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "openXWebUrlToPath %d", java.lang.Integer.valueOf(Ni));
        }
        if (!(f183361b == 1)) {
            if (w0Var != null) {
                ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).a();
                return;
            }
            return;
        }
        java.lang.String str = (java.lang.String) map.get("current");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (w0Var != null) {
                ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).a();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = np0.b.f338789a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str3 = np0.b.f338789a;
        sb7.append(str3);
        sb7.append("/");
        sb7.append(new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date(java.lang.System.currentTimeMillis())));
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(sb8);
        java.lang.String str5 = a18.f213279f;
        if (str5 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, null);
        if (!(m19.a() ? m19.f213266a.F(m19.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m27 = b3Var.m(a18, m19);
            if (m27.a()) {
                m27.f213266a.r(m27.f213267b);
            }
        }
        sb6.append(sb8);
        sb6.append("/reader_");
        sb6.append(kk.k.g(str.getBytes()));
        sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        java.lang.String sb9 = sb6.toString();
        if (!com.tencent.mm.vfs.w6.j(sb9)) {
            f183362c = mMWebView.n0(str, sb9, "", new com.tencent.mm.plugin.webview.modeltools.v0(w0Var, str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "getImageBitmapToFile savePath exist");
        ((java.util.HashMap) f183363d).put(str, sb9);
        f183362c = true;
        if (w0Var != null) {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).b();
        }
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !f183362c) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) f183363d).get(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1059L, 5L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1059L, 2L, 1L, false);
        }
        return str2;
    }
}
