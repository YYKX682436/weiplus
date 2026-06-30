package com.tencent.mm.plugin.notification.ui;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public z2.k0 f152459b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f152460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f152461d;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f152466i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f152469l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f152471n;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Notification f152458a = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.notification.ui.b f152462e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.notification.ui.c f152463f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.notification.ui.d f152464g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152465h = null;

    /* renamed from: j, reason: collision with root package name */
    public android.app.PendingIntent f152467j = null;

    /* renamed from: k, reason: collision with root package name */
    public android.app.PendingIntent f152468k = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f152470m = false;

    public a(int i17) {
        this.f152459b = null;
        this.f152466i = null;
        this.f152469l = false;
        this.f152471n = false;
        this.f152461d = i17;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f152460c = context;
        this.f152459b = new z2.k0(context, n25.a.b());
        this.f152466i = "";
        try {
            b();
            c();
            this.f152471n = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FailSendMsgNotification", "init FailSendMsgNotification error, e:%s", e17.getMessage());
            this.f152471n = false;
        }
        this.f152469l = false;
    }

    public void a() {
        com.tencent.mm.booter.notification.x xVar = (com.tencent.mm.booter.notification.x) c01.d9.f();
        int i17 = this.f152461d;
        xVar.f(i17);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f152460c;
        if (i17 == 1) {
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService.class);
            context.stopService(intent);
        } else if (i17 == 2) {
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService.class);
            context.stopService(intent);
        }
        this.f152470m = false;
        this.f152469l = false;
    }

    public final void b() {
        this.f152459b.f469474r = true;
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f152461d;
        android.content.Context context = this.f152460c;
        if (i17 == 1) {
            intent.setAction("com.tencent.failnotification.omit_msg");
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService.class);
        } else if (i17 == 2) {
            intent.setAction("com.tencent.failnotification.omit_sns");
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService.class);
        }
        intent.putExtra("notification_type", i17);
        this.f152467j = android.app.PendingIntent.getService(context, i17, intent, fp.g0.a(134217728));
        this.f152459b.f469458b.add(new z2.f0(com.tencent.mm.R.drawable.ccb, context.getString(com.tencent.mm.R.string.hay), this.f152467j));
        android.content.Intent intent2 = new android.content.Intent();
        if (i17 == 1) {
            intent2.setAction("com.tencent.failnotificaiton.resend_msg");
            intent2.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService.class);
        } else if (i17 == 2) {
            intent2.setAction("com.tencent.failnotificaiton.resend_sns");
            intent2.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService.class);
        }
        intent2.putExtra("notification_type", i17);
        intent2.addFlags(268435456);
        this.f152468k = android.app.PendingIntent.getService(context, i17, intent2, fp.g0.a(134217728));
        this.f152459b.f469458b.add(new z2.f0(com.tencent.mm.R.drawable.ccc, context.getString(com.tencent.mm.R.string.haz), this.f152468k));
    }

    public final void c() {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f152460c;
        int i17 = this.f152461d;
        if (i17 == 1) {
            intent.setAction("com.tencent.failnotification.click_msg");
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService.class);
        } else if (i17 == 2) {
            intent.setAction("com.tencent.failnotification.click_sns");
            intent.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService.class);
        }
        intent.putExtra("notification_type", i17);
        this.f152459b.f469463g = android.app.PendingIntent.getService(context, i17, intent, fp.g0.a(134217728));
        android.content.Intent intent2 = new android.content.Intent();
        if (i17 == 1) {
            intent2.setAction("com.tencent.failnotification.dismiss_msg");
            intent2.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService.class);
        } else if (i17 == 2) {
            intent2.setAction("com.tencent.failnotification.dismiss_sns");
            intent2.setClass(context, com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService.class);
        }
        intent2.putExtra("notification_type", i17);
        this.f152459b.D.deleteIntent = android.app.PendingIntent.getService(context, i17, intent2, fp.g0.a(134217728));
    }

    public void d() {
        if (!this.f152471n) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FailSendMsgNotification", "when show notification, is not init yet");
            return;
        }
        this.f152459b.m(this.f152466i);
        this.f152459b.f(this.f152460c.getText(com.tencent.mm.R.string.f490495wp));
        z2.k0 k0Var = this.f152459b;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.e(this.f152465h);
        this.f152459b.d(false);
        android.app.Notification b17 = this.f152459b.b();
        this.f152458a = b17;
        if (!this.f152470m) {
            b17.priority = 2;
        }
        c01.m8 f17 = c01.d9.f();
        ((com.tencent.mm.booter.notification.x) f17).n(this.f152461d, this.f152458a, false);
        this.f152469l = true;
    }

    public void e(java.lang.String str) {
        this.f152465h = str;
        d();
    }
}
