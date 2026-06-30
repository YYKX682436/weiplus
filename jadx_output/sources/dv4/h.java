package dv4;

/* loaded from: classes11.dex */
public final class h extends dv4.b {

    /* renamed from: c, reason: collision with root package name */
    public final dv4.o f244011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f244012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(org.json.JSONObject data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("box");
        optJSONObject = optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        this.f244011c = new dv4.o((float) optJSONObject.optDouble("x1", 0.0d), (float) optJSONObject.optDouble("y1", 0.0d), (float) optJSONObject.optDouble("x2", 0.0d), (float) optJSONObject.optDouble("y2", 0.0d));
        this.f244012d = data.optBoolean("changeHeight", false);
    }
}
