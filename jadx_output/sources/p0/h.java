package p0;

/* loaded from: classes16.dex */
public final class h extends j75.b {

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f350346k;

    public h(java.util.List excludeList) {
        kotlin.jvm.internal.o.g(excludeList, "excludeList");
        this.f350346k = excludeList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0.h) && kotlin.jvm.internal.o.b(this.f350346k, ((p0.h) obj).f350346k);
    }

    public int hashCode() {
        return this.f350346k.hashCode();
    }

    public java.lang.String toString() {
        return "UpdateExcludeListAction(excludeList=" + this.f350346k + ')';
    }
}
