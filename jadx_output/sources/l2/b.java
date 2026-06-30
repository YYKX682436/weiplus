package l2;

/* loaded from: classes14.dex */
public final class b implements l2.l {

    /* renamed from: b, reason: collision with root package name */
    public final long f315107b;

    public b(long j17, kotlin.jvm.internal.i iVar) {
        this.f315107b = j17;
        if (!(j17 != e1.y.f246320k)) {
            throw new java.lang.IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    @Override // l2.l
    public long a() {
        return this.f315107b;
    }

    @Override // l2.l
    public l2.l b(yz5.a other) {
        kotlin.jvm.internal.o.g(other, "other");
        return !kotlin.jvm.internal.o.b(this, l2.j.f315122b) ? this : (l2.l) other.invoke();
    }

    @Override // l2.l
    public l2.l c(l2.l lVar) {
        return l2.i.a(this, lVar);
    }

    @Override // l2.l
    public e1.r d() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2.b) && e1.y.c(this.f315107b, ((l2.b) obj).f315107b);
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return java.lang.Long.hashCode(this.f315107b);
    }

    public java.lang.String toString() {
        return "ColorStyle(value=" + ((java.lang.Object) e1.y.i(this.f315107b)) + ')';
    }
}
