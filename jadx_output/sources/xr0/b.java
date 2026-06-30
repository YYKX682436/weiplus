package xr0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f456150a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f456151b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f456152c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f456153d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f456154e;

    public b(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        z27 = (i17 & 8) != 0 ? true : z27;
        z28 = (i17 & 16) != 0 ? true : z28;
        this.f456150a = z17;
        this.f456151b = z18;
        this.f456152c = z19;
        this.f456153d = z27;
        this.f456154e = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.b)) {
            return false;
        }
        xr0.b bVar = (xr0.b) obj;
        return this.f456150a == bVar.f456150a && this.f456151b == bVar.f456151b && this.f456152c == bVar.f456152c && this.f456153d == bVar.f456153d && this.f456154e == bVar.f456154e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f456150a) * 31) + java.lang.Boolean.hashCode(this.f456151b)) * 31) + java.lang.Boolean.hashCode(this.f456152c)) * 31) + java.lang.Boolean.hashCode(this.f456153d)) * 31) + java.lang.Boolean.hashCode(this.f456154e);
    }

    public java.lang.String toString() {
        return "CameraKitAbilitySetting(isUseTakePicture=" + this.f456150a + ", isUseFlash=" + this.f456151b + ", isUseAdjustExpo=" + this.f456152c + ", isUseFocusOn=" + this.f456153d + ", isUseDoubleTapToSwitchCamera=" + this.f456154e + ')';
    }
}
