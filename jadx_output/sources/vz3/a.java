package vz3;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f441665a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f441668d;

    public a(int i17, int i18, int i19, int i27) {
        this.f441665a = i17;
        this.f441666b = i18;
        this.f441667c = i19;
        this.f441668d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz3.a)) {
            return false;
        }
        vz3.a aVar = (vz3.a) obj;
        return this.f441665a == aVar.f441665a && this.f441666b == aVar.f441666b && this.f441667c == aVar.f441667c && this.f441668d == aVar.f441668d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f441665a) * 31) + java.lang.Integer.hashCode(this.f441666b)) * 31) + java.lang.Integer.hashCode(this.f441667c)) * 31) + java.lang.Integer.hashCode(this.f441668d);
    }

    public java.lang.String toString() {
        return "CameraInfo(width=" + this.f441665a + ", height=" + this.f441666b + ", previewFormat=" + this.f441667c + ", cameraRotation=" + this.f441668d + ')';
    }
}
