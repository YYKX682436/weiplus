package kh;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f307851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f307852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f307851d = pVar;
        this.f307852e = animator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307851d.f307882d.onAnimationCancel(this.f307852e);
        return jz5.f0.f302826a;
    }
}
