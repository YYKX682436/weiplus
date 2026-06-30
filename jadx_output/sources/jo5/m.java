package jo5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.SurfaceTexture f300965a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f300966b;

    /* renamed from: c, reason: collision with root package name */
    public long f300967c;

    public m(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, long j17, int i17, kotlin.jvm.internal.i iVar) {
        surfaceTexture = (i17 & 1) != 0 ? null : surfaceTexture;
        surface = (i17 & 2) != 0 ? null : surface;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f300965a = surfaceTexture;
        this.f300966b = surface;
        this.f300967c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo5.m)) {
            return false;
        }
        jo5.m mVar = (jo5.m) obj;
        return kotlin.jvm.internal.o.b(this.f300965a, mVar.f300965a) && kotlin.jvm.internal.o.b(this.f300966b, mVar.f300966b) && this.f300967c == mVar.f300967c;
    }

    public int hashCode() {
        android.graphics.SurfaceTexture surfaceTexture = this.f300965a;
        int hashCode = (surfaceTexture == null ? 0 : surfaceTexture.hashCode()) * 31;
        android.view.Surface surface = this.f300966b;
        return ((hashCode + (surface != null ? surface.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f300967c);
    }

    public java.lang.String toString() {
        return "VoIPMPSurfaceTexture(surfaceTexture=" + this.f300965a + ", surface=" + this.f300966b + ", surfacePtr=" + this.f300967c + ')';
    }
}
