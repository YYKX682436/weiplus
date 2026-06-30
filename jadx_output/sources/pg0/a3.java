package pg0;

@j95.b(dependencies = {pg0.j2.class})
/* loaded from: classes9.dex */
public class a3 extends i95.w implements qg0.b0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile at4.b1 f353953d = new at4.b1();

    /* renamed from: e, reason: collision with root package name */
    public final pq5.i f353954e = new pq5.i(new pg0.r2(this));

    /* renamed from: f, reason: collision with root package name */
    public final pq5.i f353955f = new pq5.i(new pg0.s2(this));

    /* renamed from: g, reason: collision with root package name */
    public final pq5.i f353956g = new pq5.i(new pg0.t2(this));

    /* renamed from: h, reason: collision with root package name */
    public final pq5.i f353957h = new pq5.i(new pg0.u2(this));

    /* renamed from: i, reason: collision with root package name */
    public final pq5.i f353958i = new pq5.i(new pg0.v2(this));

    /* renamed from: m, reason: collision with root package name */
    public final pq5.i f353959m = new pq5.i(new pg0.w2(this));

    /* renamed from: n, reason: collision with root package name */
    public final pq5.i f353960n = new pq5.i(new pg0.x2(this));

    /* renamed from: o, reason: collision with root package name */
    public final pq5.i f353961o = new pq5.i(new pg0.y2(this));

    /* renamed from: p, reason: collision with root package name */
    public final pq5.i f353962p = new pq5.i(new pg0.z2(this));

    /* renamed from: q, reason: collision with root package name */
    public final pq5.i f353963q = new pq5.i(new pg0.n2(this));

    /* renamed from: r, reason: collision with root package name */
    public final pq5.i f353964r = new pq5.i(new pg0.o2(this));

    /* renamed from: s, reason: collision with root package name */
    public final pq5.i f353965s = new pq5.i(new pg0.p2(this));

    /* renamed from: t, reason: collision with root package name */
    public final zs4.q f353966t = new zs4.q();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f353967u = "";

    public void Ai(android.content.Context context, java.util.HashMap hashMap, qg0.a0 a0Var) {
        j05.f fVar = (j05.f) i95.n0.c(j05.f.class);
        pg0.q2 q2Var = new pg0.q2(this, a0Var);
        ((com.tencent.mm.plugin.wxpay.g) fVar).getClass();
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "extraInfo is null ! Return");
            return;
        }
        java.lang.String str = (java.lang.String) hashMap.get("key_red_packet_preview_url");
        java.lang.String str2 = (java.lang.String) hashMap.get("key_red_packet_preview_material_id");
        int parseInt = !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) hashMap.get("key_red_packet_preview_scene")) ? java.lang.Integer.parseInt((java.lang.String) hashMap.getOrDefault("key_red_packet_preview_scene", "0")) : -1;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, url is %s", str);
            com.tencent.mm.plugin.luckymoney.model.z3.c(context, str, q2Var);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "url and materialId is both null");
            com.tencent.mm.plugin.luckymoney.model.z3.c(context, "", q2Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, materialId is %s", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from pickUI,materialId: %s", str2);
        com.tencent.mm.plugin.luckymoney.model.z3.f145735a = null;
        com.tencent.mm.plugin.luckymoney.model.i iVar = com.tencent.mm.plugin.luckymoney.model.z3.f145736b;
        if (iVar != null) {
            iVar.j();
            com.tencent.mm.plugin.luckymoney.model.z3.f145736b = null;
        }
        com.tencent.mm.plugin.luckymoney.model.z3.f145735a = q2Var;
        com.tencent.mm.plugin.luckymoney.model.i iVar2 = new com.tencent.mm.plugin.luckymoney.model.i(parseInt, "", str2);
        com.tencent.mm.plugin.luckymoney.model.z3.f145736b = iVar2;
        com.tencent.mm.plugin.luckymoney.model.z3.a(context, iVar2);
    }

    public void Bi() {
        gm0.j1.n().f273288b.g(new ms4.c());
    }

    public void Di(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (c01.z1.z()) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 0);
            intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is h5,jump to ibg");
            j45.l.j(context, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", intent, null);
            return;
        }
        if (c01.z1.A()) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 0);
            intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", "walletMall oversea switch is ：%s", java.lang.Boolean.TRUE);
            j45.l.j(context, "mall", ".ui.MallIndexOSUIv2", intent, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", "entryWalletIndexPage wallet type is native");
        intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j45.l.j(context, "mall", ".ui.MallIndexUIv2", intent, null);
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.g0 g0Var = new f21.g0(11);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(g0Var);
        }
    }

    public dt4.c Ni() {
        if (gm0.j1.a()) {
            return (dt4.c) this.f353958i.a();
        }
        throw new c01.c();
    }

    public dt4.d Ri() {
        if (gm0.j1.a()) {
            return (dt4.d) this.f353957h.a();
        }
        throw new c01.c();
    }

    public dt4.a Ui() {
        if (gm0.j1.a()) {
            return (dt4.a) this.f353959m.a();
        }
        throw new c01.c();
    }

    public dt4.w Vi() {
        if (gm0.j1.a()) {
            return (dt4.w) this.f353965s.a();
        }
        throw new c01.c();
    }

    public dt4.x Zi() {
        if (gm0.j1.a()) {
            return (dt4.x) this.f353964r.a();
        }
        throw new c01.c();
    }

    public at4.p1 aj() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        pg0.j2 j2Var = (pg0.j2) i95.n0.c(pg0.j2.class);
        j2Var.requireAccountInitialized();
        return j2Var.f354010d;
    }

    public at4.t1 bj() {
        if (gm0.j1.a()) {
            return (at4.t1) this.f353955f.a();
        }
        throw new c01.c();
    }

    public dt4.z cj() {
        if (gm0.j1.a()) {
            return (dt4.z) this.f353956g.a();
        }
        throw new c01.c();
    }

    public at4.x1 fj() {
        requireAccountInitialized();
        return (at4.x1) this.f353954e.a();
    }

    public dt4.e hj() {
        if (gm0.j1.a()) {
            return (dt4.e) this.f353961o.a();
        }
        throw new c01.c();
    }

    public dt4.g ij() {
        if (gm0.j1.a()) {
            return (dt4.g) this.f353960n.a();
        }
        throw new c01.c();
    }

    public dt4.y mj() {
        if (gm0.j1.a()) {
            return (dt4.y) this.f353963q.a();
        }
        throw new c01.c();
    }

    public boolean nj() {
        boolean w17 = c01.z1.w();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", "isSupportMobileRemit() isCN:%s mobileRemitSwitch:%s", java.lang.Boolean.valueOf(w17), 1);
        return w17;
    }

    public void oj(java.lang.String str) {
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        hb3.o.Ni().cj(str, false);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCoreService", "onAccountPostReset subcore walletCore");
        fj().z();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        fj().B();
        at4.t1 bj6 = bj();
        bj6.f13974b = null;
        bj6.f13973a.clear();
        bj6.f13973a = new java.util.ArrayList();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
    }

    public android.text.style.TextAppearanceSpan wi(android.content.Context context, java.lang.String str, int i17, int i18, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan(str, i17, i18, colorStateList, colorStateList2);
        wcPayTextApppearanceSpan.f180847d = com.tencent.mm.wallet_core.ui.r1.F(context, 4);
        return wcPayTextApppearanceSpan;
    }
}
