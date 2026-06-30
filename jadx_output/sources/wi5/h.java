package wi5;

/* loaded from: classes.dex */
public final class h extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f446291b;

    public h(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f446291b = item;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi5.h) && kotlin.jvm.internal.o.b(this.f446291b, ((wi5.h) obj).f446291b);
    }

    public int hashCode() {
        return this.f446291b.hashCode();
    }

    public java.lang.String toString() {
        return "CreateGroupSelectHeaderAction(item=" + this.f446291b + ')';
    }
}
