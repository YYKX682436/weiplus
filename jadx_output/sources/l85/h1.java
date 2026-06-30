package l85;

/* loaded from: classes12.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f317177a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Vector f317178b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Vector f317179c = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f317180d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f317181e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f317182f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f317183g = false;

    public static boolean a(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.lang.String str, boolean z17, android.content.Intent intent2) {
        java.lang.String str2;
        boolean z18;
        long j17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService Intent == null");
            return false;
        }
        java.lang.String className = intent.getComponent().getClassName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(className)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() processName = %s", str);
            return false;
        }
        if ("com.tencent.mm.service.ProcessService$MMProcessService".equals(intent2.getComponent().getClassName()) && com.tencent.mm.sdk.platformtools.x2.f193077g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMServiceHelper", "manProc standby, skip pulling from: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317177a;
        l85.n0 n0Var = (l85.n0) concurrentHashMap.get(str);
        intent.putExtra("class_name", className);
        intent.putExtra("service_connection", serviceConnection.hashCode());
        f317180d.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), className);
        if (n0Var == null) {
            l85.l1.a(32L, 1L, false);
            f317179c.add(intent);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c(context, str, intent2);
            try {
                z18 = true;
                try {
                    str2 = "MicroMsg.MMServiceHelper";
                    try {
                        com.tencent.mars.xlog.Log.i(str2, "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s bindService_result = %b", intent2.getComponent().getClassName(), className, str, java.lang.Boolean.valueOf(context.bindService(intent2, new l85.c1(intent2, intent2, className, str, intent, serviceConnection, z17, i17, context), 1)));
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.i(str2, "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s Context.bindService() Exception = %s", intent2.getComponent().getClassName(), className, str, e.getMessage());
                        j17 = 1;
                        com.tencent.mars.xlog.Log.i(str2, "bindService() ClassName = %s ProcessName = %s", className, str);
                        l85.l1.a(31L, j17, false);
                        return z18;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str2 = "MicroMsg.MMServiceHelper";
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                str2 = "MicroMsg.MMServiceHelper";
                z18 = true;
            }
            j17 = 1;
        } else {
            str2 = "MicroMsg.MMServiceHelper";
            z18 = true;
            j17 = 1;
            l85.l1.a(37L, 1L, false);
            try {
                com.tencent.mars.xlog.Log.i(str2, "IMMServiceStub_AIDL != null, bindService() ClassName = %s ProcessName = %s ", className, str);
                try {
                    n0Var.og(intent, new l85.e1(intent2, className, str, serviceConnection));
                } catch (java.lang.Exception e27) {
                    e = e27;
                    concurrentHashMap.remove(str);
                    if (z17) {
                        a(intent, serviceConnection, i17, str, false, intent2);
                        l85.l1.a(36L, 1L, false);
                    }
                    com.tencent.mars.xlog.Log.i(str2, "bindService ClassName = %s ProcessName = %s exception = %s stack[%s]", className, str, e.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
                    com.tencent.mars.xlog.Log.i(str2, "bindService() ClassName = %s ProcessName = %s", className, str);
                    l85.l1.a(31L, j17, false);
                    return z18;
                }
            } catch (java.lang.Exception e28) {
                e = e28;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "bindService() ClassName = %s ProcessName = %s", className, str);
        l85.l1.a(31L, j17, false);
        return z18;
    }

    public static boolean b(android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i17, java.lang.String str, boolean z17, android.content.Intent intent2) {
        long j17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate Intent == null");
            return false;
        }
        java.lang.String className = intent.getComponent().getClassName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(className)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() processName = %s", str);
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317177a;
        l85.n0 n0Var = (l85.n0) concurrentHashMap.get(str);
        intent.putExtra("class_name", className);
        intent.putExtra("service_connection", serviceConnection.hashCode());
        f317180d.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), className);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() is waiting for conn? %s", java.lang.Boolean.valueOf(f317183g));
        if (n0Var != null) {
            j17 = 1;
            l85.l1.a(37L, 1L, false);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, bindService() ClassName = %s ProcessName = %s ", className, str);
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                n0Var.og(intent, new l85.z0(intent2, className, str, serviceConnection));
            } catch (java.lang.Exception e18) {
                e = e18;
                concurrentHashMap.remove(str);
                if (z17) {
                    a(intent, serviceConnection, i17, str, false, intent2);
                    l85.l1.a(36L, 1L, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService ClassName = %s ProcessName = %s exception = %s stack[%s]", className, str, e.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ClassName = %s ProcessName = %s", className, str);
                l85.l1.a(31L, j17, false);
                return true;
            }
        } else {
            if (f317183g) {
                return false;
            }
            l85.l1.a(32L, 1L, false);
            f317179c.add(intent);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            try {
                f317183g = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s bindService_result = %b", intent2.getComponent().getClassName(), className, str, java.lang.Boolean.valueOf(context.bindService(intent2, new l85.x0(intent2, className, str, intent, serviceConnection, z17, i17, context), 32)));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s Context.bindService() Exception = %s", intent2.getComponent().getClassName(), className, str, e19.getMessage());
            }
            j17 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ClassName = %s ProcessName = %s", className, str);
        l85.l1.a(31L, j17, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if ((r6 == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r5, java.lang.String r6, android.content.Intent r7) {
        /*
            android.content.ComponentName r0 = r7.getComponent()
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "com.tencent.mm.service.ProcessService$MMProcessService"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "MicroMsg.MMServiceHelper"
            if (r0 == 0) goto L31
            boolean r0 = com.tencent.mm.sdk.platformtools.x2.f193077g
            if (r0 == 0) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "manProc standby, skip pulling from: "
            r5.<init>(r6)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>()
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.w(r1, r5)
            return
        L31:
            java.lang.String r0 = "mm"
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.D0(r6, r0)
            r0 = 0
            if (r6 != 0) goto L3b
            goto L6a
        L3b:
            r6 = 26
            boolean r6 = fp.h.c(r6)
            r2 = 1
            if (r6 == 0) goto L69
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r3 = "service_launch_way"
            r4 = 4
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r3, r4)
            java.lang.String r3 = "huawei_switch"
            int r6 = r6.getInt(r3, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "ifTarget26StartServiceHuawei() huaweiEnable : %s"
            com.tencent.mars.xlog.Log.i(r1, r4, r3)
            if (r6 != 0) goto L65
            r6 = r2
            goto L66
        L65:
            r6 = r0
        L66:
            if (r6 == 0) goto L69
            goto L6a
        L69:
            r0 = r2
        L6a:
            if (r0 == 0) goto L87
            r5.startService(r7)     // Catch: java.lang.Exception -> L70
            goto L87
        L70:
            r5 = move-exception
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.String r6 = "startProcessService() Exception:%s %s"
            com.tencent.mars.xlog.Log.i(r1, r6, r5)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l85.h1.c(android.content.Context, java.lang.String, android.content.Intent):void");
    }

    public static void d(java.lang.String str, boolean z17, android.content.Intent intent) {
        if ("com.tencent.mm.service.ProcessService$MMProcessService".equals(intent.getComponent().getClassName()) && com.tencent.mm.sdk.platformtools.x2.f193077g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMServiceHelper", "manProc standby, skip pulling from: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c(context, str, intent);
            context.bindService(intent, new l85.g1(intent, str, context, z17, intent), 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startProcessService() processName = %s", str);
        }
    }

    public static void e(android.content.Intent intent, java.lang.String str, boolean z17, android.content.Intent intent2) {
        long j17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService Intent == null");
            return;
        }
        java.lang.String className = intent.getComponent().getClassName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(className)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = null processName = %s", str);
            return;
        }
        if ("com.tencent.mm.service.ProcessService$MMProcessService".equals(intent2.getComponent().getClassName()) && com.tencent.mm.sdk.platformtools.x2.f193077g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMServiceHelper", "manProc standby, skip pulling from: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        intent.putExtra("class_name", className);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317177a;
        l85.n0 n0Var = (l85.n0) concurrentHashMap.get(str);
        if (n0Var == null) {
            f317178b.add(intent);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c(context, str, intent2);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s bindService_result = %b", className, str, java.lang.Boolean.valueOf(context.bindService(intent2, new l85.t0(intent2, className, str, intent, z17, intent2, context), 1)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", className, str, e17.getMessage());
            }
            l85.l1.a(1L, 1L, false);
            j17 = 1;
        } else {
            try {
                n0Var.startService(intent);
            } catch (java.lang.Exception e18) {
                concurrentHashMap.remove(str);
                if (z17) {
                    e(intent, str, false, intent2);
                    l85.l1.a(5L, 1L, false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", className, str, e18.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, startService() ClassName = %s ProcessName = %s ", className, str);
            j17 = 1;
            l85.l1.a(6L, 1L, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s", className, str);
        l85.l1.a(0L, j17, false);
    }

    public static void f(android.content.Intent intent, java.lang.String str, boolean z17, android.content.Intent intent2) {
        long j17;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService Intent == null");
            return;
        }
        java.lang.String className = intent.getComponent().getClassName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(className)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = null processName = %s", str);
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317177a;
        l85.n0 n0Var = (l85.n0) concurrentHashMap.get(str);
        intent.putExtra("class_name", className);
        if (n0Var == null) {
            l85.l1.a(17L, 1L, false);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c(context, str, intent2);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s bindService_result = %b", className, str, java.lang.Boolean.valueOf(context.bindService(intent2, new l85.u0(intent2, className, str, intent, z17, intent2, context), 1)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", className, str, e17.getMessage());
            }
        } else {
            try {
                n0Var.stopService(intent);
                j17 = 1;
            } catch (java.lang.Exception e18) {
                concurrentHashMap.remove(str);
                if (z17) {
                    f(intent, str, false, intent2);
                    j17 = 1;
                    l85.l1.a(21L, 1L, false);
                } else {
                    j17 = 1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s exception = %s", className, str, e18.getMessage());
            }
            l85.l1.a(22L, j17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, stopService() ClassName = %s ProcessName = %s stack[%s]", className, str, new com.tencent.mm.sdk.platformtools.z3());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s", className, str);
        l85.l1.a(16L, 1L, false);
    }

    public static void g(android.content.ServiceConnection serviceConnection, java.lang.String str, boolean z17, android.content.Intent intent) {
        long j17;
        if (serviceConnection == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService ServiceConnection == null");
            return;
        }
        java.lang.String str2 = (java.lang.String) f317180d.remove(java.lang.Integer.valueOf(serviceConnection.hashCode()));
        android.os.IBinder iBinder = (android.os.IBinder) f317181e.remove(java.lang.Integer.valueOf(serviceConnection.hashCode()));
        android.os.IBinder.DeathRecipient deathRecipient = (android.os.IBinder.DeathRecipient) f317182f.remove(java.lang.Integer.valueOf(serviceConnection.hashCode()));
        if (iBinder != null) {
            iBinder.unlinkToDeath(deathRecipient, 0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() processName = %s", str);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("class_name", str2);
        intent2.putExtra("service_connection", serviceConnection.hashCode());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f317177a;
        l85.n0 n0Var = (l85.n0) concurrentHashMap.get(str);
        if (n0Var == null) {
            l85.l1.a(47L, 1L, false);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c(context, str, intent);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s bindService_result = %b", str2, str, java.lang.Boolean.valueOf(context.bindService(intent, new l85.f1(intent, str2, str, intent2, z17, serviceConnection, intent, context), 1)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", str2, str, e17.getMessage());
            }
            j17 = 1;
        } else {
            try {
                n0Var.nb(intent2);
                j17 = 1;
            } catch (java.lang.Exception e18) {
                concurrentHashMap.remove(str);
                if (z17) {
                    g(serviceConnection, str, false, intent);
                    j17 = 1;
                    l85.l1.a(51L, 1L, false);
                } else {
                    j17 = 1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s exception = %s stack[%s]", str2, str, e18.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
            }
            l85.l1.a(52L, j17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, unbindService() ClassName = %s ProcessName = %s ", str2, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s processName = %s", str2, str);
        l85.l1.a(46L, j17, false);
    }
}
