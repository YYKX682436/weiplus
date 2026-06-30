package q9;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f360853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360854b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f360855c;

    public f(int i17, int i18, java.lang.String str) {
        this.f360853a = i17;
        this.f360854b = i18;
        this.f360855c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q9.f.class != obj.getClass()) {
            return false;
        }
        q9.f fVar = (q9.f) obj;
        return this.f360853a == fVar.f360853a && this.f360854b == fVar.f360854b && android.text.TextUtils.equals(this.f360855c, fVar.f360855c);
    }

    public int hashCode() {
        int i17 = ((this.f360853a * 31) + this.f360854b) * 31;
        java.lang.String str = this.f360855c;
        return i17 + (str != null ? str.hashCode() : 0);
    }
}
