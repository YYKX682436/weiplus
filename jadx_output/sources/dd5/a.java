package dd5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.b5 f229081a;

    public a(zy2.b5 views) {
        kotlin.jvm.internal.o.g(views, "views");
        this.f229081a = views;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd5.a) && kotlin.jvm.internal.o.b(this.f229081a, ((dd5.a) obj).f229081a);
    }

    public int hashCode() {
        return this.f229081a.hashCode();
    }

    public java.lang.String toString() {
        return "FinderFeedGalleryBinding(views=" + this.f229081a + ')';
    }
}
