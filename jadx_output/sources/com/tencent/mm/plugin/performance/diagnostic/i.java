package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f152933a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f152934b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.performance.diagnostic.d f152935c;

    /* renamed from: d, reason: collision with root package name */
    public long f152936d;

    public i(com.tencent.mm.plugin.performance.diagnostic.d dVar) {
        this.f152935c = dVar;
        this.f152933a = "com.tencent.mm.report." + dVar.j();
    }

    public synchronized void a() {
        if (this.f152934b) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(this.f152933a);
        if (fp.h.a(33)) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this, intentFilter, com.tencent.mm.opensdk.constants.ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, null);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this, intentFilter, com.tencent.mm.opensdk.constants.ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION, null, 4);
        }
        this.f152934b = true;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.performance.diagnostic.d.f152913e, "register Reporter for [%s]", this.f152935c.j());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        long longExtra = intent.getLongExtra("PARAM_KEY_TOKEN", 0L);
        java.lang.String action = intent.getAction();
        java.lang.String str = com.tencent.mm.plugin.performance.diagnostic.d.f152913e;
        com.tencent.mars.xlog.Log.i(str, "[%s] received token [%s], action [%s]", this.f152935c.j(), java.lang.Long.valueOf(longExtra), action);
        if (longExtra == 0) {
            com.tencent.mars.xlog.Log.e(str, "[%s] ERR: report token should not be 0", this.f152935c.j());
            return;
        }
        if (longExtra <= this.f152936d) {
            com.tencent.mars.xlog.Log.i(str, "[%s] already reported, xfer to next process, token [%s]", this.f152935c.j(), java.lang.Long.valueOf(longExtra));
            return;
        }
        this.f152936d = longExtra;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.performance.diagnostic.h(this), "HookReporter");
    }
}
