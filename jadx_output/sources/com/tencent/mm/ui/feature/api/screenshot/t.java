package com.tencent.mm.ui.feature.api.screenshot;

@j95.b
/* loaded from: classes8.dex */
public final class t extends i95.w implements ct.d3 {
    public void Ai(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var, java.lang.Boolean bool) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotService", "registerScreenShotCallback, failed: callback is null");
            return;
        }
        if (bool != null ? bool.booleanValue() : true) {
            com.tencent.mm.sdk.platformtools.m7.b(context, f7Var);
        } else {
            com.tencent.mm.sdk.platformtools.a5.a(context, f7Var);
        }
    }

    public void Bi(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var) {
        kotlin.jvm.internal.o.g(context, "context");
        Di(context, f7Var, java.lang.Boolean.TRUE);
    }

    public void Di(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var, java.lang.Boolean bool) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotService", "unregisterScreenShotCallback, failed: callback is null");
            return;
        }
        if (bool != null ? bool.booleanValue() : true) {
            com.tencent.mm.sdk.platformtools.m7.d(context, f7Var);
        } else {
            com.tencent.mm.sdk.platformtools.a5.a(context, null);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "onAccountInitialized, register reporter");
        r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
        com.tencent.mm.sdk.platformtools.m7.f192858c = com.tencent.mm.ui.feature.api.screenshot.s.f208548a;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "onAccountReleased, unregister reporter");
        r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
        com.tencent.mm.sdk.platformtools.m7.f192858c = null;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
        com.tencent.mm.sdk.platformtools.m7.f192859d = new com.tencent.mm.ui.feature.api.screenshot.p();
    }

    public void wi(android.content.Context context, com.tencent.mm.sdk.platformtools.f7 f7Var) {
        kotlin.jvm.internal.o.g(context, "context");
        Ai(context, f7Var, java.lang.Boolean.TRUE);
    }
}
