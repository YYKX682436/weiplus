package w11;

/* loaded from: classes12.dex */
public class x0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f442163d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f442164e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f442165f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o45.yh f442166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f442167h;

    public x0(w11.z0 z0Var, o45.yh yhVar) {
        this.f442167h = z0Var;
        this.f442166g = yhVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        r45.c50 c50Var;
        java.util.LinkedList linkedList;
        int i17;
        int i18;
        com.tencent.mm.plugin.zero.a1 a1Var = new com.tencent.mm.plugin.zero.a1();
        boolean a17 = gm0.j1.a();
        w11.z0 z0Var = this.f442167h;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(z0Var.f442182d, "syncRespHandler acc is not ready STOP :%s", z0Var.f442199x);
            z0Var.f442199x = null;
            return false;
        }
        if (z0Var.f442197v) {
            a1Var.c(z0Var);
            z0Var.f442199x = null;
            return false;
        }
        o45.yh yhVar = z0Var.f442199x;
        java.lang.String str = z0Var.f442182d;
        if (yhVar == null || (c50Var = yhVar.f343039a.f373759e) == null || (linkedList = c50Var.f371295e) == null) {
            com.tencent.mars.xlog.Log.e(str, "syncRespHandler CmdList is null! Stop Processing :%s", yhVar);
            a1Var.c(z0Var);
            z0Var.f442199x = null;
            return false;
        }
        a1Var.b(z0Var);
        this.f442165f++;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (int i19 = 0; i19 < 5; i19 = i18 + 1) {
            if (this.f442163d < linkedList.size()) {
                linkedList.size();
                int i27 = ((r45.b50) linkedList.get(this.f442163d)).f370530d;
                int i28 = ((r45.b50) linkedList.get(this.f442163d)).f370531e.f371839d;
                r45.b50 cmd = (r45.b50) linkedList.get(this.f442163d);
                mm.h hVar = mm.h.f328485a;
                r45.ew4 resp = this.f442166g.f343039a;
                kotlin.jvm.internal.o.g(cmd, "cmd");
                kotlin.jvm.internal.o.g(resp, "resp");
                i17 = 5;
                i18 = i19;
                if (!a1Var.d(this.f442167h, this.f442163d, linkedList.size(), cmd, false, com.tencent.mm.booter.x1.e(), 4)) {
                    com.tencent.mars.xlog.Log.w(str, "DoCmd Failed index:%d", java.lang.Integer.valueOf(this.f442163d));
                }
                this.f442163d++;
            } else {
                i17 = 5;
                i18 = i19;
            }
            if (this.f442163d >= linkedList.size()) {
                this.f442164e += java.lang.System.currentTimeMillis() - currentTimeMillis;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - z0Var.f442200y;
                com.tencent.mars.xlog.Log.i(str, "syncRespHandler process DONE idx:%d size:%d time[%d,%d] count:%d %s", java.lang.Integer.valueOf(this.f442163d), java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(this.f442164e), java.lang.Integer.valueOf(this.f442165f), z0Var.f442199x);
                z0Var.I(z0Var.f442199x);
                a1Var.a(z0Var);
                java.lang.Integer[] numArr = new java.lang.Integer[i17];
                numArr[0] = 240;
                numArr[1] = 239;
                numArr[2] = 238;
                numArr[3] = 237;
                numArr[4] = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX);
                int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.A((int) this.f442164e, new int[]{100, 300, 1000, 3000}, numArr));
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.idkeyStat(99L, q17, 1L, false);
                java.lang.Integer[] numArr2 = new java.lang.Integer[7];
                numArr2[0] = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX);
                numArr2[1] = 248;
                numArr2[2] = 247;
                numArr2[3] = 246;
                numArr2[4] = 245;
                numArr2[i17] = 244;
                numArr2[6] = 243;
                fVar.idkeyStat(99L, com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.A(linkedList.size(), new int[]{0, 1, 2, 3, 5, 10}, numArr2)), 1L, false);
                fVar.idkeyStat(99L, z65.c.f470455a ? 241L : 242L, 1L, false);
                fVar.idkeyStat(99L, z0Var.f442193r, 1L, false);
                fVar.idkeyStat(99L, 0L, 1L, false);
                java.lang.Object[] objArr = new java.lang.Object[8];
                objArr[0] = java.lang.Integer.valueOf(linkedList.size());
                objArr[1] = java.lang.Long.valueOf(currentTimeMillis2);
                objArr[2] = java.lang.Integer.valueOf(z0Var.f442193r);
                objArr[3] = java.lang.Integer.valueOf(z0Var.f442199x.f343039a.f373760f);
                objArr[4] = java.lang.Long.valueOf(this.f442164e);
                objArr[i17] = java.lang.Integer.valueOf(this.f442165f);
                objArr[6] = z0Var.f442198w;
                objArr[7] = java.lang.Integer.valueOf(z65.c.f470455a ? 1 : 2);
                fVar.d(12063, objArr);
                z0Var.f442199x = null;
                return false;
            }
            if (java.lang.System.currentTimeMillis() - currentTimeMillis > 500) {
                this.f442164e += java.lang.System.currentTimeMillis() - currentTimeMillis;
                return true;
            }
        }
        this.f442164e += java.lang.System.currentTimeMillis() - currentTimeMillis;
        return true;
    }
}
