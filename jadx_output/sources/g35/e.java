package g35;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f268183d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f268184e;

    /* renamed from: f, reason: collision with root package name */
    public final g35.d f268185f;

    public e(ot0.q qVar, java.lang.String str, java.lang.String str2, g35.d dVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vz();
        lVar.f70665b = new r45.wz();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkbigfileupload";
        lVar.f70667d = 727;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f268184e = a17;
        r45.vz vzVar = (r45.vz) a17.f70710a.f70684a;
        if (qVar == null || com.tencent.mm.sdk.platformtools.t8.K0(qVar.T) || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348710t)) {
            vzVar.f388684g = com.tencent.mm.modelcdntran.s1.cj().d();
            vzVar.f388685h = com.tencent.mm.modelcdntran.s1.cj().e(str);
            vzVar.f388688n = com.tencent.mm.vfs.w6.q(str);
            vzVar.f388687m = com.tencent.mm.vfs.w6.n(str);
            vzVar.f388683f = com.tencent.mm.vfs.w6.k(str);
        } else {
            vzVar.f388684g = qVar.T;
            vzVar.f388685h = qVar.f348710t;
            vzVar.f388688n = qVar.n();
            vzVar.f388687m = qVar.f348690o;
            vzVar.f388683f = qVar.f348682m;
        }
        vzVar.f388686i = 7;
        vzVar.f388682e = str2;
        vzVar.f388681d = c01.z1.r();
        this.f268185f = dVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckBigFileUpload", "summerbig NetSceneCheckBigFileUpload content[%s], aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", qVar, vzVar.f388684g, vzVar.f388685h, vzVar.f388688n, java.lang.Long.valueOf(vzVar.f388683f), vzVar.f388687m, vzVar.f388682e, vzVar.f388681d, new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f268183d = u0Var;
        return dispatch(sVar, this.f268184e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 727;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        g35.d dVar = this.f268185f;
        if (i18 == 0 && i19 == 0) {
            this.f268183d.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
            r45.vz vzVar = (r45.vz) oVar.f70710a.f70684a;
            r45.wz wzVar = (r45.wz) oVar.f70711b.f70700a;
            java.lang.String str3 = wzVar.f389588d;
            if (dVar != null) {
                if (wzVar.getBaseResponse().f376959d != 0) {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(wzVar.getBaseResponse().f376960e.f372756d, "e", null);
                    str2 = d17 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6u) : (java.lang.String) d17.get(".e.Content");
                } else {
                    str2 = "";
                }
                this.f268185f.a(str2, vzVar.f388685h, vzVar.f388684g, wzVar.f389588d, wzVar.f389590f, wzVar.f389591g, vzVar.f388683f);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i18 + ", errCode = " + i19);
        this.f268183d.onSceneEnd(i18, i19, str, this);
        if (dVar != null) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6v);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null);
                string = d18 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6u) : (java.lang.String) d18.get(".e.Content");
            }
            this.f268185f.a(string, "", "", "", "", "", 0L);
        }
    }
}
