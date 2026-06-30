package u81;

/* loaded from: classes7.dex */
public final class y extends u81.t {

    /* renamed from: f, reason: collision with root package name */
    public boolean f425488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f425489g = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        boolean z17;
        super.a();
        if (this.f425489g.f425427y.get()) {
            com.tencent.mars.xlog.Log.e(this.f425489g.f425423u, "invokeEnterMethods: %s, sm stopped", "|BackgroundTemporary");
            return;
        }
        if (this.f425489g.f425424v.E0() == null) {
            com.tencent.mars.xlog.Log.e(this.f425489g.f425423u, "invokeEnterMethods: %s, NULL sysConfig, transitionTo StateSuspend", "|BackgroundTemporary");
            u81.f0 f0Var = this.f425489g;
            if (f0Var.f425425w) {
                u81.f0.r(f0Var);
                return;
            } else {
                f0Var.x(f0Var.f425416n);
                return;
            }
        }
        if (this.f425489g.f425424v.E0().f305850p == Integer.MAX_VALUE) {
            return;
        }
        android.os.Message d17 = this.f425489g.d();
        if (d17 != null) {
            u81.u uVar = u81.u.NONE;
            if (5 != d17.what) {
                java.lang.Object obj = d17.obj;
                if (obj instanceof android.os.Message) {
                    android.os.Message message = (android.os.Message) obj;
                    if (5 == message.what) {
                        message.recycle();
                    }
                }
            }
            z17 = true;
            com.tencent.mars.xlog.Log.i(this.f425489g.f425423u, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", java.lang.Boolean.valueOf(z17));
            android.os.Message obtain = android.os.Message.obtain(this.f425489g.f304847e);
            u81.u uVar2 = u81.u.NONE;
            obtain.what = 4;
            android.os.Bundle bundle = new android.os.Bundle(1);
            bundle.putBoolean("awakenInBackground", z17);
            obtain.obj = bundle;
            this.f425489g.f304847e.sendMessageDelayed(obtain, this.f425489g.f425424v.E0().f305850p * 1000);
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i(this.f425489g.f425423u, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", java.lang.Boolean.valueOf(z17));
        android.os.Message obtain2 = android.os.Message.obtain(this.f425489g.f304847e);
        u81.u uVar22 = u81.u.NONE;
        obtain2.what = 4;
        android.os.Bundle bundle2 = new android.os.Bundle(1);
        bundle2.putBoolean("awakenInBackground", z17);
        obtain2.obj = bundle2;
        this.f425489g.f304847e.sendMessageDelayed(obtain2, this.f425489g.f425424v.E0().f305850p * 1000);
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f425489g.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(4);
        this.f425488f = false;
        this.f425489g.H.b(this);
    }

    @Override // u81.t, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        if (ordinal != 3) {
            if (ordinal != 6) {
                if (ordinal != 18) {
                    return super.c(message);
                }
                this.f425488f = false;
                this.f425489g.H.b(this);
                return true;
            }
            this.f425488f = true;
            this.f425489g.H.a(this);
            com.tencent.mars.xlog.Log.i(this.f425489g.f304846d, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF, no suicide");
            com.tencent.mars.xlog.Log.i(this.f425489g.f425423u, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF");
            u81.f0 f0Var = this.f425489g;
            f0Var.x(f0Var.f425418p);
            return true;
        }
        if (this.f425489g.f425424v.x0().t()) {
            u81.f0 f0Var2 = this.f425489g;
            com.tencent.mars.xlog.Log.i(f0Var2.f425423u, "%s process TO_SUSPEND_FROM_BACKGROUND, transfer to onSuspendTimeout directly due to HeadlessPage, appId:%s", "|BackgroundTemporary", f0Var2.f425424v.f74803n);
            this.f425489g.w();
            return true;
        }
        u81.f0 f0Var3 = this.f425489g;
        if (f0Var3.f425425w) {
            if (this.f425488f) {
                u81.e0.a(f0Var3.C, 2);
            }
            u81.f0.r(this.f425489g);
        } else if (this.f425488f) {
            f0Var3.x(f0Var3.f425417o);
        } else {
            f0Var3.x(f0Var3.f425416n);
        }
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "|BackgroundTemporary";
    }
}
