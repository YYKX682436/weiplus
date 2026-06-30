package d04;

/* loaded from: classes8.dex */
public final class l2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d04.g f225457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f225459f;

    public l2(d04.g gVar, com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView, sz3.c1 c1Var) {
        this.f225457d = gVar;
        this.f225458e = scanProductNewMaskDecorView;
        this.f225459f = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView mRectView;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView = this.f225458e;
        mRectView = scanProductNewMaskDecorView.getMRectView();
        mRectView.setVisibility(8);
        this.f225457d.a();
        d04.h hVar = scanProductNewMaskDecorView.f159780t;
        if (hVar != null) {
            hVar.b(this.f225459f.f413977d, 99998);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f225457d.b();
    }
}
