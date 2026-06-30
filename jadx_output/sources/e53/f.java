package e53;

@mk0.a
/* loaded from: classes.dex */
public class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.Set<java.lang.String> keySet;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : keySet) {
                jSONObject.put(str, bundle.get(str));
            }
            com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
            am.le leVar = gameCommOperationEvent.f54358g;
            leVar.f7243a = 4;
            leVar.f7244b = jSONObject.toString();
            gameCommOperationEvent.e();
        } catch (org.json.JSONException unused) {
        }
    }
}
