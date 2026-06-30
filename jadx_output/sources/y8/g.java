package y8;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f459814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f459815b;

    public g(java.lang.String str, boolean z17) {
        this.f459814a = str;
        this.f459815b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != y8.g.class) {
            return false;
        }
        y8.g gVar = (y8.g) obj;
        return android.text.TextUtils.equals(this.f459814a, gVar.f459814a) && this.f459815b == gVar.f459815b;
    }

    public int hashCode() {
        java.lang.String str = this.f459814a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f459815b ? 1231 : 1237);
    }
}
