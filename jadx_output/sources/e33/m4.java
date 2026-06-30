package e33;

/* loaded from: classes10.dex */
public class m4 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f247360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247361b;

    public m4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
        this.f247361b = imagePreviewUI;
        this.f247360a = galleryItem$VideoMediaItem;
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247361b;
        if (r2Var.equals(imagePreviewUI.X.getTag())) {
            imagePreviewUI.X.setTag(null);
        }
        if (r2Var.f415256e != imagePreviewUI.f138593o.intValue()) {
            return;
        }
        imagePreviewUI.A7(imagePreviewUI.f138605x0, imagePreviewUI.B7(r2Var.f415255d, r2Var.f415259h, imagePreviewUI.f138605x0), this.f247360a);
        imagePreviewUI.i7();
    }
}
