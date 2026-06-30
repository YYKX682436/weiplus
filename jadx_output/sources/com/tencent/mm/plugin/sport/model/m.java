package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class m implements android.hardware.SensorEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static long f171795h;

    /* renamed from: i, reason: collision with root package name */
    public static long f171796i;

    /* renamed from: m, reason: collision with root package name */
    public static long f171797m;

    /* renamed from: n, reason: collision with root package name */
    public static long f171798n;

    /* renamed from: o, reason: collision with root package name */
    public static long f171799o;

    /* renamed from: p, reason: collision with root package name */
    public static long f171800p;

    /* renamed from: q, reason: collision with root package name */
    public static long f171801q;

    /* renamed from: r, reason: collision with root package name */
    public static long f171802r;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f171803d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sport.model.a0 f171804e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.hardware.Sensor f171805f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f171806g;

    public m() {
        boolean z17;
        boolean z18 = false;
        this.f171806g = false;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PushKeepAliveEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PushKeepAliveEvent>(a0Var) { // from class: com.tencent.mm.plugin.sport.model.PushSportStepDetector$1
            {
                this.__eventId = 995577628;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.PushKeepAliveEvent r6) {
                /*
                    r5 = this;
                    com.tencent.mm.autogen.events.PushKeepAliveEvent r6 = (com.tencent.mm.autogen.events.PushKeepAliveEvent) r6
                    long r0 = c01.id.c()
                    long r2 = com.tencent.mm.plugin.sport.model.m.f171800p
                    long r0 = r0 - r2
                    r2 = 60000(0xea60, double:2.9644E-319)
                    long r0 = r0 / r2
                    java.lang.Long r6 = java.lang.Long.valueOf(r0)
                    java.lang.Object[] r6 = new java.lang.Object[]{r6}
                    java.lang.String r0 = "pushKeepAliveEvent %d"
                    java.lang.String r1 = "MicroMsg.Sport.PushSportStepDetector"
                    com.tencent.mars.xlog.Log.i(r1, r0, r6)
                    com.tencent.mm.plugin.sport.model.m r6 = com.tencent.mm.plugin.sport.model.m.this
                    boolean r6 = r6.f171806g
                    r0 = 0
                    if (r6 == 0) goto La9
                    android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
                    java.lang.String r2 = "power"
                    java.lang.Object r6 = r6.getSystemService(r2)
                    android.os.PowerManager r6 = (android.os.PowerManager) r6
                    boolean r6 = r6.isScreenOn()
                    if (r6 == 0) goto L3b
                    java.lang.String r6 = "Screen On"
                    com.tencent.mars.xlog.Log.i(r1, r6)
                    goto L68
                L3b:
                    java.util.Calendar r6 = java.util.Calendar.getInstance()
                    r1 = 11
                    int r1 = r6.get(r1)
                    r2 = 21
                    if (r1 != r2) goto L58
                    long r1 = r6.getTimeInMillis()
                    long r3 = com.tencent.mm.plugin.sport.model.m.f171800p
                    long r1 = r1 - r3
                    r3 = 900000(0xdbba0, double:4.44659E-318)
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 <= 0) goto L68
                    goto L66
                L58:
                    long r1 = r6.getTimeInMillis()
                    long r3 = com.tencent.mm.plugin.sport.model.m.f171800p
                    long r1 = r1 - r3
                    r3 = 1800000(0x1b7740, double:8.89318E-318)
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 <= 0) goto L68
                L66:
                    r6 = 1
                    goto L69
                L68:
                    r6 = r0
                L69:
                    if (r6 == 0) goto La9
                    boolean r6 = com.tencent.mm.plugin.sport.model.SportForegroundService.f171768e
                    r6 = 26
                    boolean r6 = fp.h.c(r6)
                    if (r6 == 0) goto La9
                    boolean r6 = u75.d.c()
                    java.lang.String r1 = "MicroMsg.Sport.SportForegroundService"
                    if (r6 == 0) goto L84
                    java.lang.String r6 = "miui, not need to start sport foreground"
                    com.tencent.mars.xlog.Log.i(r1, r6)
                    goto La9
                L84:
                    boolean r6 = com.tencent.mm.plugin.sport.model.SportForegroundService.f171768e
                    if (r6 != 0) goto La9
                    boolean r6 = com.tencent.mm.sdk.platformtools.x2.m()
                    if (r6 != 0) goto La9
                    java.lang.String r6 = "startSportForegroundService"
                    com.tencent.mars.xlog.Log.i(r1, r6)
                    android.content.Intent r2 = new android.content.Intent
                    android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
                    java.lang.Class<com.tencent.mm.plugin.sport.model.SportForegroundService> r4 = com.tencent.mm.plugin.sport.model.SportForegroundService.class
                    r2.<init>(r3, r4)
                    android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> La3
                    r3.startForegroundService(r2)     // Catch: java.lang.Exception -> La3
                    goto La9
                La3:
                    r2 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r0]
                    com.tencent.mars.xlog.Log.printErrStackTrace(r1, r2, r6, r3)
                La9:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sport.model.PushSportStepDetector$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        if (fp.h.c(28)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "register push keep alive event");
            iListener.alive();
        }
        if (com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            if (com.tencent.mm.plugin.sport.model.t.c().optInt("checkWeSportInstall") != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportUtil", "checkPushInstallWeSport is false");
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17) {
                z18 = true;
            }
        }
        this.f171806g = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "isSupportDeviceStep %b", java.lang.Boolean.valueOf(z18));
        if (this.f171806g) {
            b();
        }
        f171802r = 0L;
        com.tencent.mm.plugin.sport.model.x b17 = com.tencent.mm.plugin.sport.model.z.f171826a.b();
        long j17 = b17.f171818a;
        f171798n = j17;
        f171799o = b17.f171819b;
        f171800p = b17.f171820c;
        f171801q = b17.f171821d;
        f171795h = b17.f171822e;
        f171796i = b17.f171823f;
        f171797m = b17.f171824g;
        if (j17 != com.tencent.mm.plugin.sport.model.c0.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "invalid begin time %s", com.tencent.mm.plugin.sport.model.c0.f(f171798n));
            f171798n = 0L;
            f171799o = 0L;
            f171800p = 0L;
            f171801q = 0L;
            f171795h = 0L;
            f171796i = 0L;
            f171797m = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r4 = this;
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            boolean r0 = com.tencent.mm.plugin.sport.model.c0.a(r0)
            r1 = 0
            if (r0 == 0) goto L23
            org.json.JSONObject r0 = com.tencent.mm.plugin.sport.model.t.c()
            java.lang.String r2 = "checkWeSportInstall"
            int r0 = r0.optInt(r2)
            r2 = 1
            if (r0 == r2) goto L1f
            java.lang.String r0 = "MicroMsg.Sport.SportUtil"
            java.lang.String r3 = "checkPushInstallWeSport is false"
            com.tencent.mars.xlog.Log.i(r0, r3)
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L24
        L23:
            r2 = r1
        L24:
            r4.f171806g = r2
            if (r2 == 0) goto L30
            r4.d()
            boolean r0 = r4.b()
            return r0
        L30:
            r4.d()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sport.model.m.a():boolean");
    }

    public final boolean b() {
        try {
            if (this.f171803d == null) {
                this.f171803d = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            }
            if (this.f171804e == null) {
                this.f171804e = new com.tencent.mm.plugin.sport.model.a0(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.PushSportStepDetector", "Exception in registerDetector %s", e17.getMessage());
        }
        if (this.f171803d == null || !com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.HEALTHY, d85.f0.F)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "no step sensor");
            return false;
        }
        android.hardware.Sensor defaultSensor = this.f171803d.getDefaultSensor(19);
        this.f171805f = defaultSensor;
        if (defaultSensor == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", " TYPE_STEP_COUNTER sensor null");
            return false;
        }
        boolean registerListener = this.f171803d.registerListener(this.f171804e, this.f171805f, com.tencent.mm.plugin.sport.model.t.c().optInt("stepCounterRateUs", com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
        if (!registerListener) {
            d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "registerDetector() ok.(result : %s)", java.lang.Boolean.valueOf(registerListener));
        return registerListener;
    }

    public final void c() {
        long j17 = f171798n;
        long j18 = f171799o;
        long j19 = f171800p;
        long j27 = f171801q;
        long j28 = f171795h;
        long j29 = f171796i;
        long j37 = f171797m;
        com.tencent.mm.plugin.sport.model.z zVar = com.tencent.mm.plugin.sport.model.z.f171826a;
        java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37)}, 7));
        kotlin.jvm.internal.o.f(format, "format(...)");
        zVar.c().D("KEY_STEP_DETAIL_INFO", format);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKvStorage", "saveSportDetailInfo detailInfo:".concat(format));
    }

    public final void d() {
        try {
            if (this.f171803d == null) {
                this.f171803d = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            }
            com.tencent.mm.plugin.sport.model.a0 a0Var = this.f171804e;
            if (a0Var != null) {
                this.f171803d.unregisterListener(a0Var);
                this.f171804e = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.PushSportStepDetector", "unregisterDetector() success!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.PushSportStepDetector", "Exception in unregisterDetector %s", e17.getMessage());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        int i17 = 0;
        float f17 = sensorEvent.values[0];
        if (com.tencent.mm.sdk.platformtools.x2.m()) {
            return;
        }
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length > 0) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.sport.model.n(c01.id.c(), sensorEvent.values[0], sensorEvent.timestamp, "PUSH"), "PushUpdateStepTag");
            return;
        }
        if (fArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", false, true);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", java.lang.Integer.valueOf(sensorEvent.accuracy), java.lang.Long.valueOf(sensorEvent.timestamp));
        float[] fArr2 = sensorEvent.values;
        int length = fArr2.length;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr2[i17]));
            i17++;
            i18++;
        }
    }
}
