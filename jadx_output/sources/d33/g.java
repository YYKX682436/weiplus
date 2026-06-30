package d33;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226229d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f226229d.getIntent().getIntExtra("CropImageMode", 0));
    }
}
