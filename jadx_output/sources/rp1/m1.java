package rp1;

/* loaded from: classes14.dex */
public class m1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f398478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f398479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f398480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f398481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398482h;

    public m1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, android.widget.FrameLayout.LayoutParams layoutParams, android.graphics.Point point, android.graphics.Point point2, android.view.View view) {
        this.f398482h = floatBallView;
        this.f398478d = layoutParams;
        this.f398479e = point;
        this.f398480f = point2;
        this.f398481g = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.graphics.Point point = this.f398479e;
        int i17 = point.x;
        android.graphics.Point point2 = this.f398480f;
        int a17 = qp1.e0.a((int) (i17 + ((point2.x - i17) * floatValue)));
        android.widget.FrameLayout.LayoutParams layoutParams = this.f398478d;
        layoutParams.width = a17;
        layoutParams.height = qp1.e0.a((int) (point.y + (floatValue * (point2.y - r0))));
        int i18 = layoutParams.width;
        int i19 = layoutParams.height;
        this.f398482h.f93529f2.post(new rp1.l1(this));
    }
}
