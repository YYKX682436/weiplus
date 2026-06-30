package ki4;

/* loaded from: classes9.dex */
public final class d0 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hi4.e f308127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308128f;

    public d0(java.lang.String str, hi4.e eVar, java.lang.String str2) {
        this.f308126d = str;
        this.f308127e = eVar;
        this.f308128f = str2;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f308126d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("enc_username", str);
        hi4.e eVar = this.f308127e;
        if (eVar != null) {
            jSONObject.put("session_id", eVar.field_session_id);
            jSONObject.put("hash_username", eVar.field_hash_username);
            jSONObject.put("tag", eVar.field_tag);
            jSONObject.put("source_id", eVar.field_source_id);
            jSONObject.put("plain", eVar.field_plain);
            jSONObject.put("status_id", eVar.field_status_id);
            jSONObject.put("modify_count", eVar.field_modify_count);
            jSONObject.put("card_key", eVar.field_card_key);
        }
        java.lang.String str2 = this.f308128f;
        if (!(str2 == null || r26.n0.N(str2))) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
