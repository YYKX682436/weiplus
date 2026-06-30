package com.tencent.mm.sdk.platformtools;

/* loaded from: classes9.dex */
public class c4 implements com.tencent.mm.sdk.platformtools.w1 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c4 f192496b = new com.tencent.mm.sdk.platformtools.c4();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o3 f192497a = new com.tencent.mm.sdk.platformtools.o3(android.os.Looper.getMainLooper());

    public void a(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f192497a.d(runnable);
        }
    }
}
