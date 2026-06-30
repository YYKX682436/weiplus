package xp1;

/* loaded from: classes12.dex */
public abstract class d {
    public static void a(android.content.Context context, boolean z17, int i17, java.lang.String str, ae0.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        int ordinal = eVar.ordinal();
        intent.putExtra("rawUrl", ordinal != 0 ? ordinal != 1 ? context.getResources().getString(com.tencent.mm.R.string.j4q) : context.getResources().getString(com.tencent.mm.R.string.oyw) : context.getResources().getString(com.tencent.mm.R.string.a4y));
        intent.putExtra("showShare", false);
        intent.putExtra("extra_app_id", str);
        intent.putExtra("extra_permission_and_jump_status", i17);
        j45.l.j(context, "appbrand", ".ui.ShortCutPermissionDetailUI", intent, null);
        if (eVar == ae0.e.APP_BRAND) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15785, java.lang.Integer.valueOf(i17), 0, str);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15784, java.lang.Integer.valueOf(i17), 0, str);
            }
        }
    }

    public static void b(com.tencent.mm.ui.widget.dialog.u1 u1Var, int i17, java.lang.String str, boolean z17) {
        u1Var.f211998c.dismiss();
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15790, java.lang.Integer.valueOf(i17), 0, str);
        }
    }

    public static void c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "offline shorcut walletRegion : %s", java.lang.Integer.valueOf(intValue));
        if (intValue == 0 || intValue == 1 || intValue == 8) {
            arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.tencent.mm.sdk.platformtools.x2.f193071a, "launch_type_offline_wallet").setShortLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.j4i)).setLongLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.j4i)).setIcon(android.graphics.drawable.Icon.createWithResource(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cbc)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_offline_wallet")).build());
        }
        arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.tencent.mm.sdk.platformtools.x2.f193071a, "launch_type_scan_qrcode").setShortLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cfs)).setLongLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cfs)).setIcon(android.graphics.drawable.Icon.createWithResource(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cbd)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_scan_qrcode")).build());
        arrayList.add(new android.content.pm.ShortcutInfo.Builder(com.tencent.mm.sdk.platformtools.x2.f193071a, "launch_type_my_qrcode").setShortLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.j4h)).setLongLabel(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.j4h)).setIcon(android.graphics.drawable.Icon.createWithResource(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cbb)).setIntent(new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_my_qrcode")).build());
        try {
            android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.content.pm.ShortcutManager.class);
            java.util.List<android.content.pm.ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            if (pinnedShortcuts != null && pinnedShortcuts.size() != 0) {
                java.util.Iterator<android.content.pm.ShortcutInfo> it = pinnedShortcuts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.content.pm.ShortcutInfo next = it.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "pinnedShortcut id :" + next.getId());
                    if (next.getId().equals(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cfs))) {
                        xp1.c.a(com.tencent.mm.sdk.platformtools.x2.f193071a, e(com.tencent.mm.sdk.platformtools.x2.f193071a, true), null, null, false);
                        break;
                    }
                }
            }
            shortcutManager.removeDynamicShortcuts(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{"launch_type_scan_qrcode", "launch_type_offline_wallet", "launch_type_my_qrcode"}));
            shortcutManager.addDynamicShortcuts(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "remove error : %s", e17.getMessage());
        }
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String substring;
        if (str == null || str.length() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "process name: %s", com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.Process.myPid()));
        return (!str.startsWith("shortcut_") || str.length() <= 9 || (substring = str.substring(9)) == null || substring.length() <= 0) ? str : xp1.c.h(new java.lang.String(xp1.c.n(substring)), str2);
    }

    public static android.content.Intent e(android.content.Context context, boolean z17) {
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.tencent.mm.R.string.cfs));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.ui.ShortCutDispatchAction");
        intent2.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.tencent.mm.R.drawable.scan_shortcut_icon));
        intent.putExtra("shortcut_icon_resource_id", com.tencent.mm.R.drawable.scan_shortcut_icon);
        return intent;
    }

    public static void f() {
        if (fp.h.c(25)) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            if (!bm5.o1.f22722d.get()) {
                o1Var.n(new xp1.d$$a());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "need addShortCuts");
                c();
            }
        }
    }

    public static void g(android.content.Context context, int i17, int i18, boolean z17, java.lang.String str, ae0.e eVar, yz5.a aVar) {
        android.content.res.Resources resources = context.getResources();
        ae0.e eVar2 = ae0.e.APP_BRAND;
        if (i17 == 0) {
            if (eVar == ae0.e.FINDER && aVar != null) {
                aVar.invoke();
                return;
            }
            com.tencent.mm.ui.widget.snackbar.j.c(resources.getString(com.tencent.mm.R.string.j4r), null, (android.app.Activity) context, null, null);
            if (eVar == eVar2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15787, java.lang.Integer.valueOf(i18), 0, str);
                return;
            }
            return;
        }
        if (z17) {
            if (i18 == 2 || i18 == 4) {
                android.content.res.Resources resources2 = context.getResources();
                com.tencent.mm.ui.widget.snackbar.j.c(resources2.getString(com.tencent.mm.R.string.j4r), resources2.getString(com.tencent.mm.R.string.j4k), (android.app.Activity) context, new xp1.g(context, i18, str, eVar), null);
                if (eVar == eVar2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15787, java.lang.Integer.valueOf(i18), 0, str);
                }
            }
        }
    }

    public static void h(android.content.Context context, int i17, int i18, boolean z17, java.lang.String str, boolean z18) {
        g(context, i17, i18, z17, str, z18 ? ae0.e.APP_BRAND : ae0.e.OTHER, null);
    }

    public static ae0.g i(android.content.Context context, java.lang.String str, boolean z17, ae0.e eVar, ae0.f fVar) {
        int i17;
        boolean z18 = eVar == ae0.e.APP_BRAND;
        l34.i iVar = l34.i.f315436b;
        int a17 = iVar.a();
        boolean b17 = iVar.b();
        com.tencent.mm.autogen.mmdata.rpt.AndroidShortCutPermissionCompactStruct androidShortCutPermissionCompactStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidShortCutPermissionCompactStruct();
        androidShortCutPermissionCompactStruct.f55089d = z18 ? 1L : 0L;
        androidShortCutPermissionCompactStruct.f55090e = androidShortCutPermissionCompactStruct.b("AppId", str, true);
        androidShortCutPermissionCompactStruct.f55091f = a17;
        androidShortCutPermissionCompactStruct.f55092g = b17 ? 1 : 0;
        androidShortCutPermissionCompactStruct.k();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        android.content.res.Resources resources = context.getResources();
        int i18 = -1;
        if (a17 == -1) {
            u1Var.f211996a.f211821b.f211715e = resources.getString(com.tencent.mm.R.string.j4n);
            java.lang.String string = resources.getString(com.tencent.mm.R.string.j4p);
            java.lang.String string2 = resources.getString(com.tencent.mm.R.string.j4m);
            u1Var.u(string);
            if (b17) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487983d8, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f482931s5);
                android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.hro);
                textView.setText(string2);
                textView2.setText(com.tencent.mm.R.string.j4k);
                u1Var.d(linearLayout);
                u1Var.m(com.tencent.mm.R.string.j4j);
                u1Var.j(resources.getString(com.tencent.mm.R.string.f490012ig));
                i17 = 2;
                textView2.setOnClickListener(new xp1.j(context, 2, str, eVar));
                u1Var.v(new xp1.k(iVar, context, z18, 2, str, u1Var, fVar));
            } else {
                i17 = 4;
                u1Var.g(string2);
                u1Var.m(com.tencent.mm.R.string.j4k);
                u1Var.j(resources.getString(com.tencent.mm.R.string.f490012ig));
                u1Var.v(new xp1.l(context, 4, str, eVar, u1Var, z18, fVar));
            }
            i18 = i17;
        } else if (a17 == 1) {
            java.lang.String string3 = resources.getString(com.tencent.mm.R.string.j4o);
            java.lang.String string4 = resources.getString(com.tencent.mm.R.string.j4l);
            u1Var.j(resources.getString(com.tencent.mm.R.string.f490347sg));
            u1Var.u(string3);
            if (b17) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487983d8, (android.view.ViewGroup) null);
                android.widget.TextView textView3 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.f482931s5);
                android.widget.TextView textView4 = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.hro);
                textView3.setText(string4);
                textView4.setText(com.tencent.mm.R.string.j4k);
                u1Var.d(linearLayout2);
                u1Var.m(com.tencent.mm.R.string.j4j);
                i18 = 1;
                textView4.setOnClickListener(new xp1.m(context, 1, str, eVar));
                u1Var.c(new xp1.n(u1Var, 1, str, z18), new xp1.o(iVar, context, z18, 1, str));
            } else {
                u1Var.g(string4);
                u1Var.m(com.tencent.mm.R.string.j4k);
                u1Var.j(resources.getString(com.tencent.mm.R.string.f490347sg));
                i18 = 3;
                u1Var.c(new xp1.e(u1Var, 3, str, z18), new xp1.f(context, 3, str, eVar));
            }
        }
        if (a17 == 0 || z17) {
            return new ae0.g(a17, i18, u1Var.f211998c);
        }
        u1Var.q(false);
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15788, java.lang.Integer.valueOf(i18), 0, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "permissionJumpStatus = " + i18);
        return new ae0.g(a17, i18, u1Var.f211998c);
    }

    public static android.util.Pair j(android.content.Context context, java.lang.String str, boolean z17, boolean z18, ae0.f fVar) {
        ae0.g i17 = i(context, str, z17, z18 ? ae0.e.APP_BRAND : ae0.e.OTHER, fVar);
        return new android.util.Pair(java.lang.Integer.valueOf(i17.f3379a), java.lang.Integer.valueOf(i17.f3380b));
    }
}
