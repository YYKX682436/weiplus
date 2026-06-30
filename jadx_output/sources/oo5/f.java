package oo5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f347213a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f347214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f347215c;

    public f(java.lang.String filePath, java.lang.String fileExt, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.f347213a = filePath;
        this.f347214b = fileExt;
        this.f347215c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo5.f)) {
            return false;
        }
        oo5.f fVar = (oo5.f) obj;
        return kotlin.jvm.internal.o.b(this.f347213a, fVar.f347213a) && kotlin.jvm.internal.o.b(this.f347214b, fVar.f347214b) && this.f347215c == fVar.f347215c;
    }

    public int hashCode() {
        return (((this.f347213a.hashCode() * 31) + this.f347214b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f347215c);
    }

    public java.lang.String toString() {
        return "VoIPPreviewFileParams(filePath=" + this.f347213a + ", fileExt=" + this.f347214b + ", isDark=" + this.f347215c + ')';
    }
}
