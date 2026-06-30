package uj3;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f428288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f428289b;

    public j(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f428288a = name;
        this.f428289b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3.j)) {
            return false;
        }
        uj3.j jVar = (uj3.j) obj;
        return kotlin.jvm.internal.o.b(this.f428288a, jVar.f428288a) && this.f428289b == jVar.f428289b;
    }

    public int hashCode() {
        return (this.f428288a.hashCode() * 31) + java.lang.Integer.hashCode(this.f428289b);
    }

    public java.lang.String toString() {
        return "MoreItem(name=" + this.f428288a + ", func=" + this.f428289b + ')';
    }
}
