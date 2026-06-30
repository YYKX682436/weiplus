package um5;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f429128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f429129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f429130c;

    /* renamed from: d, reason: collision with root package name */
    public final int f429131d;

    /* renamed from: e, reason: collision with root package name */
    public final int f429132e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f429133f;

    public a0(int i17, boolean z17, int i18, int i19, int i27, android.graphics.SurfaceTexture surfaceTexture) {
        this.f429128a = i17;
        this.f429129b = z17;
        this.f429130c = i18;
        this.f429131d = i19;
        this.f429132e = i27;
        this.f429133f = surfaceTexture;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.a0)) {
            return false;
        }
        um5.a0 a0Var = (um5.a0) obj;
        return this.f429128a == a0Var.f429128a && this.f429129b == a0Var.f429129b && this.f429130c == a0Var.f429130c && this.f429131d == a0Var.f429131d && this.f429132e == a0Var.f429132e && kotlin.jvm.internal.o.b(this.f429133f, a0Var.f429133f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f429128a) * 31) + java.lang.Boolean.hashCode(this.f429129b)) * 31) + java.lang.Integer.hashCode(this.f429130c)) * 31) + java.lang.Integer.hashCode(this.f429131d)) * 31) + java.lang.Integer.hashCode(this.f429132e)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f429133f;
        return hashCode + (surfaceTexture == null ? 0 : surfaceTexture.hashCode());
    }

    public java.lang.String toString() {
        return "InputTextureData(textureId=" + this.f429128a + ", isOES=" + this.f429129b + ", width=" + this.f429130c + ", height=" + this.f429131d + ", rotate=" + this.f429132e + ", surfaceTexture=" + this.f429133f + ')';
    }
}
