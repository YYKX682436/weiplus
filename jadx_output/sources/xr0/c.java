package xr0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f456155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f456156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f456157c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f456158d;

    public c(int i17, int i18, int i19, xr0.e eVar, xr0.f fVar, boolean z17, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? -1 : i17;
        i18 = (i27 & 2) != 0 ? 30 : i18;
        i19 = (i27 & 4) != 0 ? -1 : i19;
        z17 = (i27 & 32) != 0 ? true : z17;
        this.f456155a = i17;
        this.f456156b = i18;
        this.f456157c = i19;
        this.f456158d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.c)) {
            return false;
        }
        xr0.c cVar = (xr0.c) obj;
        return this.f456155a == cVar.f456155a && this.f456156b == cVar.f456156b && this.f456157c == cVar.f456157c && kotlin.jvm.internal.o.b(null, null) && kotlin.jvm.internal.o.b(null, null) && this.f456158d == cVar.f456158d;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f456155a) * 31) + java.lang.Integer.hashCode(this.f456156b)) * 31) + java.lang.Integer.hashCode(this.f456157c)) * 31) + 0) * 31) + 0) * 31) + java.lang.Boolean.hashCode(this.f456158d);
    }

    public java.lang.String toString() {
        return "CameraKitCommonSetting(instanceVersion=" + this.f456155a + ", cameraFrameRate=" + this.f456156b + ", previewLimit=" + this.f456157c + ", pictureSetting=null, renderSetting=null, useBackCamera=" + this.f456158d + ')';
    }
}
