package xt1;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456511d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456512e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456513f = false;

    /* renamed from: g, reason: collision with root package name */
    public r45.yu f456514g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ay5 f456515h;

    /* renamed from: i, reason: collision with root package name */
    public int f456516i;

    public k0(double d17, double d18, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nc3();
        lVar.f70665b = new r45.oc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcardslayout";
        lVar.f70667d = 1054;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456511d = a17;
        r45.nc3 nc3Var = (r45.nc3) a17.f70710a.f70684a;
        nc3Var.f381241d = d17;
        nc3Var.f381242e = d18;
        nc3Var.f381243f = i17;
        nc3Var.f381244g = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456512e = u0Var;
        return dispatch(sVar, this.f456511d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1054;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0181  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r20, int r21, int r22, java.lang.String r23, com.tencent.mm.network.v0 r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt1.k0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
