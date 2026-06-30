package k14;

/* loaded from: classes8.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303312d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cq3 f303313e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f303314f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f303315g;

    public c0(byte[] bArr) {
        this.f303314f = bArr;
    }

    public byte[] H() {
        r45.cq3 cq3Var = this.f303313e;
        if (cq3Var == null || cq3Var.f371790g != 1) {
            return null;
        }
        return cq3Var.f371789f.g();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303312d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.bq3 bq3Var = new r45.bq3();
        byte[] bArr = this.f303314f;
        if (bArr != null) {
            bq3Var.f370987d = x51.j1.a(bArr).f371841f;
        }
        bq3Var.f370988e = this.f303315g;
        lVar.f70664a = bq3Var;
        r45.cq3 cq3Var = new r45.cq3();
        this.f303313e = cq3Var;
        lVar.f70665b = cq3Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/getuserauthlist";
        lVar.f70667d = 1146;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1146;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.cq3 cq3Var = (r45.cq3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f303313e = cq3Var;
        r45.qv6 qv6Var = cq3Var.f371787d;
        if (qv6Var != null) {
            i19 = qv6Var.f384304d;
            str = qv6Var.f384305e;
        }
        this.f303312d.onSceneEnd(i18, i19, str, this);
    }

    public c0(byte[] bArr, boolean z17) {
        this(bArr);
        this.f303315g = z17;
    }
}
