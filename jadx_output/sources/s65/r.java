package s65;

/* loaded from: classes11.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.AppUpdaterUI f403509d;

    public r(com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI) {
        this.f403509d = appUpdaterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        uk.l lVar;
        com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI = this.f403509d;
        if (appUpdaterUI.f192319g.f403544r == 1) {
            s65.o0.g(appUpdaterUI, 6, 0);
        }
        if (!fp.m.c().equals("mounted")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "no sdcard.");
            appUpdaterUI.f192317e.dismiss();
            com.tencent.mm.sandbox.updater.AppUpdaterUI.P6(appUpdaterUI);
            return;
        }
        s65.x0 x0Var = appUpdaterUI.f192319g;
        if ((x0Var.f403548v & 1) != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "package has set external update mode");
            android.net.Uri parse = android.net.Uri.parse(appUpdaterUI.f192319g.f403549w);
            android.content.Intent addFlags = new android.content.Intent("android.intent.action.VIEW", parse).addFlags(268435456);
            if (parse == null || addFlags == null || !com.tencent.mm.sdk.platformtools.t8.I0(appUpdaterUI, addFlags, false, false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "parse market uri failed, jump to weixin.qq.com");
                android.content.Intent addFlags2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(com.tencent.mm.ui.x2.f212539a)).addFlags(268435456);
                try {
                    com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI2 = this.f403509d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(addFlags2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(appUpdaterUI2, arrayList.toArray(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appUpdaterUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(appUpdaterUI2, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppUpdaterUI", e17, "", new java.lang.Object[0]);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppUpdaterUI", "parse market uri ok");
                try {
                    com.tencent.mm.sandbox.updater.AppUpdaterUI appUpdaterUI3 = this.f403509d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(addFlags);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(appUpdaterUI3, arrayList2.toArray(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appUpdaterUI3.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(appUpdaterUI3, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppUpdaterUI", e18, "", new java.lang.Object[0]);
                }
            }
            appUpdaterUI.R6();
            return;
        }
        java.lang.String c17 = com.tencent.mm.sandbox.monitor.l.c(x0Var.f403536j, x0Var.f403547u);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17) && (lVar = appUpdaterUI.f192319g.f403541o) != null) {
            c17 = com.tencent.mm.sandbox.monitor.l.f192296f + lVar.f428502b + ".apk";
            if (!com.tencent.mm.sandbox.monitor.o.c(c17) || !uk.b.a(c17)) {
                c17 = null;
            }
        }
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppUpdaterUI", "update package already exist.");
            com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 8);
            if (appUpdaterUI.f192319g.f403542p) {
                com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 0);
            } else {
                com.tencent.mm.sandbox.updater.AppUpdaterUI.Q6(appUpdaterUI, 9);
            }
            appUpdaterUI.f192319g.l(1, true);
            ((s65.m) appUpdaterUI.f192320h).c(c17);
            return;
        }
        int i18 = appUpdaterUI.f192319g.f403544r;
        int i19 = appUpdaterUI.f192319g.f403530d;
        s65.x0 x0Var2 = appUpdaterUI.f192319g;
        int i27 = x0Var2.f403544r;
        if (i27 == 0) {
            x0Var2.m(false);
            return;
        }
        if (i27 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUpdaterUI", "silence download never go here!");
            return;
        }
        appUpdaterUI.R6();
        android.content.Intent intent = new android.content.Intent(appUpdaterUI.getIntent());
        intent.setClass(appUpdaterUI, com.tencent.mm.sandbox.updater.UpdaterService.class);
        intent.putExtra("intent_extra_run_in_foreground", true);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
        if (appUpdaterUI.f192319g.f403547u) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 56L, 1L, false);
        }
    }
}
