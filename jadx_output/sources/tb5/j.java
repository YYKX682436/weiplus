package tb5;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f417056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f417057b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f417058c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f417059d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f417060e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f417061f;

    public j(java.util.ArrayList fpsList, java.util.ArrayList refreshList, java.util.ArrayList sensitivityList) {
        kotlin.jvm.internal.o.g(fpsList, "fpsList");
        kotlin.jvm.internal.o.g(refreshList, "refreshList");
        kotlin.jvm.internal.o.g(sensitivityList, "sensitivityList");
        this.f417056a = fpsList;
        this.f417057b = refreshList;
        this.f417058c = sensitivityList;
        this.f417059d = jz5.h.b(new tb5.g(this));
        this.f417060e = jz5.h.b(new tb5.h(this));
        this.f417061f = jz5.h.b(new tb5.i(this));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.j)) {
            return false;
        }
        tb5.j jVar = (tb5.j) obj;
        return kotlin.jvm.internal.o.b(this.f417056a, jVar.f417056a) && kotlin.jvm.internal.o.b(this.f417057b, jVar.f417057b) && kotlin.jvm.internal.o.b(this.f417058c, jVar.f417058c);
    }

    public int hashCode() {
        return (((this.f417056a.hashCode() * 31) + this.f417057b.hashCode()) * 31) + this.f417058c.hashCode();
    }

    public java.lang.String toString() {
        return "scrollFpsInfo{ avgFps:" + ((java.lang.Number) ((jz5.n) this.f417059d).getValue()).doubleValue() + " avgRefresh:" + ((java.lang.Number) ((jz5.n) this.f417060e).getValue()).doubleValue() + " avgSensitivity:" + ((java.lang.Number) ((jz5.n) this.f417061f).getValue()).doubleValue() + '}';
    }
}
