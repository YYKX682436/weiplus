package iq;

@j95.b
/* loaded from: classes14.dex */
public final class d extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f293626d = com.tencent.mm.sdk.platformtools.o4.L();

    public static final void Ai(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display.HdrCapabilities hdrCapabilities = ((android.view.WindowManager) systemService).getDefaultDisplay().getHdrCapabilities();
        if (hdrCapabilities == null) {
            return;
        }
        int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        kotlin.jvm.internal.o.f(supportedHdrTypes, "getSupportedHdrTypes(...)");
        deviceSupportStruct.f55797d = deviceSupportStruct.b("ScreenSupportedHdrType", kz5.z.c0(supportedHdrTypes, "|", null, null, 0, null, null, 62, null), true);
        float f17 = 100;
        deviceSupportStruct.f55798e = (int) (hdrCapabilities.getDesiredMinLuminance() * f17);
        deviceSupportStruct.f55799f = (int) (hdrCapabilities.getDesiredMaxLuminance() * f17);
        deviceSupportStruct.f55800g = (int) (hdrCapabilities.getDesiredMaxAverageLuminance() * f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "screen hdr type:" + deviceSupportStruct.f55797d + " minLuminance:" + hdrCapabilities.getDesiredMinLuminance() + " maxLuminance:" + hdrCapabilities.getDesiredMaxLuminance() + " maxAverageLuminance:" + hdrCapabilities.getDesiredMaxAverageLuminance());
    }

    public static final boolean Bi(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (kotlin.jvm.internal.o.b(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeviceSupportTask", "eglGetDisplay EGL_NO_DISPLAY");
            return false;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeviceSupportTask", "eglInitialize failed");
            return false;
        }
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(eglGetDisplay, 12373);
        kotlin.jvm.internal.o.d(eglQueryString);
        boolean B = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_pq", false);
        boolean B2 = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_hlg", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "supportPQExt:" + B + " supportHlgExt:" + B2);
        deviceSupportStruct.f55815v = B ? 1 : 2;
        deviceSupportStruct.f55816w = B2 ? 1 : 2;
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12344}, 0, null, 0, 0, iArr2, 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeviceSupportTask", "eglChooseConfig error");
            deviceSupportStruct.f55817x = 3;
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "eglChooseConfig result:" + iArr2[0]);
        deviceSupportStruct.f55817x = iArr2[0] > 0 ? 1 : 2;
        if (!android.opengl.EGL14.eglTerminate(eglGetDisplay)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeviceSupportTask", "eglTerminate error");
        }
        return B && B2 && iArr2[0] > 0;
    }

    public static final void Di(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        yr2.e eVar = yr2.e.f464664a;
        deviceSupportStruct.f55801h = eVar.a() ? 1 : 2;
        deviceSupportStruct.f55802i = eVar.b() ? 1 : 2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupportHDR10PLUS:");
        boolean z17 = yr2.e.f464667d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("HdrCapability", sb6.toString());
        deviceSupportStruct.f55803j = z17 ? 1 : 2;
        deviceSupportStruct.f55804k = eVar.c() ? 1 : 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "checkHdrPlaySupport Dolby:" + deviceSupportStruct.f55801h + " HDR10:" + deviceSupportStruct.f55802i + " HDR10Plus:" + deviceSupportStruct.f55803j + " HDRHLG:" + deviceSupportStruct.f55804k);
    }

    public static final void Ni(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct, android.content.Context context) {
        dVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.os.LocaleList locales = context.getResources().getConfiguration().getLocales();
        kotlin.jvm.internal.o.f(locales, "getLocales(...)");
        int size = locales.size();
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(locales.get(i17).toString());
            sb6.append("|");
        }
        deviceSupportStruct.f55813t = deviceSupportStruct.b("ConfigLocale", sb6.toString(), true);
        deviceSupportStruct.f55812s = deviceSupportStruct.b("WechatLocale", com.tencent.mm.sdk.platformtools.m2.f(context), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "configLocale:" + deviceSupportStruct.f55813t + " wechatLocale:" + deviceSupportStruct.f55812s);
    }

    public static final void Ri(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) systemService).getDeviceConfigurationInfo();
        if (deviceConfigurationInfo == null) {
            return;
        }
        deviceSupportStruct.f55805l = deviceSupportStruct.b("OpenGLVersion", deviceConfigurationInfo.getGlEsVersion(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "checkOpenGLVersion:" + deviceSupportStruct.f55805l);
    }

    public static final void Ui(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        deviceSupportStruct.f55811r = (int) ((android.view.WindowManager) systemService).getDefaultDisplay().getRefreshRate();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "checkScreenFPS:" + deviceSupportStruct.f55811r);
    }

    public static final void wi(iq.d dVar, com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        deviceSupportStruct.f55806m = rs0.n.f399306d.f();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
        long j17 = 1024;
        deviceSupportStruct.f55807n = (int) ((memoryInfo.totalMem / j17) / j17);
        java.lang.String str = (java.lang.String) ((java.util.HashMap) wo.w0.e()).get("hardware");
        deviceSupportStruct.f55808o = deviceSupportStruct.b("CPUName", str != null ? r26.i0.t(str, ",", ";", false) : "", true);
        int a17 = wo.r.a();
        deviceSupportStruct.f55809p = (a17 >> 12) & 15;
        deviceSupportStruct.f55810q = a17 & 255;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceSupportTask", "checkCPUSupport name:" + deviceSupportStruct.f55808o + " freq:" + deviceSupportStruct.f55810q + " core:" + deviceSupportStruct.f55809p + " memB:" + deviceSupportStruct.f55807n + " gpuScore:" + deviceSupportStruct.f55806m);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        boolean z17 = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_device_support, true)) {
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
            long q17 = this.f293626d.q("MicroMsg.DeviceSupportTask", 0L);
            if (!com.tencent.mm.sdk.platformtools.s9.f192975c) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || java.lang.System.currentTimeMillis() - q17 > 86400000) {
                this.f293626d.B("MicroMsg.DeviceSupportTask", java.lang.System.currentTimeMillis());
                ((ku5.t0) ku5.t0.f312615d).g(new iq.c(this, context));
            }
        }
    }
}
