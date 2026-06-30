package d33;

/* loaded from: classes10.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f226220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d33.t0 f226221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f226222f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Matrix matrix, d33.t0 t0Var, com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout) {
        super(1);
        this.f226220d = matrix;
        this.f226221e = t0Var;
        this.f226222f = wxMediaCropLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.cropview.CropLayout layout;
        com.tencent.mm.ui.widget.cropview.CropLayout layout2;
        boolean z17;
        com.tencent.mm.ui.widget.cropview.CropLayout layout3;
        com.tencent.mm.ui.widget.cropview.CropLayout layout4;
        com.tencent.mm.ui.widget.cropview.CropLayout layout5;
        com.tencent.mm.ui.widget.cropview.CropLayout layout6;
        com.tencent.mm.ui.widget.cropview.CropLayout layout7;
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.graphics.Matrix matrix = this.f226220d;
        boolean isIdentity = matrix.isIdentity();
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = this.f226222f;
        d33.t0 t0Var = this.f226221e;
        if (isIdentity) {
            com.tencent.mars.xlog.Log.i("WxMediaCropLayout", "previousMatrix isIdentity");
            t0Var.f226277e.set(it);
            layout3 = wxMediaCropLayout.getLayout();
            t0Var.f226279g.set(layout3.getContentCenterRect());
            layout4 = wxMediaCropLayout.getLayout();
            t0Var.f226280h.set(layout4.getContentOriginalRect());
            layout5 = wxMediaCropLayout.getLayout();
            z17 = false;
            float f17 = layout5.getContentViewScale()[0];
            layout6 = wxMediaCropLayout.getLayout();
            t0Var.f226282j = layout6.getMaxScaleValue();
            layout7 = wxMediaCropLayout.getLayout();
            t0Var.f226283k = layout7.getMinScaleValue();
        } else {
            com.tencent.mars.xlog.Log.i("WxMediaCropLayout", "set previousMatrix");
            it.set(matrix);
            layout = wxMediaCropLayout.getLayout();
            layout.setMaxScaleValue(t0Var.f226282j);
            layout2 = wxMediaCropLayout.getLayout();
            layout2.setMinScaleValue(t0Var.f226283k);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
