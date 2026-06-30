package com.tencent.mm.plugin.wxpay;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements j05.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f188569d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f188570e = false;

    /* renamed from: f, reason: collision with root package name */
    public final pq5.i f188571f = new pq5.i(new com.tencent.mm.plugin.wxpay.e(this));

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f188572g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f188573h;

    public g() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f188572g = new com.tencent.mm.plugin.wxpay.PluginWxPay$2(this, a0Var);
        this.f188573h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.wxpay.PluginWxPay$3
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_byp_sync_paymsg, true);
                com.tencent.mm.plugin.wxpay.g gVar = com.tencent.mm.plugin.wxpay.g.this;
                if (fj6 == gVar.f188569d) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "update enableBypSync to %s", java.lang.Boolean.valueOf(fj6));
                gVar.f188569d = fj6;
                ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).Ai(gVar.f188569d);
                return false;
            }
        };
    }

    public void Ai() {
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        if (oVar.of() == 0) {
            oVar.prepare();
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "onAccountInitialized call alive");
        this.f188569d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_byp_sync_paymsg, true);
        ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).Ai(this.f188569d);
        try {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            if (M == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginWxPay", "set payMMKV, but payMMKV is null");
            } else {
                M.x(0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginWxPay", e17, "", new java.lang.Object[0]);
        }
        this.f188573h.alive();
        this.f188572g.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "onAccountReleased call dead");
        ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
        this.f188573h.dead();
        this.f188572g.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        mz2.l0 l0Var = new mz2.l0();
        nz2.h hVar = new nz2.h();
        l0Var.c(hVar);
        gm0.j1.q(pz2.a.class, l0Var);
        gm0.j1.q(nz2.o.class, hVar);
        gm0.j1.q(js4.i.class, new ms4.z());
        com.tencent.mm.wallet_core.a.h("WXCreditOpenProcess", c05.q.class);
        com.tencent.mm.wallet_core.a.h("WXCreditManagerProcess", c05.h.class);
        com.tencent.mm.wallet_core.a.h("FingerprintAuth", qz2.b.class);
    }

    public com.tencent.mm.wallet_core.model.m1 wi() {
        if (gm0.j1.a()) {
            return (com.tencent.mm.wallet_core.model.m1) this.f188571f.a();
        }
        throw new c01.c();
    }
}
