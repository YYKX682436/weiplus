package z7;

/* loaded from: classes16.dex */
public class k extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470488d;

    public k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("string is null");
        }
        this.f470488d = str;
    }

    @Override // z7.l
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.k.class == obj.getClass()) {
            return this.f470488d.equals(((z7.k) obj).f470488d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        java.io.Writer writer = mVar.f470497a;
        writer.write(34);
        mVar.d(this.f470488d);
        writer.write(34);
    }

    @Override // z7.l
    public int hashCode() {
        return this.f470488d.hashCode();
    }
}
