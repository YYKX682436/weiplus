package ef3;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252418d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252419e;

    /* renamed from: f, reason: collision with root package name */
    public r45.t67 f252420f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k65 f252421g;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.j65();
        lVar.f70665b = new r45.k65();
        ss4.p0 p0Var = ss4.p0.f412124a;
        ss4.n0 n0Var = ss4.n0.f412109h;
        int a17 = p0Var.a(n0Var, fe1.i.CTRL_INDEX);
        lVar.f70666c = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/payibggetoverseawallet");
        lVar.f70667d = a17;
        com.tencent.mm.modelbase.o a18 = lVar.a();
        this.f252419e = a18;
        r45.j65 j65Var = (r45.j65) a18.f70710a.f70684a;
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.FALSE);
        j65Var.f377608d = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : 0;
        j65Var.f377609e = com.tencent.mm.sdk.platformtools.m2.d();
        j65Var.f377611g = android.os.Build.VERSION.RELEASE;
        j65Var.f377610f = com.tencent.mm.sdk.platformtools.a0.a(null, o45.wf.f343029g);
        j65Var.f377612h = android.os.Build.MANUFACTURER;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", java.lang.Integer.valueOf(j65Var.f377608d), j65Var.f377609e, j65Var.f377611g, j65Var.f377610f, j65Var.f377612h);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252418d = u0Var;
        return dispatch(sVar, this.f252419e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return fe1.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        r45.k65 k65Var;
        r45.x67 x67Var;
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            r45.k65 k65Var2 = (r45.k65) fVar;
            this.f252421g = (r45.k65) fVar;
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            if (qVar != null && (k65Var = this.f252421g) != null && (x67Var = k65Var.f378450s) != null && (linkedList = x67Var.f389835d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.y67 y67Var = (r45.y67) it.next();
                    qVar.setOverseaUrlTokens(y67Var.f390829d, y67Var.f390830e);
                }
            }
            if (k65Var2.f378442h == null || k65Var2.f378443i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + k65Var2.f378444m);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd wallet_region : %s wallet_gray_area: %s wallet_threepoint_area size: %s", java.lang.Integer.valueOf(k65Var2.f378444m), java.lang.Integer.valueOf(k65Var2.f378442h.f382809d.size()), java.lang.Integer.valueOf(k65Var2.f378443i.f391755d.size()));
                r45.t67 t67Var = k65Var2.f378448q;
                if (t67Var != null) {
                    this.f252420f = t67Var;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "wallet_key_info flag %s wallet_key_info.url %s", java.lang.Integer.valueOf(t67Var.f386172d), k65Var2.f378448q.f386173e);
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(k65Var2.f378444m));
            c01.je.m(k65Var2.f378444m);
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.d.f();
            ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().z0(k65Var2.f378444m, k65Var2);
        }
        this.f252418d.onSceneEnd(i18, i19, str, this);
    }
}
