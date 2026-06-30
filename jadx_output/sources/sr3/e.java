package sr3;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f411845a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f411846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f411847c;

    public e(androidx.fragment.app.Fragment fragment, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f411845a = fragment;
        this.f411846b = str;
        this.f411847c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.e)) {
            return false;
        }
        sr3.e eVar = (sr3.e) obj;
        return kotlin.jvm.internal.o.b(this.f411845a, eVar.f411845a) && kotlin.jvm.internal.o.b(this.f411846b, eVar.f411846b) && this.f411847c == eVar.f411847c;
    }

    public int hashCode() {
        int hashCode = this.f411845a.hashCode() * 31;
        java.lang.String str = this.f411846b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f411847c);
    }

    public java.lang.String toString() {
        return "FragmentWithTabText(fragment=" + this.f411845a + ", tabText=" + this.f411846b + ", tabType=" + this.f411847c + ')';
    }
}
