package d33;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout) {
        super(0);
        this.f226201d = wxMediaCropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f226201d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = new com.tencent.mm.ui.widget.cropview.CropLayout(context);
        cropLayout.setHasBorder(false);
        cropLayout.setEnableScale(true);
        cropLayout.setEnableFling(true);
        cropLayout.setEnableTouch(true);
        cropLayout.setEnableOverScroll(false);
        return cropLayout;
    }
}
