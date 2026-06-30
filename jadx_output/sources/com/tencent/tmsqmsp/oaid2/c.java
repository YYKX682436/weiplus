package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.Executor f215557a = java.util.concurrent.Executors.newSingleThreadExecutor(new com.tencent.tmsqmsp.oaid2.x0());

    public static void a(java.lang.Runnable runnable) {
        if (runnable != null) {
            f215557a.execute(runnable);
        }
    }
}
