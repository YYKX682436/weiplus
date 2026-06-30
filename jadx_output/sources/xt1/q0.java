package xt1;

/* loaded from: classes9.dex */
public class q0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456552d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456554f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f456555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f456556h;

    public q0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ea3();
        lVar.f70665b = new r45.fa3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getavailablecard";
        lVar.f70667d = ib1.n.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456552d = a17;
        r45.ea3 ea3Var = (r45.ea3) a17.f70710a.f70684a;
        ea3Var.f373185d = str;
        ea3Var.f373186e = i17;
        ea3Var.f373187f = str2;
        ea3Var.f373188g = str3;
        ea3Var.f373189h = i18;
        ea3Var.f373190i = str4;
        ea3Var.f373191m = str5;
        ea3Var.f373192n = str6;
        ea3Var.f373193o = gVar;
        if ("INVOICE".equalsIgnoreCase(str6)) {
            ea3Var.f373194p = 1;
        } else {
            ea3Var.f373194p = 0;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456553e = u0Var;
        return dispatch(sVar, this.f456552d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ib1.n.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.fa3 fa3Var = (r45.fa3) this.f456552d.f70711b.f70700a;
            this.f456554f = fa3Var.f374140d;
            this.f456555g = fa3Var.f374142f;
            this.f456556h = fa3Var.f374141e != 0;
        }
        this.f456553e.onSceneEnd(i18, i19, str, this);
    }
}
