package u81;

/* loaded from: classes7.dex */
public class c0 extends u81.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u81.f0 f0Var, u81.k0 k0Var) {
        super(k0Var);
        this.f425409e = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        com.tencent.mars.xlog.Log.i(this.f425409e.f425423u, "invokeEnterMethods: %s appId:%s, lifespanAfterSuspend:%d, stopped:%b", getName(), this.f425409e.f425424v.f74803n, java.lang.Integer.valueOf(this.f425409e.f425424v.E0().f305851q), java.lang.Boolean.valueOf(this.f425409e.f425427y.get()));
        if (this.f425409e.f425427y.get()) {
            return;
        }
        k75.j jVar = this.f425409e.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.sendEmptyMessageDelayed(11, this.f425409e.f425424v.E0().f305851q * 1000);
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f425409e.f425424v.C0();
        if (C0 != null) {
            C0.n1();
        }
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f425409e.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(11);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal == 2) {
            u81.f0 f0Var = this.f425409e;
            f0Var.x(f0Var.f425414i);
            return true;
        }
        if (ordinal != 4) {
            if (ordinal == 7) {
                com.tencent.mars.xlog.Log.i(this.f425409e.f425423u, "processMessage: %s, ON_SUSPEND_TIMEOUT, appId:%s", getName(), this.f425409e.f425424v.f74803n);
                this.f425409e.w();
                return true;
            }
            if (ordinal != 19) {
                if (ordinal != 23) {
                    return false;
                }
                u81.f0 f0Var2 = this.f425409e;
                if (f0Var2.f425425w) {
                    u81.e0.a(f0Var2.C, 4);
                    d();
                }
                return true;
            }
        }
        u81.f0 f0Var3 = this.f425409e;
        f0Var3.x(f0Var3.f425415m);
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f425409e.f425424v.C0();
        if (C0 != null) {
            C0.q1();
        }
        return true;
    }

    public void d() {
        u81.f0 f0Var = this.f425409e;
        if (f0Var.C.f425412a != 0) {
            f0Var.x(f0Var.f425417o);
        }
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "|Suspend";
    }
}
