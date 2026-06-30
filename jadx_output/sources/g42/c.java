package g42;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f268714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r42.a f268715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g42.f f268716f;

    public c(g42.f fVar, s42.b bVar, r42.a aVar) {
        this.f268716f = fVar;
        this.f268714d = bVar;
        this.f268715e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        s42.b bVar = this.f268714d;
        int i17 = bVar.f402936f;
        r42.a aVar = this.f268715e;
        g42.f fVar = this.f268716f;
        if (i17 == 1) {
            h42.a aVar2 = (h42.a) fVar.f268723f;
            if (aVar != null) {
                j42.f fVar2 = aVar2.f278906a;
                if (fVar2 != null) {
                    fVar2.i(aVar);
                }
            } else {
                aVar2.getClass();
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = fVar.f268729o;
            n3Var.removeMessages(1003);
            fVar.f268728n.getClass();
            n3Var.sendEmptyMessageDelayed(1003, o42.b.f342836f);
        } else {
            h42.a aVar3 = (h42.a) fVar.f268722e;
            if (aVar != null) {
                j42.f fVar3 = aVar3.f278906a;
                if (fVar3 != null) {
                    fVar3.i(aVar);
                }
            } else {
                aVar3.getClass();
            }
        }
        java.lang.String str = bVar.f402931a;
        long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 <= 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 4L, 1L, false);
        } else if (uptimeMillis2 <= 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 5L, 1L, false);
        } else if (uptimeMillis2 <= 1000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 6L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 7L, 1L, false);
        }
        if (uptimeMillis2 <= 1000) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(1409L, 43L, uptimeMillis2, false);
            g0Var.idkeyStat(1409L, 44L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(1409L, 90L, 1L, false);
        if (t42.a.a()) {
            g0Var2.d(20176, str, 1, java.lang.Long.valueOf(uptimeMillis2), 1, "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statCacheCostTime configID : %s, costTime : %d, dataSzie : %d", str, java.lang.Long.valueOf(uptimeMillis2), 1);
        t42.a.b(bVar.f402931a, 5, aVar.f369510s);
    }
}
