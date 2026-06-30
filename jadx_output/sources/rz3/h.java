package rz3;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f401812a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f401813b;

    public h(int i17, java.lang.Object obj) {
        this.f401812a = i17;
        this.f401813b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz3.h)) {
            return false;
        }
        rz3.h hVar = (rz3.h) obj;
        return this.f401812a == hVar.f401812a && kotlin.jvm.internal.o.b(this.f401813b, hVar.f401813b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f401812a) * 31;
        java.lang.Object obj = this.f401813b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "ScanCodeProductMergeData(type=" + this.f401812a + ", data=" + this.f401813b + ')';
    }
}
