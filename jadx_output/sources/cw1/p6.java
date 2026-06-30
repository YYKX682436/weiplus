package cw1;

/* loaded from: classes12.dex */
public class p6 implements aw1.o {

    /* renamed from: a, reason: collision with root package name */
    public long f223245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.o6 f223246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f223247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI f223248d;

    public p6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI cleanNewUI, cw1.o6 o6Var, long j17) {
        this.f223248d = cleanNewUI;
        this.f223246b = o6Var;
        this.f223247c = j17;
    }

    @Override // aw1.o
    public void a(final int i17, final long j17) {
        if (i17 == 1) {
            this.f223246b.f223206d = true;
            long j18 = this.f223248d.Q.f466044c;
            long j19 = aw1.g1.f14526h;
            if (j19 != 0) {
                long abs = java.lang.Math.abs(j18 - j19) / j19;
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "setWechatSize, lastWeChatSize = " + j19 + ", newSize = " + j18 + ", ratio = " + abs);
                if (abs > 0.1d) {
                    com.tencent.mm.sdk.platformtools.o4.L().B("ReportStorageDetailedTask_Time", 0L);
                }
                aw1.g1.f14526h = j18;
            }
        } else if (i17 == 4) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FIRST_TIME_LOADING_DONE_BOOLEAN, java.lang.Boolean.TRUE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanNewUI", "Load stage done [%d]: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        ku5.u0 u0Var = ku5.t0.f312615d;
        final long j27 = this.f223247c;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.p6$$a
            @Override // java.lang.Runnable
            public final void run() {
                cw1.p6 p6Var = cw1.p6.this;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI cleanNewUI = p6Var.f223248d;
                int i18 = i17;
                long j28 = j17;
                switch (i18) {
                    case 1:
                        java.lang.String str = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.e7(j28);
                        return;
                    case 2:
                        long j29 = p6Var.f223245a;
                        java.lang.String str2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.Z6(j28, j29);
                        return;
                    case 3:
                        p6Var.f223245a = j28;
                        return;
                    case 4:
                        java.lang.String str3 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.b7(j28);
                        try {
                            ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).wi("NewClean", j28);
                            return;
                        } catch (java.lang.Exception unused) {
                            return;
                        }
                    case 5:
                        java.lang.String str4 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.d7(j28);
                        return;
                    case 6:
                        java.lang.String str5 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.a7(j27);
                        return;
                    case 7:
                        java.lang.String str6 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.Y;
                        cleanNewUI.c7(j28);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @Override // aw1.o
    public void b(int i17, int i18, int i19) {
        this.f223248d.N.b(2, i18, i19);
    }

    @Override // aw1.o
    public void onCancelled() {
        com.tencent.mars.xlog.Log.w("MicroMsg.CleanNewUI", "Load cancelled");
    }
}
