package e33;

/* loaded from: classes10.dex */
public class r0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247448a;

    public r0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247448a = albumPreviewUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.CAMERA;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247448a;
        if (booleanValue) {
            albumPreviewUI.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            albumPreviewUI.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
