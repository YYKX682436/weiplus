package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f125918a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f125919b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f125920c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125921d;

    public v0(long j17, java.lang.String query, java.lang.String requestId, java.lang.String hotWordId) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(hotWordId, "hotWordId");
        this.f125918a = j17;
        this.f125919b = query;
        this.f125920c = requestId;
        this.f125921d = hotWordId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.search.v0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.search.v0 v0Var = (com.tencent.mm.plugin.finder.search.v0) obj;
        return this.f125918a == v0Var.f125918a && kotlin.jvm.internal.o.b(this.f125919b, v0Var.f125919b) && kotlin.jvm.internal.o.b(this.f125920c, v0Var.f125920c) && kotlin.jvm.internal.o.b(this.f125921d, v0Var.f125921d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f125918a) * 31) + this.f125919b.hashCode()) * 31) + this.f125920c.hashCode()) * 31) + this.f125921d.hashCode();
    }

    public java.lang.String toString() {
        return "ReportData(id=" + this.f125918a + ", query=" + this.f125919b + ", requestId=" + this.f125920c + ", hotWordId=" + this.f125921d + ')';
    }
}
