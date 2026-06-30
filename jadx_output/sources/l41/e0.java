package l41;

/* loaded from: classes10.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ab0.v {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315800d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315801e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315802f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cx5 f315803g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315804h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ex5 f315805i;

    public e0(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dx5();
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315801e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", this.f315802f);
        r45.dx5 dx5Var = (r45.dx5) a17.f70710a.f70684a;
        dx5Var.f372831d = "";
        dx5Var.f372832e = str;
        dx5Var.f372833f = i17;
    }

    public final void H(r45.dx5 dx5Var, r45.bx5 bx5Var) {
        r45.nu3 nu3Var;
        r45.u2 u2Var;
        r45.vm4 vm4Var;
        java.lang.String str;
        dx5Var.f372839o = new r45.fw5();
        if (bx5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact subScene: %s", java.lang.Integer.valueOf(bx5Var.f371133e));
            dx5Var.f372839o.f374654e = bx5Var.f371133e;
        }
        if (bx5Var != null && (str = bx5Var.f371134f) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact search_context: %s", str);
            dx5Var.f372839o.f374655f = bx5Var.f371134f;
        }
        if (bx5Var != null && (vm4Var = bx5Var.f371135g) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact miniprogramContext: %s, %s", vm4Var.f388360d, java.lang.Integer.valueOf(vm4Var.f388361e));
            dx5Var.f372839o.f374656g = bx5Var.f371135g;
        }
        if (bx5Var != null && (u2Var = bx5Var.f371136h) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact adContext: %s, %s", java.lang.Integer.valueOf(u2Var.f386952d), java.lang.Long.valueOf(bx5Var.f371136h.f386953e));
            dx5Var.f372839o.f374657h = bx5Var.f371136h;
        }
        if (bx5Var == null || (nu3Var = bx5Var.f371137i) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact h5Context: %s", nu3Var.f381685d);
        dx5Var.f372839o.f374658i = bx5Var.f371137i;
    }

    public r45.cx5 I() {
        return this.f315803g;
    }

    public java.lang.String J() {
        return this.f315804h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315800d = u0Var;
        return dispatch(sVar, this.f315801e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.network.v0 getReqResp() {
        return this.f315801e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return vb1.e.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.protobuf.f fVar = this.f315801e.f70711b.f70700a;
        if (fVar instanceof r45.ex5) {
            this.f315805i = (r45.ex5) fVar;
        }
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == -2034) {
                this.f315804h = ((r45.ex5) fVar).f373788e;
            }
            this.f315800d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.cx5 cx5Var = ((r45.ex5) fVar).f373787d;
        this.f315803g = cx5Var;
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70529a = cx5Var.f371900d;
        r0Var.f70533e = cx5Var.f371905i;
        r0Var.f70532d = cx5Var.f371906m;
        r0Var.f70537i = -1;
        r0Var.f70530b = 3;
        r0Var.f70534f = 1;
        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        this.f315800d.onSceneEnd(i18, i19, str, this);
    }

    public e0(java.lang.String str, boolean z17, int i17, int i18, r45.bx5 bx5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dx5();
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315801e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s], scene: %d, getA8KeyScene: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        r45.dx5 dx5Var = (r45.dx5) a17.f70710a.f70684a;
        if (z17) {
            dx5Var.f372834g = str;
            dx5Var.f372837m = i17;
        } else {
            this.f315802f = str;
            dx5Var.f372831d = str;
            dx5Var.f372837m = i17;
        }
        H(dx5Var, bx5Var);
        dx5Var.f372839o.f374653d = i18;
    }

    public e0(java.lang.String str, boolean z17, r45.g05 g05Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dx5();
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315801e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s] finderUserName=%s ,scene=%s", str, g05Var.f374785e, java.lang.Integer.valueOf(g05Var.f374784d));
        r45.dx5 dx5Var = (r45.dx5) a17.f70710a.f70684a;
        dx5Var.f372835h = g05Var;
        if (z17) {
            dx5Var.f372834g = str;
        } else {
            this.f315802f = str;
            dx5Var.f372831d = str;
        }
        com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", "[openWeComCgi] finderContext: %s", g05Var.f374787g);
    }

    public e0(java.lang.String str, int i17, byte[] bArr, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dx5();
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315801e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "new with: url = [" + str + "], scene = [" + i17 + "], spamContext = [" + bArr + "], bizInfo = [" + str2 + "]");
        r45.dx5 dx5Var = (r45.dx5) a17.f70710a.f70684a;
        dx5Var.f372836i = str;
        dx5Var.f372837m = i17;
        r45.fw5 fw5Var = new r45.fw5();
        dx5Var.f372839o = fw5Var;
        fw5Var.f374655f = str2 == null ? "" : str2;
        if (bArr != null) {
            dx5Var.f372838n = com.tencent.mm.protobuf.g.b(bArr);
        }
    }

    public e0(java.lang.String str, int i17, r45.bx5 bx5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dx5();
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315801e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search url [%s], scene: %d", this.f315802f, java.lang.Integer.valueOf(i17));
        r45.dx5 dx5Var = (r45.dx5) a17.f70710a.f70684a;
        dx5Var.f372836i = str;
        dx5Var.f372837m = i17;
        H(dx5Var, bx5Var);
    }

    public e0(r45.dx5 dx5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = dx5Var;
        lVar.f70665b = new r45.ex5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f70667d = vb1.e.CTRL_INDEX;
        this.f315801e = lVar.a();
        com.tencent.mars.xlog.Log.i("kenneth_PromoteReport", "[openWeComCgi] finderContext: %s", dx5Var.f372835h.f374787g);
    }
}
