package su4;

/* loaded from: classes.dex */
public class v1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413113d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413114e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f413116g;

    /* renamed from: h, reason: collision with root package name */
    public int f413117h = -1;

    /* renamed from: i, reason: collision with root package name */
    public su4.g2 f413118i;

    public v1(java.util.Map map, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n77();
        lVar.f70665b = new r45.o77();
        lVar.f70666c = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
        lVar.f70667d = 1866;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413113d = a17;
        this.f413116g = i18;
        this.f413115f = i17;
        r45.e64 i19 = su4.r2.i();
        r45.n77 n77Var = (r45.n77) a17.f70710a.f70684a;
        if (i19 != null) {
            n77Var.f381142d = i19.f373047e;
            n77Var.f381143e = i19.f373046d;
        }
        n77Var.f381144f = com.tencent.mm.plugin.websearch.l2.b();
        n77Var.f381145g = com.tencent.mm.plugin.websearch.l2.a(3);
        n77Var.f381146h = com.tencent.mm.plugin.websearch.l2.f(map, "statSessionId");
        n77Var.f381147i = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "extReqParams");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(f17);
                n77Var.f381148m = new java.util.LinkedList();
                for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                    r45.tw6 tw6Var = new r45.tw6();
                    tw6Var.f386837d = jSONObject.optString("key", "");
                    tw6Var.f386838e = jSONObject.optLong("uintValue", 0L);
                    tw6Var.f386839f = jSONObject.optString("textValue", "");
                    n77Var.f381148m.push(tw6Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "weappsearchguide req, version = %d, sessionId = %s, scene = %d, extParam = %s", java.lang.Integer.valueOf(n77Var.f381145g), n77Var.f381146h, java.lang.Integer.valueOf(n77Var.f381147i), f17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413114e = u0Var;
        return dispatch(sVar, this.f413113d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f413113d.f70713d;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        su4.g2 g2Var = new su4.g2(this.f413115f, (r45.o77) this.f413113d.f70711b.f70700a, this.f413116g);
        this.f413118i = g2Var;
        java.lang.String a17 = ys3.l.a();
        r45.rh4 rh4Var = new r45.rh4();
        rh4Var.f384871d = g2Var.f412897a;
        rh4Var.f384872e = g2Var.f412898b;
        rh4Var.f384873f = g2Var.f412899c;
        rh4Var.f384874g = g2Var.f412900d;
        rh4Var.f384875h = g2Var.f412901e;
        try {
            bArr2 = rh4Var.toByteArray();
        } catch (java.io.IOException unused) {
            bArr2 = null;
        }
        if (bArr2 != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17, su4.g2.a(g2Var.f412897a));
            if (!r6Var.s().m()) {
                r6Var.s().J();
            }
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mm.vfs.w6.S(r6Var.o(), bArr2, 0, bArr2.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj saved, scene:%d", java.lang.Integer.valueOf(g2Var.f412897a));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.SearchGuideCacheObj", "SearchGuideCacheObj toBytes fail, scene:%d!", java.lang.Integer.valueOf(g2Var.f412897a));
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f413114e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
