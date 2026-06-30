package us2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f430480a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.n f430481b;

    public f(int i17, vt3.n followContext) {
        kotlin.jvm.internal.o.g(followContext, "followContext");
        this.f430480a = i17;
        this.f430481b = followContext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(us2.f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.record.improve.cgi.ShootComposingTemplateManager.TabListCacheKey");
        us2.f fVar = (us2.f) obj;
        return this.f430480a == fVar.f430480a && kotlin.jvm.internal.o.b(this.f430481b, fVar.f430481b);
    }

    public int hashCode() {
        return (this.f430480a * 31) + this.f430481b.hashCode();
    }
}
