package h33;

/* loaded from: classes.dex */
public final class c extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f278455d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f278456e;

    public c(int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        this.f278455d = i17;
        this.f278456e = mediaItem;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        h33.c other = (h33.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f278455d == other.f278455d && kotlin.jvm.internal.o.b(this.f278456e.f138430e, other.f278456e.f138430e);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        h33.c other = (h33.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f278455d, other.f278455d);
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f278456e.f138430e + '_' + this.f278455d;
    }
}
