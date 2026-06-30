package u23;

/* loaded from: classes10.dex */
public class a implements u23.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f424035a;

    public a(int i17) {
        this.f424035a = i17;
    }

    @Override // u23.b
    public java.lang.String a() {
        return "albumpreviewui";
    }

    @Override // u23.b
    public boolean b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem media) {
        kotlin.jvm.internal.o.g(media, "media");
        int i17 = this.f424035a;
        if (i17 != 1) {
            if (i17 != 2) {
                if (media.getType() != 1 && media.getType() != 2) {
                    return false;
                }
            } else if (media.getType() != 2) {
                return false;
            }
        } else if (media.getType() != 1) {
            return false;
        }
        return true;
    }
}
