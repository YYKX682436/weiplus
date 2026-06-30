package eu0;

/* loaded from: classes5.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final eu0.n a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String optString = jSONObject.optString("musicID", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONObject.optString("musicName", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        java.lang.String optString3 = jSONObject.optString("authorName", "");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        java.lang.String optString4 = jSONObject.optString("coverUrl", "");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        java.lang.String optString5 = jSONObject.optString("musicFilePath", "");
        kotlin.jvm.internal.o.f(optString5, "optString(...)");
        return new eu0.n(optString, optString2, optString3, optString4, optString5, jSONObject.optLong("durationInMs", 0L), jSONObject.optBoolean("isMusicOn", true));
    }
}
