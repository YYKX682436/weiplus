package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes8.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.m2 f158958d = new com.tencent.mm.plugin.scanner.model.m2();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.scanner.model.n2.f158964a;
        java.util.Enumeration keys = concurrentHashMap.keys();
        kotlin.jvm.internal.o.d(keys);
        while (keys.hasMoreElements()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) concurrentHashMap.get((java.lang.String) keys.nextElement());
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        concurrentHashMap.clear();
    }
}
