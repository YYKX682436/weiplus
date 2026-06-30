package my3;

@j95.b
/* loaded from: classes13.dex */
public final class q extends i95.w implements fy3.e {

    /* renamed from: h, reason: collision with root package name */
    public int f332825h;

    /* renamed from: p, reason: collision with root package name */
    public boolean f332830p;

    /* renamed from: q, reason: collision with root package name */
    public int f332831q;

    /* renamed from: s, reason: collision with root package name */
    public fy3.f f332833s;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.rtos.service.RtosServiceImpl$webWXLogoutListener$1 f332839y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f332821d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f332822e = "";

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f332823f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);

    /* renamed from: g, reason: collision with root package name */
    public ky3.b f332824g = new ky3.b();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f332826i = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Intent f332827m = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard.class);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f332828n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ly3.n f332829o = new ly3.n();

    /* renamed from: r, reason: collision with root package name */
    public fy3.i f332832r = fy3.i.f267245d;

    /* renamed from: t, reason: collision with root package name */
    public final my3.i f332834t = new my3.i(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f332835u = new com.tencent.mm.sdk.platformtools.b4(new my3.o(this), false);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f332836v = new com.tencent.mm.sdk.platformtools.b4(new my3.e(this), false);

    /* renamed from: w, reason: collision with root package name */
    public final my3.e0 f332837w = new my3.e0(new my3.g(this));

    /* renamed from: x, reason: collision with root package name */
    public final fy3.g f332838x = new my3.k(this);

    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.mm.plugin.rtos.service.RtosServiceImpl$webWXLogoutListener$1] */
    public q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "RtosServiceImpl init");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f332839y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RtosWatchWebWXLogoutEvent>(a0Var) { // from class: com.tencent.mm.plugin.rtos.service.RtosServiceImpl$webWXLogoutListener$1
            {
                this.__eventId = 1984026996;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RtosWatchWebWXLogoutEvent rtosWatchWebWXLogoutEvent) {
                com.tencent.mm.autogen.events.RtosWatchWebWXLogoutEvent event = rtosWatchWebWXLogoutEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebWXLogout deviceTypeId ");
                am.is isVar = event.f54719g;
                sb6.append(isVar.f6970a);
                sb6.append(" bound ");
                my3.q qVar = my3.q.this;
                sb6.append(qVar.f332830p);
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", sb6.toString());
                if (isVar.f6970a != 31) {
                    return false;
                }
                qVar.Zi(3);
                return false;
            }
        };
    }

    public static final void Ai(my3.q qVar, java.lang.String str, java.lang.String str2) {
        qVar.getClass();
        java.lang.String k17 = gm0.j1.b().k();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "rtosLogin scanMac:" + str + " ticket:" + str2 + " username:" + k17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "username or ticket is empty");
            qVar.fj(0, 7);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_USERNAME, k17);
            bundle.putString("ticket", str2);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, bundle, iy3.k.class, new my3.j(qVar, str, k17));
        }
    }

    public static final void Bi(my3.q qVar, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putString;
        android.content.SharedPreferences.Editor putString2;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "saveRtosBindInfo mac:%s username:%s", str, str2);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, str)) != null && (putString2 = putString.putString(dm.i4.COL_USERNAME, str2)) != null) {
            putString2.commit();
        }
        qVar.f332821d = str;
        qVar.f332822e = str2;
    }

    public static final void Di(my3.q qVar, fy3.g gVar) {
        my3.e0 e0Var = qVar.f332837w;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startAndBindService");
        java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f332826i;
        reentrantLock.lock();
        try {
            qVar.Ri(fy3.i.f267248g);
            if (!e0Var.f332800e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "start service count = " + qVar.f332831q);
                if (qVar.f332831q == 0) {
                    qVar.f332835u.c(300000L, 300000L);
                }
                qVar.f332831q++;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.Intent intent = qVar.f332827m;
                context.startService(intent);
                com.tencent.mm.sdk.platformtools.x2.f193071a.bindService(intent, e0Var, 1);
                if (gVar != null) {
                    qVar.f332828n.add(gVar);
                }
                qVar.f332836v.c(60000L, 60000L);
            } else if (gVar != null) {
                ((my3.k) gVar).a();
            }
            ky3.b bVar = qVar.f332824g;
            if (bVar.f313615b == 0) {
                bVar.f313615b = java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Rtos.RtosServiceImpl", e17, "tryStartService fail.", new java.lang.Object[0]);
            qVar.Ri(fy3.i.f267246e);
        }
        reentrantLock.unlock();
    }

    public static final void wi(my3.q qVar, int i17) {
        ky3.b bVar = qVar.f332824g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ky3.b bVar2 = qVar.f332824g;
        bVar.f313616c = currentTimeMillis - bVar2.f313615b;
        bVar2.f313615b = 0L;
        bVar2.f313617d = i17;
        bVar2.f313614a = 0;
        qVar.hj(bVar2);
    }

    public final void Ni() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putBoolean;
        android.content.SharedPreferences.Editor edit2;
        android.content.SharedPreferences.Editor putBoolean2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "autoCheckNeedStartUp");
        Ri(fy3.i.f267245d);
        ly3.m mVar = ly3.m.f322273a;
        java.lang.String str = ly3.m.f322274b;
        if (com.tencent.mm.vfs.w6.j(str)) {
            java.lang.String str2 = ly3.m.f322275c;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResFileUtil", "moveSoRes " + str2 + " result " + com.tencent.mm.vfs.w6.v(str, str2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResFileUtil", str + " not exists, ignore");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResFileUtil", "begin checkOldSo");
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(ly3.m.f322275c, true);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (!x1Var.f213236f) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name:");
                    java.lang.String str3 = x1Var.f213232b;
                    sb6.append(str3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResFileUtil", sb6.toString());
                    if (kotlin.jvm.internal.o.b(str3, "libwechat_rtos_service.so") && x1Var.f213233c > com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResFileUtil", "so too big so delete, result=" + x1Var.b(true));
                    }
                }
            }
        }
        ky3.b bVar = this.f332824g;
        boolean z17 = false;
        bVar.f313614a = 0;
        bVar.f313615b = 0L;
        bVar.f313616c = 0L;
        bVar.f313617d = 0;
        bVar.f313618e = 0;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        boolean z18 = sharedPreferences != null && sharedPreferences.getBoolean("had_inserted_notification", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "storeMac:" + this.f332821d + ", username:" + this.f332822e);
        if (!(this.f332822e.length() > 0)) {
            if (!(this.f332821d.length() > 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "no username or mac");
                java.lang.String path = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/.alita/users/ac.db";
                kotlin.jvm.internal.o.g(path, "path");
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path));
                if (r6Var.m()) {
                    if (java.lang.System.currentTimeMillis() - r6Var.B() <= 259200000) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "user had not user rtos beyond 3 days");
                } else if (!Ui() && !z18) {
                    if (sharedPreferences != null && (edit2 = sharedPreferences.edit()) != null && (putBoolean2 = edit2.putBoolean("had_inserted_notification", true)) != null) {
                        putBoolean2.commit();
                    }
                    cj();
                    Ri(fy3.i.f267246e);
                }
                oj();
                return;
            }
        }
        if (Ui()) {
            bj();
            return;
        }
        if (!z18) {
            if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("had_inserted_notification", true)) != null) {
                putBoolean.commit();
            }
            cj();
        }
        Ri(fy3.i.f267246e);
    }

    public final void Ri(fy3.i status) {
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "changeRtosLoginStatus " + this.f332832r + " -> " + status);
        this.f332832r = status;
    }

    public boolean Ui() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            boolean z17 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_SCAN") == 0;
            boolean z18 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_ADVERTISE") == 0;
            r2 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_CONNECT") == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "SDK_INT >= 31 hasScan:" + z17 + " hasAdvertise:" + z18 + " hasConnect:" + r2);
        }
        return r2;
    }

    public void Vi() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor remove;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "cleanRtosBindUserName");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (remove = edit.remove(dm.i4.COL_USERNAME)) != null) {
            remove.commit();
        }
        this.f332822e = "";
    }

    public void Zi(int i17) {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor remove;
        android.content.SharedPreferences.Editor remove2;
        android.content.SharedPreferences.Editor remove3;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "clearRtosBindInfo");
        Ri(fy3.i.f267245d);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (remove = edit.remove(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC)) != null && (remove2 = remove.remove(dm.i4.COL_USERNAME)) != null && (remove3 = remove2.remove("had_inserted_notification")) != null) {
            remove3.commit();
        }
        this.f332821d = "";
        this.f332822e = "";
        rk0.c.a("MicroMsg.Rtos.UnbindReport", "reportUnbindReason: " + i17, new java.lang.Object[0]);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), 0);
    }

    public final void aj(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "closeRtos errorCode " + i17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, bundle, iy3.i.class, new my3.f(this));
    }

    public final void bj() {
        Ri(fy3.i.f267247f);
        ly3.n nVar = this.f332829o;
        nVar.getClass();
        my3.i callback = this.f332834t;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.SoResMgr", "manualCheckSoRes");
        nVar.f322277b.j(callback);
    }

    public final void cj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "insertNotificationToWeixin");
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(2);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.setType(1);
        f9Var.u1("weixin");
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493644n30));
        c01.w9.x(f9Var);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("weixin");
        if (p17 != null) {
            p17.l1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493644n30));
            p17.Y1(p17.d1() + 1);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "weixin");
        } else {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.l1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493644n30));
            l4Var.b2("weixin");
            l4Var.Y1(1);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
        }
    }

    public final void fj(int i17, int i18) {
        Ri(fy3.i.f267246e);
        fy3.f fVar = this.f332833s;
        if (fVar != null) {
            oy3.t tVar = (oy3.t) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onGetIlinkDeviceOauthTicket errorType:" + i17 + " errorCode:" + i18);
            if (i18 != 0) {
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = tVar.f350044a;
                rtosWatchLoginUI.f158607y = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onGetTicketFailEvent");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("error_type", i17);
                bundle.putInt(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, bundle, iy3.w.class);
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.U6(rtosWatchLoginUI, rtosWatchLoginUI.f158607y);
            }
        }
    }

    public void hj(ky3.b p17) {
        kotlin.jvm.internal.o.g(p17, "p");
        this.f332824g = p17;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, java.lang.Integer.valueOf(p17.f313614a), java.lang.Long.valueOf(p17.f313616c), java.lang.Integer.valueOf(p17.f313617d), java.lang.Integer.valueOf(p17.f313618e));
    }

    public final void ij(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startConnectWatch mac:" + str + " avatar:" + str2 + ", isFromScan: " + z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, str);
        bundle.putString("avatar", str2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, bundle, iy3.d.class, new my3.l(z17, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r1.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList ignore. empty list.");
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList " + r1.size());
        r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReplyList(r1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList list " + r0.f158584d.size() + " username " + r12.f332822e + ", mac:" + r12.f332821d + " code " + r12.f332824g.f313617d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cd, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r12.f332822e) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r12.f332821d) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        r1 = r12.f332824g.f313617d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dc, code lost:
    
        if (r1 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r1 != 10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193057e, r0, iy3.z.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r11.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        r2 = r11.getInt(r11.getColumnIndex("orderIndex"));
        r3 = r11.getString(r11.getColumnIndex("quickMsg"));
        kotlin.jvm.internal.o.f(r3, "getString(...)");
        r1.add(new com.tencent.mm.plugin.rtos.model.RtosQuickReply(r2, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r11.moveToNext() != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mj() {
        /*
            r12 = this;
            ny3.b r0 = com.tencent.mm.plugin.exdevice.model.l3.ij()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r9 = "orderIndex ASC"
            r11 = 0
            l75.k0 r2 = r0.f341441d     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = "RtosQuickReplyInfo"
            r4 = 0
            r7 = 0
            r8 = 0
            r10 = 2
            android.database.Cursor r11 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r11 == 0) goto L4d
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r0 == 0) goto L4d
        L26:
            com.tencent.mm.plugin.rtos.model.RtosQuickReply r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReply     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r2 = "orderIndex"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            int r2 = r11.getInt(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = "quickMsg"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            java.lang.String r4 = "getString(...)"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r1.add(r0)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r0 != 0) goto L26
        L4d:
            if (r11 == 0) goto L64
            goto L61
        L50:
            r0 = move-exception
            goto Lea
        L53:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z3.c(r0)     // Catch: java.lang.Throwable -> L50
            com.tencent.mars.xlog.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L64
        L61:
            r11.close()
        L64:
            boolean r0 = r1.isEmpty()
            java.lang.String r2 = "MicroMsg.Rtos.RtosServiceImpl"
            if (r0 == 0) goto L76
            java.lang.String r0 = "syncQuickReplyList ignore. empty list."
            com.tencent.mars.xlog.Log.w(r2, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "syncQuickReplyList "
            r0.<init>(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.rtos.model.RtosQuickReplyList r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReplyList
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "syncQuickReplyList list "
            r1.<init>(r3)
            java.util.ArrayList r3 = r0.f158584d
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = " username "
            r1.append(r3)
            java.lang.String r3 = r12.f332822e
            r1.append(r3)
            java.lang.String r3 = ", mac:"
            r1.append(r3)
            java.lang.String r3 = r12.f332821d
            r1.append(r3)
            java.lang.String r3 = " code "
            r1.append(r3)
            ky3.b r3 = r12.f332824g
            int r3 = r3.f313617d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = r12.f332822e
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto Le9
            java.lang.String r1 = r12.f332821d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto Le9
            ky3.b r1 = r12.f332824g
            int r1 = r1.f313617d
            r2 = 1
            if (r1 == r2) goto Le2
            r2 = 10
            if (r1 != r2) goto Le9
        Le2:
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.w9.f193057e
            java.lang.Class<iy3.z> r2 = iy3.z.class
            com.tencent.mm.ipcinvoker.d0.f(r1, r0, r2)
        Le9:
            return
        Lea:
            if (r11 == 0) goto Lef
            r11.close()
        Lef:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: my3.q.mj():void");
    }

    public final void nj(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_USERNAME, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "tryAutoLogin mac:" + str + " username:" + str2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, bundle, iy3.l.class, new my3.p(this, str, str2));
    }

    public void oj() {
        this.f332836v.d();
        my3.e0 e0Var = this.f332837w;
        if (e0Var.f332800e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "tryStopService");
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(this.f332827m);
            if (this.f332830p) {
                this.f332830p = false;
                com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(e0Var);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onAccountInitialized");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        java.lang.String string = sharedPreferences != null ? sharedPreferences.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "") : null;
        if (string == null) {
            string = "";
        }
        this.f332821d = string;
        java.lang.String string2 = sharedPreferences != null ? sharedPreferences.getString(dm.i4.COL_USERNAME, "") : null;
        this.f332822e = string2 != null ? string2 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "storeMac " + this.f332821d + ", storeUsername " + this.f332822e);
        Ni();
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onAccountReleased");
        dead();
        oj();
    }
}
