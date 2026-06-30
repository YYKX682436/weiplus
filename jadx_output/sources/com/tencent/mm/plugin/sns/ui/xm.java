package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xm extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zm f171572a;

    public xm(com.tencent.mm.plugin.sns.ui.zm zmVar) {
        this.f171572a = zmVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
        if (intent.getAction().equals(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsNetworkMgr", "connChangedBroadcastReceiver");
            com.tencent.mm.plugin.sns.ui.zm zmVar = this.f171572a;
            int a17 = com.tencent.mm.plugin.sns.ui.zm.a(zmVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int b17 = zmVar.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            zmVar.f171701b = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsNetworkMgr", "network change current:%s change:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.zm.a(zmVar)));
            if (com.tencent.mm.plugin.sns.ui.zm.a(zmVar) != a17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                com.tencent.mm.plugin.sns.ui.ym ymVar = zmVar.f171700a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (ymVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    com.tencent.mm.plugin.sns.ui.ym ymVar2 = zmVar.f171700a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                    com.tencent.mm.plugin.sns.ui.zm.a(zmVar);
                    com.tencent.mm.plugin.sns.ui.sv svVar = (com.tencent.mm.plugin.sns.ui.sv) ymVar2;
                    svVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
                    je4.b bVar = je4.b.f299316a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    com.tencent.mm.plugin.sns.ui.uv uvVar = svVar.f170487a;
                    com.tencent.mm.plugin.sns.ui.zm zmVar2 = uvVar.f170597a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsNetworkMgr$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    boolean a18 = bVar.a(zmVar2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    uvVar.f170598b = a18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSnsAutoPlay$p", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$init$1");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr$1");
    }
}
