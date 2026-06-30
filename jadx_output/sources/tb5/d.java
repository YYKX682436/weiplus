package tb5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f417038a;

    /* renamed from: b, reason: collision with root package name */
    public float f417039b;

    /* renamed from: c, reason: collision with root package name */
    public float f417040c;

    /* renamed from: d, reason: collision with root package name */
    public long f417041d;

    public d(float f17, float f18, float f19, long j17) {
        this.f417038a = f17;
        this.f417039b = f18;
        this.f417040c = f19;
        this.f417041d = j17;
    }

    public static tb5.d a(tb5.d dVar, float f17, float f18, float f19, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = dVar.f417038a;
        }
        if ((i17 & 2) != 0) {
            f18 = dVar.f417039b;
        }
        float f27 = f18;
        if ((i17 & 4) != 0) {
            f19 = dVar.f417040c;
        }
        float f28 = f19;
        if ((i17 & 8) != 0) {
            j17 = dVar.f417041d;
        }
        dVar.getClass();
        return new tb5.d(f17, f27, f28, j17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.d)) {
            return false;
        }
        tb5.d dVar = (tb5.d) obj;
        return java.lang.Float.compare(this.f417038a, dVar.f417038a) == 0 && java.lang.Float.compare(this.f417039b, dVar.f417039b) == 0 && java.lang.Float.compare(this.f417040c, dVar.f417040c) == 0 && this.f417041d == dVar.f417041d;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f417038a) * 31) + java.lang.Float.hashCode(this.f417039b)) * 31) + java.lang.Float.hashCode(this.f417040c)) * 31) + java.lang.Long.hashCode(this.f417041d);
    }

    public java.lang.String toString() {
        return "FpsInfo(fps=" + this.f417038a + ", refresh=" + this.f417039b + ", sensitivity=" + this.f417040c + ", animTime=" + this.f417041d + ')';
    }

    public /* synthetic */ d(float f17, float f18, float f19, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) == 0 ? f19 : 0.0f, (i17 & 8) != 0 ? 0L : j17);
    }
}
