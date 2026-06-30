package fh1;

/* loaded from: classes7.dex */
public final class k0 {
    public k0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Finally extract failed */
    public final void a(java.lang.String bizInstance, java.lang.String appId, com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs initArgs, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo pkgWrappingInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(bizInstance, "bizInstance");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(initArgs, "initArgs");
        kotlin.jvm.internal.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        i95.n0.c(fh1.f0.class);
        fh1.l0 l0Var = (fh1.l0) ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Vi(bizInstance, initArgs);
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = l0Var.f262564i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l0Var.f262563h;
        try {
            fj1.t tVar = (fj1.t) concurrentHashMap.get(appId);
            if (tVar != null) {
                str = "merge";
                tVar.f263138b.o(kz5.n0.S0(pkgWrappingInfo));
            } else {
                str = "";
                tVar = null;
            }
            if (tVar == null) {
                str = "insert";
                concurrentHashMap.put(appId, new fj1.t(appId, pkgWrappingInfo));
            }
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
            com.tencent.mars.xlog.Log.i(l0Var.f262560e, "registerPkgReader appId:" + appId + ", operation:" + str);
        } catch (java.lang.Throwable th6) {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
            throw th6;
        }
    }
}
