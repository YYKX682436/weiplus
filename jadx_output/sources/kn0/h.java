package kn0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309554a;

    public h(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f309554a = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn0.h) && kotlin.jvm.internal.o.b(this.f309554a, ((kn0.h) obj).f309554a);
    }

    public int hashCode() {
        return this.f309554a.hashCode();
    }

    public java.lang.String toString() {
        return "LiveRoomJumpInfo(name=" + this.f309554a + ')';
    }
}
