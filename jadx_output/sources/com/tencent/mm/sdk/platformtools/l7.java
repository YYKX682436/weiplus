package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f192840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192841f;

    public l7(android.content.Context context, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f192839d = context;
        this.f192840e = weakReference;
        this.f192841f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        final android.content.Context context = this.f192839d;
        androidx.lifecycle.o mo133getLifecycle = ((androidx.lifecycle.y) context).mo133getLifecycle();
        final java.lang.ref.WeakReference weakReference = this.f192840e;
        final java.lang.String str = this.f192841f;
        mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.sdk.platformtools.ScreenShotUtil$register$runnable$1$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.sdk.platformtools.m7.f192860e;
                copyOnWriteArrayList.remove(weakReference);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                java.lang.String str3 = str;
                if (!kotlin.jvm.internal.o.b(str3, str2)) {
                    com.tencent.mm.sdk.platformtools.e7 e7Var = com.tencent.mm.sdk.platformtools.m7.f192859d;
                    if (e7Var != null) {
                        ((com.tencent.mm.ui.feature.api.screenshot.p) e7Var).a(str3, false);
                    }
                } else if (copyOnWriteArrayList.isEmpty()) {
                    r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
                    try {
                        context.getContentResolver().unregisterContentObserver(com.tencent.mm.sdk.platformtools.m7.f192863h);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenShotUtil", th6, "unregisterContentObserver failed", new java.lang.Object[0]);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
                }
                owner.mo133getLifecycle().c(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "removeLifecycleObserver, owner: " + owner);
            }
        });
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "addLifecycleObserver, owner: " + context);
    }
}
