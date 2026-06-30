package zh1;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zh1.y0 f472863a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f472864b;

    public b0(zh1.y0 type, boolean z17) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f472863a = type;
        this.f472864b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh1.b0)) {
            return false;
        }
        zh1.b0 b0Var = (zh1.b0) obj;
        return this.f472863a == b0Var.f472863a && this.f472864b == b0Var.f472864b;
    }

    public int hashCode() {
        return (this.f472863a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f472864b);
    }

    public java.lang.String toString() {
        return "EnhanceState(type=" + this.f472863a + ", hidden=" + this.f472864b + ')';
    }
}
