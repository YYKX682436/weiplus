package fu2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f266874a;

    /* renamed from: b, reason: collision with root package name */
    public int f266875b;

    /* renamed from: c, reason: collision with root package name */
    public float f266876c;

    public b(long j17, int i17, float f17, int i18, kotlin.jvm.internal.i iVar) {
        f17 = (i18 & 4) != 0 ? 1.0f : f17;
        this.f266874a = j17;
        this.f266875b = i17;
        this.f266876c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2.b)) {
            return false;
        }
        fu2.b bVar = (fu2.b) obj;
        return this.f266874a == bVar.f266874a && this.f266875b == bVar.f266875b && java.lang.Float.compare(this.f266876c, bVar.f266876c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f266874a) * 31) + java.lang.Integer.hashCode(this.f266875b)) * 31) + java.lang.Float.hashCode(this.f266876c);
    }

    public java.lang.String toString() {
        return "StatusData(currentPlayMs=" + this.f266874a + ", currentSystemState=" + this.f266875b + ", playbackSpeed=" + this.f266876c + ')';
    }
}
