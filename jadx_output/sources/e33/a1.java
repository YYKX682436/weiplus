package e33;

/* loaded from: classes10.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f247114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247115f;

    public a1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17) {
        this.f247115f = albumPreviewUI;
        this.f247113d = galleryItem$MediaItem;
        this.f247114e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "ShowAlert");
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file://");
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f247113d;
        sb6.append(android.net.Uri.encode(galleryItem$MediaItem.f138430e));
        intent.setData(android.net.Uri.parse(sb6.toString()));
        int i18 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247115f;
        albumPreviewUI.T7(-1, intent);
        o23.m.f342426a.c(galleryItem$MediaItem.f138430e, albumPreviewUI.J1, this.f247114e);
        albumPreviewUI.finish();
    }
}
