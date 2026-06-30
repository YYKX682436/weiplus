package wn4;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447555e;

    public m(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, java.lang.String str) {
        this.f447554d = tinkerSyncResponse;
        this.f447555e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c83.e.b(this.f447554d);
        try {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f447555e);
                java.lang.String l17 = c83.e.l(this.f447554d.f142416o);
                java.lang.String i17 = c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.String o17 = r6Var.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                long c17 = c01.id.c();
                int b17 = w73.e.b(i17, o17, l17, this.f447554d.f142416o);
                long c18 = c01.id.c() - c17;
                wn4.x xVar = wn4.x.f447571a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "merge bs diff costTime:" + (c01.id.c() - c17) + ' ' + o17 + ' ' + l17 + " retCode:" + b17);
                ak0.z.b(new java.io.File(o17));
                if (b17 == 0) {
                    w73.f.l(206, b17, c18 / 1000, 2L, 1L);
                } else {
                    w73.f.l(205, b17, c18 / 1000, 2L, 1L);
                }
                if (b17 == 0) {
                    wn4.x xVar2 = wn4.x.f447571a;
                    java.lang.String newApkMd5 = this.f447554d.f142416o;
                    kotlin.jvm.internal.o.f(newApkMd5, "newApkMd5");
                    if (xVar2.c(newApkMd5)) {
                        ((ku5.t0) ku5.t0.f312615d).B(wn4.l.f447553d);
                    } else {
                        xVar2.j();
                        jx3.f.INSTANCE.idkeyStat(1429L, 19L, 1L, false);
                    }
                } else {
                    wn4.x.f447571a.j();
                    jx3.f.INSTANCE.idkeyStat(1429L, 18L, 1L, false);
                }
                c83.e.d(this.f447554d, b17);
            } catch (java.lang.Exception e17) {
                wn4.x xVar3 = wn4.x.f447571a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish e = %s", e17);
                c83.e.d(this.f447554d, -10002);
            }
            c83.e.u();
        } catch (java.lang.Throwable th6) {
            c83.e.d(this.f447554d, -101);
            c83.e.u();
            throw th6;
        }
    }
}
