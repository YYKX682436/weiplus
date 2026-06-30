package q7;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f360306a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f360307b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f360308c;

    public m(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3) {
        this.f360306a = cls;
        this.f360307b = cls2;
        this.f360308c = cls3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q7.m.class != obj.getClass()) {
            return false;
        }
        q7.m mVar = (q7.m) obj;
        return this.f360306a.equals(mVar.f360306a) && this.f360307b.equals(mVar.f360307b) && q7.p.a(this.f360308c, mVar.f360308c);
    }

    public int hashCode() {
        int hashCode = ((this.f360306a.hashCode() * 31) + this.f360307b.hashCode()) * 31;
        java.lang.Class cls = this.f360308c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MultiClassKey{first=" + this.f360306a + ", second=" + this.f360307b + '}';
    }
}
