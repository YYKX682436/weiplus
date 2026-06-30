package u81;

/* loaded from: classes7.dex */
public final class d0 extends u81.c0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f425410f = f0Var;
    }

    @Override // u81.c0, u81.j0, k75.c
    public void a() {
        super.a();
        k75.j jVar = this.f425410f.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(11);
        this.f425410f.H.a(this);
    }

    @Override // u81.c0, k75.c
    public void b() {
        super.b();
        this.f425410f.H.b(this);
    }

    @Override // u81.c0, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal != 5) {
            u81.f0 f0Var = this.f425410f;
            if (ordinal != 7) {
                if (ordinal == 18) {
                    if (f0Var.f425425w) {
                        u81.e0.b(f0Var.C, 2);
                        d();
                    } else {
                        f0Var.x(f0Var.f425416n);
                    }
                    return true;
                }
                if (ordinal != 22) {
                    return super.c(message);
                }
                if (f0Var.f425425w) {
                    u81.e0.b(f0Var.C, 4);
                    d();
                }
                return true;
            }
            com.tencent.mars.xlog.Log.w(f0Var.f304846d, "ignore ON_SUSPEND_TIMEOUT");
        }
        return true;
    }

    @Override // u81.c0
    public void d() {
        u81.f0 f0Var = this.f425410f;
        if (f0Var.C.f425412a != 0) {
            return;
        }
        f0Var.x(f0Var.f425416n);
    }

    @Override // u81.c0, k75.c, k75.a
    public java.lang.String getName() {
        return "|StateSuspendKeepAlive";
    }
}
