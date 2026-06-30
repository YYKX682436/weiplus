package ey2;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f257321a;

    /* renamed from: b, reason: collision with root package name */
    public final long f257322b;

    public a3(java.util.ArrayList data, long j17, int i17, kotlin.jvm.internal.i iVar) {
        data = (i17 & 1) != 0 ? new java.util.ArrayList() : data;
        kotlin.jvm.internal.o.g(data, "data");
        this.f257321a = data;
        this.f257322b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.a3)) {
            return false;
        }
        ey2.a3 a3Var = (ey2.a3) obj;
        return kotlin.jvm.internal.o.b(this.f257321a, a3Var.f257321a) && this.f257322b == a3Var.f257322b;
    }

    public int hashCode() {
        return (this.f257321a.hashCode() * 31) + java.lang.Long.hashCode(this.f257322b);
    }

    public java.lang.String toString() {
        return "SubTabCache(data=" + this.f257321a + ", timestamp=" + this.f257322b + ')';
    }
}
