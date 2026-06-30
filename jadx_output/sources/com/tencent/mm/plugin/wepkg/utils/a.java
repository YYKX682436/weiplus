package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a(java.lang.Object... objArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length - 1;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append(java.lang.String.valueOf(objArr[i17]));
            sb6.append(',');
        }
        sb6.append(java.lang.String.valueOf(objArr[length]));
        return sb6.toString();
    }

    public static void b(java.lang.String str, int i17, java.lang.String str2, long j17) {
        wz4.a y07 = wz4.b.z0().y0(str);
        if (y07 != null) {
            java.lang.String a17 = a(str, y07.field_version, 0, java.lang.Integer.valueOf(i17), 0, 0, str2, "", y07.field_oldVersion, 4, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(y07.field_pkgSize));
            jj0.a a18 = jj0.a.a();
            jj0.b bVar = new jj0.b(14229, a17);
            ((com.tencent.mm.game.report.c) a18).getClass();
            com.tencent.mm.game.report.k.a(bVar);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
                str5 = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(java.net.URLDecoder.decode(str5, com.tencent.mapsdk.internal.rv.f51270c));
                jSONObject2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
                str5 = java.net.URLEncoder.encode(jSONObject2.toString(), com.tencent.mapsdk.internal.rv.f51270c);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13980, str, str2, str3, str4, java.lang.Long.valueOf(j17), str5, java.lang.Long.valueOf(j18));
    }

    public static java.lang.String d(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("subCode", i17);
            return java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException | org.json.JSONException unused) {
            return null;
        }
    }
}
