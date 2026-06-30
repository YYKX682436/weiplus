package e1;

/* loaded from: classes14.dex */
public final class k0 extends e1.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.g f246277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d1.g rect) {
        super(null);
        kotlin.jvm.internal.o.g(rect, "rect");
        this.f246277a = rect;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1.k0) {
            return kotlin.jvm.internal.o.b(this.f246277a, ((e1.k0) obj).f246277a);
        }
        return false;
    }

    public int hashCode() {
        return this.f246277a.hashCode();
    }
}
