package um5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f429150a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f429151b;

    /* renamed from: c, reason: collision with root package name */
    public int f429152c;

    /* renamed from: d, reason: collision with root package name */
    public int f429153d;

    /* renamed from: e, reason: collision with root package name */
    public int f429154e;

    public f(int i17, boolean z17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        z17 = (i28 & 2) != 0 ? false : z17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        this.f429150a = i17;
        this.f429151b = z17;
        this.f429152c = i18;
        this.f429153d = i19;
        this.f429154e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.f)) {
            return false;
        }
        um5.f fVar = (um5.f) obj;
        return this.f429150a == fVar.f429150a && this.f429151b == fVar.f429151b && this.f429152c == fVar.f429152c && this.f429153d == fVar.f429153d && this.f429154e == fVar.f429154e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f429150a) * 31) + java.lang.Boolean.hashCode(this.f429151b)) * 31) + java.lang.Integer.hashCode(this.f429152c)) * 31) + java.lang.Integer.hashCode(this.f429153d)) * 31) + java.lang.Integer.hashCode(this.f429154e);
    }

    public java.lang.String toString() {
        return "ExternInputTextureInfo(textureId=" + this.f429150a + ", isOES=" + this.f429151b + ", width=" + this.f429152c + ", height=" + this.f429153d + ", rotate=" + this.f429154e + ')';
    }
}
