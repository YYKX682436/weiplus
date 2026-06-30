package ih1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f291490b;

    /* renamed from: c, reason: collision with root package name */
    public final tp0.j f291491c;

    public f(java.lang.String frameSetName, java.lang.String frameSetRootPath, tp0.j coverViewNormalData) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetRootPath, "frameSetRootPath");
        kotlin.jvm.internal.o.g(coverViewNormalData, "coverViewNormalData");
        this.f291489a = frameSetName;
        this.f291490b = frameSetRootPath;
        this.f291491c = coverViewNormalData;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1.f)) {
            return false;
        }
        ih1.f fVar = (ih1.f) obj;
        return kotlin.jvm.internal.o.b(this.f291489a, fVar.f291489a) && kotlin.jvm.internal.o.b(this.f291490b, fVar.f291490b) && kotlin.jvm.internal.o.b(this.f291491c, fVar.f291491c);
    }

    public int hashCode() {
        return (((this.f291489a.hashCode() * 31) + this.f291490b.hashCode()) * 31) + this.f291491c.hashCode();
    }

    public java.lang.String toString() {
        return "CoverViewExtendedFrameSetData(frameSetName=" + this.f291489a + ", frameSetRootPath=" + this.f291490b + ", coverViewNormalData=" + this.f291491c + ')';
    }
}
