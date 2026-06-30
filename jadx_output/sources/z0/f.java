package z0;

/* loaded from: classes5.dex */
public final class f implements z0.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f468905a;

    public f(float f17) {
        this.f468905a = f17;
    }

    public int a(int i17, int i18) {
        return a06.d.b(((i18 - i17) / 2.0f) * (1 + this.f468905a));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0.f) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f468905a), java.lang.Float.valueOf(((z0.f) obj).f468905a));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f468905a);
    }

    public java.lang.String toString() {
        return "Vertical(bias=" + this.f468905a + ')';
    }
}
