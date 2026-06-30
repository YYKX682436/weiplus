package mx0;

/* loaded from: classes5.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(1);
        this.f332452d = shootComposingPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        jz5.l lVar = (jz5.l) obj;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingPluginLayout", "beginCrop failed");
        } else {
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332452d;
            rootView = shootComposingPluginLayout.getRootView();
            android.content.Context context = shootComposingPluginLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = new com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView(context, null, 0, 6, null);
            cropView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
            cropView.f((com.tencent.maas.camstudio.MJCamSpatialDesc) lVar.f302833d, (android.graphics.Bitmap) lVar.f302834e);
            cropView.setExitOnClickListener(new mx0.x5(shootComposingPluginLayout, cropView, rootView));
            rootView.addView(cropView);
            shootComposingPluginLayout.L1 = cropView;
        }
        return jz5.f0.f302826a;
    }
}
