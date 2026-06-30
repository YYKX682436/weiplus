package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public abstract class n1 {
    public static java.lang.String a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            android.content.pm.PackageInfo packageArchiveInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "get package name from archive filepath  :%s, package name is : %s", str, packageArchiveInfo.packageName);
                return packageArchiveInfo.packageName;
            }
            throw new java.lang.RuntimeException("info is null; " + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApplicationUtil", "get package name from archive file path, failed : %s", e17.getMessage());
            return null;
        }
    }

    public static int b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        try {
            android.content.pm.PackageInfo packageArchiveInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "get package version code from archive filepath  :%s, package version code is : %d", str, java.lang.Integer.valueOf(packageArchiveInfo.versionCode));
                return packageArchiveInfo.versionCode;
            }
            throw new java.lang.RuntimeException("info is null; " + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApplicationUtil", "get package version code from archive file path, failed : %s", e17.getMessage());
            return 0;
        }
    }

    public static void c(android.content.Context context, android.content.Intent intent, j35.d dVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "installApp");
        if (z17 && android.os.Build.BRAND.equals("vivo")) {
            intent.putExtra("installDir", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "is vivo, try to prevent the interception");
        }
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApplicationUtil", e17, "install app failed! %s", intent);
            if (dVar != null) {
                dVar.a(false);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && !context.getPackageManager().canRequestPackageInstalls()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "request install apk permission");
            j35.u.n(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + context.getPackageName())), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hht), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g1g), new com.tencent.mm.pluginsdk.model.app.k1(context, intent, dVar));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "install directly");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (dVar != null) {
            dVar.a(true);
        }
    }

    public static void d(android.content.Context context, java.lang.String str, j35.d dVar, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            e(context, str, dVar, z17);
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e, new com.tencent.mm.pluginsdk.model.app.IPCInstallApp.IPCInstallAppParam(1, str, null, z17), com.tencent.mm.pluginsdk.model.app.IPCInstallApp.class, new com.tencent.mm.pluginsdk.model.app.l1(dVar));
        }
    }

    public static void e(android.content.Context context, java.lang.String str, j35.d dVar, boolean z17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(context, intent, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), "application/vnd.android.package-archive", false);
        intent.addFlags(268435456);
        c(context, intent, dVar, z17);
    }
}
