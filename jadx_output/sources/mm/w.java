package mm;

/* loaded from: classes12.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f328542a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f328543b;

    /* renamed from: c, reason: collision with root package name */
    public static long f328544c;

    /* renamed from: d, reason: collision with root package name */
    public static final mm.y f328545d = new mm.y("push-notify");

    /* renamed from: e, reason: collision with root package name */
    public static final mm.y f328546e = new mm.y("receive-notify");

    /* renamed from: f, reason: collision with root package name */
    public static final mm.y f328547f = new mm.y("net-scene");

    /* renamed from: g, reason: collision with root package name */
    public static final mm.y f328548g = new mm.y("net-sync");

    /* renamed from: h, reason: collision with root package name */
    public static final mm.y f328549h = new mm.y("net-minSync");

    /* renamed from: i, reason: collision with root package name */
    public static final mm.y f328550i = new mm.y("net-syncCmd");

    /* renamed from: j, reason: collision with root package name */
    public static final mm.y f328551j = new mm.y("msg-type");

    /* renamed from: k, reason: collision with root package name */
    public static final mm.y f328552k = new mm.y("msg-appType");

    /* renamed from: l, reason: collision with root package name */
    public static final mm.y f328553l = new mm.y("msg-xmlType");

    /* renamed from: m, reason: collision with root package name */
    public static final mm.y f328554m = new mm.y("msg-action");

    /* renamed from: n, reason: collision with root package name */
    public static final mm.y f328555n = new mm.y("msg-mute");

    /* renamed from: o, reason: collision with root package name */
    public static final mm.y f328556o = new mm.y("msg-empty");

    /* renamed from: p, reason: collision with root package name */
    public static final mm.y f328557p = new mm.y("msg-notify");

    /* renamed from: q, reason: collision with root package name */
    public static final mm.y f328558q = new mm.y("msg-notifyClick");

    /* renamed from: r, reason: collision with root package name */
    public static m3.a f328559r = new mm.w$$b();

    /* renamed from: s, reason: collision with root package name */
    public static m3.a f328560s = new mm.w$$b();

    /* renamed from: t, reason: collision with root package name */
    public static m3.a f328561t = new mm.w$$c();

    /* renamed from: u, reason: collision with root package name */
    public static final r.a f328562u = new mm.w$$d();

    public static void a() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            f328545d.a();
            f328546e.a();
            f328547f.a();
            f328548g.a();
            f328549h.a();
            f328550i.a();
            f328551j.a();
            f328552k.a();
            f328553l.a();
            f328554m.a();
            f328555n.a();
            f328556o.a();
            f328557p.a();
            f328558q.a();
        }
    }

    public static long b(mm.y yVar, long j17, java.util.Map map, int i17) {
        synchronized (yVar) {
            java.util.Map map2 = yVar.f328569b;
            long j18 = 0;
            if (map2.isEmpty()) {
                return 0L;
            }
            mm.w$$e w__e = new mm.w$$e();
            java.util.ArrayList arrayList = new java.util.ArrayList(map2.entrySet());
            java.util.Collections.sort(arrayList, w__e);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            java.lang.String str = yVar.f328568a;
            int i18 = 0;
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String valueOf = java.lang.String.valueOf(entry2.getKey());
                int intValue = ((java.lang.Integer) entry2.getValue()).intValue();
                j18 += intValue;
                i18++;
                if (i17 <= 0 || i18 < i17) {
                    map.put(str + "-" + i18 + "-key", valueOf);
                    map.put(str + "-" + i18 + "-val", java.lang.Integer.valueOf(intValue));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append("-@-");
                    sb6.append(valueOf);
                    map.put(sb6.toString(), java.lang.Integer.valueOf(intValue));
                }
            }
            double p17 = uh.i.p((j18 * 1.0d) / j17, 2);
            map.put(str + "-count", java.lang.Long.valueOf(j18));
            map.put(str + "-countAvg", java.lang.Double.valueOf(p17));
            return j18;
        }
    }

    public static void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "#load");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("notify-inspect.bin");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mm.y yVar = f328545d;
        sb6.append(yVar.f328568a);
        sb6.append("-count");
        yVar.f328570c = M.getLong(sb6.toString(), 0L);
        yVar.f328573f = M.getLong(yVar.f328568a + "-during", 0L);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        mm.y yVar2 = f328547f;
        sb7.append(yVar2.f328568a);
        sb7.append("-count");
        yVar2.f328570c = M.getLong(sb7.toString(), 0L);
        yVar2.f328573f = M.getLong(yVar2.f328568a + "-during", 0L);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        mm.y yVar3 = f328551j;
        sb8.append(yVar3.f328568a);
        sb8.append("-count");
        yVar3.f328570c = M.getLong(sb8.toString(), 0L);
        yVar3.f328573f = M.getLong(yVar3.f328568a + "-during", 0L);
        f328544c = M.getLong("light-push-during", 0L);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        if (f328542a) {
            com.tencent.mars.xlog.Log.i(str, str2);
        }
    }

    public static void e(java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgAction: act=" + str);
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            mm.y yVar = f328554m;
            if (yVar.b() || !f328543b) {
                yVar.c(str);
            }
        }
    }

    public static void f(java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgActionMute: reason=" + str);
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            e("mute");
            mm.y yVar = f328555n;
            if (yVar.b() || !f328543b) {
                yVar.c(str);
            }
        }
    }

    public static void g(android.content.Intent intent, java.lang.String str) {
        d("MicroMsg.NotifyPowerInspector", "noteAddMsgNotifySend: from=" + str);
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            e("sendNotify");
            intent.putExtra("MainUI_User_Last_Msg_BgNotify_From", str);
        }
    }

    public static void h(java.lang.String str, final r45.b50 b50Var) {
        d("MicroMsg.NotifyPowerInspector", "netSynCmd: cmd=" + b50Var.f370530d + ", from=" + str);
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            mm.y yVar = f328550i;
            if (yVar.b() || !f328543b) {
                yVar.c(java.lang.String.valueOf(b50Var.f370530d));
            }
            if (b50Var.f370530d == 5) {
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: mm.w$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            r45.j4 j4Var = (r45.j4) new r45.j4().parseFrom(x51.j1.d(r45.b50.this.f370531e));
                            int i17 = j4Var.f377560g;
                            mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddMsgType: type=" + i17);
                            mm.y yVar2 = mm.w.f328551j;
                            if (yVar2.b() || !mm.w.f328543b) {
                                yVar2.c(java.lang.String.valueOf(i17));
                            }
                            if (j4Var.f377560g == 49) {
                                java.lang.String hexString = java.lang.Integer.toHexString(((java.lang.Integer) ((mm.w$$d) mm.w.f328562u).apply(j4Var)).intValue() & (-50));
                                mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddAppMsgType: type=" + hexString);
                                mm.y yVar3 = mm.w.f328552k;
                                if (yVar3.b() || !mm.w.f328543b) {
                                    yVar3.c(hexString);
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.NotifyPowerInspector", "parse cmd fail: " + th6.getMessage());
                        }
                    }
                });
            }
        }
    }

    public static void i(int i17) {
        d("MicroMsg.NotifyPowerInspector", "notePushNetScene: func=" + i17);
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            f328560s.accept(java.lang.Integer.valueOf(i17));
        }
    }

    public static void j(int i17) {
        d("MicroMsg.NotifyPowerInspector", "receiveNotify: func=" + i17);
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            mm.y yVar = f328546e;
            if (yVar.b() || !f328543b) {
                yVar.c(java.lang.String.valueOf(i17));
            }
        }
    }

    public static void k(long j17, boolean z17) {
        boolean z18;
        long j18;
        long j19;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        mm.y yVar = f328545d;
        long b17 = b(yVar, j17, linkedHashMap, 5);
        long b18 = b(f328546e, j17, linkedHashMap, 5);
        mm.y yVar2 = f328547f;
        long b19 = b(yVar2, j17, linkedHashMap, 5);
        long b27 = b(f328548g, j17, linkedHashMap, 5);
        long b28 = b(f328549h, j17, linkedHashMap, 5);
        long b29 = b(f328550i, j17, linkedHashMap, 5);
        mm.y yVar3 = f328551j;
        long b37 = b(yVar3, j17, linkedHashMap, 5);
        long b38 = b(f328552k, j17, linkedHashMap, 5);
        long b39 = b(f328553l, j17, linkedHashMap, 5);
        long b47 = b(f328554m, j17, linkedHashMap, 0);
        long b48 = b(f328555n, j17, linkedHashMap, 0);
        long b49 = b(f328556o, j17, linkedHashMap, 5);
        long b57 = b(f328557p, j17, linkedHashMap, 5);
        long b58 = b(f328558q, j17, linkedHashMap, 5);
        double d17 = j17;
        double d18 = (b17 * 1.0d) / d17;
        if (d18 >= 15.0d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "#overHeat");
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18 || f328542a) {
            boolean z19 = z18;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j27 = currentTimeMillis - (j17 * 60000);
            long j28 = 0;
            long j29 = com.tencent.mm.sdk.platformtools.o4.L().getLong("notify_power_light_push_on_ms", 0L);
            long j37 = com.tencent.mm.sdk.platformtools.o4.L().getLong("notify_power_light_push_off_ms", 0L);
            if (j37 > j29 || j29 <= 0) {
                j18 = b18;
                j19 = j37;
            } else {
                j18 = b18;
                j19 = currentTimeMillis;
            }
            if (j29 > 0 && j29 < j19 && j27 <= j19 && currentTimeMillis >= j29) {
                long max = java.lang.Math.max(j27, j29);
                long min = java.lang.Math.min(currentTimeMillis, j19);
                if (min > max) {
                    long j38 = min - max;
                    if (j38 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                        j28 = java.lang.Math.max(1L, j38 / 60000);
                    }
                }
            }
            java.lang.String str = z17 ? "reportBgNotifyPoll" : "reportBgNotify";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(": minute=");
            sb6.append(j17);
            sb6.append(", lightPushMn=");
            sb6.append(j28);
            sb6.append(", pushNotifyCount=");
            sb6.append(b17);
            sb6.append(", receiveNotifyCount=");
            long j39 = j18;
            sb6.append(j39);
            sb6.append(", netSceneCount=");
            sb6.append(b19);
            sb6.append(", netSyncCount=");
            sb6.append(b27);
            sb6.append(", netMinSyncCount=");
            sb6.append(b28);
            sb6.append(", netSyncCmdCount=");
            sb6.append(b29);
            sb6.append(", addMsgTypeCount=");
            sb6.append(b37);
            sb6.append(", addAppMsgTypeCount=");
            sb6.append(b38);
            sb6.append(", addXmlMsgTypeCount=");
            sb6.append(b39);
            sb6.append(", addMsgActionCount=");
            sb6.append(b47);
            sb6.append(", addMsgMuteCount=");
            sb6.append(b48);
            sb6.append(", addMsgEmptyCount=");
            sb6.append(b49);
            sb6.append(", addMsgNotifyCount=");
            sb6.append(b57);
            sb6.append(", addMsgNotifyClickCount=");
            sb6.append(b58);
            sb6.append(", addictedNotifyDuringMs=");
            sb6.append(yVar.f328572e);
            sb6.append(", addictedNetDuringMs=");
            sb6.append(yVar2.f328572e);
            sb6.append(", addictedMsgDuringMs=");
            sb6.append(yVar3.f328572e);
            d("MicroMsg.NotifyPowerInspector", sb6.toString());
            linkedHashMap.put("trace-more", java.lang.Boolean.valueOf(f328542a));
            linkedHashMap.put("trace-addicted", java.lang.Boolean.valueOf(f328543b));
            linkedHashMap.put("minute", java.lang.Long.valueOf(j17));
            linkedHashMap.put("minute-lightPush", java.lang.Long.valueOf(j28));
            linkedHashMap.put("msg-addictNtf-during", java.lang.Long.valueOf(yVar.f328572e));
            linkedHashMap.put("msg-addictNtf-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar.f328572e * 1.0d) / d17, 2)));
            linkedHashMap.put("msg-addictNet-during", java.lang.Long.valueOf(yVar2.f328572e));
            linkedHashMap.put("msg-addictNet-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar2.f328572e * 1.0d) / d17, 2)));
            linkedHashMap.put("msg-addictMsg-during", java.lang.Long.valueOf(yVar3.f328572e));
            linkedHashMap.put("msg-addictMsg-duringAvg", java.lang.Double.valueOf(uh.i.p((yVar3.f328572e * 1.0d) / d17, 2)));
            ap.a.a(1, (z17 ? "NotifySyncCounterPoll" : "NotifySyncCounter").concat(z19 ? "Exception" : ""), null, linkedHashMap, java.lang.String.valueOf(uh.i.p(d18, 2)), java.lang.String.valueOf(uh.i.p((j39 * 1.0d) / d17, 2)), java.lang.String.valueOf(uh.i.p((b27 * 1.0d) / d17, 2)), java.lang.String.valueOf(uh.i.p((b28 * 1.0d) / d17, 2)));
        }
    }

    public static void l(m3.a aVar) {
        f328561t = aVar;
    }

    public static void m(m3.a aVar) {
        f328560s = aVar;
    }

    public static void n(m3.a aVar) {
        f328559r = aVar;
    }
}
