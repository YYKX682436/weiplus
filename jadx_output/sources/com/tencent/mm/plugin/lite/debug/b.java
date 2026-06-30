package com.tencent.mm.plugin.lite.debug;

/* loaded from: classes8.dex */
public abstract class b {
    public static void a(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString("qr_url_query_string", str2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, com.tencent.mm.plugin.lite.debug.d.class, new com.tencent.mm.plugin.lite.debug.a());
    }
}
