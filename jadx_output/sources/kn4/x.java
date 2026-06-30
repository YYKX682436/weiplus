package kn4;

/* loaded from: classes12.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.matrix.traffic.TrafficPlugin f309760a = null;

    /* renamed from: b, reason: collision with root package name */
    public static nj.a f309761b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f309762c = false;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f309763d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f309764e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final java.text.DateFormat f309765f = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.CHINA);

    /* renamed from: g, reason: collision with root package name */
    public static long f309766g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f309767h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f309768i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f309769j;

    /* renamed from: k, reason: collision with root package name */
    public static int f309770k;

    /* renamed from: l, reason: collision with root package name */
    public static long f309771l;

    /* renamed from: m, reason: collision with root package name */
    public static long f309772m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f309773n;

    static {
        boolean isWifi;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        f309768i = isWifi;
        f309769j = false;
        f309770k = 0;
        f309771l = 0L;
        f309772m = 0L;
        f309773n = null;
    }

    public static void a(int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap h17 = f309760a.h(i17);
        java.lang.String str5 = "MatrixTrafficCollector";
        if (h17.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "trafficInfoMap is empty, dumpTraffic type = " + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "dumpTraffic type = %d, trafficInfoMap = %s", java.lang.Integer.valueOf(i17), h17.toString());
        java.lang.String str6 = "";
        java.lang.String str7 = "";
        long j17 = 0;
        long j18 = 0;
        for (java.util.Map.Entry entry : h17.entrySet()) {
            java.lang.String str8 = (java.lang.String) entry.getKey();
            long parseLong = java.lang.Long.parseLong((java.lang.String) entry.getValue());
            j18 += parseLong;
            if (parseLong > j17) {
                if (!(str8 != null && (str8.contains("TPDemuxer") || str8.contains("TVKDL-LServer") || str8.contains("TP-workthread")))) {
                    str7 = str8;
                    j17 = parseLong;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "getTraffic final, type = %d, theKey = %s, maxTraffic = %d", java.lang.Integer.valueOf(i17), str7, java.lang.Long.valueOf(j17));
        if (str7 == null || str7.isEmpty()) {
            return;
        }
        f309766g += j17;
        f309772m += j18;
        java.lang.String replace = h17.toString().replace(',', ';');
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (j17 >= 102400) {
            java.lang.String g17 = f309760a.g(str7);
            if (f309760a.f53088h.f337795c && (str4 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.traffic.TrafficPlugin.f53087m).get(str7)) != null && !str4.isEmpty()) {
                str6 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.tencent.matrix.traffic.TrafficPlugin.f53086i).get(str4);
            }
            sb6.append(g17);
            sb6.append(" \n ");
            sb6.append(str6);
            java.lang.String[] split = g17.split("\n");
            int length = split.length;
            int i18 = 0;
            while (i18 < length) {
                java.lang.String[] split2 = split[i18].split("/");
                java.lang.String[] strArr = split;
                if (split2.length >= 2) {
                    sb7.append(split2[0]);
                    sb7.append(split2[split2.length - 1]);
                } else if (split2.length > 0) {
                    sb7.append(split2[0]);
                }
                sb7.append("\n");
                i18++;
                split = strArr;
            }
            sb7.append(str6);
        }
        java.util.Map map = null;
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("webview_url_prefs_url", null);
        try {
            str = str7.substring(str7.indexOf("-") + 1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MatrixTrafficCollector", "dumpTraffic get threadName error : " + th6.getMessage());
            str = str7;
        }
        com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "theKey = %s, maxTraffic = %d, sumTraffic = %d, evilStackTrace = %s, type = %d, lastUrl = %s", str7, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), sb6, java.lang.Integer.valueOf(i17), string);
        java.lang.String a17 = bm5.f1.a();
        java.lang.String sb8 = sb7.toString();
        if (sb8.length() > 0) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str2 = com.tencent.mm.sdk.platformtools.w2.b(sb8.getBytes());
            com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "stackMd5 = " + str2);
        } else {
            str2 = "null";
        }
        if (f309768i) {
            return;
        }
        if (kn4.d0.f309682d) {
            if (i17 == 0) {
                kn4.c0 c0Var = kn4.c0.INSTANCE;
                if (kn4.d0.f309682d) {
                    map = c0Var.a(c0Var.f309680d);
                } else {
                    c0Var.getClass();
                }
            } else {
                kn4.c0 c0Var2 = kn4.c0.INSTANCE;
                if (kn4.d0.f309682d) {
                    map = c0Var2.a(c0Var2.f309681e);
                } else {
                    c0Var2.getClass();
                }
            }
            if (map != null && map.size() > 0) {
                com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "cdnTrafficMap = " + map);
                long j19 = j18;
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    java.lang.String str9 = str5;
                    java.lang.String str10 = string;
                    long min = java.lang.Math.min(java.lang.Math.max(0L, j19), ((java.lang.Long) entry2.getValue()).longValue());
                    j19 -= ((java.lang.Long) entry2.getValue()).longValue();
                    if (min >= 102400) {
                        jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(min), sb6, java.lang.Integer.valueOf(i17), replace, str10, str2 + "::" + ((java.lang.String) entry2.getKey()), com.tencent.mm.sdk.platformtools.z.f193109e);
                    }
                    str5 = str9;
                    string = str10;
                }
                java.lang.String str11 = str5;
                java.lang.String str12 = string;
                if (j19 >= 102400) {
                    str3 = str11;
                    com.tencent.mars.xlog.Log.i(str3, "tag=notClustered, traffic=%d\n", java.lang.Long.valueOf(j19));
                    jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j19), sb6, java.lang.Integer.valueOf(i17), replace, str12, str2 + "::notClustered", com.tencent.mm.sdk.platformtools.z.f193109e);
                } else {
                    str3 = str11;
                }
                long j27 = -j19;
                if (j27 >= 102400) {
                    com.tencent.mars.xlog.Log.i(str3, "tag=notHooked, traffic=%d\n", java.lang.Long.valueOf(j27));
                    jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j27), sb6, java.lang.Integer.valueOf(i17), replace, str12, str2 + "::notHooked", com.tencent.mm.sdk.platformtools.z.f193109e);
                    return;
                }
                return;
            }
        }
        if (j17 >= 102400) {
            jx3.f.INSTANCE.d(24883, a17, str, java.lang.Long.valueOf(j17), sb6, java.lang.Integer.valueOf(i17), replace, string, str2, com.tencent.mm.sdk.platformtools.z.f193109e);
        }
    }

    public static void b() {
        if (f309769j) {
            f309771l += f309772m;
            if (f309768i || !com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() || (f309772m < 20971520 && f309771l < 314572800)) {
                f309770k = 0;
                f309771l = 0L;
                return;
            }
            int i17 = f309770k + 1;
            f309770k = i17;
            if (i17 >= 10) {
                jx3.f.INSTANCE.d(24883, bm5.f1.a(), "kill-self", java.lang.Long.valueOf(f309771l), f309773n, 110, f309765f.format(new java.util.Date()), com.tencent.mm.sdk.platformtools.o4.L().getString("webview_url_prefs_url", null), java.lang.String.valueOf(f309772m), com.tencent.mm.sdk.platformtools.z.f193109e);
                com.tencent.mars.xlog.Log.w("MatrixTrafficCollector", "Try to kill self after 30s, because current process cost too much mobile traffic at background.");
                ((ku5.t0) ku5.t0.f312615d).k(new kn4.x$$b(), 30000L);
            }
            com.tencent.mars.xlog.Log.i("MatrixTrafficCollector", "unsafeCount=%d, totalTraffic=%d, currentTraffic=%d", java.lang.Integer.valueOf(f309770k), java.lang.Long.valueOf(f309771l), java.lang.Long.valueOf(f309772m));
            if (f309770k == 1) {
                f309773n = f309765f.format(new java.util.Date());
            }
        }
    }
}
