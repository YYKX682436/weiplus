package com.tencent.mm.plugin.sns.ad.remote.ipc.impl;

/* loaded from: classes4.dex */
public final class IPCRemoteProxy extends k55.b {

    /* renamed from: f, reason: collision with root package name */
    public final r64.b f163187f;

    public IPCRemoteProxy(k55.k kVar, r64.b bVar) {
        super(kVar);
        this.f163187f = bVar;
    }

    @Override // k55.b, k55.e
    public void onCallback(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        android.os.Bundle bundle2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
            try {
                java.lang.Object[] args = getArgs(bundle);
                r64.b bVar = this.f163187f;
                if (bVar != null) {
                    bVar.a((android.os.Bundle) args[0]);
                }
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
            try {
                r64.b bVar2 = new r64.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                bVar2.f393066c = this;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                java.lang.Object[] args2 = getArgs(bundle);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                if (a84.b0.g(args2)) {
                    for (java.lang.Object obj : args2) {
                        if (obj instanceof android.os.Bundle) {
                            bundle2 = (android.os.Bundle) obj;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findParams", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
                bundle2 = null;
                if (bundle2 != null) {
                    bundle2.setClassLoader(com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy.class.getClassLoader());
                    android.os.Bundle b17 = bVar2.b(bVar2, bundle2);
                    if (b17 != null) {
                        bundle.putBundle("result_key", b17);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy");
    }
}
