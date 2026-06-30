package com.tencent.mm.plugin.trafficmonitor;

/* loaded from: classes12.dex */
public class TrafficClickFlowReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f175344a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Deque f175345b = new java.util.ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public static long f175346c = java.lang.System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f175347d;

    static {
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new kn4.a0());
    }

    public static java.util.List a(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f175347d = false;
        java.util.Deque deque = f175345b;
        synchronized (deque) {
            try {
                java.util.Iterator it = ((java.util.ArrayDeque) deque).iterator();
                while (it.hasNext()) {
                    kn4.b0 b0Var = (kn4.b0) it.next();
                    if ("MsgRetransmitUI".equals(b0Var.f309672a)) {
                        f175347d = true;
                    }
                    long j18 = b0Var.f309674c;
                    if (j18 > j17) {
                        kn4.b0 b0Var2 = new kn4.b0();
                        b0Var2.f309672a = b0Var.f309672a;
                        long j19 = b0Var.f309673b;
                        b0Var2.f309673b = j19;
                        b0Var2.f309674c = j18;
                        b0Var2.f309673b = java.lang.Math.max(j19, j17);
                        arrayList.add(b0Var2);
                    }
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        for (kn4.b0 b0Var3 : ((java.util.concurrent.ConcurrentHashMap) f175344a).values()) {
            kn4.b0 b0Var4 = new kn4.b0();
            b0Var4.f309673b = java.lang.Math.max(b0Var3.f309673b, j17);
            b0Var4.f309672a = b0Var3.f309672a;
            b0Var4.f309674c = java.lang.System.currentTimeMillis();
            arrayList.add(b0Var4);
        }
        return arrayList;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (!"com.tencent.mm.Intent.ACTION_NET_STATS".equals(action)) {
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, screen[on]");
                return;
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, screen[off]");
                return;
            } else {
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, screen[unlock]");
                    return;
                }
                return;
            }
        }
        java.lang.String stringExtra = intent.getStringExtra("ui");
        int intExtra = intent.getIntExtra("opCode", 0);
        if (stringExtra == null) {
            stringExtra = "null";
        } else {
            int lastIndexOf = stringExtra.lastIndexOf(".");
            if (lastIndexOf >= 0) {
                stringExtra = stringExtra.substring(lastIndexOf + 1);
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f175346c = currentTimeMillis;
        if (intExtra == 3) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f175344a;
            kn4.b0 b0Var = (kn4.b0) concurrentHashMap.get(stringExtra);
            if (b0Var == null) {
                b0Var = new kn4.b0();
                concurrentHashMap.put(stringExtra, b0Var);
            }
            b0Var.f309672a = stringExtra;
            b0Var.f309673b = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, ui@%s[enter]", stringExtra);
            return;
        }
        if (intExtra == 4) {
            kn4.b0 b0Var2 = (kn4.b0) ((java.util.concurrent.ConcurrentHashMap) f175344a).remove(stringExtra);
            if (b0Var2 != null) {
                b0Var2.f309674c = currentTimeMillis;
                java.util.Deque deque = f175345b;
                synchronized (deque) {
                    ((java.util.ArrayDeque) deque).offer(b0Var2);
                    long j17 = currentTimeMillis - kn4.o0.b().f309736b;
                    while (true) {
                        java.util.Deque deque2 = f175345b;
                        if (((java.util.ArrayDeque) deque2).size() <= 0 || ((kn4.b0) ((java.util.ArrayDeque) deque2).peekFirst()).f309674c > j17) {
                            break;
                        } else {
                            ((java.util.ArrayDeque) deque2).pollFirst();
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, ui@%s[exit]", stringExtra);
        }
    }
}
