package n3;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.s2 f334371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3.i2 f334372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f334373g;

    public m2(n3.n2 n2Var, android.view.View view, n3.s2 s2Var, n3.i2 i2Var, android.animation.ValueAnimator valueAnimator) {
        this.f334370d = view;
        this.f334371e = s2Var;
        this.f334372f = i2Var;
        this.f334373g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        n3.o2.h(this.f334370d, this.f334371e, this.f334372f);
        this.f334373g.start();
    }
}
