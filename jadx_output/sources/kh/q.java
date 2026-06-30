package kh;

/* loaded from: classes12.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.r f307889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f307890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kh.r rVar, android.animation.ValueAnimator valueAnimator) {
        super(0);
        this.f307889d = rVar;
        this.f307890e = valueAnimator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307889d.f307899d.onAnimationUpdate(this.f307890e);
        return jz5.f0.f302826a;
    }
}
