package kh;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.p f307870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f307871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kh.p pVar, android.animation.Animator animator) {
        super(0);
        this.f307870d = pVar;
        this.f307871e = animator;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f307870d.f307882d.onAnimationRepeat(this.f307871e);
        return jz5.f0.f302826a;
    }
}
