package p83;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352753d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.me5 f352754e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ne5 f352755f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352756g = null;

    public i(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f352753d = null;
        this.f352754e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.me5();
        lVar.f70665b = new r45.ne5();
        lVar.f70667d = 991;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstninvite";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352753d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int e17 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        r45.me5 me5Var = (r45.me5) a17.f70710a.f70684a;
        me5Var.f380417d = c01.z1.r();
        me5Var.f380418e = str2;
        me5Var.f380422i = str;
        me5Var.f380421h = i17;
        me5Var.f380419f = e17;
        me5Var.f380423m = 1;
        me5Var.f380420g = currentTimeMillis;
        me5Var.f380424n = i18;
        me5Var.f380425o = i19;
        this.f352754e = me5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352756g = u0Var;
        return dispatch(sVar, this.f352753d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 991;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352755f = (r45.ne5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 || i19 == 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f352756g;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.u0 u0Var2 = this.f352756g;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
