package kh;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f307859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f307860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f307859d = pVar;
        this.f307860e = animator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307859d.f307882d.onAnimationEnd(this.f307860e);
        return jz5.f0.f302826a;
    }
}
