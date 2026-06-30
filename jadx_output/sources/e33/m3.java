package e33;

/* loaded from: classes10.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public int f247358a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final e33.v2 f247359b;

    public m3(e33.v2 v2Var) {
        this.f247359b = v2Var;
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f247359b.f247502m;
        if (arrayList == null || arrayList.size() <= i17 || i17 < 0) {
            return;
        }
        long j17 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).f138434i;
        java.lang.String str = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).f138433h;
        java.lang.String str2 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).f138430e;
        t23.p0.h().e(com.tencent.mm.sdk.platformtools.t8.K0(str) ? str2 : str, ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).getType(), str2, j17, ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).f138435m);
    }
}
