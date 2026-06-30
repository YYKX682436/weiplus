package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final android.net.Uri f215602a = android.net.Uri.parse("content://cn.nubia.identity/identity");

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = null;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f215602a);
            android.os.Bundle call = acquireUnstableContentProviderClient.call("getAAID", str, null);
            acquireUnstableContentProviderClient.close();
            if (call.getInt("code", -1) == 0) {
                str2 = call.getString(dm.i4.COL_ID);
                com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog succeed:".concat(java.lang.String.valueOf(str2)));
            } else {
                str2 = call.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog failed:".concat(java.lang.String.valueOf(str2)));
            }
        } catch (java.lang.Exception unused) {
        }
        return str2;
    }

    public static java.lang.String b(android.content.Context context) {
        java.lang.String str = null;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f215602a);
            android.os.Bundle call = acquireUnstableContentProviderClient.call(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, null, null);
            acquireUnstableContentProviderClient.close();
            if (call.getInt("code", -1) == 0) {
                str = call.getString(dm.i4.COL_ID);
                com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog succeed:".concat(java.lang.String.valueOf(str)));
            } else {
                str = call.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog failed:".concat(java.lang.String.valueOf(str)));
            }
        } catch (java.lang.Exception unused) {
        }
        return str;
    }

    public static boolean a(android.content.Context context) {
        android.os.Bundle call;
        try {
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f215602a);
            call = acquireUnstableContentProviderClient.call("isSupport", null, null);
            acquireUnstableContentProviderClient.close();
        } catch (java.lang.Exception unused) {
        }
        if (call.getInt("code", -1) == 0) {
            com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog succeed");
            return call.getBoolean("issupport", true);
        }
        com.tencent.tmsqmsp.oaid2.t0.b("NubiaLog failed:" + call.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE));
        return false;
    }
}
