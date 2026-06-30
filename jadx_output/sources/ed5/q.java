package ed5;

/* loaded from: classes5.dex */
public final class q extends ed5.s {

    /* renamed from: a, reason: collision with root package name */
    public final long f251378a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f251379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, android.view.View anchorView) {
        super(null);
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        this.f251378a = j17;
        this.f251379b = anchorView;
    }

    @Override // ed5.s
    public android.view.View a() {
        return this.f251379b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.q)) {
            return false;
        }
        ed5.q qVar = (ed5.q) obj;
        return this.f251378a == qVar.f251378a && kotlin.jvm.internal.o.b(this.f251379b, qVar.f251379b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f251378a) * 31) + this.f251379b.hashCode();
    }

    public java.lang.String toString() {
        return "ContentItem(createTime=" + this.f251378a + ", anchorView=" + this.f251379b + ')';
    }
}
