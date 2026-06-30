package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public abstract class c {
    public static android.content.pm.Signature[] a(android.content.Context context, java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidAppUtil", "getSignature, packageName is null");
            return null;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidAppUtil", "getSignature, context is null");
            return null;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidAppUtil", java.lang.String.format(java.util.Locale.ENGLISH, "getPackageInfo for %s, system returns null", str));
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidAppUtil", java.lang.String.format(java.util.Locale.ENGLISH, "getPackageInfo for %s, get exception %s", str, e17));
            return null;
        }
    }
}
