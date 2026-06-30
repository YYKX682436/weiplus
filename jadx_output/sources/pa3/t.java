package pa3;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f353007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f353008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f353009c;

    public t(android.view.SurfaceView surfaceView, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceView, "surfaceView");
        this.f353007a = surfaceView;
        this.f353008b = i17;
        this.f353009c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3.t)) {
            return false;
        }
        pa3.t tVar = (pa3.t) obj;
        return kotlin.jvm.internal.o.b(this.f353007a, tVar.f353007a) && this.f353008b == tVar.f353008b && this.f353009c == tVar.f353009c;
    }

    public int hashCode() {
        return (((this.f353007a.hashCode() * 31) + java.lang.Integer.hashCode(this.f353008b)) * 31) + java.lang.Integer.hashCode(this.f353009c);
    }

    public java.lang.String toString() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f353007a + ", left=" + this.f353008b + ", top=" + this.f353009c + ')';
    }
}
