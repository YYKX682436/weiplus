package l56;

/* loaded from: classes13.dex */
public class d implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f316678d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f316679e;

    public d(java.lang.String str, java.lang.String str2) {
        this.f316678d = str;
        this.f316679e = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        l56.d dVar = (l56.d) obj;
        int compareTo = this.f316678d.compareTo(dVar.f316678d);
        return compareTo != 0 ? compareTo : this.f316679e.compareTo(dVar.f316679e);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l56.d)) {
            return false;
        }
        l56.d dVar = (l56.d) obj;
        return dVar.f316678d.equals(this.f316678d) && dVar.f316679e.equals(this.f316679e);
    }

    public int hashCode() {
        return this.f316678d.hashCode() + this.f316679e.hashCode();
    }
}
