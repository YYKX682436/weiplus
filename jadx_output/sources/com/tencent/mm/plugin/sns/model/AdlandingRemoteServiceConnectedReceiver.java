package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class AdlandingRemoteServiceConnectedReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f164054a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver");
        if (intent != null) {
            "com.tencnet.mm.action.adlanding.connected".equals(intent.getAction());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver");
    }
}
