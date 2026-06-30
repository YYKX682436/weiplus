package jc1;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f298903a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f298904b;

    public d(int i17) {
        this(i17, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jc1.d.class == obj.getClass() && this.f298903a == ((jc1.d) obj).f298903a;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f298903a));
    }

    public java.lang.String toString() {
        return "ErrorInfo{errno=" + this.f298903a + ", errMsg='" + this.f298904b + "'}";
    }

    public d(int i17, java.lang.String str) {
        this.f298903a = i17;
        this.f298904b = str;
    }
}
