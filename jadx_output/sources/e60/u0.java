package e60;

/* loaded from: classes11.dex */
public final class u0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f249740d;

    /* renamed from: e, reason: collision with root package name */
    public final int f249741e;

    /* renamed from: f, reason: collision with root package name */
    public final int f249742f;

    /* renamed from: g, reason: collision with root package name */
    public final int f249743g;

    public u0(int i17, int i18, int i19, int i27) {
        this.f249740d = i17;
        this.f249741e = i18;
        this.f249742f = i19;
        this.f249743g = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.u0)) {
            return false;
        }
        e60.u0 u0Var = (e60.u0) obj;
        return this.f249740d == u0Var.f249740d && this.f249741e == u0Var.f249741e && this.f249742f == u0Var.f249742f && this.f249743g == u0Var.f249743g;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f249740d) * 31) + java.lang.Integer.hashCode(this.f249741e)) * 31) + java.lang.Integer.hashCode(this.f249742f)) * 31) + java.lang.Integer.hashCode(this.f249743g);
    }

    public java.lang.String toString() {
        return "GalleryEnterRect(left=" + this.f249740d + ", top=" + this.f249741e + ", width=" + this.f249742f + ", height=" + this.f249743g + ')';
    }
}
