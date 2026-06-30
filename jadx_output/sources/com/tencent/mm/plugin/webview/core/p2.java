package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f181908e;

    public p2(com.tencent.mm.plugin.webview.core.e3 e3Var, android.net.Uri uri) {
        this.f181907d = e3Var;
        this.f181908e = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context activityContextIfHas = this.f181907d.f181916a.getActivityContextIfHas();
        ((kt.c) i0Var).getClass();
        if (activityContextIfHas == null || (uri = this.f181908e) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        com.tencent.mm.pluginsdk.model.app.w.v(activityContextIfHas, intent, null, null, null);
    }
}
