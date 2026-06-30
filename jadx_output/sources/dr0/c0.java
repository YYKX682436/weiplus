package dr0;

/* loaded from: classes12.dex */
public final class c0 implements a25.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242414a;

    public c0(dr0.t0 t0Var) {
        this.f242414a = t0Var;
    }

    public void a(r45.j4 j4Var) {
        if (j4Var != null && com.tencent.mm.sdk.platformtools.x2.f193077g) {
            dr0.t0 t0Var = this.f242414a;
            t0Var.i().collectAddMsg(j4Var);
            t0Var.f242546f.collectAddMsg(j4Var);
            if (t0Var.f242546f.getAccMainProcStandByAddNsgGroup().keySet().size() >= (mm.k.j(mm.k.N, null, 1, null) ? 5 : 3)) {
                com.tencent.mm.booter.n.b("light_push_too_many_msg_group");
            }
            t0Var.h();
        }
    }

    public void b(int i17, byte[] bArr) {
        dr0.t0 t0Var = this.f242414a;
        if (i17 == 120) {
            t0Var.i().setAccAllVoipCount(t0Var.i().getAccAllVoipCount() + 1);
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = t0Var.f242546f;
            accProcLifeStats.setAccAllVoipCount(accProcLifeStats.getAccAllVoipCount() + 1);
        }
        if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            if (i17 == 120) {
                t0Var.i().setAccMainProcStandByVoipCount(t0Var.i().getAccMainProcStandByVoipCount() + 1);
                com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats2 = t0Var.f242546f;
                accProcLifeStats2.setAccMainProcStandByVoipCount(accProcLifeStats2.getAccMainProcStandByVoipCount() + 1);
            } else {
                if (i17 != 268369921) {
                    return;
                }
                t0Var.i().setAccMainProcStandByMsgCount(t0Var.i().getAccMainProcStandByMsgCount() + 1);
                com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats3 = t0Var.f242546f;
                accProcLifeStats3.setAccMainProcStandByMsgCount(accProcLifeStats3.getAccMainProcStandByMsgCount() + 1);
                if (t0Var.f242546f.getAccMainProcStandByMsgCount() >= 3) {
                    com.tencent.mm.booter.n.b("light_push_too_many_push");
                }
            }
        }
    }
}
