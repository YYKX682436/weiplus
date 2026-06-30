package d33;

/* loaded from: classes9.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f226218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f226219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, android.content.Intent intent, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f226217d = imageCropUI;
        this.f226218e = intent;
        this.f226219f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226217d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String str = imageCropUI.Y6() + ((java.lang.String) this.f226219f.f310123d);
        android.content.Intent intent = this.f226218e;
        intent.putExtra("CropImage_OutputPath", str);
        imageCropUI.setResult(-1, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "finish emoji crop");
        imageCropUI.finish();
        return jz5.f0.f302826a;
    }
}
