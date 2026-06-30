package d33;

/* loaded from: classes10.dex */
public final class d1 implements ru3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f226214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d33.t0 f226215c;

    public d1(com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout, long j17, d33.t0 t0Var) {
        this.f226213a = wxMediaCropLayout;
        this.f226214b = j17;
        this.f226215c = t0Var;
    }

    @Override // ru3.n
    public void b(android.graphics.RectF rectF) {
        com.tencent.mm.ui.widget.cropview.CropLayout layout;
        kotlin.jvm.internal.o.g(rectF, "rectF");
        int i17 = com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.f138493u;
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = this.f226213a;
        long j17 = wxMediaCropLayout.lockCropMediaId;
        if (j17 == this.f226214b || j17 == 0) {
            wxMediaCropLayout.f138499i.set(rectF);
        }
        rectF.round(this.f226215c.f226278f);
        layout = wxMediaCropLayout.getLayout();
        layout.z(rectF, false);
    }

    @Override // ru3.n
    public void c(boolean z17) {
    }
}
