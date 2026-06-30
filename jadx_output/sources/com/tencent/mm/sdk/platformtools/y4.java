package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f193099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f193100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.z4 f193101h;

    public y4(com.tencent.mm.sdk.platformtools.z4 z4Var, android.content.Context context, java.lang.String str, long j17, long j18) {
        this.f193101h = z4Var;
        this.f193097d = context;
        this.f193098e = str;
        this.f193099f = j17;
        this.f193100g = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f193097d;
        java.lang.String str = this.f193098e;
        com.tencent.mm.sdk.platformtools.z4 z4Var = this.f193101h;
        z4Var.getClass();
        long j17 = this.f193100g;
        long j18 = this.f193099f;
        try {
            if (java.lang.Math.abs(j17 - j18) > 10 || j17 - z4Var.f193130a <= 1 || com.tencent.mm.sdk.platformtools.t8.K0(str) || (!(str.toLowerCase().contains("screenshot") || str.contains("截屏") || str.contains("截图")) || str.equals(z4Var.f193131b))) {
                j18 = 0;
                str = null;
            } else {
                z4Var.f193130a = j17;
                z4Var.f193131b = str;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot added path: " + str + ", time: " + j18);
            java.lang.ref.WeakReference weakReference = com.tencent.mm.sdk.platformtools.a5.f192458f;
            com.tencent.mm.sdk.platformtools.f7 f7Var = weakReference != null ? (com.tencent.mm.sdk.platformtools.f7) weakReference.get() : null;
            if (f7Var != null) {
                f7Var.z0(str, j18, false);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.a5.f192457e != null) {
                context.getContentResolver().unregisterContentObserver(com.tencent.mm.sdk.platformtools.a5.f192457e);
                com.tencent.mm.sdk.platformtools.a5.f192457e = null;
            }
            java.lang.ref.WeakReference weakReference2 = com.tencent.mm.sdk.platformtools.a5.f192458f;
            if (weakReference2 != null) {
                weakReference2.clear();
                com.tencent.mm.sdk.platformtools.a5.f192458f = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot unregisterContentObserver callback is null 2");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
