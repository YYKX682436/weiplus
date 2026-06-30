package xc2;

/* loaded from: classes2.dex */
public final class w0 extends xc2.p {

    /* renamed from: l, reason: collision with root package name */
    public boolean f453320l;

    /* renamed from: m, reason: collision with root package name */
    public int f453321m;

    /* renamed from: n, reason: collision with root package name */
    public int f453322n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(cl0.g data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.MutualJumpInfoCache", "aid:" + this.f453230i);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(data.optString("crt_info"));
            if (jSONArray.length() > 0) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(0);
                this.f453221c = jSONObject.optString("image_url");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    this.f453219a = optJSONObject.optString("description");
                    this.f453220b = optJSONObject.optString("caption");
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
