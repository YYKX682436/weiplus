package w11;

/* loaded from: classes12.dex */
public class j2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f442066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.k2 f442067e;

    public j2(w11.k2 k2Var) {
        this.f442067e = k2Var;
        this.f442066d = k2Var.f442075d;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = this.f442066d;
        if (i17 <= 0) {
            return false;
        }
        this.f442066d = i17 - 1;
        o45.yh yhVar = new o45.yh();
        yhVar.f343039a.f373759e = new r45.c50();
        int R = com.tencent.mm.sdk.platformtools.t8.R(this.f442067e.f442076e, 1);
        for (int i18 = 0; i18 < R; i18++) {
            java.util.ArrayList arrayList = w11.l2.f442082a;
            r45.j4 j4Var = (r45.j4) arrayList.get(com.tencent.mm.sdk.platformtools.t8.R(arrayList.size() - 1, 0));
            r45.du5 du5Var = new r45.du5();
            java.util.ArrayList arrayList2 = w11.l2.f442083b;
            du5Var.f372756d = ((com.tencent.mm.storage.z3) arrayList2.get(com.tencent.mm.sdk.platformtools.t8.R(arrayList2.size() - 1, 0))).d1();
            du5Var.f372757e = true;
            j4Var.f377558e = du5Var;
            j4Var.f377565o = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            j4Var.f377568r = java.lang.Math.abs(((int) java.lang.System.currentTimeMillis()) % 10000000);
            try {
                r45.b50 b50Var = new r45.b50();
                r45.cu5 cu5Var = new r45.cu5();
                b50Var.f370531e = cu5Var;
                cu5Var.d(j4Var.toByteArray());
                b50Var.f370530d = 5;
                yhVar.f343039a.f373759e.f371295e.add(b50Var);
                yhVar.f343039a.f373759e.f371294d++;
                yhVar.f343039a.f373759e.f371295e.size();
                java.lang.String str = j4Var.f377558e.f372756d;
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TestSyncAddMsg", e17, "", new java.lang.Object[0]);
            }
        }
        r45.ew4 ew4Var = yhVar.f343039a;
        ew4Var.f373760f = 0;
        ew4Var.f373761g = x51.j1.a(w11.c2.f441991a.a());
        r45.ew4 ew4Var2 = yhVar.f343039a;
        ew4Var2.f373758d = 0;
        ew4Var2.f373762h = 0;
        w11.w1.wi().g(yhVar, 0, com.tencent.mm.booter.x1.e());
        return true;
    }
}
