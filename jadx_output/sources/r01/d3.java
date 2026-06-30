package r01;

/* loaded from: classes9.dex */
public class d3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368045d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368046e;

    /* renamed from: f, reason: collision with root package name */
    public final r01.c3 f368047f;

    public d3(java.lang.String str, java.lang.String str2, r01.c3 c3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] NetSceneBizAttrSync (%s)", str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1075;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizattr/bizattrsync";
        lVar.f70664a = new r45.hj();
        lVar.f70665b = new r45.ij();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368046e = a17;
        r45.hj hjVar = (r45.hj) a17.f70710a.f70684a;
        hjVar.f376208d = str;
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(str2 == null ? "" : str2);
        hjVar.f376209e = new com.tencent.mm.protobuf.g(h17, 0, h17.length);
        this.f368047f = c3Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368045d = u0Var;
        return dispatch(sVar, this.f368046e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1075;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0601  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r22, int r23, int r24, java.lang.String r25, com.tencent.mm.network.v0 r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.d3.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
