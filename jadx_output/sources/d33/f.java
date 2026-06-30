package d33;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(2);
        this.f226223d = imageCropUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e60.h1 result = (e60.h1) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226223d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 9");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 9, 1L);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_OutputPath", result.f249708b);
            intent.putExtra("CropImage_source", ((java.lang.Number) ((jz5.n) imageCropUI.f138475s).getValue()).intValue());
            imageCropUI.setResult(-1, intent);
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "finish avatar/cover crop");
            imageCropUI.finish();
        } else {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
            imageCropUI.setResult(-1);
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "avatar/cover crop error");
            imageCropUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
