package ix3;

/* loaded from: classes10.dex */
public final class l1 extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.x1 f295479d;

    /* renamed from: e, reason: collision with root package name */
    public final int f295480e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f295481f;

    public l1(com.tencent.mm.vfs.x1 fileEntry, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(fileEntry, "fileEntry");
        this.f295479d = fileEntry;
        this.f295480e = i17;
        this.f295481f = z17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ix3.l1 other = (ix3.l1) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f295479d.f213232b, other.f295479d.f213232b);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ix3.l1 other = (ix3.l1) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f295480e, other.f295480e);
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String name = this.f295479d.f213232b;
        kotlin.jvm.internal.o.f(name, "name");
        return name;
    }
}
