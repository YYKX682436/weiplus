package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.f7 f193050e;

    public w4(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var) {
        this.f193049d = context;
        this.f193050e = f7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3 z3Var = new com.tencent.mm.sdk.platformtools.z3();
        android.content.Context context = this.f193049d;
        com.tencent.mm.sdk.platformtools.f7 f7Var = this.f193050e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot setScreenShotCallback context[%s] callback[%s], stack[%s]", context, f7Var, z3Var);
        if (context == null) {
            return;
        }
        try {
            if (f7Var != null) {
                com.tencent.mm.sdk.platformtools.a5.f192458f = new java.lang.ref.WeakReference(f7Var);
                if (com.tencent.mm.sdk.platformtools.a5.f192457e == null) {
                    com.tencent.mm.sdk.platformtools.a5.f192457e = new com.tencent.mm.sdk.platformtools.z4(context, com.tencent.mm.sdk.platformtools.a5.f192454b);
                    context.getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, com.tencent.mm.sdk.platformtools.a5.f192457e);
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.a5.f192457e != null) {
                context.getContentResolver().unregisterContentObserver(com.tencent.mm.sdk.platformtools.a5.f192457e);
                com.tencent.mm.sdk.platformtools.a5.f192457e = null;
            }
            java.lang.ref.WeakReference weakReference = com.tencent.mm.sdk.platformtools.a5.f192458f;
            if (weakReference != null) {
                weakReference.clear();
                com.tencent.mm.sdk.platformtools.a5.f192458f = null;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
