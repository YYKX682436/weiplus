package v11;

/* loaded from: classes11.dex */
public final class n extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List items) {
        super(null);
        kotlin.jvm.internal.o.g(items, "items");
        this.f432444a = items;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.n) && kotlin.jvm.internal.o.b(this.f432444a, ((v11.n) obj).f432444a);
    }

    public int hashCode() {
        return this.f432444a.hashCode();
    }

    public java.lang.String toString() {
        return "ListBlock(items=" + this.f432444a + ')';
    }
}
