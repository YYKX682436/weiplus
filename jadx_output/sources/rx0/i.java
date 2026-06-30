package rx0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public rg.c f400928a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.j f400929b;

    /* renamed from: c, reason: collision with root package name */
    public int f400930c;

    /* renamed from: d, reason: collision with root package name */
    public int f400931d;

    /* renamed from: e, reason: collision with root package name */
    public int f400932e;

    public i(rg.c level, xr0.j outputSize, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        level = (i27 & 1) != 0 ? rg.c.DIMENSION_LEVEL_720 : level;
        outputSize = (i27 & 2) != 0 ? new xr0.j(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280) : outputSize;
        i17 = (i27 & 4) != 0 ? 233333 : i17;
        i18 = (i27 & 8) != 0 ? 41000 : i18;
        i19 = (i27 & 16) != 0 ? 30 : i19;
        kotlin.jvm.internal.o.g(level, "level");
        kotlin.jvm.internal.o.g(outputSize, "outputSize");
        this.f400928a = level;
        this.f400929b = outputSize;
        this.f400930c = i17;
        this.f400931d = i18;
        this.f400932e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.i)) {
            return false;
        }
        rx0.i iVar = (rx0.i) obj;
        return this.f400928a == iVar.f400928a && kotlin.jvm.internal.o.b(this.f400929b, iVar.f400929b) && this.f400930c == iVar.f400930c && this.f400931d == iVar.f400931d && this.f400932e == iVar.f400932e;
    }

    public int hashCode() {
        return (((((((this.f400928a.hashCode() * 31) + this.f400929b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f400930c)) * 31) + java.lang.Integer.hashCode(this.f400931d)) * 31) + java.lang.Integer.hashCode(this.f400932e);
    }

    public java.lang.String toString() {
        return "TemplateOutputInfo(level=" + this.f400928a + ", outputSize=" + this.f400929b + ", videoBitsPerFrame=" + this.f400930c + ", averageAudioBitRate=" + this.f400931d + ", maxKeyframeInterval=" + this.f400932e + ')';
    }
}
