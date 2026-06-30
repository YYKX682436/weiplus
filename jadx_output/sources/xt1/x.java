package xt1;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456600d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456601e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456602f;

    /* renamed from: g, reason: collision with root package name */
    public int f456603g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456604h;

    public x(java.util.LinkedList linkedList, int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u0();
        lVar.f70665b = new r45.v0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
        lVar.f70667d = 1049;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456600d = a17;
        r45.u0 u0Var = (r45.u0) a17.f70710a.f70684a;
        u0Var.f386900d = linkedList;
        u0Var.f386901e = i17;
        u0Var.f386903g = str;
        u0Var.f386902f = str2;
        u0Var.f386904h = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456601e = u0Var;
        return dispatch(sVar, this.f456600d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1049;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.v0 v0Var2 = (r45.v0) this.f456600d.f70711b.f70700a;
            this.f456602f = v0Var2.f387779d;
            this.f456603g = v0Var2.f387780e;
            this.f456604h = v0Var2.f387781f;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.f456603g + " ret_msg = " + this.f456604h);
        }
        this.f456601e.onSceneEnd(i18, i19, str, this);
    }
}
