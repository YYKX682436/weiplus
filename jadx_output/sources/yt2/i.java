package yt2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f465307a;

    /* renamed from: b, reason: collision with root package name */
    public final float f465308b;

    /* renamed from: c, reason: collision with root package name */
    public final float f465309c;

    public i(float f17, float f18, float f19) {
        this.f465307a = f17;
        this.f465308b = f18;
        this.f465309c = f19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt2.i)) {
            return false;
        }
        yt2.i iVar = (yt2.i) obj;
        return java.lang.Float.compare(this.f465307a, iVar.f465307a) == 0 && java.lang.Float.compare(this.f465308b, iVar.f465308b) == 0 && java.lang.Float.compare(this.f465309c, iVar.f465309c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f465307a) * 31) + java.lang.Float.hashCode(this.f465308b)) * 31) + java.lang.Float.hashCode(this.f465309c);
    }

    public java.lang.String toString() {
        return "ExitTarget(leftX=" + this.f465307a + ", centerY=" + this.f465308b + ", height=" + this.f465309c + ')';
    }
}
