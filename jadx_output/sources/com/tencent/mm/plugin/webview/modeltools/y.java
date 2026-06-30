package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f183364a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f183365b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.protobuf.g f183366c;

    public static void a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        int i17 = (com.tencent.mm.sdk.platformtools.t8.K0(f183364a) || com.tencent.mm.sdk.platformtools.t8.D0(str, f183364a)) ? 0 : 1;
        java.lang.String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        try {
            str4 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
            if (str == null) {
                str = "";
            }
            try {
                str3 = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                e = e17;
                str3 = "";
            }
            try {
                java.lang.String str6 = f183364a;
                if (str6 == null) {
                    str6 = "";
                }
                str5 = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e18) {
                e = e18;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e, "", new java.lang.Object[0]);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13742, 2, str4, str5, str3, java.lang.Integer.valueOf(i17), f183365b);
            }
        } catch (java.io.UnsupportedEncodingException e19) {
            e = e19;
            str3 = "";
            str4 = str3;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13742, 2, str4, str5, str3, java.lang.Integer.valueOf(i17), f183365b);
    }
}
