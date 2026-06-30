package sn1;

/* loaded from: classes12.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f410026a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f410027b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f410028c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f410029d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f410030e = null;

    public void a() {
        long j17 = this.f410028c;
        this.f410028c = j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue ? 0L : j17 + 1;
        wn1.h hVar = new wn1.h();
        long j18 = this.f410028c;
        hVar.f447431d = j18;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupHeartBeatHandler", "sendBackupHeartBeatRequest send heartbeat req, ack:%d", java.lang.Long.valueOf(j18));
            sn1.i.R(hVar.toByteArray(), 9);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupHeartBeatHandler", e17, "buf to BackupHeartBeatRequest err.", new java.lang.Object[0]);
        }
    }

    public void b(boolean z17) {
        if (z17) {
            iz5.a.g("New BackupHeartBeatHandler EveryTime !", this.f410030e == null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupHeartBeatHandler", "start backup heart beat handler.");
        c();
        this.f410030e = java.lang.Boolean.FALSE;
        ((ku5.t0) ku5.t0.f312615d).q(new sn1.h0(this));
        a();
    }

    public void c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f410027b = java.lang.System.currentTimeMillis();
        this.f410029d = false;
        if (this.f410026a != 0) {
            this.f410026a = 0;
            b(false);
        }
    }
}
