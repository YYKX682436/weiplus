package v61;

/* loaded from: classes4.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433447d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433448e;

    public i0(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rh();
        lVar.f70665b = new r45.sh();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindemail";
        lVar.f70667d = 256;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f433448e = a17;
        r45.rh rhVar = (r45.rh) a17.f70710a.f70684a;
        rhVar.f384861d = i17;
        rhVar.f384862e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433447d = u0Var;
        return dispatch(sVar, this.f433448e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 256;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f433447d.onSceneEnd(i18, i19, str, this);
    }
}
