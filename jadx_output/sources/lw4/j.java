package lw4;

/* loaded from: classes8.dex */
public class j implements lw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView f321658a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f321659b;

    /* renamed from: c, reason: collision with root package name */
    public int f321660c;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.n f321661d;

    public j(com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView ftsWebVideoView, lw4.f fVar, nw4.n nVar) {
        this.f321658a = ftsWebVideoView;
        ((java.util.HashSet) ((com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) fVar).U3).add(this);
        this.f321661d = nVar;
    }

    @Override // lw4.e
    public void a() {
    }

    @Override // lw4.e
    public void b() {
    }

    @Override // lw4.e
    public void c() {
    }

    @Override // lw4.e
    public void d() {
    }

    @Override // lw4.e
    public void e() {
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiVideoCallback", "clean %s", toString());
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f321659b;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final org.json.JSONObject g(int i17, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("playerId", this.f321658a.getmVideoPlayerId());
        jSONObject2.put("event", i17);
        if (jSONObject != null) {
            jSONObject2.put("detail", jSONObject);
        }
        return jSONObject2;
    }

    public final org.json.JSONObject h() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f321658a.getCookieData());
        return jSONObject;
    }

    public void i() {
        try {
            org.json.JSONObject h17 = h();
            h17.put("currentTime", this.f321658a.getCurrPosSec());
            j(g(6, h17));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
        }
    }

    public final void j(org.json.JSONObject jSONObject) {
        this.f321661d.i0("onVideoPlayerCallback", null, jSONObject);
    }

    @Override // lw4.e
    public boolean onBackPressed() {
        return false;
    }

    @Override // lw4.e
    public void onDestroy() {
        f();
        this.f321658a.setCallback(null);
    }
}
