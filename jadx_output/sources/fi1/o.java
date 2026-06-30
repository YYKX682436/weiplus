package fi1;

/* loaded from: classes8.dex */
public class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262792d;

    public o(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView) {
        this.f262792d = hybridOpenMaterialView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262792d;
        hybridOpenMaterialView.A = hybridOpenMaterialView.f86273d.getTranslationY();
        hybridOpenMaterialView.c();
    }
}
