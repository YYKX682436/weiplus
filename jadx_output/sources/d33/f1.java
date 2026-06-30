package d33;

/* loaded from: classes10.dex */
public final class f1 implements ml5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d33.t0 f226227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226228b;

    public f1(d33.t0 t0Var, com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout) {
        this.f226227a = t0Var;
        this.f226228b = wxMediaCropLayout;
    }

    @Override // ml5.h
    public void onChange() {
        com.tencent.mm.ui.widget.cropview.CropLayout layout;
        android.graphics.Rect rect = this.f226227a.f226281i;
        layout = this.f226228b.getLayout();
        rect.set(layout.getContentRect());
    }
}
