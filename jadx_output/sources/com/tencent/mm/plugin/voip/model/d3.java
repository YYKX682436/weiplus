package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class d3 implements com.tencent.mm.plugin.voip.model.c1 {
    public static int E = -1;
    public static int F = 20;
    public static int G;
    public static int H;
    public static int I;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.g1 f176411a;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f176414d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f176415e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f176416f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176417g;

    /* renamed from: h, reason: collision with root package name */
    public int f176418h;

    /* renamed from: i, reason: collision with root package name */
    public int f176419i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.a3 f176420j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.a3 f176421k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.z2 f176422l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.y2 f176423m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.x2 f176424n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.c3 f176425o;

    /* renamed from: p, reason: collision with root package name */
    public final rh.c1 f176426p;

    /* renamed from: r, reason: collision with root package name */
    public final ph.u f176428r;

    /* renamed from: s, reason: collision with root package name */
    public int f176429s;

    /* renamed from: t, reason: collision with root package name */
    public int f176430t;

    /* renamed from: x, reason: collision with root package name */
    public int f176434x;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f176412b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public int f176413c = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f176427q = new java.lang.Object();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f176431u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f176432v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176433w = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f176435y = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.s2(this), false);

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f176436z = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.t2(this), false);
    public final byte[] A = new byte[500];
    public final com.tencent.mm.sdk.platformtools.b4 B = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.u2(this), true);
    public final com.tencent.mm.sdk.platformtools.b4 C = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.v2(this), true);
    public final com.tencent.mm.sdk.platformtools.b4 D = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.w2(this), true);

    public d3() {
        this.f176411a = null;
        this.f176417g = false;
        this.f176418h = 0;
        this.f176419i = 0;
        this.f176429s = 0;
        this.f176430t = 0;
        com.tencent.mm.plugin.voip.model.g1 a17 = com.tencent.mm.plugin.voip.model.h1.a();
        this.f176411a = a17;
        a17.f176509a0 = this;
        this.f176417g = false;
        this.f176419i = 0;
        this.f176418h = 0;
        this.f176421k = new com.tencent.mm.plugin.voip.model.a3(this);
        this.f176420j = new com.tencent.mm.plugin.voip.model.a3(this);
        this.f176429s = 0;
        this.f176430t = 0;
        if (ih.d.c()) {
            ph.u uVar = (ph.u) ih.d.d().a(ph.u.class);
            this.f176428r = uVar;
            if (uVar != null) {
                this.f176426p = new gi.w0(uVar.f354296h, "voIpSrv");
            }
        }
    }

    public int a(java.lang.String str, int i17, int i18) {
        long j17;
        long j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "call username:%s, callType:%d, inviteType:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed call without valid username.");
            return -1;
        }
        if (this.f176411a.p()) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed call withing calling.");
            return -1;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176411a.f176532x;
        v2protocalVar.f176874p = 1;
        v2protocalVar.f176853i = str;
        vq4.d0.a("MicroMsg.Voip.VoipServiceEx", fp.k.c() + "call username:" + str);
        if (this.f176411a.f176532x.Q1) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", fp.k.c() + "v2protocal already init.");
            this.f176411a.f176532x.A(false);
            this.f176411a.f176532x.B();
        }
        if (this.f176411a.f176532x.z() < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
            return -1;
        }
        if (this.f176411a.f176532x.R1 != null) {
            this.f176411a.f176532x.R1.f176635t = this.f176411a;
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
        com.tencent.mm.plugin.voip.model.f fVar = com.tencent.mm.plugin.voip.model.v2protocal.f176824k2;
        if (fVar != null) {
            fVar.f176491s = g1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "setStrategyCaller");
        }
        this.C.c(50000L, 50000L);
        this.f176411a.f176532x.f176886t = (int) (java.lang.System.currentTimeMillis() / 1000);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f176411a.f(linkedList);
        this.f176411a.f176532x.f176884s0 = "invite:" + this.f176411a.f176532x.f176869n0 + ":" + this.f176411a.f176532x.f176872o0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = this.f176411a.f176532x;
        vq4.a aVar = v2protocalVar3.f176865m;
        if (aVar != null) {
            j17 = aVar.f439261c;
            j18 = aVar.f439262d;
        } else {
            j17 = 0;
            j18 = 0;
        }
        new mq4.q(arrayList, v2protocalVar3.field_peerId, v2protocalVar3.field_capInfo, v2protocalVar3.f176847g, i17, i18, v2protocalVar3.f176886t, linkedList, j17, j18).L();
        this.f176411a.D(2);
        com.tencent.mm.plugin.voip.model.g1 g1Var2 = this.f176411a;
        if (3 != g1Var2.f176510b) {
            g1Var2.f176510b = 3;
        }
        g1Var2.A.f176648c = 1;
        this.f176435y.c(60000L, 60000L);
        com.tencent.mm.plugin.voip.model.l1 l1Var = this.f176411a.f176532x.M1;
        l1Var.getClass();
        l1Var.H = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.voip.model.l1 l1Var2 = this.f176411a.f176532x.M1;
        l1Var2.getClass();
        l1Var2.f176725l = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.voip.model.g1 g1Var3 = this.f176411a;
        g1Var3.f176532x.M1.f176724k = i18;
        g1Var3.E = true;
        if (gq4.v.Ni()) {
            this.f176411a.u();
        }
        return 0;
    }

    public int b(int i17) {
        if (!this.f176411a.p()) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call ,as not in calling.");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "cancelCallEx, roomId:%d, inviteId:%d, cancelType:%d", java.lang.Integer.valueOf(this.f176411a.f176532x.f176877q), java.lang.Integer.valueOf(this.f176411a.f176532x.f176886t), java.lang.Integer.valueOf(i17));
        synchronized (this.f176412b) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176411a.f176532x;
            if (v2protocalVar.f176877q == 0 && v2protocalVar.f176886t == 0) {
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call with roomid = 0 and inviteId = 0 ");
                return -1;
            }
            if (v2protocalVar.Q1) {
                v2protocalVar.A(true);
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.voip.model.j0.h(this.f176411a.f176532x.f176877q));
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176411a.f176532x;
                new mq4.i(v2protocalVar2.f176877q, v2protocalVar2.f176883s, v2protocalVar2.f176853i, "", v2protocalVar2.f176886t, i17, currentTimeMillis, v2protocalVar2.f176828J).L();
            }
            com.tencent.mm.plugin.voip.model.l1 l1Var = this.f176411a.f176532x.M1;
            l1Var.getClass();
            l1Var.f176735v = (int) (java.lang.System.currentTimeMillis() - l1Var.H);
            vq4.d0.a("MicroMsg.VoipDailReport", "devin:cancelInvite:" + l1Var.f176735v);
            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
            if (v2protocalVar3.M == 0 && v2protocalVar3.N == 0) {
                com.tencent.mm.plugin.voip.model.i1 i1Var = g1Var.A;
                int d17 = i1Var.d();
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var.f176532x;
                v2protocalVar4.M = d17;
                v2protocalVar4.N = i1Var.c();
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var2 = this.f176411a;
            g1Var2.f176532x.M1.W = g1Var2.f176534z.H();
            if (gq4.v.Bi().f176559b != null) {
                this.f176411a.f176532x.M1.Z = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).P;
                this.f176411a.f176532x.M1.X = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).M / 1000;
                this.f176411a.f176532x.M1.Y = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).N / 1000;
            }
            this.f176411a.f176532x.getClass();
            java.lang.String q17 = this.f176411a.f176532x.q();
            java.lang.String r17 = this.f176411a.f176532x.r();
            java.lang.String p17 = this.f176411a.f176532x.p();
            java.lang.String k17 = this.f176411a.f176532x.k();
            java.lang.String[] o17 = this.f176411a.f176532x.o();
            java.lang.String[] l17 = this.f176411a.f176532x.l();
            java.lang.String[] n17 = this.f176411a.f176532x.n();
            java.lang.String[] m17 = this.f176411a.f176532x.m();
            if (q17.length() > 0) {
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar5 = this.f176411a.f176532x;
                new mq4.a0(v2protocalVar5.f176877q, v2protocalVar5.f176883s, v2protocalVar5.f176853i, "\u0000", q17, p17, r17, k17, o17, l17, n17, m17).L();
            }
            this.f176411a.g();
            this.f176434x = e();
            n();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar6 = this.f176411a.f176532x;
            v2protocalVar6.f176877q = 0;
            v2protocalVar6.f176886t = 0;
            return 0;
        }
    }

    public void c() {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        if (g1Var.p()) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "checkStartup failed, stauts = " + g1Var.f176508a);
        }
        vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "checkStartup...devicekey = " + com.tencent.mm.storage.la.m0());
        g1Var.h();
        this.C.d();
        this.f176436z.d();
        this.f176435y.d();
        this.B.d();
        this.D.d();
        this.f176413c = 0;
        wo.v1.a(gm0.j1.u().j().n0(77825));
    }

    public void d(int i17, long j17, int i18, byte[] bArr, byte[] bArr2, java.lang.String str) {
        vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "doAck roomId:" + i17 + ", roomKey:" + j17 + ", ackstatus:" + i18);
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        if (i17 != 0 && j17 != 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            g1Var.f(linkedList);
            g1Var.f176532x.f176884s0 = "ack:" + g1Var.f176532x.f176869n0 + ":" + g1Var.f176532x.f176872o0;
            mq4.c cVar = new mq4.c(i17, j17, i18, bArr, bArr2, str, linkedList);
            com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
            l1Var.getClass();
            l1Var.K = java.lang.System.currentTimeMillis();
            cVar.L();
        }
        rq4.q.f399067a.a(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(this.f176433w));
        rq4.u uVar = rq4.u.f399109a;
        long m17 = gq4.v.Bi().m();
        long n17 = gq4.v.Bi().n();
        rq4.u.f399110b = m17;
        rq4.u.f399111c = n17;
        if (gq4.v.Ni()) {
            g1Var.u();
        }
    }

    public int e() {
        return this.f176411a.f176532x.f176877q;
    }

    public long f() {
        return this.f176411a.f176532x.f176883s;
    }

    public void finalize() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "stop");
        n();
        this.f176411a.getClass();
        super.finalize();
    }

    public int g(int i17) {
        int i18;
        nq4.f.f339014a.d();
        vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "hangUp,status:" + this.f176411a.f176508a + " roomid:" + this.f176411a.f176532x.f176877q + ",reason=" + i17 + ",threadid = " + java.lang.Thread.currentThread().getId());
        com.tencent.mm.plugin.voip.model.i1 i1Var = this.f176411a.A;
        if (i1Var != null) {
            i1Var.j();
        }
        this.f176411a.i();
        com.tencent.mm.plugin.voip.model.l1 l1Var = this.f176411a.f176532x.M1;
        if (l1Var.f176723j == 1) {
            if (l1Var.B == 0) {
                l1Var.f176734u = 0;
            } else {
                l1Var.f176734u = (int) ((java.lang.System.currentTimeMillis() - l1Var.B) / 1000);
            }
            if (l1Var.f176734u < 0) {
                l1Var.f176734u = 0;
                vq4.d0.b("MicroMsg.VoipDailReport", "devin:endTalk, iCallTime Err, rest 0");
            }
            vq4.d0.c("MicroMsg.VoipDailReport", "devin:endTalk:" + l1Var.f176734u);
        }
        this.f176434x = e();
        synchronized (this.f176412b) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176411a.f176532x;
            int i19 = v2protocalVar.M1.f176726m;
            if (v2protocalVar.f176877q == 0 && 8 != i19 && 9 != i19 && 10 != i19 && 11 != i19 && 12 != i19 && 99 != i19) {
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "call hangUp roomId == 0 ");
                this.f176411a.g();
                n();
                this.f176411a.f176532x.f176877q = 0;
                vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "hangUp over");
            }
            vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "steve:hangUp, uninitGLRender before protocalUninit first!!");
            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
            if (((g1Var.f176532x.E & 8388608) != 0) && i17 != 2 && g1Var.f176516h) {
                g1Var.y(3);
            }
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176411a.f176532x;
            if (v2protocalVar2.Q1) {
                v2protocalVar2.A(true);
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = this.f176411a.f176532x.M1;
                l1Var2.getClass();
                l1Var2.R = java.lang.System.currentTimeMillis();
                jz5.l g17 = com.tencent.mm.plugin.voip.model.j0.g(this.f176411a.f176532x.f176877q);
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - ((java.lang.Long) g17.f302833d).longValue());
                if (((java.lang.Long) g17.f302834e).longValue() != 0) {
                    i18 = ((int) (java.lang.System.currentTimeMillis() - ((java.lang.Long) g17.f302834e).longValue())) / 1000;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Voip.VoipServiceEx", "hangUpEx: may be not connected, hangUpReason %d", java.lang.Integer.valueOf(i17));
                    i18 = 0;
                }
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = this.f176411a.f176532x;
                new mq4.u(v2protocalVar3.f176877q, v2protocalVar3.f176883s, "", i17, currentTimeMillis, i18).L();
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "devin: shutdown cgi ");
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var2 = this.f176411a;
            g1Var2.f176532x.M1.W = g1Var2.f176534z.H();
            if (gq4.v.Bi().f176559b != null) {
                this.f176411a.f176532x.M1.Z = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).P;
                this.f176411a.f176532x.M1.X = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).M / 1000;
                this.f176411a.f176532x.M1.Y = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).N / 1000;
            }
            this.f176411a.f176532x.getClass();
            java.lang.String q17 = this.f176411a.f176532x.q();
            java.lang.String r17 = this.f176411a.f176532x.r();
            java.lang.String p17 = this.f176411a.f176532x.p();
            java.lang.String k17 = this.f176411a.f176532x.k();
            java.lang.String[] o17 = this.f176411a.f176532x.o();
            java.lang.String[] l17 = this.f176411a.f176532x.l();
            java.lang.String[] n17 = this.f176411a.f176532x.n();
            java.lang.String[] m17 = this.f176411a.f176532x.m();
            if (q17.length() > 0) {
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = this.f176411a.f176532x;
                new mq4.a0(v2protocalVar4.f176877q, v2protocalVar4.f176883s, v2protocalVar4.f176853i, "\u0000", q17, p17, r17, k17, o17, l17, n17, m17).L();
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "devin: statreport cgi ");
            }
            this.f176411a.g();
            n();
            this.f176411a.f176532x.f176877q = 0;
            vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "hangUp over");
        }
        return 0;
    }

    public boolean h() {
        boolean z17;
        boolean fk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
        if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).getClass();
            com.tencent.mm.plugin.appbrand.av_device_usage.q qVar = com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d;
            z17 = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(fb1.d.f260833h).a();
        } else {
            z17 = false;
        }
        if (!vq4.p0.c() && !iq.b.H()) {
            com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent checkF2FCameraIsOpenEvent = new com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent();
            checkF2FCameraIsOpenEvent.e();
            checkF2FCameraIsOpenEvent.f54049g.getClass();
            iq.b.r();
            if (!fk6 && !z17 && !com.tencent.mm.sdk.platformtools.l5.Bi()) {
                return false;
            }
        }
        return true;
    }

    public boolean i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isRoomReady, roomId: ");
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        sb6.append(g1Var.f176532x.f176877q);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", sb6.toString());
        if (g1Var.f176532x.f176877q == 0) {
            return false;
        }
        int i17 = g1Var.f176508a;
        return !(i17 == 2 || i17 == 4);
    }

    public void j(r45.r27 r27Var) {
        if (r27Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, roomId: %s", java.lang.Integer.valueOf(r27Var.f384489d));
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        r45.r27 r27Var2 = g1Var.D;
        if (r27Var2 == null || r27Var.f384489d != r27Var2.f384489d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, mInviteRoomInfo is null or the roomid is not equal");
            return;
        }
        if (g1Var.f176515g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, already accept, ignore it");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, not accept, hangout");
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399059f;
        g(2);
        g1Var.H();
        g1Var.U.post(new com.tencent.mm.plugin.voip.model.r0(g1Var));
    }

    public boolean k(r45.r27 r27Var) {
        if (r27Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, roomId: %s", java.lang.Integer.valueOf(r27Var.f384489d));
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        r45.r27 r27Var2 = g1Var.D;
        if (r27Var2 == null || r27Var.f384489d != r27Var2.f384489d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, mInviteRoomInfo is null or the roomid is not equal");
            return false;
        }
        rq4.q qVar = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399059f;
        g(2);
        g1Var.H();
        g1Var.U.post(new com.tencent.mm.plugin.voip.model.r0(g1Var));
        return true;
    }

    public void l(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "onFinishVoIP finishType: " + i17);
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        if (i17 == 1) {
            g1Var.f176534z.F(i18, str, i19, str2);
            rq4.q qVar = rq4.q.f399067a;
            rq4.q.f399070d = rq4.o.f399061h;
            g(4);
            return;
        }
        if (i17 == 4) {
            g1Var.f176534z.W();
            rq4.q qVar2 = rq4.q.f399067a;
            rq4.q.f399070d = rq4.o.f399064n;
            g(2);
            return;
        }
        if (i17 == 5) {
            g1Var.f176534z.M();
            rq4.q qVar3 = rq4.q.f399067a;
            rq4.q.f399070d = rq4.o.f399063m;
            g(3);
            return;
        }
        if (i17 != 6) {
            return;
        }
        g1Var.f176534z.I(true);
        rq4.q qVar4 = rq4.q.f399067a;
        rq4.q.f399070d = rq4.o.f399060g;
        g(2);
    }

    public int m() {
        nq4.f.f339014a.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "reject");
        if (!(this.f176411a.f176508a == 3)) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to reject with calling, status =" + this.f176411a.f176508a);
            return -1;
        }
        synchronized (this.f176412b) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176411a.f176532x;
            if (v2protocalVar.f176877q == 0) {
                vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
                return -1;
            }
            v2protocalVar.M1.a();
            vq4.d0.a("MicroMsg.Voip.VoipServiceEx", " reject, status:" + this.f176411a.f176508a + " roomid:" + this.f176411a.f176532x.f176877q);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176411a.f176532x;
            mq4.g gVar = new mq4.g(2, v2protocalVar2.f176847g, v2protocalVar2.f176877q, new byte[0], new byte[0], v2protocalVar2.f176883s, false, false, null);
            com.tencent.mm.plugin.voip.model.l1 l1Var = this.f176411a.f176532x.M1;
            l1Var.getClass();
            l1Var.M = java.lang.System.currentTimeMillis();
            gVar.L();
            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
            if (v2protocalVar3.M == 0 && v2protocalVar3.N == 0) {
                com.tencent.mm.plugin.voip.model.i1 i1Var = g1Var.A;
                int d17 = i1Var.d();
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var.f176532x;
                v2protocalVar4.M = d17;
                v2protocalVar4.N = i1Var.c();
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var2 = this.f176411a;
            g1Var2.f176532x.M1.W = g1Var2.f176534z.H();
            if (gq4.v.Bi().f176559b != null) {
                this.f176411a.f176532x.M1.Z = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).P;
                this.f176411a.f176532x.M1.X = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).M / 1000;
                this.f176411a.f176532x.M1.Y = ((com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b).N / 1000;
            }
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar5 = this.f176411a.f176532x;
            if (v2protocalVar5.Q1) {
                v2protocalVar5.A(true);
            }
            this.f176411a.f176532x.getClass();
            java.lang.String q17 = this.f176411a.f176532x.q();
            java.lang.String r17 = this.f176411a.f176532x.r();
            java.lang.String p17 = this.f176411a.f176532x.p();
            java.lang.String k17 = this.f176411a.f176532x.k();
            java.lang.String[] o17 = this.f176411a.f176532x.o();
            java.lang.String[] l17 = this.f176411a.f176532x.l();
            java.lang.String[] n17 = this.f176411a.f176532x.n();
            java.lang.String[] m17 = this.f176411a.f176532x.m();
            vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "devin: statreport");
            if (q17.length() > 0) {
                vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() > 0");
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar6 = this.f176411a.f176532x;
                new mq4.a0(v2protocalVar6.f176877q, v2protocalVar6.f176883s, v2protocalVar6.f176853i, "\u0000", q17, p17, r17, k17, o17, l17, n17, m17).L();
            } else {
                vq4.d0.a("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() <= 0");
            }
            this.f176411a.g();
            this.f176434x = e();
            n();
            this.f176411a.f176532x.f176877q = 0;
            return 0;
        }
    }

    public void n() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f176411a.f176532x.f176877q);
        kg0.m mVar = (kg0.m) ((bd0.n) i95.n0.c(bd0.n.class));
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPFeatureReportService", "release %s", valueOf);
        mg0.a wi6 = mVar.wi(valueOf);
        if (wi6 != null) {
            wi6.f326197a = "";
            wi6.f326198b = 0;
            wi6.f326199c = 0;
            wi6.f326200d = 0;
            wi6.f326202f = -1;
            wi6.f326201e = false;
            ((java.util.concurrent.ConcurrentHashMap) mVar.f307680d).remove(valueOf);
        }
        this.f176431u = null;
        this.f176432v = false;
        this.f176433w = false;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "reset");
        g1Var.A.j();
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.Q1) {
            v2protocalVar.A(false);
        } else {
            vq4.b0 b0Var = vq4.b0.f439270a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fix_v2protocal_leak_t2, false)) {
                if (gq4.v.Bi().l("ENCODE") != null) {
                    gq4.v.Bi().l("ENCODE").c(new com.tencent.mm.plugin.voip.model.m3(v2protocalVar));
                } else {
                    v2protocalVar.E();
                }
            }
        }
        v2protocalVar.B();
        g1Var.Y = 0.0d;
        g1Var.X = false;
        g1Var.f176527s = -1;
        g1Var.f176528t = -1;
        g1Var.f176529u = -1;
        v2protocalVar.Q = 0;
        g1Var.Z.d();
        com.tencent.mm.plugin.voip.model.i3 i3Var = g1Var.B;
        r45.k27 k27Var = i3Var.f176679c;
        if (k27Var != null) {
            k27Var.f378336e.clear();
            i3Var.f176679c.f378335d = 0;
            i3Var.f176679c = null;
            i3Var.f176680d = 0;
        }
        g1Var.T.d();
        g1Var.f176513e = false;
        g1Var.f176512d = false;
        g1Var.f176514f = false;
        g1Var.f176515g = false;
        g1Var.C = null;
        g1Var.D = null;
        g1Var.E = false;
        g1Var.G = 0;
        g1Var.F = false;
        g1Var.f176530v = -1;
        g1Var.f176531w = -1;
        g1Var.f176517i = false;
        g1Var.f176518j = false;
        g1Var.f176516h = false;
        g1Var.f176511c = false;
        g1Var.f176519k = false;
        g1Var.f176526r = 10;
        g1Var.f176508a = 1;
        g1Var.f176510b = 1;
        g1Var.L = 0;
        g1Var.S = 0;
        g1Var.M = false;
        g1Var.K = 0;
        g1Var.P = null;
        g1Var.R.clear();
        this.C.d();
        this.f176435y.d();
        this.f176436z.d();
        this.B.d();
        this.D.d();
        this.f176429s = 0;
        this.f176430t = 0;
        wu5.c cVar = this.f176414d;
        if (cVar != null) {
            cVar.cancel(false);
            this.f176414d = null;
        }
        wu5.c cVar2 = this.f176415e;
        if (cVar2 != null) {
            cVar2.cancel(false);
            this.f176415e = null;
        }
        wu5.c cVar3 = this.f176416f;
        if (cVar3 != null) {
            cVar3.cancel(false);
            this.f176416f = null;
        }
        com.tencent.mm.plugin.voip.model.c3 c3Var = this.f176425o;
        if (c3Var != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(c3Var);
            this.f176425o = null;
        }
        vq4.c cVar4 = vq4.d.f439282a;
        if (cVar4 != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(cVar4);
        }
        vq4.d.f439282a = null;
        this.f176413c = 0;
        gq4.v.Bi().R();
        gq4.v.Bi().getClass();
        this.f176417g = false;
        this.f176419i = 0;
        this.f176418h = 0;
        this.f176421k.a();
        this.f176420j.a();
        if (this.f176426p != null) {
            synchronized (this.f176427q) {
                if (this.f176426p.E()) {
                    this.f176426p.a();
                }
                this.f176426p.b();
            }
        }
    }

    public void o(boolean z17) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176411a.f176532x;
        if (v2protocalVar != null) {
            try {
                r45.ww6 ww6Var = new r45.ww6();
                if (z17) {
                    ww6Var.f389547d = 24;
                } else {
                    ww6Var.f389547d = 23;
                }
                long doubleToLongBits = java.lang.Double.doubleToLongBits(java.lang.System.currentTimeMillis() / 1000);
                byte[] bArr = new byte[8];
                for (int i17 = 0; i17 < 8; i17++) {
                    bArr[i17] = (byte) ((doubleToLongBits >> (i17 * 8)) & 255);
                }
                ww6Var.f389548e = new com.tencent.mm.protobuf.g(bArr, 0, 8);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "send camera capture pause " + z17);
                v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
            } catch (java.lang.Exception unused) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "send camera capture pause error " + z17);
            }
        }
    }

    public boolean p(r45.r27 r27Var) {
        boolean z17;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176411a;
        if (g1Var.p()) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to setInviteContent during calling, status =" + g1Var.f176508a);
            return false;
        }
        if (r27Var == null) {
            return false;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        v2protocalVar.M1.f176724k = r27Var.f384495m;
        if (v2protocalVar.Q1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Voip.VoipServiceEx", "[" + java.lang.Thread.currentThread().getId() + "]" + (fp.k.c() + "v2protocal already init."));
            v2protocalVar.A(false);
            v2protocalVar.B();
        }
        g1Var.D = r27Var;
        java.lang.String str = r27Var.f384494i;
        v2protocalVar.f176853i = str;
        v2protocalVar.f176877q = r27Var.f384489d;
        v2protocalVar.f176883s = r27Var.f384490e;
        v2protocalVar.f176828J = r27Var.f384495m;
        v2protocalVar.f176880r = 1;
        v2protocalVar.f176874p = 0;
        g1Var.f176508a = 3;
        if (str == null || str == "") {
            com.tencent.mm.autogen.mmdata.rpt.VoipErrorReportStruct voipErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipErrorReportStruct();
            voipErrorReportStruct.f61756d = 2;
            voipErrorReportStruct.f61757e = voipErrorReportStruct.b("errorInfo", java.lang.String.valueOf(r27Var.f384489d), true);
            voipErrorReportStruct.o();
            voipErrorReportStruct.k();
        }
        boolean fk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
        if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).getClass();
            com.tencent.mm.plugin.appbrand.av_device_usage.q qVar = com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d;
            z17 = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a.a(fb1.d.f260833h).a();
        } else {
            z17 = false;
        }
        if (!vq4.p0.c() && !iq.b.H()) {
            com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent checkF2FCameraIsOpenEvent = new com.tencent.mm.autogen.events.CheckF2FCameraIsOpenEvent();
            checkF2FCameraIsOpenEvent.e();
            checkF2FCameraIsOpenEvent.f54049g.getClass();
            iq.b.r();
            if (!fk6 && !z17) {
                if (v2protocalVar.z() < 0) {
                    vq4.d0.b("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
                    return false;
                }
                com.tencent.mm.plugin.voip.model.f fVar = com.tencent.mm.plugin.voip.model.v2protocal.f176824k2;
                if (fVar != null) {
                    fVar.f176491s = g1Var;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "setStrategyCaller");
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11524, true, true, java.lang.Integer.valueOf(r27Var.f384489d), java.lang.Long.valueOf(r27Var.f384490e), java.lang.Integer.valueOf(r27Var.f384495m), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                if (!this.f176417g) {
                    g1Var.f176534z.J();
                    com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
                    boolean z18 = r27Var.f384495m == 0;
                    Bi.getClass();
                    sq4.a aVar = new sq4.a(z18, true, true, true, false, true, true);
                    int e17 = Bi.f176558a.e();
                    long f17 = Bi.f176558a.f();
                    com.tencent.mm.plugin.voip.model.d3 d3Var = Bi.f176558a;
                    long j17 = d3Var.f176411a.f176532x.f176828J;
                    boolean z19 = d3Var.f176433w;
                    long j18 = 1;
                    java.lang.String c17 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().c();
                    com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct voipButtonStatusStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct();
                    voipButtonStatusStruct.f61704d = e17;
                    voipButtonStatusStruct.f61705e = f17;
                    voipButtonStatusStruct.f61706f = j17 == 0 ? 1L : 2L;
                    voipButtonStatusStruct.f61707g = z19 ? 1L : 2L;
                    voipButtonStatusStruct.p(aVar.toString());
                    voipButtonStatusStruct.f61710j = j18;
                    voipButtonStatusStruct.f61709i = java.lang.System.currentTimeMillis();
                    voipButtonStatusStruct.q(c17);
                    voipButtonStatusStruct.k();
                }
                rq4.q.f399067a.a(java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), r27Var.f384494i, java.lang.Boolean.valueOf(this.f176433w));
                rq4.u uVar = rq4.u.f399109a;
                long m17 = gq4.v.Bi().m();
                long n17 = gq4.v.Bi().n();
                rq4.u.f399110b = m17;
                rq4.u.f399111c = n17;
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipServiceEx", "setInviteContent, reject, pstn/multitak/f2f talking");
        if (!vq4.p0.c()) {
            iq.b.r();
            if (!fk6 && !z17 && !iq.b.H()) {
                m();
                boolean z27 = r27Var.f384495m == 0;
                java.lang.String str2 = r27Var.f384494i;
                int i17 = com.tencent.mm.storage.f9.f193926r2;
                com.tencent.mm.plugin.voip.model.b2.e(str2, z27 ? "voip_content_video" : "voip_content_voice", 0, 6, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kae), false, null);
                return false;
            }
        }
        d(r27Var.f384489d, r27Var.f384490e, 2, null, null, r27Var.f384494i);
        return false;
    }
}
