package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public abstract class n2 {
    public static boolean a() {
        try {
            return ((android.location.LocationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(ya.b.LOCATION)).isProviderEnabled("gps");
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    public static boolean b() {
        try {
            return ((android.location.LocationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(ya.b.LOCATION)).isProviderEnabled("network");
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }

    public static void c(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(-1);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
