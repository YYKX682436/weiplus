package uh;

/* loaded from: classes12.dex */
public class h extends rh.a {
    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.HealthStats";
    }

    public uh.g k() {
        android.hardware.Sensor sensor;
        wh.n1 n1Var;
        double d17;
        double d18;
        double d19;
        long j17;
        android.hardware.Sensor sensor2;
        uh.g gVar = new uh.g();
        android.os.health.HealthStats m17 = uh.i.m(this.f395294a.d());
        if (m17 != null) {
            gVar.f427679e = m17;
            rh.k1 k1Var = (rh.k1) this.f395294a.i(rh.k1.class);
            long j18 = 0;
            if (k1Var != null && (n1Var = k1Var.f395435k) != null && n1Var.l()) {
                long n17 = uh.i.n(m17, 10062) + uh.i.n(m17, 10063);
                double f17 = uh.i.f(n1Var, n17) + 0.0d;
                rh.k1 k1Var2 = (rh.k1) ph.a.a(rh.k1.class);
                if (k1Var2 != null && k1Var2.y()) {
                    rh.f1 w17 = k1Var2.w();
                    f17 = f17 + uh.i.g(n1Var, w17, n17, false) + uh.i.j(n1Var, w17, n17, false);
                }
                if (f17 <= 0.0d) {
                    f17 = 0.0d;
                }
                gVar.f427683g = rh.x2.b(java.lang.Double.valueOf(f17));
                if (m17.hasTimers(10006)) {
                    java.util.Iterator<android.os.health.TimerStat> it = m17.getTimers(10006).values().iterator();
                    long j19 = 0;
                    while (it.hasNext()) {
                        j19 += it.next().getTime();
                    }
                    d17 = (n1Var.e("cpu.idle") / 3600000.0d) * j19;
                } else {
                    d17 = 0.0d;
                }
                gVar.f427685h = rh.x2.b(java.lang.Double.valueOf(d17));
                double c17 = uh.i.c(n1Var, m17);
                if (c17 > 0.0d) {
                    oj.j.c("HealthStatsHelper", "estimate Mobile by radioActive", new java.lang.Object[0]);
                } else {
                    c17 = 0.0d;
                }
                gVar.f427687i = rh.x2.b(java.lang.Double.valueOf(c17));
                double d27 = uh.i.d(n1Var, m17);
                if (d27 > 0.0d) {
                    oj.j.c("HealthStatsHelper", "estimate WIFI by controller", new java.lang.Object[0]);
                } else {
                    d27 = 0.0d;
                }
                gVar.f427689j = rh.x2.b(java.lang.Double.valueOf(d27));
                double e17 = ((n1Var.e("bluetooth.controller.idle") / 3600000.0d) * uh.i.n(m17, 10020)) + 0.0d + ((n1Var.e("bluetooth.controller.rx") / 3600000.0d) * uh.i.n(m17, 10021)) + ((n1Var.e("bluetooth.controller.tx") / 3600000.0d) * uh.i.n(m17, 10022));
                if (e17 <= 0.0d) {
                    e17 = 0.0d;
                }
                gVar.f427691k = rh.x2.b(java.lang.Double.valueOf(e17));
                long o17 = uh.i.o(m17, 10011);
                if (o17 > 0) {
                    d18 = n1Var.e("gps.on");
                    if (d18 <= 0.0d) {
                        int h17 = n1Var.h("gps.signalqualitybased");
                        double d28 = 0.0d;
                        for (int i17 = 0; i17 < h17; i17++) {
                            d28 += n1Var.b("gps.signalqualitybased", i17);
                        }
                        d18 = d28 / h17;
                    }
                } else {
                    d18 = 0.0d;
                }
                double d29 = (d18 / 3600000.0d) * o17;
                if (d29 <= 0.0d) {
                    d29 = 0.0d;
                }
                gVar.f427693l = rh.x2.b(java.lang.Double.valueOf(d29));
                android.content.Context d37 = this.f395294a.d();
                if (m17.hasTimers(10012)) {
                    java.util.List<android.hardware.Sensor> sensorList = ((android.hardware.SensorManager) d37.getSystemService("sensor")).getSensorList(-1);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (android.hardware.Sensor sensor3 : sensorList) {
                        try {
                            hashMap.put(java.lang.String.valueOf(((java.lang.Integer) sensor3.getClass().getDeclaredMethod("getHandle", new java.lang.Class[0]).invoke(sensor3, new java.lang.Object[0])).intValue()), sensor3);
                        } catch (java.lang.Throwable th6) {
                            oj.j.f("HealthStatsHelper", "getSensorHandle err: " + th6.getMessage(), new java.lang.Object[0]);
                        }
                    }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, android.os.health.TimerStat>> it6 = m17.getTimers(10012).entrySet().iterator();
                    d19 = 0.0d;
                    while (it6.hasNext()) {
                        java.lang.String key = it6.next().getKey();
                        d19 = (key.equals("-10000") || (sensor2 = (android.hardware.Sensor) hashMap.get(key)) == null) ? d19 : d19 + ((sensor2.getPower() / 3600000.0d) * r6.getValue().getTime());
                    }
                } else {
                    d19 = 0.0d;
                }
                if (d19 <= 0.0d) {
                    d19 = 0.0d;
                }
                gVar.f427695m = rh.x2.b(java.lang.Double.valueOf(d19));
                double e18 = (n1Var.e("camera.avg") / 3600000.0d) * uh.i.o(m17, 10035);
                if (e18 <= 0.0d) {
                    e18 = 0.0d;
                }
                gVar.f427697n = rh.x2.b(java.lang.Double.valueOf(e18));
                double e19 = (n1Var.e("camera.flashlight") / 3600000.0d) * uh.i.o(m17, 10034);
                if (e19 <= 0.0d) {
                    e19 = 0.0d;
                }
                gVar.f427699o = rh.x2.b(java.lang.Double.valueOf(e19));
                long o18 = uh.i.o(m17, 10032);
                double e27 = n1Var.e("audio");
                if (e27 == 0.0d) {
                    e27 = n1Var.e("dsp.audio");
                }
                double d38 = (e27 / 3600000.0d) * o18;
                if (d38 <= 0.0d) {
                    d38 = 0.0d;
                }
                gVar.f427701p = rh.x2.b(java.lang.Double.valueOf(d38));
                long o19 = uh.i.o(m17, 10033);
                double e28 = n1Var.e("video");
                if (e28 == 0.0d) {
                    e28 = n1Var.e("dsp.video");
                }
                double d39 = (e28 / 3600000.0d) * o19;
                if (d39 <= 0.0d) {
                    d39 = 0.0d;
                }
                gVar.f427703q = rh.x2.b(java.lang.Double.valueOf(d39));
                double e29 = (n1Var.e("screen.on") / 3600000.0d) * java.lang.Math.min(uh.i.o(m17, 10038), uh.i.o(m17, 10036));
                if (e29 <= 0.0d) {
                    e29 = 0.0d;
                }
                gVar.f427705r = rh.x2.b(java.lang.Double.valueOf(e29));
                if (m17.hasTimers(10010)) {
                    java.util.Iterator<android.os.health.TimerStat> it7 = m17.getTimers(10010).values().iterator();
                    j17 = 0;
                    while (it7.hasNext()) {
                        j17 += it7.next().getTime();
                    }
                } else {
                    j17 = 0;
                }
                if (m17.hasTimers(10009)) {
                    java.util.Iterator<android.os.health.TimerStat> it8 = m17.getTimers(10009).values().iterator();
                    while (it8.hasNext()) {
                        j17 += it8.next().getTime();
                    }
                }
                double f18 = uh.i.f(n1Var, j17) + 0.0d;
                rh.k1 k1Var3 = (rh.k1) ph.a.a(rh.k1.class);
                if (k1Var3 != null && k1Var3.y()) {
                    rh.f1 w18 = k1Var3.w();
                    f18 = f18 + uh.i.g(n1Var, w18, j17, false) + uh.i.j(n1Var, w18, j17, false);
                }
                if (f18 <= 0.0d) {
                    f18 = 0.0d;
                }
                gVar.f427707s = rh.x2.b(java.lang.Double.valueOf(f18));
                double e37 = ((n1Var.e("cpu.suspend") / 3600000.0d) * uh.i.n(m17, 10001)) + ((n1Var.e("cpu.idle") / 3600000.0d) * uh.i.n(m17, 10002));
                gVar.f427709t = rh.x2.b(java.lang.Double.valueOf(e37 > 0.0d ? e37 : 0.0d));
            }
            gVar.f427711u = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10064)));
            gVar.f427713v = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10062)));
            gVar.f427715w = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10063)));
            gVar.f427717x = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10001)));
            gVar.f427719y = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10002)));
            gVar.f427721z = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL)));
            gVar.A = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID)));
            gVar.B = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10027)));
            gVar.C = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10061) / 1000));
            gVar.D = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10024)));
            gVar.E = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10025)));
            gVar.F = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10026)));
            gVar.G = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10048)));
            gVar.H = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10049)));
            gVar.I = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10054)));
            gVar.f427673J = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10055)));
            gVar.K = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10019)));
            gVar.L = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10016)));
            gVar.M = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10017)));
            gVar.N = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10018)));
            gVar.O = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10028)));
            gVar.P = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10029)));
            gVar.Q = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10030)));
            gVar.R = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10031)));
            gVar.S = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10050)));
            gVar.T = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10051)));
            gVar.U = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10056)));
            gVar.V = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10057)));
            gVar.W = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10023)));
            gVar.X = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10020)));
            gVar.Y = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10021)));
            gVar.Z = rh.x2.b(java.lang.Long.valueOf(uh.i.n(m17, 10022)));
            if (m17.hasTimers(10006)) {
                long j27 = 0;
                for (java.util.Map.Entry<java.lang.String, android.os.health.TimerStat> entry : m17.getTimers(10006).entrySet()) {
                    java.lang.String key2 = entry.getKey();
                    long time = entry.getValue().getTime();
                    if (gVar.f427720y0.isEmpty()) {
                        gVar.f427720y0 = new java.util.HashMap();
                    }
                    gVar.f427720y0.put(key2, rh.x2.b(java.lang.Long.valueOf(time)));
                    j27 += time;
                }
                gVar.f427674a0 = rh.x2.b(java.lang.Long.valueOf(j27));
            }
            if (m17.hasTimers(10005)) {
                long j28 = 0;
                for (java.util.Map.Entry<java.lang.String, android.os.health.TimerStat> entry2 : m17.getTimers(10005).entrySet()) {
                    java.lang.String key3 = entry2.getKey();
                    long time2 = entry2.getValue().getTime();
                    if (gVar.f427722z0.isEmpty()) {
                        gVar.f427722z0 = new java.util.HashMap();
                    }
                    gVar.f427722z0.put(key3, rh.x2.b(java.lang.Long.valueOf(time2)));
                    j28 += time2;
                }
                gVar.f427675b0 = rh.x2.b(java.lang.Long.valueOf(j28));
            }
            if (m17.hasTimers(10007)) {
                java.util.Iterator<android.os.health.TimerStat> it9 = m17.getTimers(10007).values().iterator();
                long j29 = 0;
                while (it9.hasNext()) {
                    j29 += it9.next().getTime();
                }
                gVar.f427676c0 = rh.x2.b(java.lang.Long.valueOf(j29));
            }
            if (m17.hasTimers(10008)) {
                java.util.Iterator<android.os.health.TimerStat> it10 = m17.getTimers(10008).values().iterator();
                long j37 = 0;
                while (it10.hasNext()) {
                    j37 += it10.next().getTime();
                }
                gVar.f427678d0 = rh.x2.b(java.lang.Long.valueOf(j37));
            }
            if (m17.hasStats(10013)) {
                long j38 = 0;
                for (android.os.health.HealthStats healthStats : m17.getStats(10013).values()) {
                    if (healthStats.hasMeasurement(20002)) {
                        j38 += healthStats.getMeasurement(20002);
                    }
                }
                gVar.f427680e0 = rh.x2.b(java.lang.Long.valueOf(j38));
            }
            gVar.f427682f0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10011)));
            if (m17.hasTimers(10012)) {
                java.util.List<android.hardware.Sensor> sensorList2 = ((android.hardware.SensorManager) this.f395294a.d().getSystemService("sensor")).getSensorList(-1);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (android.hardware.Sensor sensor4 : sensorList2) {
                    try {
                        hashMap2.put(java.lang.String.valueOf(((java.lang.Integer) sensor4.getClass().getDeclaredMethod("getHandle", new java.lang.Class[0]).invoke(sensor4, new java.lang.Object[0])).intValue()), sensor4);
                    } catch (java.lang.Throwable th7) {
                        oj.j.f("Matrix.battery.HealthStats", "getSensorHandle err: " + th7.getMessage(), new java.lang.Object[0]);
                    }
                }
                long j39 = 0;
                for (java.util.Map.Entry<java.lang.String, android.os.health.TimerStat> entry3 : m17.getTimers(10012).entrySet()) {
                    java.lang.String key4 = entry3.getKey();
                    long time3 = entry3.getValue().getTime();
                    if (!key4.equals("-10000") && (sensor = (android.hardware.Sensor) hashMap2.get(key4)) != null) {
                        j39 = ((float) j39) + (sensor.getPower() * ((float) time3));
                    }
                }
                gVar.f427684g0 = rh.x2.b(java.lang.Long.valueOf(j39));
            }
            gVar.f427686h0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10035)));
            gVar.f427688i0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10034)));
            gVar.f427690j0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10032)));
            gVar.f427692k0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10033)));
            if (m17.hasTimers(10010)) {
                java.util.Iterator<android.os.health.TimerStat> it11 = m17.getTimers(10010).values().iterator();
                long j47 = 0;
                while (it11.hasNext()) {
                    j47 += it11.next().getTime();
                }
                gVar.f427694l0 = rh.x2.b(java.lang.Long.valueOf(j47));
            }
            if (m17.hasTimers(10009)) {
                java.util.Iterator<android.os.health.TimerStat> it12 = m17.getTimers(10009).values().iterator();
                while (it12.hasNext()) {
                    j18 += it12.next().getTime();
                }
                gVar.f427696m0 = rh.x2.b(java.lang.Long.valueOf(j18));
            }
            gVar.f427698n0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10036)));
            gVar.f427700o0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10038)));
            gVar.f427702p0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10040)));
            gVar.f427704q0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10041)));
            gVar.f427706r0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10039)));
            gVar.f427708s0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10042)));
            gVar.f427710t0 = rh.x2.b(java.lang.Long.valueOf(uh.i.o(m17, 10043)));
            if (m17.hasStats(10014)) {
                for (java.util.Map.Entry<java.lang.String, android.os.health.HealthStats> entry4 : m17.getStats(10014).entrySet()) {
                    java.lang.String key5 = entry4.getKey();
                    android.os.health.HealthStats value = entry4.getValue();
                    if (value != null) {
                        if (gVar.f427712u0.isEmpty()) {
                            gVar.f427712u0 = new java.util.HashMap();
                        }
                        gVar.f427712u0.put(key5, rh.x2.b(java.lang.Long.valueOf(uh.i.n(value, 30001))));
                        if (gVar.f427714v0.isEmpty()) {
                            gVar.f427714v0 = new java.util.HashMap();
                        }
                        gVar.f427714v0.put(key5, rh.x2.b(java.lang.Long.valueOf(uh.i.n(value, 30002))));
                        if (gVar.f427716w0.isEmpty()) {
                            gVar.f427716w0 = new java.util.HashMap();
                        }
                        gVar.f427716w0.put(key5, rh.x2.b(java.lang.Long.valueOf(uh.i.n(value, com.tencent.mars.cdn.proto.FileType.FILETYPE_X_WEB_CONFIG_VALUE))));
                        if (gVar.f427718x0.isEmpty()) {
                            gVar.f427718x0 = new java.util.HashMap();
                        }
                        gVar.f427718x0.put(key5, rh.x2.b(java.lang.Long.valueOf(uh.i.n(value, 30003))));
                    }
                }
            }
        }
        return gVar;
    }
}
