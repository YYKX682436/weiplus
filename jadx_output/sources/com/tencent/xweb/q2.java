package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.xweb.w f220526a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f220527b = new java.util.ArrayList();

    public static boolean a(java.lang.String str) {
        com.tencent.xweb.w wVar = f220526a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "getBooleanValue, web preferences not set, key:" + str);
            return false;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            return ((java.lang.Boolean) fVar.f441344f.b(str)).booleanValue();
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f441339a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.tencent.xweb.pinus.PSCoreWrapper.handleRuntimeError(e17);
            return false;
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.xweb.w wVar = f220526a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "getStringValue, web preferences not set, key:" + str);
            return null;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            return (java.lang.String) fVar.f441346h.b(str);
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f441339a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.tencent.xweb.pinus.PSCoreWrapper.handleRuntimeError(e17);
            return null;
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        com.tencent.xweb.w wVar = f220526a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "setValue, web preferences not set, key:" + str);
            return;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            fVar.f441342d.b(str, str2);
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f441339a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.tencent.xweb.pinus.PSCoreWrapper.handleRuntimeError(e17);
        }
    }

    public static void d(java.lang.String str, boolean z17) {
        com.tencent.xweb.w wVar = f220526a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "setValue, web preferences not set, key:" + str);
            return;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            fVar.f441340b.b(str, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f441339a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.tencent.xweb.pinus.PSCoreWrapper.handleRuntimeError(e17);
        }
    }
}
