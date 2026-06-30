package sn1;

/* loaded from: classes12.dex */
public class h0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.i0 f410011d;

    public h0(sn1.i0 i0Var) {
        this.f410011d = i0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "BackupSendBackupHeartBeat";
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            sn1.i0 i0Var = this.f410011d;
            if (i0Var.f410030e.booleanValue()) {
                return;
            }
            try {
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Exception unused) {
            }
            if (i0Var.f410030e.booleanValue()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupHeartBeatHandler", "start BackupSendBackupHeartBeat thread stopped.");
                return;
            }
            long j17 = i0Var.f410027b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            if (i0Var.f410029d) {
                if (currentTimeMillis >= 5000) {
                    if (i0Var.f410026a != 1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupHeartBeatHandler", "start weak connect Timeout Now! heartBeatTimeStamp[%d], timeDiff[%d]", java.lang.Long.valueOf(i0Var.f410027b), java.lang.Long.valueOf(currentTimeMillis));
                        i0Var.f410026a = 1;
                        return;
                    }
                    return;
                }
            } else if (currentTimeMillis < 10000) {
                i0Var.f410026a = 0;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupHeartBeatHandler", "start send heartbeat req, heartBeatTimeStamp[%d], timeDiff[%d]", java.lang.Long.valueOf(i0Var.f410027b), java.lang.Long.valueOf(currentTimeMillis));
                i0Var.a();
                i0Var.c();
                i0Var.f410029d = true;
            }
        }
    }
}
