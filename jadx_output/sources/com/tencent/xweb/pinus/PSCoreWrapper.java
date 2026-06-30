package com.tencent.xweb.pinus;

/* loaded from: classes13.dex */
public class PSCoreWrapper extends com.tencent.xweb.XWebCoreWrapper {
    public static final java.lang.String BRIDGE_PACKAGE = "com.tencent.xweb.pinus";
    private static final java.lang.String TAG = "PSCoreWrapper";
    private static com.tencent.xweb.pinus.PSCoreWrapper sInstance;

    public PSCoreWrapper() {
        sInstance = this;
    }

    public static com.tencent.xweb.pinus.PSCoreWrapper getInstance() {
        return sInstance;
    }

    public static void handleRuntimeError(java.lang.Exception exc) {
        by5.c4.c(TAG, "This API is incompatible with the XWeb Pinus runtime library");
        by5.c4.c(TAG, "stack trace: " + android.util.Log.getStackTraceString(exc));
    }

    @Override // com.tencent.xweb.XWebCoreWrapper
    public java.lang.String getBridgePackageName() {
        return BRIDGE_PACKAGE;
    }

    @Override // com.tencent.xweb.XWebCoreWrapper
    public java.lang.ClassLoader getWebViewCoreClassLoader() {
        return vx5.k.f441374a.b();
    }

    @Override // com.tencent.xweb.XWebCoreWrapper, tx5.h
    public boolean hasFeature(int i17) {
        java.lang.Object g17 = vx5.k.f441374a.g(80003, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
        if (g17 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) g17).booleanValue();
        }
        return false;
    }

    @Override // com.tencent.xweb.XWebCoreWrapper, tx5.h
    public boolean invokeNativeChannel(int i17, java.lang.Object[] objArr) {
        vx5.l lVar = vx5.k.f441374a;
        try {
            by5.c4.f("PinusStandAloneChannel", "invokeNativeChannel, funid:" + i17);
            new by5.i0(lVar.a("PSViewDelegate"), "invokeNativeChannel", java.lang.Integer.TYPE, java.lang.Object[].class).b(java.lang.Integer.valueOf(i17), objArr);
            return true;
        } catch (java.lang.ClassCircularityError e17) {
            by5.c4.c("PinusStandAloneChannel", "invokeNativeChannel ClassCircularityError:" + e17);
            by5.s0.e(938L, 90L, 1L);
            return false;
        } catch (java.lang.RuntimeException e18) {
            by5.c4.c("PinusStandAloneChannel", "invokeNativeChannel RuntimeException:" + e18);
            by5.s0.e(938L, 89L, 1L);
            return false;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "invokeNativeChannel error", th6);
            by5.s0.e(938L, 91L, 1L);
            return false;
        }
    }

    @Override // com.tencent.xweb.XWebCoreWrapper, tx5.h
    public java.lang.Object invokeRuntimeChannel(int i17, java.lang.Object[] objArr) {
        return vx5.k.f441374a.g(i17, objArr);
    }
}
