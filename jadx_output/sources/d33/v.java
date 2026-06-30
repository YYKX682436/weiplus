package d33;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI) {
        super(0);
        this.f226286d = wxMediaCropLayout;
        this.f226287e = imageCropUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = this.f226286d;
        wxMediaCropLayout.post(new d33.u(wxMediaCropLayout, this.f226287e));
        wxMediaCropLayout.postInvalidate();
        return jz5.f0.f302826a;
    }
}
