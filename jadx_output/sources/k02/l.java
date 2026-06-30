package k02;

/* loaded from: classes8.dex */
public abstract class l {
    public static void a(long j17, boolean z17, j35.d dVar) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || c17.field_status != 3 || !com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
            if (dVar != null) {
                dVar.a(false);
                return;
            }
            return;
        }
        if (!com.tencent.mm.plugin.downloader.model.n0.b(c17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "install, md5 check fail");
            com.tencent.mm.vfs.w6.h(c17.field_filePath);
            com.tencent.mm.plugin.downloader.model.m0.i(j17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(uc1.y1.CTRL_INDEX, 35);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_packageName)) {
            java.lang.String j18 = com.tencent.mm.plugin.downloader.model.r0.j(c17.field_filePath);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
                c17.field_packageName = j18;
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "get package name from file : %s, %s", c17.field_filePath, j18);
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && !com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().canRequestPackageInstalls()) {
            g02.c cVar = new g02.c();
            cVar.a(c17);
            g02.b.c(21, cVar);
        }
        java.lang.String c18 = yb0.a.f460612a.c(c17.field_downloadUrl);
        if (c18 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
            yb0.b.a(c17.field_filePath, c17.field_downloadUrl);
        }
        k02.a aVar = new k02.a(c17, z17, dVar);
        java.lang.String str = c17.field_filePath;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
            g02.c cVar2 = new g02.c();
            cVar2.a(c17);
            cVar2.f267426g = 805;
            g02.b.c(8, cVar2);
            aVar.a(false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "installApk, path = " + str);
        if (com.tencent.mm.vfs.w6.j(str)) {
            b(com.tencent.mm.sdk.platformtools.x2.f193071a, str, aVar);
            return;
        }
        g02.c cVar3 = new g02.c();
        cVar3.a(c17);
        cVar3.f267426g = 805;
        g02.b.c(8, cVar3);
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
        aVar.a(false);
    }

    public static void b(android.content.Context context, java.lang.String str, k02.j jVar) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.sdk.platformtools.i1.f(context, intent, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), "application/vnd.android.package-archive", false);
        intent.addFlags(268435456);
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "installApp");
        if (android.os.Build.BRAND.equals("vivo")) {
            intent.putExtra("installDir", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "is vivo, try to prevent the interception");
        }
        if (i17 >= 26) {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DownloadAppUtil", e17, "install app failed! %s", intent);
                if (jVar != null) {
                    jVar.a(false);
                }
            }
            if (!context.getPackageManager().canRequestPackageInstalls()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "request install apk permission");
                j35.u.n(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + context.getPackageName())), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hht), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g1g), new k02.b(context, intent, jVar));
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "install directly");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (jVar != null) {
            jVar.a(true);
        }
        java.lang.String str22 = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public static void c(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        if (i17 != 4) {
            d(context, str, null);
            return;
        }
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
        if (launchIntentForPackage != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            com.tencent.mm.pluginsdk.model.app.j1.i(bundle, "");
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.addFlags(268435456);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "gamelog.launchGame, launchGameApp, success = " + com.tencent.mm.pluginsdk.model.app.w.v(context, launchIntentForPackage, null, null, null));
        }
    }

    public static void d(android.content.Context context, java.lang.String str, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        k02.c cVar = new k02.c(a5Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "null or nil appid");
            cVar.a(false, false);
        }
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "appinfo is null or appid is null");
            cVar.a(false, false);
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject());
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageAction = null;
        wXMediaMessage.messageExt = "WX_GameCenter";
        if (com.tencent.mm.sdk.platformtools.t8.K0(h17.field_openId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "open id is null or nil, try to get from server:[%s]", h17.field_appName);
            zo3.p.Ui().b(h17.field_appId);
        }
        p95.a.a(new k02.d(context, h17, wXMediaMessage, cVar));
    }

    public static void e(android.content.Context context, int i17, h02.a aVar) {
        int iOSNetType = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        if (iOSNetType == 0) {
            iOSNetType = 1;
        } else if (iOSNetType == 1) {
            iOSNetType = 0;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16099, java.lang.Integer.valueOf(iOSNetType), 17, 1701, 1, java.lang.Integer.valueOf(i17), aVar.field_appId, "", "", java.lang.Long.valueOf(aVar.field_downloadId), java.lang.Integer.valueOf(aVar.field_ssid));
    }

    public static void f(android.content.Context context, h02.a aVar, k02.k kVar) {
        if (context == null || kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "showPauseDialog error context is null or pauseDialogCallback is null");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error context is not Activity");
            kVar.d();
            return;
        }
        if (((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error curActivity.isFinishing()");
            kVar.d();
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new k02.e(context);
        int[] iArr = {0};
        k0Var.f211881s = new k02.f(context, aVar, kVar);
        long j17 = aVar.field_totalSize;
        int i17 = j17 != 0 ? (int) ((aVar.field_downloadedSize * 100) / j17) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(context.getString(com.tencent.mm.R.string.lp6));
        sb6.append(i17);
        sb6.append(context.getString(com.tencent.mm.R.string.lp7));
        k0Var.q(sb6, 17);
        k0Var.m(context.getString(com.tencent.mm.R.string.f492205lp4));
        k0Var.C = new k02.g(iArr, context, aVar, kVar);
        k0Var.n(true);
        k0Var.f211854d = new k02.h(iArr, kVar);
        k0Var.v();
        if (!k0Var.i()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DownloadAppUtil", "showPauseDialog error BottomSheet tryShow failed");
            kVar.d();
        }
        e(context, 1, aVar);
    }
}
