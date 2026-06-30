package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class va {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f196290b;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.Future f196292d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.storage.va f196289a = new com.tencent.mm.storage.va();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f196291c = new java.util.concurrent.ConcurrentLinkedQueue();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "SilentDBOperationHelper init");
        com.tencent.mm.app.w.INSTANCE.b(new com.tencent.mm.storage.sa());
    }

    public final void a(java.lang.Runnable runnable, java.lang.String name) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.storage.ua uaVar = com.tencent.mm.storage.ua.f196266d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "executeSqlSilently runnable, name = ".concat(name));
        f196291c.add(new com.tencent.mm.storage.ta(runnable, name, uaVar));
    }
}
