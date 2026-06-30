package hf2;

/* loaded from: classes10.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Point f281160a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f281161b;

    public r2(android.graphics.Point pos, android.util.Size size) {
        kotlin.jvm.internal.o.g(pos, "pos");
        kotlin.jvm.internal.o.g(size, "size");
        this.f281160a = pos;
        this.f281161b = size;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2.r2)) {
            return false;
        }
        hf2.r2 r2Var = (hf2.r2) obj;
        return kotlin.jvm.internal.o.b(this.f281160a, r2Var.f281160a) && kotlin.jvm.internal.o.b(this.f281161b, r2Var.f281161b);
    }

    public int hashCode() {
        return (this.f281160a.hashCode() * 31) + this.f281161b.hashCode();
    }

    public java.lang.String toString() {
        return "LocationInfo(pos=" + this.f281160a + ", size=" + this.f281161b + ')';
    }
}
