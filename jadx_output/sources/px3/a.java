package px3;

/* loaded from: classes10.dex */
public final class a extends px3.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f358934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358935b;

    public a(java.util.List list, int i17) {
        super(null);
        this.f358934a = list;
        this.f358935b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px3.a)) {
            return false;
        }
        px3.a aVar = (px3.a) obj;
        return kotlin.jvm.internal.o.b(this.f358934a, aVar.f358934a) && this.f358935b == aVar.f358935b;
    }

    public int hashCode() {
        java.util.List list = this.f358934a;
        return ((list == null ? 0 : list.hashCode()) * 31) + java.lang.Integer.hashCode(this.f358935b);
    }

    public java.lang.String toString() {
        return "Success(exclusiveLists=" + this.f358934a + ", uiState=" + this.f358935b + ')';
    }
}
