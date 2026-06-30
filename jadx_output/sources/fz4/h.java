package fz4;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f267309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f267311c;

    public h(android.view.SurfaceView surfaceView, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceView, "surfaceView");
        this.f267309a = surfaceView;
        this.f267310b = i17;
        this.f267311c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz4.h)) {
            return false;
        }
        fz4.h hVar = (fz4.h) obj;
        return kotlin.jvm.internal.o.b(this.f267309a, hVar.f267309a) && this.f267310b == hVar.f267310b && this.f267311c == hVar.f267311c;
    }

    public int hashCode() {
        return (((this.f267309a.hashCode() * 31) + java.lang.Integer.hashCode(this.f267310b)) * 31) + java.lang.Integer.hashCode(this.f267311c);
    }

    public java.lang.String toString() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f267309a + ", left=" + this.f267310b + ", top=" + this.f267311c + ')';
    }
}
