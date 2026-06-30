package d33;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(3);
        this.f226255d = imageCropUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String imgPath = (java.lang.String) obj;
        android.widget.ImageView imgView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        kotlin.jvm.internal.o.g(imgView, "imgView");
        kotlin.jvm.internal.o.g(loadedCallback, "loadedCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "enter previewMatting");
        pm0.v.K(null, new d33.j0(imgPath, this.f226255d, imgView, loadedCallback));
        return jz5.f0.f302826a;
    }
}
