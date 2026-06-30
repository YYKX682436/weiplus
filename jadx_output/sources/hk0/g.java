package hk0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.e f281734a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.e f281735b;

    public g(hk0.e doodleBean, hk0.e lastDoodleBean) {
        kotlin.jvm.internal.o.g(doodleBean, "doodleBean");
        kotlin.jvm.internal.o.g(lastDoodleBean, "lastDoodleBean");
        this.f281734a = doodleBean;
        this.f281735b = lastDoodleBean;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.g)) {
            return false;
        }
        hk0.g gVar = (hk0.g) obj;
        return kotlin.jvm.internal.o.b(this.f281734a, gVar.f281734a) && kotlin.jvm.internal.o.b(this.f281735b, gVar.f281735b);
    }

    public int hashCode() {
        return (this.f281734a.hashCode() * 31) + this.f281735b.hashCode();
    }

    public java.lang.String toString() {
        return "DoodleState(doodleBean=" + this.f281734a + ", lastDoodleBean=" + this.f281735b + ')';
    }
}
