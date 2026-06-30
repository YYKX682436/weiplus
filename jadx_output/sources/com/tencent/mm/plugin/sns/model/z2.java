package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f164794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.a3 f164795e;

    public z2(com.tencent.mm.plugin.sns.model.a3 a3Var, r45.b50 b50Var) {
        this.f164795e = a3Var;
        this.f164794d = b50Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2");
        com.tencent.mm.plugin.sns.model.b3 b3Var = this.f164795e.f164074a;
        com.tencent.mm.plugin.sns.model.c3 c3Var = b3Var.f164091c;
        r45.b50 b50Var = this.f164794d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = b3Var.f164090b;
        c3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            r45.l76 l76Var = (r45.l76) new r45.l76().parseFrom(b50Var.f370531e.f371841f.g());
            long j17 = l76Var.f379203d;
            long j18 = l76Var.f379204e;
            r45.k76 k76Var = l76Var.f379205f;
            java.lang.String str = l76Var.f379207h;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "process action " + k76Var.f378462h + " " + j17 + " " + str2);
            switch (k76Var.f378462h) {
                case 9:
                    z18 = true;
                    c3Var.L(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 10:
                    z18 = true;
                    c3Var.J(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 11:
                    z18 = true;
                    c3Var.R(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 12:
                    z18 = true;
                    c3Var.K(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 13:
                    z18 = true;
                    c3Var.N(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 14:
                    z18 = true;
                    c3Var.M(l76Var, k76Var, j17, j18, str2, n3Var);
                    break;
                case 15:
                    com.tencent.mm.plugin.sns.storage.u1.b(j17);
                    com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
                    timeLine.showFlag = 1;
                    W0.setTimeLine(timeLine);
                    com.tencent.mm.plugin.sns.model.l4.Fj().v3(j17, W0);
                    z18 = true;
                    break;
                case 16:
                    c3Var.P(j17, k76Var.f378473v, l76Var);
                    z18 = true;
                    break;
                case 17:
                    c3Var.Q(j17);
                    z18 = true;
                    break;
                default:
                    z18 = true;
                    com.tencent.mm.plugin.sns.model.c3.O(l76Var);
                    break;
            }
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).i7(j17, o75.b.f343583d);
            com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.x2(c3Var, !com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 2) ? z18 : false, k76Var, n3Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            z17 = z18;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            z17 = false;
        }
        if (!z17) {
            this.f164795e.f164074a.f164090b.sendEmptyMessage(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1$2");
    }
}
