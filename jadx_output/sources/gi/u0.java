package gi;

/* loaded from: classes12.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f272123a = true;

    /* renamed from: b, reason: collision with root package name */
    public static long f272124b;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map a(java.lang.String r12, gi.p1 r13) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.u0.a(java.lang.String, gi.p1):java.util.Map");
    }

    public static java.util.Map b(wh.n1 n1Var, final uh.g gVar, final rh.c1 c1Var, final m3.a aVar) {
        if (c1Var != null) {
            c1Var.u(uh.g.class, new gi.u0$$l());
        }
        final r.a aVar2 = new r.a() { // from class: gi.u0$$w
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ((m3.a) obj).accept(linkedHashMap);
                m3.a aVar3 = m3.a.this;
                if (aVar3 != null) {
                    aVar3.accept(linkedHashMap);
                }
                return linkedHashMap;
            }
        };
        return (java.util.Map) aVar2.apply(new m3.a() { // from class: gi.u0$$c0
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                final java.lang.String str;
                boolean z17;
                final java.lang.String str2;
                final rh.c1 c1Var2 = c1Var;
                java.util.Map map = (java.util.Map) obj;
                final uh.g gVar2 = uh.g.this;
                final double doubleValue = ((java.lang.Double) gVar2.f427683g.f395552a).doubleValue();
                boolean z18 = doubleValue < 0.0d || ((java.lang.Long) gVar2.f427713v.f395552a).longValue() < 0 || ((java.lang.Long) gVar2.f427715w.f395552a).longValue() < 0;
                m3.a aVar3 = new m3.a() { // from class: gi.u0$$e0
                    @Override // m3.a
                    public final void accept(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        uh.g gVar3 = gVar2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p((((java.lang.Long) gVar3.f427713v.f395552a).longValue() < 0 || ((java.lang.Long) gVar3.f427715w.f395552a).longValue() < 0 || (((java.lang.Long) gVar3.f427713v.f395552a).longValue() == 0 && ((java.lang.Long) gVar3.f427715w.f395552a).longValue() == 0)) ? 0.0d : doubleValue, 2)));
                        map2.put("usr", gVar3.f427713v.f395552a);
                        map2.put("sys", gVar3.f427715w.f395552a);
                    }
                };
                r.a aVar4 = aVar2;
                map.put("power-cpu", aVar4.apply(aVar3));
                final double doubleValue2 = ((java.lang.Double) gVar2.f427709t.f395552a).doubleValue();
                if (doubleValue2 < 0.0d) {
                    z18 = true;
                }
                map.put("power-idle", aVar4.apply(new m3.a() { // from class: gi.u0$$h
                    @Override // m3.a
                    public final void accept(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue2, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("realMs", gVar3.f427717x.f395552a);
                        map2.put("upMs", gVar3.f427719y.f395552a);
                        map2.put("offRealMs", gVar3.f427721z.f395552a);
                        map2.put("offUpMs", gVar3.A.f395552a);
                    }
                }));
                final double doubleValue3 = ((java.lang.Double) gVar2.f427685h.f395552a).doubleValue();
                final boolean z19 = doubleValue3 < 0.0d ? true : z18;
                map.put("power-wakelock", aVar4.apply(new m3.a() { // from class: gi.u0$$i
                    @Override // m3.a
                    public final void accept(java.lang.Object obj2) {
                        java.util.Map map2 = (java.util.Map) obj2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue3, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("full", gVar3.f427675b0.f395552a);
                        map2.put("partial", gVar3.f427674a0.f395552a);
                        map2.put("window", gVar3.f427676c0.f395552a);
                        map2.put("draw", gVar3.f427678d0.f395552a);
                        map2.put("pidSum", gVar3.f427680e0.f395552a);
                    }
                }));
                java.util.Iterator it = java.util.Arrays.asList("power-mobile-radio", "power-mobile-controller", "power-mobile-packet", "power-mobile-statByte", "power-mobile-statPacket").iterator();
                final double d17 = 0.0d;
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    java.lang.String str3 = (java.lang.String) it.next();
                    java.lang.Object obj2 = gVar2.f427681f.get(str3);
                    double doubleValue4 = obj2 instanceof java.lang.Double ? ((java.lang.Double) obj2).doubleValue() : 0.0d;
                    if (doubleValue4 > 0.0d) {
                        java.lang.String substring = str3.substring(str3.lastIndexOf("-") + 1);
                        com.tencent.mars.xlog.Log.i("HealthStatsHelper", "estimate mobile: " + substring);
                        d17 = doubleValue4;
                        str = substring;
                        break;
                    }
                    d17 = doubleValue4;
                }
                map.put("power-mobile", aVar4.apply(new m3.a() { // from class: gi.u0$$j
                    @Override // m3.a
                    public final void accept(java.lang.Object obj3) {
                        final java.util.Map map2 = (java.util.Map) obj3;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d17, 2)));
                        map2.put("type", str);
                        uh.g gVar3 = gVar2;
                        map2.put("radioActive", gVar3.C.f395552a);
                        map2.put("idleMs", gVar3.D.f395552a);
                        map2.put("rxMs", gVar3.E.f395552a);
                        map2.put("txMs", gVar3.F.f395552a);
                        map2.put("rxByte", gVar3.G.f395552a);
                        map2.put("txByte", gVar3.H.f395552a);
                        map2.put("rxPacket", gVar3.I.f395552a);
                        map2.put("txPacket", gVar3.f427673J.f395552a);
                        rh.c1 c1Var3 = c1Var2;
                        if (c1Var3 != null) {
                            c1Var3.u(rh.n3.class, new wh.t0() { // from class: gi.u0$$y
                                @Override // wh.t0
                                public final void accept(java.lang.Object obj4) {
                                    rh.o2 o2Var = (rh.o2) obj4;
                                    java.lang.Number number = ((rh.n3) o2Var.f395486c).f395474h.f395552a;
                                    java.util.Map map3 = map2;
                                    map3.put("rxByteSys", number);
                                    rh.n3 n3Var = (rh.n3) o2Var.f395486c;
                                    map3.put("txByteSys", n3Var.f395475i.f395552a);
                                    map3.put("rxPacketSys", n3Var.f395476j.f395552a);
                                    map3.put("txPacketSys", n3Var.f395477k.f395552a);
                                }
                            });
                        }
                    }
                }));
                java.util.Iterator it6 = java.util.Arrays.asList("power-wifi-controller", "power-wifi-packet", "power-wifi-statByte", "power-wifi-statPacket").iterator();
                final double d18 = 0.0d;
                while (true) {
                    if (!it6.hasNext()) {
                        z17 = true;
                        str2 = "";
                        break;
                    }
                    java.lang.String str4 = (java.lang.String) it6.next();
                    java.lang.Object obj3 = gVar2.f427681f.get(str4);
                    double doubleValue5 = obj3 instanceof java.lang.Double ? ((java.lang.Double) obj3).doubleValue() : 0.0d;
                    if (doubleValue5 > 0.0d) {
                        z17 = true;
                        java.lang.String substring2 = str4.substring(str4.lastIndexOf("-") + 1);
                        com.tencent.mars.xlog.Log.i("HealthStatsHelper", "estimate wifi: " + substring2);
                        d18 = doubleValue5;
                        str2 = substring2;
                        break;
                    }
                    d18 = doubleValue5;
                }
                map.put("power-wifi", aVar4.apply(new m3.a() { // from class: gi.u0$$k
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        final java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d18, 2)));
                        map2.put("type", str2);
                        uh.g gVar3 = gVar2;
                        map2.put("idleMs", gVar3.L.f395552a);
                        map2.put("rxMs", gVar3.M.f395552a);
                        map2.put("txMs", gVar3.N.f395552a);
                        map2.put("runMs", gVar3.O.f395552a);
                        map2.put("lockMs", gVar3.P.f395552a);
                        map2.put("scanMs", gVar3.Q.f395552a);
                        map2.put("castMs", gVar3.R.f395552a);
                        map2.put("rxByte", gVar3.S.f395552a);
                        map2.put("txByte", gVar3.T.f395552a);
                        map2.put("rxPacket", gVar3.U.f395552a);
                        map2.put("txPacket", gVar3.V.f395552a);
                        rh.c1 c1Var3 = c1Var2;
                        if (c1Var3 != null) {
                            c1Var3.u(rh.n3.class, new wh.t0() { // from class: gi.u0$$z
                                @Override // wh.t0
                                public final void accept(java.lang.Object obj5) {
                                    rh.o2 o2Var = (rh.o2) obj5;
                                    java.lang.Number number = ((rh.n3) o2Var.f395486c).f395470d.f395552a;
                                    java.util.Map map3 = map2;
                                    map3.put("rxByteSys", number);
                                    rh.n3 n3Var = (rh.n3) o2Var.f395486c;
                                    map3.put("txByteSys", n3Var.f395471e.f395552a);
                                    map3.put("rxPacketSys", n3Var.f395472f.f395552a);
                                    map3.put("txPacketSys", n3Var.f395473g.f395552a);
                                }
                            });
                        }
                    }
                }));
                final double doubleValue6 = ((java.lang.Double) gVar2.f427691k.f395552a).doubleValue();
                if (doubleValue6 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-bluetooth", aVar4.apply(new m3.a() { // from class: gi.u0$$m
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue6, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("mams", gVar3.W.f395552a);
                        map2.put("idle", gVar3.X.f395552a);
                        map2.put("rx", gVar3.Y.f395552a);
                        map2.put("tx", gVar3.Z.f395552a);
                    }
                }));
                final double doubleValue7 = ((java.lang.Double) gVar2.f427693l.f395552a).doubleValue();
                if (doubleValue7 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-gps", aVar4.apply(new m3.a() { // from class: gi.u0$$n
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue7, 2)));
                        map2.put("time", gVar2.f427682f0.f395552a);
                    }
                }));
                final double doubleValue8 = ((java.lang.Double) gVar2.f427695m.f395552a).doubleValue();
                if (doubleValue8 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-sensors", aVar4.apply(new m3.a() { // from class: gi.u0$$o
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue8, 2)));
                        map2.put("mams", gVar2.f427684g0.f395552a);
                    }
                }));
                final double doubleValue9 = ((java.lang.Double) gVar2.f427697n.f395552a).doubleValue();
                if (doubleValue9 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-camera", aVar4.apply(new m3.a() { // from class: gi.u0$$p
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue9, 2)));
                        map2.put("time", gVar2.f427686h0.f395552a);
                    }
                }));
                final double doubleValue10 = ((java.lang.Double) gVar2.f427699o.f395552a).doubleValue();
                if (doubleValue10 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-flashlight", aVar4.apply(new m3.a() { // from class: gi.u0$$q
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue10, 2)));
                        map2.put("time", gVar2.f427688i0.f395552a);
                    }
                }));
                final double doubleValue11 = ((java.lang.Double) gVar2.f427701p.f395552a).doubleValue();
                if (doubleValue11 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-audio", aVar4.apply(new m3.a() { // from class: gi.u0$$f0
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue11, 2)));
                        map2.put("time", gVar2.f427690j0.f395552a);
                    }
                }));
                final double doubleValue12 = ((java.lang.Double) gVar2.f427703q.f395552a).doubleValue();
                if (doubleValue12 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-video", aVar4.apply(new m3.a() { // from class: gi.u0$$g0
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue12, 2)));
                        map2.put("time", gVar2.f427692k0.f395552a);
                    }
                }));
                final double doubleValue13 = ((java.lang.Double) gVar2.f427705r.f395552a).doubleValue();
                if (doubleValue13 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-screen", aVar4.apply(new m3.a() { // from class: gi.u0$$h0
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(doubleValue13, 2)));
                        uh.g gVar3 = gVar2;
                        map2.put("topMs", gVar3.f427700o0.f395552a);
                        map2.put("fgActMs", gVar3.f427698n0.f395552a);
                        map2.put("procFgMs", gVar3.f427704q0.f395552a);
                        map2.put("procBgMs", gVar3.f427708s0.f395552a);
                    }
                }));
                final double doubleValue14 = ((java.lang.Double) gVar2.f427707s.f395552a).doubleValue();
                if (doubleValue14 < 0.0d) {
                    z19 = z17;
                }
                map.put("power-sysSrv", aVar4.apply(new m3.a() { // from class: gi.u0$$i0
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        uh.g gVar3 = gVar2;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p((((java.lang.Long) gVar3.f427694l0.f395552a).longValue() < 0 || ((java.lang.Long) gVar3.f427696m0.f395552a).longValue() < 0 || (((java.lang.Long) gVar3.f427694l0.f395552a).longValue() == 0 && ((java.lang.Long) gVar3.f427696m0.f395552a).longValue() == 0)) ? 0.0d : doubleValue14, 2)));
                        map2.put("jobsMs", gVar3.f427694l0.f395552a);
                        map2.put("syncMs", gVar3.f427696m0.f395552a);
                    }
                }));
                final double d19 = gVar2.d();
                map.put("power-total", aVar4.apply(new m3.a() { // from class: gi.u0$$b
                    @Override // m3.a
                    public final void accept(java.lang.Object obj4) {
                        java.util.Map map2 = (java.util.Map) obj4;
                        map2.put("power", java.lang.Double.valueOf(uh.i.p(d19, 2)));
                        map2.put("negative", java.lang.Boolean.valueOf(z19));
                    }
                }));
                if (gVar2.f395364b && c1Var2 != null && mm.o.f()) {
                    for (java.util.Map.Entry entry : gVar2.f427681f.entrySet()) {
                        java.lang.String str5 = (java.lang.String) entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (str5.startsWith("power-mobile") && (value instanceof java.lang.Double)) {
                            final double doubleValue15 = ((java.lang.Double) value).doubleValue();
                            map.put(str5, aVar4.apply(new m3.a() { // from class: gi.u0$$c
                                @Override // m3.a
                                public final void accept(java.lang.Object obj4) {
                                    ((java.util.Map) obj4).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue15, 2)));
                                }
                            }));
                        }
                        if (str5.startsWith("power-wifi") && (value instanceof java.lang.Double)) {
                            final double doubleValue16 = ((java.lang.Double) value).doubleValue();
                            map.put(str5, aVar4.apply(new m3.a() { // from class: gi.u0$$d
                                @Override // m3.a
                                public final void accept(java.lang.Object obj4) {
                                    ((java.util.Map) obj4).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue16, 2)));
                                }
                            }));
                        }
                    }
                    java.util.List<java.lang.String> asList = java.util.Arrays.asList("JiffyUid", "TimeUid");
                    final r.a aVar5 = new r.a() { // from class: gi.u0$$e
                        @Override // r.a
                        public final java.lang.Object apply(java.lang.Object obj4) {
                            double doubleValue17 = ((java.lang.Double) obj4).doubleValue();
                            uh.g gVar3 = uh.g.this;
                            return java.lang.Double.valueOf(doubleValue17 + ((java.lang.Double) gVar3.f427685h.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427687i.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427689j.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427691k.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427693l.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427695m.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427699o.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427701p.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427703q.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427705r.f395552a).doubleValue() + ((java.lang.Double) gVar3.f427709t.f395552a).doubleValue());
                        }
                    };
                    for (java.lang.String str6 : asList) {
                        java.lang.Object obj4 = gVar2.f427681f.get(str6);
                        if (obj4 != null && (obj4 instanceof java.util.Map)) {
                            for (java.util.Map.Entry entry2 : ((java.util.Map) obj4).entrySet()) {
                                java.lang.String valueOf = java.lang.String.valueOf(entry2.getKey());
                                java.lang.Object value2 = entry2.getValue();
                                if (valueOf.startsWith("power-cpu") && (value2 instanceof java.lang.Double)) {
                                    final double doubleValue17 = ((java.lang.Double) value2).doubleValue();
                                    map.put(valueOf + str6, aVar4.apply(new m3.a() { // from class: gi.u0$$f
                                        @Override // m3.a
                                        public final void accept(java.lang.Object obj5) {
                                            ((java.util.Map) obj5).put("power", java.lang.Double.valueOf(uh.i.p(doubleValue17, 2)));
                                        }
                                    }));
                                    map.put(valueOf.replace("power-cpu", "power-total") + str6, aVar4.apply(new m3.a() { // from class: gi.u0$$g
                                        @Override // m3.a
                                        public final void accept(java.lang.Object obj5) {
                                            ((java.util.Map) obj5).put("power", java.lang.Double.valueOf(uh.i.p(((java.lang.Double) r.a.this.apply(java.lang.Double.valueOf(doubleValue17))).doubleValue(), 2)));
                                        }
                                    }));
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public static void c(android.content.Context context) {
        ph.u uVar;
        rh.e3 i17;
        synchronized (gi.u0.class) {
            if (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.p()) {
                com.tencent.mars.xlog.Log.i("HealthStatsHelper", "dump");
                f272124b = java.lang.System.currentTimeMillis();
                android.os.health.HealthStats m17 = uh.i.m(context);
                g("root", m17, new gi.u0$$d0());
                ((com.tencent.mm.feature.performance.q) ((ob0.y2) i95.n0.c(ob0.y2.class))).getClass();
                cr0.r2.f221734a.c(m17);
                if (ih.d.c() && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null && (i17 = uVar.f354296h.i(uh.h.class)) != null) {
                    f(context, ((uh.h) i17).k(), null);
                }
            } else {
                com.tencent.mars.xlog.Log.i("HealthStatsHelper", "skip dump");
            }
        }
    }

    public static void d(android.content.Context context) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = 30;
        try {
            if (((e42.e0) i95.n0.c(e42.e0.class)) != null) {
                i17 = java.lang.Math.max(com.tencent.mm.sdk.platformtools.t8.D1(j62.e.g().a("clicfg_battery_stats_dump", java.lang.String.valueOf(30), false, true), 0), 1);
            }
        } catch (java.lang.Exception unused) {
        }
        long j17 = i17 * com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        if (currentTimeMillis - f272124b > j17) {
            synchronized (gi.u0.class) {
                if (currentTimeMillis - f272124b > j17) {
                    c(context);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(wh.n1 r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.u0.e(wh.n1):void");
    }

    public static void f(final android.content.Context context, final uh.g gVar, final rh.c1 c1Var) {
        try {
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference("");
            if (c1Var == null && !gVar.f395364b) {
                atomicReference.set("curr");
            } else if (c1Var != null && gVar.f395364b) {
                c1Var.q(new wh.t0() { // from class: gi.u0$$r
                    @Override // wh.t0
                    public final void accept(java.lang.Object obj) {
                        atomicReference.set("avgPower" + ri.i.c(c1Var) + "_" + ((qh.b) obj).e());
                    }
                });
            }
            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) atomicReference.get())) {
                com.tencent.mars.xlog.Log.w("HealthStatsHelper", "skip invalid scope");
                return;
            }
            final boolean z17 = c1Var != null && "topShell".equals(c1Var.f395337s);
            final gi.u0$$s u0__s = new gi.u0$$s();
            final gi.u0$$t u0__t = new gi.u0$$t();
            ph.a.b(rh.k1.class, new wh.t0() { // from class: gi.u0$$u
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    android.os.health.HealthStats healthStats;
                    wh.n1 n1Var = ((rh.k1) obj).f395435k;
                    if (n1Var == null || !n1Var.l()) {
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("estimatePower ");
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                    sb6.append((java.lang.String) atomicReference2.get());
                    sb6.append(": ");
                    r.a aVar = u0__s;
                    sb6.append((java.lang.String) aVar.apply(""));
                    sb6.append("cpuPower=");
                    uh.g gVar2 = gVar;
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427683g.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("wakelocksPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427685h.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("mobilePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427687i.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("wifiPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427689j.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("blueToothPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427691k.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("gpsPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427693l.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("sensorsPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427695m.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("cameraPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427697n.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("flashLightPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427699o.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("audioPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427701p.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("videoPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427703q.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("screenPower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427705r.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("systemServicePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427707s.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("idlePower=");
                    sb6.append(uh.i.p(((java.lang.Double) gVar2.f427709t.f395552a).doubleValue(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("totalPower=");
                    sb6.append(uh.i.p(gVar2.d(), 2));
                    sb6.append((java.lang.String) aVar.apply(","));
                    sb6.append("capacity=");
                    sb6.append(uh.i.p(wh.m.f(context), 2));
                    sb6.append("");
                    com.tencent.mars.xlog.Log.i("HealthStatsHelper", sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("estimateMeta ");
                    sb7.append((java.lang.String) atomicReference2.get());
                    sb7.append(": ");
                    sb7.append((java.lang.String) aVar.apply(""));
                    sb7.append("cpuPowerMams=");
                    java.lang.Number number = gVar2.f427711u.f395552a;
                    r.a aVar2 = u0__t;
                    sb7.append((java.lang.String) aVar2.apply(number));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("cpuUsrTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427713v.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("cpuSysTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427715w.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("realTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427717x.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("upTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427719y.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("offRealTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427721z.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("offUpTimeMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.A.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobilePowerMams=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.B.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileRadioActiveMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.C.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileIdleMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.D.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileRxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.E.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileTxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.F.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileRxBytes=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.G.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileTxBytes=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.H.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileRxPackets=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.I.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("mobileTxPackets=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427673J.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiPowerMams=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.K.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiIdleMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.L.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiRxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.M.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiTxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.N.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiRunningMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.O.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiLockMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.P.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiScanMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.Q.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiMulticastMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.R.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiRxBytes=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.S.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiTxBytes=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.T.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiRxPackets=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.U.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wifiTxPackets=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.V.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("blueToothPowerMams=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.W.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("blueToothIdleMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.X.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("blueToothRxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.Y.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("blueToothTxMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.Z.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wakelocksPartialMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427674a0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wakelocksFullMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427675b0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wakelocksWindowMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427676c0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wakelocksDrawMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427678d0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("wakelocksPidSum=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427680e0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("gpsMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427682f0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("sensorsPowerMams=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427684g0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("cameraMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427686h0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("flashLightMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427688i0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("audioMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427690j0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("videoMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427692k0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("jobsMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427694l0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("syncMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427696m0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("fgActMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427698n0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procTopAppMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427700o0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procTopSleepMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427702p0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procFgMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427704q0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procFgSrvMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427706r0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procBgMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427708s0.f395552a));
                    sb7.append((java.lang.String) aVar.apply(","));
                    sb7.append("procCacheMs=");
                    sb7.append((java.lang.String) aVar2.apply(gVar2.f427710t0.f395552a));
                    sb7.append("");
                    com.tencent.mars.xlog.Log.i("HealthStatsHelper", sb7.toString());
                    if (z17 || (healthStats = gVar2.f427679e) == null) {
                        return;
                    }
                    java.lang.String concat = (!healthStats.hasMeasurement(10064) || healthStats.getMeasurement(10064) <= 0) ? "" : "".concat("cpuMams");
                    if (healthStats.hasMeasurement(10027) && healthStats.getMeasurement(10027) > 0) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(concat);
                        sb8.append(concat.length() == 0 ? "" : ";");
                        sb8.append("mobileMams");
                        concat = sb8.toString();
                    }
                    if (healthStats.hasMeasurement(10019) && healthStats.getMeasurement(10019) > 0) {
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(concat);
                        sb9.append(concat.length() == 0 ? "" : ";");
                        sb9.append("wifiMams");
                        concat = sb9.toString();
                    }
                    if (healthStats.hasMeasurement(10023) && healthStats.getMeasurement(10023) > 0) {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        sb10.append(concat);
                        sb10.append(concat.length() != 0 ? ";" : "");
                        sb10.append("bleMams");
                        concat = sb10.toString();
                    }
                    if (!android.text.TextUtils.isEmpty(concat) || mm.o.c()) {
                        ap.a.a(1, "etmPower", null, gi.u0.b(n1Var, gVar2, null, null), java.lang.String.valueOf(gVar2.d()), concat);
                    }
                }
            });
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("HealthStatsHelper", "load powerProfile err: " + th6.getMessage());
        }
    }

    public static void g(java.lang.String str, android.os.health.HealthStats healthStats, r.a aVar) {
        if (healthStats == null || ((java.lang.Boolean) aVar.apply(new m3.d(str, healthStats))).booleanValue()) {
            return;
        }
        int statsKeyCount = healthStats.getStatsKeyCount();
        for (int i17 = 0; i17 < statsKeyCount; i17++) {
            int statsKeyAt = healthStats.getStatsKeyAt(i17);
            if (healthStats.hasStats(statsKeyAt)) {
                for (java.util.Map.Entry<java.lang.String, android.os.health.HealthStats> entry : healthStats.getStats(statsKeyAt).entrySet()) {
                    g(str + "-" + entry.getKey(), entry.getValue(), aVar);
                }
            }
        }
    }
}
