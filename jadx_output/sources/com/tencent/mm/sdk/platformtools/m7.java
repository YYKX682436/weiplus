package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f192856a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f192857b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.g7 f192858c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.e7 f192859d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f192860e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f192861f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.os.Handler f192862g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.i7 f192863h;

    static {
        java.lang.String uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        f192856a = new r26.t(uri);
        f192857b = android.os.Build.VERSION.SDK_INT >= 29 ? new java.lang.String[]{"_display_name", "_data", "date_added", "is_pending"} : new java.lang.String[]{"_display_name", "_data", "date_added"};
        f192860e = new java.util.concurrent.CopyOnWriteArrayList();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        f192862g = handler;
        f192863h = new com.tencent.mm.sdk.platformtools.i7(handler);
    }

    public static final void a(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.sdk.platformtools.j7 j7Var = new com.tencent.mm.sdk.platformtools.j7(str, j17, z17);
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            j7Var.run();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "invokeAllCallbacks, not in main thread");
            ((ku5.t0) ku5.t0.f312615d).B(j7Var);
        }
    }

    public static final void b(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotUtil", "register, failed: unable to get process name");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f192860e;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (((java.lang.ref.WeakReference) it.next()).get() == callback) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "register, failed: callback already registered");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(callback);
        if (!kotlin.jvm.internal.o.b(a17, com.tencent.mm.sdk.platformtools.w9.f193053a)) {
            com.tencent.mm.sdk.platformtools.e7 e7Var = f192859d;
            if (e7Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.p) e7Var).a(a17, true);
            }
        } else if (f192860e.isEmpty()) {
            try {
                context.getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, f192863h);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "registerContentObserver");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenShotUtil", th6, "registerContentObserver failed", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "registerContentObserver");
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = f192860e;
        copyOnWriteArrayList2.add(weakReference);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "register, callbackListSize: " + copyOnWriteArrayList2.size());
        if (!(context instanceof androidx.lifecycle.y)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "register, warning: context is not a LifecycleOwner");
            return;
        }
        com.tencent.mm.sdk.platformtools.l7 l7Var = new com.tencent.mm.sdk.platformtools.l7(context, weakReference, a17);
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            l7Var.run();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "register, addLifecycleObserver not in main thread");
            ((ku5.t0) ku5.t0.f312615d).B(l7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap c(android.app.Activity r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.m7.c(android.app.Activity):android.graphics.Bitmap");
    }

    public static final void d(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotUtil", "register, failed: unable to get process name");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f192860e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            com.tencent.mm.sdk.platformtools.f7 f7Var = (com.tencent.mm.sdk.platformtools.f7) weakReference.get();
            if (f7Var == null || f7Var == callback) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (!kotlin.jvm.internal.o.b(a17, com.tencent.mm.sdk.platformtools.w9.f193053a)) {
            com.tencent.mm.sdk.platformtools.e7 e7Var = f192859d;
            if (e7Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.p) e7Var).a(a17, false);
            }
        } else if (copyOnWriteArrayList.isEmpty()) {
            try {
                context.getContentResolver().unregisterContentObserver(f192863h);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenShotUtil", th6, "unregisterContentObserver failed", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "unregister, callbackListSize: " + copyOnWriteArrayList.size());
    }
}
