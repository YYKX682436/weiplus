package f34;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f259319d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f259320e;

    /* renamed from: f, reason: collision with root package name */
    public f34.d f259321f;

    public b(float f17, float f18, int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n36();
        lVar.f70665b = new r45.o36();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/shakecard";
        lVar.f70667d = 1250;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f259320e = a17;
        r45.n36 n36Var = (r45.n36) a17.f70710a.f70684a;
        n36Var.f381063e = f18;
        n36Var.f381062d = f17;
        n36Var.f381064f = i17;
        n36Var.f381065g = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f259319d = u0Var;
        return dispatch(sVar, this.f259320e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1250;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250 errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.o36 o36Var = (r45.o36) this.f259320e.f70711b.f70700a;
            if (o36Var != null) {
                f34.d dVar = new f34.d();
                this.f259321f = dVar;
                dVar.f259328a = o36Var.f381867d;
                dVar.f259329b = o36Var.f381868e;
                dVar.f259330c = o36Var.f381869f;
                dVar.f259331d = o36Var.f381870g;
                dVar.f259332e = o36Var.f381873m;
                dVar.f259333f = o36Var.f381874n;
                dVar.f259334g = o36Var.f381875o;
                dVar.f259335h = o36Var.f381876p;
                dVar.f259336i = o36Var.f381877q;
                dVar.f259337j = o36Var.f381878r;
                dVar.f259338k = o36Var.f381879s;
                dVar.f259339l = o36Var.f381880t;
                dVar.f259340m = o36Var.f381881u;
                dVar.f259341n = o36Var.f381882v;
                dVar.f259342o = o36Var.f381883w;
                dVar.f259343p = o36Var.f381884x;
                c34.h0.Bi().f259327f = this.f259321f.f259340m;
            } else {
                f34.d dVar2 = new f34.d();
                this.f259321f = dVar2;
                dVar2.f259328a = 3;
                dVar2.f259340m = c34.h0.Bi().f259327f;
            }
        } else {
            f34.d dVar3 = new f34.d();
            this.f259321f = dVar3;
            dVar3.f259328a = 3;
            dVar3.f259340m = c34.h0.Bi().f259327f;
        }
        this.f259319d.onSceneEnd(i18, i19, str, this);
    }
}
