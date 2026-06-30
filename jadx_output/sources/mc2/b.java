package mc2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final mc2.a f325615c = new mc2.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f325616a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.j03 f325617b;

    public b(int i17, r45.j03 ext) {
        kotlin.jvm.internal.o.g(ext, "ext");
        this.f325616a = i17;
        this.f325617b = ext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc2.b)) {
            return false;
        }
        mc2.b bVar = (mc2.b) obj;
        return this.f325616a == bVar.f325616a && kotlin.jvm.internal.o.b(this.f325617b, bVar.f325617b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f325616a) * 31) + this.f325617b.hashCode();
    }

    public java.lang.String toString() {
        return "FinderTipsShowTabExt(tabType=" + this.f325616a + ", ext=" + this.f325617b + ')';
    }
}
