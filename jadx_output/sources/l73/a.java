package l73;

/* loaded from: classes14.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f316875a = null;

    public static java.lang.String i(java.lang.String str) {
        wo.i1 i1Var = null;
        try {
            try {
                i1Var = wo.i1.d(str, true);
                java.lang.String l17 = i1Var.l();
                try {
                    i1Var.q();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e17, "codec release exception", new java.lang.Object[0]);
                }
                return l17;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e18, "hy: error in handle media codec", new java.lang.Object[0]);
                if (i1Var != null) {
                    try {
                        i1Var.q();
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e19, "codec release exception", new java.lang.Object[0]);
                    }
                }
                return "undefined";
            }
        } catch (java.lang.Throwable th6) {
            if (i1Var != null) {
                try {
                    i1Var.q();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e27, "codec release exception", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public final void b() {
        r45.rs rsVar = new r45.rs();
        rsVar.f385166f = android.os.Build.CPU_ABI;
        java.util.Map c17 = wo.t.c();
        java.lang.String str = (java.lang.String) c17.get("Processor");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        rsVar.f385164d = str;
        rsVar.f385167g = (java.lang.String) c17.get("model name");
        rsVar.f385168h = (java.lang.String) c17.get("Hardware");
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"), false);
                rsVar.f385165e = com.tencent.mm.sdk.platformtools.t8.P(randomAccessFile.readLine(), -1) / 1000;
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e17, "hy: error when close read cpu files", new java.lang.Object[0]);
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e18, "hy: error when reading cpu frequency", new java.lang.Object[0]);
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e19, "hy: error when close read cpu files", new java.lang.Object[0]);
                    }
                }
            }
            k73.a.b().a().f387665e = rsVar;
        } catch (java.lang.Throwable th6) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e27, "hy: error when close read cpu files", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }

    public final void c() {
        r45.yq0 yq0Var = new r45.yq0();
        yq0Var.f391289d = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
        yq0Var.f391290e = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        yq0Var.f391291f = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        yq0Var.f391292g = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        yq0Var.f391293h = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        yq0Var.f391294i = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.microphone");
        yq0Var.f391295m = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        yq0Var.f391306x = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        yq0Var.f391296n = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        yq0Var.f391297o = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
        yq0Var.f391298p = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.telephony.cdma");
        yq0Var.f391299q = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.telephony.gsm");
        yq0Var.f391300r = this.f316875a.getPackageManager().hasSystemFeature("android.software.sip");
        yq0Var.f391301s = this.f316875a.getPackageManager().hasSystemFeature("android.software.sip.voip");
        yq0Var.f391302t = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        yq0Var.f391303u = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        yq0Var.f391304v = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.sensor.accelerometer");
        yq0Var.f391305w = this.f316875a.getPackageManager().hasSystemFeature("android.hardware.sensor.light");
        k73.a.b().a().f387670m = yq0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        this.f316875a = (android.content.Context) obj;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            r45.uv3 k17 = k();
            if (k17 != null) {
                k73.a.b().f304782a = k17;
            } else {
                r45.ce ceVar = new r45.ce();
                ceVar.f371492d = wo.w0.g(false);
                ceVar.f371493e = android.os.Build.MANUFACTURER;
                ceVar.f371494f = wo.w0.m();
                ceVar.f371495g = android.os.Build.VERSION.INCREMENTAL;
                k73.a.b().a().f387664d = ceVar;
                b();
                f();
                h();
                d();
                g();
                e();
                c();
                j();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: calc hardware using: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k73.a.b().a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e17, "hy: exception when find hardware info", new java.lang.Object[0]);
            km5.b c17 = km5.u.c();
            if (c17 != null) {
                c17.a(null);
            }
            return null;
        }
    }

    public final void d() {
        android.opengl.EGLDisplay eglGetDisplay;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        android.content.pm.ConfigurationInfo deviceConfigurationInfo = ((android.app.ActivityManager) this.f316875a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        r45.v53 v53Var = new r45.v53();
        int i17 = deviceConfigurationInfo.reqGlEsVersion;
        v53Var.f387893d = i17 >= 131072;
        v53Var.f387894e = i17 >= 196608;
        try {
            ((fa1.u) ((com.tencent.mm.plugin.appbrand.service.d6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.d6.class))).getClass();
            v53Var.f387895f = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo().reqGlEsVersion >= 196608 && com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.vulkan.version");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", th6, "hy: error when retrieve vulkan support!", new java.lang.Object[0]);
            v53Var.f387895f = false;
        }
        try {
            eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", th7, "hy: failed in getting info", new java.lang.Object[0]);
        }
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("Unable to get EGL14 display");
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr2, 0)) {
            throw new java.lang.RuntimeException("Unable to initialize EGL14");
        }
        v53Var.f387896g = java.lang.String.format("%d.%d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr2[0]));
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr3 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr3, 0) || iArr3[0] == 0) {
            throw new java.lang.RuntimeException("Unable to choose EGLConfig");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (!android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            throw new java.lang.RuntimeException("Unable to make EGL context current");
        }
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7937);
        java.lang.String glGetString2 = android.opengl.GLES20.glGetString(7938);
        java.lang.String glGetString3 = android.opengl.GLES20.glGetString(35724);
        java.lang.String glGetString4 = android.opengl.GLES20.glGetString(7939);
        java.lang.String glGetString5 = android.opengl.GLES20.glGetString(7936);
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        android.opengl.EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        android.opengl.EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        android.opengl.EGL14.eglTerminate(eglGetDisplay);
        v53Var.f387899m = glGetString;
        v53Var.f387900n = glGetString2;
        v53Var.f387901o = glGetString3;
        v53Var.f387897h = glGetString4;
        v53Var.f387898i = glGetString5;
        k73.a.b().a().f387671n = v53Var;
        android.os.SystemClock.elapsedRealtime();
    }

    public final void e() {
        r45.h50 h50Var = new r45.h50();
        h50Var.f375848d = i("video/avc");
        h50Var.f375849e = i("video/hevc");
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str : codecInfoAt.getSupportedTypes()) {
                    java.util.Set set = (java.util.Set) hashMap.get(str.toLowerCase());
                    if (set == null) {
                        set = new java.util.HashSet();
                    }
                    set.add(codecInfoAt.getName());
                    hashMap.put(str.toLowerCase(), set);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: allCodecNames: %s", hashMap);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.nm4 nm4Var = new r45.nm4();
            nm4Var.f381496d = (java.lang.String) entry.getKey();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (entry.getValue() != null) {
                linkedList2.addAll((java.util.Collection) entry.getValue());
            }
            nm4Var.f381497e = linkedList2;
            linkedList.add(nm4Var);
        }
        h50Var.f375850f = linkedList;
        k73.a.b().a().f387669i = h50Var;
        java.util.LinkedList linkedList3 = h50Var.f375850f;
        if (linkedList3 != null) {
            linkedList3.size();
        }
    }

    public final void f() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) this.f316875a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        r45.pk4 pk4Var = new r45.pk4();
        pk4Var.f383128d = (int) ((memoryInfo.totalMem / 1024) / 1024);
        pk4Var.f383129e = (int) ((memoryInfo.threshold / 1024) / 1024);
        pk4Var.f383130f = ((android.app.ActivityManager) this.f316875a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        pk4Var.f383131g = ((android.app.ActivityManager) this.f316875a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass();
        k73.a.b().a().f387666f = pk4Var;
    }

    public final void g() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) this.f316875a.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        int i17 = point.x;
        int i18 = point.y;
        r45.pv5 pv5Var = new r45.pv5();
        pv5Var.f383418d = i17 + "x" + i18;
        pv5Var.f383419e = (int) this.f316875a.getResources().getDisplayMetrics().density;
        k73.a.b().a().f387668h = pv5Var;
    }

    public final void h() {
        android.os.StatFs statFs = new android.os.StatFs(lp0.b.e0());
        r45.ie6 ie6Var = new r45.ie6();
        ie6Var.f376976d = (int) ((statFs.getTotalBytes() / 1024) / 1024);
        ie6Var.f376977e = android.os.Environment.getExternalStorageState().equals("mounted");
        k73.a.b().a().f387667g = ie6Var;
    }

    public final void j() {
        try {
            r45.uv3 a17 = k73.a.b().a();
            if (a17 != null) {
                if (a17.f387665e != null) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HARDWARE_CPU_FREQUENCY_MHZ_INT_SYNC, java.lang.Integer.valueOf(a17.f387665e.f385165e));
                }
                if (a17.f387666f != null) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HARDWARE_MEMORY_IN_MB_INT_SYNC, java.lang.Integer.valueOf(a17.f387666f.f383128d));
                }
                java.lang.String format = java.lang.String.format("%s#%s", "KEY_PREFIX", com.tencent.mm.sdk.platformtools.z.f193111g);
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: try saving hardware info with key %s", format);
                com.tencent.mm.sdk.platformtools.o4.M("HARDWARE_INFO_MMKV").H(format, a17.toByteArray());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e17, "save hardware info to config storage exception", new java.lang.Object[0]);
        }
    }

    public final r45.uv3 k() {
        java.lang.String format = java.lang.String.format("%s#%s", "KEY_PREFIX", com.tencent.mm.sdk.platformtools.z.f193111g);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: try parse hardware info from %s", format);
        byte[] j17 = com.tencent.mm.sdk.platformtools.o4.M("HARDWARE_INFO_MMKV").j(format);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: no former saved hardwareInfo");
            return null;
        }
        try {
            r45.uv3 uv3Var = (r45.uv3) new r45.uv3().parseFrom(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskFindHardwareInfo", "hy: got info from mmkv");
            return uv3Var;
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TaskFindHardwareInfo", "hy: can not parse from mmkv data!");
            return null;
        } catch (java.lang.ClassCastException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TaskFindHardwareInfo", "hy: can not parse to hardware info");
            return null;
        }
    }
}
