package n4;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334872a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334873b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f334874c;

    public f(java.lang.String str, boolean z17, java.util.List list) {
        this.f334872a = str;
        this.f334873b = z17;
        this.f334874c = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.f.class != obj.getClass()) {
            return false;
        }
        n4.f fVar = (n4.f) obj;
        if (this.f334873b != fVar.f334873b || !this.f334874c.equals(fVar.f334874c)) {
            return false;
        }
        java.lang.String str = this.f334872a;
        boolean startsWith = str.startsWith("index_");
        java.lang.String str2 = fVar.f334872a;
        return startsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public int hashCode() {
        java.lang.String str = this.f334872a;
        return ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f334873b ? 1 : 0)) * 31) + this.f334874c.hashCode();
    }

    public java.lang.String toString() {
        return "Index{name='" + this.f334872a + "', unique=" + this.f334873b + ", columns=" + this.f334874c + '}';
    }
}
