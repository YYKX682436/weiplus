package q93;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f360923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi f360924f;

    public h(int i17, bw5.lp0 lp0Var, com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi liteAppTingAudioStateApi) {
        this.f360922d = i17;
        this.f360923e = lp0Var;
        this.f360924f = liteAppTingAudioStateApi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f360922d;
        com.tencent.mars.xlog.Log.i("LiteAppSetTingAudioStateApi", "backgroundAudioListener callback event:%s", java.lang.Integer.valueOf(i17));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
            jSONObject.put("currentTime", z8Var.Di() / 1000);
            jSONObject.put("err_code", i17 == 12 ? -1 : 0);
            jSONObject.put("status", rk4.m.f396834a.a(z8Var.Ri()));
            bw5.lp0 lp0Var = this.f360923e;
            if (lp0Var != null) {
                java.lang.String e17 = lp0Var.d().e();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (e17 == null) {
                    e17 = "";
                }
                jSONObject.put("categoryId", e17);
                int Ai = z8Var.Ai() / 1000;
                jSONObject.put("duration", Ai);
                jSONObject.put("item", z8Var.Ui(lp0Var, Ai));
                jm4.g3 g3Var = zk4.l.f473540c;
                jSONObject.put("buffered", ((g3Var != null ? (int) ((jm4.h3) g3Var).s() : 0) * Ai) / 100);
            }
            com.tencent.mars.xlog.Log.i("LiteAppSetTingAudioStateApi", "onTingAudioStateChanged param=%s", jSONObject.toString());
            com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(this.f360924f.f143478g, "onTingAudioStateChanged", jSONObject);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("LiteAppSetTingAudioStateApi", "onPlayerEvent ex " + e18.getMessage());
        }
    }
}
