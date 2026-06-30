package r64;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p64.a f393062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f393063e;

    public a(r64.b bVar, p64.a aVar, android.os.Bundle bundle) {
        this.f393062d = aVar;
        this.f393063e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl$1");
        this.f393062d.onCallbackFromServer(this.f393063e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl$1");
    }
}
