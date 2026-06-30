package jz5;

/* loaded from: classes4.dex */
public final class l implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f302833d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f302834e;

    public l(java.lang.Object obj, java.lang.Object obj2) {
        this.f302833d = obj;
        this.f302834e = obj2;
    }

    public final java.lang.Object a() {
        return this.f302833d;
    }

    public final java.lang.Object b() {
        return this.f302834e;
    }

    public final java.lang.Object c() {
        return this.f302833d;
    }

    public final java.lang.Object d() {
        return this.f302834e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5.l)) {
            return false;
        }
        jz5.l lVar = (jz5.l) obj;
        return kotlin.jvm.internal.o.b(this.f302833d, lVar.f302833d) && kotlin.jvm.internal.o.b(this.f302834e, lVar.f302834e);
    }

    public int hashCode() {
        java.lang.Object obj = this.f302833d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f302834e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "(" + this.f302833d + ", " + this.f302834e + ')';
    }
}
