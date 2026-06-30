package p10;

/* loaded from: classes8.dex */
public final class r extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f350984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f350985f;

    public r(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView, float f17, float f18) {
        this.f350983d = magicDebugPanelView;
        this.f350984e = f17;
        this.f350985f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView.G;
        this.f350983d.c(1, this.f350984e, this.f350985f);
    }
}
