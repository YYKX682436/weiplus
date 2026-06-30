package ey2;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257427a;

    public l2(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f257427a = key;
        new java.util.LinkedList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.l2) && kotlin.jvm.internal.o.b(this.f257427a, ((ey2.l2) obj).f257427a);
    }

    public int hashCode() {
        return this.f257427a.hashCode();
    }

    public java.lang.String toString() {
        return "Cache(key=" + this.f257427a + ')';
    }
}
