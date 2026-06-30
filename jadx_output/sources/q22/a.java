package q22;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f359800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f359801b;

    /* renamed from: c, reason: collision with root package name */
    public int f359802c;

    /* renamed from: d, reason: collision with root package name */
    public int f359803d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f359804e;

    public a(int i17, boolean z17, int i18, int i19, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 1080 : i17;
        z17 = (i27 & 2) != 0 ? false : z17;
        i18 = (i27 & 4) != 0 ? 640 : i18;
        i19 = (i27 & 8) != 0 ? 1 : i19;
        z18 = (i27 & 16) != 0 ? false : z18;
        this.f359800a = i17;
        this.f359801b = z17;
        this.f359802c = i18;
        this.f359803d = i19;
        this.f359804e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q22.a)) {
            return false;
        }
        q22.a aVar = (q22.a) obj;
        return this.f359800a == aVar.f359800a && this.f359801b == aVar.f359801b && this.f359802c == aVar.f359802c && this.f359803d == aVar.f359803d && this.f359804e == aVar.f359804e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f359800a) * 31) + java.lang.Boolean.hashCode(this.f359801b)) * 31) + java.lang.Integer.hashCode(this.f359802c)) * 31) + java.lang.Integer.hashCode(this.f359803d)) * 31) + java.lang.Boolean.hashCode(this.f359804e);
    }

    public java.lang.String toString() {
        return "CameraPreviewConfig(resolution=" + this.f359800a + ", useCpuCrop=" + this.f359801b + ", previewSize=" + this.f359802c + ", stickerSampleSize=" + this.f359803d + ", useCameraApi2=" + this.f359804e + ')';
    }
}
