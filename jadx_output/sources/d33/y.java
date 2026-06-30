package d33;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226301d = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.E;
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226301d;
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout V6 = imageCropUI.V6();
        V6.setVisibility(0);
        V6.setShowBorder(false);
        V6.f(imageCropUI.W6(), ru3.o.f399765f);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String X6 = imageCropUI.X6();
        kotlin.jvm.internal.o.f(X6, "access$getImgPath(...)");
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.g(V6, currentTimeMillis, X6, true, null, imageCropUI.D, 8, null);
        V6.j();
        return jz5.f0.f302826a;
    }
}
