package so5;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.Size f410792a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f410793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410794c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f410795d;

    public b(android.util.Size realFrameSize, android.util.Size frameSize, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(realFrameSize, "realFrameSize");
        kotlin.jvm.internal.o.g(frameSize, "frameSize");
        this.f410792a = realFrameSize;
        this.f410793b = frameSize;
        this.f410794c = i17;
        this.f410795d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.b)) {
            return false;
        }
        so5.b bVar = (so5.b) obj;
        return kotlin.jvm.internal.o.b(this.f410792a, bVar.f410792a) && kotlin.jvm.internal.o.b(this.f410793b, bVar.f410793b) && this.f410794c == bVar.f410794c && this.f410795d == bVar.f410795d;
    }

    public int hashCode() {
        return (((((this.f410792a.hashCode() * 31) + this.f410793b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410794c)) * 31) + java.lang.Boolean.hashCode(this.f410795d);
    }

    public java.lang.String toString() {
        return "DecoderFrameInfo(realFrameSize=" + this.f410792a + ", frameSize=" + this.f410793b + ", rotateInDegree=" + this.f410794c + ", isLandscapeMode=" + this.f410795d + ')';
    }
}
