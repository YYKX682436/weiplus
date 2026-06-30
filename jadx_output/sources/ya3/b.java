package ya3;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f460591d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f460592e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460593f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460594g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f460595h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f460596i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460597m;

    public b(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.v24();
        lVar.f70665b = new r45.w24();
        lVar.f70666c = "/cgi-bin/micromsg-bin/jointrackroom";
        lVar.f70667d = 490;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f460592e = a17;
        ((r45.v24) a17.f70710a.f70684a).f387825d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f460591d = u0Var;
        return dispatch(sVar, this.f460592e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 490;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        r45.w24 w24Var = fVar != null ? (r45.w24) fVar : null;
        if ((i19 == 0 || i19 >= 1000) && w24Var != null) {
            java.lang.String str2 = w24Var.f388801d;
            if (str2 == null) {
                str2 = "";
            }
            this.f460593f = str2;
            java.lang.String str3 = w24Var.f388803f;
            this.f460594g = str3 != null ? str3 : "";
            this.f460595h = w24Var.f388804g;
            this.f460596i = w24Var.f388806i > 0;
        }
        if (w24Var != null) {
            this.f460597m = w24Var.f388802e;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f460591d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
