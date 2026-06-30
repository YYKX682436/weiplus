package k91;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public k91.i f305622a;

    public static k91.j a(org.json.JSONObject jSONObject, k91.j jVar) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("rendererOptions")) == null) {
            return jVar;
        }
        k91.j jVar2 = new k91.j();
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("skyline");
        if (optJSONObject2 != null) {
            k91.i iVar = jVar != null ? jVar.f305622a : null;
            k91.i iVar2 = new k91.i();
            jVar2.f305622a = iVar2;
            iVar2.f305612a = optJSONObject2.optBoolean("disableABTest", iVar != null && iVar.f305612a);
            jVar2.f305622a.f305613b = optJSONObject2.optString("sdkVersionBegin", iVar != null ? iVar.f305613b : "");
            jVar2.f305622a.f305614c = optJSONObject2.optString("sdkVersionEnd", iVar != null ? iVar.f305614c : "");
            jVar2.f305622a.f305615d = optJSONObject2.optString("androidVersionBegin", iVar != null ? iVar.f305615d : "");
            jVar2.f305622a.f305616e = optJSONObject2.optString("androidVersionEnd", iVar != null ? iVar.f305616e : "");
        }
        return jVar2;
    }
}
