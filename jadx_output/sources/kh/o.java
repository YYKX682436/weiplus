package kh;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f307874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f307875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f307874d = pVar;
        this.f307875e = animator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307874d.f307882d.onAnimationStart(this.f307875e);
        return jz5.f0.f302826a;
    }
}
