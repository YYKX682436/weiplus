package w11;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442099d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f442100e;

    public o0(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bb5();
        lVar.f70665b = new r45.cb5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
        lVar.f70667d = 1804;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f442100e = a17;
        r45.bb5 bb5Var = (r45.bb5) a17.f70710a.f70684a;
        bb5Var.f370656d = i17;
        bb5Var.f370658f = str;
        if ((i17 & 16) > 0) {
            jk5.j jVar = new jk5.j();
            r45.kq6 kq6Var = new r45.kq6();
            l56.i iVar = jVar.f300169b;
            if (iVar == null) {
                kq6Var = null;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f316692d)) {
                l56.i iVar2 = jVar.f300169b;
                kq6Var.f378906d = iVar2.f316692d;
                kq6Var.f378907e = iVar2.f316693e;
            }
            bb5Var.f370659g = kq6Var;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f442099d = u0Var;
        return dispatch(sVar, this.f442100e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1804;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f442099d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f442099d.onSceneEnd(i18, i19, str, this);
        }
    }
}
