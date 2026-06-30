package pu2;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f358422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358423b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f358424c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f358425d;

    public a(int i17, int i18, org.json.JSONObject resultJson, java.util.Map map) {
        kotlin.jvm.internal.o.g(resultJson, "resultJson");
        this.f358422a = i17;
        this.f358423b = i18;
        this.f358424c = resultJson;
        this.f358425d = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu2.a)) {
            return false;
        }
        pu2.a aVar = (pu2.a) obj;
        return this.f358422a == aVar.f358422a && this.f358423b == aVar.f358423b && kotlin.jvm.internal.o.b(this.f358424c, aVar.f358424c) && kotlin.jvm.internal.o.b(this.f358425d, aVar.f358425d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f358422a) * 31) + java.lang.Integer.hashCode(this.f358423b)) * 31) + this.f358424c.hashCode()) * 31;
        java.util.Map map = this.f358425d;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public java.lang.String toString() {
        return "CollectorReportStruct(type=" + this.f358422a + ", scene=" + this.f358423b + ", resultJson=" + this.f358424c + ", extraData=" + this.f358425d + ')';
    }
}
