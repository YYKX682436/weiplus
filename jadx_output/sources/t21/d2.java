package t21;

/* loaded from: classes10.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f414732a;

    /* renamed from: b, reason: collision with root package name */
    public final float f414733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414734c;

    /* renamed from: d, reason: collision with root package name */
    public final int f414735d;

    /* renamed from: e, reason: collision with root package name */
    public final int f414736e;

    public d2(int i17, float f17, int i18, int i19, int i27) {
        this.f414732a = i17;
        this.f414733b = f17;
        this.f414734c = i18;
        this.f414735d = i19;
        this.f414736e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t21.d2)) {
            return false;
        }
        t21.d2 d2Var = (t21.d2) obj;
        return this.f414732a == d2Var.f414732a && java.lang.Float.compare(this.f414733b, d2Var.f414733b) == 0 && this.f414734c == d2Var.f414734c && this.f414735d == d2Var.f414735d && this.f414736e == d2Var.f414736e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f414732a) * 31) + java.lang.Float.hashCode(this.f414733b)) * 31) + java.lang.Integer.hashCode(this.f414734c)) * 31) + java.lang.Integer.hashCode(this.f414735d)) * 31) + java.lang.Integer.hashCode(this.f414736e);
    }

    public java.lang.String toString() {
        return "SoftEncoderConfig(softEncodePreset=" + this.f414732a + ", crf=" + this.f414733b + ", vbvBufferSize=" + this.f414734c + ", roiSwitch=" + this.f414735d + ", roiFlag=" + this.f414736e + ')';
    }

    public /* synthetic */ d2(int i17, float f17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this((i28 & 1) != 0 ? -1 : i17, (i28 & 2) != 0 ? -1.0f : f17, (i28 & 4) == 0 ? i18 : -1, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 0 : i27);
    }
}
