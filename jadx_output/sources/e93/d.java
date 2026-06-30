package e93;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250359d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250360e;

    public d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ld3();
        lVar.f70665b = new r45.md3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcontactlabellist";
        lVar.f70667d = 639;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250359d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250360e = u0Var;
        return dispatch(sVar, this.f250359d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 639;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0265, code lost:
    
        if (r3 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015d, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017a, code lost:
    
        r0 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0177, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0175, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0271  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r21, int r22, int r23, java.lang.String r24, com.tencent.mm.network.v0 r25, byte[] r26) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e93.d.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
