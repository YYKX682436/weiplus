package fi1;

/* loaded from: classes8.dex */
public class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262791d;

    public n(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView) {
        this.f262791d = hybridOpenMaterialView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f262791d.E = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262791d;
        hybridOpenMaterialView.E = false;
        hybridOpenMaterialView.C = hybridOpenMaterialView.f86278i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262791d;
        hybridOpenMaterialView.E = true;
        fi1.t tVar = hybridOpenMaterialView.f86279m;
        if (tVar != null) {
            tVar.getClass();
        }
    }
}
