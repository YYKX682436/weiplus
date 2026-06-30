package g35;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final wy.f f268177d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f268178e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f268179f;

    public a(java.util.List list, wy.f fVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.le();
        lVar.f70665b = new r45.me();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchcheckbigfileupload";
        lVar.f70667d = 3939;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f268179f = a17;
        r45.le leVar = (r45.le) a17.f70710a.f70684a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            wy.g gVar = (wy.g) it.next();
            r45.vz vzVar = new r45.vz();
            java.lang.String str = gVar.f450599f;
            java.lang.String str2 = gVar.f450600g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.f450595b) || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f450594a)) {
                vzVar.f388684g = com.tencent.mm.modelcdntran.s1.cj().d();
                vzVar.f388685h = com.tencent.mm.modelcdntran.s1.cj().e(str);
                vzVar.f388688n = com.tencent.mm.vfs.w6.q(str);
                vzVar.f388687m = com.tencent.mm.vfs.w6.n(str);
                vzVar.f388683f = com.tencent.mm.vfs.w6.k(str);
            } else {
                vzVar.f388684g = gVar.f450595b;
                vzVar.f388685h = gVar.f450594a;
                vzVar.f388688n = gVar.f450596c;
                vzVar.f388687m = gVar.f450597d;
                vzVar.f388683f = gVar.f450598e;
            }
            vzVar.f388686i = 7;
            vzVar.f388682e = str2;
            vzVar.f388681d = c01.z1.r();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig NetSceneBatchCheckBigFileUpload, aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", vzVar.f388684g, vzVar.f388685h, vzVar.f388688n, java.lang.Long.valueOf(vzVar.f388683f), vzVar.f388687m, vzVar.f388682e, vzVar.f388681d, new com.tencent.mm.sdk.platformtools.z3());
            leVar.f379346e.add(vzVar);
        }
        leVar.f379345d = leVar.f379346e.size();
        this.f268177d = fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f268178e = u0Var;
        return dispatch(sVar, this.f268179f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3939;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        wy.f fVar = this.f268177d;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i18 + ", errCode = " + i19);
            this.f268178e.onSceneEnd(i18, i19, str, this);
            if (fVar != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6v);
                }
                if (i19 == 0) {
                    i19 = com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND;
                }
                fVar.a(i19, str, null);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.le leVar = (r45.le) oVar.f70710a.f70684a;
        r45.me meVar = (r45.me) oVar.f70711b.f70700a;
        int i27 = meVar.getBaseResponse().f376959d;
        if (i27 != 0) {
            java.lang.String str2 = meVar.getBaseResponse().f376960e.f372756d;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig outer resp.getBaseResponse().Ret: " + i27 + ", errMsg:" + str2);
            this.f268178e.onSceneEnd(i18, i27, str2, this);
            if (fVar != null) {
                fVar.a(i27, str2, null);
                return;
            }
            return;
        }
        int i28 = leVar.f379345d;
        int i29 = meVar.f380383d;
        java.util.LinkedList linkedList = meVar.f380384e;
        if (i28 == i29) {
            java.util.LinkedList linkedList2 = leVar.f379346e;
            if (linkedList2.size() == linkedList.size() && meVar.f380383d == linkedList.size()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.wz wzVar = (r45.wz) it.next();
                    int i37 = wzVar.getBaseResponse().f376959d;
                    java.lang.String str3 = wzVar.getBaseResponse().f376960e.f372756d;
                    if (i37 != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig inner resp.getBaseResponse().Ret: " + wzVar + ", errMsg:" + str3);
                        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str3, "e", null);
                        java.lang.String string = d17 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6u) : (java.lang.String) d17.get(".e.Content");
                        this.f268178e.onSceneEnd(i18, i37, string, this);
                        if (fVar != null) {
                            fVar.a(i37, string, null);
                            return;
                        }
                        return;
                    }
                }
                this.f268178e.onSceneEnd(i18, i19, str, this);
                if (fVar != null) {
                    java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
                    for (int i38 = 0; i38 < meVar.f380383d; i38++) {
                        wy.h hVar = new wy.h();
                        java.lang.String str4 = ((r45.vz) linkedList2.get(i38)).f388685h;
                        long j17 = ((r45.vz) linkedList2.get(i38)).f388683f;
                        java.lang.String str5 = ((r45.vz) linkedList2.get(i38)).f388684g;
                        java.lang.String str6 = ((r45.wz) linkedList.get(i38)).f389588d;
                        java.lang.String str7 = ((r45.wz) linkedList.get(i38)).f389590f;
                        java.lang.String str8 = ((r45.wz) linkedList.get(i38)).f389591g;
                        int i39 = ((r45.wz) linkedList.get(i38)).f389589e;
                        synchronizedList.add(hVar);
                    }
                    fVar.a(0, "", synchronizedList);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig  req.count: " + leVar.f379345d + " not equals resp.Count:" + meVar.f380383d + ", resp.List.size() = " + linkedList.size());
        this.f268178e.onSceneEnd(i18, -1000, "req-count mismatch resp-count", this);
        if (fVar != null) {
            fVar.a(-1000, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b6t), null);
        }
    }
}
