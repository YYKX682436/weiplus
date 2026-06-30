package e45;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f249371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f249372e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f249373f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f249374g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f249375h;

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int indexOf;
        com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView pinnedHeaderRecyclerView;
        java.util.LinkedList linkedList = this.f249374g;
        if (linkedList != null && linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = this.f249374g;
        if (linkedList2 == null) {
            com.tencent.mars.xlog.Log.e("FS.AlbumFileUIC", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            java.util.HashSet i17 = t23.p0.i();
            if (i17 == null || i17.isEmpty()) {
                com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i17.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next())))) {
                    java.lang.Object obj = linkedList2.get(indexOf);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
                    if (kotlin.jvm.internal.o.b(galleryItem$MediaItem.f138438p, "edit") && !kotlin.jvm.internal.o.b(galleryItem$MediaItem2.f138438p, "edit")) {
                        linkedList2.set(indexOf, galleryItem$MediaItem);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f249371d;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "null == adapterRef");
            return;
        }
        d45.q qVar = weakReference != null ? (d45.q) weakReference.get() : null;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f249373f;
        if (weakReference2 == null || weakReference2 == null || (pinnedHeaderRecyclerView = (com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView) weakReference2.get()) == null || this.f249372e == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f249374g;
        if (linkedList3 != null) {
            t23.z1 z1Var = t23.z1.f415313d;
            t23.z1 z1Var2 = t23.z1.f415313d;
            z1Var2.d(linkedList3);
            if (this.f249375h) {
                this.f249375h = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pinnedHeaderRecyclerView, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                pinnedHeaderRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pinnedHeaderRecyclerView, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                qVar.f226457g.clear();
                qVar.f226457g.addAll(qVar.y(linkedList3));
                qVar.notifyDataSetChanged();
                z1Var2.b(t23.p1.f415247d, 0, linkedList3.size() <= 32 ? linkedList3.size() : 32, qVar.B());
            } else {
                java.util.ArrayList x17 = qVar.x(qVar.f226457g);
                qVar.f226457g = x17;
                int size = x17.size();
                int size2 = linkedList3.size();
                if (size < size2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 : linkedList3.subList(size, size2)) {
                        if (galleryItem$MediaItem3 != null) {
                            arrayList2.add(galleryItem$MediaItem3);
                        }
                    }
                    qVar.f226457g.addAll(arrayList2);
                    qVar.f226457g = qVar.y(qVar.f226457g);
                    qVar.notifyDataSetChanged();
                }
            }
        }
        java.lang.ref.WeakReference weakReference3 = this.f249372e;
        android.app.ProgressDialog progressDialog = weakReference3 != null ? (android.app.ProgressDialog) weakReference3.get() : null;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        progressDialog.dismiss();
        com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - e45.h.C));
    }

    public java.lang.String toString() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
