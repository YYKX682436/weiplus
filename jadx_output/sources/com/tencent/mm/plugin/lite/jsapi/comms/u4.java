package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class u4 implements i40.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.v4 f143798a;

    public u4(com.tencent.mm.plugin.lite.jsapi.comms.v4 v4Var) {
        this.f143798a = v4Var;
    }

    @Override // i40.b
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("PauseDownloadChatFile", "pauseDownloadChatFile onDownloadFailed, errorType: %d, errorCode: %d, errorMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f143798a.f143442e.b("download failed.");
    }

    @Override // i40.b
    public void b() {
        com.tencent.mm.plugin.lite.jsapi.comms.v4 v4Var = this.f143798a;
        com.tencent.mars.xlog.Log.i("PauseDownloadChatFile", "pauseDownloadChatFile onDownloadPaused");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("pause", true);
            v4Var.f143442e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("PauseDownloadChatFile", "pauseDownloadChatFile json exception: %s", e17.toString());
            v4Var.f143442e.b("download paused json exception");
        }
    }
}
