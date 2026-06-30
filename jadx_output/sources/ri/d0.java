package ri;

/* loaded from: classes12.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f395859a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f395860b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f395861c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f395862d;

    /* renamed from: e, reason: collision with root package name */
    public qi.b f395863e;

    public d0(int i17) {
        this.f395859a = i17;
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = this.f395862d;
        return java.lang.String.format("tag[%s]type[%d];key[%s];content[%s]", this.f395860b, java.lang.Integer.valueOf(this.f395859a), this.f395861c, jSONObject != null ? jSONObject.toString() : "");
    }
}
