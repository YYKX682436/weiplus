package cy5;

/* loaded from: classes13.dex */
public class a extends by5.l0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f224877e;

    public a(java.lang.String str) {
        this.f224877e = str;
        this.f36529a = str + "Scheduler";
    }

    @Override // by5.l0
    public boolean D(by5.n0 n0Var, by5.n0 n0Var2) {
        if (n0Var.f36573l == n0Var2.f36573l && E(n0Var.f36574m.f36555w, n0Var2.f36574m.f36555w)) {
            return super.D(n0Var, n0Var2);
        }
        return false;
    }

    @Override // by5.l0
    public java.lang.String k(boolean z17) {
        if (z17) {
            java.lang.String g17 = com.tencent.xweb.c.z().g("UPDATE_FORWARD_SPEED_CONFIG", "tools");
            return android.text.TextUtils.isEmpty(g17) ? com.tencent.xweb.b.m().g("UPDATE_FORWARD_SPEED_CONFIG", "tools") : g17;
        }
        java.lang.String g18 = com.tencent.xweb.c.z().g("UPDATE_SPEED_CONFIG", "tools");
        return android.text.TextUtils.isEmpty(g18) ? com.tencent.xweb.b.m().g("UPDATE_SPEED_CONFIG", "tools") : g18;
    }

    @Override // by5.l0
    public java.lang.String l() {
        java.lang.String g17 = com.tencent.xweb.c.z().g("UPDATE_SCHEDULE_TIME_RANGE_BIND", "tools");
        return android.text.TextUtils.isEmpty(g17) ? super.l() : g17;
    }

    @Override // by5.l0
    public java.lang.String n() {
        return com.tencent.xweb.c.z().g("FREE_FETCH_CONFIG_TIME_ZONE", "tools");
    }

    @Override // by5.l0
    public int o() {
        return 15;
    }

    @Override // by5.l0
    public java.lang.String r() {
        return this.f224877e;
    }
}
