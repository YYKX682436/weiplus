package r73;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.bh3 f393168r;

    public e(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ah3();
        lVar.f70665b = new r45.bh3();
        lVar.f70667d = com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_NO_EXIF;
        lVar.f70666c = "/cgi-bin/mmpay-bin/gethpcard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.ah3 ah3Var = (r45.ah3) a17.f70710a.f70684a;
        ah3Var.f370008d = str;
        ah3Var.f370009e = at4.g0.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "card no: %s", str);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bh3 bh3Var = (r45.bh3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393168r = bh3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetHoneyPayCard", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(bh3Var.f370758d), this.f393168r.f370759e);
        r45.bs bsVar = this.f393168r.f370761g;
        if (bsVar != null) {
            u73.h.k(bsVar.f371018f, bsVar.f371016d, bsVar.f371017e, null);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.bh3 bh3Var = (r45.bh3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = bh3Var.f370758d;
        this.f214030h = bh3Var.f370759e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_NO_EXIF;
    }
}
