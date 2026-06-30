package com.tencent.mm.plugin.ipcall.model;

@j95.b
/* loaded from: classes14.dex */
public class r extends i95.w {

    /* renamed from: g, reason: collision with root package name */
    public l83.d f142506g;

    /* renamed from: m, reason: collision with root package name */
    public s83.d f142509m;

    /* renamed from: n, reason: collision with root package name */
    public s83.m f142510n;

    /* renamed from: o, reason: collision with root package name */
    public s83.k f142511o;

    /* renamed from: p, reason: collision with root package name */
    public s83.h f142512p;

    /* renamed from: q, reason: collision with root package name */
    public wq4.k0 f142513q;

    /* renamed from: r, reason: collision with root package name */
    public wq4.c f142514r;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.model.p f142503d = new com.tencent.mm.plugin.ipcall.model.p();

    /* renamed from: e, reason: collision with root package name */
    public m83.c f142504e = null;

    /* renamed from: f, reason: collision with root package name */
    public final m83.d f142505f = new m83.d();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.model.m f142507h = new com.tencent.mm.plugin.ipcall.model.m();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.j f142508i = new com.tencent.mm.plugin.ipcall.j();

    public static j83.b Ai() {
        l83.d dVar = Bi().f142506g;
        if (dVar != null) {
            return dVar.f317096b;
        }
        return null;
    }

    public static com.tencent.mm.plugin.ipcall.model.r Bi() {
        return (com.tencent.mm.plugin.ipcall.model.r) i95.n0.c(com.tencent.mm.plugin.ipcall.model.r.class);
    }

    public static l83.d Di() {
        return Bi().f142506g;
    }

    public static m83.c Ni() {
        if (Bi().f142504e == null) {
            synchronized (Bi()) {
                if (Bi().f142504e == null) {
                    Bi().f142504e = new m83.c();
                }
            }
        }
        return Bi().f142504e;
    }

    public static s83.h Ri() {
        gm0.j1.b().c();
        if (Bi().f142512p == null) {
            Bi().f142512p = new s83.h(c01.d9.b().s());
        }
        return Bi().f142512p;
    }

    public static s83.k Ui() {
        gm0.j1.b().c();
        if (Bi().f142511o == null) {
            Bi().f142511o = new s83.k(c01.d9.b().s());
        }
        return Bi().f142511o;
    }

    public static s83.m Vi() {
        gm0.j1.b().c();
        if (Bi().f142510n == null) {
            Bi().f142510n = new s83.m(c01.d9.b().s());
        }
        return Bi().f142510n;
    }

    public static m83.d Zi() {
        return Bi().f142505f;
    }

    public static wq4.k0 aj() {
        if (Bi().f142513q == null) {
            Bi().f142513q = new wq4.k0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        return Bi().f142513q;
    }

    public static com.tencent.mm.plugin.ipcall.model.m bj() {
        return Bi().f142507h;
    }

    public static com.tencent.mm.plugin.ipcall.model.p cj() {
        return Bi().f142503d;
    }

    public static s83.d wi() {
        gm0.j1.b().c();
        if (Bi().f142509m == null) {
            Bi().f142509m = new s83.d(c01.d9.b().s());
        }
        return Bi().f142509m;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.plugin.ipcall.model.p pVar = this.f142503d;
        r83.d dVar = pVar.f142490m;
        dVar.f();
        r83.i iVar = pVar.f142491n;
        iVar.f();
        r83.a aVar = pVar.f142492o;
        aVar.f();
        r83.h hVar = pVar.f142493p;
        hVar.f();
        r83.c cVar = pVar.f142494q;
        cVar.f();
        r83.e eVar = pVar.f142495r;
        eVar.f();
        pVar.f142496s.f();
        r83.f fVar = pVar.f142497t;
        fVar.f();
        dVar.f304890d = pVar;
        aVar.f304890d = pVar;
        hVar.f304890d = pVar;
        eVar.f304890d = pVar;
        fVar.f304890d = pVar;
        iVar.f304896h = pVar;
        cVar.f304896h = pVar;
        com.tencent.mm.network.s0 s0Var = pVar.f142502y;
        gm0.j1.i();
        gm0.j1.n().a(s0Var);
        com.tencent.mm.plugin.ipcall.model.i.f142469a.alive();
        com.tencent.mm.plugin.ipcall.model.k.a().f142477f.alive();
        if (com.tencent.mm.plugin.ipcall.model.l.f142478c == null) {
            com.tencent.mm.plugin.ipcall.model.l.f142478c = new com.tencent.mm.plugin.ipcall.model.l();
        }
        com.tencent.mm.plugin.ipcall.model.l.f142478c.f142480b.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (this.f142507h.d()) {
            this.f142508i.j(0, 0);
        }
        com.tencent.mm.plugin.ipcall.model.p pVar = this.f142503d;
        pVar.f142490m.c();
        pVar.f142491n.c();
        pVar.f142492o.c();
        pVar.f142493p.c();
        pVar.f142494q.c();
        pVar.f142496s.c();
        com.tencent.mm.network.s0 s0Var = pVar.f142502y;
        gm0.j1.i();
        gm0.j1.n().d(s0Var);
        com.tencent.mm.plugin.ipcall.model.i.f142469a.dead();
        com.tencent.mm.plugin.ipcall.model.k a17 = com.tencent.mm.plugin.ipcall.model.k.a();
        a17.getClass();
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, a17);
        c01.d9.e().q(160, a17);
        a17.f142477f.dead();
        if (com.tencent.mm.plugin.ipcall.model.l.f142478c == null) {
            com.tencent.mm.plugin.ipcall.model.l.f142478c = new com.tencent.mm.plugin.ipcall.model.l();
        }
        com.tencent.mm.plugin.ipcall.model.l.f142478c.f142480b.dead();
    }
}
