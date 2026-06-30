package ef0;

/* loaded from: classes8.dex */
public final class j2 implements rk4.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.k2 f252239a;

    public j2(ef0.k2 k2Var) {
        this.f252239a = k2Var;
    }

    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        bw5.v70 d17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tingDiscoverEntry MusicPlayerEvent.callback event: ");
        sb6.append(i17);
        sb6.append(", listenId: ");
        sb6.append((lp0Var == null || (d17 = lp0Var.d()) == null) ? null : d17.getListenId());
        sb6.append(", title: ");
        sb6.append(lp0Var != null ? rk4.j5.j(lp0Var) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingDiscoverEntryService", sb6.toString());
        ef0.k2 k2Var = this.f252239a;
        if (i17 == 1 || i17 == 2) {
            ef0.k2.wi(k2Var, qk.m8.f364251e, lp0Var);
            return;
        }
        if (i17 != 3) {
            if (i17 != 5) {
                if (i17 != 6) {
                    if (i17 != 11 && i17 != 12) {
                        return;
                    }
                }
            }
            k2Var.f252252d = null;
            k2Var.Ri(qk.m8.f364250d, false, null);
            return;
        }
        ef0.k2.wi(k2Var, qk.m8.f364252f, lp0Var);
    }
}
