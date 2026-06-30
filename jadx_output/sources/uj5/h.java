package uj5;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.SurfaceView f428456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f428457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428458c;

    public h(android.view.SurfaceView surfaceView, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceView, "surfaceView");
        this.f428456a = surfaceView;
        this.f428457b = i17;
        this.f428458c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj5.h)) {
            return false;
        }
        uj5.h hVar = (uj5.h) obj;
        return kotlin.jvm.internal.o.b(this.f428456a, hVar.f428456a) && this.f428457b == hVar.f428457b && this.f428458c == hVar.f428458c;
    }

    public int hashCode() {
        return (((this.f428456a.hashCode() * 31) + java.lang.Integer.hashCode(this.f428457b)) * 31) + java.lang.Integer.hashCode(this.f428458c);
    }

    public java.lang.String toString() {
        return "InnerSurfaceViewWrapper(surfaceView=" + this.f428456a + ", left=" + this.f428457b + ", top=" + this.f428458c + ')';
    }
}
