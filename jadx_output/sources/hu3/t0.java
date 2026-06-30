package hu3;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public rg.c f285199a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.j f285200b;

    /* renamed from: c, reason: collision with root package name */
    public int f285201c;

    /* renamed from: d, reason: collision with root package name */
    public int f285202d;

    /* renamed from: e, reason: collision with root package name */
    public int f285203e;

    public t0(rg.c level, xr0.j outputSize, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        level = (i27 & 1) != 0 ? rg.c.DIMENSION_LEVEL_720 : level;
        outputSize = (i27 & 2) != 0 ? new xr0.j(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280) : outputSize;
        i17 = (i27 & 4) != 0 ? 233333 : i17;
        i18 = (i27 & 8) != 0 ? 41000 : i18;
        i19 = (i27 & 16) != 0 ? 30 : i19;
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(outputSize, "outputSize");
        this.f285199a = level;
        this.f285200b = outputSize;
        this.f285201c = i17;
        this.f285202d = i18;
        this.f285203e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.t0)) {
            return false;
        }
        hu3.t0 t0Var = (hu3.t0) obj;
        return this.f285199a == t0Var.f285199a && kotlin.jvm.internal.o.b(this.f285200b, t0Var.f285200b) && this.f285201c == t0Var.f285201c && this.f285202d == t0Var.f285202d && this.f285203e == t0Var.f285203e;
    }

    public int hashCode() {
        return (((((((this.f285199a.hashCode() * 31) + this.f285200b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f285201c)) * 31) + java.lang.Integer.hashCode(this.f285202d)) * 31) + java.lang.Integer.hashCode(this.f285203e);
    }

    public java.lang.String toString() {
        return "TemplateOutputInfo(level=" + this.f285199a + ", outputSize=" + this.f285200b + ", videoBitsPerFrame=" + this.f285201c + ", averageAudioBitRate=" + this.f285202d + ", maxKeyframeInterval=" + this.f285203e + ')';
    }
}
