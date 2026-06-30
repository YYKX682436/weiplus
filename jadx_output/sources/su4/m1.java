package su4;

/* loaded from: classes.dex */
public class m1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413006d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413007e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.rn3 f413008f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sn3 f413009g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413010h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f413011i = null;

    public m1(r45.rn3 rn3Var, int i17) {
        this.f413010h = -1;
        this.f413008f = rn3Var;
        this.f413010h = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4614;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchshare";
        lVar.f70664a = rn3Var;
        lVar.f70665b = new r45.sn3();
        this.f413007e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413006d = u0Var;
        return dispatch(sVar, this.f413007e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4614;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneGetSearchShare", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f413009g = (r45.sn3) this.f413007e.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f413006d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
