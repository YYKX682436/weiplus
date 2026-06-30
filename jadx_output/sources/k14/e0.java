package k14;

/* loaded from: classes8.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303323d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303324e;

    /* renamed from: f, reason: collision with root package name */
    public r45.px5 f303325f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f303326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f303327h;

    public e0(java.lang.String str, byte[] bArr, boolean z17) {
        this.f303324e = str;
        this.f303326g = bArr;
        this.f303327h = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303323d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ox5 ox5Var = new r45.ox5();
        ox5Var.f382606d = this.f303324e;
        ox5Var.f382608f = this.f303327h;
        byte[] bArr = this.f303326g;
        if (bArr != null) {
            ox5Var.f382607e = x51.j1.a(bArr).f371841f;
        }
        lVar.f70664a = ox5Var;
        lVar.f70665b = new r45.px5();
        lVar.f70667d = ma1.m.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/searchuserauth";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ma1.m.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.px5 px5Var = (r45.px5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f303325f = px5Var;
        if (px5Var != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = px5Var.f383465f;
            objArr[1] = java.lang.Integer.valueOf(px5Var.f383466g);
            java.util.LinkedList linkedList = this.f303325f.f383464e;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchUserAuth", "searchUserAuth nextPageData: %s, flag: %s, size: %s", objArr);
        }
        r45.qv6 qv6Var = this.f303325f.f383463d;
        if (qv6Var != null) {
            i19 = qv6Var.f384304d;
            str = qv6Var.f384305e;
        }
        this.f303323d.onSceneEnd(i18, i19, str, this);
    }
}
