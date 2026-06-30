package hm3;

/* loaded from: classes.dex */
public final class k extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282257i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282258m;

    /* renamed from: n, reason: collision with root package name */
    public r45.es4 f282259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, com.tencent.mm.protobuf.g gVar) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6860;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        lVar.f70664a = new r45.ds4();
        lVar.f70665b = new r45.es4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282258m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        r45.ds4 ds4Var = (r45.ds4) fVar;
        ds4Var.f372720o = 101;
        ds4Var.f372725t = db2.t4.f228171a.n();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = (com.tencent.mm.plugin.mv.ui.uic.c3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bgmid", c3Var.f151075e.getString(5));
        jSONObject.put("songname", c3Var.f151075e.getString(0));
        jSONObject.put("singername", c3Var.f151075e.getString(1));
        jSONObject.put("songdesc", "");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 1);
        jSONObject2.put("bgmquery", jSONObject);
        r45.hf2 songInfo = c3Var.f151075e;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        byte[] encode = android.util.Base64.encode(songInfo.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        jSONObject2.put("songinfobufferbase64", new java.lang.String(encode, r26.c.f368865a));
        ds4Var.f372721p = jSONObject2.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "create NetSceneMusicMvGetFeedRecommendList songId:" + c3Var.f151075e.getString(5));
        r45.kv0 kv0Var = new r45.kv0();
        ds4Var.f372712d = kv0Var;
        kv0Var.set(1, 93);
        r45.kv0 kv0Var2 = ds4Var.f372712d;
        if (kv0Var2 != null) {
            kv0Var2.set(5, java.lang.Long.valueOf(c01.id.c()));
        }
        ds4Var.f372713e = gVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282257i = callback;
        return dispatch(dispatcher, this.f282258m, this);
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
            com.tencent.mm.modelbase.u0 u0Var = this.f282257i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282258m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
        this.f282259n = (r45.es4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282257i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
