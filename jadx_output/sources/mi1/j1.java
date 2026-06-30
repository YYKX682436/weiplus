package mi1;

/* loaded from: classes3.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f326595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.animation.Animator animator) {
        super(1);
        this.f326595d = animator;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        lifecycle.b(new mi1.i1(this.f326595d));
        return jz5.f0.f302826a;
    }
}
