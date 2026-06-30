package m31;

/* loaded from: classes9.dex */
public final class b0 implements fl1.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m31.c0 f323121a;

    public b0(m31.c0 c0Var) {
        this.f323121a = c0Var;
    }

    @Override // fl1.c2
    public void a(fl1.b2 b2Var) {
        m31.c0 c0Var = this.f323121a;
        fl1.g2 g2Var = c0Var.f323127f;
        if (g2Var != null) {
            g2Var.b(this);
        }
        m31.a0 a0Var = c0Var.f323128g;
        if (a0Var != null) {
            a0Var.onDismiss();
        }
    }
}
