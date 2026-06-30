package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f145597f;

    public s0(java.lang.String str, int i17, int i18) {
        this.f145595d = str;
        this.f145596e = i17;
        this.f145597f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f145595d;
        int i17 = this.f145596e;
        int i18 = this.f145597f;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.String str2 = "null" + i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "on saveEffectResource: %s %s %s %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
            com.tencent.mm.vfs.w6.Q(str, str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "saveEffectResource used %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckMoneyEffectResourceMgr", e17, "saveEffectResourceImpl error: %s", e17.getMessage());
        }
    }
}
