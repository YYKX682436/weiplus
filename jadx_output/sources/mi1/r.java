package mi1;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mi1.v vVar) {
        super(0);
        this.f326669d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mi1.u0 u0Var = this.f326669d.f326710i;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("blinkWrapper");
            throw null;
        }
        android.animation.Animator animator = u0Var.f326697f;
        if (animator != null) {
            animator.pause();
        }
        return jz5.f0.f302826a;
    }
}
