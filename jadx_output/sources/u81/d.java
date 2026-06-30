package u81;

/* loaded from: classes7.dex */
public class d implements r.a {
    public d(u81.e eVar) {
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onRunningStateSuspendTimeout, runtime(" + ((com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1) ((u81.g) obj)).f74864h.f74803n + ')');
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 1);
        return null;
    }
}
