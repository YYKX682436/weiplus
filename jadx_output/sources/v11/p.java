package v11;

/* loaded from: classes11.dex */
public final class p extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.List runs) {
        super(null);
        kotlin.jvm.internal.o.g(runs, "runs");
        this.f432453a = runs;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.p) && kotlin.jvm.internal.o.b(this.f432453a, ((v11.p) obj).f432453a);
    }

    public int hashCode() {
        return this.f432453a.hashCode();
    }

    public java.lang.String toString() {
        return "Paragraph(runs=" + this.f432453a + ')';
    }
}
