package qj;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f363857a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f363858b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static wu5.j f363859c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f363860d = "";

    /* renamed from: e, reason: collision with root package name */
    public static volatile android.util.SparseBooleanArray f363861e = new android.util.SparseBooleanArray(5);

    /* renamed from: f, reason: collision with root package name */
    public static int f363862f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f363863g = true;

    public static void a(int i17) {
        f363858b = 0;
        int i18 = 0;
        while (i18 < 10) {
            com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "startCheckStrictly, token = %d, checkCount = %d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            i18++;
            if (i17 != b()) {
                com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "token != lastToken, just break");
                return;
            }
            qj.b bVar = new qj.b(android.os.Looper.getMainLooper());
            android.os.Message obtain = android.os.Message.obtain();
            boolean z17 = true;
            obtain.setAsynchronous(true);
            obtain.setTarget(bVar);
            obtain.arg1 = 0;
            android.os.Message obtain2 = android.os.Message.obtain();
            obtain2.arg1 = 1;
            bVar.sendMessage(obtain);
            bVar.sendMessage(obtain2);
            if (f363858b > 3) {
                com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "Maybe happens a barrier leak, token = %d, barrierCount = barrierCount", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f363858b));
                if (i17 == b()) {
                    c(i17, 21, 11);
                } else {
                    c(i17, 20, 10);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            } else {
                try {
                    java.lang.Thread.sleep(1000L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    public static int b() {
        try {
            android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
            java.lang.reflect.Field declaredField = queue.getClass().getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            android.os.Message message = (android.os.Message) declaredField.get(queue);
            if (message == null || message.getTarget() != null) {
                return -1;
            }
            return message.arg1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static void c(int i17, int i18, int i19) {
        if (f363861e.get(i17)) {
            return;
        }
        f363861e.put(i17, true);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(1470L, i18, 1L, true);
        java.lang.String visibleScene = com.tencent.matrix.trace.core.AppMethodBeat.getVisibleScene();
        if (visibleScene == null) {
            visibleScene = "";
        }
        com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "sync barrier leak happens in scene : %s, type : %d", visibleScene, java.lang.Integer.valueOf(i19));
        fVar.d(20739, visibleScene, java.lang.Integer.valueOf(i19));
    }
}
