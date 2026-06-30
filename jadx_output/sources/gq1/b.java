package gq1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public gq1.d f274494a = null;

    /* renamed from: b, reason: collision with root package name */
    public double f274495b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f274496c = "";

    public boolean equals(java.lang.Object obj) {
        gq1.d dVar = this.f274494a;
        if (dVar == null || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return java.util.Arrays.equals(((gq1.b) obj).f274494a.f274500b.f274537c, dVar.f274500b.f274537c);
    }

    public int hashCode() {
        gq1.d dVar = this.f274494a;
        if (dVar == null) {
            return 0;
        }
        return java.util.Arrays.hashCode(dVar.f274500b.f274537c);
    }
}
