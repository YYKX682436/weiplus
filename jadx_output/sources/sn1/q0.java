package sn1;

/* loaded from: classes12.dex */
public class q0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.s0 f410077d;

    public q0(sn1.s0 s0Var) {
        this.f410077d = s0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        long j17;
        sn1.s0 s0Var = this.f410077d;
        long j18 = s0Var.f410089f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
        if (currentTimeMillis != 0) {
            long j19 = (s0Var.f410086c / currentTimeMillis) * 1000;
            s0Var.f410085b = j19;
            ((java.util.LinkedList) s0Var.f410094k).offer(java.lang.Long.valueOf(j19));
            try {
                j17 = ((java.lang.Long) ((java.util.LinkedList) s0Var.f410094k).poll()).longValue();
            } catch (java.lang.Exception unused) {
                j17 = 0;
            }
            long j27 = (((s0Var.f410084a * 10) - j17) + s0Var.f410085b) / 10;
            s0Var.f410085b = j27;
            if (j27 <= 0) {
                j27 = 0;
            }
            s0Var.f410085b = j27;
            s0Var.f410084a = j27;
            s0Var.f410086c = 0L;
            s0Var.f410089f = java.lang.System.currentTimeMillis();
            s0Var.f410095l.a();
            long j28 = s0Var.f410085b;
            if (j28 >= 102400) {
                if (s0Var.f410091h != 0) {
                    s0Var.f410091h = 0;
                    s0Var.f410090g = 0L;
                    s0Var.f410095l.b(0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is not low speed now.");
                }
            } else if (j28 < 2) {
                int i17 = s0Var.f410091h;
                if (i17 == 0) {
                    s0Var.f410091h = 1;
                    s0Var.f410095l.b(1);
                    s0Var.f410090g = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", java.lang.Long.valueOf(s0Var.f410090g));
                } else if (i17 == 1) {
                    long j29 = s0Var.f410090g;
                    if (j29 <= 0) {
                        s0Var.f410090g = java.lang.System.currentTimeMillis();
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", java.lang.Long.valueOf(s0Var.f410090g));
                    } else if (java.lang.System.currentTimeMillis() - j29 > 600000) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler low speed overtime, overtime[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - s0Var.f410090g));
                        s0Var.f410091h = 2;
                        s0Var.f410095l.c();
                        s0Var.f410090g = 0L;
                        return false;
                    }
                }
            } else if (s0Var.f410091h != 1) {
                s0Var.f410091h = 1;
                s0Var.f410095l.b(1);
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is weak now.");
            }
        }
        return true;
    }
}
