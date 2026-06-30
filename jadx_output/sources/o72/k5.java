package o72;

/* loaded from: classes4.dex */
public class k5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343391d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343392e = null;

    public k5() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rf3();
        lVar.f70665b = new r45.sf3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getfavinfo";
        lVar.f70667d = 438;
        lVar.f70668e = 217;
        lVar.f70669f = 1000000217;
        this.f343391d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f343392e = u0Var;
        return dispatch(sVar, this.f343391d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 438;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.sf3 sf3Var = (r45.sf3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            o72.x1.I0(sf3Var.f385663d);
            o72.x1.H0(sf3Var.f385664e);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putLong("fav_mx_auto_download_size", sf3Var.f385667h).commit();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putLong("fav_mx_auto_upload_size", sf3Var.f385666g).commit();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putLong("fav_mx_file_size", sf3Var.f385665f).commit();
        }
        this.f343392e.onSceneEnd(i18, i19, str, this);
    }
}
