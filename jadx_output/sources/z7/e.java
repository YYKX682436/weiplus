package z7;

/* loaded from: classes16.dex */
public class e extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470469d;

    public e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("string is null");
        }
        this.f470469d = str;
    }

    @Override // z7.l
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.e.class == obj.getClass()) {
            return this.f470469d.equals(((z7.e) obj).f470469d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.f470497a.write(this.f470469d);
    }

    @Override // z7.l
    public int hashCode() {
        return this.f470469d.hashCode();
    }

    @Override // z7.l
    public java.lang.String toString() {
        return this.f470469d;
    }
}
