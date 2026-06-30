package zu0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f475673a;

    public h(java.lang.Object obj) {
        this.f475673a = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu0.h) && kotlin.jvm.internal.o.b(this.f475673a, ((zu0.h) obj).f475673a);
    }

    public int hashCode() {
        java.lang.Object obj = this.f475673a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "MaterialInfoPack(material=" + this.f475673a + ')';
    }
}
