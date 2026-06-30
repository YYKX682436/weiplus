package e33;

/* loaded from: classes10.dex */
public class c2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247183d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f247185f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f247186g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f247187h = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f247184e = new java.util.LinkedList();

    public c2(android.content.Context context) {
        this.f247183d = context;
    }

    public void a(com.tencent.mm.plugin.gallery.model.PrivateAlbumItem privateAlbumItem, java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = this.f247184e;
        if (linkedList2 != null) {
            if (privateAlbumItem != null || linkedList2.size() > 0) {
                if (privateAlbumItem != null) {
                    int i17 = -1;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f247184e)) {
                        i17 = 0;
                        int i18 = -1;
                        while (true) {
                            if (i17 >= this.f247184e.size()) {
                                i17 = i18;
                                break;
                            }
                            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) this.f247184e.get(i17);
                            if (galleryItem$AlbumItem.f138422n) {
                                break;
                            }
                            if (galleryItem$AlbumItem.f138421m) {
                                i18 = i17;
                            }
                            i17++;
                        }
                    }
                    int i19 = i17 + 1;
                    if (i19 < this.f247184e.size()) {
                        this.f247184e.add(i19, privateAlbumItem);
                    } else {
                        this.f247184e.add(privateAlbumItem);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryAdapter", "add favorite album item. insertFavIndex=%d, all album size=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f247184e.size()));
                }
                if (linkedList.size() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryAdapter", "add other private album, size: [%s].", java.lang.Integer.valueOf(linkedList.size()));
                    this.f247184e.addAll(linkedList);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem getItem(int i17) {
        java.util.LinkedList linkedList = this.f247184e;
        if (linkedList == null || i17 >= linkedList.size()) {
            return null;
        }
        return (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) this.f247184e.get(i17);
    }

    public void d(java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryAdapter", "setAlbumFolder: old=%s new=%s", java.lang.Integer.valueOf(this.f247184e.size()), java.lang.Integer.valueOf(linkedList.size()));
        this.f247184e = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f247184e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.c2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
