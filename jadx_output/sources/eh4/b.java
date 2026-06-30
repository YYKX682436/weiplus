package eh4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252931d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252932e;

    public b(int i17, long j17, java.lang.String str, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vl0();
        lVar.f70665b = new r45.wl0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/exittalkroom";
        lVar.f70667d = 333;
        lVar.f70668e = 148;
        lVar.f70669f = 1000000148;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252932e = a17;
        r45.vl0 vl0Var = (r45.vl0) a17.f70710a.f70684a;
        vl0Var.f388341f = str;
        vl0Var.f388339d = i17;
        vl0Var.f388340e = j17;
        vl0Var.f388342g = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252931d = u0Var;
        return dispatch(sVar, this.f252932e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 333;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f252931d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f252931d.onSceneEnd(i18, i19, str, this);
        }
    }
}
