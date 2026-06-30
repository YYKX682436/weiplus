package d33;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f226205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout, d33.u0 u0Var, long j17, java.lang.String str) {
        super(2);
        this.f226204d = wxMediaCropLayout;
        this.f226205e = j17;
        this.f226206f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView imageView;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = this.f226204d;
        wxMediaCropLayout.getMediaWH()[0] = intValue;
        wxMediaCropLayout.getMediaWH()[1] = intValue2;
        android.graphics.RectF rectF = new android.graphics.RectF(wxMediaCropLayout.f138499i);
        imageView = wxMediaCropLayout.getImageView();
        return com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.d(wxMediaCropLayout, imageView, intValue, intValue2, rectF, this.f226205e, this.f226206f, 2);
    }
}
