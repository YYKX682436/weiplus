package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f193082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.z4 f193083e;

    public x4(com.tencent.mm.sdk.platformtools.z4 z4Var, boolean z17, android.net.Uri uri) {
        this.f193083e = z4Var;
        this.f193082d = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.net.Uri uri = this.f193082d;
        uri.toString();
        try {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.sdk.platformtools.a5.f192458f;
            com.tencent.mm.sdk.platformtools.z4 z4Var = this.f193083e;
            if (weakReference != null && weakReference.get() != null) {
                java.lang.String uri2 = uri.toString();
                java.lang.String str = com.tencent.mm.sdk.platformtools.a5.f192455c;
                if (uri2.matches(str) || uri.toString().contains(str)) {
                    com.tencent.mm.sdk.platformtools.z4.a(z4Var, z4Var.f193133d, uri);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot unregisterContentObserver callback is null 1 mCallbackWeakRef[%s]", com.tencent.mm.sdk.platformtools.a5.f192458f);
            if (com.tencent.mm.sdk.platformtools.a5.f192457e != null) {
                z4Var.f193133d.getContentResolver().unregisterContentObserver(com.tencent.mm.sdk.platformtools.a5.f192457e);
                com.tencent.mm.sdk.platformtools.a5.f192457e = null;
            }
            java.lang.ref.WeakReference weakReference2 = com.tencent.mm.sdk.platformtools.a5.f192458f;
            if (weakReference2 != null) {
                weakReference2.clear();
                com.tencent.mm.sdk.platformtools.a5.f192458f = null;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
