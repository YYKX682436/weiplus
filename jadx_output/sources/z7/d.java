package z7;

/* loaded from: classes16.dex */
public class d extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470468d;

    public d(java.lang.String str) {
        this.f470468d = str;
        "null".equals(str);
        "true".equals(str);
        "false".equals(str);
    }

    @Override // z7.l
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.d.class == obj.getClass()) {
            return this.f470468d.equals(((z7.d) obj).f470468d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.f470497a.write(this.f470468d);
    }

    @Override // z7.l
    public int hashCode() {
        return this.f470468d.hashCode();
    }

    @Override // z7.l
    public java.lang.String toString() {
        return this.f470468d;
    }
}
