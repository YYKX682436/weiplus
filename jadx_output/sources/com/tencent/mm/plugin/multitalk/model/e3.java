package com.tencent.mm.plugin.multitalk.model;

@j95.b
/* loaded from: classes14.dex */
public class e3 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.multitalk.model.t0 f149935d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.multitalk.model.v0 f149936e;

    /* renamed from: f, reason: collision with root package name */
    public volatile sj3.d4 f149937f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.multitalk.model.s0 f149938g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.multitalk.model.l2 f149939h;

    /* renamed from: i, reason: collision with root package name */
    public volatile pj3.b f149940i;

    /* renamed from: m, reason: collision with root package name */
    public volatile pj3.d f149941m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.multitalk.model.t1 f149942n;

    /* renamed from: o, reason: collision with root package name */
    public volatile zi3.f f149943o;

    /* renamed from: p, reason: collision with root package name */
    public final c01.jd f149944p = new com.tencent.mm.plugin.multitalk.model.d3(this);

    public static com.tencent.mm.plugin.multitalk.model.e3 Ai() {
        return (com.tencent.mm.plugin.multitalk.model.e3) i95.n0.c(com.tencent.mm.plugin.multitalk.model.e3.class);
    }

    public static com.tencent.mm.plugin.multitalk.model.t0 Bi() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149935d == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149935d == null) {
                    Ai.f149935d = new com.tencent.mm.plugin.multitalk.model.t0();
                }
            }
        }
        return Ai.f149935d;
    }

    public static zi3.f Di() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149943o == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149943o == null) {
                    Ai.f149943o = new zi3.f();
                }
            }
        }
        return Ai.f149943o;
    }

    public static pj3.b Ni() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149940i == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149940i == null) {
                    Ai.f149940i = new pj3.b(gm0.j1.u().f273153f);
                }
            }
        }
        return Ai.f149940i;
    }

    public static com.tencent.mm.plugin.multitalk.model.v0 Ri() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149936e == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149936e == null) {
                    Ai.f149936e = new com.tencent.mm.plugin.multitalk.model.v0();
                }
            }
        }
        return Ai.f149936e;
    }

    public static pj3.d Ui() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149941m == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149941m == null) {
                    Ai.f149941m = new pj3.d(gm0.j1.u().f273153f);
                }
            }
        }
        return Ai.f149941m;
    }

    public static com.tencent.mm.plugin.multitalk.model.d2 Vi() {
        return (com.tencent.mm.plugin.multitalk.model.d2) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class);
    }

    public static sj3.d4 Zi() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149937f == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149937f == null) {
                    Ai.f149937f = new sj3.d4();
                }
            }
        }
        return Ai.f149937f;
    }

    public static com.tencent.mm.plugin.multitalk.model.l2 aj() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149939h == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149939h == null) {
                    Ai.f149939h = new com.tencent.mm.plugin.multitalk.model.l2();
                }
            }
        }
        return Ai.f149939h;
    }

    public static com.tencent.mm.plugin.multitalk.model.s0 wi() {
        com.tencent.mm.plugin.multitalk.model.e3 Ai = Ai();
        if (Ai.f149938g == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.plugin.multitalk.model.v0.class) {
                if (Ai.f149938g == null) {
                    Ai.f149938g = new com.tencent.mm.plugin.multitalk.model.s0();
                }
            }
        }
        return Ai.f149938g;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.plugin.multitalk.model.t2.f150137b += c01.z1.f();
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.multitalk.model.s2.f150130d);
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f149944p;
        if (f17.f37290a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
        } else {
            ((java.util.HashSet) f17.f37291b).add(jdVar);
        }
        Vi().Di();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        if (!kotlin.jvm.internal.o.b(M.getString("mmkv_multitalk_status", ""), "")) {
            com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
            kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
            M2.putInt("mmkv_multitalk_status_notAllowRecovery", 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk", "onAccountReleased: ");
        if (this.f149935d != null) {
            this.f149935d.d();
            this.f149935d = null;
        }
        if (this.f149936e != null) {
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f149936e;
            v0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "close: ");
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(v0Var.B1);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", th6, "unregister phoneStatusReceiver failed.", new java.lang.Object[0]);
            }
            v0Var.C1.dead();
            v0Var.f150171p = false;
            if (v0Var.f150176s != sj3.e4.Init) {
                v0Var.f(false, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "steve: account release. uninit ilink so");
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                i4Var.J(i4Var.f149644p2);
            }
            java.util.HashMap hashMap = v0Var.W;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f149936e = null;
        }
        if (this.f149939h != null) {
            com.tencent.mm.plugin.multitalk.model.l2 l2Var = this.f149939h;
            l2Var.f150038b = false;
            l2Var.f150037a = false;
            this.f149939h = null;
        }
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f149944p;
        if (f17.f37290a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
        } else {
            ((java.util.HashSet) f17.f37291b).remove(jdVar);
        }
    }
}
