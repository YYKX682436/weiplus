package com.tencent.mm.plugin.messenger.foundation;

@j95.b
/* loaded from: classes11.dex */
public class h2 extends i95.w implements vg3.x3 {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.storage.k4 f148656d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.storage.ab f148657e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.storage.w7 f148658f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.storage.g9 f148659g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.storage.m4 f148660h;

    /* renamed from: i, reason: collision with root package name */
    public volatile e21.f f148661i;

    /* renamed from: m, reason: collision with root package name */
    public volatile com.tencent.mm.storage.ka f148662m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.tencent.mm.storage.x4 f148663n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.tencent.mm.storage.q7 f148664o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.storage.o7 f148665p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.tencent.mm.storage.jb f148666q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.tencent.mm.storage.u8 f148667r;

    /* renamed from: s, reason: collision with root package name */
    public volatile com.tencent.mm.storage.qa f148668s;

    /* renamed from: t, reason: collision with root package name */
    public volatile com.tencent.mm.storage.gb f148669t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.tencent.mm.storage.d3 f148670u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.tencent.mm.storage.z7 f148671v;

    /* renamed from: Ai, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.k4 Bi() {
        if (this.f148656d == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.k4.class) {
                if (this.f148656d == null) {
                    this.f148656d = new com.tencent.mm.storage.k4(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148656d;
    }

    public com.tencent.mm.storage.m4 Di() {
        if (this.f148660h == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.m4.class) {
                if (this.f148660h == null) {
                    this.f148660h = new com.tencent.mm.storage.m4(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148660h;
    }

    public xg3.x Ni() {
        if (this.f148663n == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.x4.class) {
                if (this.f148663n == null) {
                    this.f148663n = new com.tencent.mm.storage.x4(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148663n;
    }

    public xg3.y Ri() {
        if (this.f148665p == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.o7.class) {
                if (this.f148665p == null) {
                    this.f148665p = new com.tencent.mm.storage.o7(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148665p;
    }

    public xg3.z Ui() {
        if (this.f148664o == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.q7.class) {
                if (this.f148664o == null) {
                    this.f148664o = new com.tencent.mm.storage.q7(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148664o;
    }

    public xg3.b0 Vi() {
        if (this.f148658f == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.w7.class) {
                if (this.f148658f == null) {
                    this.f148658f = new com.tencent.mm.storage.w7(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148658f;
    }

    public xg3.c0 Zi() {
        if (this.f148667r == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.u8.class) {
                if (this.f148667r == null) {
                    this.f148667r = new com.tencent.mm.storage.u8(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148667r;
    }

    public xg3.f0 aj() {
        if (this.f148661i == null && gm0.j1.a()) {
            synchronized (xg3.f0.class) {
                if (this.f148661i == null) {
                    this.f148661i = new e21.f();
                }
            }
        }
        return this.f148661i;
    }

    /* renamed from: bj, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.g9 cj() {
        boolean z17;
        if (this.f148659g == null && gm0.j1.a()) {
            com.tencent.mm.storage.k4 Bi = Bi();
            com.tencent.mm.storage.m4 Di = Di();
            synchronized (com.tencent.mm.storage.g9.class) {
                if (this.f148659g == null) {
                    this.f148659g = new com.tencent.mm.storage.g9(gm0.j1.u().f273153f, Bi, Di);
                    z17 = true;
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                fs.g.b(x30.e.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.h2$$a
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        com.tencent.mm.plugin.messenger.foundation.h2 h2Var = com.tencent.mm.plugin.messenger.foundation.h2.this;
                        x30.e eVar = (x30.e) nVar;
                        h2Var.getClass();
                        com.tencent.mars.xlog.Log.i("MessengerStorageService", "add AbstractMessageStorage %s", eVar);
                        try {
                            com.tencent.mm.storage.g9 g9Var = h2Var.f148659g;
                            com.tencent.mm.storage.f Jf = eVar.Jf(h2Var.f148659g);
                            java.util.List list = g9Var.f193980f;
                            if (!((java.util.concurrent.CopyOnWriteArrayList) list).contains(Jf)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorage", "addMessageStorageImpl %s", Jf);
                                ((java.util.concurrent.CopyOnWriteArrayList) list).add(Jf);
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MessengerStorageService", e17, null, new java.lang.Object[0]);
                        }
                        return false;
                    }
                });
            }
        }
        return this.f148659g;
    }

    public xg3.o0 fj() {
        if (gm0.j1.a()) {
            return e21.z0.f246605d;
        }
        return null;
    }

    public xg3.r0 hj() {
        if (this.f148662m == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.ka.class) {
                if (this.f148662m == null) {
                    this.f148662m = new com.tencent.mm.storage.ka(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148662m;
    }

    public xg3.s0 ij() {
        if (this.f148668s == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.qa.class) {
                if (this.f148668s == null) {
                    this.f148668s = new com.tencent.mm.storage.qa(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148668s;
    }

    public xg3.v0 mj() {
        if (this.f148657e == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.ab.class) {
                if (this.f148657e == null) {
                    this.f148657e = new com.tencent.mm.storage.ab(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148657e;
    }

    public xg3.w0 nj() {
        if (this.f148671v == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.z7.class) {
                if (this.f148671v == null) {
                    this.f148671v = new com.tencent.mm.storage.z7(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148671v;
    }

    public xg3.x0 oj() {
        if (this.f148666q == null && gm0.j1.a()) {
            synchronized (com.tencent.mm.storage.jb.class) {
                if (this.f148666q == null) {
                    this.f148666q = new com.tencent.mm.storage.jb(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148666q;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (this.f148656d != null) {
            com.tencent.mm.storage.k4 k4Var = this.f148656d;
            ((lt0.f) k4Var.f195074g).clear();
            ((lt0.f) k4Var.f195075h).clear();
        }
        g95.u uVar = g95.u.f269821a;
        ((kk.l) ((jz5.n) g95.u.f269822b).getValue()).clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "clearRemoveCache");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        gm0.j1.q(vg3.x3.class, this);
    }

    public xg3.w wi() {
        if (this.f148670u == null && gm0.j1.a()) {
            synchronized (xg3.w.class) {
                if (this.f148670u == null) {
                    this.f148670u = new com.tencent.mm.storage.d3(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f148670u;
    }
}
