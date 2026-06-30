package nz0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f341497a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f341498b;

    public e(long j17, java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f341497a = j17;
        this.f341498b = dataList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz0.e)) {
            return false;
        }
        nz0.e eVar = (nz0.e) obj;
        return this.f341497a == eVar.f341497a && kotlin.jvm.internal.o.b(this.f341498b, eVar.f341498b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f341497a) * 31) + this.f341498b.hashCode();
    }

    public java.lang.String toString() {
        return "CachedTemplateListInfo(expireTime=" + this.f341497a + ", dataList=" + this.f341498b + ')';
    }
}
