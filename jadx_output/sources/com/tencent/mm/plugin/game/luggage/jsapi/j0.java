package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class j0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f139682d;

    public j0(com.tencent.mm.plugin.game.luggage.jsapi.l0 l0Var, sd.b bVar) {
        this.f139682d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("value");
        java.lang.String string2 = bundle.getString("weight");
        long j17 = bundle.getLong("expireTime");
        java.lang.String string3 = bundle.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("weight", string2);
            jSONObject.put("expireTime", j17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                jSONObject.put("value", string);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                jSONObject.put("value", ew4.c.c().b(string3));
            }
        } catch (org.json.JSONException unused) {
        }
        boolean has = jSONObject.has("value");
        sd.b bVar = this.f139682d;
        if (has) {
            bVar.e(jSONObject);
        } else {
            bVar.a();
        }
    }
}
