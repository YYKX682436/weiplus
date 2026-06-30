package gr3;

/* loaded from: classes9.dex */
public abstract class e {
    public static final gr3.d a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        boolean z17 = true;
        if (str == null || r26.n0.N(str)) {
            if (str2 != null && !r26.n0.N(str2)) {
                z17 = false;
            }
            if (!z17) {
                byte[] decode = android.util.Base64.decode(str2, 2);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                return new gr3.d(0L, 0, com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L));
            }
        } else {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
                java.lang.String queryParameter = parse.getQueryParameter("__biz");
                if (queryParameter != null) {
                    byte[] decode2 = android.util.Base64.decode(queryParameter, 2);
                    kotlin.jvm.internal.o.f(decode2, "decode(...)");
                    str3 = new java.lang.String(decode2, r26.c.f368865a);
                } else {
                    str3 = "";
                }
                return new gr3.d(V, P, com.tencent.mm.sdk.platformtools.t8.V(str3, 0L));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("BizProfileReportMgr", "getMsgTriplet failed " + e17);
            }
        }
        return new gr3.d(0L, 0, 0L);
    }

    public static final void b(java.lang.String username, int i17, long j17, android.content.Intent intent, int i18) {
        kotlin.jvm.internal.o.g(username, "username");
        d(username, i17, j17, intent, i18, 0, 0, null, null, null, 0, 0, 4064, null);
    }

    public static final void c(java.lang.String username, int i17, long j17, android.content.Intent intent, int i18, int i19) {
        kotlin.jvm.internal.o.g(username, "username");
        d(username, i17, j17, intent, i18, i19, 0, null, null, null, 0, 0, 4032, null);
    }

    public static void d(java.lang.String username, int i17, long j17, android.content.Intent intent, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, java.lang.String str3, int i28, int i29, int i37, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        int i38 = (i37 & 32) != 0 ? 0 : i19;
        int i39 = (i37 & 64) != 0 ? 0 : i27;
        java.lang.String str4 = (i37 & 128) != 0 ? null : str;
        java.lang.String newSessionId = (i37 & 256) != 0 ? "" : str2;
        java.lang.String base64BizUin = (i37 & 512) != 0 ? "" : str3;
        int i47 = (i37 & 1024) != 0 ? 0 : i28;
        int i48 = (i37 & 2048) == 0 ? i29 : 0;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(newSessionId, "newSessionId");
        kotlin.jvm.internal.o.g(base64BizUin, "base64BizUin");
        sr3.j y07 = com.tencent.mm.plugin.profile.p2.Ai().y0(username);
        java.lang.String str5 = y07 != null ? y07.field_decryptUserName : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String string = (intent == null || (bundleExtra = intent.getBundleExtra("Contact_Ext_Args")) == null) ? "" : bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
        gr3.d a17 = a(str4, base64BizUin);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13307, username, 3, java.lang.Integer.valueOf(i17), 4, str6, java.lang.Integer.valueOf(com.tencent.mm.storage.c2.f193803a), java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(j17), string, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i39), newSessionId, java.lang.Long.valueOf(a17.f274854a), java.lang.Integer.valueOf(a17.f274855b), java.lang.Long.valueOf(a17.f274856c), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i18));
    }
}
