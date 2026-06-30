package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class i0 {
    public i0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.sdk.platformtools.t0 a(android.content.Context context, android.net.wifi.WifiManager wifiManager) {
        android.net.wifi.WifiInfo wifiInfo;
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) && (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
                return new com.tencent.mm.sdk.platformtools.t0(wifiInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConnectivityCompat", th6, "get wifi info failed directly", new java.lang.Object[0]);
        }
        try {
            java.util.List list = (java.util.List) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
            kotlin.jvm.internal.o.f(list, "getConfiguredNetworks(...)");
            android.net.wifi.WifiInfo wifiInfo2 = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((android.net.wifi.WifiConfiguration) it.next()).networkId == wifiInfo2.getNetworkId()) {
                    return new com.tencent.mm.sdk.platformtools.t0(wifiInfo2);
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConnectivityCompat", th7, "get wifi info failed from configurations", new java.lang.Object[0]);
        }
        return new com.tencent.mm.sdk.platformtools.t0(null);
    }

    public final void b() {
        com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").putLong("wifi_info_update_timestamp", java.lang.System.currentTimeMillis());
    }

    public final synchronized int c() {
        try {
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return java.lang.Math.abs(h());
            }
            if (!com.tencent.mm.sdk.platformtools.v0.f193029c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConnectivityCompat", "getStrength phone Listener has not been inited");
            }
            com.tencent.mm.sdk.platformtools.j0 j0Var = com.tencent.mm.sdk.platformtools.v0.f193031e;
            boolean z17 = true;
            if (j0Var.f192749a != 1) {
                z17 = false;
            }
            return java.lang.Math.abs(java.lang.Math.abs(z17 ? j0Var.f192751c : (j0Var.f192750b * 2) - 113));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConnectivityCompat", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String d(boolean z17) {
        java.lang.String f17 = f(z17);
        if (kotlin.jvm.internal.o.b(f17, "02:00:00:00:00:00")) {
            return "";
        }
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.o.f(ENGLISH, "ENGLISH");
        java.lang.String lowerCase = f17.toLowerCase(ENGLISH);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final java.lang.String e(boolean z17) {
        java.lang.String j17 = j(z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17) || kotlin.jvm.internal.o.b(j17, "<unknown ssid>")) {
            return "";
        }
        if (r26.i0.y(j17, "\"", false) && r26.i0.n(j17, "\"", false)) {
            j17 = j17.substring(1, j17.length() - 1);
            kotlin.jvm.internal.o.f(j17, "substring(...)");
        }
        return j17;
    }

    public final java.lang.String f(boolean z17) {
        java.lang.String str;
        if (!z17) {
            return (java.lang.String) ((jz5.n) com.tencent.mm.sdk.platformtools.t0.f192978f.a().f192982c).getValue();
        }
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        kotlin.jvm.internal.o.f(u17, "decodeString(...)");
        if (u17.equals("<unknown ssid>")) {
            return "02:00:00:00:00:00";
        }
        java.lang.String u18 = com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_bssid" + u17.hashCode(), null);
        return (u18 == null || (str = com.tencent.mm.sdk.platformtools.m0.f192844c.a(u18).f192845a) == null) ? "02:00:00:00:00:00" : str;
    }

    public final int g(boolean z17) {
        return ((java.lang.Number) ((jz5.n) com.tencent.mm.sdk.platformtools.t0.f192978f.a().f192984e).getValue()).intValue();
    }

    public final int h() {
        return com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").o("connectivity_compat_key_wifi_rssi", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ((r3 != null && r3.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(boolean r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.i0.i(boolean):java.util.List");
    }

    public final java.lang.String j(boolean z17) {
        if (!z17) {
            return (java.lang.String) ((jz5.n) com.tencent.mm.sdk.platformtools.t0.f192978f.a().f192983d).getValue();
        }
        java.lang.String u17 = com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        kotlin.jvm.internal.o.f(u17, "decodeString(...)");
        return u17;
    }

    public final void k() {
        if (com.tencent.mm.sdk.platformtools.v0.f193029c) {
            return;
        }
        com.tencent.mm.sdk.platformtools.v0.f193029c = true;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
        com.tencent.mm.sdk.platformtools.g0 g0Var = new com.tencent.mm.sdk.platformtools.g0(telephonyManager.getPhoneType());
        if (!fp.h.a(31)) {
            com.tencent.mm.sdk.platformtools.f0 f0Var = new com.tencent.mm.sdk.platformtools.f0();
            f0Var.f192660a = g0Var;
            telephonyManager.registerTelephonyCallback(java.util.concurrent.Executors.newSingleThreadExecutor(), f0Var);
            return;
        }
        jz5.g gVar = com.tencent.mm.sdk.platformtools.v0.f193032f;
        ((com.tencent.mm.sdk.platformtools.e0) ((jz5.n) gVar).getValue()).f192546a = g0Var;
        com.tencent.mm.sdk.platformtools.e0 e0Var = (com.tencent.mm.sdk.platformtools.e0) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(256);
        arrayList.add(e0Var);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(telephonyManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver] */
    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "registerReceiver");
        com.tencent.mm.sdk.platformtools.v0.f193030d = new com.tencent.mm.sdk.platformtools.k0();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().removeCapability(14).build();
        com.tencent.mm.sdk.platformtools.k0 k0Var = com.tencent.mm.sdk.platformtools.v0.f193030d;
        kotlin.jvm.internal.o.d(k0Var);
        ((android.net.ConnectivityManager) systemService).registerNetworkCallback(build, k0Var);
        if (com.tencent.mm.sdk.platformtools.v0.f193028b == null) {
            com.tencent.mm.sdk.platformtools.v0.f193028b = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    java.lang.String action = intent != null ? intent.getAction() : null;
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1172645946) {
                            if (action.equals(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "connectivity action updated");
                                com.tencent.mm.sdk.platformtools.v0.f193027a.b();
                                return;
                            }
                            return;
                        }
                        if (hashCode != -385684331) {
                            if (hashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "scan results available, invalid last get time");
                                com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").putInt("connectivity_compat_key_wifi_last_get_time", 0);
                                com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").putLong("wifi_scan_result_update_timestamp", java.lang.System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (action.equals("android.net.wifi.RSSI_CHANGED")) {
                            int intExtra = intent.getIntExtra("newRssi", 0);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "new rssi available, rssi: " + intExtra);
                            com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").A("connectivity_compat_key_wifi_rssi", intExtra);
                            com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
                        }
                    }
                }
            };
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.sdk.platformtools.v0.f193028b, intentFilter);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConnectivityCompat", "connectivity compat receiver has been registered, check " + com.tencent.mm.sdk.platformtools.z3.a());
        }
        com.tencent.mm.sdk.platformtools.o4.M("connectivity_compat").A("connectivity_compat_key_wifi_rssi", 0);
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "unregisterReceiver");
        com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver connectivityCompat$Receiver = com.tencent.mm.sdk.platformtools.v0.f193028b;
        if (connectivityCompat$Receiver != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(connectivityCompat$Receiver);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "unregister connectivity receiver");
        }
        if (com.tencent.mm.sdk.platformtools.v0.f193030d != null) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            com.tencent.mm.sdk.platformtools.k0 k0Var = com.tencent.mm.sdk.platformtools.v0.f193030d;
            kotlin.jvm.internal.o.d(k0Var);
            ((android.net.ConnectivityManager) systemService).unregisterNetworkCallback(k0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "unregister network callback(api >= 24)");
        }
    }
}
