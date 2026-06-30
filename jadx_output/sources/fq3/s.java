package fq3;

/* loaded from: classes12.dex */
public class s extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f265555d;

    public s(fq3.w wVar, com.tencent.mm.storage.f9 f9Var) {
        this.f265555d = f9Var;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "C2CFileReceiveTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String j17;
        double[] c17;
        int i17;
        double d17;
        java.lang.String str2;
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.storage.f9 f9Var2 = this.f265555d;
        long createTime = f9Var2.getCreateTime();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (createTime <= nVar.f265528m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityService", "onC2CFileReceive time condition not support %s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, f9Var2.getCreateTime() / 1000));
            return;
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        if (nVar2.f265538w != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            nVar3.f265538w.getClass();
            java.lang.String Q0 = f9Var2.Q0();
            if (com.tencent.mm.storage.z3.R4(f9Var2.Q0()) && f9Var2.A0() == 0) {
                j17 = c01.w9.u(f9Var2.j());
                str = c01.w9.s(f9Var2.j());
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
            } else {
                str = Q0;
                j17 = f9Var2.j();
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "appMsgContent is null");
                return;
            }
            if (com.tencent.mm.storage.z3.R4(f9Var2.Q0()) && f9Var2.A0() == 0) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                c17 = nVar4.f265533r.c(f9Var2.Q0(), "@all");
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.requireAccountInitialized();
                i17 = nVar5.f265533r.i(f9Var2.Q0(), "@all");
            } else {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.requireAccountInitialized();
                c17 = nVar6.f265533r.c(f9Var2.Q0(), f9Var2.Q0());
                fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar7.requireAccountInitialized();
                i17 = nVar7.f265533r.i(f9Var2.Q0(), f9Var2.Q0());
            }
            double max = java.lang.Math.max(java.lang.Math.max(c17[0], c17[1]), c17[2]);
            java.lang.String str3 = "insert auto download file %s %s %s %s %.2f";
            if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
                java.lang.String valueOf = java.lang.String.valueOf(f9Var2.getMsgId());
                fq3.n nVar8 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar8.requireAccountInitialized();
                if (nVar8.f265531p.e(valueOf, f9Var2.I0())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", java.lang.Long.valueOf(f9Var2.getMsgId()), java.lang.Long.valueOf(f9Var2.I0()));
                    return;
                }
                r45.qc qcVar = new r45.qc();
                qcVar.f383818d = valueOf;
                qcVar.f383819e = f9Var2.Q0();
                qcVar.f383820f = str;
                qcVar.f383821g = 2;
                qcVar.f383822h = f9Var2.getCreateTime();
                qcVar.f383823i = i17 < 2 ? 1 : 0;
                qcVar.f383824m = 1;
                qcVar.f383825n = 0L;
                qcVar.f383826o = f9Var2.I0();
                qcVar.f383827p = v17.f348682m;
                qcVar.f383828q = v17.f348690o;
                qcVar.f383830s = max;
                qcVar.f383831t = 1;
                qcVar.f383832u = v17.f348694p;
                com.tencent.mm.pluginsdk.model.app.d D0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(v17.f348694p);
                if (D0 != null) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(D0.field_fileFullPath);
                    if (r6Var.m() && r6Var.C() == D0.field_totalLen) {
                        qcVar.f383825n = java.lang.System.currentTimeMillis();
                        qcVar.f383824m = 6;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "insert auto download file %s %s %s %s %.2f", qcVar.f383819e, com.tencent.mm.sdk.platformtools.t8.h0(qcVar.f383827p), qcVar.f383828q, java.lang.Integer.valueOf(qcVar.f383823i), java.lang.Double.valueOf(qcVar.f383830s));
                fq3.n nVar9 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar9.requireAccountInitialized();
                nVar9.f265531p.d(qcVar);
                if (com.tencent.mm.storage.z3.R4(qcVar.f383819e)) {
                    fq3.n nVar10 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar10.requireAccountInitialized();
                    nVar10.f265533r.k(qcVar.f383819e, "@all");
                }
                fq3.n nVar11 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar11.requireAccountInitialized();
                nVar11.f265533r.k(qcVar.f383819e, qcVar.f383820f);
                kq3.i.d(3, java.lang.System.currentTimeMillis(), qcVar.f383824m, qcVar);
                return;
            }
            if (v17.f348666i == 19) {
                java.util.Iterator it = bt3.g2.A(v17.f348663h0).f387465f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    int i18 = gp0Var.I;
                    if (i18 == 8 || i18 == 10130) {
                        java.lang.String str4 = gp0Var.T;
                        fq3.n nVar12 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar12.requireAccountInitialized();
                        d17 = max;
                        java.lang.String str5 = str3;
                        if (nVar12.f265531p.e(str4, f9Var2.I0())) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", str4, java.lang.Long.valueOf(f9Var2.I0()));
                            str3 = str5;
                            max = d17;
                        } else {
                            r45.qc qcVar2 = new r45.qc();
                            qcVar2.f383818d = str4;
                            qcVar2.f383819e = f9Var2.Q0();
                            qcVar2.f383820f = str;
                            qcVar2.f383821g = 3;
                            qcVar2.f383822h = f9Var2.getCreateTime();
                            qcVar2.f383823i = i17 < 2 ? 1 : 0;
                            qcVar2.f383824m = 1;
                            str2 = str5;
                            qcVar2.f383825n = 0L;
                            qcVar2.f383826o = f9Var2.I0();
                            long j18 = gp0Var.R;
                            qcVar2.f383827p = j18;
                            qcVar2.f383828q = gp0Var.K;
                            f9Var = f9Var2;
                            qcVar2.f383830s = d17;
                            qcVar2.f383831t = 1;
                            qcVar2.f383832u = gp0Var.f375434s;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", str2, qcVar2.f383819e, com.tencent.mm.sdk.platformtools.t8.h0(j18), qcVar2.f383828q, java.lang.Integer.valueOf(qcVar2.f383823i), java.lang.Double.valueOf(qcVar2.f383830s));
                            fq3.n nVar13 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar13.requireAccountInitialized();
                            nVar13.f265531p.d(qcVar2);
                            if (com.tencent.mm.storage.z3.R4(qcVar2.f383819e)) {
                                fq3.n nVar14 = (fq3.n) i95.n0.c(fq3.n.class);
                                nVar14.requireAccountInitialized();
                                nVar14.f265533r.k(qcVar2.f383819e, "@all");
                            }
                            fq3.n nVar15 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar15.requireAccountInitialized();
                            nVar15.f265533r.k(qcVar2.f383819e, qcVar2.f383820f);
                            kq3.i.d(3, java.lang.System.currentTimeMillis(), qcVar2.f383824m, qcVar2);
                        }
                    } else {
                        f9Var = f9Var2;
                        str2 = str3;
                        d17 = max;
                    }
                    str3 = str2;
                    f9Var2 = f9Var;
                    max = d17;
                }
            }
        }
    }
}
