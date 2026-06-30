package t23;

/* loaded from: classes10.dex */
public final class d implements e60.z0 {

    /* renamed from: a, reason: collision with root package name */
    public e60.x0 f415125a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f415127c;

    /* renamed from: d, reason: collision with root package name */
    public e60.y0 f415128d;

    /* renamed from: f, reason: collision with root package name */
    public v23.b f415130f;

    /* renamed from: g, reason: collision with root package name */
    public u23.s f415131g;

    /* renamed from: h, reason: collision with root package name */
    public u23.n f415132h;

    /* renamed from: b, reason: collision with root package name */
    public int f415126b = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f415129e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final t23.b f415133i = new t23.b(this);

    /* renamed from: j, reason: collision with root package name */
    public final t23.a f415134j = new t23.a(this);

    /* renamed from: k, reason: collision with root package name */
    public final t23.c f415135k = new t23.c(this);

    public final v23.b a(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v23.b bVar = (v23.b) obj;
            if (kotlin.jvm.internal.o.b(bVar.f432886a, str) && (kotlin.jvm.internal.o.b(str2, "") || kotlin.jvm.internal.o.b(str2, bVar.f432888c))) {
                break;
            }
        }
        v23.b bVar2 = (v23.b) obj;
        return bVar2 == null ? (v23.b) list.get(0) : bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1.f424108e == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r25, java.lang.Boolean r26) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.d.b(int, java.lang.Boolean):void");
    }

    public void c(java.lang.String folderName, java.lang.Boolean bool, java.lang.String targetBucketId) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.o.g(folderName, "folderName");
        kotlin.jvm.internal.o.g(targetBucketId, "targetBucketId");
        v23.b a17 = a(this.f415129e, folderName, targetBucketId);
        if (booleanValue) {
            this.f415130f = a17;
        }
        v23.b bVar = this.f415130f;
        if (bVar == null) {
            galleryItem$AlbumItem = null;
        } else if (bVar instanceof v23.c) {
            galleryItem$AlbumItem = ((v23.c) bVar).f432892g;
        } else {
            java.util.List list = bVar.f432887b;
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(bVar.f432886a, list.size());
            galleryItem$AlbumItem2.r(bVar.f432888c);
            galleryItem$AlbumItem2.f138420i = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.a0(list, 0);
            galleryItem$AlbumItem2.f138421m = bVar.f432889d;
            galleryItem$AlbumItem2.f138422n = bVar.f432890e == 2;
            galleryItem$AlbumItem = galleryItem$AlbumItem2;
        }
        e60.y0 y0Var = this.f415128d;
        if (y0Var != null) {
            java.util.List list2 = a17.f432887b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            ea3.p pVar = ((ea3.p$$a) y0Var).f250668a;
            if (!pVar.f250653i) {
                boolean i17 = pVar.i();
                pVar.f250653i = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "doNotifyMediaItemsChangedJob: checkMediaStorage=%s", java.lang.Boolean.valueOf(i17));
                if (pVar.f250653i) {
                    pVar.j();
                }
            }
            pVar.E = galleryItem$AlbumItem;
            ea3.a0 a0Var = new ea3.a0(null);
            a0Var.f250596d = new java.lang.ref.WeakReference(pVar.f250662u);
            a0Var.f250597e = new java.lang.ref.WeakReference(pVar.f250660s);
            pVar.f250647J = new java.util.LinkedList(list2);
            pVar.r();
            a0Var.f250599g = pVar.K;
            a0Var.f250598f = new java.lang.ref.WeakReference(pVar);
            a0Var.f250601i = pVar.I;
            pVar.I = false;
            a0Var.f250600h = valueOf.booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "doNotifyMediaItemsChangedJob %s %s", pVar.E.f138415d, java.lang.Integer.valueOf(list2.size()));
            a0Var.run();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "switchFolderByName: " + a17.f432886a + ", targetBucketId=" + targetBucketId + ", media size=" + a17.f432887b.size());
    }
}
