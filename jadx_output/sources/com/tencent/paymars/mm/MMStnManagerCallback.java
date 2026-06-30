package com.tencent.paymars.mm;

/* loaded from: classes12.dex */
public class MMStnManagerCallback implements com.tencent.paymars.mm.MMStnManager.CallBack {
    public static int ACTION_ACK_ASYNC = -100;
    public static int ACTION_ACK_FAILED = 3;
    public static int ACTION_ACK_MALFORMED = 1;
    public static int ACTION_ACK_OK = 0;
    public static int ACTION_ACK_UNSUPPORTED = 2;
    private static java.lang.String TAG = "MMStnManagerCallback";
    static final java.util.List<java.lang.Integer> payCgis = java.util.Arrays.asList(385, 386, 387, java.lang.Integer.valueOf(nd1.u0.CTRL_INDEX), java.lang.Integer.valueOf(nd1.p1.CTRL_INDEX), 390, 391, 392, 393, 394, java.lang.Integer.valueOf(zd.d.CTRL_INDEX), 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 410, java.lang.Integer.valueOf(com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff), 461, 462, 463, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.n1.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.b6.CTRL_INDEX), 467, java.lang.Integer.valueOf(wc1.p.CTRL_INDEX), java.lang.Integer.valueOf(kf1.i.CTRL_INDEX), 470, 471, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.sensor.u.CTRL_INDEX), 473, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.advertise.r.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bio.face.g.CTRL_INDEX), 478, java.lang.Integer.valueOf(com.tencent.wxmm.v2helper.EMethodSetCarplayOff), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.storage.l.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX), 508, 509, 514, 524, 525, java.lang.Integer.valueOf(uc1.x1.CTRL_INDEX), java.lang.Integer.valueOf(be1.x0.CTRL_INDEX), 565, 566, 567, 568, 569, 570, 571, 573, 580, 583, java.lang.Integer.valueOf(nd1.k2.CTRL_INDEX), java.lang.Integer.valueOf(zd.b.CTRL_INDEX), 586, 587, 588, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.e0.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.p1.CTRL_INDEX), 591, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.fakenative.f.CTRL_INDEX), 600, 606, java.lang.Integer.valueOf(com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeFormatUnSupport), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION), 844, 859, 1002, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT), 1109, 1120, 1211, 1230, 1241, 1256, 1257, 1259, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.x4.CTRL_INDEX), java.lang.Integer.valueOf(zd1.o.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX), java.lang.Integer.valueOf(eh1.b.CTRL_INDEX), 1280, 1281, java.lang.Integer.valueOf(cc1.s.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX), 1304, 1305, 1317, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.audio.i0.CTRL_INDEX), java.lang.Integer.valueOf(zd1.s.CTRL_INDEX), 1323, 1324, 1335, 1336, 1338, 1340, 1344, 1348, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.dd.CTRL_INDEX), 1370, java.lang.Integer.valueOf(hb1.a.CTRL_INDEX), 1376, 1378, 1380, java.lang.Integer.valueOf(tb1.n0.CTRL_INDEX), 1385, 1386, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.finder.g0.CTRL_INDEX), java.lang.Integer.valueOf(v31.d.CTRL_INDEX), java.lang.Integer.valueOf(v31.k.CTRL_INDEX), 1477, 1488, 1495, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX), 1502, 1503, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.x0.CTRL_INDEX), java.lang.Integer.valueOf(hc1.i.CTRL_INDEX), 1506, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.auth.f2.CTRL_INDEX), 1508, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX), 1510, 1511, 1512, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.game.g.CTRL_INDEX), 1514, 1515, 1516, 1517, java.lang.Integer.valueOf(com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.minigame.download.mmdownloader.k.CTRL_INDEX), 1527, 1529, 1530, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.m0.CTRL_INDEX), 1535, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX), 1537, 1540, 1542, 1543, 1544, 1545, 1551, 1552, 1554, 1555, 1556, 1558, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bio.face.p.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.bio.face.q.CTRL_INDEX), 1561, 1562, 1563, 1564, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX), 1566, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, java.lang.Integer.valueOf(fe1.i.CTRL_INDEX), java.lang.Integer.valueOf(fe1.t.CTRL_INDEX), java.lang.Integer.valueOf(fe1.o.CTRL_INDEX), java.lang.Integer.valueOf(fe1.l.CTRL_INDEX), java.lang.Integer.valueOf(fe1.f.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.liteapp.d.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.u6.CTRL_INDEX), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX), 1588, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.emoji.m.CTRL_INDEX), 1590, 1591, 1592, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.game.h.CTRL_INDEX), 1594, 1595, 1596, 1597, 1598, 1599, 1600, 1601, 1602, 1603, 1604, 1605, 1606, 1607, 1608, 1610, 1612, 1613, 1614, 1616, 1617, 1618, 1622, 1623, 1624, 1625, 1628, 1629, 1630, 1631, 1633, 1638, 1639, 1640, 1641, 1643, 1644, 1645, 1647, 1648, 1649, 1650, 1652, 1653, 1654, 1655, 1656, 1659, 1663, 1664, 1665, 1666, 1667, 1668, 1669, 1672, 1674, 1675, 1676, 1679, 1680, 1682, 1684, 1685, 1686, 1688, 1689, 1691, 1692, 1694, 1695, 1697, 1698, 1699, 1724, 1725, 1735, 1736, 1737, 1742, 1752, 1753, 1754, 1767, 1768, 1769, 1770, 1773, 1779, 1782, 1786, 1800, 1805, 1809, java.lang.Integer.valueOf(com.tencent.trtc.hardwareearmonitor.honor.HonorResultCode.PERMISSION_CHECK_REJECT), 1813, 1820, 1827, 1830, 1836, 1837, 1855, 1859, java.lang.Integer.valueOf(com.tencent.nativecrash.NativeCrash.DEFAULT_SHORT_FLAGS), 1878, 1888, 1891, 1903, 1904, 1906, 1907, 1914, 1916, 1917, 1922, 1923, 1930, 1950, 1953, 1958, 1960, 1963, 1964, 1965, 1966, 1967, 1970, 1971, 1972, 1973, 1976, 1978, 1979, 1981, java.lang.Integer.valueOf(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_NO_EXIF), java.lang.Integer.valueOf(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN), java.lang.Integer.valueOf(com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT), 1986, 1987, 1988, 1990, 1992, 1993, 1997, java.lang.Integer.valueOf(com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE), 2501, 2504, 2505, 2506, 2507, 2508, 2512, 2514, 2515, 2516, 2519, 2520, 2527, 2529, 2532, 2533, 2541, 2542, 2544, 2545, 2547, 2549, 2551, 2553, 2554, 2556, 2557, 2561, 2562, 2565, 2567, 2568, 2570, 2573, 2576, 2581, 2584, 2585, 2589, 2590, 2595, 2598, 2607, 2609, 2612, 2613, 2614, 2615, 2616, 2618, 2620, 2621, 2622, 2626, 2628, 2629, 2630, 2632, 2633, 2635, 2642, 2652, 2654, 2655, 2658, 2659, 2661, 2662, 2663, 2665, 2666, 2668, 2671, 2672, 2673, 2675, 2677, 2680, 2682, 2685, 2686, 2687, 2689, 2693, 2694, 2696, 2697, 2699, 2702, 2704, 2705, 2708, 2713, 2714, 2715, 2719, 2720, 2722, 2724, 2725, 2726, 2728, 2730, 2732, 2736, 2737, 2739, 2740, 2741, 2742, 2745, 2750, 2752, 2753, 2755, 2756, 2760, 2764, 2765, 2767, 2773, 2774, 2780, 2783, 2784, 2786, 2791, 2796, 2797, 2798, 2800, 2801, 2803, 2806, 2807, 2811, 2814, 2815, 2817, 2820, 2821, 2823, 2824, 2825, 2826, 2828, 2840, 2841, 2844, 2845, 2847, 2848, 2849, 2850, 2851, 2852, 2853, 2856, 2858, 2860, 2861, 2862, 2863, 2867, 2868, 2870, 2871, 2872, 2876, 2878, 2880, 2882, 2886, 2887, 2888, 2892, 2894, 2896, 2901, 2907, 2910, 2911, 2916, 2923, 2924, 2925, 2926, 2927, 2928, 2929, 2930, 2931, 2935, 2938, 2939, 2941, 2952, 2956, 2958, 2960, 2961, 2969, 2970, 2971, 2976, 2980, 2983, 2984, 2987, 2990, 2992, 2993, 2996, 2997, 3505, 3521, 3555, 3570, 3572, 3573, 3584, 3591, 3634, 3651, 3665, 3671, 3708, 3730, 3766, 3768, 3774, 3780, 3781, 3795, 3801, 3857, 3858, 3885, 3920, 3962, 3989);
    private byte _hellAccFlag_;
    public com.tencent.mm.sdk.platformtools.r2 UUID_CACHE = new com.tencent.mm.sdk.platformtools.r2(100);
    private int totalWifiRecv = 0;
    private int totalWifiSend = 0;
    private int totalMobileRecv = 0;
    private int totalMobileSend = 0;
    private long lastReportTime = 0;
    private final java.util.Set<com.tencent.mm.network.b0> netCallbacks = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.locks.Lock f215214l = new java.util.concurrent.locks.ReentrantLock();

    private java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private int getPidByProcessName(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i(TAG, "getPicByProcessName() processName == null");
            return -1;
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.tencent.mars.xlog.Log.i(TAG, "getPicByProcessName() processes == null");
                return -1;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getPidByProcessName() %s %s %s", str, e17.getClass().getSimpleName(), e17.getMessage());
            return -1;
        }
    }

    private void killMainProcess() {
        int pidByProcessName = getPidByProcessName(com.tencent.mm.sdk.platformtools.w9.f193053a);
        java.lang.String str = TAG;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(pidByProcessName);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(str, "killPushProcess() pid = %s, stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        killProcess(pidByProcessName);
    }

    private void killProcess(int i17) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/mm/MMStnManagerCallback", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/paymars/mm/MMStnManagerCallback", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "killProcess %s, %s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$OnActionNotify$0(byte[] bArr) {
        com.tencent.mm.network.x2.f().a(326, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$OnActionNotify$1(byte[] bArr) {
        com.tencent.mm.network.x2.f().a(327, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$OnActionNotify$2(byte[] bArr) {
        com.tencent.mm.network.x2.f().a(328, bArr);
    }

    private boolean needNotifyDeveloper() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    private void notifyPayCgiDeveloper(java.lang.String str, java.lang.String str2) {
        needNotifyDeveloper();
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int OnActionNotify(java.lang.String str, long j17, final byte[] bArr, byte[] bArr2, final byte[] bArr3, final long j18) {
        com.tencent.mars.xlog.Log.i(TAG, "[OnActionNotify] code: %d, uuid: %s, taskid:%d", java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(j18));
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "[OnActionNotify] e: " + e17.getMessage());
        }
        if (this.UUID_CACHE.k(str) && j17 != 5) {
            com.tencent.mars.xlog.Log.i(TAG, "[OnActionNotify] uuid = " + str + ", is Repeated");
            return ACTION_ACK_OK;
        }
        this.UUID_CACHE.put(str, str);
        if (j17 == 2) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.network.x2.f().a(com.tencent.mapsdk.internal.km.f50100e, bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        if (j17 == 4) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.network.x2.f().a(322, bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        if (j17 == 7) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.7
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.network.x2.f().a(com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX, bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        if (j17 == 5) {
            if (bArr == null) {
                return ACTION_ACK_FAILED;
            }
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        r45.jy5 jy5Var = new r45.jy5();
                        jy5Var.f378218d = com.tencent.mm.protobuf.g.b(bArr);
                        jy5Var.f378219e = com.tencent.mm.protobuf.g.b(bArr3);
                        jy5Var.f378220f = j18;
                        com.tencent.mm.network.x2.f().a(321, jy5Var.toByteArray());
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.paymars.mm.MMStnManagerCallback.TAG, e18, null, new java.lang.Object[0]);
                    }
                }
            });
            return ACTION_ACK_ASYNC;
        }
        if (j17 == 8) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.paymars.mm.MMStnManagerCallback.lambda$OnActionNotify$0(bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        if (j17 == 9) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.paymars.mm.MMStnManagerCallback.lambda$OnActionNotify$1(bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        if (j17 == 11) {
            if (bArr != null) {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.paymars.mm.MMStnManagerCallback.lambda$OnActionNotify$2(bArr);
                    }
                });
            }
            return ACTION_ACK_OK;
        }
        return ACTION_ACK_UNSUPPORTED;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int ackActionNotify(java.lang.String str, long j17, int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "action notify task=" + j17 + ",result=" + i17);
        return ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).mmAckActionNotify(str, j17, i17);
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void addMMNetCommonCallback(android.os.IInterface iInterface) {
        if (iInterface == null) {
            com.tencent.mars.xlog.Log.w(TAG, "add net callback is null");
        } else {
            if (!(iInterface instanceof com.tencent.mm.network.b0)) {
                com.tencent.mars.xlog.Log.e(TAG, "Callback type mismatch!");
                return;
            }
            this.f215214l.lock();
            this.netCallbacks.add((com.tencent.mm.network.b0) iInterface);
            this.f215214l.unlock();
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.tencent.mm.network.x2.h() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr2[0];
        int i28 = iArr3[0];
        try {
            return com.tencent.mm.network.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return -1;
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        com.tencent.mars.xlog.Log.i(TAG, "certifivate verify for %s", str);
        try {
            com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "RSA", str);
            com.tencent.mars.xlog.Log.i(TAG, "host %s verify result %d, isknownroots %b", str, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()));
            return verifyServerCertificates.getStatus();
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getLocalizedMessage());
            return -1;
        } catch (java.security.KeyStoreException e18) {
            com.tencent.mars.xlog.Log.e(TAG, e18.getLocalizedMessage());
            return -1;
        } catch (java.security.NoSuchAlgorithmException e19) {
            com.tencent.mars.xlog.Log.e(TAG, e19.getLocalizedMessage());
            return -1;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e(TAG, e27.getLocalizedMessage());
            return -1;
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        return 0;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void doNetIdRequest() {
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public java.lang.String getCurLanguage() {
        try {
            return com.tencent.mm.sdk.platformtools.m2.d();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getHostByName(java.lang.String str, java.util.List<java.lang.String> list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).getHostIps(str, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public java.lang.String getIntegerExpt() {
        com.tencent.mars.xlog.Log.e(TAG, "getIntegerExpt has not been implemented on android");
        return "";
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getJavaActionId(long j17) {
        switch ((int) j17) {
            case 1:
                return 10955;
            case 2:
                return 10104;
            case 3:
                return 10103;
            case 4:
                return 10105;
            case 5:
                return 10102;
            case 6:
                return 10101;
            case 7:
                return 1105;
            case 8:
                return 10428;
            case 9:
                return -1;
            case 10:
                return -2;
            case 11:
                return -3;
            default:
                return 0;
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getLogIdSubType(long j17, java.lang.String str) {
        if (j17 == 11108) {
            try {
                if (payCgis.contains(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)))) {
                    return 1;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getSnsIpsForScene(java.util.List<java.lang.String> list, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).getSnsIps(z17, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = "mmsns.qpic.cn";
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getSnsIpsForSceneWithHostName(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).getSnsIpsWithHostName(str, z17, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        reportStat(reportInfo);
        return getDnsReturn.type;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public java.lang.String getUserIDCLocale() {
        try {
            return com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "HK" : "CN";
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int getXAgreementId() {
        int i17 = com.tencent.mm.sdk.platformtools.n9.f192884a;
        com.tencent.mars.xlog.Log.i("C2Java", "MMLogic get xagreement id %s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public java.lang.String ifUseNewNetId() {
        java.lang.String a17 = j62.e.g().a("clicfg_mars_use_new_netid", "1", false, true);
        com.tencent.mars.xlog.Log.i("C2Java", "use new netid flag is " + a17);
        return a17 == null ? "0" : a17;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public int isOverseasUser() {
        java.lang.String a17 = j62.e.g().a("clicfg_android_newdns_cn", "1", false, true);
        com.tencent.mars.xlog.Log.i(TAG, "newdns use cn flag is " + a17);
        if ("0".equals(a17)) {
            return 1;
        }
        return com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 0;
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.tencent.mm.network.x2.c().f72004y.networkAnalysisCallBack(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void notifyNewSpeedTestReport(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37) {
        if (com.tencent.mm.network.x2.f() == null) {
            com.tencent.mars.xlog.Log.e("C2Java", "notifyNewSpeedTestReport failed");
            return;
        }
        r45.zc6 zc6Var = new r45.zc6();
        zc6Var.f391914h = i17;
        zc6Var.f391915i = i18;
        zc6Var.f391916m = i19;
        zc6Var.f391917n = i27;
        zc6Var.f391910d = com.tencent.mm.protobuf.g.b(bArr);
        zc6Var.f391912f = "";
        zc6Var.f391911e = "";
        zc6Var.f391913g = "";
        if (i37 == 3) {
            zc6Var.f391911e = "dual";
        }
        r45.wc6 wc6Var = new r45.wc6();
        r45.wc6 wc6Var2 = new r45.wc6();
        wc6Var.f389070d = str;
        wc6Var.f389071e = i28;
        wc6Var2.f389070d = str2;
        wc6Var2.f389071e = i29;
        zc6Var.f391919p = wc6Var;
        zc6Var.f391918o = wc6Var2;
        new java.lang.String(bArr);
        int length = bArr.length;
        int length2 = zc6Var.f391910d.f192156a.length;
        try {
            final byte[] byteArray = zc6Var.toByteArray();
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(zc1.b.CTRL_INDEX, byteArray);
                }
            });
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("C2Java", "notifyNewSpeedTestReport :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void notifyPayCgiNewDnsTagIncorrect(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e(TAG, "your pay cgi should not be marked with pay newdns tag, please verify and remove it, cgiId: %d, cgiUrl: %s", java.lang.Integer.valueOf(i17), str);
        notifyPayCgiDeveloper("⚠️支付cgi错打newdns业务标记", java.lang.String.format("支付cgi:[id: %d, url: %s] 错打了newdns业务标记，请确认去掉标记后再行测试，点击确定将退出微信", java.lang.Integer.valueOf(i17), str));
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void notifyPayCgiNewDnsTagMiss(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e(TAG, "your pay cgi should be marked with pay newdns tag, please verify and add it, cgiId: %d, cgiUrl: %s", java.lang.Integer.valueOf(i17), str);
        notifyPayCgiDeveloper("⚠️支付cgi漏打newdns业务标记", java.lang.String.format("支付cgi:[id: %d, url: %s] 漏打了newdns业务标记，请确认补充标记后再行测试，点击确定将退出微信", java.lang.Integer.valueOf(i17), str));
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void notifyStnWeaknet(final boolean z17) {
        com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.9
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArr = new byte[1];
                if (z17) {
                    bArr[0] = 1;
                }
                com.tencent.mm.network.x2.f().a(10098, bArr);
            }
        });
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void onDisasterNodeNotify(java.lang.String str) {
        com.tencent.mm.network.g2.a(str);
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void onLiveSpeedTestCallback(com.tencent.paymars.mm.LiveSpeedTestResult liveSpeedTestResult, boolean z17) {
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void onOOBNotify(final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("C2Java", "onOOBNotify:" + str);
        if (com.tencent.mm.network.x2.f() == null) {
            com.tencent.paymars.mm.Assert.assertTrue(false);
            return;
        }
        try {
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(268369923, com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : str.getBytes());
                }
            });
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("C2Java", "onOOBNotify :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void receiveWeakNetNotify(boolean z17, int i17) {
        this.f215214l.lock();
        try {
            try {
                for (com.tencent.mm.network.b0 b0Var : this.netCallbacks) {
                    if (b0Var != null) {
                        b0Var.Xe(z17, i17);
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String str = TAG;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e(str, "receiveWeakNetNotify : %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } finally {
            this.f215214l.unlock();
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void removeMMNetCommonCallback(android.os.IInterface iInterface) {
        if (iInterface == null) {
            com.tencent.mars.xlog.Log.w(TAG, "remove net callback is null");
        } else {
            if (!(iInterface instanceof com.tencent.mm.network.b0)) {
                com.tencent.mars.xlog.Log.e(TAG, "Callback type mismatch!");
                return;
            }
            this.f215214l.lock();
            this.netCallbacks.remove((com.tencent.mm.network.b0) iInterface);
            this.f215214l.unlock();
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void reportFlow(int i17, int i18, int i19, int i27) {
        int i28 = this.totalWifiRecv + i17;
        this.totalWifiRecv = i28;
        int i29 = this.totalWifiSend + i18;
        this.totalWifiSend = i29;
        int i37 = this.totalMobileRecv + i19;
        this.totalMobileRecv = i37;
        int i38 = this.totalMobileSend + i27;
        this.totalMobileSend = i38;
        int i39 = i37 + i38 + i28 + i29;
        final u31.c cVar = com.tencent.mm.network.x2.g().f72184a;
        com.tencent.mars.xlog.Log.i("C2Java", "reportNetFlow time[%d,%d] sum:%d wr[%d,%d] ws[%d,%d] mr[%d,%d] ms[%d,%d] fgbg:%b Moniter:%s", java.lang.Long.valueOf(this.lastReportTime), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(this.lastReportTime)), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.totalWifiRecv), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.totalWifiSend), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.totalMobileRecv), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.totalMobileSend), java.lang.Boolean.valueOf(z65.c.f470455a), cVar);
        if (cVar == null) {
            return;
        }
        if (i39 >= 102400 || com.tencent.mm.sdk.platformtools.t8.H1(this.lastReportTime) >= 30) {
            this.lastReportTime = com.tencent.mm.sdk.platformtools.t8.i1();
            final int i47 = this.totalWifiRecv;
            this.totalWifiRecv = 0;
            final int i48 = this.totalWifiSend;
            this.totalWifiSend = 0;
            final int i49 = this.totalMobileRecv;
            this.totalMobileRecv = 0;
            final int i57 = this.totalMobileSend;
            this.totalMobileSend = 0;
            try {
                com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            cVar.si(i47, i48, i49, i57);
                        } catch (java.lang.Throwable th6) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.e("C2Java", "reportFlowData :%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
                        }
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("C2Java", "reportFlowData :%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            }
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.j(arrayList, z17, z18);
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19) {
        jx3.f.INSTANCE.e((int) j17, (int) j18, str, z18, z17, z19);
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void reportStat(final com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo) {
        try {
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    int javaActionId = com.tencent.paymars.mm.MMStnManagerCallback.this.getJavaActionId(reportInfo.actionId);
                    if (javaActionId == 0) {
                        com.tencent.mars.xlog.Log.e("C2Java", "ActionId Can not convert");
                    } else {
                        reportInfo.actionId = javaActionId;
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.paymars.mm.MMStnManager.CallBack
    public void simpleTestCommand(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("testReportFlush")) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).testReportFlush();
            return;
        }
        if (str.contains("speedtest")) {
            return;
        }
        if (str.contains("oversea")) {
            com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else if (str.contains(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).getMarsTimestamp();
        }
    }
}
