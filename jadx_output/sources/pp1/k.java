package pp1;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f357424f;

    public k(pp1.z zVar, boolean z17, android.animation.ValueAnimator valueAnimator) {
        this.f357422d = zVar;
        this.f357423e = z17;
        this.f357424f = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f357422d;
        boolean z17 = this.f357423e;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        kotlin.jvm.internal.o.d(contentFloatBallView);
        zVar.n(z17, true, 0.0f, contentFloatBallView.getCollapseScale(), false);
        this.f357424f.start();
    }
}
