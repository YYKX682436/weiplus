package h40;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f278719a;

    public a(java.lang.String dataId) {
        kotlin.jvm.internal.o.g(dataId, "dataId");
        this.f278719a = dataId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h40.a) && kotlin.jvm.internal.o.b(this.f278719a, ((h40.a) obj).f278719a);
    }

    public int hashCode() {
        return this.f278719a.hashCode();
    }

    public java.lang.String toString() {
        return "ExtInfo(dataId=" + this.f278719a + ')';
    }
}
