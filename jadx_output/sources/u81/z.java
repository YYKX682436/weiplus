package u81;

/* loaded from: classes7.dex */
public final class z extends u81.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u81.f0 f0Var, u81.k0 k0Var) {
        super(f0Var, k0Var);
        this.f425490f = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        this.f425490f.H.a(this);
        android.os.Message obtain = android.os.Message.obtain(this.f425490f.f304847e);
        u81.u uVar = u81.u.NONE;
        obtain.what = 4;
        long j17 = u81.h.f425430e;
        com.tencent.mars.xlog.Log.i(this.f425490f.f304846d, "enter with lifespanMillis:" + j17);
        if (j17 > 0) {
            k75.j jVar = this.f425490f.f304847e;
            if (jVar == null) {
                return;
            }
            jVar.sendMessageDelayed(obtain, j17);
            return;
        }
        k75.j jVar2 = this.f425490f.f304847e;
        if (jVar2 == null) {
            return;
        }
        jVar2.sendMessage(obtain);
    }

    @Override // k75.c
    public void b() {
        k75.j jVar = this.f425490f.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(4);
        this.f425490f.H.b(this);
    }

    @Override // u81.t, k75.c
    public boolean c(android.os.Message message) {
        int ordinal = u81.u.a(message.what).ordinal();
        u81.f0 f0Var = this.f425490f;
        if (ordinal != 3) {
            if (ordinal != 5) {
                if (ordinal != 18) {
                    return super.c(message);
                }
                f0Var.x(f0Var.f425415m);
            }
            return true;
        }
        if (f0Var.f425425w) {
            u81.e0.a(f0Var.C, 2);
            u81.f0.r(f0Var);
        } else {
            f0Var.x(f0Var.f425417o);
        }
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "|StateBackgroundTemporaryDuringScreenOff";
    }
}
