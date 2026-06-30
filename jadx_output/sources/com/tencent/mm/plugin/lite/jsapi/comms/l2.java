package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class l2 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.m2 f143649a;

    public l2(com.tencent.mm.plugin.lite.jsapi.comms.m2 m2Var) {
        this.f143649a = m2Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", aq3Var.f370199e);
            jSONObject.put("avatarUrl", aq3Var.f370204m);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, aq3Var.f370202h);
            jSONObject.put("userName", aq3Var.f370203i);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, aq3Var.f370205n);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiFetchQRCodeInfo", e17.toString());
        }
        this.f143649a.f143443f.c(jSONObject, false);
    }
}
