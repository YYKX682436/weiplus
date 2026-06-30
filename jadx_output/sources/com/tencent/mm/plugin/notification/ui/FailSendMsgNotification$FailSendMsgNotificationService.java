package com.tencent.mm.plugin.notification.ui;

/* loaded from: classes15.dex */
public abstract class FailSendMsgNotification$FailSendMsgNotificationService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152455d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService.1
        {
            this.__eventId = -1445026585;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent notificationSendFailMsgFinishEvent) {
            int i17 = notificationSendFailMsgFinishEvent.f54536g.f6842a;
            com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService failSendMsgNotification$FailSendMsgNotificationService = com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService.this;
            if (i17 != failSendMsgNotification$FailSendMsgNotificationService.a()) {
                failSendMsgNotification$FailSendMsgNotificationService.a();
            } else {
                failSendMsgNotification$FailSendMsgNotificationService.stopForeground(true);
                com.tencent.mm.plugin.notification.ui.a aVar = failSendMsgNotification$FailSendMsgNotificationService.f152456e;
                if (aVar != null) {
                    aVar.f152470m = false;
                    aVar.d();
                }
                failSendMsgNotification$FailSendMsgNotificationService.stopSelf();
            }
            return false;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.notification.ui.a f152456e = null;

    public abstract int a();

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f152455d.alive();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f152455d.dead();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent != null && intent.getExtras() != null) {
            java.lang.String action = intent.getAction();
            if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
                return 2;
            }
            int i19 = intent.getExtras().getInt("notification_type", -1);
            if (po3.p.Ai(i19) == null) {
                return 2;
            }
            this.f152456e = po3.p.Ai(i19);
            if (action.startsWith("com.tencent.failnotification.omit")) {
                if (this.f152456e.f152462e != null) {
                    com.tencent.mm.plugin.notification.base.c cVar = (com.tencent.mm.plugin.notification.base.c) this.f152456e.f152462e;
                    cVar.getClass();
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.notification.base.b(cVar));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotificaiton.resend")) {
                if (this.f152456e.f152462e != null) {
                    android.app.Notification notification = this.f152456e.f152458a;
                    z2.k0 k0Var = this.f152456e.f152459b;
                    com.tencent.mm.plugin.notification.ui.a aVar = this.f152456e;
                    if (aVar != null) {
                        aVar.f152470m = true;
                    }
                    android.app.Notification notification2 = aVar.f152458a;
                    if (notification2 != null) {
                        notification2.priority = 0;
                    }
                    if (notification2 == null) {
                        aVar.d();
                    }
                    com.tencent.mm.plugin.notification.base.c cVar2 = (com.tencent.mm.plugin.notification.base.c) this.f152456e.f152462e;
                    cVar2.getClass();
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.notification.base.a(cVar2));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.click")) {
                if (this.f152456e.f152463f != null) {
                    com.tencent.mm.plugin.notification.base.d dVar = (com.tencent.mm.plugin.notification.base.d) this.f152456e.f152463f;
                    dVar.getClass();
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    com.tencent.mm.plugin.notification.base.j jVar = dVar.f152435a;
                    g0Var.d(11425, java.lang.Integer.valueOf(jVar.l()), 1, 0, 0);
                    jVar.a();
                    jVar.p();
                    if (!jVar.f152445c) {
                        jVar.f152444b.a();
                    }
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.dismiss")) {
                com.tencent.mm.plugin.notification.ui.a aVar2 = this.f152456e;
                aVar2.f152469l = false;
                aVar2.f152470m = false;
                com.tencent.mm.plugin.notification.ui.d dVar2 = aVar2.f152464g;
                if (dVar2 != null) {
                    ((com.tencent.mm.plugin.notification.base.e) dVar2).f152436a.w();
                }
                stopSelf();
            }
        }
        return 2;
    }
}
