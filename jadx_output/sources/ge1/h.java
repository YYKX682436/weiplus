package ge1;

/* loaded from: classes15.dex */
public final class h implements android.content.ServiceConnection {

    /* renamed from: g, reason: collision with root package name */
    public static ke1.b f270939g;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.Runnable f270944o;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Runnable f270946q;

    /* renamed from: r, reason: collision with root package name */
    public static android.os.IBinder f270947r;

    /* renamed from: d, reason: collision with root package name */
    public static final ge1.h f270936d = new ge1.h();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f270937e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static volatile ge1.b f270938f = ge1.b.f270927d;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f270940h = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: i, reason: collision with root package name */
    public static final ku5.f f270941i = ((ku5.t0) ku5.t0.f312615d).p("TransitCard-AIDL");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f270942m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final android.os.Handler f270943n = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public static final android.os.Handler f270945p = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public static final android.os.IBinder.DeathRecipient f270948s = new ge1.c();

    public final void a(he1.h hVar) {
        if (hVar.b()) {
            f270942m.remove(hVar.a());
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "destroy");
        java.lang.Runnable runnable = f270944o;
        if (runnable != null) {
            f270943n.removeCallbacks(runnable);
        }
        f270944o = null;
        java.lang.Runnable runnable2 = f270946q;
        if (runnable2 != null) {
            f270945p.removeCallbacks(runnable2);
        }
        f270946q = null;
        c(10014, "Service connection destroyed");
        ke1.b bVar = f270939g;
        if (bVar != null) {
            bVar.release();
        }
        f270939g = null;
        android.os.IBinder iBinder = f270947r;
        if (iBinder != null) {
            iBinder.unlinkToDeath(f270948s, 0);
        }
        f270947r = null;
        f270942m.clear();
        f270938f = ge1.b.f270927d;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                context.unbindService(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "destroy unbindService exception: " + e17.getMessage());
        }
    }

    public final void c(int i17, java.lang.String str) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = f270940h;
        for (ge1.a aVar = (ge1.a) concurrentLinkedQueue.poll(); aVar != null; aVar = (ge1.a) concurrentLinkedQueue.poll()) {
            a(aVar.f270924a);
            aVar.f270925b.invoke(new he1.i(i17, str));
        }
    }

    public final void d() {
        android.content.Intent intent;
        boolean z17;
        if (f270938f != ge1.b.f270927d) {
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, context is null");
            c(10014, "Application context is null");
            return;
        }
        ge1.j jVar = ge1.j.f270953a;
        int ordinal = jVar.b().ordinal();
        java.lang.String str = null;
        java.lang.String str2 = "com.hihonor.wallet";
        if (ordinal == 0) {
            intent = new android.content.Intent("com.hihonor.wallet.sdk.nfc.action.TRANSIT_OPEN_SERVICE");
            intent.setPackage("com.hihonor.wallet");
        } else if (ordinal == 1) {
            intent = new android.content.Intent("com.finshell.wallet.nfc.transit.action.POST_PAY_SERVICE");
            intent.setPackage(android.os.Build.VERSION.SDK_INT >= 29 ? "com.finshell.wallet" : "com.coloros.wallet");
            intent.putExtra("POST_PAY_CHANNEL", "WECHAT_PAY");
            intent.putExtra("POST_PAY_PACKAGE_NAME", "com.tencent.mm");
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.VendorRouter", "createBindIntent, unsupported vendor");
            intent = null;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, unsupported vendor");
            c(10001, "Unsupported vendor: " + jVar.b());
            return;
        }
        int ordinal2 = jVar.b().ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                str2 = android.os.Build.VERSION.SDK_INT < 29 ? "com.coloros.wallet" : "com.finshell.wallet";
            } else {
                if (ordinal2 != 2) {
                    throw new jz5.j();
                }
                str2 = null;
            }
        }
        if (str2 != null) {
            try {
                context.getPackageManager().getPackageInfo(str2, 1);
                z17 = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                z17 = false;
            }
            if (!z17) {
                int ordinal3 = jVar.b().ordinal();
                if (ordinal3 == 0) {
                    str = "荣耀钱包";
                } else if (ordinal3 == 1) {
                    str = "OPPO 钱包";
                } else if (ordinal3 != 2) {
                    throw new jz5.j();
                }
                if (str == null) {
                    str = str2;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, wallet app not installed: ".concat(str2));
                c(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, str + " 未安装，请先下载安装 " + str);
                return;
            }
        }
        try {
            if (!context.bindService(intent, this, 1)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, bindService returned false");
                c(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "Failed to bind vendor service");
                return;
            }
            f270938f = ge1.b.f270928e;
            java.lang.Runnable runnable = f270946q;
            if (runnable != null) {
                f270945p.removeCallbacks(runnable);
            }
            f270946q = null;
            ge1.f fVar = new ge1.f(this);
            f270945p.postDelayed(fVar, 5000L);
            f270946q = fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, bindService initiated");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "ensureConnected, bindService exception: " + e17.getMessage());
            c(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "bindService exception: " + e17.getMessage());
        }
    }

    public final void e(he1.h hVar, yz5.l lVar) {
        he1.k f17;
        ke1.b bVar = f270939g;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "executeInternal, vendorAdapter is null");
            a(hVar);
            lVar.invoke(new he1.i(10014, "Vendor adapter is null"));
            return;
        }
        try {
            if (hVar instanceof he1.a) {
                f17 = f(bVar.c((he1.a) hVar), bVar.d());
            } else if (hVar instanceof he1.c) {
                f17 = bVar.d();
            } else if (hVar instanceof he1.f) {
                f17 = bVar.b((he1.f) hVar);
            } else if (hVar instanceof he1.g) {
                f17 = bVar.e((he1.g) hVar);
            } else if (hVar instanceof he1.e) {
                f17 = bVar.a();
            } else if (hVar instanceof he1.d) {
                f17 = bVar.g((he1.d) hVar);
            } else {
                if (!(hVar instanceof he1.b)) {
                    throw new jz5.j();
                }
                f17 = bVar.f((he1.b) hVar);
            }
            a(hVar);
            lVar.invoke(f17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "executeInternal exception: " + e17.getMessage());
            a(hVar);
            lVar.invoke(new he1.i(10014, "Execute failed: " + e17.getMessage()));
        }
    }

    public final he1.k f(he1.k kVar, he1.k kVar2) {
        if (kVar instanceof he1.i) {
            return kVar;
        }
        java.lang.String name = ge1.j.f270953a.b().name();
        java.lang.String str = "";
        if (kVar2 instanceof he1.j) {
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(((he1.j) kVar2).f280884a).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                java.lang.String optString = optJSONObject != null ? optJSONObject.optString("walletVersionCode", "") : null;
                if (optString != null) {
                    str = optString;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "mergeCheckSupportResult, parse cplcResult error: " + e17.getMessage());
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "mergeCheckSupportResult, queryCplc failed, walletVersionCode will be empty");
        }
        kotlin.jvm.internal.o.e(kVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.transitcard.model.TransitCardResult.Success");
        java.lang.String str2 = ((he1.j) kVar).f280884a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            jSONObject.put("brandName", name);
            jSONObject.put("walletVersionCode", str);
            str2 = jSONObject.toString();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "mergeCheckSupportResult, merge json error: " + e18.getMessage());
        }
        kotlin.jvm.internal.o.d(str2);
        return new he1.j(str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceConnected, name=" + componentName);
        java.lang.Runnable runnable = f270946q;
        if (runnable != null) {
            f270945p.removeCallbacks(runnable);
        }
        ke1.b bVar = null;
        f270946q = null;
        java.util.concurrent.locks.ReentrantLock reentrantLock = f270937e;
        reentrantLock.lock();
        ge1.h hVar = f270936d;
        try {
            if (iBinder == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceConnected, service is null");
                f270938f = ge1.b.f270927d;
                hVar.c(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "Vendor service binder is null");
                return;
            }
            int ordinal = ge1.j.f270953a.b().ordinal();
            if (ordinal == 0) {
                bVar = new ke1.a();
            } else if (ordinal == 1) {
                bVar = new ke1.c();
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.VendorRouter", "createVendorAdapter, unsupported vendor");
            }
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceConnected, failed to create vendor adapter");
                f270938f = ge1.b.f270927d;
                hVar.c(10001, "Failed to create vendor adapter");
                return;
            }
            bVar.h(iBinder);
            f270939g = bVar;
            try {
                iBinder.linkToDeath(f270948s, 0);
                f270947r = iBinder;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.ServiceConnection", "linkToDeath failed: " + e17.getMessage());
            }
            f270938f = ge1.b.f270929f;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceConnected, state=CONNECTED, vendor=" + bVar.i());
            f270941i.execute(ge1.e.f270933d);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceDisconnected, name=" + componentName);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f270937e;
        reentrantLock.lock();
        try {
            f270938f = ge1.b.f270927d;
            ke1.b bVar = f270939g;
            if (bVar != null) {
                bVar.release();
            }
            f270939g = null;
            android.os.IBinder iBinder = f270947r;
            if (iBinder != null) {
                iBinder.unlinkToDeath(f270948s, 0);
            }
            f270947r = null;
            if (!f270940h.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.ServiceConnection", "onServiceDisconnected, pendingTaskQueue is not empty, attempting reconnect");
                f270936d.d();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
