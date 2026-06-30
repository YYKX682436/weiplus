package k41;

/* loaded from: classes11.dex */
public final class r0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f304039f = {l75.n0.getCreateSQLs(k41.g0.f303995y1, "OpenIMKefuContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f304040d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f304041e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(l75.k0 storage) {
        super(storage, k41.g0.f303995y1, "OpenIMKefuContact", dm.u8.D);
        kotlin.jvm.internal.o.g(storage, "storage");
        l75.e0 e0Var = k41.g0.f303995y1;
        this.f304040d = storage;
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        kotlin.jvm.internal.o.f(Bi, "getContactStg(...)");
        this.f304041e = Bi;
    }

    @Override // l75.s0
    public void extraStepsAfterNotifying(l75.w0 w0Var) {
        fs.g.b(k41.p0.class, new k41.q0(w0Var));
    }

    public final k41.g0 y0(java.lang.String username) {
        k41.g0 g0Var;
        kotlin.jvm.internal.o.g(username, "username");
        android.database.Cursor f17 = this.f304040d.f("SELECT *, rowid FROM OpenIMKefuContact WHERE username = " + d95.b0.O(username), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            g0Var = new k41.g0();
            g0Var.convertFrom(f17);
            g0Var.f303997x1 = g0Var.systemRowid;
            g0Var.f303996p1 = true;
        } else {
            g0Var = null;
        }
        vz5.b.a(f17, null);
        return g0Var;
    }
}
