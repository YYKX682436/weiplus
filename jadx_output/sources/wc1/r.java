package wc1;

/* loaded from: classes7.dex */
public class r extends wc1.q {
    public static final int CTRL_INDEX = 1183;
    public static final java.lang.String NAME = "createLoadSubPackageTaskForWaiter";

    @Override // yc1.b
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.utils.r2 a17 = com.tencent.mm.plugin.appbrand.utils.p0.a(lVar);
        java.lang.String tag = "AwaitTagLoadSubPackage_" + str;
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((com.tencent.mm.plugin.appbrand.utils.c5) a17).f90398d;
        kotlin.jvm.internal.o.d(newCondition);
        concurrentHashMap.put(tag, new com.tencent.mm.plugin.appbrand.utils.b5(reentrantLock, newCondition));
    }

    @Override // wc1.q
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, ph1.g gVar, java.lang.String str2, java.lang.String str3) {
        super.D(lVar, str, gVar, str2, str3);
        java.lang.String tag = "AwaitTagLoadSubPackage_" + str;
        com.tencent.mm.plugin.appbrand.utils.c5 c5Var = (com.tencent.mm.plugin.appbrand.utils.c5) com.tencent.mm.plugin.appbrand.utils.p0.a(lVar);
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mm.plugin.appbrand.utils.b5 b5Var = (com.tencent.mm.plugin.appbrand.utils.b5) c5Var.f90398d.remove(tag);
        if (b5Var != null) {
            c5Var.f90399e.put(tag, gVar);
            java.util.concurrent.locks.ReentrantLock reentrantLock = b5Var.f90391a;
            reentrantLock.lock();
            b5Var.f90392b.signalAll();
            reentrantLock.unlock();
        }
    }
}
