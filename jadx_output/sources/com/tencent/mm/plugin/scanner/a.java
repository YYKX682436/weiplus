package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.a f158657a = new com.tencent.mm.plugin.scanner.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f158658b;

    public final java.lang.String a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQRCodeScanReport", "URLEncode fail, throw : %s", e17.getMessage());
            }
        }
        return str;
    }

    public final void b(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, int i18, java.lang.String str4, boolean z18, boolean z19, java.lang.String str5) {
        if (!z19) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - f158658b < 1000) {
                return;
            } else {
                f158658b = currentTimeMillis;
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22688, str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(z17 ? 1 : 0), a(str3), a(str5), java.lang.Integer.valueOf(z19 ? 1 : 0), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(com.tencent.mm.plugin.scanner.z0.o(i18, str4) ? 1 : com.tencent.mm.plugin.scanner.z0.l(i18, str4) ? 2 : com.tencent.mm.plugin.scanner.z0.h(i18, str4) ? 3 : com.tencent.mm.plugin.scanner.z0.j(i18, str4) ? 4 : com.tencent.mm.plugin.scanner.z0.n(i18, str4) ? 5 : com.tencent.mm.plugin.scanner.z0.i(i18, str4, true) ? 6 : com.tencent.mm.plugin.scanner.z0.d(i18, str4) ? 7 : com.tencent.mm.plugin.scanner.z0.g(i18, str4) ? 8 : 0), a(str4));
    }
}
