package od;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public od.b f344496a;

    /* renamed from: b, reason: collision with root package name */
    public org.json.JSONObject f344497b;

    public java.lang.String toString() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", this.f344496a.name());
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f344497b);
        return new org.json.JSONObject(hashMap).toString();
    }
}
