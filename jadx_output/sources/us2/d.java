package us2;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f430476a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.n f430477b;

    public d(long j17, vt3.n followContext) {
        kotlin.jvm.internal.o.g(followContext, "followContext");
        this.f430476a = j17;
        this.f430477b = followContext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(us2.d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.record.improve.cgi.ShootComposingTemplateManager.TabCacheKey");
        us2.d dVar = (us2.d) obj;
        return this.f430476a == dVar.f430476a && kotlin.jvm.internal.o.b(this.f430477b, dVar.f430477b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f430476a) * 31) + this.f430477b.hashCode();
    }

    public java.lang.String toString() {
        return "TabCacheKey(tabId=" + this.f430476a + ", followContext=" + this.f430477b + ')';
    }
}
