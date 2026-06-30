package jm3;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f300345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList f300346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.util.LinkedList linkedList, com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList) {
        super(1);
        this.f300345d = linkedList;
        this.f300346e = musicMvFlexLiveList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List snapshotList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snapshotList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((gm3.c) next).f273544e == 3) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            gm3.c cVar = (gm3.c) it6.next();
            gm3.a aVar = cVar.f273547h;
            if (aVar != null && aVar.f273535a == -1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : this.f300345d) {
                    if (obj3 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.Iterator it7 = arrayList2.iterator();
                if (it7.hasNext()) {
                    java.lang.Object next2 = it7.next();
                    if (it7.hasNext()) {
                        long abs = java.lang.Math.abs(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) next2).f138435m - aVar.f273536b);
                        do {
                            java.lang.Object next3 = it7.next();
                            long abs2 = java.lang.Math.abs(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) next3).f138435m - aVar.f273536b);
                            if (abs > abs2) {
                                next2 = next3;
                                abs = abs2;
                            }
                        } while (it7.hasNext());
                    }
                    obj2 = next2;
                } else {
                    obj2 = null;
                }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) obj2;
                if (galleryItem$VideoMediaItem != null) {
                    java.lang.String str = "local_" + galleryItem$VideoMediaItem.f138434i;
                    kotlin.jvm.internal.o.g(str, "<set-?>");
                    cVar.f273543d = str;
                    aVar.f273535a = galleryItem$VideoMediaItem.f138434i;
                    aVar.f273537c = galleryItem$VideoMediaItem.f138430e;
                    aVar.f273538d = galleryItem$VideoMediaItem;
                    this.f300346e.y(cVar, false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
