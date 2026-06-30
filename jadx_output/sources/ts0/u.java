package ts0;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f421571a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f421572b;

    /* renamed from: c, reason: collision with root package name */
    public wo.h f421573c;

    public final wo.h a(android.content.Context context, int i17, android.os.Looper looper) {
        java.lang.Object obj;
        if (context == null) {
            return null;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long id6 = java.lang.Thread.currentThread().getId();
        java.lang.Object obj2 = this.f421571a;
        synchronized (obj2) {
            try {
                this.f421572b = false;
                this.f421573c = null;
                obj = obj2;
                try {
                    s75.d.b(new ts0.t(this, id6, currentTimeMillis, context, i17, looper), "SightCamera_openCamera");
                    try {
                        this.f421571a.wait(30000L);
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", e17.getMessage());
                    }
                    wo.h hVar = this.f421573c;
                    if (hVar != null) {
                        kotlin.jvm.internal.o.d(hVar);
                        if (hVar.f447713a != null) {
                            wo.h hVar2 = this.f421573c;
                            kotlin.jvm.internal.o.d(hVar2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", java.lang.Long.valueOf(id6), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), hVar2.f447713a);
                            wo.h hVar3 = this.f421573c;
                            return hVar3;
                        }
                    }
                    this.f421572b = true;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }
}
