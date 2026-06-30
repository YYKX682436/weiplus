package kh;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.u0 f307884d;

    public p0(kh.u0 u0Var) {
        this.f307884d = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper looper;
        android.os.HandlerThread handlerThread;
        android.os.Looper looper2;
        android.os.Looper looper3;
        android.os.HandlerThread handlerThread2;
        android.os.Looper looper4;
        kh.u0 u0Var = this.f307884d;
        java.util.List list = u0Var.f307924a;
        kh.k1 k1Var = u0Var.f307927d;
        synchronized (list) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "#startWatching", new java.lang.Object[0]);
            if (k1Var.A()) {
                for (java.lang.Thread thread : java.lang.Thread.getAllStackTraces().keySet()) {
                    if (android.os.Looper.getMainLooper().getThread() == thread) {
                        if (!((java.util.HashMap) u0Var.f307925b).containsKey(android.os.Looper.getMainLooper())) {
                            u0Var.a(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, android.os.Looper.getMainLooper());
                        }
                    } else if ((thread instanceof android.os.HandlerThread) && (looper3 = ((android.os.HandlerThread) thread).getLooper()) != null && !((java.util.HashMap) u0Var.f307925b).containsKey(looper3) && (looper4 = (handlerThread2 = (android.os.HandlerThread) thread).getLooper()) != null) {
                        java.lang.String name = handlerThread2.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        u0Var.a(name, looper4);
                    }
                }
            } else {
                if (k1Var.B()) {
                    if (!((java.util.HashMap) u0Var.f307925b).containsKey(android.os.Looper.getMainLooper())) {
                        u0Var.a(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, android.os.Looper.getMainLooper());
                    }
                }
                java.util.Collection<java.lang.Thread> collection = kz5.p0.f313996d;
                java.util.Collection<java.lang.String> collection2 = k1Var.f395294a.f363335d.f363304w;
                if (collection2 == null) {
                    collection2 = collection;
                }
                for (java.lang.String str : collection2) {
                    if (!android.text.TextUtils.isEmpty(str) && !r26.i0.p(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, str, true) && !((java.util.ArrayList) u0Var.f307924a).contains(str)) {
                        if (collection.isEmpty()) {
                            collection = java.lang.Thread.getAllStackTraces().keySet();
                        }
                        for (java.lang.Thread thread2 : collection) {
                            if (android.os.Looper.getMainLooper().getThread() != thread2) {
                                java.lang.String name2 = thread2.getName();
                                kotlin.jvm.internal.o.f(name2, "getName(...)");
                                if (r26.n0.B(name2, str, false) && (thread2 instanceof android.os.HandlerThread) && (looper = ((android.os.HandlerThread) thread2).getLooper()) != null && !((java.util.HashMap) u0Var.f307925b).containsKey(looper) && (looper2 = (handlerThread = (android.os.HandlerThread) thread2).getLooper()) != null) {
                                    java.lang.String name3 = handlerThread.getName();
                                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                                    u0Var.a(name3, looper2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
