package dk2;

/* loaded from: classes3.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.c04 f234424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f234425b;

    public z7(r45.c04 wishConfig, boolean z17) {
        kotlin.jvm.internal.o.g(wishConfig, "wishConfig");
        this.f234424a = wishConfig;
        this.f234425b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.z7)) {
            return false;
        }
        dk2.z7 z7Var = (dk2.z7) obj;
        return kotlin.jvm.internal.o.b(this.f234424a, z7Var.f234424a) && this.f234425b == z7Var.f234425b;
    }

    public int hashCode() {
        return (this.f234424a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f234425b);
    }

    public java.lang.String toString() {
        return "FinderLiveInteractionWishInfo(wishConfig=" + this.f234424a + ", enableFlag=" + this.f234425b + ')';
    }
}
