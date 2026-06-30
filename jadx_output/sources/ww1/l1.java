package ww1;

/* loaded from: classes15.dex */
public class l1 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.j1, com.tencent.mm.plugin.collect.model.voice.k {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.protobuf.g f450231q = com.tencent.mm.protobuf.g.c("元");

    /* renamed from: r, reason: collision with root package name */
    public static final android.os.HandlerThread f450232r;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaPlayer f450233d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaPlayer f450234e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f450235f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f450236g;

    /* renamed from: h, reason: collision with root package name */
    public int f450237h;

    /* renamed from: i, reason: collision with root package name */
    public int f450238i;

    /* renamed from: m, reason: collision with root package name */
    public long f450239m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f450240n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct f450241o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f450242p;

    static {
        int i17 = pu5.i.f358473b;
        f450232r = pu5.f.a("syncCreatePlayer", 5);
    }

    public l1() {
        super(0);
        this.f450235f = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f450236g = false;
        this.f450242p = new java.util.HashMap();
    }

    public static void b(ww1.l1 l1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "reset user vol: %s", java.lang.Integer.valueOf(l1Var.f450237h));
        ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).z(3, l1Var.f450237h, 0);
    }

    public static android.media.MediaPlayer c() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "[syncCreatePlayer] %s", myLooper);
        if (myLooper != null && myLooper != android.os.Looper.getMainLooper()) {
            android.os.HandlerThread handlerThread = f450232r;
            if (myLooper != handlerThread.getLooper()) {
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
                java.lang.Object obj = new java.lang.Object();
                android.media.MediaPlayer[] mediaPlayerArr = {null};
                synchronized (obj) {
                    n3Var.post(new ww1.e1(mediaPlayerArr, obj));
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
                    }
                }
                return mediaPlayerArr[0];
            }
        }
        return new to.g();
    }

    public static boolean i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "delete files");
        return com.tencent.mm.vfs.w6.g(k(), true);
    }

    public static java.lang.String k() {
        return lp0.b.D() + "wallet/voice/";
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent = (com.tencent.mm.autogen.events.CollectRcvVoiceEvent) iEvent;
        am.h3 h3Var = collectRcvVoiceEvent.f54069g;
        java.lang.String str = h3Var.f6809b;
        java.lang.String str2 = h3Var.f6814g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(h3Var.f6813f);
        am.h3 h3Var2 = collectRcvVoiceEvent.f54069g;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "feeType: %s, voiceContent: %s, source: %s, tradeNo: %s, expireVoiceTimestamp: %s F2fRcvVoiceOffLineLogic.OFF_LINE: %s needFailover：%s, business_type : %s, fromByp : %s", str, str2, valueOf, h3Var2.f6810c, h3Var2.f6815h, java.lang.Boolean.valueOf(com.tencent.mm.plugin.collect.model.voice.m.f96177i), java.lang.Boolean.valueOf(h3Var2.f6816i), java.lang.Integer.valueOf(h3Var2.f6818k), java.lang.Integer.valueOf(h3Var2.f6817j));
        long j17 = h3Var2.f6812e;
        if (j17 > 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "delay over 1min: %s, tradeNo: %s", java.lang.Long.valueOf(j17), h3Var2.f6810c);
            if (j17 <= u04.d.f423477c) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 3L, 1L, false);
            } else if (j17 <= 300000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 4L, 1L, false);
            } else if (j17 <= 600000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 5L, 1L, false);
            } else if (j17 <= 1800000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 6L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 7L, 1L, false);
            }
        }
        long V = !com.tencent.mm.sdk.platformtools.t8.K0(h3Var2.f6815h) ? com.tencent.mm.sdk.platformtools.t8.V(h3Var2.f6815h, 0L) : 0L;
        if (!com.tencent.mm.sdk.platformtools.t8.B0(V, 0L) ? c01.id.a() / 1000 > V : j17 > 600000) {
            h(collectRcvVoiceEvent, true, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "offline Synthesize delay > 10min or CurrentServerTime > expireVoiceTimestamp");
            if (!com.tencent.mm.plugin.collect.model.voice.m.f96177i || com.tencent.mm.sdk.platformtools.t8.K0(h3Var2.f6814g)) {
                r(3, h3Var2.f6810c, l(h3Var2.f6811d), h3Var2.f6814g, h3Var2.f6808a, com.tencent.mm.plugin.collect.model.voice.m.d().e(), 10, m(collectRcvVoiceEvent));
            } else {
                r(6, h3Var2.f6810c, l(h3Var2.f6811d), h3Var2.f6814g, h3Var2.f6808a, com.tencent.mm.plugin.collect.model.voice.m.d().e(), 10, m(collectRcvVoiceEvent));
            }
        }
        return false;
    }

    public final int f() {
        return ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).j() ? 1 : 0;
    }

    public final void h(com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent, boolean z17, boolean z18) {
        boolean z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "callbackImp() tradeNo:%s useOffline:%s", collectRcvVoiceEvent.f54069g.f6810c, java.lang.Boolean.valueOf(z17));
        am.h3 h3Var = collectRcvVoiceEvent.f54069g;
        long j17 = h3Var.f6812e;
        if (!h3Var.f6811d.equals("wx_f2f")) {
            if (!collectRcvVoiceEvent.f54069g.f6811d.equals("wx_md")) {
                com.tencent.mars.xlog.Log.w("MicroMsg.F2fRcvVoiceListener", "unknown type: %s", collectRcvVoiceEvent.f54069g.f6811d);
                return;
            }
            if (z17 && com.tencent.mm.plugin.collect.model.voice.m.f96177i && !com.tencent.mm.sdk.platformtools.t8.K0(collectRcvVoiceEvent.f54069g.f6814g)) {
                ((java.util.HashMap) this.f450242p).put(collectRcvVoiceEvent.f54069g.f6810c, collectRcvVoiceEvent);
                com.tencent.mm.plugin.collect.model.voice.m.d().l(collectRcvVoiceEvent);
                return;
            }
            am.h3 h3Var2 = collectRcvVoiceEvent.f54069g;
            ww1.u1 u1Var = new ww1.u1(h3Var2.f6808a, 0, null, f450231q, h3Var2.f6810c);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(u1Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "on recv, fee: %s, voice open: %B", java.lang.Integer.valueOf(collectRcvVoiceEvent.f54069g.f6808a), java.lang.Boolean.valueOf(tw1.f.Di().Ri()));
        if (!z18) {
            java.lang.String str = collectRcvVoiceEvent.f54069g.f6810c;
            synchronized (this) {
                z19 = true;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.F2fRcvVoiceListener", "illegal no: %s, not do play", str);
                } else {
                    java.util.List n17 = n();
                    java.util.Iterator it = n().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            n17.add(str);
                            if (n17.size() > 10) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "over max size, do remove");
                                int size = n17.size();
                                n17 = n17.subList(size - 10, size);
                            }
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(n17, ","));
                            z19 = false;
                        } else if (((java.lang.String) it.next()).equals(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "has played tradeno: %s", str);
                            break;
                        }
                    }
                }
            }
            if (z19) {
                return;
            }
        }
        if (collectRcvVoiceEvent.f54069g.f6813f == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 8L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 9L, 1L, false);
        }
        if (z17 && !com.tencent.mm.plugin.collect.model.voice.m.f96177i && !com.tencent.mm.sdk.platformtools.t8.K0(collectRcvVoiceEvent.f54069g.f6814g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "init tts");
            com.tencent.mm.plugin.collect.model.voice.m.d().k(false);
        }
        if (z17 && com.tencent.mm.plugin.collect.model.voice.m.f96177i && !com.tencent.mm.sdk.platformtools.t8.K0(collectRcvVoiceEvent.f54069g.f6814g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "useOffline");
            ((java.util.HashMap) this.f450242p).put(collectRcvVoiceEvent.f54069g.f6810c, collectRcvVoiceEvent);
            com.tencent.mm.plugin.collect.model.voice.m.d().l(collectRcvVoiceEvent);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "useOnline");
        am.h3 h3Var3 = collectRcvVoiceEvent.f54069g;
        ww1.o1 o1Var = new ww1.o1(h3Var3.f6808a, 0, null, f450231q, h3Var3.f6810c, h3Var3.f6813f, j17);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(o1Var);
    }

    public final int l(java.lang.String str) {
        if (str.equals("wx_f2f")) {
            return 1;
        }
        return str.equals("wx_md") ? 2 : 0;
    }

    public final int m(com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent) {
        am.h3 h3Var = collectRcvVoiceEvent.f54069g;
        if (h3Var.f6818k == 0) {
            if (h3Var.f6817j == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype 0, frombyp 1, return 3");
                return 3;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype 0, frombyp 0, return 0");
            return 0;
        }
        if (h3Var.f6817j == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype not 0, frombyp 1, return 2");
            return 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "businesstype not 0, frombyp 0, return 1");
        return 1;
    }

    public final java.util.List n() {
        java.lang.ref.WeakReference weakReference = this.f450240n;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "refer is null");
            this.f450240n = new java.lang.ref.WeakReference(new java.util.ArrayList(com.tencent.mm.sdk.platformtools.t8.O1((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_RCV_VOICE_PLAYED_LIST_STRING_SYNC, ""), ",")));
        }
        return (java.util.List) this.f450240n.get();
    }

    public final void o(ww1.k1 k1Var) {
        java.lang.String str = k1Var.f450222a;
        ww1.b1 b1Var = new ww1.b1(this);
        ww1.c1 c1Var = new ww1.c1(this, k1Var);
        ww1.d1 d1Var = new ww1.d1(this, k1Var);
        android.media.MediaPlayer c17 = c();
        c17.setAudioStreamType(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play start mp:%d path:%s", java.lang.Integer.valueOf(c17.hashCode()), str);
        try {
            c17.setDataSource(str);
            c17.setLooping(false);
            c17.setOnErrorListener(new ww1.h1(c17, c1Var));
            c17.setOnCompletionListener(new ww1.i1(str, c17, b1Var));
            c17.prepare();
            c17.start();
            d1Var.a();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(c17.hashCode());
            boolean z17 = true;
            objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
            if (android.os.Looper.getMainLooper() == null) {
                z17 = false;
            }
            objArr[2] = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", objArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.F2fRcvVoiceListener", "play failed path:%s e:%s", str, e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
            c17.release();
            c17 = null;
        }
        this.f450234e = c17;
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (!(m1Var instanceof ww1.o1)) {
            if (m1Var instanceof ww1.u1) {
                ww1.u1 u1Var = (ww1.u1) m1Var;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", u1Var);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14404, 3, u1Var.f450306g, 3, "", 2);
                    return;
                }
                if (u1Var.f450304e.f385992d != 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14404, 3, u1Var.f450306g, 2, "", 2);
                    return;
                }
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(k());
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (!(m18.a() ? m18.f213266a.r(m18.f213267b) : false)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                        return;
                    }
                }
                java.lang.String str3 = k() + java.util.UUID.randomUUID().toString() + ".tmp";
                com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str3);
                if (!t(str3, u1Var.f450304e.f385994f.f192156a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
                    return;
                }
                ww1.k1 k1Var = new ww1.k1(this, null);
                k1Var.f450222a = str3;
                int i19 = u1Var.f450304e.f385995g;
                k1Var.f450223b = 2;
                this.f450235f.add(k1Var);
                u();
                return;
            }
            return;
        }
        ww1.o1 o1Var = (ww1.o1) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", o1Var);
            q(1, o1Var.f450258g);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o1Var.f450259h == 1 ? 3 : 2);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(o1Var.f450261m);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(f());
            java.lang.String str4 = o1Var.f450258g;
            g0Var.d(15763, str4, 2, valueOf, valueOf2, valueOf3);
            g0Var.d(14404, 3, str4, 3, "", 1);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "overtime: %s retcode: %s", java.lang.Integer.valueOf(o1Var.f450257f.f371092h), java.lang.Integer.valueOf(o1Var.f450257f.f371088d));
        r45.bw bwVar = o1Var.f450257f;
        int i27 = bwVar.f371092h;
        java.lang.String str5 = o1Var.f450258g;
        if (i27 == 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.F2fRcvVoiceListener", "skip over 10min: %s", java.lang.Long.valueOf(o1Var.f450260i));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14404, 3, str5, 1, "", 1);
            return;
        }
        int i28 = bwVar.f371088d;
        int i29 = o1Var.f450259h;
        if (i28 == 0 && (gVar = bwVar.f371090f) != null) {
            s(1, gVar.f192156a, bwVar.f371091g, str5, i27, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15763, str5, 1, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f450261m), java.lang.Integer.valueOf(f()));
            return;
        }
        if (i28 > 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "retcode > 100, still play default sound");
            q(1, str5);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(14404, 3, str5, 2, "", 1);
            g0Var2.d(15763, str5, 2, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f450261m), java.lang.Integer.valueOf(f()));
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i28);
        objArr[1] = o1Var.f450257f.f371090f == null ? "null" : "not null";
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play default sound only %s %s", objArr);
        q(1, str5);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15763, str5, 2, java.lang.Integer.valueOf(i29 == 1 ? 3 : 2), java.lang.Long.valueOf(o1Var.f450261m), java.lang.Integer.valueOf(f()));
    }

    public final void q(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
        ww1.k1 k1Var = new ww1.k1(this, null);
        k1Var.f450223b = i17;
        k1Var.f450224c = str;
        this.f450235f.add(k1Var);
        u();
    }

    public final void r(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, java.lang.String str3, int i27, int i28) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct();
        this.f450241o = wCPayF2FVoicePushReportStruct;
        wCPayF2FVoicePushReportStruct.f62093d = i17;
        wCPayF2FVoicePushReportStruct.f62094e = wCPayF2FVoicePushReportStruct.b("BiilNo", str, true);
        if (!(i27 == 0)) {
            this.f450241o.f62095f = i27;
        }
        this.f450241o.f62096g = i18;
        if (str2.contains(",")) {
            str2 = str2.replaceAll(",", "").trim();
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct2 = this.f450241o;
        wCPayF2FVoicePushReportStruct2.f62097h = wCPayF2FVoicePushReportStruct2.b("content", str2, true);
        com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct3 = this.f450241o;
        wCPayF2FVoicePushReportStruct3.f62098i = i19;
        if (i17 == 6) {
            wCPayF2FVoicePushReportStruct3.f62099j = wCPayF2FVoicePushReportStruct3.b("packId", str3, true);
        }
        com.tencent.mm.autogen.mmdata.rpt.WCPayF2FVoicePushReportStruct wCPayF2FVoicePushReportStruct4 = this.f450241o;
        wCPayF2FVoicePushReportStruct4.f62100k = i28;
        wCPayF2FVoicePushReportStruct4.k();
    }

    public final void s(int i17, byte[] bArr, int i18, java.lang.String str, int i19, boolean z17) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(k());
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (!(m18.a() ? m18.f213266a.r(m18.f213267b) : false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                return;
            }
        }
        java.lang.String str3 = k() + java.util.UUID.randomUUID().toString() + ".tmp";
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", str3);
        if (!t(str3, bArr)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
            return;
        }
        ww1.k1 k1Var = new ww1.k1(this, null);
        k1Var.f450222a = str3;
        k1Var.f450223b = i17;
        k1Var.f450224c = str;
        k1Var.f450225d = z17;
        this.f450235f.add(k1Var);
        u();
    }

    public final boolean t(java.lang.String str, byte[] bArr) {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            return com.tencent.mm.vfs.w6.S(str, bArr, 0, bArr.length) == 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "sd card not available");
        return false;
    }

    public final synchronized void u() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_f2f_voice_overtime, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "voiceOvertime: %s", java.lang.Long.valueOf(Ui));
        if (this.f450236g) {
            long j17 = this.f450239m;
            if (currentTimeMillis - j17 > Ui) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "last has outdate: %s", java.lang.Long.valueOf(j17));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1143L, 42L, 1L, false);
                this.f450236g = false;
            }
        }
        if (this.f450236g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "is playing, return");
            return;
        }
        this.f450236g = true;
        this.f450239m = java.lang.System.currentTimeMillis();
        ww1.k1 k1Var = (ww1.k1) this.f450235f.poll();
        int g17 = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).g(3);
        this.f450237h = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).h(3);
        this.f450238i = java.lang.Math.round(g17 * 0.5f);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "curVol: %s, maxVol: %s, minVol: %s", java.lang.Integer.valueOf(this.f450237h), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(this.f450238i));
        boolean isStreamMute = ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).c().isStreamMute(3);
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "isMute: %s", java.lang.Boolean.valueOf(isStreamMute));
        if (this.f450237h == 0 || isStreamMute) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "music channel is mute");
            int i17 = k1Var != null ? k1Var.f450223b : 1;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 3;
            objArr[1] = k1Var != null ? k1Var.f450224c : "";
            objArr[2] = 5;
            objArr[3] = "";
            objArr[4] = java.lang.Integer.valueOf(i17);
            g0Var.d(14404, objArr);
        }
        int i18 = this.f450237h;
        if (i18 > 0 && i18 < this.f450238i && !isStreamMute) {
            ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).z(3, this.f450238i, 0);
        }
        if (k1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "holder.offLine = %s", java.lang.Boolean.valueOf(k1Var.f450225d));
            if (k1Var.f450225d) {
                o(k1Var);
                if (this.f450236g && this.f450234e == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "isPlaying && moneyPlayer == null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "has played");
                }
            } else {
                int i19 = k1Var.f450223b;
                if (com.tencent.mm.sdk.platformtools.t8.K0(k1Var.f450222a)) {
                    this.f450233d = ww1.j1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b_u, new ww1.z0(this, k1Var), new ww1.a1(this, k1Var));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 2L, 1L, false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play prefix voice: %d", java.lang.Integer.valueOf(i19));
                    android.media.MediaPlayer a17 = ww1.j1.a(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b_u, new ww1.w0(this, k1Var), new ww1.x0(this, k1Var));
                    this.f450233d = a17;
                    if (a17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "prefix duration: %s", java.lang.Integer.valueOf(a17.getDuration()));
                        com.tencent.mm.sdk.platformtools.u3.i(new ww1.y0(this), r0 + 1000);
                    }
                }
            }
        } else {
            this.f450236g = false;
        }
    }
}
