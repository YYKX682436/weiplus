package fi1;

/* loaded from: classes8.dex */
public class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f262786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262787e;

    public i(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView, boolean z17) {
        this.f262787e = hybridOpenMaterialView;
        this.f262786d = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f262787e.E = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262787e;
        hybridOpenMaterialView.E = false;
        hybridOpenMaterialView.C = this.f262786d;
        hybridOpenMaterialView.A = hybridOpenMaterialView.f86273d.getTranslationY();
        float f17 = hybridOpenMaterialView.A;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f262787e.E = true;
    }
}
