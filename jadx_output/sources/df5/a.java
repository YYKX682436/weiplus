package df5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f232039a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f232040b;

    public a(android.view.View view, java.util.List feedItems) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(feedItems, "feedItems");
        this.f232039a = view;
        this.f232040b = feedItems;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.a)) {
            return false;
        }
        df5.a aVar = (df5.a) obj;
        return kotlin.jvm.internal.o.b(this.f232039a, aVar.f232039a) && kotlin.jvm.internal.o.b(this.f232040b, aVar.f232040b);
    }

    public int hashCode() {
        return (this.f232039a.hashCode() * 31) + this.f232040b.hashCode();
    }

    public java.lang.String toString() {
        return "AppendFeedPair(view=" + this.f232039a + ", feedItems=" + this.f232040b + ')';
    }
}
