package jz5;

/* loaded from: classes7.dex */
public final class o implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f302841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f302842e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f302843f;

    public o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f302841d = obj;
        this.f302842e = obj2;
        this.f302843f = obj3;
    }

    public final java.lang.Object a() {
        return this.f302841d;
    }

    public final java.lang.Object b() {
        return this.f302842e;
    }

    public final java.lang.Object c() {
        return this.f302843f;
    }

    public final java.lang.Object d() {
        return this.f302841d;
    }

    public final java.lang.Object e() {
        return this.f302842e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5.o)) {
            return false;
        }
        jz5.o oVar = (jz5.o) obj;
        return kotlin.jvm.internal.o.b(this.f302841d, oVar.f302841d) && kotlin.jvm.internal.o.b(this.f302842e, oVar.f302842e) && kotlin.jvm.internal.o.b(this.f302843f, oVar.f302843f);
    }

    public final java.lang.Object f() {
        return this.f302843f;
    }

    public int hashCode() {
        java.lang.Object obj = this.f302841d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f302842e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f302843f;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "(" + this.f302841d + ", " + this.f302842e + ", " + this.f302843f + ')';
    }
}
