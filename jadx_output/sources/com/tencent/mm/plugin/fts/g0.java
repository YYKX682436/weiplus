package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class g0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137409a;

    public g0(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137409a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "*** Charging notified: " + intent.getAction());
        boolean equals = intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED");
        com.tencent.mm.plugin.fts.d0 d0Var = this.f137409a;
        if (equals) {
            d0Var.f137386n = true;
        } else if (intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            d0Var.f137386n = false;
        }
    }
}
