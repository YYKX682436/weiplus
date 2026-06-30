package uq5;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f430236a;

    /* renamed from: b, reason: collision with root package name */
    public int f430237b;

    /* renamed from: c, reason: collision with root package name */
    public long f430238c;

    public h(int i17, int i18, long j17, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        j17 = (i19 & 4) != 0 ? 0L : j17;
        this.f430236a = i17;
        this.f430237b = i18;
        this.f430238c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof uq5.h) {
                uq5.h hVar = (uq5.h) obj;
                if (this.f430236a == hVar.f430236a) {
                    if (this.f430237b == hVar.f430237b) {
                        if (this.f430238c == hVar.f430238c) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i17 = ((this.f430236a * 31) + this.f430237b) * 31;
        long j17 = this.f430238c;
        return i17 + ((int) (j17 ^ (j17 >>> 32)));
    }

    public java.lang.String toString() {
        return "ProfileRecorder(startCount=" + this.f430236a + ", successCount=" + this.f430237b + ", costAvg=" + this.f430238c + ")";
    }
}
