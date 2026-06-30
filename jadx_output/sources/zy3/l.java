package zy3;

/* loaded from: classes4.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f477662d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f477663e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f477664f;

    public l(int i17, int i18, java.lang.String str, byte[] bArr, int i19) {
        this.f477663e = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2693;
        r45.ol olVar = new r45.ol();
        olVar.f382333d = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        olVar.f382336g = str;
        olVar.f382335f = i17;
        olVar.f382334e = i18;
        olVar.f382337h = i19;
        lVar.f70664a = olVar;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ocrgetbankcardinfo";
        lVar.f70665b = new r45.pl();
        lVar.f70678o = 2;
        this.f477662d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f477664f = u0Var;
        return dispatch(sVar, this.f477662d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2693;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f477664f.onSceneEnd(i18, i19, str, this);
    }
}
