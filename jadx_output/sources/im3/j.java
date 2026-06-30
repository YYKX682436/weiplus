package im3;

/* loaded from: classes10.dex */
public final class j extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292698d;

    /* renamed from: e, reason: collision with root package name */
    public int f292699e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.mc5 f292700f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f292701g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f292702h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f292703i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f292704m;

    public j(java.lang.String id6, int i17, r45.mc5 previewItem, java.lang.String listId) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(previewItem, "previewItem");
        kotlin.jvm.internal.o.g(listId, "listId");
        this.f292698d = id6;
        this.f292699e = i17;
        this.f292700f = previewItem;
        this.f292701g = listId;
        com.tencent.mm.protobuf.g gVar = previewItem.f380366g;
        if (gVar != null) {
            byte[] g17 = gVar.g();
            int i18 = previewItem.f380364e;
            if (i18 == 1) {
                android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR = com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem.CREATOR;
                kotlin.jvm.internal.o.f(CREATOR, "CREATOR");
                this.f292704m = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) pm0.v.Y(g17, CREATOR);
            } else if (i18 == 2) {
                android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR2 = com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem.CREATOR;
                kotlin.jvm.internal.o.f(CREATOR2, "CREATOR");
                this.f292704m = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) pm0.v.Y(g17, CREATOR2);
            }
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        im3.j other = (im3.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f292698d, other.f292698d) && kotlin.jvm.internal.o.b(this.f292700f, other.f292700f) && kotlin.jvm.internal.o.b(this.f292701g, other.f292701g) && this.f292703i == other.f292703i;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        im3.j other = (im3.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = this.f292699e;
        return kotlin.jvm.internal.o.i(i17, i17);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f292700f.f380364e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f292701g + '-' + this.f292698d;
    }
}
