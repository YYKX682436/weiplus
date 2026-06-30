package sn1;

/* loaded from: classes12.dex */
public class j0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f410035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f410037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.k0 f410038g;

    public j0(sn1.k0 k0Var, java.lang.Long l17, int i17, java.lang.Long l18) {
        this.f410038g = k0Var;
        this.f410035d = l17;
        this.f410036e = i17;
        this.f410037f = l18;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        sn1.k0 k0Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        java.lang.Long l17 = this.f410035d;
        long longValue = l17.longValue();
        long longValue2 = valueOf.longValue();
        long j17 = 0;
        while (true) {
            long j18 = longValue2 + 86400000;
            k0Var = this.f410038g;
            if (longValue > j18) {
                break;
            }
            j17 += k0Var.a(longValue);
            longValue += 86400000;
        }
        k0Var.getClass();
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f410036e);
        java.lang.Long l18 = this.f410037f;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupLogManager", "backupAfterLogTimeHandler, backupMode[%d], endAfterLogTime[%d], startAfterLogTime[%d], endAfterLogSize[%d], startAfterLogSize[%d]", valueOf3, valueOf, l17, valueOf2, l18);
        if (valueOf2.longValue() == 0 || valueOf2.longValue() <= l18.longValue()) {
            return false;
        }
        this.f410038g.b(this.f410036e, valueOf.longValue() - l17.longValue(), valueOf2.longValue() - l18.longValue(), true);
        return false;
    }
}
