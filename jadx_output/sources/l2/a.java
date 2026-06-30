package l2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f315106a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof l2.a) {
            return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f315106a), java.lang.Float.valueOf(((l2.a) obj).f315106a));
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f315106a);
    }

    public java.lang.String toString() {
        return "BaselineShift(multiplier=" + this.f315106a + ')';
    }
}
