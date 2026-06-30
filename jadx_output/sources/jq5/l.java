package jq5;

/* loaded from: classes5.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(jq5.l lVar, android.content.Context context, jq5.m mVar) {
        lVar.getClass();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(context.getString(com.tencent.mm.R.string.hht));
        u1Var.g(mVar.f301281c);
        u1Var.n(context.getString(com.tencent.mm.R.string.g6z));
        u1Var.b(new jq5.k(context));
        u1Var.q(false);
    }

    public final iq5.a b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        iq5.a aVar = new iq5.a();
        java.util.List list = aVar.f293803e;
        iq5.d dVar = new iq5.d();
        dVar.f293806d = 1;
        java.lang.String string = context.getString(com.tencent.mm.R.string.ntt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        dVar.f293807e = string;
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.nts);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        dVar.f293808f = string2;
        dVar.f293809g = jq5.c.f301257d;
        dVar.f293810h = new jq5.d(context);
        ((java.util.ArrayList) list).add(dVar);
        iq5.d dVar2 = new iq5.d();
        dVar2.f293806d = 2;
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.nt9);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        dVar2.f293807e = string3;
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.ntr);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        dVar2.f293808f = string4;
        dVar2.f293809g = jq5.e.f301259d;
        dVar2.f293810h = new jq5.g(context);
        ((java.util.ArrayList) list).add(dVar2);
        return aVar;
    }

    public final boolean c() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        for (jq5.m mVar : d(context)) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = mVar.f301279a;
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context2, str, true)) {
                return false;
            }
        }
        return true;
    }

    public final jq5.m[] d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return android.os.Build.VERSION.SDK_INT >= 33 ? new jq5.m[]{new jq5.m("android.permission.NEARBY_WIFI_DEVICES", context.getString(com.tencent.mm.R.string.nxv), context.getString(com.tencent.mm.R.string.nkh))} : new jq5.m[]{new jq5.m("android.permission.ACCESS_FINE_LOCATION", context.getString(com.tencent.mm.R.string.nxv), context.getString(com.tencent.mm.R.string.hkc))};
    }

    public final boolean e() {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[isWiFiEnable] error=" + e17);
            return false;
        }
    }

    public final void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "try jumpApSettingPage");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.TETHER_SETTINGS");
        intent.setFlags(268435456);
        try {
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpApSettingPage] intent not resolve TETHER_SETTINGS, try ACTION_WIRELESS_SETTINGS");
                intent.setAction("android.settings.WIRELESS_SETTINGS");
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpApSettingPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpApSettingPage] error: " + e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f2 -> B:10:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq5.l.g(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
