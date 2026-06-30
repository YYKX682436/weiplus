package e04;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.m1 f246024d = new e04.m1();

    @Override // java.lang.Runnable
    public final void run() {
        e04.r1 r1Var = e04.t1.f246095c;
        java.util.HashMap hashMap = e04.t1.f246103k;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner taskSize: %s", java.lang.Integer.valueOf(hashMap.size()));
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            e04.s1 s1Var = (e04.s1) entry.getValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner key: " + ((java.lang.String) entry.getKey()));
            ku5.q state = s1Var.f246085a.getState();
            ku5.q qVar = ku5.q.WAITING;
            wu5.c cVar = s1Var.f246085a;
            if (state != qVar) {
                e04.r1 r1Var2 = e04.t1.f246095c;
                ku5.q state2 = cVar.getState();
                kotlin.jvm.internal.o.f(state2, "getState(...)");
                if (!(state2 == ku5.q.COMPLETE || state2 == ku5.q.THROW || state2 == ku5.q.ERROR)) {
                }
            }
            java.lang.Runnable runnable = s1Var.f246086b;
            if ((runnable instanceof st5.c) || (runnable instanceof st5.a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraThreadPoolManager", "releaseAllTasksInner cancelTask: " + ((java.lang.String) entry.getKey()) + ", state: " + cVar.getState() + ", ret: " + cVar.cancel(true));
            }
        }
        e04.t1.f246103k.clear();
    }
}
