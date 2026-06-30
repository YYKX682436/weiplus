package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class m4 implements kk.h {
    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) obj2;
        if (((com.tencent.mm.sdk.platformtools.o4) obj3) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback newValue == null, name = " + ((java.lang.String) o4Var.f192899e.first));
            if (o4Var.U()) {
                java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = o4Var.f192902h;
                writeLock.lock();
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback MMKV : %s, will be closed, my hashcode = %d, coreMMKV hashcode = %d", o4Var.f192899e.first, java.lang.Integer.valueOf(o4Var.hashCode()), java.lang.Integer.valueOf(o4Var.f192898d.hashCode()));
                o4Var.f192898d.close();
                writeLock.unlock();
            } else {
                o4Var.f192898d.close();
                o4Var.f192898d = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "preRemoveCallback done, name = " + ((java.lang.String) o4Var.f192899e.first));
    }
}
