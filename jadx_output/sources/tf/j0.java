package tf;

/* loaded from: classes7.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture.OnFrameAvailableListener f418830a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f418831b;

    public j0(android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        this.f418830a = onFrameAvailableListener;
        this.f418831b = handler;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tf.j0.class != obj.getClass()) {
            return false;
        }
        return this.f418830a.equals(((tf.j0) obj).f418830a);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f418830a);
    }
}
