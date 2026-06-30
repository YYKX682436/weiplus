package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class j8 {

    /* renamed from: b, reason: collision with root package name */
    public static long f192771b;

    /* renamed from: c, reason: collision with root package name */
    public static long f192772c;

    /* renamed from: d, reason: collision with root package name */
    public static long f192773d;

    /* renamed from: e, reason: collision with root package name */
    public static long f192774e;

    /* renamed from: f, reason: collision with root package name */
    public static long f192775f;

    /* renamed from: g, reason: collision with root package name */
    public static long f192776g;

    /* renamed from: h, reason: collision with root package name */
    public static long f192777h;

    /* renamed from: i, reason: collision with root package name */
    public static long f192778i;

    /* renamed from: j, reason: collision with root package name */
    public static long f192779j;

    /* renamed from: k, reason: collision with root package name */
    public static long f192780k;

    /* renamed from: l, reason: collision with root package name */
    public static long f192781l;

    /* renamed from: m, reason: collision with root package name */
    public static long f192782m;

    /* renamed from: n, reason: collision with root package name */
    public static long f192783n;

    /* renamed from: o, reason: collision with root package name */
    public static long f192784o;

    /* renamed from: p, reason: collision with root package name */
    public static long f192785p;

    /* renamed from: q, reason: collision with root package name */
    public static long f192786q;

    /* renamed from: r, reason: collision with root package name */
    public static long f192787r;

    /* renamed from: t, reason: collision with root package name */
    public static long f192789t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f192790u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f192791v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f192792w;

    /* renamed from: a, reason: collision with root package name */
    public static final long f192770a = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis(3);

    /* renamed from: s, reason: collision with root package name */
    public static long f192788s = -1;

    static {
        new java.util.concurrent.ConcurrentLinkedQueue();
        new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6("/proc/" + android.os.Process.myPid() + "/net/dev");
            if (!r6Var.A()) {
                r6Var = null;
            }
            f192790u = r6Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e17, "Failed init NET_DEV_FILE.", new java.lang.Object[0]);
        }
        try {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/proc/net/xt_qtaguid/stats"));
            f192791v = r6Var2.A() ? r6Var2 : null;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e18, "Failed init XT_STATS_FILE.", new java.lang.Object[0]);
        }
        f192771b = java.lang.System.currentTimeMillis();
        if (f192792w) {
            return;
        }
        c();
        f192792w = true;
    }

    public static synchronized boolean a() {
        synchronized (com.tencent.mm.sdk.platformtools.j8.class) {
            if (java.lang.System.currentTimeMillis() - f192771b < 30000) {
                return true;
            }
            f192771b = java.lang.System.currentTimeMillis();
            return false;
        }
    }

    public static long b(long j17) {
        long j18 = f192785p;
        return j18 > j17 ? j18 : j17;
    }

    public static void c() {
        f192772c = -1L;
        f192773d = -1L;
        f192774e = -1L;
        f192775f = -1L;
        f192777h = -1L;
        f192776g = -1L;
        f192779j = -1L;
        f192778i = -1L;
    }

    public static void d() {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2;
        if (a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", "updateFile frequently just return");
            return;
        }
        int i17 = 0;
        try {
            com.tencent.mm.vfs.r6 r6Var = f192790u;
            if (r6Var != null) {
                try {
                    java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(new com.tencent.mm.vfs.z6(r6Var));
                    try {
                        bufferedReader3.readLine();
                        bufferedReader3.readLine();
                        long j17 = 0;
                        long j18 = 0;
                        long j19 = 0;
                        long j27 = 0;
                        while (true) {
                            java.lang.String readLine = bufferedReader3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            java.lang.String[] split = readLine.split("[ :\t]+");
                            int i18 = split[i17].length() == 0 ? 1 : i17;
                            int i19 = i18 + 0;
                            if (!split[i19].equals("lo")) {
                                if (!split[i19].startsWith("rmnet") && !split[i19].startsWith("ccmni")) {
                                    j19 += java.lang.Long.parseLong(split[i18 + 9]);
                                    j27 += java.lang.Long.parseLong(split[i18 + 1]);
                                }
                                j17 += java.lang.Long.parseLong(split[i18 + 9]);
                                j18 += java.lang.Long.parseLong(split[i18 + 1]);
                            }
                            i17 = 0;
                        }
                        if (f192772c < 0) {
                            f192772c = j17;
                        }
                        if (f192773d < 0) {
                            f192773d = j18;
                        }
                        if (f192774e < 0) {
                            f192774e = j19;
                        }
                        if (f192775f < 0) {
                            f192775f = j27;
                        }
                        long j28 = f192775f;
                        long j29 = f192774e;
                        long j37 = f192772c;
                        f192780k = j17 >= j37 ? j17 - j37 : j17;
                        long j38 = f192773d;
                        f192781l = j18 >= j38 ? j18 - j38 : j18;
                        f192782m = j19 >= j29 ? j19 - j29 : j19;
                        f192783n = j27 >= j28 ? j27 - j28 : j27;
                        f192772c = j17;
                        f192773d = j18;
                        f192774e = j19;
                        f192775f = j27;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader3);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader3;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedReader = null;
                }
            }
            com.tencent.mm.vfs.r6 r6Var2 = f192791v;
            if (r6Var2 != null) {
                try {
                    int myUid = android.os.Process.myUid();
                    bufferedReader2 = new java.io.BufferedReader(new com.tencent.mm.vfs.z6(r6Var2));
                    try {
                        bufferedReader2.readLine();
                        long j39 = 0;
                        long j47 = 0;
                        long j48 = 0;
                        long j49 = 0;
                        while (true) {
                            java.lang.String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            java.lang.String[] split2 = readLine2.split("[ :\\t]+");
                            if (java.lang.Integer.parseInt(split2[3]) == myUid) {
                                java.lang.String str = split2[1];
                                long parseLong = java.lang.Long.parseLong(split2[5]);
                                long parseLong2 = java.lang.Long.parseLong(split2[7]);
                                if (!str.startsWith("rmnet") && !str.startsWith("ccmni")) {
                                    if (!str.equals("lo")) {
                                        j48 += parseLong;
                                        j49 += parseLong2;
                                    }
                                }
                                j39 += parseLong;
                                j47 += parseLong2;
                            }
                        }
                        if (f192777h < 0) {
                            f192777h = j39;
                        }
                        if (f192776g < 0) {
                            f192776g = j47;
                        }
                        if (f192779j < 0) {
                            f192779j = j48;
                        }
                        if (f192778i < 0) {
                            f192778i = j49;
                        }
                        long j57 = f192776g;
                        f192784o = j47 >= j57 ? j47 - j57 : j47;
                        long j58 = f192777h;
                        f192785p = j39 >= j58 ? j39 - j58 : j39;
                        long j59 = f192778i;
                        f192786q = j49 >= j59 ? j49 - j59 : j49;
                        long j66 = f192779j;
                        f192787r = j48 >= j66 ? j48 - j66 : j48;
                        f192776g = j47;
                        f192777h = j39;
                        f192778i = j49;
                        f192779j = j48;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
                        throw th;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    bufferedReader2 = null;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e17, "Failed retrieving TrafficStats.", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", "updateFile current system traffic: wifi rx/tx=%d/%d, mobile rx/tx=%d/%d, wxWifi rx/tx=%d/%d wxMobile rx/tx=%d/%d", java.lang.Long.valueOf(f192783n), java.lang.Long.valueOf(f192782m), java.lang.Long.valueOf(f192781l), java.lang.Long.valueOf(f192780k), java.lang.Long.valueOf(f192787r), java.lang.Long.valueOf(f192786q), java.lang.Long.valueOf(f192785p), java.lang.Long.valueOf(f192784o));
    }

    public static void e(android.content.Context context) {
        if (a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", "updateNsm frequently just return");
            return;
        }
        android.app.usage.NetworkStatsManager networkStatsManager = (android.app.usage.NetworkStatsManager) context.getSystemService("netstats");
        if (networkStatsManager == null) {
            return;
        }
        android.app.usage.NetworkStats.Bucket bucket = new android.app.usage.NetworkStats.Bucket();
        try {
            android.app.usage.NetworkStats querySummary = networkStatsManager.querySummary(1, null, f192770a, java.lang.System.currentTimeMillis());
            long j17 = 0;
            long j18 = 0;
            while (querySummary.hasNextBucket()) {
                querySummary.getNextBucket(bucket);
                if (bucket.getUid() == android.os.Process.myUid()) {
                    j17 += bucket.getRxBytes();
                    j18 += bucket.getTxBytes();
                }
            }
            long j19 = 0 + j17;
            long j27 = 0 + j18;
            querySummary.close();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateNSm traffic bucket detail: ");
            android.app.usage.NetworkStats querySummary2 = networkStatsManager.querySummary(0, null, f192770a, java.lang.System.currentTimeMillis());
            if ((f192776g > 0 || f192777h > 0) && (querySummary2 == null || !querySummary2.hasNextBucket())) {
                throw new java.lang.IllegalStateException("no bucket, mobileNetworkStats = " + querySummary2);
            }
            int i17 = 0;
            long j28 = 0;
            long j29 = 0;
            while (querySummary2.hasNextBucket()) {
                querySummary2.getNextBucket(bucket);
                if (bucket.getUid() == android.os.Process.myUid()) {
                    j28 += bucket.getRxBytes();
                    j29 += bucket.getTxBytes();
                    sb6.append(java.lang.String.format("[bucket %02d] Rx/Tx=%d/%d, ", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(bucket.getRxBytes()), java.lang.Long.valueOf(bucket.getTxBytes())));
                    i17++;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", sb6.toString());
            querySummary2.close();
            long totalRxBytes = android.net.TrafficStats.getTotalRxBytes() - android.net.TrafficStats.getMobileRxBytes();
            long totalTxBytes = android.net.TrafficStats.getTotalTxBytes() - android.net.TrafficStats.getMobileTxBytes();
            long mobileRxBytes = android.net.TrafficStats.getMobileRxBytes();
            long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
            if (f192772c < 0) {
                f192772c = mobileTxBytes;
            }
            if (f192773d < 0) {
                f192773d = mobileRxBytes;
            }
            if (f192774e < 0) {
                f192774e = totalTxBytes;
            }
            if (f192775f < 0) {
                f192775f = totalRxBytes;
            }
            int i18 = ((totalRxBytes - f192775f) > 0L ? 1 : ((totalRxBytes - f192775f) == 0L ? 0 : -1));
            int i19 = ((totalTxBytes - f192774e) > 0L ? 1 : ((totalTxBytes - f192774e) == 0L ? 0 : -1));
            long j37 = f192772c;
            f192780k = mobileTxBytes >= j37 ? mobileTxBytes - j37 : 0L;
            long j38 = f192773d;
            f192781l = mobileRxBytes >= j38 ? mobileRxBytes - j38 : 0L;
            long j39 = f192774e;
            f192782m = totalTxBytes >= j39 ? totalTxBytes - j39 : 0L;
            long j47 = f192775f;
            f192783n = totalRxBytes >= j47 ? totalRxBytes - j47 : 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", java.lang.String.format("updateNSm device traffic detail: lastWifi Tx/Rx=%d/%d, lastMobile Tx/Rx=%d/%d, newWifi Tx/Rx=%d/%d, newMobile Tx/Rx=%d/%d, wifi Tx/Rx=%d/%d, mobile Tx/Rx=%d/%d", java.lang.Long.valueOf(j39), java.lang.Long.valueOf(f192775f), java.lang.Long.valueOf(f192772c), java.lang.Long.valueOf(f192773d), java.lang.Long.valueOf(totalTxBytes), java.lang.Long.valueOf(totalRxBytes), java.lang.Long.valueOf(mobileTxBytes), java.lang.Long.valueOf(mobileRxBytes), java.lang.Long.valueOf(f192782m), java.lang.Long.valueOf(f192783n), java.lang.Long.valueOf(f192780k), java.lang.Long.valueOf(f192781l)));
            f192772c = mobileTxBytes;
            f192773d = mobileRxBytes;
            f192774e = totalTxBytes;
            f192775f = totalRxBytes;
            if (f192777h < 0) {
                f192777h = j28;
            }
            if (f192776g < 0) {
                f192776g = j29;
            }
            if (f192779j < 0) {
                f192779j = j19;
            }
            if (f192778i < 0) {
                f192778i = j27;
            }
            long j48 = f192776g;
            f192784o = j29 >= j48 ? j29 - j48 : 0L;
            long j49 = f192777h;
            f192785p = j28 >= j49 ? j28 - j49 : 0L;
            long j57 = f192778i;
            f192786q = j27 >= j57 ? j27 - j57 : 0L;
            long j58 = f192779j;
            f192787r = j19 >= j58 ? j19 - j58 : 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", java.lang.String.format("updateNSm wechat traffic detail: lastWxWifi Tx/Rx=%d/%d, lastWxMobile Tx/Rx=%d/%d, newWxWifi Tx/Rx=%d/%d, newWxMobile Tx/Rx=%d/%d, wxWifi Tx/Rx=%d/%d, wxMobile Tx/Rx=%d/%d", java.lang.Long.valueOf(j57), java.lang.Long.valueOf(f192779j), java.lang.Long.valueOf(f192776g), java.lang.Long.valueOf(f192777h), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(f192786q), java.lang.Long.valueOf(f192787r), java.lang.Long.valueOf(f192784o), java.lang.Long.valueOf(f192785p)));
            f192776g = j29;
            f192777h = j28;
            f192778i = j27;
            f192779j = j19;
            f192789t = f192789t + f192785p + f192787r;
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", "updateNSm lastUpdateTime=%d, currentTime=%d", java.lang.Long.valueOf(f192788s), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.TrafficStats", "updateNSm current system traffic: wifi rx/tx=%d/%d, mobile rx/tx=%d/%d, wxWifi rx/tx=%d/%d wxMobile rx/tx=%d/%d totalWxRx:=%d", java.lang.Long.valueOf(f192783n), java.lang.Long.valueOf(f192782m), java.lang.Long.valueOf(f192781l), java.lang.Long.valueOf(f192780k), java.lang.Long.valueOf(f192787r), java.lang.Long.valueOf(f192786q), java.lang.Long.valueOf(f192785p), java.lang.Long.valueOf(f192784o), java.lang.Long.valueOf(f192789t));
            f192788s = java.lang.System.currentTimeMillis();
        } catch (android.os.RemoteException e17) {
            e = e17;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e, "Failed retrieving NsmTrafficStats.", new java.lang.Object[0]);
            c();
        } catch (java.lang.IllegalStateException e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e, "Failed retrieving NsmTrafficStats.", new java.lang.Object[0]);
            c();
        } catch (java.lang.NullPointerException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e19, "!!!Failed retrieving NsmTrafficStats.", new java.lang.Object[0]);
            c();
        } catch (java.lang.SecurityException e27) {
            e = e27;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", e, "Failed retrieving NsmTrafficStats.", new java.lang.Object[0]);
            c();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.TrafficStats", th6, "!!! critical error.", new java.lang.Object[0]);
            c();
        }
    }
}
