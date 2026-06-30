package d33;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(3);
        this.f226256d = imageCropUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String mediaPath = (java.lang.String) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(loadedCallback, "loadedCallback");
        pm0.v.K(null, new d33.k(mediaPath, this.f226256d, imageView, loadedCallback));
        return jz5.f0.f302826a;
    }
}
