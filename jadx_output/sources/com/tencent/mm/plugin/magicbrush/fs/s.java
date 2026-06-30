package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.magicbrush.fs.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f147994a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f147995b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f147996c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f147997d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f147998e;

    public s(java.lang.String customName) {
        kotlin.jvm.internal.o.g(customName, "customName");
        this.f147994a = customName;
        this.f147995b = new java.util.concurrent.ConcurrentHashMap();
        this.f147996c = new java.util.concurrent.ConcurrentHashMap(100);
        this.f147998e = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    public com.tencent.mm.plugin.magicbrush.fs.a a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.tencent.mm.plugin.magicbrush.fs.a) b(new com.tencent.mm.plugin.magicbrush.fs.r(this, str));
    }

    public final java.lang.Object b(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f147998e.readLock();
        readLock.lock();
        try {
            return aVar.invoke();
        } finally {
            readLock.unlock();
        }
    }

    public final java.lang.Object c(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f147998e;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return aVar.invoke();
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
    }
}
