package ro5;

/* loaded from: classes11.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f398191a;

    /* renamed from: b, reason: collision with root package name */
    public final dp5.f f398192b;

    public f0(android.graphics.SurfaceTexture surfaceTexture, dp5.f texObj) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        kotlin.jvm.internal.o.g(texObj, "texObj");
        this.f398191a = surfaceTexture;
        this.f398192b = texObj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.f0)) {
            return false;
        }
        ro5.f0 f0Var = (ro5.f0) obj;
        return kotlin.jvm.internal.o.b(this.f398191a, f0Var.f398191a) && kotlin.jvm.internal.o.b(this.f398192b, f0Var.f398192b);
    }

    public int hashCode() {
        return (this.f398191a.hashCode() * 31) + this.f398192b.hashCode();
    }

    public java.lang.String toString() {
        return "SurfaceTextureInfoHolder(surfaceTexture=" + this.f398191a + ", texObj=" + this.f398192b + ')';
    }
}
