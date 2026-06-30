package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class jd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209003d;

    public jd(java.lang.Runnable runnable) {
        this.f209003d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.md mdVar = com.tencent.mm.ui.td.f209893c;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        boolean b17 = kotlin.jvm.internal.o.b(myLooper, mainLooper);
        java.lang.Runnable runnable = this.f209003d;
        if (b17) {
            runnable.run();
            return;
        }
        java.lang.reflect.Field field = com.tencent.mm.ui.td.f209895e;
        kotlin.jvm.internal.o.d(field);
        java.lang.Object obj = field.get(null);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.lang.ThreadLocal<in android.os.Looper>");
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) obj;
        try {
            threadLocal.set(mainLooper);
            runnable.run();
        } finally {
            threadLocal.set(myLooper);
        }
    }
}
