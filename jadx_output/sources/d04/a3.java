package d04;

/* loaded from: classes14.dex */
public final class a3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f225375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f225377f;

    public a3(com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView, boolean z17, yz5.a aVar) {
        this.f225375d = scanSharedMaskView;
        this.f225376e = z17;
        this.f225377f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView.G;
        this.f225375d.l(this.f225376e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView.G;
        this.f225375d.l(this.f225376e);
        yz5.a aVar = this.f225377f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
