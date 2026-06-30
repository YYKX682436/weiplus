package wn4;

/* loaded from: classes11.dex */
public final class j implements x73.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447550b;

    public j(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, java.lang.String str) {
        this.f447549a = tinkerSyncResponse;
        this.f447550b = str;
    }

    @Override // x73.i
    public final void a(x73.a aVar) {
        com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService.f142398e = null;
        int i17 = aVar.f452438e;
        c83.e.d(this.f447549a, i17);
        c83.e.u();
        c83.e.e();
        wn4.x xVar = wn4.x.f447571a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk merge finish, maunal retCode = " + i17);
        if (!aVar.f452437d) {
            wn4.x.f447571a.j();
            jx3.f.INSTANCE.idkeyStat(1429L, 18L, 1L, false);
            return;
        }
        wn4.x xVar2 = wn4.x.f447571a;
        java.lang.String newApkMd5 = this.f447550b;
        kotlin.jvm.internal.o.f(newApkMd5, "$newApkMd5");
        if (!xVar2.c(newApkMd5)) {
            xVar2.j();
            jx3.f.INSTANCE.idkeyStat(1429L, 19L, 1L, false);
            return;
        }
        w73.f.k(114);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 114L, 1L, false);
        ((ku5.t0) ku5.t0.f312615d).B(wn4.i.f447548d);
    }
}
