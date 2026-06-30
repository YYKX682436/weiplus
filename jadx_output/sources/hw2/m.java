package hw2;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.o f285542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(os5.o oVar) {
        super(1);
        this.f285542d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        os5.o oVar = this.f285542d;
        if (booleanValue) {
            if (oVar != null) {
                ((com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView) oVar).b(true);
            }
        } else if (oVar != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = (com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView) oVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf");
            android.animation.Animator animator = finderLiveCameraOptBeautyPowerfulDetailsView.f115812e;
            if (animator != null && animator.isRunning()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf visibilityAnimator isRunning");
            } else {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(finderLiveCameraOptBeautyPowerfulDetailsView, "alpha", 0.0f, 1.0f);
                ofFloat.addListener(new com.tencent.mm.plugin.finder.live.view.v2(finderLiveCameraOptBeautyPowerfulDetailsView));
                ofFloat.start();
                finderLiveCameraOptBeautyPowerfulDetailsView.f115812e = ofFloat;
            }
        }
        return jz5.f0.f302826a;
    }
}
