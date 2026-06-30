package p32;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f351513d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f351514e;

    /* renamed from: f, reason: collision with root package name */
    public final int f351515f;

    /* renamed from: g, reason: collision with root package name */
    public int f351516g;

    public q(int i17, int i18) {
        this.f351514e = null;
        this.f351515f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ns6();
        lVar.f70665b = new r45.os6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
        lVar.f70667d = 1044;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f351514e = a17;
        r45.ns6 ns6Var = (r45.ns6) a17.f70710a.f70684a;
        ns6Var.f381653d = i17;
        ns6Var.f381654e = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f351513d = u0Var;
        return dispatch(sVar, this.f351514e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1044;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f351516g = ((r45.os6) this.f351514e.f70711b.f70700a).f382501d;
        }
        this.f351513d.onSceneEnd(i18, i19, str, this);
    }
}
