package lm2;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f319416a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f319417b;

    public k0(boolean z17, com.tencent.mm.protobuf.g gVar) {
        this.f319416a = z17;
        this.f319417b = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm2.k0)) {
            return false;
        }
        lm2.k0 k0Var = (lm2.k0) obj;
        return this.f319416a == k0Var.f319416a && kotlin.jvm.internal.o.b(this.f319417b, k0Var.f319417b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f319416a) * 31;
        com.tencent.mm.protobuf.g gVar = this.f319417b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public java.lang.String toString() {
        return "BoxRedDotInfo(hasRedDot=" + this.f319416a + ", lastBuffer=" + this.f319417b + ')';
    }
}
