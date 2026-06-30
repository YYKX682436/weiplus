package yn1;

/* loaded from: classes11.dex */
public abstract class k4 {
    public static final java.lang.String a() {
        java.lang.String string;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 25) {
                string = android.provider.Settings.Global.getString(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "device_name");
                if (string == null) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3w);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3w);
                kotlin.jvm.internal.o.d(string);
            }
            return string;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MM.Mig.MigrationTaskUtils", e17, "[getDeviceName] error", new java.lang.Object[0]);
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3w);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
    }

    public static final java.lang.String b() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.net.ConnectivityManager.class);
        connectivityManager.getAllNetworks();
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationTaskUtils", "Result of active network is null");
            return null;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationTaskUtils", "Result of network capability is null");
            return null;
        }
        if (networkCapabilities.hasTransport(0)) {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationTaskUtils", "Current active network is cellular");
            return null;
        }
        android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationTaskUtils", "Result of link properties is null");
            return null;
        }
        java.util.Iterator<android.net.LinkAddress> it = linkProperties.getLinkAddresses().iterator();
        while (it.hasNext()) {
            java.net.InetAddress address = it.next().getAddress();
            if (address instanceof java.net.Inet4Address) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Return current address=");
                java.net.Inet4Address inet4Address = (java.net.Inet4Address) address;
                sb6.append(inet4Address.getHostAddress());
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationTaskUtils", sb6.toString());
                return inet4Address.getHostAddress();
            }
        }
        com.tencent.mars.xlog.Log.w("MM.Mig.MigrationTaskUtils", "Fail to get wifi ip address");
        return null;
    }

    public static final boolean c(bw5.bj0 bj0Var) {
        kotlin.jvm.internal.o.g(bj0Var, "<this>");
        switch (bj0Var.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
            case 14:
            case 16:
            case 17:
                return false;
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 18:
                return true;
            default:
                throw new jz5.j();
        }
    }

    public static final void d(boolean z17) {
        jz5.l[] lVarArr = new jz5.l[1];
        lVarArr[0] = new jz5.l("migrate_scan_callback_status", z17 ? "1" : "0");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("migrate_scan_callback", kz5.c1.i(lVarArr), 34614);
    }

    public static void e(int i17, boolean z17, int i18, long j17, java.lang.String extra, int i19, java.lang.Object obj) {
        jz5.l lVar;
        if ((i19 & 2) != 0) {
            z17 = false;
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        if ((i19 & 16) != 0) {
            extra = "";
        }
        kotlin.jvm.internal.o.g(extra, "extra");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationTaskUtils", "[report26824] action=" + i17 + ", hasTask=" + z17);
        if (z17) {
            yn1.z0 z0Var = yn1.z0.f463933a;
            boolean l17 = z0Var.l();
            bw5.l0 l0Var = bw5.l0.AFFMIG_PHONE;
            lVar = l17 ? z0Var.h() == l0Var ? new jz5.l(301, 100) : new jz5.l(303, 101) : z0Var.h() == l0Var ? new jz5.l(300, 100) : new jz5.l(304, 101);
        } else {
            lVar = new jz5.l(java.lang.Integer.valueOf(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR), 0);
        }
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(26824, intValue + ',' + intValue2 + ',' + i17 + ',' + i18 + ",," + j17 + ",,,," + extra);
    }
}
