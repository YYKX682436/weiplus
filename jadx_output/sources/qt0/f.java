package qt0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f366504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366505b;

    public f(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f366504a = key;
        this.f366505b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt0.f)) {
            return false;
        }
        qt0.f fVar = (qt0.f) obj;
        return kotlin.jvm.internal.o.b(this.f366504a, fVar.f366504a) && this.f366505b == fVar.f366505b;
    }

    public int hashCode() {
        return (this.f366504a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f366505b);
    }

    public java.lang.String toString() {
        return "IndexTaskInfo(key=" + this.f366504a + ", isCreated=" + this.f366505b + ')';
    }
}
