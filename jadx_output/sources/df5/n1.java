package df5;

/* loaded from: classes10.dex */
public final class n1 extends df5.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f232181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.util.List views) {
        super(null);
        kotlin.jvm.internal.o.g(views, "views");
        this.f232181a = views;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.n1) && kotlin.jvm.internal.o.b(this.f232181a, ((df5.n1) obj).f232181a);
    }

    public int hashCode() {
        return this.f232181a.hashCode();
    }

    public java.lang.String toString() {
        return "ShowViews(views=" + this.f232181a + ')';
    }
}
