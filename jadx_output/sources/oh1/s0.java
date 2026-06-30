package oh1;

/* loaded from: classes11.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh1.u0 f345289e;

    public s0(oh1.u0 u0Var, java.lang.String str, android.content.Intent intent) {
        this.f345289e = u0Var;
        this.f345288d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
        boolean isForeground = appUIForegroundOwner.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "now isForeground:%b", java.lang.Boolean.valueOf(isForeground));
        if (isForeground) {
            return;
        }
        oh1.u0 u0Var = this.f345289e;
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "showPCPayPushContentNotification");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent, fp.g0.a(134217728));
        boolean i17 = ip.b.i();
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(null);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490495wp));
        k0Var.e(this.f345288d);
        k0Var.f469463g = activity;
        if (i17) {
            notification.vibrate = com.tencent.mm.sdk.platformtools.t8.f192990b;
        }
        android.app.Notification b17 = k0Var.b();
        b17.icon = com.tencent.mm.R.drawable.c7v;
        b17.flags |= 16;
        b17.sound = android.media.RingtoneManager.getDefaultUri(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "canVibrate:%b", java.lang.Boolean.valueOf(i17));
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).Ai(51, b17);
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).Bi();
        if (u0Var.f345302d) {
            return;
        }
        u0Var.f345302d = true;
        appUIForegroundOwner.addLifecycleCallback(new oh1.t0(u0Var));
    }
}
