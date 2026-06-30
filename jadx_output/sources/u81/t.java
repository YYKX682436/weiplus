package u81;

/* loaded from: classes7.dex */
public abstract class t extends u81.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u81.f0 f0Var, u81.k0 k0Var) {
        super(k0Var);
        this.f425461e = f0Var;
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        u81.f0 f0Var = this.f425461e;
        if (ordinal == 2) {
            f0Var.x(f0Var.f425414i);
            return true;
        }
        if (ordinal == 3) {
            if (f0Var.f425425w) {
                u81.f0.r(f0Var);
            } else {
                f0Var.x(f0Var.f425416n);
            }
            return true;
        }
        if (ordinal != 4 && ordinal != 15 && ordinal != 19) {
            return false;
        }
        f0Var.x(f0Var.f425415m);
        return true;
    }
}
