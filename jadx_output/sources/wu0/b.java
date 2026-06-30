package wu0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f449650a;

    /* renamed from: b, reason: collision with root package name */
    public final float f449651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f449652c;

    public b(float f17, float f18, boolean z17) {
        this.f449650a = f17;
        this.f449651b = f18;
        this.f449652c = z17;
    }

    public static wu0.b a(wu0.b bVar, float f17, float f18, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = bVar.f449650a;
        }
        if ((i17 & 2) != 0) {
            f18 = bVar.f449651b;
        }
        if ((i17 & 4) != 0) {
            z17 = bVar.f449652c;
        }
        bVar.getClass();
        return new wu0.b(f17, f18, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0.b)) {
            return false;
        }
        wu0.b bVar = (wu0.b) obj;
        return java.lang.Float.compare(this.f449650a, bVar.f449650a) == 0 && java.lang.Float.compare(this.f449651b, bVar.f449651b) == 0 && this.f449652c == bVar.f449652c;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f449650a) * 31) + java.lang.Float.hashCode(this.f449651b)) * 31) + java.lang.Boolean.hashCode(this.f449652c);
    }

    public java.lang.String toString() {
        return "ProgressData(buildProgress=" + this.f449650a + ", serviceProgress=" + this.f449651b + ", isRecorded=" + this.f449652c + ')';
    }

    public /* synthetic */ b(float f17, float f18, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? false : z17);
    }
}
