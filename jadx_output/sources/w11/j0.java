package w11;

/* loaded from: classes2.dex */
public class j0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442059d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f442060e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f442061f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f442062g = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f442063h;

    public j0(int i17) {
        this.f442063h = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ih3();
        lVar.f70665b = new r45.jh3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
        lVar.f70667d = 1803;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f442060e = a17;
        ((r45.ih3) a17.f70710a.f70684a).f377044d = i17;
        this.f442063h = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f442059d = u0Var;
        return dispatch(sVar, this.f442060e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1803;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f442059d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.jh3 jh3Var = (r45.jh3) this.f442060e.f70711b.f70700a;
        this.f442061f = jh3Var.f377810d;
        this.f442062g = jh3Var.f377811e;
        this.f442059d.onSceneEnd(i18, i19, str, this);
    }
}
