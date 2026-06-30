package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable, f75.a {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f192849f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f192850d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.l3 f192851e;

    public m3(java.lang.Runnable runnable, com.tencent.mm.sdk.platformtools.l3 l3Var) {
        this.f192850d = runnable;
        this.f192851e = l3Var;
    }

    public static com.tencent.mm.sdk.platformtools.m3 a(java.lang.Runnable runnable, com.tencent.mm.sdk.platformtools.l3 l3Var) {
        com.tencent.mm.sdk.platformtools.m3 m3Var = new com.tencent.mm.sdk.platformtools.m3(runnable, l3Var);
        ((java.util.concurrent.ConcurrentHashMap) f192849f).put(runnable, m3Var);
        return m3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.f m17;
        gi.e1 e1Var = (gi.e1) this.f192851e;
        e1Var.getClass();
        java.lang.Runnable runnable = this.f192850d;
        java.lang.String name = runnable.getClass().getName();
        int hashCode = runnable.hashCode();
        com.tencent.mars.xlog.Log.i("Matrix.battery.MMHandlerJiffies", "#onTaskStart: " + name + ", hashcode=" + hashCode);
        gi.g1 g1Var = e1Var.f272024b;
        g1Var.getClass();
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper() && (m17 = g1Var.m(name, android.os.Process.myTid())) != null) {
            ((java.util.concurrent.ConcurrentHashMap) g1Var.f395391c).put(java.lang.Integer.valueOf(hashCode), m17);
            g1Var.r(android.os.Process.myTid(), name, ((java.lang.Long) m17.f395377g.f395552a).longValue());
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) e1Var.f272023a;
        gi.f1 f1Var = (gi.f1) concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        if (f1Var != null) {
            g1Var.f395294a.f363337f.removeCallbacks(f1Var);
            f1Var.f272028d = name;
            f1Var.f272029e = currentThread;
            f1Var.f272030f = java.lang.System.currentTimeMillis();
        } else {
            f1Var = new gi.f1(g1Var);
            f1Var.f272028d = name;
            f1Var.f272029e = currentThread;
            f1Var.f272030f = java.lang.System.currentTimeMillis();
        }
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), f1Var);
        g1Var.f395294a.f363337f.postDelayed(f1Var, gi.g1.f272033l);
        runnable.run();
        e1Var.getClass();
        java.lang.String name2 = runnable.getClass().getName();
        int hashCode2 = runnable.hashCode();
        com.tencent.mars.xlog.Log.i("Matrix.battery.MMHandlerJiffies", "#onTaskFinish: " + name2 + ", hashcode=" + hashCode2);
        gi.g1 g1Var2 = e1Var.f272024b;
        rh.f fVar = (rh.f) ((java.util.concurrent.ConcurrentHashMap) g1Var2.f395391c).remove(java.lang.Integer.valueOf(hashCode2));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper() && fVar != null) {
            rh.f m18 = g1Var2.m(name2, android.os.Process.myTid());
            if (m18 != null) {
                m18.f395381k = true;
                g1Var2.u(fVar, m18);
            }
            g1Var2.r(android.os.Process.myTid(), "thread_pool@idle", ((java.lang.Long) (m18 == null ? fVar.f395377g : m18.f395377g).f395552a).longValue());
        }
        gi.f1 f1Var2 = (gi.f1) ((java.util.concurrent.ConcurrentHashMap) e1Var.f272023a).remove(java.lang.Integer.valueOf(hashCode2));
        if (f1Var2 != null) {
            g1Var2.f395294a.f363337f.removeCallbacks(f1Var2);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f1Var2.f272030f;
            if (currentTimeMillis > gi.g1.f272034m) {
                f1Var2.a(false, currentTimeMillis);
            }
        }
    }
}
