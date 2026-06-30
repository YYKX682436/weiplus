package oc2;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f344159a;

    /* renamed from: b, reason: collision with root package name */
    public int f344160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344161c;

    public c0(boolean z17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 2 : i18;
        this.f344159a = z17;
        this.f344160b = i17;
        this.f344161c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.c0)) {
            return false;
        }
        oc2.c0 c0Var = (oc2.c0) obj;
        return this.f344159a == c0Var.f344159a && this.f344160b == c0Var.f344160b && this.f344161c == c0Var.f344161c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f344159a) * 31) + java.lang.Integer.hashCode(this.f344160b)) * 31) + java.lang.Integer.hashCode(this.f344161c);
    }

    public java.lang.String toString() {
        return "ClientThumbnailReq(enable=" + this.f344159a + ", exceedWidth=" + this.f344160b + ", clientThumbnailNum=" + this.f344161c + ')';
    }
}
