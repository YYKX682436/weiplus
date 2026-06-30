package gm3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f273535a;

    /* renamed from: b, reason: collision with root package name */
    public long f273536b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f273537c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f273538d;

    /* renamed from: e, reason: collision with root package name */
    public int f273539e;

    /* renamed from: f, reason: collision with root package name */
    public int f273540f;

    public a(long j17, long j18, java.lang.String str, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        j18 = (i19 & 2) != 0 ? 0L : j18;
        str = (i19 & 4) != 0 ? null : str;
        galleryItem$MediaItem = (i19 & 8) != 0 ? null : galleryItem$MediaItem;
        i17 = (i19 & 16) != 0 ? 0 : i17;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        this.f273535a = j17;
        this.f273536b = j18;
        this.f273537c = str;
        this.f273538d = galleryItem$MediaItem;
        this.f273539e = i17;
        this.f273540f = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3.a)) {
            return false;
        }
        gm3.a aVar = (gm3.a) obj;
        return this.f273535a == aVar.f273535a && this.f273536b == aVar.f273536b && kotlin.jvm.internal.o.b(this.f273537c, aVar.f273537c) && kotlin.jvm.internal.o.b(this.f273538d, aVar.f273538d) && this.f273539e == aVar.f273539e && this.f273540f == aVar.f273540f;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f273535a) * 31) + java.lang.Long.hashCode(this.f273536b)) * 31;
        java.lang.String str = this.f273537c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f273538d;
        return ((((hashCode2 + (galleryItem$MediaItem != null ? galleryItem$MediaItem.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f273539e)) * 31) + java.lang.Integer.hashCode(this.f273540f);
    }

    public java.lang.String toString() {
        return "AlbumItem(origId=" + this.f273535a + ", modifyDate=" + this.f273536b + ", thumbPath=" + this.f273537c + ", mediaItem=" + this.f273538d + ", width=" + this.f273539e + ", height=" + this.f273540f + ')';
    }
}
