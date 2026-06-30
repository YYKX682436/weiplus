package cw2;

/* loaded from: classes10.dex */
public final class p4 {

    /* renamed from: h, reason: collision with root package name */
    public static r45.dx0 f223918h;

    /* renamed from: i, reason: collision with root package name */
    public static long f223919i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Runnable f223920j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f223921k;

    /* renamed from: n, reason: collision with root package name */
    public static int f223924n;

    /* renamed from: a, reason: collision with root package name */
    public static final cw2.p4 f223911a = new cw2.p4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223912b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223913c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223914d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223915e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223916f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f223917g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: l, reason: collision with root package name */
    public static final cw2.j4 f223922l = new cw2.j4();

    /* renamed from: m, reason: collision with root package name */
    public static boolean f223923m = true;

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.video.FinderNetworkStatusStatistic$WifiBroadcastReceiver f223925o = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.finder.video.FinderNetworkStatusStatistic$WifiBroadcastReceiver
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.net.NetworkInfo networkInfo;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(intent, "intent");
            if (kotlin.jvm.internal.o.b(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION, intent.getAction()) && (networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.getType() == 1) {
                if (networkInfo.isConnected()) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("wifi_connect", kz5.b1.e(new jz5.l("view_id", "finder_version_psm_base_report")), 32016);
                } else {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("wifi_disconnect", kz5.b1.e(new jz5.l("view_id", "finder_version_psm_base_report")), 32016);
                }
            }
        }
    };

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.video.FinderNetworkStatusStatistic$ScreenLockBroadcastReceiver f223926p = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.finder.video.FinderNetworkStatusStatistic$ScreenLockBroadcastReceiver
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(intent, "intent");
            java.lang.String action = intent.getAction();
            if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_OFF", action)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("lock_screen", kz5.b1.e(new jz5.l("view_id", "finder_version_psm_base_report")), 32016);
            } else if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_ON", action)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("unlock_screen", kz5.b1.e(new jz5.l("view_id", "finder_version_psm_base_report")), 32016);
            }
        }
    };

    public static final void a(cw2.p4 p4Var) {
        synchronized (p4Var) {
            if (f223918h == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "cacheStatusToFile for generateClientStatus.");
                f223918h = p4Var.d();
            }
            try {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                r45.dx0 dx0Var = f223918h;
                if (dx0Var != null) {
                    byte[] byteArray = dx0Var.toByteArray();
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(10));
                    if (!r6Var.y()) {
                        r6Var.l();
                    }
                    if (!r6Var.m()) {
                        r6Var.J();
                    }
                    java.lang.String str = r6Var.o() + "/Finder.FinderNetworkStatusStatistic.ext";
                    com.tencent.mm.vfs.w6.R(str, byteArray);
                    com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "cacheStatusToFile " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms " + java.lang.Integer.valueOf(byteArray.length) + ' ' + str + "  netType:" + dx0Var.getInteger(0) + " bandwidthKbps:" + dx0Var.getInteger(2) + " lastVideosDownloadInfo:" + dx0Var.getList(3).size() + " last_preload_download_info:" + dx0Var.getList(15).size() + " recent_finder_download_speed:" + dx0Var.getList(13).size() + " recent_wechat_download_speed:" + dx0Var.getList(14).size());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderNetworkStatusStatistic", e17, "cacheStatusToFile Exception ", new java.lang.Object[0]);
            }
        }
    }

    public final void b(r45.m11 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addDownloadNetworkInfo info:");
        sb6.append(info);
        sb6.append(" size:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f223912b;
        sb6.append(copyOnWriteArrayList.size());
        sb6.append(" maxLimitCount:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", sb6.toString());
        if (i17 != 0 && copyOnWriteArrayList.size() > i17) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(info);
    }

    public final void c(r45.m11 info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addNetworkInfoToFinderState info:");
        sb6.append(info);
        sb6.append(" size:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f223913c;
        sb6.append(copyOnWriteArrayList.size());
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", sb6.toString());
        copyOnWriteArrayList.add(info);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:1|(1:3)|4|(7:5|6|(1:10)|11|(1:13)(1:194)|(1:15)(1:193)|16)|17|(1:191)(1:21)|22|(2:24|(1:26)(1:27))|28|(2:31|29)|32|33|(2:36|34)|37|38|(6:41|(2:42|(3:44|(1:46)(1:57)|(1:49)(1:48))(2:58|59))|50|(2:52|53)(2:55|56)|54|39)|60|61|(2:64|62)|65|66|(2:69|67)|70|71|(1:73)|74|(1:190)(1:78)|79|(2:(1:82)(1:188)|(9:84|(1:86)(1:187)|87|88|(3:90|(1:92)(1:161)|(30:94|(1:96)(1:160)|97|98|(1:159)(1:102)|103|(3:105|(1:107)|108)|109|110|111|(3:115|(2:118|116)|119)|121|(1:123)(1:156)|124|(1:126)(1:155)|127|(1:129)(1:154)|130|(1:132)(1:153)|133|(1:135)(1:152)|136|(1:138)(1:151)|139|(1:141)(1:150)|142|(2:145|143)|146|147|148))|162|163|164|(35:166|167|168|169|170|(1:172)(2:174|(1:176)(2:177|(1:179)(1:180)))|173|98|(0)|159|103|(0)|109|110|111|(4:113|115|(1:116)|119)|121|(0)(0)|124|(0)(0)|127|(0)(0)|130|(0)(0)|133|(0)(0)|136|(0)(0)|139|(0)(0)|142|(1:143)|146|147|148)(35:183|184|168|169|170|(0)(0)|173|98|(0)|159|103|(0)|109|110|111|(0)|121|(0)(0)|124|(0)(0)|127|(0)(0)|130|(0)(0)|133|(0)(0)|136|(0)(0)|139|(0)(0)|142|(1:143)|146|147|148)))|189|88|(0)|162|163|164|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x033d, code lost:
    
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "getVolumeLevel fail");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0416 A[Catch: all -> 0x0464, TryCatch #2 {all -> 0x0464, blocks: (B:111:0x0408, B:113:0x0416, B:115:0x041c, B:116:0x0428, B:118:0x042e), top: B:110:0x0408 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x042e A[Catch: all -> 0x0464, LOOP:7: B:116:0x0428->B:118:0x042e, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0464, blocks: (B:111:0x0408, B:113:0x0416, B:115:0x041c, B:116:0x0428, B:118:0x042e), top: B:110:0x0408 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05d4 A[LOOP:8: B:143:0x05ce->B:145:0x05d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035d A[Catch: Exception -> 0x036f, TryCatch #0 {Exception -> 0x036f, blocks: (B:170:0x034a, B:174:0x035d, B:177:0x0365), top: B:169:0x034a }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331 A[Catch: Exception -> 0x033d, TRY_LEAVE, TryCatch #1 {Exception -> 0x033d, blocks: (B:164:0x031e, B:183:0x0331), top: B:163:0x031e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fa  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r4v0, types: [cw2.p4] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r45.dx0, com.tencent.mm.protobuf.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.dx0 d() {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.p4.d():r45.dx0");
    }

    public final r45.dx0 e() {
        r45.dx0 dx0Var = new r45.dx0();
        dx0Var.set(6, o45.wf.f343027e);
        dx0Var.set(7, wo.q.f447785f);
        dx0Var.set(5, o45.wf.f343024b);
        dx0Var.set(4, o45.wf.f343025c);
        try {
            dx0Var.set(0, java.lang.Integer.valueOf(((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).ij()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.FinderNetworkStatusStatistic", "generateClientStatusLite e:" + th6);
        }
        dx0Var.getList(8).add("h264");
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        boolean Di = d11.s.Di(4);
        f223923m = Di;
        if (Di) {
            dx0Var.getList(8).add("h265");
        }
        if (cw2.l5.f223835a.e()) {
            dx0Var.getList(8).add("h266");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "generateClientStatusLite netType: " + dx0Var.getInteger(0) + ", codecSupport: " + dx0Var.getList(8));
        return dx0Var;
    }

    public final int f() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        return tVar.c().d() ? 1 : 0;
    }

    public final int g() {
        try {
            int[] p17 = wh.m.p();
            int[] c17 = wo.r.c();
            float d17 = 1.0f / wo.t.d();
            if (p17.length <= 0 || c17.length <= 0) {
                return 0;
            }
            float f17 = 0.0f;
            for (int i17 = 0; i17 < p17.length; i17++) {
                f17 += ((100 * d17) * p17[i17]) / c17[i17];
            }
            return (int) f17;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "get curCpuFreq fail");
            return 0;
        }
    }

    public final float h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoPlayerUtils", e17, "", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    public final java.util.concurrent.CopyOnWriteArrayList i() {
        return f223912b;
    }

    public final int j() {
        try {
            android.content.res.Resources system = android.content.res.Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", com.eclipsesource.mmv8.Platform.ANDROID);
            if (identifier != 0) {
                return system.getInteger(identifier);
            }
            return 255;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "get max brightness fail, fallback to 255");
            return 255;
        }
    }

    public final r45.sf0 k(r45.sf0 speed) {
        kotlin.jvm.internal.o.g(speed, "speed");
        if (!(bw5.z4.a(speed.getInteger(4)) != null)) {
            speed.set(4, 0);
        }
        return speed;
    }

    public final r45.m11 l(r45.m11 m11Var) {
        r45.sf0 sf0Var;
        r45.sf0 sf0Var2 = (r45.sf0) m11Var.getCustom(23);
        if (!(bw5.z4.a(sf0Var2 != null ? sf0Var2.getInteger(4) : 0) != null) && (sf0Var = (r45.sf0) m11Var.getCustom(23)) != null) {
            sf0Var.set(4, 0);
        }
        return m11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0119, Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:11:0x000b, B:15:0x0057, B:17:0x005b, B:19:0x00a8, B:20:0x00ad, B:30:0x004b), top: B:10:0x000b, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.p4.m():void");
    }

    public final void n() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127824m9).getValue()).r()).intValue();
        if (f223920j != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus return for started.");
            return;
        }
        f223920j = new cw2.o4(intValue);
        if (intValue < 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus return for delayMs:" + intValue);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus delayMs:" + intValue + " recordNetworkStatusRunnable:" + f223920j);
        java.lang.Runnable runnable = f223920j;
        if (runnable != null) {
            ((ku5.t0) ku5.t0.f312615d).l(runnable, intValue, "Finder.FinderNetworkStatusStatistic");
        }
    }

    public final void o() {
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "stopRecordNetWorkStatus recordNetworkStatusRunnable:" + f223920j);
        f223920j = null;
        f223924n = 0;
        ((ku5.t0) ku5.t0.f312615d).A("Finder.FinderNetworkStatusStatistic");
    }
}
