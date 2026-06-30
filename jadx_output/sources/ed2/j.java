package ed2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f251271a;

    /* renamed from: b, reason: collision with root package name */
    public final long f251272b;

    /* renamed from: c, reason: collision with root package name */
    public final int f251273c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251274d;

    public j(java.lang.String id6, long j17, int i17, java.lang.String scopeKey) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(scopeKey, "scopeKey");
        this.f251271a = id6;
        this.f251272b = j17;
        this.f251273c = i17;
        this.f251274d = scopeKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed2.j)) {
            return false;
        }
        ed2.j jVar = (ed2.j) obj;
        return kotlin.jvm.internal.o.b(this.f251271a, jVar.f251271a) && this.f251272b == jVar.f251272b && this.f251273c == jVar.f251273c && kotlin.jvm.internal.o.b(this.f251274d, jVar.f251274d);
    }

    public int hashCode() {
        return (((((this.f251271a.hashCode() * 31) + java.lang.Long.hashCode(this.f251272b)) * 31) + java.lang.Integer.hashCode(this.f251273c)) * 31) + this.f251274d.hashCode();
    }

    public java.lang.String toString() {
        return "FinderTips(id=" + this.f251271a + ", feature=" + this.f251272b + ", position=" + this.f251273c + ", scopeKey=" + this.f251274d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String id6, long j17, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this(id6, j17, i17, baseFinderFeed != null ? pm0.v.u(baseFinderFeed.getItemId()) : "global_scope");
        kotlin.jvm.internal.o.g(id6, "id");
    }
}
