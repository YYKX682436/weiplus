package ye5;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f461264a;

    /* renamed from: b, reason: collision with root package name */
    public final ze5.ma f461265b;

    public j(com.tencent.mm.storage.f9 msgInfo, ze5.ma quoteProvider) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(quoteProvider, "quoteProvider");
        this.f461264a = msgInfo;
        this.f461265b = quoteProvider;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye5.j)) {
            return false;
        }
        ye5.j jVar = (ye5.j) obj;
        return kotlin.jvm.internal.o.b(this.f461264a, jVar.f461264a) && kotlin.jvm.internal.o.b(this.f461265b, jVar.f461265b);
    }

    public int hashCode() {
        return (this.f461264a.hashCode() * 31) + this.f461265b.hashCode();
    }

    public java.lang.String toString() {
        return "MediaQuoteInfo(msgInfo=" + this.f461264a + ", quoteProvider=" + this.f461265b + ')';
    }
}
