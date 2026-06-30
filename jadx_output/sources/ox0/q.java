package ox0;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f349563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSpatialDesc f349564e;

    public q(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView, com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc) {
        this.f349563d = cropView;
        this.f349564e = mJCamSpatialDesc;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = this.f349564e;
        float f17 = mJCamSpatialDesc.getViewPointSize().f47799x / mJCamSpatialDesc.getViewPointSize().f47800y;
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f349563d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView.c(cropView, f17);
        cropView.d();
    }
}
