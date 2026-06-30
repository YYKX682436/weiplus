package wi5;

/* loaded from: classes.dex */
public final class g extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f446289b;

    public g(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f446289b = item;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi5.g) && kotlin.jvm.internal.o.b(this.f446289b, ((wi5.g) obj).f446289b);
    }

    public int hashCode() {
        return this.f446289b.hashCode();
    }

    public java.lang.String toString() {
        return "CreateGroupRelatedMoreAction(item=" + this.f446289b + ')';
    }
}
