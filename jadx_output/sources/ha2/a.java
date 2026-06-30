package ha2;

/* loaded from: classes10.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.hd1 f279791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279792e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f279793f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279794g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f279795h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f279796i;

    public a(r45.hd1 data, int i17, boolean z17, java.lang.String str, java.lang.String keyword, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        str = (i18 & 8) != 0 ? null : str;
        keyword = (i18 & 16) != 0 ? "" : keyword;
        galleryItem$MediaItem = (i18 & 32) != 0 ? null : galleryItem$MediaItem;
        z18 = (i18 & 64) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f279791d = data;
        this.f279792e = i17;
        this.f279793f = str;
        this.f279794g = keyword;
        this.f279795h = galleryItem$MediaItem;
        this.f279796i = z18;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f279791d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f279792e;
    }
}
