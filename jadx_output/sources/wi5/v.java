package wi5;

/* loaded from: classes.dex */
public final class v extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final wi5.z f446348b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f446349c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f446350d;

    public v(wi5.z queryActionResult, java.util.HashMap resultMap, java.util.List itemList) {
        kotlin.jvm.internal.o.g(queryActionResult, "queryActionResult");
        kotlin.jvm.internal.o.g(resultMap, "resultMap");
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f446348b = queryActionResult;
        this.f446349c = resultMap;
        this.f446350d = itemList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.v)) {
            return false;
        }
        wi5.v vVar = (wi5.v) obj;
        return kotlin.jvm.internal.o.b(this.f446348b, vVar.f446348b) && kotlin.jvm.internal.o.b(this.f446349c, vVar.f446349c) && kotlin.jvm.internal.o.b(this.f446350d, vVar.f446350d);
    }

    public int hashCode() {
        return (((this.f446348b.hashCode() * 31) + this.f446349c.hashCode()) * 31) + this.f446350d.hashCode();
    }

    public java.lang.String toString() {
        return "SearchEndAction(queryActionResult=" + this.f446348b + ", resultMap=" + this.f446349c + ", itemList=" + this.f446350d + ')';
    }
}
