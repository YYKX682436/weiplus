package uv2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h70 f431401a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.z f431402b;

    /* renamed from: c, reason: collision with root package name */
    public float f431403c;

    /* renamed from: d, reason: collision with root package name */
    public int f431404d;

    /* renamed from: e, reason: collision with root package name */
    public int f431405e;

    /* renamed from: f, reason: collision with root package name */
    public int f431406f;

    public n(r45.h70 compositionInfo, com.tencent.mm.plugin.vlog.model.z exportResult, float f17, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        f17 = (i27 & 4) != 0 ? 0.0f : f17;
        i17 = (i27 & 8) != 0 ? -1 : i17;
        i18 = (i27 & 16) != 0 ? 0 : i18;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        kotlin.jvm.internal.o.g(compositionInfo, "compositionInfo");
        kotlin.jvm.internal.o.g(exportResult, "exportResult");
        this.f431401a = compositionInfo;
        this.f431402b = exportResult;
        this.f431403c = f17;
        this.f431404d = i17;
        this.f431405e = i18;
        this.f431406f = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv2.n)) {
            return false;
        }
        uv2.n nVar = (uv2.n) obj;
        return kotlin.jvm.internal.o.b(this.f431401a, nVar.f431401a) && kotlin.jvm.internal.o.b(this.f431402b, nVar.f431402b) && java.lang.Float.compare(this.f431403c, nVar.f431403c) == 0 && this.f431404d == nVar.f431404d && this.f431405e == nVar.f431405e && this.f431406f == nVar.f431406f;
    }

    public int hashCode() {
        return (((((((((this.f431401a.hashCode() * 31) + this.f431402b.hashCode()) * 31) + java.lang.Float.hashCode(this.f431403c)) * 31) + java.lang.Integer.hashCode(this.f431404d)) * 31) + java.lang.Integer.hashCode(this.f431405e)) * 31) + java.lang.Integer.hashCode(this.f431406f);
    }

    public java.lang.String toString() {
        return "ProcessResult(compositionInfo=" + this.f431401a + ", exportResult=" + this.f431402b + ", videoQuality=" + this.f431403c + ", retCode=" + this.f431404d + ", zipRetCode=" + this.f431405e + ", zipTime=" + this.f431406f + ')';
    }
}
