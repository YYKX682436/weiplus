package t23;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final t23.z1 f415313d = t23.y1.f415310a;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f415314a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f415315b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public t23.p1 f415316c = t23.p1.f415247d;

    public z1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(t23.o1 preload) {
        kotlin.jvm.internal.o.g(preload, "preload");
        this.f415314a.add(preload);
    }

    public final void b(t23.p1 state, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(state, "state");
        if (this.f415316c != state) {
            this.f415316c = state;
        }
        java.util.Iterator it = this.f415314a.iterator();
        while (it.hasNext()) {
            t23.o1 o1Var = (t23.o1) it.next();
            if (t23.p1.f415247d == state && o1Var.a()) {
                c(o1Var.b(state, this.f415316c, i17, i18, i19));
            }
            if (!o1Var.a()) {
                c(o1Var.b(state, this.f415316c, i17, i18, i19));
            }
        }
    }

    public final void c(java.util.Set set) {
        java.util.ArrayList arrayList = this.f415315b;
        arrayList.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue < arrayList.size()) {
                t23.j h17 = t23.p0.h();
                java.lang.String o17 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(intValue)).o();
                int type = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(intValue)).getType();
                java.lang.String str = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(intValue)).f138430e;
                long j17 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(intValue)).f138434i;
                long j18 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(intValue)).f138435m;
                h17.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CacheService", "trySubmitPreDecodeTask, file path is invalid.");
                } else {
                    j33.d0.d(o17, null, -1);
                    android.graphics.Bitmap a17 = h17.f415186a.a(j33.d0.c(o17, null, j18));
                    if (a17 == null || a17.isRecycled()) {
                        t23.f1 f1Var = h17.f415191f;
                        if (f1Var.size() > 82) {
                            java.lang.String str2 = ((t23.h) f1Var.d()).f415158d;
                        }
                        f1Var.add(new t23.h(h17, o17, type, str, j17, 12288, j18));
                        h17.j();
                    }
                }
            }
        }
    }

    public final void d(java.util.List mediaItems) {
        kotlin.jvm.internal.o.g(mediaItems, "mediaItems");
        mediaItems.size();
        java.util.ArrayList arrayList = this.f415315b;
        arrayList.clear();
        arrayList.addAll(mediaItems);
    }
}
