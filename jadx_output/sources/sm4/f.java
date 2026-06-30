package sm4;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409937d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409938e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409939f = java.lang.System.currentTimeMillis();

    public f(org.json.JSONObject jSONObject) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2906;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f70664a = new r45.kn6();
        lVar.f70665b = new r45.ln6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409938e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f70710a.f70684a;
        kn6Var.f378862d = jSONObject.optString("requestId", "");
        kn6Var.f378863e = jSONObject.optString("docId", "");
        kn6Var.f378864f = jSONObject.optString("content", "");
        kn6Var.f378865g = jSONObject.optString("replyId", "");
        kn6Var.f378866h = jSONObject.optString("subReplyId", "");
        kn6Var.f378867i = jSONObject.optString("docUrl", "");
        kn6Var.f378868m = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kn6Var.f378869n = jSONObject.optString("searchId", "");
        kn6Var.f378870o = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        kn6Var.f378871p = jSONObject.optInt("subScene", 0);
        kn6Var.f378873r = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID, "");
        kn6Var.f378872q = jSONObject.optString("byPass", "");
        kn6Var.f378874s = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", kn6Var.f378862d, kn6Var.f378863e, kn6Var.f378864f, kn6Var.f378865g, kn6Var.f378866h, kn6Var.f378867i, kn6Var.f378868m, kn6Var.f378869n, java.lang.Integer.valueOf(kn6Var.f378870o), java.lang.Integer.valueOf(kn6Var.f378871p));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409937d = u0Var;
        return dispatch(sVar, this.f409938e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2906;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409939f));
        this.f409937d.onSceneEnd(i18, i19, str, this);
    }

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9, java.lang.String str10, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2906;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f70664a = new r45.kn6();
        lVar.f70665b = new r45.ln6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409938e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f70710a.f70684a;
        kn6Var.f378862d = str;
        kn6Var.f378863e = str2;
        kn6Var.f378864f = str3;
        kn6Var.f378865g = str4;
        kn6Var.f378866h = str5;
        kn6Var.f378867i = str6;
        kn6Var.f378868m = str7;
        kn6Var.f378869n = str8;
        kn6Var.f378870o = i17;
        kn6Var.f378871p = i18;
        kn6Var.f378873r = str9;
        kn6Var.f378872q = str10;
        kn6Var.f378874s = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(kn6Var.f378871p));
    }

    public f(sm4.f fVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2906;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f70664a = new r45.kn6();
        lVar.f70665b = new r45.ln6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409938e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f70710a.f70684a;
        r45.kn6 kn6Var2 = (r45.kn6) fVar.f409938e.f70710a.f70684a;
        java.lang.String str = kn6Var2.f378862d;
        kn6Var.f378862d = str;
        java.lang.String str2 = kn6Var2.f378863e;
        kn6Var.f378863e = str2;
        java.lang.String str3 = kn6Var2.f378864f;
        kn6Var.f378864f = str3;
        java.lang.String str4 = kn6Var2.f378865g;
        kn6Var.f378865g = str4;
        java.lang.String str5 = kn6Var2.f378866h;
        kn6Var.f378866h = str5;
        java.lang.String str6 = kn6Var2.f378867i;
        kn6Var.f378867i = str6;
        java.lang.String str7 = kn6Var2.f378868m;
        kn6Var.f378868m = str7;
        java.lang.String str8 = kn6Var2.f378869n;
        kn6Var.f378869n = str8;
        int i17 = kn6Var2.f378870o;
        kn6Var.f378870o = i17;
        kn6Var.f378871p = kn6Var2.f378871p;
        kn6Var.f378873r = kn6Var2.f378873r;
        kn6Var.f378872q = kn6Var2.f378872q;
        kn6Var.f378874s = kn6Var2.f378874s;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(kn6Var.f378871p));
    }
}
