package o70;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f343231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f343232b;

    public f(int i17, int i18) {
        this.f343231a = i17;
        this.f343232b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70.f)) {
            return false;
        }
        o70.f fVar = (o70.f) obj;
        return this.f343231a == fVar.f343231a && this.f343232b == fVar.f343232b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f343231a) * 31) + java.lang.Integer.hashCode(this.f343232b);
    }

    public java.lang.String toString() {
        return "ImgBaseInfo(width=" + this.f343231a + ", height=" + this.f343232b + ')';
    }
}
