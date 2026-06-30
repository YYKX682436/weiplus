package d04;

/* loaded from: classes13.dex */
public final class o1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout f225475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f225479h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f225480i;

    public o1(com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout, int i17, int i18, int i19, boolean z17, yz5.l lVar) {
        this.f225475d = scanProductListLayout;
        this.f225476e = i17;
        this.f225477f = i18;
        this.f225478g = i19;
        this.f225479h = z17;
        this.f225480i = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout = this.f225475d;
        scanProductListLayout.setAnimating(false);
        int i17 = this.f225477f;
        int i18 = this.f225476e;
        int i19 = i18 - i17;
        boolean z17 = this.f225479h;
        int i27 = this.f225478g;
        if (z17) {
            i27 -= i19;
        }
        scanProductListLayout.g(i18, i27);
        this.f225480i.invoke(1);
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanProductListLayout", "onAnimationEnd");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
