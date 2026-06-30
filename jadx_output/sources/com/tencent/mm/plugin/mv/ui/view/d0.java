package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f151797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f151798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f151799f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f151800g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f151801h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151802i;

    public d0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151802i = musicMVCardChooseView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int indexOf;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.lang.String str;
        java.util.LinkedList linkedList = this.f151800g;
        if (linkedList != null) {
            linkedList.size();
        }
        int i17 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
        java.util.LinkedList linkedList2 = this.f151800g;
        if (linkedList2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            java.util.HashSet i18 = t23.p0.i();
            kotlin.jvm.internal.o.f(i18, "getEditedMediaItemSet(...)");
            if (i18.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i18.iterator();
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
        java.lang.ref.WeakReference weakReference = this.f151797d;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapterRef");
            return;
        }
        km3.t tVar = (km3.t) weakReference.get();
        if (tVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f151799f;
        if (weakReference2 == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference2.get()) == null || this.f151798e == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f151800g;
        if (linkedList3 != null) {
            ((t23.a2) ((t23.q1) i95.n0.c(t23.q1.class))).getClass();
            t23.z1 z1Var = t23.z1.f415313d;
            z1Var.d(linkedList3);
            boolean z17 = this.f151801h;
            java.util.ArrayList arrayList = tVar.f309261e;
            if (z17) {
                this.f151801h = false;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                str = "MicroMsg.Mv.MusicMVCardChooseView";
                yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                arrayList.clear();
                arrayList.addAll(linkedList3);
                tVar.notifyDataSetChanged();
                t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
                t23.p1 p1Var = t23.p1.f415247d;
                int size = linkedList3.size() <= 32 ? linkedList3.size() : 32;
                int y17 = tVar.y();
                ((t23.a2) q1Var).getClass();
                z1Var.b(p1Var, 0, size, y17);
            } else {
                str = "MicroMsg.Mv.MusicMVCardChooseView";
                int itemCount = tVar.getItemCount();
                java.util.LinkedList linkedList4 = tVar.f309265i;
                int size2 = itemCount - linkedList4.size();
                int size3 = linkedList3.size();
                if (size2 < size3) {
                    arrayList.addAll(linkedList3.subList(size2, size3));
                    tVar.notifyItemRangeInserted(linkedList4.size() + size2, tVar.getItemCount());
                }
            }
        } else {
            str = "MicroMsg.Mv.MusicMVCardChooseView";
        }
        java.lang.ref.WeakReference weakReference3 = this.f151798e;
        android.app.ProgressDialog progressDialog = weakReference3 != null ? (android.app.ProgressDialog) weakReference3.get() : null;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i19 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
            com.tencent.mars.xlog.Log.i(str, "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(currentTimeMillis - 0));
        }
        ((com.tencent.mm.plugin.mv.ui.view.c1) this.f151802i.A1).invoke();
    }

    public java.lang.String toString() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
