package e33;

/* loaded from: classes10.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f247454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f247455e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f247456f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f247457g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f247458h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f247459i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f247460m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f247461n = false;

    public s1(e33.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int indexOf;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.widget.TextView textView;
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView;
        android.os.SystemClock.uptimeMillis();
        java.util.LinkedList linkedList = this.f247458h;
        if (linkedList != null) {
            linkedList.size();
        }
        java.util.LinkedList linkedList2 = this.f247458h;
        int i17 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
        if (linkedList2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] mMediaItems is null!");
        } else {
            java.util.HashSet i18 = t23.p0.i();
            if (i18 == null || i18.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "editedMediaSet is invalid.");
            } else {
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                java.util.Iterator it = i18.iterator();
                while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf((galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next())))) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) linkedList2.get(indexOf);
                    if (galleryItem$MediaItem2 != null && galleryItem$MediaItem.f138438p.equals("edit") && !galleryItem$MediaItem2.f138438p.equals("edit")) {
                        linkedList2.set(indexOf, galleryItem$MediaItem);
                    }
                }
                java.lang.System.currentTimeMillis();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f247454d;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "null == adapterRef");
            return;
        }
        e33.b0 b0Var = (e33.b0) weakReference.get();
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "null == adapter");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f247457g;
        if (weakReference2 == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference2.get()) == null) {
            return;
        }
        t23.z1 z1Var = t23.z1.f415313d;
        z1Var.d(this.f247458h);
        boolean z17 = this.f247461n;
        java.util.ArrayList arrayList = b0Var.f247130f;
        if (z17) {
            this.f247461n = false;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            java.util.LinkedList linkedList3 = this.f247458h;
            arrayList.clear();
            arrayList.addAll(linkedList3);
            b0Var.notifyDataSetChanged();
            z1Var.b(t23.p1.f415247d, 0, this.f247458h.size() <= 32 ? this.f247458h.size() : 32, b0Var.I());
        } else {
            java.util.LinkedList linkedList4 = this.f247458h;
            int itemCount = (b0Var.getItemCount() - b0Var.z()) - b0Var.f247140s.size();
            int size = linkedList4.size();
            if (itemCount < size) {
                arrayList.addAll(linkedList4.subList(itemCount, size));
                b0Var.notifyItemRangeInserted(b0Var.z() + itemCount, b0Var.getItemCount());
            }
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.ref.WeakReference weakReference3 = this.f247455e;
        if (weakReference3 == null) {
            return;
        }
        android.app.ProgressDialog progressDialog = (android.app.ProgressDialog) weakReference3.get();
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        i33.b1 b1Var = (i33.b1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(i33.b1.class);
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "[NotifyMediaItemsChanged] cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138508s2));
            if (b1Var != null && b1Var.f288165m > 0) {
                b1Var.f288162g.A += java.lang.System.currentTimeMillis() - b1Var.f288165m;
                b1Var.f288165m = 0L;
            }
        }
        java.lang.ref.WeakReference weakReference4 = this.f247460m;
        if (weakReference4 != null && (imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) weakReference4.get()) != null) {
            imageFolderMgrView.setFavItemCount(this.f247458h.size());
        }
        if (this.f247456f == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f247459i) || (textView = (android.widget.TextView) this.f247456f.get()) == null) {
            return;
        }
        java.lang.String B = b0Var.B(((androidx.recyclerview.widget.GridLayoutManager) recyclerView.getLayoutManager()).w());
        if (com.tencent.mm.sdk.platformtools.t8.K0(B) || !B.equals("album_business_bubble_media_by_coordinate")) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(this.f247459i.concat("附近的照片和视频"));
        textView.postDelayed(new e33.r1(this, textView), 2000L);
    }

    public java.lang.String toString() {
        return super.toString() + "|NotifyMediaItemsChanged";
    }
}
