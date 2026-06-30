package q04;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f359402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359403b;

    /* renamed from: c, reason: collision with root package name */
    public final o04.p f359404c;

    public t(java.lang.String id6, int i17, o04.p listener) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f359402a = id6;
        this.f359403b = i17;
        this.f359404c = listener;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q04.t)) {
            return false;
        }
        q04.t tVar = (q04.t) obj;
        return kotlin.jvm.internal.o.b(this.f359402a, tVar.f359402a) && this.f359403b == tVar.f359403b && kotlin.jvm.internal.o.b(this.f359404c, tVar.f359404c);
    }

    public int hashCode() {
        return (((this.f359402a.hashCode() * 31) + java.lang.Integer.hashCode(this.f359403b)) * 31) + this.f359404c.hashCode();
    }

    public java.lang.String toString() {
        return "RecoveryData(id=" + this.f359402a + ", type=" + this.f359403b + ", listener=" + this.f359404c + ')';
    }
}
