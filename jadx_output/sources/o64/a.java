package o64;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public p64.a f343207a;

    /* renamed from: b, reason: collision with root package name */
    public p64.b f343208b;

    /* renamed from: c, reason: collision with root package name */
    public k55.k f343209c;

    public q64.a a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        try {
            q64.a b17 = b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.IPCRequestBuilder", "there is something invalid in build!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return null;
        }
    }

    public final q64.a b() {
        p64.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        if (this.f343209c == null) {
            k55.k remoteServiceProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getRemoteServiceProxy();
            this.f343209c = remoteServiceProxy;
            if (remoteServiceProxy == null) {
                com.tencent.mars.xlog.Log.w("SnsAd.IPCRequestBuilder", "the remote service proxy is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
                return null;
            }
        }
        p64.a aVar = this.f343207a;
        if (aVar == null || this.f343208b != null) {
            if (aVar == null && (bVar = this.f343208b) != null && (bVar instanceof p64.a)) {
                this.f343207a = (p64.a) bVar;
            }
        } else if (aVar instanceof p64.b) {
            this.f343208b = (p64.b) aVar;
        }
        r64.b bVar2 = new r64.b();
        p64.a aVar2 = this.f343207a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f393065b = aVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.b bVar3 = this.f343208b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f393064a = bVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy iPCRemoteProxy = new com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy(this.f343209c, bVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        bVar2.f393066c = iPCRemoteProxy;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return bVar2;
    }

    public o64.a c(p64.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f343207a = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }

    public o64.a d(p64.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f343208b = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }
}
