package ma0;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f325132a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f325133b;

    public e(ma0.h hVar) {
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ma0.e)) {
            return super.equals(obj);
        }
        ma0.e eVar = (ma0.e) obj;
        return kotlin.jvm.internal.o.b(this.f325132a, eVar.f325132a) && kotlin.jvm.internal.o.b(this.f325133b, eVar.f325133b);
    }

    public int hashCode() {
        java.lang.String str = this.f325132a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f325133b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
