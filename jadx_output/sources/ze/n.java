package ze;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.AppBrandRuntime implements u81.f, com.tencent.mm.plugin.appbrand.jsapi.auth.g {
    public com.tencent.mm.plugin.appbrand.ui.ga V1;
    public java.lang.Boolean W1;
    public volatile si1.g X1;
    public volatile com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode Y1;
    public final xh1.g[] Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.h[] f471741a2;

    /* renamed from: b2, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.h[] f471742b2;

    /* renamed from: c2, reason: collision with root package name */
    public final bm5.i1 f471743c2;

    /* renamed from: d2, reason: collision with root package name */
    public final bm5.i1 f471744d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f471745e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f471746f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f471747g2;

    /* renamed from: h2, reason: collision with root package name */
    public volatile android.os.PowerManager.WakeLock f471748h2;

    public n(xi1.g gVar) {
        super(gVar.getContext());
        this.f74796e = null;
        this.f74798g = gVar;
        this.W1 = null;
        this.Y1 = com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f86100f;
        this.Z1 = new xh1.g[]{null};
        this.f471741a2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h[]{null};
        this.f471742b2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h[]{null};
        this.f471743c2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$a
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.tencent.mm.plugin.appbrand.me(nVar);
            }
        }, new ze.n$$b());
        this.f471744d2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$c
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.tencent.mm.plugin.appbrand.rd(nVar);
            }
        }, new ze.n$$d());
        this.f471748h2 = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void C1(boolean z17, int i17, boolean z18) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleBlinkMutation isStart:%b, status:%d, isCustomStatus:%b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
        X1((z17 ? mi1.y0.f326730e : mi1.y0.f326731f).f326733d, (z18 ? i17 == 1 ? mi1.z0.f326744m : i17 == 0 ? mi1.z0.f326745n : mi1.z0.f326739e : mi1.a1.e(i17)).f326747d, (this.f74821z.f326707f.f326665f.f326567a > 0 ? mi1.z0.f326740f : mi1.z0.f326739e).f326747d);
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            android.os.PowerManager.WakeLock wakeLock = this.f471748h2;
            this.f471748h2 = null;
            v2(wakeLock);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void D1(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleMutationClick type:%d", java.lang.Integer.valueOf(i17));
        mi1.y0 y0Var = mi1.y0.f326730e;
        mi1.z0 z0Var = mi1.z0.f326739e;
        X1(3, i17, 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void E1(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleBlinkMutation isStart:%b type:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        X1((z17 ? mi1.y0.f326730e : mi1.y0.f326731f).f326733d, i17, mi1.a1.d(this).f326747d);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public final boolean M0() {
        return u0().f47285z1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if ((r2 == 1101) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004c, code lost:
    
        if ((r0 != 1011 || r0 == 1012 || r0 == 1013) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.n.U1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.appstorage.u1 W() {
        com.tencent.mm.plugin.appbrand.jsapi.file.h b17;
        if (E0() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.AppBrandRuntimeLU", "createFileSystem but get NUL sysConfig, appId:%s", this.f74803n);
            b17 = new com.tencent.mm.plugin.appbrand.jsapi.file.h();
        } else {
            b17 = com.tencent.mm.plugin.appbrand.config.a.b(u0());
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.file.l2(this, b17);
    }

    public final void W1() {
        android.os.PowerManager.WakeLock wakeLock = this.f471748h2;
        if (!Z1()) {
            v2(wakeLock);
            return;
        }
        if (wakeLock == null || !wakeLock.isHeld()) {
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) this.f74795d.getSystemService("power")).newWakeLock(1, "wx:appbrand_headless");
            newWakeLock.setReferenceCounted(false);
            if (!newWakeLock.isHeld()) {
                K("acquireWakeLock", new java.lang.Object[0]);
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(60000L);
                yj0.a.d(newWakeLock, aVar.b(), "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                zj0.c.f473285a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                zj0.c.a();
                newWakeLock.acquire(longValue);
                yj0.a.f(newWakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            }
            this.f471748h2 = newWakeLock;
        }
    }

    public final void X1(int i17, int i18, int i19) {
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeLU", "action <= 0 || type <= 0");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.j2 j2Var = (com.tencent.mm.plugin.appbrand.report.j2) i95.n0.c(com.tencent.mm.plugin.appbrand.report.j2.class);
        java.lang.String str = this.f74803n;
        java.lang.String t17 = x0() != null ? u46.l.t(nf.z.a(x0().getCurrentUrl()), 0, 1024) : "";
        java.lang.String t18 = x0() != null ? u46.l.t(nf.z.b(x0().getCurrentUrl()), 0, 1024) : "";
        if (u0() != null) {
            java.lang.String str2 = u0().f47276v;
        }
        int g27 = g2();
        com.tencent.mm.plugin.appbrand.trade.a aVar = (com.tencent.mm.plugin.appbrand.trade.a) j2Var;
        aVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.WeAppCapsuleMutationReportStruct weAppCapsuleMutationReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppCapsuleMutationReportStruct();
        weAppCapsuleMutationReportStruct.f62225d = i17;
        weAppCapsuleMutationReportStruct.f62226e = i18;
        weAppCapsuleMutationReportStruct.f62227f = i19;
        weAppCapsuleMutationReportStruct.f62228g = weAppCapsuleMutationReportStruct.b("appid", str, true);
        weAppCapsuleMutationReportStruct.f62229h = weAppCapsuleMutationReportStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, t17, true);
        weAppCapsuleMutationReportStruct.f62230i = weAppCapsuleMutationReportStruct.b("query", t18, true);
        weAppCapsuleMutationReportStruct.f62231j = weAppCapsuleMutationReportStruct.b("sessionid", weAppCapsuleMutationReportStruct.f62231j, true);
        weAppCapsuleMutationReportStruct.f62232k = g27;
        com.tencent.mars.xlog.Log.i(aVar.f89233d, weAppCapsuleMutationReportStruct.n());
        weAppCapsuleMutationReportStruct.k();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public ph1.h Y() {
        return E0() != null && (!com.tencent.mm.sdk.platformtools.t8.L0(E0().f305852r.f75402g) || u0().k()) ? new ph1.g0(this) : new ve.b(this, null);
    }

    public android.graphics.Bitmap Y1() {
        mi1.v vVar = this.f74821z;
        if (vVar != null && vVar.f326703b != null) {
            vVar.c().cancelPendingInputEvents();
        }
        if (D0() != null) {
            D0().cancelPendingInputEvents();
        }
        try {
            if (x0() != null) {
                x0().getCurrentPage().getCurrentPageView().r1().cancelPendingInputEvents();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return com.tencent.mm.plugin.appbrand.page.ie.b(this.f74810s);
    }

    public final boolean Z1() {
        return !L0() && com.tencent.luggage.sdk.launching.p.HEADLESS == u0().W1;
    }

    public final boolean a2() {
        if (L0()) {
            return false;
        }
        return u0().W1.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void b1() {
        com.tencent.mm.plugin.appbrand.ipc.f.a();
        java.util.ArrayList arrayList = u0().O1;
        if (!(arrayList == null || arrayList.isEmpty())) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.networking.u0(arrayList, null), 2, null);
        }
        W1();
        u81.h hVar = this.N;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.AppBrandRuntimeLU", "installOnRunningStateChangedListener, runningStateController is null");
        } else {
            hVar.a(this);
        }
    }

    public boolean b2() {
        return 1030 == l2().f87790f;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void c1() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar;
        super.c1();
        android.os.PowerManager.WakeLock wakeLock = this.f471748h2;
        this.f471748h2 = null;
        v2(wakeLock);
        u81.h hVar2 = this.N;
        if (hVar2 == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.AppBrandRuntimeLU", "uninstallOnRunningStateChangedListener, runningStateController is null");
        } else {
            hVar2.c(this);
        }
        xe.g.f453742c.remove(this);
        com.tencent.mm.plugin.appbrand.ui.ga gaVar = this.V1;
        if (gaVar != null) {
            if (gaVar.getParent() instanceof android.view.ViewGroup) {
                com.tencent.mm.plugin.appbrand.ui.ga gaVar2 = this.V1;
                java.lang.String str = gaVar2.f89737d.f74803n;
                java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.performance.h.f87351a;
                com.tencent.mm.plugin.appbrand.performance.f fVar = (com.tencent.mm.plugin.appbrand.performance.f) hashMap.get(str);
                if (fVar != null) {
                    hashMap.remove(str);
                    fVar.h();
                }
                gaVar2.animate().alpha(0.0f).setDuration(500L).setListener(new com.tencent.mm.plugin.appbrand.ui.ba(gaVar2));
                ((android.view.ViewGroup) this.V1.getParent()).removeView(this.V1);
            }
            this.V1 = null;
        }
        if (this.X1 != null) {
            si1.g gVar = this.X1;
            synchronized (gVar.f408250d) {
                gVar.f408250d.clear();
            }
        }
        ui1.t.f428082d.g(this.f74803n);
        this.X1 = null;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h[][] hVarArr = {this.f471741a2, this.f471742b2};
        for (int i17 = 0; i17 < 2; i17++) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.h[] hVarArr2 = hVarArr[i17];
            synchronized (hVarArr2) {
                hVar = hVarArr2[0];
                hVarArr2[0] = null;
            }
            if (hVar != null) {
                hVar.h();
            }
        }
        xh1.g[] gVarArr = this.Z1;
        if (gVarArr != null) {
            synchronized (gVarArr) {
                xh1.g gVar2 = this.Z1[0];
                if (gVar2 != null) {
                    try {
                        gVar2.c();
                        this.Z1[0] = null;
                    } catch (java.lang.Throwable th6) {
                        this.Z1[0] = null;
                        throw th6;
                    }
                }
            }
        }
        this.f471743c2.c();
    }

    public com.tencent.mm.plugin.appbrand.ui.ga c2() {
        return new com.tencent.mm.plugin.appbrand.ui.ga(r0(), this);
    }

    public final int d2() {
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(this.f74805p.f77281g)) {
            return 0;
        }
        return u0().L;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void e1() {
        this.Y1 = u0().X1;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.g
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.f L() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar = this.f471741a2[0];
        if (hVar != null) {
            return (com.tencent.mm.plugin.appbrand.jsapi.auth.f) hVar;
        }
        if (L0()) {
            return null;
        }
        synchronized (this.f471741a2) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar2 = this.f471741a2[0];
            if (hVar2 != null) {
                return (com.tencent.mm.plugin.appbrand.jsapi.auth.f) hVar2;
            }
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = E0();
            int i17 = (E0 != null ? E0.Y : com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b()).R;
            com.tencent.mm.plugin.appbrand.jsapi.auth.h[] hVarArr = this.f471741a2;
            com.tencent.mm.plugin.appbrand.jsapi.auth.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.f(i17);
            hVarArr[0] = fVar;
            return fVar;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void f1() {
        if (this.X1 == null) {
            throw new java.lang.IllegalStateException("Should ensure ApiPermissionController installed before init. Use #setApiPermissionController().");
        }
        if ((Z1() || 4 == u0().f47284z) && android.text.TextUtils.isEmpty(u0().f77283i) && !android.text.TextUtils.isEmpty(u0().f47281y)) {
            u0().f77283i = u0().f47281y;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.g
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.l B() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar = this.f471742b2[0];
        if (hVar != null) {
            return (com.tencent.mm.plugin.appbrand.jsapi.auth.l) hVar;
        }
        if (L0()) {
            return null;
        }
        synchronized (this.f471742b2) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.h[] hVarArr = this.f471742b2;
            com.tencent.mm.plugin.appbrand.jsapi.auth.h hVar2 = hVarArr[0];
            if (hVar2 != null) {
                return (com.tencent.mm.plugin.appbrand.jsapi.auth.l) hVar2;
            }
            com.tencent.mm.plugin.appbrand.jsapi.auth.l lVar = new com.tencent.mm.plugin.appbrand.jsapi.auth.l(this.f74803n);
            hVarArr[0] = lVar;
            return lVar;
        }
    }

    public int g2() {
        return l2().f87790f;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void h1() {
        boolean z17;
        xe.g gVar = xe.g.f453740a;
        xe.c cVar = xe.g.f453741b;
        final xe.e eVar = new xe.e(this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((xe.d) cVar).f453737a;
        try {
            z17 = copyOnWriteArrayList.removeIf(new java.util.function.Predicate(eVar) { // from class: xe.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.l f453739a;

                {
                    kotlin.jvm.internal.o.g(eVar, "function");
                    this.f453739a = eVar;
                }

                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(java.lang.Object obj) {
                    return ((java.lang.Boolean) this.f453739a.invoke(obj)).booleanValue();
                }
            });
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                xe.b bVar = (xe.b) it.next();
                kotlin.jvm.internal.o.d(bVar);
                if (((java.lang.Boolean) eVar.invoke(bVar)).booleanValue()) {
                    copyOnWriteArrayList.remove(bVar);
                    z17 = true;
                    break;
                }
            }
        }
        if (!z17) {
            xe.g.f453742c.add(this);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("register with rt(appId:");
        sb6.append(this.f74803n);
        sb6.append(", instanceId:");
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = u0();
        java.lang.String str = u07 != null ? u07.f47277w : null;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("), but finished by pending message.");
        com.tencent.mars.xlog.Log.e("Luggage.LuggageClientProcessMessageDispatcher", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: h2, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.jsapi.file.l2 getFileSystem() {
        return (com.tencent.mm.plugin.appbrand.jsapi.file.l2) super.getFileSystem();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: i2, reason: merged with bridge method [inline-methods] */
    public com.tencent.luggage.sdk.config.AppBrandInitConfigLU u0() {
        return (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) this.f74805p;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: j2, reason: merged with bridge method [inline-methods] */
    public we.a x0() {
        return (we.a) this.f74809r;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void k0(java.lang.Object obj) {
        if (u0().f47280x1 != null) {
            try {
                com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult.class.cast(obj);
                com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = (com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult) obj;
                if (miniProgramNavigationBackResult == null) {
                    miniProgramNavigationBackResult = com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult.f74873g;
                }
                K("doNotifyReturnData call onNavigateBackToWxAppResultListener", new java.lang.Object[0]);
                u0().f47280x1.a(miniProgramNavigationBackResult);
            } catch (java.lang.ClassCastException e17) {
                throw new java.lang.IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public com.tencent.luggage.sdk.jsapi.component.service.y C0() {
        return (com.tencent.luggage.sdk.jsapi.component.service.y) this.f74808q;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void l1(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        if (K1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class) == null) {
            x1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class, com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n);
        }
        p2();
        N1(new ne.e(this), false);
        e9Var.N0(getWindowAndroid());
    }

    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l2() {
        return u0().f47269b2;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void m1() {
        super.m1();
        if (com.tencent.mm.plugin.appbrand.performance.h.f(this) && this.V1 == null) {
            java.lang.String str = this.f74803n;
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.performance.h.f87351a;
            com.tencent.mm.plugin.appbrand.performance.f fVar = (com.tencent.mm.plugin.appbrand.performance.f) hashMap.get(str);
            if (fVar == null) {
                fVar = new com.tencent.mm.plugin.appbrand.performance.f(this);
                hashMap.put(str, fVar);
            }
            fVar.g();
            com.tencent.mm.plugin.appbrand.ui.ga c27 = c2();
            this.V1 = c27;
            if (c27 != null) {
                this.f74810s.addView(c27);
                com.tencent.mm.plugin.appbrand.ui.ga gaVar = this.V1;
                ze.n nVar = gaVar.f89737d;
                java.lang.String str2 = nVar.f74803n;
                com.tencent.mm.plugin.appbrand.ui.ga gaVar2 = nVar.V1;
                c01.l2 e17 = c01.n2.d().e(str2 + "performance_data");
                if (gaVar2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
                } else if (e17 != null) {
                    for (java.lang.String str3 : ((java.util.concurrent.ConcurrentHashMap) e17.f37305a).keySet()) {
                        java.lang.String str4 = (java.lang.String) e17.b(str3);
                        if (str4 != null) {
                            ik1.h0.b(new com.tencent.mm.plugin.appbrand.ui.ca(gaVar2, com.tencent.mm.sdk.platformtools.t8.P(str3, 0), str4));
                        }
                    }
                }
                java.lang.String str5 = nVar.f74803n;
                com.tencent.mm.plugin.appbrand.ui.ga gaVar3 = nVar.V1;
                c01.l2 e18 = c01.n2.d().e(str5 + "performance_custom_data");
                if (gaVar3 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
                } else if (e18 != null) {
                    for (java.lang.String str6 : ((java.util.concurrent.ConcurrentHashMap) e18.f37305a).keySet()) {
                        java.lang.String str7 = (java.lang.String) e18.b(str6);
                        if (str7 != null) {
                            ik1.h0.b(new com.tencent.mm.plugin.appbrand.ui.da(gaVar3, str6, str7));
                        }
                    }
                }
                gaVar.setVisibility(0);
                gaVar.setAlpha(0.0f);
                gaVar.animate().alpha(1.0f).setDuration(500L).setStartDelay(500L).setListener(null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    /* renamed from: m2, reason: merged with bridge method [inline-methods] */
    public com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0() {
        return (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) p0(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void n1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, java.lang.Object obj) {
        try {
            com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult.class.cast(obj);
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = u0().f47269b2;
            if (appBrandStatObject != null && appBrandStatObject.f87790f != 1038) {
                this.f471747g2 = appBrandStatObject;
            }
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU clone = u0().clone();
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = clone.D;
            com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = (com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult) obj;
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer2 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            appBrandLaunchReferrer2.f77323e = appBrandInitConfig.f77278d;
            appBrandLaunchReferrer2.f77322d = 3;
            appBrandLaunchReferrer2.f77324f = miniProgramNavigationBackResult == null ? null : miniProgramNavigationBackResult.f74875e.toString();
            appBrandLaunchReferrer2.f77325g = miniProgramNavigationBackResult == null ? null : miniProgramNavigationBackResult.f74876f.toString();
            appBrandLaunchReferrer.b(appBrandLaunchReferrer2);
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject2.f87790f = 1038;
            if (appBrandInitConfig instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(appBrandInitConfig.f77278d);
                sb6.append(':');
                com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandInitConfig;
                sb6.append(appBrandInitConfigLU.f47276v);
                sb6.append(':');
                sb6.append(appBrandInitConfigLU.f47284z + 1000);
                appBrandStatObject2.f87791g = sb6.toString();
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            clone.I = java.lang.System.currentTimeMillis();
            clone.f77283i = null;
            clone.m();
            clone.f47269b2 = appBrandStatObject2;
            e0(clone);
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e17);
        }
    }

    public com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode o2() {
        return this.Y1;
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public lm0.a p1(java.lang.Class cls) {
        return null;
    }

    public final void p2() {
        if (p0(com.tencent.mm.plugin.appbrand.page.u5.class, false) == null) {
            N1(new com.tencent.mm.plugin.appbrand.page.u5((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) K1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class), com.tencent.mm.plugin.appbrand.appcache.la.o(this, false)), false);
        }
    }

    public final boolean q2() {
        return u0().k();
    }

    @Override // com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void r1() {
        java.util.LinkedList linkedList;
        si1.g gVar = this.X1;
        synchronized (gVar.f408250d) {
            linkedList = new java.util.LinkedList(gVar.f408250d);
            gVar.f408250d.clear();
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((si1.k) it.next()).a(si1.j.f408269g);
        }
    }

    public final boolean r2() {
        return u0().g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r0 == 1101) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s2() {
        /*
            r4 = this;
            java.lang.Boolean r0 = r4.W1
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r4.u0()
            boolean r1 = r0.G
            r2 = 0
            if (r1 == 0) goto L33
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f47269b2
            int r0 = r0.f87790f
            r1 = 1011(0x3f3, float:1.417E-42)
            r3 = 1
            if (r0 == r1) goto L26
            r1 = 1012(0x3f4, float:1.418E-42)
            if (r0 == r1) goto L26
            r1 = 1013(0x3f5, float:1.42E-42)
            if (r0 != r1) goto L24
            goto L26
        L24:
            r1 = r2
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 != 0) goto L32
            r1 = 1101(0x44d, float:1.543E-42)
            if (r0 != r1) goto L2f
            r0 = r3
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L33
        L32:
            r2 = r3
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.W1 = r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.n.s2():boolean");
    }

    public boolean t2() {
        return false;
    }

    public final void u2(com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (appBrandInitConfigLU == null || appBrandStatObject == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.hc hcVar = this.f74796e;
        if (hcVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.AppBrandRuntimeLU", "load with self.appId[%s] config[%s] stat[%d], skip by NULL container", this.f74803n, appBrandInitConfigLU.f77278d, java.lang.Integer.valueOf(appBrandStatObject.f87790f));
            return;
        }
        if (hcVar instanceof ze.l) {
            ze.l lVar = (ze.l) hcVar;
            lVar.w().runOnUiThread(new ze.h(lVar, this, appBrandInitConfigLU, appBrandStatObject));
        } else if (!(hcVar instanceof ze.m)) {
            hcVar.j(this, appBrandInitConfigLU);
        } else {
            appBrandInitConfigLU.f47269b2 = appBrandStatObject;
            ((ze.m) hcVar).j(this, appBrandInitConfigLU);
        }
    }

    public final void v2(android.os.PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            K("releaseWakeLock", new java.lang.Object[0]);
            yj0.a.c(wakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void w2() {
    }

    public boolean x2() {
        return false;
    }

    public boolean y2(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        return !android.text.TextUtils.isEmpty(appBrandInitConfig.f77283i);
    }

    public n(com.tencent.mm.plugin.appbrand.hc hcVar) {
        super(hcVar.h());
        this.f74796e = hcVar;
        this.f74797f.addLast(new com.tencent.mm.plugin.appbrand.z5(hcVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "addAppBrandRuntimePageStack  " + this.f74797f.peekLast());
        this.f74798g = null;
        this.W1 = null;
        this.Y1 = com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode.f86100f;
        this.Z1 = new xh1.g[]{null};
        this.f471741a2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h[]{null};
        this.f471742b2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.h[]{null};
        this.f471743c2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$a
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.tencent.mm.plugin.appbrand.me(nVar);
            }
        }, new ze.n$$b());
        this.f471744d2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$c
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.tencent.mm.plugin.appbrand.rd(nVar);
            }
        }, new ze.n$$d());
        this.f471748h2 = null;
    }
}
