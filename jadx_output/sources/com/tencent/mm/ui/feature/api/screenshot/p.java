package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class p implements com.tencent.mm.sdk.platformtools.e7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f208541a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.f7 f208542b;

    public void a(java.lang.String callbackProcess, boolean z17) {
        kotlin.jvm.internal.o.g(callbackProcess, "callbackProcess");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl setCallback, callbackProcess: ".concat(callbackProcess));
        com.tencent.mm.ui.feature.api.screenshot.n nVar = new com.tencent.mm.ui.feature.api.screenshot.n(this, callbackProcess, z17);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                nVar.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(nVar);
                return;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isRegister", z17);
        bundle.putString("callbackProcess", callbackProcess);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.ui.feature.api.screenshot.q.class, null);
    }
}
