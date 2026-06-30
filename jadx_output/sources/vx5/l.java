package vx5;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ClassLoader f441377c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f441375a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441376b = false;

    /* renamed from: d, reason: collision with root package name */
    public long f441378d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f441379e = null;

    public l(vx5.i iVar) {
    }

    public java.lang.Class a(java.lang.String str) {
        try {
            java.lang.ClassLoader b17 = b();
            if (b17 == null) {
                by5.c4.g("PinusStandAloneChannel", "getBridgeClass, classloader is null");
                return null;
            }
            return b17.loadClass("com.tencent.xweb.pinus." + str);
        } catch (java.lang.Throwable th6) {
            by5.c4.g("PinusStandAloneChannel", "getBridgeClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    public synchronized java.lang.ClassLoader b() {
        java.lang.ClassLoader classLoader = this.f441377c;
        if (classLoader != null) {
            return classLoader;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f441377c = com.tencent.xweb.u1.b(org.xwalk.core.XWalkEnvironment.d());
            this.f441378d = java.lang.System.currentTimeMillis() - currentTimeMillis;
            by5.c4.a("PinusStandAloneChannel", "getClassLoader, classLoader:" + this.f441377c + ", costTime:" + this.f441378d);
            return this.f441377c;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "getClassLoader error", th6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: all -> 0x0299, TryCatch #0 {, blocks: (B:4:0x001b, B:6:0x001f, B:11:0x0037, B:13:0x006a, B:16:0x0080, B:19:0x0090, B:21:0x009a, B:24:0x00b0, B:26:0x00c6, B:27:0x00c9, B:29:0x00ed, B:32:0x00fc, B:62:0x0137, B:64:0x014a, B:66:0x0161, B:44:0x01e6, B:46:0x0201, B:47:0x020a, B:49:0x0254, B:50:0x025d, B:52:0x026a, B:53:0x027d, B:56:0x0274, B:70:0x0176, B:36:0x018d, B:38:0x01c1, B:40:0x01d0, B:43:0x01df, B:57:0x01c8, B:76:0x012f, B:77:0x0074, B:59:0x010b, B:61:0x0125), top: B:3:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c(boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.l.c(boolean, boolean):boolean");
    }

    public final boolean d() {
        by5.c4.f("PinusStandAloneChannel", "initCoreBridge start");
        try {
            new by5.i0(a("PSCoreBridge"), com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, android.content.Context.class, java.lang.Object.class).b(null, this);
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "initCoreBridge error", th6);
            return false;
        }
    }

    public final boolean e() {
        by5.c4.f("PinusStandAloneChannel", "initLogChannel start");
        try {
            new by5.i0(a("PSViewDelegate"), "setLogCallBack", java.lang.Object.class).b(new vx5.j(this));
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "setLogCallBack error", th6);
            return false;
        }
    }

    public final boolean f() {
        by5.c4.f("PinusStandAloneChannel", "initNotifyChannel start");
        try {
            new by5.i0(a("PSViewDelegate"), "setNotifyCallBackChannel", java.lang.Object.class).b(new vx5.i(this));
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "setNotifyCallBackChannel error", th6);
            return false;
        }
    }

    public java.lang.Object g(int i17, java.lang.Object[] objArr) {
        try {
            return new by5.i0(a("PSViewDelegate"), "invokeRuntimeChannel", java.lang.Integer.TYPE, java.lang.Object[].class).b(java.lang.Integer.valueOf(i17), objArr);
        } catch (java.lang.ClassCircularityError e17) {
            by5.c4.c("PinusStandAloneChannel", "invokeRuntimeChannel ClassCircularityError:" + e17);
            by5.s0.e(938L, 90L, 1L);
            return null;
        } catch (java.lang.RuntimeException e18) {
            by5.c4.c("PinusStandAloneChannel", "invokeRuntimeChannel RuntimeException:" + e18);
            by5.s0.e(938L, 89L, 1L);
            return null;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "invokeRuntimeChannel error", th6);
            by5.s0.e(938L, 91L, 1L);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.l.h():boolean");
    }

    public final void i() {
        try {
            java.lang.String f17 = by5.z3.f(org.xwalk.core.XWalkEnvironment.d());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadNativeLibrary, path:");
            sb6.append(f17);
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append("libxwebcore.so");
            by5.c4.f("PinusStandAloneChannel", sb6.toString());
            com.tencent.cso.CsoLoader.g(f17 + str + "libxwebcore.so");
        } catch (java.lang.Error e17) {
            by5.c4.c("PinusStandAloneChannel", "loadNativeLibraryInternal, error:" + e17);
            throw new java.lang.RuntimeException(e17);
        }
    }

    public final boolean j(boolean z17) {
        try {
            new by5.i0(a("PSCoreBridge"), "setStandAloneMode", java.lang.Boolean.TYPE).b(java.lang.Boolean.valueOf(z17));
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "setStandAloneMode error", th6);
            return false;
        }
    }

    public boolean k(java.lang.ClassLoader classLoader) {
        if (this.f441379e == null) {
            boolean z17 = false;
            try {
                by5.i0 i0Var = new by5.i0((java.lang.Class) classLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate"), "supportLoadXWebLibrary", new java.lang.Class[0]);
                if (i0Var.f36487e == null) {
                    by5.c4.f("PinusStandAloneChannel", "supportLoadXWebLibraryInRuntime, no such method");
                } else {
                    java.lang.Object b17 = i0Var.b(new java.lang.Object[0]);
                    if (b17 instanceof java.lang.Boolean) {
                        by5.c4.f("PinusStandAloneChannel", "supportLoadXWebLibraryInRuntime, result:" + b17);
                        z17 = ((java.lang.Boolean) b17).booleanValue();
                    } else {
                        by5.c4.f("PinusStandAloneChannel", "supportLoadXWebLibraryInRuntime, result:false");
                    }
                }
            } catch (java.lang.Exception e17) {
                by5.c4.d("PinusStandAloneChannel", "supportLoadXWebLibraryInRuntime, error", e17);
            }
            this.f441379e = java.lang.Boolean.valueOf(z17);
        }
        return this.f441379e.booleanValue();
    }
}
