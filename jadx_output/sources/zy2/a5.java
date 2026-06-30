package zy2;

/* loaded from: classes8.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f477347a;

    /* renamed from: b, reason: collision with root package name */
    public final long f477348b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f477349c;

    public a5(java.lang.Object feed, long j17, java.util.List searchableFields) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(searchableFields, "searchableFields");
        this.f477347a = feed;
        this.f477348b = j17;
        this.f477349c = searchableFields;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.a5)) {
            return false;
        }
        zy2.a5 a5Var = (zy2.a5) obj;
        return kotlin.jvm.internal.o.b(this.f477347a, a5Var.f477347a) && this.f477348b == a5Var.f477348b && kotlin.jvm.internal.o.b(this.f477349c, a5Var.f477349c);
    }

    public int hashCode() {
        return (((this.f477347a.hashCode() * 31) + java.lang.Long.hashCode(this.f477348b)) * 31) + this.f477349c.hashCode();
    }

    public java.lang.String toString() {
        return "FinderMsgHistoryGalleryFeedSnapshot(feed=" + this.f477347a + ", itemId=" + this.f477348b + ", searchableFields=" + this.f477349c + ')';
    }
}
