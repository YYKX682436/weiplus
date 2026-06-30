package yd1;

/* loaded from: classes7.dex */
public class d implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f460989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f460991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.h f460992d;

    public d(yd1.h hVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, org.json.JSONObject jSONObject) {
        this.f460992d = hVar;
        this.f460989a = c0Var;
        this.f460990b = i17;
        this.f460991c = jSONObject;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = this.f460991c;
        int i19 = this.f460990b;
        yd1.h hVar = this.f460992d;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f460989a;
        try {
            if (i18 != 0) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("errCode", i18);
                jSONObject3.put("errMsg", hVar.k() + ":fail:" + str);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editForMediaSdk result, %s", jSONObject3.toString());
                c0Var.a(i19, jSONObject3.toString());
            } else {
                jSONObject2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, jSONObject.optString("wxaFilePath", ""));
                hVar.J(c0Var, jSONObject2, new yd1.c(this));
            }
        } catch (org.json.JSONException e17) {
            c0Var.a(i19, hVar.o(java.lang.String.format("fail: editForMediaSdk format result failed, %s", e17.getMessage())));
        }
    }
}
