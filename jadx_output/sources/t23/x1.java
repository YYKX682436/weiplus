package t23;

/* loaded from: classes10.dex */
public final class x1 implements e60.f1 {

    /* renamed from: e, reason: collision with root package name */
    public t23.n1 f415296e;

    /* renamed from: f, reason: collision with root package name */
    public int f415297f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f415298g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f415292a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f415293b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f415294c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f415295d = new java.util.HashSet();

    public static void a(t23.x1 x1Var, java.util.LinkedList linkedList, long j17, boolean z17) {
        int i17;
        t23.l1[] l1VarArr;
        int i18;
        long j18 = j17;
        int size = x1Var.f415295d.size();
        t23.l1[] l1VarArr2 = new t23.l1[size];
        x1Var.f415295d.toArray(l1VarArr2);
        int i19 = 0;
        while (i19 < size) {
            e33.k0 k0Var = (e33.k0) l1VarArr2[i19];
            if (j18 != k0Var.f247301b.f138511a2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(k0Var.f247301b.f138511a2));
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            } else if (linkedList != null && !linkedList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                    com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = k0Var.f247301b;
                    double d17 = albumPreviewUI.f138552y1;
                    int i27 = i19;
                    double d18 = albumPreviewUI.f138554z1;
                    int i28 = size;
                    t23.l1[] l1VarArr3 = l1VarArr2;
                    if (com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(d17, d18, galleryItem$MediaItem.f138440r, galleryItem$MediaItem.f138439q) <= k0Var.f247300a) {
                        galleryItem$MediaItem.f138441s = "album_business_bubble_media_by_coordinate";
                        arrayList.add(galleryItem$MediaItem);
                    }
                    size = i28;
                    i19 = i27;
                    l1VarArr2 = l1VarArr3;
                }
                i17 = size;
                l1VarArr = l1VarArr2;
                i18 = i19;
                linkedList.removeAll(arrayList);
                arrayList.size();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).toString();
                }
                if (!linkedList.isEmpty() && !arrayList.isEmpty()) {
                    linkedList.addAll(0, arrayList);
                    i19 = i18 + 1;
                    j18 = j17;
                    size = i17;
                    l1VarArr2 = l1VarArr;
                }
                i19 = i18 + 1;
                j18 = j17;
                size = i17;
                l1VarArr2 = l1VarArr;
            }
            i17 = size;
            l1VarArr = l1VarArr2;
            i18 = i19;
            i19 = i18 + 1;
            j18 = j17;
            size = i17;
            l1VarArr2 = l1VarArr;
        }
        int size2 = x1Var.f415294c.size();
        t23.m1[] m1VarArr = new t23.m1[size2];
        x1Var.f415294c.toArray(m1VarArr);
        for (int i29 = 0; i29 < size2; i29++) {
            m1VarArr[i29].u5(linkedList, j17, z17);
        }
    }

    public void b(t23.m1 m1Var) {
        this.f415294c.add(m1Var);
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "initQueryType: %d", java.lang.Integer.valueOf(this.f415298g));
        int i17 = this.f415298g;
        if (i17 == 1) {
            this.f415296e = new t23.r1();
        } else if (i17 != 2) {
            this.f415296e = new t23.e();
        } else {
            this.f415296e = new t23.s2();
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "queryAlbums, %s.", this);
        if (this.f415296e == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.MediaQueryService", "media query not init, init again");
            c();
        }
        t23.y0 n17 = t23.p0.n();
        t23.u1 u1Var = new t23.u1(this);
        java.util.concurrent.ExecutorService executorService = n17.f415305f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(u1Var);
        }
    }

    public void e(java.lang.String str, int i17, long j17) {
        if (this.f415296e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaQueryService", "media query not init, init again");
            c();
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "queryMediaInAlbums, albumName: %s ticket: %d, stack: %s.", str, valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        ((t23.f) this.f415296e).f415144g = true;
        t23.p0.n().d(new t23.w1(this, str, i17, j17));
    }

    public void f(t23.m1 m1Var) {
        this.f415294c.remove(m1Var);
    }

    public void g(int i17) {
        this.f415298g = i17;
        c();
    }
}
