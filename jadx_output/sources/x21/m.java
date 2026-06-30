package x21;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f451551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451552b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f451553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f451554d;

    /* renamed from: e, reason: collision with root package name */
    public final long f451555e;

    /* renamed from: f, reason: collision with root package name */
    public final float f451556f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f451557g;

    public m(java.lang.String filePath, int i17, java.nio.ByteBuffer bufferData, int i18, long j17, float f17, boolean z17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(bufferData, "bufferData");
        this.f451551a = filePath;
        this.f451552b = i17;
        this.f451553c = bufferData;
        this.f451554d = i18;
        this.f451555e = j17;
        this.f451556f = f17;
        this.f451557g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x21.m)) {
            return false;
        }
        x21.m mVar = (x21.m) obj;
        return kotlin.jvm.internal.o.b(this.f451551a, mVar.f451551a) && this.f451552b == mVar.f451552b && kotlin.jvm.internal.o.b(this.f451553c, mVar.f451553c) && this.f451554d == mVar.f451554d && this.f451555e == mVar.f451555e && java.lang.Float.compare(this.f451556f, mVar.f451556f) == 0 && this.f451557g == mVar.f451557g;
    }

    public int hashCode() {
        return (((((((((((this.f451551a.hashCode() * 31) + java.lang.Integer.hashCode(this.f451552b)) * 31) + this.f451553c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f451554d)) * 31) + java.lang.Long.hashCode(this.f451555e)) * 31) + java.lang.Float.hashCode(this.f451556f)) * 31) + java.lang.Boolean.hashCode(this.f451557g);
    }

    public java.lang.String toString() {
        return "RawAudioInfo(filePath=" + this.f451551a + ", indexPos=" + this.f451552b + ", bufferData=" + this.f451553c + ", sampleRate=" + this.f451554d + ", pts=" + this.f451555e + ", progress=" + this.f451556f + ", comp=" + this.f451557g + ')';
    }
}
