package ey2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final e06.k f257428a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.n f257429b;

    public m(e06.k range, ey2.n type) {
        kotlin.jvm.internal.o.g(range, "range");
        kotlin.jvm.internal.o.g(type, "type");
        this.f257428a = range;
        this.f257429b = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.m)) {
            return false;
        }
        ey2.m mVar = (ey2.m) obj;
        return kotlin.jvm.internal.o.b(this.f257428a, mVar.f257428a) && this.f257429b == mVar.f257429b;
    }

    public int hashCode() {
        return (this.f257428a.hashCode() * 31) + this.f257429b.hashCode();
    }

    public java.lang.String toString() {
        return "FeedListChange(range=" + this.f257428a + ", type=" + this.f257429b + ')';
    }
}
