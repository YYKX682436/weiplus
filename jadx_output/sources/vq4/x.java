package vq4;

/* loaded from: classes12.dex */
public abstract class x {
    public static final org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String str, yz5.l lVar) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        lVar.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2.toString());
        return jSONObject;
    }

    public static final float b(long j17, long j18) {
        return a06.d.b((((((float) j17) * 10.0f) / ((float) j18)) * 100) * 20.0f) / 20.0f;
    }
}
