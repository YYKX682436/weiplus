package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class y3 extends com.tencent.mm.plugin.webview.luggage.jsapi.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f139782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f139783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.x3 f139784c;

    public y3(com.tencent.mm.plugin.game.luggage.jsapi.x3 x3Var, sd.b bVar, org.json.JSONObject jSONObject) {
        this.f139784c = x3Var;
        this.f139782a = bVar;
        this.f139783b = jSONObject;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.b bVar = this.f139782a;
        if (jSONObject == null) {
            bVar.c(str, null);
            return;
        }
        bVar.e(jSONObject);
        java.lang.String optString = jSONObject.optString(dm.i4.COL_LOCALID);
        this.f139784c.getClass();
        org.json.JSONObject jSONObject2 = this.f139783b;
        if (jSONObject2 == null) {
            return;
        }
        com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo = new com.tencent.mm.modelmulti.SourceImgInfo(jSONObject2.optString("url", ""), 1);
        ((m11.z0) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Ri()).getClass();
        sourceImgInfo.toString();
        m11.z0.f322814a.C(optString, sourceImgInfo);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
