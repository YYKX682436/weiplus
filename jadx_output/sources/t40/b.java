package t40;

/* loaded from: classes10.dex */
public final class b implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415471e;

    /* renamed from: f, reason: collision with root package name */
    public final int f415472f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f415473g;

    /* renamed from: h, reason: collision with root package name */
    public final t40.d f415474h;

    /* renamed from: i, reason: collision with root package name */
    public final int f415475i;

    public b(java.lang.String cdnTaskName, int i17, int i18, java.lang.String savePathRoot, t40.d galleryScene, int i19) {
        kotlin.jvm.internal.o.g(cdnTaskName, "cdnTaskName");
        kotlin.jvm.internal.o.g(savePathRoot, "savePathRoot");
        kotlin.jvm.internal.o.g(galleryScene, "galleryScene");
        this.f415470d = cdnTaskName;
        this.f415471e = i17;
        this.f415472f = i18;
        this.f415473g = savePathRoot;
        this.f415474h = galleryScene;
        this.f415475i = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40.b)) {
            return false;
        }
        t40.b bVar = (t40.b) obj;
        return kotlin.jvm.internal.o.b(this.f415470d, bVar.f415470d) && this.f415471e == bVar.f415471e && this.f415472f == bVar.f415472f && kotlin.jvm.internal.o.b(this.f415473g, bVar.f415473g) && this.f415474h == bVar.f415474h && this.f415475i == bVar.f415475i;
    }

    public int hashCode() {
        return (((((((((this.f415470d.hashCode() * 31) + java.lang.Integer.hashCode(this.f415471e)) * 31) + java.lang.Integer.hashCode(this.f415472f)) * 31) + this.f415473g.hashCode()) * 31) + this.f415474h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f415475i);
    }

    public java.lang.String toString() {
        return "FinderLiveGalleryConfig(cdnTaskName=" + this.f415470d + ", cdnPriority=" + this.f415471e + ", enterIndex=" + this.f415472f + ", savePathRoot=" + this.f415473g + ", galleryScene=" + this.f415474h + ", finderPostEnterScene=" + this.f415475i + ')';
    }
}
