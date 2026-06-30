package dn3;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f242020d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f242021e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242022f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.d64 d64Var, int i17, java.util.LinkedList linkedList, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.da0();
        lVar.f70665b = new r45.ea0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/createpoi";
        lVar.f70667d = me1.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f242020d = a17;
        str4 = str4 == null ? "" : str4;
        str5 = str5 == null ? "" : str5;
        r45.da0 da0Var = (r45.da0) a17.f70710a.f70684a;
        da0Var.f372261d = str;
        da0Var.f372262e = str2;
        da0Var.f372264g = d64Var;
        da0Var.f372265h = i17;
        if (linkedList != null) {
            da0Var.f372266i = linkedList;
        }
        da0Var.f372267m = str4;
        da0Var.f372268n = str5;
        da0Var.f372263f = str3;
        float f17 = d64Var.f372175e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f242021e = u0Var;
        return dispatch(sVar, this.f242020d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return me1.c.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.n nVar = this.f242020d.f70711b;
        r45.ea0 ea0Var = (r45.ea0) nVar.f70700a;
        if (nVar.getRetCode() != 0) {
            this.f242021e.onSceneEnd(i18, i19, str, this);
        } else {
            this.f242022f = ea0Var.f373184d;
            this.f242021e.onSceneEnd(i18, i19, str, this);
        }
    }
}
