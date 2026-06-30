package dz4;

/* loaded from: classes8.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final o72.r2 f245160a;

    /* renamed from: b, reason: collision with root package name */
    public final long f245161b;

    public a2(o72.r2 favItemInfo, long j17) {
        kotlin.jvm.internal.o.g(favItemInfo, "favItemInfo");
        this.f245160a = favItemInfo;
        this.f245161b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.a2)) {
            return false;
        }
        dz4.a2 a2Var = (dz4.a2) obj;
        return kotlin.jvm.internal.o.b(this.f245160a, a2Var.f245160a) && this.f245161b == a2Var.f245161b;
    }

    public int hashCode() {
        return (this.f245160a.hashCode() * 31) + java.lang.Long.hashCode(this.f245161b);
    }

    public java.lang.String toString() {
        return "ForwardData(favItemInfo=" + this.f245160a + ", localId=" + this.f245161b + ')';
    }
}
