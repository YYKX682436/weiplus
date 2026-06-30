package ug3;

/* loaded from: classes11.dex */
public final class o implements vg3.r4 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f427571d;

    public final void b(android.content.Intent intent, java.lang.String str) {
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 36, intent, fp.g0.a(1073741824));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(n25.a.f334319c)) {
            java.lang.String string = gm0.m.v().getString("login_channel_id", "");
            n25.a.f334319c = string;
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).wi();
            } else if (((android.app.NotificationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(n25.a.f334319c) == null) {
                ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).wi();
            }
        }
        z2.k0 k0Var = new z2.k0(context, n25.a.f334319c);
        k0Var.m(null);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f469463g = activity;
        k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490495wp));
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.k(android.media.RingtoneManager.getDefaultUri(2));
        k0Var.e(str);
        android.app.Notification b17 = k0Var.b();
        kotlin.jvm.internal.o.f(b17, "build(...)");
        b17.flags |= 16;
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).Ai(48, b17);
    }

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (!kotlin.jvm.internal.o.b("PushLoginUrlAutoLogin", str) || map == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.deviceid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.wording");
        java.lang.String str5 = str4 == null ? "" : str4;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.icontype"), 0);
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.deviceuuid");
        java.lang.String str7 = str6 == null ? "" : str6;
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.showtype"), 0);
        java.lang.String str8 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLogin.seqid");
        com.tencent.mars.xlog.Log.i("MicroMsg.PushLoginUrlAutoLoginNewXmlReceived", "receive xml, deviceid:" + str3 + ", wording:" + str5 + ", iconType:" + D1 + ", deviceUUID: " + str7 + ", showType: " + D12 + ", seqId: " + (str8 != null ? str8 : ""));
        java.util.concurrent.Future future = this.f427571d;
        if (future != null) {
            future.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ug3.m mVar = new ug3.m(this, str3, str5, D1, str7, D12);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f427571d = t0Var.z(mVar, 1000L, false);
    }
}
