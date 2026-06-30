package e33;

/* loaded from: classes10.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.v1 f247482a;

    public u1(e33.v1 v1Var) {
        this.f247482a = v1Var;
    }

    public void a(java.util.List list, boolean z17) {
        boolean z18;
        e33.b0 b0Var;
        e33.v1 v1Var = this.f247482a;
        java.lang.ref.WeakReference weakReference = v1Var.f247495e;
        if (weakReference != null && (b0Var = (e33.b0) weakReference.get()) != null) {
            if (z17 || b0Var.I() > list.size()) {
                e33.v1.a(v1Var, list);
            } else {
                e33.v1.a(v1Var, list.subList(b0Var.I(), list.size()));
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        e33.t1 t1Var = v1Var.f247498h;
        int i17 = t1Var != null ? t1Var.f247470d : 3;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t23.l2 l2Var = (t23.l2) it.next();
            if (l2Var.f415203c.contains("image")) {
                if (i17 != 2) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, l2Var.f415201a, l2Var.f415202b, "", l2Var.f415203c);
                    b17.f138435m = l2Var.f415204d;
                    linkedList.add(b17);
                    arrayList.add(java.lang.Long.valueOf(l2Var.f415201a));
                }
            } else if (l2Var.f415203c.contains("video") && i17 != 1) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b18 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, l2Var.f415201a, l2Var.f415202b, "", l2Var.f415203c);
                b18.f138435m = l2Var.f415204d;
                linkedList.add(b18);
            }
        }
        e33.t1 t1Var2 = v1Var.f247498h;
        if (t1Var2 != null && t1Var2.f247467a && !arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("QuerySmartGalleryAlbumMediaTask", "switch to smart folder to query live photo size: %d livePhotoOnly: %b", java.lang.Integer.valueOf(arrayList.size()), java.lang.Boolean.valueOf(v1Var.f247498h.f247469c));
            java.util.HashMap Bi = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Bi(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ref.WeakReference weakReference2 = v1Var.f247495e;
            if (weakReference2 != null) {
                arrayList2 = ((e33.b0) weakReference2.get()).f247131g;
            }
            java.util.ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) listIterator.next();
                if (galleryItem$MediaItem.getType() == 1) {
                    if (Bi.containsKey(java.lang.Long.valueOf(galleryItem$MediaItem.f138434i)) && java.lang.Boolean.TRUE.equals(Bi.get(java.lang.Long.valueOf(galleryItem$MediaItem.f138434i)))) {
                        com.tencent.mars.xlog.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask %d is LivePhoto currentListSize: %d", java.lang.Long.valueOf(galleryItem$MediaItem.f138434i), java.lang.Integer.valueOf(arrayList2.size()));
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                z18 = false;
                                break;
                            }
                            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next();
                            long j17 = galleryItem$MediaItem2.f138434i;
                            if (j17 == galleryItem$MediaItem.f138434i) {
                                com.tencent.mars.xlog.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask switch folder, livePhoto is exist >> %d", java.lang.Long.valueOf(j17));
                                listIterator.set(galleryItem$MediaItem2);
                                z18 = true;
                                break;
                            }
                        }
                        if (!z18) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.a(6, galleryItem$MediaItem.f138434i);
                            a17.f138435m = galleryItem$MediaItem.f138435m;
                            qk.s7 s7Var = (qk.s7) i95.n0.c(qk.s7.class);
                            a17.f138430e = ((hs.x) s7Var).wi(qk.k9.f364207d, galleryItem$MediaItem.f138434i + "");
                            a17.f138433h = galleryItem$MediaItem.f138430e;
                            a17.f138438p = galleryItem$MediaItem.f138438p;
                            if (a17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) a17;
                                e33.t1 t1Var3 = v1Var.f247498h;
                                galleryItem$LivePhotoMediaItem.I = (t1Var3 == null || !t1Var3.f247468b) ? 0 : 1;
                            }
                            listIterator.set(a17);
                        }
                    } else if (v1Var.f247498h.f247469c) {
                        listIterator.remove();
                    }
                }
            }
        }
        e33.s1 s1Var = new e33.s1(null);
        s1Var.f247454d = v1Var.f247495e;
        s1Var.f247455e = v1Var.f247496f;
        s1Var.f247458h = linkedList;
        s1Var.f247457g = v1Var.f247497g;
        s1Var.f247461n = z17;
        t23.p0.n().c(s1Var);
        com.tencent.mars.xlog.Log.i("QuerySmartGalleryAlbumMediaTask", "finish page query.");
    }
}
