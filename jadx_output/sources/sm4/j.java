package sm4;

/* loaded from: classes15.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409952d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409953e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409954f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final r45.xn6 f409955g;

    public j(org.json.JSONObject jSONObject) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2802;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        lVar.f70664a = new r45.mn6();
        lVar.f70665b = new r45.nn6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409953e = a17;
        r45.mn6 mn6Var = (r45.mn6) a17.f70710a.f70684a;
        mn6Var.f380697d = jSONObject.optString("docId", "");
        mn6Var.f380698e = jSONObject.optString("commentId", "");
        mn6Var.f380699f = jSONObject.optInt("opType", 0);
        mn6Var.f380700g = jSONObject.optString("requestId", "");
        mn6Var.f380701h = jSONObject.optString("content", "");
        mn6Var.f380702i = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        mn6Var.f380703m = jSONObject.optString("searchId", "");
        mn6Var.f380704n = jSONObject.optInt("subScene", 0);
        mn6Var.f380705o = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID, "");
        mn6Var.f380706p = jSONObject.optString("byPass", "");
        mn6Var.f380707q = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", mn6Var.f380697d, mn6Var.f380698e, java.lang.Integer.valueOf(mn6Var.f380699f), mn6Var.f380700g, mn6Var.f380701h, java.lang.Integer.valueOf(mn6Var.f380702i), mn6Var.f380703m, java.lang.Integer.valueOf(mn6Var.f380704n), mn6Var.f380705o, mn6Var.f380706p);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409952d = u0Var;
        return dispatch(sVar, this.f409953e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2802;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409954f));
        this.f409952d.onSceneEnd(i18, i19, str, this);
    }

    public j(r45.xn6 xn6Var, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19, java.lang.String str4, java.lang.String str5, int i27) {
        this.f409955g = xn6Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2802;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        lVar.f70664a = new r45.mn6();
        lVar.f70665b = new r45.nn6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409953e = a17;
        r45.mn6 mn6Var = (r45.mn6) a17.f70710a.f70684a;
        mn6Var.f380697d = str;
        mn6Var.f380698e = "";
        mn6Var.f380699f = i17;
        mn6Var.f380700g = str2;
        mn6Var.f380701h = "";
        mn6Var.f380702i = i18;
        mn6Var.f380703m = str3;
        mn6Var.f380704n = i19;
        mn6Var.f380705o = str4;
        mn6Var.f380706p = str5;
        mn6Var.f380707q = i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, "", java.lang.Integer.valueOf(i17), mn6Var.f380700g, mn6Var.f380701h, java.lang.Integer.valueOf(mn6Var.f380702i), mn6Var.f380703m, java.lang.Integer.valueOf(mn6Var.f380704n), mn6Var.f380705o, mn6Var.f380706p);
    }
}
