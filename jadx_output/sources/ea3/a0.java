package ea3;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f250596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f250597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f250598f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f250599g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f250600h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f250601i = false;

    public a0(ea3.r rVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int indexOf;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.lang.String str;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.LinkedList linkedList = this.f250599g;
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[NotifyMediaItemsChanged], size %d", objArr);
        java.util.LinkedList linkedList2 = this.f250599g;
        if (linkedList2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppAlbumViewImpl", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            java.util.HashSet i17 = t23.p0.i();
            kotlin.jvm.internal.o.f(i17, "getEditedMediaItemSet(...)");
            if (i17.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i17.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next())))) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) linkedList2.get(indexOf);
                    if (galleryItem$MediaItem2 != null && "edit".equals(galleryItem$MediaItem.f138438p) && !"edit".equals(galleryItem$MediaItem2.f138438p)) {
                        linkedList2.set(indexOf, galleryItem$MediaItem);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f250596d;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "null == adapterRef");
            return;
        }
        ea3.n nVar = (ea3.n) weakReference.get();
        if (nVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f250597e;
        if (weakReference2 == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference2.get()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "isSwitchAlbum: %s needClearSelected：%b.", java.lang.Boolean.valueOf(this.f250600h), java.lang.Boolean.valueOf(this.f250601i));
        if (this.f250600h) {
            this.f250600h = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            str = "MicroMsg.LiteAppAlbumViewImpl";
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            if (this.f250601i) {
                java.util.LinkedList linkedList3 = this.f250599g;
                nVar.f250629f.clear();
                nVar.f250630g.clear();
                nVar.f250629f.addAll(linkedList3);
                nVar.notifyDataSetChanged();
                java.util.ArrayList arrayList2 = nVar.f250630g;
                java.lang.ref.WeakReference weakReference3 = this.f250598f;
                if (weakReference3 != null && weakReference3.get() != null) {
                    ((ea3.p) this.f250598f.get()).n(arrayList2);
                }
            } else {
                java.util.LinkedList linkedList4 = this.f250599g;
                java.util.ArrayList arrayList3 = nVar.f250629f;
                arrayList3.clear();
                arrayList3.addAll(linkedList4);
                nVar.notifyDataSetChanged();
                ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                t23.p0.m().addAll(nVar.f250630g);
            }
        } else {
            str = "MicroMsg.LiteAppAlbumViewImpl";
            java.util.LinkedList linkedList5 = this.f250599g;
            int itemCount = (nVar.getItemCount() - nVar.y()) - nVar.f250635o.size();
            int size = linkedList5.size();
            if (itemCount < size) {
                nVar.f250629f.addAll(linkedList5.subList(itemCount, size));
                nVar.notifyItemRangeInserted(nVar.y() + itemCount, nVar.getItemCount());
            }
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i(str2, "[NotifyMediaItemsChanged] adapter set data, cost %s ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - uptimeMillis));
        if (((ea3.p) this.f250598f.get()).f250656o) {
            com.tencent.mars.xlog.Log.i(str2, "needOnAlbumChangeNotify!");
            ((ea3.p) this.f250598f.get()).f250656o = false;
            ea3.p pVar = (ea3.p) this.f250598f.get();
            pVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).h(new ea3.r(pVar), "liteappphotoalbum_onalbumchanged");
        }
        com.tencent.mars.xlog.Log.i(str2, "[NotifyMediaItemsChanged] finish");
    }

    public java.lang.String toString() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
