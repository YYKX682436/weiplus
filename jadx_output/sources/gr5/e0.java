package gr5;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final gr5.e0 f274917c;

    /* renamed from: a, reason: collision with root package name */
    public final int f274918a;

    /* renamed from: b, reason: collision with root package name */
    public final gr5.c0 f274919b;

    static {
        gr5.c0.f274912a.getClass();
        f274917c = new gr5.e0(3, gr5.b0.f274911b);
    }

    public e0(int i17, gr5.c0 decider) {
        kotlin.jvm.internal.o.g(decider, "decider");
        this.f274918a = i17;
        this.f274919b = decider;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.e0)) {
            return false;
        }
        gr5.e0 e0Var = (gr5.e0) obj;
        return this.f274918a == e0Var.f274918a && kotlin.jvm.internal.o.b(this.f274919b, e0Var.f274919b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f274918a) * 31) + this.f274919b.hashCode();
    }

    public java.lang.String toString() {
        return "ReadMode(sizeType=" + this.f274918a + ", decider=" + this.f274919b + ')';
    }
}
