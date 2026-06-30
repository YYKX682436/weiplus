package hm3;

/* loaded from: classes.dex */
public final class p extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f282276i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282277m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282278n;

    /* renamed from: o, reason: collision with root package name */
    public r45.es4 f282279o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.bt4 bt4Var, r45.hf2 songInfo, java.lang.String songInfoBase64, int i17, boolean z17) {
        super(i17);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(songInfoBase64, "songInfoBase64");
        this.f282276i = songInfoBase64;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6860;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        lVar.f70664a = new r45.ds4();
        lVar.f70665b = new r45.es4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282278n = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        r45.ds4 ds4Var = (r45.ds4) fVar;
        if (z17) {
            ds4Var.f372720o = 102;
        } else {
            ds4Var.f372720o = 103;
        }
        r45.kv0 kv0Var = new r45.kv0();
        if (bt4Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(bt4Var.f371038f));
        }
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        ds4Var.f372712d = kv0Var;
        ds4Var.f372725t = db2.t4.f228171a.n();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("songid", songInfo.getString(5));
        jSONObject.put("mvquery", jSONObject2);
        jSONObject.put("songinfobufferbase64", songInfoBase64);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "songId:%s", songInfo.getString(5));
        ds4Var.f372721p = jSONObject.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282277m = callback;
        return dispatch(dispatcher, this.f282278n, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6860;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282277m;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282278n.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
        this.f282279o = (r45.es4) fVar;
        r45.es4 es4Var = new r45.es4();
        r45.es4 es4Var2 = this.f282279o;
        es4Var.parseFrom(es4Var2 != null ? es4Var2.toByteArray() : null);
        fm3.y yVar = fm3.y.f264161a;
        java.lang.String songInfoBase64 = this.f282276i;
        kotlin.jvm.internal.o.g(songInfoBase64, "songInfoBase64");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", "putMvRecommendList, songInfoBase64:" + songInfoBase64.hashCode() + ", response:" + es4Var.hashCode() + ", timestamp:" + elapsedRealtime);
        fm3.y.f264163c.put(new fm3.b0(songInfoBase64), new fm3.a0(es4Var, elapsedRealtime));
        yVar.a(elapsedRealtime);
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282277m;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
