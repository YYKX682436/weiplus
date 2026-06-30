package eh0;

/* loaded from: classes5.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final eh0.i a(java.lang.String json) {
        kotlin.jvm.internal.o.g(json, "json");
        org.json.JSONObject jSONObject = new org.json.JSONObject(json);
        return new eh0.i(jSONObject.optLong("msgSvrId"), jSONObject.optLong("msgId"), jSONObject.optString("ilinkStreamId"), jSONObject.optString("streamTicket"), jSONObject.optString("talker"), jSONObject.optLong("createTime"), null, null, jSONObject.optBoolean("isThinking", false), 192, null);
    }
}
