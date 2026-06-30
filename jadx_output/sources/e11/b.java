package e11;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f246357a;

    /* renamed from: b, reason: collision with root package name */
    public static final e11.g f246358b = new e11.g();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f246359c = true;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.Future f246360d;

    public static void a(int i17, long j17) {
        if (f246359c && !f246357a) {
            e11.e eVar = new e11.e(c01.id.a(), java.lang.System.currentTimeMillis(), i17, j17);
            java.util.List list = f246358b.f246395f.f246363f;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
            if (copyOnWriteArrayList.size() > 30000) {
                for (int i18 = 0; i18 < 100; i18++) {
                    try {
                        ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e17.getMessage());
                    }
                }
            }
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void b(int i17, long j17) {
        if (f246359c && !f246357a) {
            e11.e eVar = new e11.e(c01.id.a(), java.lang.System.currentTimeMillis(), i17, j17);
            java.util.List list = f246358b.f246395f.f246362e;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
            if (copyOnWriteArrayList.size() > 30000) {
                for (int i18 = 0; i18 < 100; i18++) {
                    try {
                        ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e17.getMessage());
                    }
                }
            }
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static java.lang.String c(long j17) {
        return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date(j17));
    }

    public static void d(java.util.List list, java.util.List list2, boolean z17) {
        if (list2 == null) {
            return;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
        }
    }

    public static final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector", "onActive() active:%s", java.lang.Boolean.valueOf(z17));
        boolean z18 = !com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).getBoolean("msg_delay_close_detect", false);
        f246359c = z18;
        if (z18) {
            f246357a = z17;
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector", "[oneliang]unactive, time%s, pid:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(android.os.Process.myPid()));
                if (f246360d == null) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    e11.g gVar = f246358b;
                    f246360d = ((ku5.t0) u0Var).q(gVar);
                    gVar.f246401o = true;
                }
                c01.id.a();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector", "[oneliang]active, time%s, pid:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(android.os.Process.myPid()));
            com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector", "active, interrupt end, time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.concurrent.Future future = f246360d;
            if (future != null) {
                future.cancel(true);
            }
            f246360d = null;
            e11.g gVar2 = f246358b;
            gVar2.f246401o = false;
            gVar2.f246397h = 0L;
            gVar2.f246398i = 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.ActiveDetector", "active, processDetector.clear end, time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c01.id.a();
        }
    }

    public static e11.a f(e11.f fVar, int i17) {
        if (fVar == null) {
            return null;
        }
        e11.a aVar = new e11.a();
        aVar.f246349d = fVar.f246386e;
        aVar.f246350e = fVar.f246387f;
        aVar.f246351f = fVar.f246388g;
        aVar.f246352g = i17;
        aVar.f246353h = fVar.f246385d;
        aVar.f246355m = fVar.f246390i;
        if (i17 == 1) {
            aVar.f246354i = fVar.f246389h;
        }
        return aVar;
    }
}
