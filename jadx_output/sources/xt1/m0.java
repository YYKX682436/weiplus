package xt1;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456523d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456525f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456526g;

    /* renamed from: h, reason: collision with root package name */
    public int f456527h;

    public m0(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.it3();
        lVar.f70665b = new r45.jt3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/giftcarditem";
        lVar.f70667d = 1045;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456523d = a17;
        r45.it3 it3Var = (r45.it3) a17.f70710a.f70684a;
        it3Var.f377316d = str;
        it3Var.f377317e = str2;
        it3Var.f377318f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456524e = u0Var;
        return dispatch(sVar, this.f456523d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1045;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        com.tencent.mm.modelbase.o oVar = this.f456523d;
        if (i18 == 0 && i19 == 0) {
            r45.jt3 jt3Var = (r45.jt3) oVar.f70711b.f70700a;
            if (jt3Var != null) {
                this.f456525f = jt3Var.f378096d;
                this.f456526g = jt3Var.f378098f;
                this.f456527h = jt3Var.f378097e;
            }
        } else {
            r45.jt3 jt3Var2 = (r45.jt3) oVar.f70711b.f70700a;
            if (jt3Var2 != null) {
                this.f456525f = jt3Var2.f378096d;
                this.f456526g = jt3Var2.f378098f;
                this.f456527h = jt3Var2.f378097e;
            }
        }
        this.f456524e.onSceneEnd(i18, i19, str, this);
    }
}
