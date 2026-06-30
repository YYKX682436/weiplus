package com.unionpay.utils;

/* loaded from: classes13.dex */
public class UPUtils {
    public static java.lang.String a(int i17, java.lang.String str) {
        try {
            return d(forConfig(i17, str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        if (context == null) {
            return null;
        }
        try {
            str2 = new java.lang.String(qy5.d.a(0, qy5.a.b("0000000023456789abcdef12123456786789abcd".substring(0, 32)), qy5.a.b(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""))), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding).trim();
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return (str2 != null && str2.endsWith("00000000")) ? str2.substring(0, str2.length() - 8) : "";
    }

    public static java.lang.String c(java.lang.String str) {
        try {
            byte[] bytes = str.getBytes();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bytes);
            return qy5.a.a(messageDigest.digest());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String d(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new java.lang.String(bArr, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (context != null) {
            try {
                str3 = qy5.a.a(qy5.d.a(1, qy5.a.b("0000000023456789abcdef12123456786789abcd".substring(0, 32)), (str + "00000000").getBytes(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding)));
            } catch (java.lang.Throwable unused) {
                str3 = "";
            }
            java.lang.String str4 = str3 != null ? str3 : "";
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.putString(str2, str4);
            edit.commit();
        }
    }

    public static java.lang.String f(int i17, java.lang.String str) {
        try {
            return d(forWap(i17, str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static native synchronized byte[] forCallingAppUrl(int i17, boolean z17);

    public static native synchronized byte[] forConfig(int i17, java.lang.String str);

    public static native synchronized byte[] forDirectAppsUrl(int i17, boolean z17);

    public static native synchronized byte[] forScanUrl(int i17, boolean z17);

    public static native synchronized byte[] forUrl(int i17, boolean z17);

    public static native synchronized byte[] forWap(int i17, java.lang.String str);

    public static native synchronized java.lang.String getIssuer(int i17);

    public static native synchronized java.lang.String getSubject(int i17);

    public static native synchronized java.lang.String getTalkingDataIdForAssist(int i17);
}
