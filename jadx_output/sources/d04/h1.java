package d04;

/* loaded from: classes13.dex */
public final class h1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout f225426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f225430h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f225431i;

    public h1(com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout scanNewProductListLayout, int i17, int i18, int i19, boolean z17, yz5.l lVar) {
        this.f225426d = scanNewProductListLayout;
        this.f225427e = i17;
        this.f225428f = i18;
        this.f225429g = i19;
        this.f225430h = z17;
        this.f225431i = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout scanNewProductListLayout = this.f225426d;
        scanNewProductListLayout.setAnimating(false);
        int i17 = this.f225428f;
        int i18 = this.f225427e;
        int i19 = i18 - i17;
        boolean z17 = this.f225430h;
        int i27 = this.f225429g;
        if (z17) {
            i27 -= i19;
        }
        scanNewProductListLayout.g(i18, i27);
        this.f225431i.invoke(1);
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanNewProductListLayout", "onAnimationEnd");
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
