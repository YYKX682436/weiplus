package fh1;

/* loaded from: classes7.dex */
public final class l0 extends lc3.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final fh1.k0 f262559m = new fh1.k0(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262560e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f262561f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.u1 f262562g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f262563h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f262564i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f262560e = "MicroMsg.MagicBrushFramePkgManagementDelegate(" + instanceName + ')';
        this.f262563h = new java.util.concurrent.ConcurrentHashMap();
        this.f262564i = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String i17 = com.tencent.mm.plugin.appbrand.appstorage.l1.i(path);
        kotlin.jvm.internal.o.f(i17, "removeLeadingSlashForEnterPath(...)");
        if (!r26.i0.y(i17, "WAMagicBrush", false)) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f262561f;
        if (iCommLibReader != null) {
            java.lang.String M = iCommLibReader.M(path);
            return M == null ? "" : M;
        }
        kotlin.jvm.internal.o.o("wxaCommLib");
        throw null;
    }

    @Override // jc3.x
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.f262562g;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("fs");
        throw null;
    }

    @Override // jc3.x
    public lc3.k0 c(java.lang.String path, java.util.Map map) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String obj2 = (map == null || (obj = map.get("appId")) == null) ? null : obj.toString();
        boolean z17 = true;
        if (obj2 != null && r26.i0.y(obj2, "CARD_", false)) {
            obj2 = obj2.substring(5);
            kotlin.jvm.internal.o.f(obj2, "substring(...)");
        }
        if (obj2 != null && obj2.length() != 0) {
            z17 = false;
        }
        java.lang.String str = this.f262560e;
        if (z17) {
            com.tencent.mars.xlog.Log.e(str, "provideWxaScriptDescriptor for path:" + path + ", with invalid contextInfoMap");
            return null;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f262564i.readLock();
        readLock.lock();
        try {
            fj1.t tVar = (fj1.t) this.f262563h.get(obj2);
            readLock.unlock();
            if (tVar == null) {
                com.tencent.mars.xlog.Log.e(str, "provideWxaScriptDescriptor for path:" + path + " appId:" + obj2 + ", pkgReader not ready");
                return null;
            }
            com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = tVar.f263138b.openReadPartialInfo(path);
            if (openReadPartialInfo != null) {
                java.lang.String wxaPkgFilePath = openReadPartialInfo.f76044e;
                kotlin.jvm.internal.o.f(wxaPkgFilePath, "wxaPkgFilePath");
                java.lang.String fileName = openReadPartialInfo.f76045f;
                kotlin.jvm.internal.o.f(fileName, "fileName");
                return new lc3.k0(wxaPkgFilePath, fileName);
            }
            com.tencent.mars.xlog.Log.e(str, "provideWxaScriptDescriptor for path:" + path + " appId:" + obj2 + ", resource not found");
            return null;
        } catch (java.lang.Throwable th6) {
            readLock.unlock();
            throw th6;
        }
    }

    @Override // jc3.x
    public java.lang.String d() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f262561f;
        if (iCommLibReader == null) {
            kotlin.jvm.internal.o.o("wxaCommLib");
            throw null;
        }
        if (iCommLibReader instanceof com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader) {
            if (iCommLibReader == null) {
                kotlin.jvm.internal.o.o("wxaCommLib");
                throw null;
            }
            java.lang.String checksumMd5 = iCommLibReader.getF90658d().checksumMd5();
            kotlin.jvm.internal.o.d(checksumMd5);
            return checksumMd5;
        }
        if (iCommLibReader == null) {
            kotlin.jvm.internal.o.o("wxaCommLib");
            throw null;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(iCommLibReader.Y0());
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        java.lang.Object j0Var;
        kotlin.jvm.internal.o.g(cb6, "cb");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f262561f;
        if (iCommLibReader == null) {
            kotlin.jvm.internal.o.o("wxaCommLib");
            throw null;
        }
        android.content.res.AssetFileDescriptor G0 = iCommLibReader.G0("WAMagicBrushMainContext.js");
        if (G0 != null) {
            j0Var = new lc3.d(G0);
        } else {
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = this.f262561f;
            if (iCommLibReader2 == null) {
                kotlin.jvm.internal.o.o("wxaCommLib");
                throw null;
            }
            java.lang.String M = iCommLibReader2.M("WAMagicBrushMainContext.js");
            if (M == null) {
                M = "";
            }
            j0Var = new lc3.j0(M);
        }
        linkedList.add(j0Var);
        cb6.invoke(linkedList);
    }

    @Override // jc3.x
    public java.lang.String g() {
        return "weuse";
    }

    @Override // jc3.x
    public void release() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f262563h;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f262561f;
        if (iCommLibReader != null) {
            iCommLibReader.close();
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.f262562g;
        if (u1Var != null) {
            u1Var.release();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f262564i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                java.util.Collection values = concurrentHashMap.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((fj1.t) it.next()).f263138b.close();
                }
            } finally {
                concurrentHashMap.clear();
            }
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
    }
}
