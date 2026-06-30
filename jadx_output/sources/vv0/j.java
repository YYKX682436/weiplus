package vv0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440382b;

    public j(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f440381a = name;
        this.f440382b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.j)) {
            return false;
        }
        vv0.j jVar = (vv0.j) obj;
        return kotlin.jvm.internal.o.b(this.f440381a, jVar.f440381a) && this.f440382b == jVar.f440382b;
    }

    public int hashCode() {
        return (this.f440381a.hashCode() * 31) + java.lang.Integer.hashCode(this.f440382b);
    }

    public java.lang.String toString() {
        return "FilterCategoryInfo(name=" + this.f440381a + ", id=" + this.f440382b + ')';
    }
}
