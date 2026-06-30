package kd2;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f306756a;

    /* renamed from: b, reason: collision with root package name */
    public long f306757b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f306758c;

    public i0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f306756a = feed;
        this.f306757b = j17;
        this.f306758c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2.i0)) {
            return false;
        }
        kd2.i0 i0Var = (kd2.i0) obj;
        return kotlin.jvm.internal.o.b(this.f306756a, i0Var.f306756a) && this.f306757b == i0Var.f306757b && this.f306758c == i0Var.f306758c;
    }

    public int hashCode() {
        return (((this.f306756a.hashCode() * 31) + java.lang.Long.hashCode(this.f306757b)) * 31) + java.lang.Boolean.hashCode(this.f306758c);
    }

    public java.lang.String toString() {
        return "CurFeedInfo(feed=" + this.f306756a + ", progress=" + this.f306757b + ", hasUpdateRecoverData=" + this.f306758c + ')';
    }
}
