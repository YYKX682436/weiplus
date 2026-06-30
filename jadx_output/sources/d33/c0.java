package d33;

/* loaded from: classes9.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226208d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226208d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        imageCropUI.setResult(-2);
        imageCropUI.finish();
        return jz5.f0.f302826a;
    }
}
