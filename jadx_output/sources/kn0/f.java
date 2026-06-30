package kn0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f309529a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f309530b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f309531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309533e;

    public f(boolean z17, boolean z18, boolean z19, int i17, boolean z27, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        i17 = (i18 & 8) != 0 ? 1080 : i17;
        z27 = (i18 & 16) != 0 ? true : z27;
        this.f309529a = z17;
        this.f309530b = z18;
        this.f309531c = z19;
        this.f309532d = i17;
        this.f309533e = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.f)) {
            return false;
        }
        kn0.f fVar = (kn0.f) obj;
        return this.f309529a == fVar.f309529a && this.f309530b == fVar.f309530b && this.f309531c == fVar.f309531c && this.f309532d == fVar.f309532d && this.f309533e == fVar.f309533e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f309529a) * 31) + java.lang.Boolean.hashCode(this.f309530b)) * 31) + java.lang.Boolean.hashCode(this.f309531c)) * 31) + java.lang.Integer.hashCode(this.f309532d)) * 31) + java.lang.Boolean.hashCode(this.f309533e);
    }

    public java.lang.String toString() {
        return "LiveRenderModel(useCamera2=" + this.f309529a + ", defaultFrontCamera=" + this.f309530b + ", useCPUCrop=" + this.f309531c + ", resolution=" + this.f309532d + ", frontMirror=" + this.f309533e + ')';
    }
}
