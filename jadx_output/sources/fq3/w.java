package fq3;

@j95.b
/* loaded from: classes12.dex */
public class w extends i95.w implements bx1.t {
    public void Ai(java.lang.String str, long j17, boolean z17, java.lang.String str2) {
        if (gm0.j1.a()) {
            if (!str.matches("\\d+")) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                if (nVar.f265536u != null) {
                    fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar2.requireAccountInitialized();
                    nVar2.f265536u.a(new fq3.r(this, str, j17, z17, str2));
                    return;
                }
                return;
            }
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, java.lang.Long.parseLong(str));
            if (Li.getMsgId() == 0 || Li.A0() != 0) {
                return;
            }
            if (oq3.k.f347394a.c(4, Li.Q0()) == 0) {
                fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar3.requireAccountInitialized();
                if (nVar3.f265536u != null) {
                    fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar4.requireAccountInitialized();
                    nVar4.f265536u.a(new fq3.r(this, str, j17, z17, str2));
                    return;
                }
                return;
            }
            ((fq3.n) i95.n0.c(fq3.n.class)).aj();
            java.lang.String str3 = Li.I0() + "_4";
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.requireAccountInitialized();
            nVar5.A.Z6(str3);
            kq3.i.e(Li);
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: file msg open, msgId:" + Li.getMsgId());
        }
    }

    public void Bi(long j17, java.lang.String str, boolean z17, boolean z18) {
        if (gm0.j1.a()) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            if (nVar.f265536u != null) {
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                nVar2.f265536u.a(new fq3.t(this, j17, str, z17, z18));
            }
        }
    }

    public void Di(java.lang.String str, int i17) {
        if (gm0.j1.a()) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            if (nVar.f265536u != null) {
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                nVar2.f265536u.a(new fq3.v(this, str, i17));
            }
        }
    }

    public void wi(boolean z17, java.lang.String str, long j17, boolean z18, boolean z19, java.lang.String str2) {
        if (gm0.j1.a()) {
            if (!str.matches("\\d+")) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                if (nVar.f265536u != null) {
                    fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar2.requireAccountInitialized();
                    nVar2.f265536u.a(new fq3.q(this, z17, str, j17, z18, z19));
                    return;
                }
                return;
            }
            if (oq3.k.f347394a.c(4, pt0.f0.Li(str2, java.lang.Long.parseLong(str)).Q0()) != 0) {
                if (z17 || !z18) {
                    return;
                }
                ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                ((fq3.n) i95.n0.c(fq3.n.class)).aj().T6(java.lang.String.format("%s_%s", java.lang.Long.valueOf(j17), 4));
                return;
            }
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            if (nVar3.f265536u != null) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                nVar4.f265536u.a(new fq3.q(this, z17, str, j17, z18, z19));
            }
        }
    }
}
