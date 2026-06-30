package hb3;

@j95.b
/* loaded from: classes9.dex */
public class o extends i95.w implements com.tencent.mm.app.t2 {

    /* renamed from: r, reason: collision with root package name */
    public static int f280130r = -1;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.d1 f280131d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.i5 f280132e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.i4 f280133f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.h4 f280134g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.m4 f280135h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f280136i;

    /* renamed from: m, reason: collision with root package name */
    public final pq5.i f280137m;

    /* renamed from: n, reason: collision with root package name */
    public final pq5.i f280138n;

    /* renamed from: o, reason: collision with root package name */
    public final pq5.i f280139o;

    /* renamed from: p, reason: collision with root package name */
    public final pq5.i f280140p;

    /* renamed from: q, reason: collision with root package name */
    public final l75.q0 f280141q;

    public o() {
        this.f280136i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvMultiRedHint()) == 1;
        this.f280137m = new pq5.i(new hb3.e(this));
        this.f280138n = new pq5.i(new hb3.f(this));
        this.f280139o = new pq5.i(new hb3.g(this));
        this.f280140p = new pq5.i(new hb3.h(this));
        this.f280141q = new hb3.j(this);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(Zi());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
        if (m18.a()) {
            m18.f213266a.r(m18.f213267b);
        }
    }

    public static hb3.o Ni() {
        return (hb3.o) i95.n0.c(hb3.o.class);
    }

    public com.tencent.mm.plugin.luckymoney.model.h4 Ai() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrHK()");
        gm0.j1.b().c();
        if (Ni().f280134g == null) {
            Ni().f280134g = new com.tencent.mm.plugin.luckymoney.model.h4();
        }
        return Ni().f280134g;
    }

    public com.tencent.mm.plugin.luckymoney.model.i4 Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrLive()");
        gm0.j1.b().c();
        if (Ni().f280133f == null) {
            Ni().f280133f = new com.tencent.mm.plugin.luckymoney.model.i4();
        }
        return Ni().f280133f;
    }

    public com.tencent.mm.plugin.luckymoney.model.i5 Di() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgrUnion()");
        gm0.j1.b().c();
        if (Ni().f280132e == null) {
            Ni().f280132e = new com.tencent.mm.plugin.luckymoney.model.i5();
        }
        return Ni().f280132e;
    }

    public dc3.f Ri() {
        return (dc3.f) this.f280140p.a();
    }

    public synchronized com.tencent.mm.plugin.luckymoney.model.m4 Ui() {
        if (this.f280135h == null) {
            this.f280135h = new com.tencent.mm.plugin.luckymoney.model.m4();
        }
        return this.f280135h;
    }

    public dc3.b Vi() {
        return (dc3.b) this.f280138n.a();
    }

    public java.lang.String Zi() {
        if (!gm0.j1.a()) {
            return "";
        }
        return g83.a.a() + "luckymoney";
    }

    public dc3.d aj() {
        return (dc3.d) this.f280139o.a();
    }

    public void bj(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new hb3.l(this, str), "update_hb_red_flag");
    }

    public void cj(java.lang.String str, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).h(new hb3.k(this, str, z17), "update_hb_red_flag_2");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        java.lang.String str = com.tencent.mm.plugin.luckymoney.model.d4.f145227d;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(991, 18);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(58);
        g0Var.A(991, 24);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(104);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(182);
        arrayList.add(193);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).getClass();
        gm0.j1.n().f273288b.g(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0(arrayList));
        com.tencent.mm.app.w.INSTANCE.a(this);
        try {
            jz5.g gVar = rb3.g.f393858a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreLuckyMoney", "[onAccountInitialized] pay db inital failed ： %s ", e17.getMessage());
        }
        gm0.j1.i();
        boolean z17 = java.lang.System.currentTimeMillis() - gm0.j1.u().c().s(352276, 0L) >= 43200000;
        boolean z18 = gm0.j1.b().f273244g.f273257a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "isTime=" + z17 + ", isUpdate=" + z18);
        if (z18 || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "get service applist");
            lt.s0 s0Var = (lt.s0) i95.n0.c(lt.s0.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((kt.u0) s0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.x5.c().e(context2);
        }
        com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.luckymoney.model.t0.f145632a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D() + "wallet/luckyMoneyEffect/");
        if (r6Var.y() && r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "delete unused files: %s", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(r6Var.u(), true)));
        }
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().add(this.f280141q);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.x5 c17 = com.tencent.mm.pluginsdk.model.app.x5.c();
        c17.getClass();
        if (gm0.j1.a()) {
            c17.f189143a = false;
            c17.f189144b = false;
        }
        com.tencent.mm.app.w.INSTANCE.p(this);
        synchronized (this) {
            this.f280135h = null;
        }
        com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.luckymoney.model.t0.f145632a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "unInit");
        com.tencent.mm.plugin.luckymoney.model.t0.f145632a.dead();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().remove(this.f280141q);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new hb3.m(this), "check_hb_red_flag_background");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }

    public com.tencent.mm.plugin.luckymoney.model.d1 wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "getConfigMgr()");
        gm0.j1.b().c();
        if (Ni().f280131d == null) {
            Ni().f280131d = new com.tencent.mm.plugin.luckymoney.model.d1();
        }
        return Ni().f280131d;
    }
}
