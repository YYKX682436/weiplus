package d04;

/* loaded from: classes13.dex */
public final class v implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d04.y f225522e;

    public v(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, d04.y yVar) {
        this.f225521d = scanCodeMaskView;
        this.f225522e = yVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.sdk.platformtools.u3.i(new d04.u(this.f225521d, this.f225522e), 50L);
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
