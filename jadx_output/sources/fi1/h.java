package fi1;

/* loaded from: classes8.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262785d;

    public h(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView) {
        this.f262785d = hybridOpenMaterialView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262785d;
        hybridOpenMaterialView.f86273d.setTranslationY(floatValue);
        hybridOpenMaterialView.c();
    }
}
