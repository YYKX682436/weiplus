package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class VoipForegroundService extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f177108g = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f177109d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f177110e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f177111f;

    public VoipForegroundService() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4("check-voip-alive", new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.voip.widget.VoipForegroundService$$a
            @Override // com.tencent.mm.sdk.platformtools.a4
            public final boolean onTimerExpired() {
                int i17 = com.tencent.mm.plugin.voip.widget.VoipForegroundService.f177108g;
                com.tencent.mm.plugin.voip.widget.VoipForegroundService voipForegroundService = com.tencent.mm.plugin.voip.widget.VoipForegroundService.this;
                voipForegroundService.getClass();
                if (!gq4.v.Bi().f176562e && !voipForegroundService.f177109d) {
                    ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
                    com.tencent.mm.autogen.mmdata.rpt.VoipErrorReportStruct voipErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipErrorReportStruct();
                    voipErrorReportStruct.f61756d = 1;
                    voipErrorReportStruct.o();
                    voipErrorReportStruct.k();
                    voipForegroundService.stopSelf();
                }
                return true;
            }
        }, true);
        this.f177111f = b4Var;
        b4Var.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        this.f177111f.setLogging(false);
    }

    public final void a(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, boolean z17) {
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 40, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
        k0Var.m(str);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        k0Var.f(c01.a2.e(str2));
        k0Var.e(str);
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.f469463g = activity;
        k0Var.h(2, true);
        android.app.Notification a17 = vq4.p0.a(k0Var);
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(40, a17, false);
        if (z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        if (!z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.RECORD_AUDIO")) {
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "current mmprocess is exits");
        }
        try {
            if (fp.h.c(30)) {
                z2.y1.a(this, 40, a17, z17 ? 192 : 128);
            } else {
                z2.y1.a(this, 40, a17, 0);
            }
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "startForeground denied: %s", e17.toString());
            gq4.v.Bi().f176575r = false;
            ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 30L, 1L);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "onBind");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r9 = this;
            java.lang.Class<jp5.o> r0 = jp5.o.class
            java.lang.String r1 = "VoipForegroundService onCreate"
            java.lang.String r2 = "MicroMsg.VoipForegroundService"
            com.tencent.mars.xlog.Log.i(r2, r1)
            super.onCreate()
            gm0.j1.i()
            gm0.m r1 = gm0.j1.b()
            boolean r1 = r1.m()
            if (r1 != 0) goto L1e
            r9.stopSelf()
            goto Lc9
        L1e:
            r1 = 26
            boolean r1 = fp.h.c(r1)
            if (r1 == 0) goto Lc9
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            z2.k0 r3 = new z2.k0
            java.lang.String r4 = "reminder_channel_id"
            r3.<init>(r1, r4)
            long r4 = java.lang.System.currentTimeMillis()
            android.app.Notification r1 = r3.D
            r1.when = r4
            r4 = 2131233736(0x7f080bc8, float:1.8083618E38)
            r1.icon = r4
            r1 = 2
            r4 = 1
            r3.h(r1, r4)
            android.app.Notification r1 = vq4.p0.a(r3)
            r3 = 0
            boolean r5 = com.tencent.mm.sdk.platformtools.x2.m()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r5 == 0) goto L51
            java.lang.String r5 = "current mmprocess is exits"
            com.tencent.mars.xlog.Log.i(r2, r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
        L51:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r6 = 30
            if (r5 < r6) goto L5a
            r5 = 192(0xc0, float:2.69E-43)
            goto L5b
        L5a:
            r5 = r3
        L5b:
            r6 = 40
            z2.y1.a(r9, r6, r1, r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            i95.m r1 = i95.n0.c(r0)
            if (r1 == 0) goto L6f
            i95.m r1 = i95.n0.c(r0)
            jp5.o r1 = (jp5.o) r1
            r1.Te(r4)
        L6f:
            i95.m r0 = i95.n0.c(r0)
            r1 = r0
            jp5.o r1 = (jp5.o) r1
            r2 = 2093(0x82d, double:1.034E-320)
            r4 = 30
            r6 = 1
            r1.reportIDKey(r2, r4, r6)
            goto Lc9
        L80:
            r1 = move-exception
            goto La9
        L82:
            r1 = move-exception
            java.lang.String r5 = "start foreground service happened error %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L80
            r6[r3] = r1     // Catch: java.lang.Throwable -> L80
            com.tencent.mars.xlog.Log.i(r2, r5, r6)     // Catch: java.lang.Throwable -> L80
            com.tencent.mm.plugin.voip.model.h2 r1 = gq4.v.Bi()     // Catch: java.lang.Throwable -> La7
            r1.f176575r = r3     // Catch: java.lang.Throwable -> La7
            i95.m r1 = i95.n0.c(r0)
            if (r1 == 0) goto L6f
            i95.m r1 = i95.n0.c(r0)
            jp5.o r1 = (jp5.o) r1
            r1.Te(r3)
            goto L6f
        La7:
            r1 = move-exception
            r4 = r3
        La9:
            i95.m r2 = i95.n0.c(r0)
            if (r2 == 0) goto Lb8
            i95.m r2 = i95.n0.c(r0)
            jp5.o r2 = (jp5.o) r2
            r2.Te(r4)
        Lb8:
            i95.m r0 = i95.n0.c(r0)
            r2 = r0
            jp5.o r2 = (jp5.o) r2
            r3 = 2093(0x82d, double:1.034E-320)
            r5 = 30
            r7 = 1
            r2.reportIDKey(r3, r5, r7)
            throw r1
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.widget.VoipForegroundService.onCreate():void");
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f177110e = true;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "VoipForegroundService onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "onDestroy happened error %s", e17);
        }
        super.onDestroy();
        this.f177111f.d();
        this.f177111f.quitSafely();
        this.f177111f = null;
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        boolean z17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoipForegroundService", "null intent");
            return 2;
        }
        this.f177109d = intent.getBooleanExtra("is_ilink_voip", false);
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "error called voip foreground service in onStartCommand process");
            stopSelf();
            return 2;
        }
        if (!fp.h.c(26)) {
            return 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "foreground service is on bind ");
        if (this.f177109d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "setILinkNotificationBind: ");
            gm0.j1.i();
            if (!gm0.j1.b().m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process cause not account init");
                stopSelf();
                return 3;
            }
            if (i95.n0.c(jp5.o.class) == null || !((jp5.o) i95.n0.c(jp5.o.class)).ie()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process cause not in ilink talking");
                stopSelf();
                return 3;
            }
            boolean booleanExtra = intent.getBooleanExtra("Voip_VideoCall", false);
            final boolean booleanExtra2 = intent.getBooleanExtra("Voip_CallInMulti", false);
            final java.lang.String string = booleanExtra2 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493908pf) : !booleanExtra ? intent.getStringExtra("mTickerText") == null ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdm) : intent.getStringExtra("mTickerText") : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdf);
            final java.lang.String stringExtra = intent.getStringExtra("Voip_User");
            final boolean booleanExtra3 = intent.getBooleanExtra("Voip_VideoCall", false);
            if (i95.n0.c(jp5.o.class) != null) {
                ((jp5.o) i95.n0.c(jp5.o.class)).ve(getApplicationContext(), new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.VoipForegroundService$$c
                    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
                    
                        if (r6 != false) goto L28;
                     */
                    @Override // yz5.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r15) {
                        /*
                            Method dump skipped, instructions count: 349
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.widget.VoipForegroundService$$c.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                return 3;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "IVoipmpService is null, cannot generate talking intent");
            return 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "setNotificationBind");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "voip notification type is 40");
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            if (intent.getBooleanExtra("Voip_Call_From_Push", false)) {
                long longExtra = intent.getLongExtra("Voip_CallRoomKey", 0L);
                if (longExtra > 0) {
                    aq1.q0 q0Var = (aq1.q0) ((a25.q) i95.n0.c(a25.q.class));
                    q0Var.getClass();
                    long j17 = q0Var.Bi().getLong("voip-handle-" + longExtra, 0L);
                    if (j17 > 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "skip: " + longExtra + ", handled at " + j17);
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                if (i95.n0.c(y03.e.class) == null || !vq4.b0.f439272c) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process");
                    z17 = true;
                }
                z17 = false;
            }
            if (z17) {
                stopSelf();
            } else {
                final android.content.Context applicationContext = getApplicationContext();
                intent.setFlags(268435456);
                intent.putExtra("Voip_Call_From", 2);
                final java.lang.String stringExtra2 = intent.getStringExtra("Voip_User");
                final boolean booleanExtra4 = intent.getBooleanExtra("Voip_VideoCall", false);
                final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(applicationContext.getString(booleanExtra4 ? com.tencent.mm.R.string.kdf : com.tencent.mm.R.string.kdm));
                if (intent.getBooleanExtra("Voip_Call_From_Push", false)) {
                    try {
                        a(applicationContext, ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this), (java.lang.String) atomicReference.get(), stringExtra2, booleanExtra4);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "showNotification with launching intent err: " + th6.getMessage());
                    }
                } else {
                    if (vq4.b0.f439276g ? gq4.v.Bi().f176560c : true) {
                        ((y03.e) i95.n0.c(y03.e.class)).d8(applicationContext, stringExtra2, booleanExtra4, new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.VoipForegroundService$$b
                            @Override // yz5.l
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                android.content.Context context = applicationContext;
                                java.lang.String str = stringExtra2;
                                boolean z18 = booleanExtra4;
                                android.content.Intent intent2 = (android.content.Intent) obj;
                                int i19 = com.tencent.mm.plugin.voip.widget.VoipForegroundService.f177108g;
                                com.tencent.mm.plugin.voip.widget.VoipForegroundService voipForegroundService = com.tencent.mm.plugin.voip.widget.VoipForegroundService.this;
                                voipForegroundService.getClass();
                                java.lang.String stringExtra3 = intent2.getStringExtra("mTickerText");
                                java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference;
                                if (stringExtra3 != null) {
                                    atomicReference2.set(intent2.getStringExtra("mTickerText"));
                                }
                                if (voipForegroundService.f177110e) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.VoipForegroundService", "current service not exist,break create notification");
                                    return null;
                                }
                                voipForegroundService.a(context, intent2, (java.lang.String) atomicReference2.get(), str, z18);
                                if (vq4.b0.f439279j || !vq4.b0.f439271b || !z18 || gq4.v.Bi().E == null) {
                                    return null;
                                }
                                dr4.p1 p1Var = gq4.v.Bi().E;
                                p1Var.getClass();
                                pq4.c l17 = gq4.v.Bi().l("CAMERA");
                                if (l17 == null) {
                                    return null;
                                }
                                l17.b(new dr4.n1(p1Var));
                                return null;
                            }
                        });
                    } else {
                        a(applicationContext, intent, (java.lang.String) atomicReference.get(), stringExtra2, booleanExtra4);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipForegroundService", "error called voip foreground service in setNotification process");
            stopSelf();
        }
        ((kg0.p) ((lg0.m) i95.n0.c(lg0.m.class))).Ai();
        return 3;
    }
}
