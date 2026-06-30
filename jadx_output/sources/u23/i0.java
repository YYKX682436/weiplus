package u23;

/* loaded from: classes10.dex */
public final class i0 extends u23.a {
    @Override // u23.a, u23.b
    public java.lang.String a() {
        return "albumpreviewui-onlykeepmediawithlocation";
    }

    @Override // u23.a, u23.b
    public boolean b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem media) {
        kotlin.jvm.internal.o.g(media, "media");
        if (!super.b(media) || !i11.b.a(media.f138440r) || !i11.b.b(media.f138439q)) {
            return false;
        }
        if (media.f138440r == 0.0d) {
            if (media.f138439q == 0.0d) {
                return false;
            }
        }
        return true;
    }
}
