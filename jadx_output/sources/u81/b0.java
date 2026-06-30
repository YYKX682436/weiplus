package u81;

/* loaded from: classes7.dex */
public final class b0 extends u81.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(u81.f0 f0Var, u81.k0 k0Var) {
        super(k0Var);
        this.f425407e = f0Var;
    }

    @Override // u81.j0, k75.c
    public void a() {
        super.a();
        k75.j jVar = this.f425407e.f304847e;
        u81.u uVar = u81.u.NONE;
        jVar.removeMessages(11);
        this.f425407e.f304847e.removeMessages(4);
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f425407e.f425424v.C0();
        if (C0 != null) {
            C0.q1();
        }
    }

    @Override // k75.c
    public void b() {
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        if (u81.u.a(message.what).ordinal() != 1) {
            return false;
        }
        u81.f0 f0Var = this.f425407e;
        f0Var.x(f0Var.f425415m);
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "|Foreground";
    }
}
