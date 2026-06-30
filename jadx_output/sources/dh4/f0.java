package dh4;

/* loaded from: classes15.dex */
public class f0 implements com.tencent.mm.modelbase.u0, p21.a, c01.a8, p21.c {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f232516h;

    /* renamed from: i, reason: collision with root package name */
    public int f232517i;

    /* renamed from: m, reason: collision with root package name */
    public long f232518m;

    /* renamed from: n, reason: collision with root package name */
    public int f232519n;

    /* renamed from: o, reason: collision with root package name */
    public int f232520o;

    /* renamed from: p, reason: collision with root package name */
    public int f232521p;

    /* renamed from: r, reason: collision with root package name */
    public ah4.c f232523r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL f232524s;

    /* renamed from: t, reason: collision with root package name */
    public ah4.n f232525t;

    /* renamed from: u, reason: collision with root package name */
    public ah4.k f232526u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.u2 f232527v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f232528w;

    /* renamed from: d, reason: collision with root package name */
    public int f232512d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f232513e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f232514f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232515g = false;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f232522q = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final dh4.t0 f232529x = new dh4.t0();

    /* renamed from: y, reason: collision with root package name */
    public final android.content.ServiceConnection f232530y = new dh4.x(this);

    /* renamed from: z, reason: collision with root package name */
    public boolean f232531z = false;

    public f0() {
        int i17 = com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.f172448a;
        dh4.u uVar = new dh4.u();
        com.tencent.mm.sdk.platformtools.u2.f193007i = true;
        com.tencent.mm.sdk.platformtools.u2.f193006h = uVar;
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str.equals(this.f232516h)) {
            dh4.t0 t0Var = this.f232529x;
            t0Var.getClass();
            dh4.q0 q0Var = new dh4.q0(t0Var, str2, str3);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                q0Var.run();
            } else {
                t0Var.f232587b.post(q0Var);
            }
        }
    }

    public void a(p21.d dVar) {
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        synchronized (dVar) {
            if (!((java.util.LinkedList) t0Var.f232586a).contains(dVar)) {
                ((java.util.LinkedList) t0Var.f232586a).add(dVar);
            }
        }
        this.f232529x.a(j());
    }

    @Override // c01.a8
    public void b() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f232516h)) {
            g();
        }
        this.f232531z = false;
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        dh4.i0 i0Var = new dh4.i0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            i0Var.run();
        } else {
            t0Var.f232587b.post(i0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dh4.f0.c():void");
    }

    @Override // c01.a8
    public void d() {
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f232516h)) {
                ah4.k kVar = this.f232526u;
                if (kVar != null) {
                    kVar.bf();
                }
                ah4.n nVar = this.f232525t;
                if (nVar != null) {
                    nVar.a1();
                }
                this.f232514f = 2;
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
        this.f232531z = true;
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        dh4.h0 h0Var = new dh4.h0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            h0Var.run();
        } else {
            t0Var.f232587b.post(h0Var);
        }
    }

    public final void e() {
        this.f232514f = 1;
        this.f232515g = false;
        if (m()) {
            q();
            c();
            n();
            if (this.f232527v != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
                return;
            }
            com.tencent.mm.sdk.platformtools.u2 u2Var = new com.tencent.mm.sdk.platformtools.u2(new dh4.d0(this), true);
            this.f232527v = u2Var;
            com.tencent.mm.sdk.platformtools.u2.f193008j = true;
            u2Var.f193012d = 50000L;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            u2Var.f193011c = android.os.SystemClock.elapsedRealtime();
            long j17 = u2Var.f193012d;
            java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.sdk.platformtools.u2.f193005g;
            java.util.Iterator it = hashMap.entrySet().iterator();
            long j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            while (it.hasNext()) {
                com.tencent.mm.sdk.platformtools.u2 u2Var2 = (com.tencent.mm.sdk.platformtools.u2) ((java.util.Map.Entry) it.next()).getValue();
                if (u2Var2 != null) {
                    long j19 = u2Var2.f193011c;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j19;
                    if (elapsedRealtime < 0) {
                        elapsedRealtime = 0;
                    }
                    long j27 = u2Var2.f193012d;
                    if (elapsedRealtime <= j27) {
                        j27 -= elapsedRealtime;
                        if (j27 < j18) {
                        }
                    }
                    j18 = j27;
                }
            }
            boolean z19 = j18 > j17;
            java.util.Map map = com.tencent.mm.sdk.platformtools.u2.f193005g;
            int i17 = u2Var.f193009a;
            ((java.util.HashMap) map).remove(java.lang.Integer.valueOf(i17));
            hashMap.put(java.lang.Integer.valueOf(i17), u2Var);
            com.tencent.mm.sdk.platformtools.t2 t2Var = com.tencent.mm.sdk.platformtools.u2.f193006h;
            if (t2Var == null || !z19) {
                return;
            }
            t2Var.prepare();
        }
    }

    public final void f(int i17) {
        if (this.f232523r != null) {
            try {
                e();
                return;
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 0) {
            this.f232529x.b("bind talkroomService timeout", 3, -1);
        } else {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new dh4.c0(this, i17), 50L);
        }
    }

    public final void g() {
        try {
            dh4.l.Bi().a();
            ah4.k kVar = this.f232526u;
            if (kVar != null) {
                kVar.bf();
            }
            ah4.n nVar = this.f232525t;
            if (nVar != null) {
                nVar.u();
            }
            this.f232514f = 2;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
    }

    public void h(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", str, java.lang.Integer.valueOf(i17));
        this.f232512d = i17;
        if (l(str) == 1) {
            r(dh4.l.Ai());
        } else {
            a(dh4.l.Ai());
        }
        if (this.f232513e > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "addListener has init before");
        } else {
            c01.d9.e().a(332, this);
            c01.d9.e().a(334, this);
            c01.d9.e().a(336, this);
            c01.d9.e().a(335, this);
            dh4.l.Ni().a(this);
            com.tencent.mm.booter.b bVar = (com.tencent.mm.booter.b) c01.d9.c();
            bVar.getClass();
            ((java.util.ArrayList) bVar.f63305a).add(this);
            this.f232513e = 1;
            ah4.c cVar = this.f232523r;
            if (cVar != null) {
                try {
                    cVar.Nh();
                    this.f232523r.F8();
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                }
            }
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.talkroom.component.TalkRoomService.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            l85.r0 r0Var = l85.s0.f317208d;
            android.content.ServiceConnection serviceConnection = this.f232530y;
            r0Var.a(intent, serviceConnection);
            context.bindService(intent, serviceConnection, 1);
            this.f232524s = new dh4.a0(this);
        }
        boolean equals = str.equals(this.f232516h);
        dh4.t0 t0Var = this.f232529x;
        if (equals) {
            if (this.f232514f == 2) {
                t0Var.getClass();
                dh4.k0 k0Var = new dh4.k0(t0Var);
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    k0Var.run();
                    return;
                } else {
                    t0Var.f232587b.post(k0Var);
                    return;
                }
            }
            return;
        }
        this.f232516h = str;
        c01.d9.e().g(new eh4.a(str, l(str)));
        dh4.l.wi().f232544g = new dh4.v();
        dh4.v Bi = dh4.l.Bi();
        Bi.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        Bi.A = android.os.SystemClock.elapsedRealtime();
        dh4.l.Bi().f232609v = str;
        if (l(str) == 0) {
            dh4.l.Ai().f232560e = true;
        }
        t0Var.getClass();
        dh4.r0 r0Var2 = new dh4.r0(t0Var, str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            r0Var2.run();
        } else {
            t0Var.f232587b.post(r0Var2);
        }
    }

    public void i() {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "exitTalkRoom");
        u(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232516h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            Bi.f232592e = (int) ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
        }
        this.f232514f = 0;
        this.f232515g = false;
        int i19 = this.f232517i;
        c01.d9.e().g(new eh4.b(i19, this.f232518m, i19 != 0 ? this.f232516h : "", l(this.f232516h)));
        ah4.c cVar = this.f232523r;
        int i27 = -99999;
        if (cVar != null) {
            try {
                i17 = cVar.Nh();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                i17 = -99999;
            }
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", "engine.Close error %d", java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f232516h;
            ((sg3.a) v0Var).getClass();
            java.lang.String e18 = c01.a2.e(str);
            ah4.c cVar2 = this.f232523r;
            if (cVar2 != null) {
                int[] iArr = new int[1];
                try {
                    pByteArray.value = cVar2.C1(iArr, e18);
                } catch (android.os.RemoteException e19) {
                    iArr[0] = -99999;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e19, "", new java.lang.Object[0]);
                }
                i18 = iArr[0];
            } else {
                i18 = -99;
            }
            if (i18 == 0) {
                java.lang.String str2 = new java.lang.String(pByteArray.value);
                com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", java.lang.Integer.valueOf(pByteArray.value.length), str2);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.ok6 ok6Var = new r45.ok6();
                ok6Var.f382331d = 10402;
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = str2;
                du5Var.f372757e = true;
                ok6Var.f382332e = du5Var;
                r45.ok6 ok6Var2 = new r45.ok6();
                ok6Var2.f382331d = 10404;
                r45.du5 du5Var2 = new r45.du5();
                du5Var2.f372756d = dh4.l.Bi().toString();
                du5Var2.f372757e = true;
                ok6Var2.f382332e = du5Var2;
                linkedList.add(ok6Var);
                linkedList.add(ok6Var2);
                c01.d9.e().g(new eh4.g(linkedList, l(this.f232516h)));
            }
        }
        this.f232516h = "";
        this.f232517i = 0;
        this.f232518m = 0L;
        this.f232519n = 0;
        this.f232520o = 0;
        this.f232521p = 0;
        this.f232522q.clear();
        q();
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        dh4.s0 s0Var = new dh4.s0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            s0Var.run();
        } else {
            t0Var.f232587b.post(s0Var);
        }
        dh4.p Ai = dh4.l.Ai();
        Ai.f232562g.post(new dh4.o(Ai));
        this.f232513e = 0;
        c01.d9.e().q(332, this);
        c01.d9.e().q(334, this);
        c01.d9.e().q(336, this);
        c01.d9.e().q(335, this);
        dh4.l.Ni().f(this);
        ((java.util.ArrayList) ((com.tencent.mm.booter.b) c01.d9.c()).f63305a).remove(this);
        r(dh4.l.Ai());
        ah4.c cVar3 = this.f232523r;
        if (cVar3 != null) {
            try {
                i27 = cVar3.F8();
            } catch (android.os.RemoteException e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e27, "", new java.lang.Object[0]);
            }
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(this.f232530y);
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.talkroom.component.TalkRoomService.class));
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e28, "unbindService err", new java.lang.Object[0]);
        }
        this.f232523r = null;
        if (i27 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", java.lang.Integer.valueOf(i27));
        }
    }

    public java.lang.String j() {
        java.util.Iterator it = dh4.l.Ni().d(this.f232516h).iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (nk6Var.f381473d == this.f232521p) {
                return nk6Var.f381474e;
            }
        }
        return null;
    }

    public java.util.List k() {
        return dh4.l.Ni().d(this.f232516h);
    }

    public int l(java.lang.String str) {
        if (this.f232512d == 1) {
            return 1;
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(this.f232516h)) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean m() {
        int i17;
        try {
            i17 = this.f232523r.I7();
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            i17 = -99999;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "engine.protocalInit");
        if (i17 >= 0 || i17 == -3) {
            return true;
        }
        this.f232523r = null;
        com.tencent.mars.xlog.Log.f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", java.lang.Integer.valueOf(i17));
        this.f232529x.b("enterTalkRoom protocalInit failed", 3, -1);
        return false;
    }

    public final void n() {
        ah4.c cVar = this.f232523r;
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", "the engine should not be null.");
            return;
        }
        ah4.n Pb = cVar.Pb(new dh4.e0(this));
        this.f232525t = Pb;
        Pb.start();
        ah4.k H4 = this.f232523r.H4();
        this.f232526u = H4;
        H4.start();
    }

    public void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "putAwayMic");
        dh4.v Bi = dh4.l.Bi();
        if (Bi.F && !Bi.E) {
            Bi.f232613z++;
        }
        Bi.E = false;
        Bi.F = false;
        if (this.f232514f < 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f232528w;
        if (b4Var != null) {
            b4Var.d();
            this.f232528w = null;
        }
        g();
        int i17 = this.f232517i;
        long j17 = this.f232518m;
        java.lang.String str = this.f232516h;
        c01.d9.e().g(new eh4.d(i17, j17, 2, str, l(str)));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        eh4.f fVar = (eh4.f) m1Var;
        if (fVar.H() == null || !fVar.H().equals(this.f232516h)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", fVar.H(), this.f232516h);
            return;
        }
        dh4.t0 t0Var = this.f232529x;
        if (i17 != 0 || i18 != 0) {
            if (m1Var.getType() == 332) {
                dh4.v Bi = dh4.l.Bi();
                long j17 = Bi.A;
                if (j17 != 0) {
                    Bi.f232588a = 2;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    Bi.f232589b = android.os.SystemClock.elapsedRealtime() - j17;
                }
                if (i17 == 4) {
                    dh4.l.Bi().f232612y = i18;
                }
                t0Var.b("cgi enter failed : errType:" + i17 + " errCode:" + i18, i17, i18);
                i();
                return;
            }
            if (m1Var.getType() == 334) {
                if (((eh4.d) m1Var).f252942g != 1) {
                    return;
                }
                dh4.v Bi2 = dh4.l.Bi();
                Bi2.f232595h++;
                Bi2.C = 0L;
                g();
                com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
                if (i17 == 4 && (i18 == 311 || i18 == 340)) {
                    t0Var.d(i18);
                    return;
                } else {
                    t0Var.c(i17, i18, "TalkMicAction failed!!");
                    return;
                }
            }
            if (m1Var.getType() == 336) {
                this.f232515g = false;
                t0Var.c(i17, i18, "TalkGetMember failed!!");
                i();
                return;
            } else if (m1Var.getType() == 335) {
                t0Var.c(i17, i18, "TalkNoop failed!!");
                i();
                return;
            }
        }
        if (m1Var.getType() == 332) {
            dh4.v Bi3 = dh4.l.Bi();
            long j18 = Bi3.A;
            if (j18 != 0) {
                Bi3.f232588a = 1;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                Bi3.f232589b = android.os.SystemClock.elapsedRealtime() - j18;
            }
            eh4.a aVar = (eh4.a) m1Var;
            this.f232517i = aVar.f252924g;
            this.f232518m = aVar.f252925h;
            this.f232519n = aVar.f252926i;
            this.f232520o = aVar.f252927m;
            this.f232522q = aVar.f252929o;
            dh4.v Bi4 = dh4.l.Bi();
            int i27 = this.f232517i;
            long j19 = this.f232518m;
            Bi4.f232610w = i27;
            Bi4.f232611x = j19;
            dh4.l.Ni().g(this.f232516h, aVar.f252928n, null, null, fVar.I());
            f(100);
            return;
        }
        if (m1Var.getType() != 334) {
            if (m1Var.getType() == 336) {
                eh4.c cVar = (eh4.c) m1Var;
                dh4.l.Ni().g(this.f232516h, cVar.f252937h, null, null, fVar.I());
                int i28 = cVar.f252936g;
                if (i28 > this.f232519n) {
                    this.f232519n = i28;
                    if (this.f232514f >= 3) {
                        t0Var.d(311);
                    }
                    g();
                }
                this.f232515g = false;
                t0Var.a(j());
            }
            if (m1Var.getType() == 335 && this.f232514f == 0) {
                t0Var.c(3, -1, "talknoop success but in outside room state");
                return;
            }
            return;
        }
        eh4.d dVar = (eh4.d) m1Var;
        if (dVar.f252942g != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
            return;
        }
        dh4.v Bi5 = dh4.l.Bi();
        long j27 = Bi5.C;
        if (j27 != 0) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j27;
            long j28 = Bi5.f232593f;
            int i29 = Bi5.B;
            long j29 = (j28 * i29) + elapsedRealtime;
            int i37 = i29 + 1;
            Bi5.f232593f = j29 / i37;
            Bi5.B = i37;
            Bi5.f232594g++;
            Bi5.C = 0L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
        int i38 = dVar.f252943h;
        if (i38 < this.f232519n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(this.f232519n));
            g();
            t0Var.d(311);
            return;
        }
        this.f232519n = i38;
        try {
            i19 = this.f232523r.yh(i38);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            i19 = -99999;
        }
        if (this.f232514f != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
            return;
        }
        t0Var.getClass();
        dh4.m0 m0Var = new dh4.m0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            m0Var.run();
        } else {
            t0Var.f232587b.post(m0Var);
        }
        this.f232514f = 4;
        if (i19 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", java.lang.Integer.valueOf(i19));
        }
        if (this.f232528w != null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new dh4.b0(this), true);
        this.f232528w = b4Var;
        b4Var.c(5000L, 5000L);
    }

    public void p(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", this.f232516h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232516h) || this.f232514f < 2) {
            return;
        }
        dh4.l.Bi().f232596i++;
        if (z17) {
            if (!m()) {
                return;
            }
            try {
                n();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TalkRoomServer", e17.toString());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
        }
        g();
        this.f232514f = 1;
        try {
            ah4.c cVar = this.f232523r;
            if (cVar != null) {
                cVar.Nh();
            }
        } catch (android.os.RemoteException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e18, "", new java.lang.Object[0]);
        }
        if (this.f232517i != 0) {
            c();
        }
        if (z17) {
            return;
        }
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        dh4.j0 j0Var = new dh4.j0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            j0Var.run();
        } else {
            t0Var.f232587b.post(j0Var);
        }
    }

    public final void q() {
        ah4.n nVar = this.f232525t;
        if (nVar != null) {
            try {
                nVar.release();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
            this.f232525t = null;
        }
        ah4.k kVar = this.f232526u;
        if (kVar != null) {
            try {
                kVar.release();
            } catch (android.os.RemoteException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e18, "", new java.lang.Object[0]);
            }
            this.f232526u = null;
        }
        com.tencent.mm.sdk.platformtools.u2 u2Var = this.f232527v;
        if (u2Var != null) {
            ((java.util.HashMap) com.tencent.mm.sdk.platformtools.u2.f193005g).remove(java.lang.Integer.valueOf(u2Var.f193009a));
            this.f232527v = null;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f232528w;
        if (b4Var != null) {
            b4Var.d();
            this.f232528w = null;
        }
    }

    public void r(p21.d dVar) {
        dh4.t0 t0Var = this.f232529x;
        t0Var.getClass();
        synchronized (dVar) {
            ((java.util.LinkedList) t0Var.f232586a).remove(dVar);
        }
    }

    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", java.lang.Integer.valueOf(this.f232514f));
        if (this.f232514f != 4) {
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        Bi.E = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        Bi.D = android.os.SystemClock.elapsedRealtime();
        try {
            this.f232526u.Pe();
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
    }

    public boolean t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "seizeMic");
        if (this.f232514f != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
            if (this.f232514f == 0) {
                this.f232529x.c(3, -1, "seizeMic in outside room state");
            }
            return false;
        }
        ah4.n nVar = this.f232525t;
        if (nVar != null) {
            try {
                nVar.a1();
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
        }
        this.f232514f = 3;
        int i17 = this.f232517i;
        long j17 = this.f232518m;
        java.lang.String str = this.f232516h;
        c01.d9.e().g(new eh4.d(i17, j17, 1, str, l(str)));
        dh4.v Bi = dh4.l.Bi();
        Bi.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        Bi.C = android.os.SystemClock.elapsedRealtime();
        dh4.l.Bi().F = true;
        return true;
    }

    public final void u(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f232516h)) {
            return;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f232516h);
        if (p17 == null) {
            return;
        }
        p17.z1(xg3.b.b(p17, z17 ? 5 : 6, p17.w0()));
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, this.f232516h);
    }
}
