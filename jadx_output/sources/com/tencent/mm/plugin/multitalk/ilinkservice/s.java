package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ilinkservice.t f149759a;

    /* renamed from: b, reason: collision with root package name */
    public volatile tl.w f149760b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ilinkservice.p f149761c;

    /* renamed from: d, reason: collision with root package name */
    public zi3.a f149762d;

    /* renamed from: e, reason: collision with root package name */
    public int f149763e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f149764f = 92;

    /* renamed from: g, reason: collision with root package name */
    public int f149765g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f149766h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public int f149767i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f149768j = 1;

    /* renamed from: k, reason: collision with root package name */
    public long f149769k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f149770l;

    /* renamed from: m, reason: collision with root package name */
    public int f149771m;

    /* renamed from: n, reason: collision with root package name */
    public int f149772n;

    /* renamed from: o, reason: collision with root package name */
    public int f149773o;

    /* renamed from: p, reason: collision with root package name */
    public int f149774p;

    /* renamed from: q, reason: collision with root package name */
    public int f149775q;

    /* renamed from: r, reason: collision with root package name */
    public final tl.v f149776r;

    public s(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        int i17 = com.tencent.mm.plugin.voip.model.v2protocal.Y1;
        this.f149770l = i17;
        this.f149771m = 1;
        this.f149772n = 20;
        this.f149773o = i17;
        this.f149774p = 1;
        this.f149775q = 20;
        this.f149776r = new com.tencent.mm.plugin.multitalk.ilinkservice.q(this);
        this.f149762d = new zi3.a();
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J = this.f149762d;
        this.f149761c = new com.tencent.mm.plugin.multitalk.ilinkservice.p();
        this.f149759a = new com.tencent.mm.plugin.multitalk.ilinkservice.t();
    }

    public int a() {
        com.tencent.mm.plugin.voip.model.e eVar;
        com.tencent.mm.plugin.multitalk.ilinkservice.t tVar = this.f149759a;
        if (tVar == null) {
            return 0;
        }
        tVar.getClass();
        zi3.f fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
        if (fVar == null || (eVar = fVar.f473170k) == null) {
            return 0;
        }
        return eVar.K;
    }

    public void b() {
        if (this.f149763e == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "dev start already...");
            return;
        }
        this.f149759a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "start device......");
        this.f149763e = 2;
        this.f149761c.getClass();
        wo.v1.f447823c.c();
        this.f149761c.a();
        if (this.f149764f <= 10) {
            this.f149764f = 92;
        }
        this.f149760b = new tl.w(this.f149770l, this.f149771m, 1);
        this.f149760b.g(this.f149772n);
        this.f149760b.j(true);
        this.f149760b.f(true);
        this.f149760b.f420160m = -19;
        this.f149760b.h(1, false);
        this.f149760b.i(true);
        this.f149760b.f420172y = this.f149776r;
    }

    public void c() {
        this.f149762d = null;
        com.tencent.mm.plugin.multitalk.ilinkservice.t tVar = this.f149759a;
        if (tVar != null) {
            synchronized (tVar.f149789a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlay, isStart: %s %s", java.lang.Boolean.valueOf(tVar.f149790b), java.lang.Integer.valueOf(tVar.hashCode()));
                if (tVar.f149790b) {
                    com.tencent.mm.plugin.voip.model.e eVar = tVar.f149791c;
                    if (eVar != null) {
                        eVar.e();
                        com.tencent.mm.plugin.voip.model.e eVar2 = tVar.f149791c;
                        kotlin.jvm.internal.o.d(eVar2);
                        eVar2.f();
                        tVar.f149791c = null;
                        zi3.f fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
                        if (fVar != null) {
                            fVar.f473170k = null;
                        }
                    }
                    zi3.f fVar2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
                    if (fVar2 != null) {
                        fVar2.G();
                    }
                    tVar.f149792d.b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "stopPlaying cost: " + tVar.f149792d.a());
                    tVar.f149790b = false;
                }
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Bi().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "stopRecord.");
        if (this.f149760b != null) {
            this.f149760b.l();
            this.f149760b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "finish pauseRecord");
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.I(false);
        this.f149763e = 3;
        if (this.f149759a != null) {
            zi3.f fVar3 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
            if (fVar3 != null) {
                fVar3.G();
            }
            this.f149759a.getClass();
            zi3.f fVar4 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
            if (fVar4 != null) {
                fVar4.R();
            }
        }
        com.tencent.mm.plugin.multitalk.model.e3.Bi().d();
    }

    public void d(r45.s70 s70Var) {
        if (s70Var != null) {
            r45.ge0 ge0Var = s70Var.f385535e;
            this.f149770l = ge0Var.f375153d;
            this.f149771m = ge0Var.f375155f;
            this.f149772n = ge0Var.f375154e;
            this.f149773o = ge0Var.f375162p;
            this.f149774p = ge0Var.f375164r;
            this.f149775q = ge0Var.f375163q;
        }
    }

    public boolean e() {
        com.tencent.mm.plugin.multitalk.ilinkservice.t tVar;
        int i17;
        if (this.f149763e != 2 || (tVar = this.f149759a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "hy: error not init when startplay, devStatus:" + this.f149763e);
            return false;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.r rVar = new com.tencent.mm.plugin.multitalk.ilinkservice.r(this);
        int i18 = this.f149773o;
        int i19 = this.f149774p;
        int i27 = this.f149775q;
        synchronized (tVar.f149789a) {
            if (tVar.f149790b) {
                i17 = -1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlay %s", java.lang.Integer.valueOf(tVar.hashCode()));
                int a17 = tVar.a(rVar, i18, i19, i27);
                zi3.f fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
                if (fVar != null) {
                    com.tencent.mm.plugin.voip.model.e eVar = tVar.f149791c;
                    fVar.f473170k = eVar;
                    if (eVar != null) {
                        eVar.R = fVar.f473172m;
                    }
                }
                tVar.f149792d.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "startPlaying cost: " + tVar.f149792d.a());
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "set start play");
                tVar.f149790b = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioPlayer", "finish start play: %s", java.lang.Integer.valueOf(a17));
                i17 = a17;
            }
        }
        if (i17 <= 0) {
            return false;
        }
        final com.tencent.mm.plugin.multitalk.model.t0 Bi = com.tencent.mm.plugin.multitalk.model.e3.Bi();
        com.tencent.mm.sdk.platformtools.b4 b4Var = Bi.f150133a;
        if (b4Var != null) {
            b4Var.d();
            Bi.f150133a.quitSafely();
            Bi.f150133a.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.multitalk.model.t0$$a
            @Override // com.tencent.mm.sdk.platformtools.a4
            public final boolean onTimerExpired() {
                com.tencent.mm.plugin.multitalk.model.t0 t0Var = com.tencent.mm.plugin.multitalk.model.t0.this;
                t0Var.getClass();
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t != null) {
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                    java.util.ArrayList a18 = i4Var.f149623f.a();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    if (a18 == null || a18.size() == 0 || i4Var.f149637n != 1) {
                        hashMap = null;
                    } else {
                        java.util.Iterator it = a18.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
                            int GetVoiceActivity = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.GetVoiceActivity(wVar.f149840a);
                            if (GetVoiceActivity > 0) {
                                hashMap.put(wVar.f149842c, java.lang.Integer.valueOf(GetVoiceActivity));
                            }
                        }
                    }
                    if (hashMap != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.entrySet());
                        java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.multitalk.model.t0$$b());
                        t0Var.f150134b = new java.util.concurrent.CopyOnWriteArrayList(arrayList);
                    }
                }
                return true;
            }
        }, true);
        Bi.f150133a = b4Var2;
        b4Var2.c(300L, 300L);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.f149617b2 = 0;
        i4Var.f149618c2 = 0;
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J != null) {
            i4Var.f149617b2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.E();
            i4Var.f149618c2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J.E();
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "seenli, startPlay mILinkStartSpeakerStreamType=%d", java.lang.Integer.valueOf(i4Var.f149617b2));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "seenli, startPlay SubCoreMultiTalk.getMultiTalkManager().mMultiTalkAudioManager == null");
        }
        return true;
    }

    public boolean f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "hy: trigger startrecord, isMicEnable:%b", java.lang.Boolean.valueOf(z17));
        if (this.f149763e != 2 || this.f149760b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkAudioMgr", "hy: not init when startrecord! devStatus:" + this.f149763e);
            return false;
        }
        synchronized (this.f149766h) {
            if (!this.f149760b.k()) {
                int i17 = this.f149760b.f420148a;
                return false;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.I(z17);
            i4Var.T1 = z17;
            boolean z18 = !z17;
            if (this.f149760b != null) {
                this.f149760b.n(z18);
            }
            i4Var.Y1 = ym1.f.Bi();
            i4Var.Z1 = ym1.f.Bi();
            i4Var.f149616a2 = this.f149760b != null ? this.f149760b.f420152e : 0;
            return true;
        }
    }
}
