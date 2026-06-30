package xr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f456147a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f456148b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f456149c;

    public a(int i17, boolean z17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        z17 = (i18 & 2) != 0 ? true : z17;
        z18 = (i18 & 4) != 0 ? true : z18;
        this.f456147a = i17;
        this.f456148b = z17;
        this.f456149c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.a)) {
            return false;
        }
        xr0.a aVar = (xr0.a) obj;
        return this.f456147a == aVar.f456147a && this.f456148b == aVar.f456148b && this.f456149c == aVar.f456149c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f456147a) * 31) + java.lang.Boolean.hashCode(this.f456148b)) * 31) + java.lang.Boolean.hashCode(this.f456149c);
    }

    public java.lang.String toString() {
        return "CameraDeviceInfo(cameraCount=" + this.f456147a + ", hasBackCamera=" + this.f456148b + ", hasFrontCamera=" + this.f456149c + ')';
    }
}
