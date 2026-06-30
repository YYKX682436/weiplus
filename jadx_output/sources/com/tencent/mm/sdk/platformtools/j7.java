package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class j7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f192768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f192769f;

    public j7(java.lang.String str, long j17, boolean z17) {
        this.f192767d = str;
        this.f192768e = j17;
        this.f192769f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = com.tencent.mm.sdk.platformtools.m7.f192860e;
        java.lang.String str = this.f192767d;
        long j17 = this.f192768e;
        boolean z17 = this.f192769f;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            try {
                com.tencent.mm.sdk.platformtools.f7 f7Var = (com.tencent.mm.sdk.platformtools.f7) weakReference.get();
                if (f7Var != null) {
                    f7Var.z0(str, j17, z17);
                } else {
                    com.tencent.mm.sdk.platformtools.m7.f192860e.remove(weakReference);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotUtil", "invokeAllCallbacks, " + weakReference + " failed: " + e17.getMessage());
            }
        }
    }
}
