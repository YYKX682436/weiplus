package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f177659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f177660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.l0 f177661f;

    public j0(com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var, byte[] bArr, boolean z17) {
        this.f177661f = l0Var;
        this.f177659d = bArr;
        this.f177660e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = this.f177659d;
        if (bArr != null) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = this.f177661f;
            l0Var.f177678g.lock();
            boolean z17 = this.f177660e;
            if (z17) {
                java.lang.String str = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177670r;
                if (com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mm.vfs.w6.g(str, true);
                }
                com.tencent.mm.vfs.w6.u(str);
                l0Var.f177676e = null;
            } else {
                java.lang.String str2 = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177671s;
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    com.tencent.mm.vfs.w6.g(str2, true);
                }
                com.tencent.mm.vfs.w6.u(str2);
                l0Var.f177677f = null;
            }
            l0Var.f177678g.unlock();
            try {
                java.lang.String str3 = java.lang.System.currentTimeMillis() + "";
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = z17 ? com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177670r : com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177671s;
                objArr[1] = str3;
                objArr[2] = java.lang.Boolean.valueOf(z17);
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "saveCacheToDisk, dir: %s, name: %s, save: %s", objArr);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(z17 ? com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177670r : com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177671s);
                sb6.append(str3);
                com.tencent.mm.vfs.w6.R(sb6.toString(), bArr);
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "finish saveCacheToDisk, used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", e17, "saveCacheToDisk error: %s", e17.getMessage());
            }
        }
    }
}
