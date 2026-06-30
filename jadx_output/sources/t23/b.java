package t23;

/* loaded from: classes10.dex */
public final class b implements u23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.d f415115a;

    public b(t23.d dVar) {
        this.f415115a = dVar;
    }

    @Override // u23.o
    public void a() {
    }

    @Override // u23.o
    public void b(java.util.List result, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem;
        kotlin.jvm.internal.o.g(result, "result");
        t23.d dVar = this.f415115a;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "[MediaLoader.LoaderListener] onDataLoad %s", java.lang.Integer.valueOf(result.size()));
        java.util.List list = dVar.f415129e;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(result);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            v23.b bVar = (v23.b) it.next();
            java.lang.String str3 = bVar.f432886a;
            java.util.List list2 = bVar.f432887b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(list2.size());
            boolean z18 = bVar instanceof v23.c;
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
            java.lang.String str4 = bVar.f432888c;
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "name:%s bucketId:%s mediasize:%d isprivate:%b", str3, str4, valueOf, valueOf2);
            if (!list2.isEmpty() || !z18) {
                if (z18) {
                    galleryItem$AlbumItem = ((v23.c) bVar).f432892g;
                } else {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(bVar.f432886a, list2.size());
                    galleryItem$AlbumItem2.r(str4);
                    galleryItem$AlbumItem2.f138420i = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.a0(list2, 0);
                    galleryItem$AlbumItem2.f138421m = bVar.f432889d;
                    galleryItem$AlbumItem2.f138422n = bVar.f432890e == 2;
                    galleryItem$AlbumItem = galleryItem$AlbumItem2;
                }
                linkedList.add(galleryItem$AlbumItem);
            }
        }
        if (!z17) {
            v23.b bVar2 = dVar.f415130f;
            java.lang.String str5 = "";
            if (bVar2 == null || (str = bVar2.f432886a) == null) {
                str = "";
            }
            if (bVar2 != null && (str2 = bVar2.f432888c) != null) {
                str5 = str2;
            }
            dVar.f415130f = dVar.a(list, str, str5);
        }
        e60.x0 x0Var = dVar.f415125a;
        if (x0Var != null) {
            x0Var.a(linkedList, java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // u23.o
    public void c() {
    }
}
