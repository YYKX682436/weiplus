package df5;

/* loaded from: classes5.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f232185a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f232186b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f232187c;

    public p1(java.util.List appendedViews, java.util.List queueItems, java.util.List appendFeedPairs) {
        kotlin.jvm.internal.o.g(appendedViews, "appendedViews");
        kotlin.jvm.internal.o.g(queueItems, "queueItems");
        kotlin.jvm.internal.o.g(appendFeedPairs, "appendFeedPairs");
        this.f232185a = appendedViews;
        this.f232186b = queueItems;
        this.f232187c = appendFeedPairs;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.p1)) {
            return false;
        }
        df5.p1 p1Var = (df5.p1) obj;
        return kotlin.jvm.internal.o.b(this.f232185a, p1Var.f232185a) && kotlin.jvm.internal.o.b(this.f232186b, p1Var.f232186b) && kotlin.jvm.internal.o.b(this.f232187c, p1Var.f232187c);
    }

    public int hashCode() {
        return (((this.f232185a.hashCode() * 31) + this.f232186b.hashCode()) * 31) + this.f232187c.hashCode();
    }

    public java.lang.String toString() {
        return "StreamDiffResult(appendedViews=" + this.f232185a + ", queueItems=" + this.f232186b + ", appendFeedPairs=" + this.f232187c + ')';
    }
}
