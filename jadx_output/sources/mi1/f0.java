package mi1;

/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.appbrand.widget.halfscreen.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar f326547d;

    public f0(com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar) {
        this.f326547d = baseAppBrandSingleCloseCapsuleBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f326547d.f86498e = false;
    }
}
